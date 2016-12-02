import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Properties;
import java.util.Random;

public class CustomColormap
{
  public String name = null;
  public String basePath = null;
  private int format = -1;
  private MatchBlock[] matchBlocks = null;
  private String source = null;
  private int color = -1;
  private int yVariance = 0;
  private int yOffset = 0;
  private int width = 0;
  private int height = 0;
  private int[] colors = null;
  private float[][] colorsRgb = (float[][])null;
  private static final int FORMAT_UNKNOWN = -1;
  private static final int FORMAT_VANILLA = 0;
  private static final int FORMAT_GRID = 1;
  private static final int FORMAT_FIXED = 2;
  public static final String KEY_FORMAT = "format";
  public static final String KEY_BLOCKS = "blocks";
  public static final String KEY_SOURCE = "source";
  public static final String KEY_COLOR = "color";
  public static final String KEY_Y_VARIANCE = "yVariance";
  public static final String KEY_Y_OFFSET = "yOffset";
  
  public CustomColormap(Properties props, String path, int width, int height)
  {
    ConnectedParser cp = new ConnectedParser("Colormap");
    
    name = cp.parseName(path);
    basePath = cp.parseBasePath(path);
    
    format = parseFormet(props.getProperty("format"));
    
    matchBlocks = cp.parseMatchBlocks(props.getProperty("blocks"));
    
    source = parseTexture(props.getProperty("source"), path, basePath);
    
    color = ConnectedParser.parseColor(props.getProperty("color"), -1);
    
    yVariance = cp.parseInt(props.getProperty("yVariance"), 0);
    
    yOffset = cp.parseInt(props.getProperty("yOffset"), 0);
    
    this.width = width;
    this.height = height;
  }
  
  private int parseFormet(String str)
  {
    if (str == null) {
      return 0;
    }
    if (str.equals("vanilla")) {
      return 0;
    }
    if (str.equals("grid")) {
      return 1;
    }
    if (str.equals("fixed")) {
      return 2;
    }
    warn("Unknown format: " + str);
    return -1;
  }
  
  public boolean isValid(String path)
  {
    if ((format == 0) || (format == 1))
    {
      if (source == null)
      {
        warn("Source not defined: " + path);
        return false;
      }
      readColors();
      if (colors == null) {
        return false;
      }
    }
    else if (format == 2)
    {
      if (color < 0)
      {
        warn("Color not defined: " + path);
        return false;
      }
    }
    else
    {
      return false;
    }
    return true;
  }
  
  private void readColors()
  {
    try
    {
      colors = null;
      if (source == null) {
        return;
      }
      String imagePath = source + ".png";
      jy loc = new jy(imagePath);
      
      BufferedImage img = bml.a(Config.getResourceStream(loc));
      int imgWidth = img.getWidth();
      int imgHeight = img.getHeight();
      
      boolean widthOk = (width < 0) || (width == imgWidth);
      boolean heightOk = (height < 0) || (height == imgHeight);
      if ((!widthOk) || (!heightOk))
      {
        warn("Invalid palette size: " + imgWidth + "x" + imgHeight + ", should be: " + width + "x" + height + ", path: " + imagePath);
        return;
      }
      if (width < 0) {
        width = imgWidth;
      }
      if (height < 0) {
        height = imgHeight;
      }
      colors = new int[imgWidth * imgHeight];
      img.getRGB(0, 0, imgWidth, imgHeight, colors, 0, imgWidth);
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  private static void dbg(String str)
  {
    Config.dbg("CustomColors: " + str);
  }
  
  private static void warn(String str)
  {
    Config.warn("CustomColors: " + str);
  }
  
  private static String parseTexture(String texStr, String path, String basePath)
  {
    if (texStr != null)
    {
      String png = ".png";
      if (texStr.endsWith(png)) {
        texStr = texStr.substring(0, texStr.length() - png.length());
      }
      texStr = fixTextureName(texStr, basePath);
      
      return texStr;
    }
    String str = path;
    
    int pos = str.lastIndexOf('/');
    if (pos >= 0) {
      str = str.substring(pos + 1);
    }
    int pos2 = str.lastIndexOf('.');
    if (pos2 >= 0) {
      str = str.substring(0, pos2);
    }
    str = fixTextureName(str, basePath);
    
    return str;
  }
  
  private static String fixTextureName(String iconName, String basePath)
  {
    iconName = TextureUtils.fixResourcePath(iconName, basePath);
    if ((!iconName.startsWith(basePath)) && (!iconName.startsWith("textures/")) && (!iconName.startsWith("mcpatcher/"))) {
      iconName = basePath + "/" + iconName;
    }
    if (iconName.endsWith(".png")) {
      iconName = iconName.substring(0, iconName.length() - 4);
    }
    String pathBlocks = "textures/blocks/";
    if (iconName.startsWith(pathBlocks)) {
      iconName = iconName.substring(pathBlocks.length());
    }
    if (iconName.startsWith("/")) {
      iconName = iconName.substring(1);
    }
    return iconName;
  }
  
  public boolean matchesBlock(aly blockState)
  {
    if (matchBlocks == null) {
      return true;
    }
    for (int i = 0; i < matchBlocks.length; i++)
    {
      MatchBlock mb = matchBlocks[i];
      if (mb.matches(blockState)) {
        return true;
      }
    }
    return false;
  }
  
  public int getColorRandom()
  {
    if (format == 2) {
      return color;
    }
    int index = CustomColorizer.random.nextInt(colors.length);
    
    return colors[index];
  }
  
  public int getColor(int index)
  {
    index = Config.limit(index, 0, colors.length);
    
    return colors[index] & 0xFFFFFF;
  }
  
  public int getColor(int cx, int cy)
  {
    cx = Config.limit(cx, 0, width);
    cy = Config.limit(cy, 0, height);
    
    return colors[(cy * width + cx)] & 0xFFFFFF;
  }
  
  public float[][] getColorsRgb()
  {
    if (colorsRgb == null) {
      colorsRgb = toRgb(colors);
    }
    return colorsRgb;
  }
  
  public int getColor(adq blockAccess, cj blockPos)
  {
    if (format == 0) {
      return getColorVanilla(blockAccess, blockPos);
    }
    if (format == 1) {
      return getColorGrid(blockAccess, blockPos);
    }
    return color;
  }
  
  public int getColorSmooth(adq blockAccess, double x, double y, double z, int samples, int step)
  {
    if (format == 2) {
      return color;
    }
    int x0 = ns.c(x);
    int y0 = ns.c(y);
    int z0 = ns.c(z);
    int n = samples * step / 2;
    int sumRed = 0;
    int sumGreen = 0;
    int sumBlue = 0;
    int count = 0;
    BlockPosM blockPosM = new BlockPosM(0, 0, 0);
    for (int ix = x0 - n; ix <= x0 + n; ix += step) {
      for (int iz = z0 - n; iz <= z0 + n; iz += step)
      {
        blockPosM.setXyz(ix, y0, iz);
        int col = getColor(blockAccess, blockPosM);
        sumRed += (col >> 16 & 0xFF);
        sumGreen += (col >> 8 & 0xFF);
        sumBlue += (col & 0xFF);
        count++;
      }
    }
    int r = sumRed / count;
    int g = sumGreen / count;
    int b = sumBlue / count;
    
    return r << 16 | g << 8 | b;
  }
  
  private int getColorVanilla(adq blockAccess, cj blockPos)
  {
    ady bgb = blockAccess.b(blockPos);
    double temperature = ns.a(bgb.a(blockPos), 0.0F, 1.0F);
    double rainfall = ns.a(bgb.i(), 0.0F, 1.0F);
    
    rainfall *= temperature;
    int cx = (int)((1.0D - temperature) * (width - 1));
    int cy = (int)((1.0D - rainfall) * (height - 1));
    return getColor(cx, cy);
  }
  
  private int getColorGrid(adq blockAccess, cj blockPos)
  {
    ady bgb = blockAccess.b(blockPos);
    
    int cx = az;
    int cy = blockPos.o() - yOffset;
    if (yVariance > 0)
    {
      int seed = blockPos.n() << 16 + blockPos.p();
      int rand = Config.intHash(seed);
      
      int range = yVariance * 2 + 1;
      
      int diff = (rand & 0xFF) % range - yVariance;
      
      cy += diff;
    }
    return getColor(cx, cy);
  }
  
  public int getLength()
  {
    if (format == 2) {
      return 1;
    }
    return colors.length;
  }
  
  public int getWidth()
  {
    return width;
  }
  
  public int getHeight()
  {
    return height;
  }
  
  private static float[][] toRgb(int[] cols)
  {
    float[][] colsRgb = new float[cols.length][3];
    for (int i = 0; i < cols.length; i++)
    {
      int col = cols[i];
      float rf = (col >> 16 & 0xFF) / 255.0F;
      float gf = (col >> 8 & 0xFF) / 255.0F;
      float bf = (col & 0xFF) / 255.0F;
      float[] colRgb = colsRgb[i];
      colRgb[0] = rf;
      colRgb[1] = gf;
      colRgb[2] = bf;
    }
    return colsRgb;
  }
}
