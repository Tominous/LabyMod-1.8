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
    
    this.name = cp.parseName(path);
    this.basePath = cp.parseBasePath(path);
    
    this.format = parseFormet(props.getProperty("format"));
    
    this.matchBlocks = cp.parseMatchBlocks(props.getProperty("blocks"));
    
    this.source = parseTexture(props.getProperty("source"), path, this.basePath);
    
    this.color = ConnectedParser.parseColor(props.getProperty("color"), -1);
    
    this.yVariance = cp.parseInt(props.getProperty("yVariance"), 0);
    
    this.yOffset = cp.parseInt(props.getProperty("yOffset"), 0);
    
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
    if ((this.format == 0) || (this.format == 1))
    {
      if (this.source == null)
      {
        warn("Source not defined: " + path);
        return false;
      }
      readColors();
      if (this.colors == null) {
        return false;
      }
    }
    else if (this.format == 2)
    {
      if (this.color < 0)
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
      this.colors = null;
      if (this.source == null) {
        return;
      }
      String imagePath = this.source + ".png";
      jy loc = new jy(imagePath);
      
      BufferedImage img = bml.a(Config.getResourceStream(loc));
      int imgWidth = img.getWidth();
      int imgHeight = img.getHeight();
      
      boolean widthOk = (this.width < 0) || (this.width == imgWidth);
      boolean heightOk = (this.height < 0) || (this.height == imgHeight);
      if ((!widthOk) || (!heightOk))
      {
        warn("Invalid palette size: " + imgWidth + "x" + imgHeight + ", should be: " + this.width + "x" + this.height + ", path: " + imagePath);
        return;
      }
      if (this.width < 0) {
        this.width = imgWidth;
      }
      if (this.height < 0) {
        this.height = imgHeight;
      }
      this.colors = new int[imgWidth * imgHeight];
      img.getRGB(0, 0, imgWidth, imgHeight, this.colors, 0, imgWidth);
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
    if (this.matchBlocks == null) {
      return true;
    }
    for (int i = 0; i < this.matchBlocks.length; i++)
    {
      MatchBlock mb = this.matchBlocks[i];
      if (mb.matches(blockState)) {
        return true;
      }
    }
    return false;
  }
  
  public int getColorRandom()
  {
    if (this.format == 2) {
      return this.color;
    }
    int index = CustomColorizer.random.nextInt(this.colors.length);
    
    return this.colors[index];
  }
  
  public int getColor(int index)
  {
    index = Config.limit(index, 0, this.colors.length);
    
    return this.colors[index] & 0xFFFFFF;
  }
  
  public int getColor(int cx, int cy)
  {
    cx = Config.limit(cx, 0, this.width);
    cy = Config.limit(cy, 0, this.height);
    
    return this.colors[(cy * this.width + cx)] & 0xFFFFFF;
  }
  
  public float[][] getColorsRgb()
  {
    if (this.colorsRgb == null) {
      this.colorsRgb = toRgb(this.colors);
    }
    return this.colorsRgb;
  }
  
  public int getColor(adq blockAccess, cj blockPos)
  {
    if (this.format == 0) {
      return getColorVanilla(blockAccess, blockPos);
    }
    if (this.format == 1) {
      return getColorGrid(blockAccess, blockPos);
    }
    return this.color;
  }
  
  public int getColorSmooth(adq blockAccess, double x, double y, double z, int samples, int step)
  {
    if (this.format == 2) {
      return this.color;
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
    int cx = (int)((1.0D - temperature) * (this.width - 1));
    int cy = (int)((1.0D - rainfall) * (this.height - 1));
    return getColor(cx, cy);
  }
  
  private int getColorGrid(adq blockAccess, cj blockPos)
  {
    ady bgb = blockAccess.b(blockPos);
    
    int cx = bgb.az;
    int cy = blockPos.o() - this.yOffset;
    if (this.yVariance > 0)
    {
      int seed = blockPos.n() << 16 + blockPos.p();
      int rand = Config.intHash(seed);
      
      int range = this.yVariance * 2 + 1;
      
      int diff = (rand & 0xFF) % range - this.yVariance;
      
      cy += diff;
    }
    return getColor(cx, cy);
  }
  
  public int getLength()
  {
    if (this.format == 2) {
      return 1;
    }
    return this.colors.length;
  }
  
  public int getWidth()
  {
    return this.width;
  }
  
  public int getHeight()
  {
    return this.height;
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
