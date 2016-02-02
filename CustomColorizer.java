import java.awt.image.BufferedImage;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Set;
import javax.imageio.ImageIO;
import org.apache.commons.lang3.tuple.ImmutablePair;
import org.apache.commons.lang3.tuple.Pair;

public class CustomColorizer
{
  private static CustomColormap grassColors = null;
  private static CustomColormap waterColors = null;
  private static CustomColormap foliageColors = null;
  private static CustomColormap foliagePineColors = null;
  private static CustomColormap foliageBirchColors = null;
  private static CustomColormap swampFoliageColors = null;
  private static CustomColormap swampGrassColors = null;
  private static int[][] blockPalettes = (int[][])null;
  private static CustomColormap[] paletteColors = null;
  private static CustomColormap skyColors = null;
  private static CustomColormap fogColors = null;
  private static CustomColormap underwaterColors = null;
  private static CustomColormap[] lightMapsColorsRgb = null;
  private static int lightmapMinDimensionId = 0;
  private static float[][] sunRgbs = new float[16][3];
  private static float[][] torchRgbs = new float[16][3];
  private static CustomColormap redstoneColors = null;
  private static CustomColormap xpOrbColors = null;
  private static CustomColormap stemColors = null;
  private static CustomColormap stemMelonColors = null;
  private static CustomColormap stemPumpkinColors = null;
  private static CustomColormap myceliumParticleColors = null;
  private static boolean useDefaultColorMultiplier = true;
  private static int particleWaterColor = -1;
  private static int particlePortalColor = -1;
  private static int lilyPadColor = -1;
  private static int expBarTextColor = -1;
  private static int bossTextColor = -1;
  private static int signTextColor = -1;
  private static aui fogColorNether = null;
  private static aui fogColorEnd = null;
  private static aui skyColorEnd = null;
  private static int[] spawnEggPrimaryColors = null;
  private static int[] spawnEggSecondaryColors = null;
  private static float[][] wolfCollarColors = (float[][])null;
  private static float[][] sheepColors = (float[][])null;
  private static int[] textColors = null;
  private static int[] mapColorsOriginal = null;
  private static int[] potionColors = null;
  private static final int TYPE_NONE = 0;
  private static final int TYPE_GRASS = 1;
  private static final int TYPE_FOLIAGE = 2;
  public static Random random = new Random();
  
  public static void update()
  {
    grassColors = null;
    waterColors = null;
    foliageColors = null;
    foliageBirchColors = null;
    foliagePineColors = null;
    swampGrassColors = null;
    swampFoliageColors = null;
    skyColors = null;
    fogColors = null;
    underwaterColors = null;
    redstoneColors = null;
    xpOrbColors = null;
    stemColors = null;
    myceliumParticleColors = null;
    lightMapsColorsRgb = null;
    
    particleWaterColor = -1;
    particlePortalColor = -1;
    lilyPadColor = -1;
    expBarTextColor = -1;
    bossTextColor = -1;
    signTextColor = -1;
    fogColorNether = null;
    fogColorEnd = null;
    skyColorEnd = null;
    blockPalettes = (int[][])null;
    paletteColors = null;
    useDefaultColorMultiplier = true;
    
    spawnEggPrimaryColors = null;
    spawnEggSecondaryColors = null;
    
    wolfCollarColors = (float[][])null;
    sheepColors = (float[][])null;
    
    textColors = null;
    
    setMapColors(mapColorsOriginal);
    
    potionColors = null;
    abe.clearPotionColorCache();
    
    String mcpColormap = "mcpatcher/colormap/";
    
    grassColors = getCustomColors("textures/colormap/grass.png", 256, 256);
    foliageColors = getCustomColors("textures/colormap/foliage.png", 256, 256);
    
    String[] waterPaths = { "water.png", "watercolorX.png" };
    waterColors = getCustomColors(mcpColormap, waterPaths, 256, 256);
    if (!Config.isCustomColors()) {
      return;
    }
    String[] pinePaths = { "pine.png", "pinecolor.png" };
    foliagePineColors = getCustomColors(mcpColormap, pinePaths, 256, 256);
    String[] birchPaths = { "birch.png", "birchcolor.png" };
    foliageBirchColors = getCustomColors(mcpColormap, birchPaths, 256, 256);
    
    String[] swampGrassPaths = { "swampgrass.png", "swampgrasscolor.png" };
    swampGrassColors = getCustomColors(mcpColormap, swampGrassPaths, 256, 256);
    String[] swampFoliagePaths = { "swampfoliage.png", "swampfoliagecolor.png" };
    swampFoliageColors = getCustomColors(mcpColormap, swampFoliagePaths, 256, 256);
    
    String[] sky0Paths = { "sky0.png", "skycolor0.png" };
    skyColors = getCustomColors(mcpColormap, sky0Paths, 256, 256);
    String[] fog0Paths = { "fog0.png", "fogcolor0.png" };
    fogColors = getCustomColors(mcpColormap, fog0Paths, 256, 256);
    String[] underwaterPaths = { "underwater.png", "underwatercolor.png" };
    underwaterColors = getCustomColors(mcpColormap, underwaterPaths, 256, 256);
    
    String[] redstonePaths = { "redstone.png", "redstonecolor.png" };
    redstoneColors = getCustomColors(mcpColormap, redstonePaths, 16, 1);
    
    xpOrbColors = getCustomColors(mcpColormap + "xporb.png", -1, -1);
    
    String[] stemPaths = { "stem.png", "stemcolor.png" };
    stemColors = getCustomColors(mcpColormap, stemPaths, 8, 1);
    stemPumpkinColors = getCustomColors(mcpColormap + "pumpkinstem.png", 8, 1);
    stemMelonColors = getCustomColors(mcpColormap + "melonstem.png", 8, 1);
    
    String[] myceliumPaths = { "myceliumparticle.png", "myceliumparticlecolor.png" };
    myceliumParticleColors = getCustomColors(mcpColormap, myceliumPaths, -1, -1);
    
    Pair<CustomColormap[], Integer> lightMaps = parseLightmapsRgb();
    lightMapsColorsRgb = (CustomColormap[])lightMaps.getLeft();
    lightmapMinDimensionId = ((Integer)lightMaps.getRight()).intValue();
    
    readColorProperties("mcpatcher/color.properties");
    
    updateUseDefaultColorMultiplier();
  }
  
  private static Pair<CustomColormap[], Integer> parseLightmapsRgb()
  {
    String lightmapPrefix = "mcpatcher/lightmap/world";
    String lightmapSuffix = ".png";
    String[] pathsLightmap = ResUtils.collectFiles(lightmapPrefix, lightmapSuffix);
    Map<Integer, String> mapLightmaps = new HashMap();
    for (int i = 0; i < pathsLightmap.length; i++)
    {
      String path = pathsLightmap[i];
      String dimIdStr = StrUtils.removePrefixSuffix(path, lightmapPrefix, lightmapSuffix);
      int dimId = Config.parseInt(dimIdStr, Integer.MIN_VALUE);
      if (dimId == Integer.MIN_VALUE) {
        warn("Invalid dimension ID: " + dimIdStr + ", path: " + path);
      } else {
        mapLightmaps.put(Integer.valueOf(dimId), path);
      }
    }
    Set<Integer> setDimIds = mapLightmaps.keySet();
    Integer[] dimIds = (Integer[])setDimIds.toArray(new Integer[setDimIds.size()]);
    
    Arrays.sort(dimIds);
    if (dimIds.length <= 0) {
      return new ImmutablePair(null, Integer.valueOf(0));
    }
    int minDimId = dimIds[0].intValue();
    int maxDimId = dimIds[(dimIds.length - 1)].intValue();
    int countDim = maxDimId - minDimId + 1;
    CustomColormap[] colormaps = new CustomColormap[countDim];
    for (int i = 0; i < dimIds.length; i++)
    {
      Integer dimId = dimIds[i];
      String path = (String)mapLightmaps.get(dimId);
      CustomColormap colors = getCustomColors(path, -1, -1);
      if (colors != null) {
        if (colors.getWidth() < 16)
        {
          warn("Invalid lightmap width: " + colors.getWidth() + ", path: " + path);
        }
        else
        {
          int lightmapIndex = dimId.intValue() - minDimId;
          colormaps[lightmapIndex] = colors;
        }
      }
    }
    return new ImmutablePair(colormaps, Integer.valueOf(minDimId));
  }
  
  private static int getTextureHeight(String path, int defHeight)
  {
    try
    {
      InputStream in = Config.getResourceStream(new jy(path));
      if (in == null) {
        return defHeight;
      }
      BufferedImage bi = ImageIO.read(in);
      in.close();
      if (bi == null) {
        return defHeight;
      }
      return bi.getHeight();
    }
    catch (IOException e) {}
    return defHeight;
  }
  
  private static void readColorProperties(String fileName)
  {
    try
    {
      jy loc = new jy(fileName);
      InputStream in = Config.getResourceStream(loc);
      if (in == null) {
        return;
      }
      dbg("Loading " + fileName);
      Properties props = new Properties();
      props.load(in);
      in.close();
      
      particleWaterColor = readColor(props, new String[] { "particle.water", "drop.water" });
      particlePortalColor = readColor(props, "particle.portal");
      lilyPadColor = readColor(props, "lilypad");
      expBarTextColor = readColor(props, "text.xpbar");
      bossTextColor = readColor(props, "text.boss");
      signTextColor = readColor(props, "text.sign");
      
      fogColorNether = readColorVec3(props, "fog.nether");
      fogColorEnd = readColorVec3(props, "fog.end");
      skyColorEnd = readColorVec3(props, "sky.end");
      
      readCustomPalettes(props, fileName);
      
      spawnEggPrimaryColors = readSpawnEggColors(props, fileName, "egg.shell.", "Spawn egg shell");
      spawnEggSecondaryColors = readSpawnEggColors(props, fileName, "egg.spots.", "Spawn egg spot");
      
      wolfCollarColors = readDyeColors(props, fileName, "collar.", "Wolf collar");
      
      sheepColors = readDyeColors(props, fileName, "sheep.", "Sheep");
      
      textColors = readTextColors(props, fileName, "text.code.", "Text");
      
      int[] mapColors = readMapColors(props, fileName, "map.", "Map");
      if (mapColors != null)
      {
        if (mapColorsOriginal == null) {
          mapColorsOriginal = getMapColors();
        }
        setMapColors(mapColors);
      }
      potionColors = readPotionColors(props, fileName, "potion.", "Potion");
    }
    catch (FileNotFoundException e) {}catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  private static void readCustomPalettes(Properties props, String fileName)
  {
    blockPalettes = new int['Ā'][1];
    for (int i = 0; i < 256; i++) {
      blockPalettes[i][0] = -1;
    }
    String palettePrefix = "palette.block.";
    Map map = new HashMap();
    Set keys = props.keySet();
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(palettePrefix)) {
        map.put(key, value);
      }
    }
    String[] propNames = (String[])map.keySet().toArray(new String[map.size()]);
    paletteColors = new CustomColormap[propNames.length];
    for (int i = 0; i < propNames.length; i++)
    {
      String name = propNames[i];
      String value = props.getProperty(name);
      dbg("Block palette: " + name + " = " + value);
      String path = name.substring(palettePrefix.length());
      
      String basePath = TextureUtils.getBasePath(fileName);
      path = TextureUtils.fixResourcePath(path, basePath);
      
      CustomColormap colors = getCustomColors(path, 256, 256);
      paletteColors[i] = colors;
      
      String[] indexStrs = Config.tokenize(value, " ,;");
      for (int ix = 0; ix < indexStrs.length; ix++)
      {
        String blockStr = indexStrs[ix];
        
        int metadata = -1;
        if (blockStr.contains(":"))
        {
          String[] blockStrs = Config.tokenize(blockStr, ":");
          blockStr = blockStrs[0];
          String metadataStr = blockStrs[1];
          metadata = Config.parseInt(metadataStr, -1);
          if ((metadata < 0) || (metadata > 15))
          {
            warn("Invalid block metadata: " + blockStr + " in palette: " + name);
            continue;
          }
        }
        int blockIndex = Config.parseInt(blockStr, -1);
        if ((blockIndex < 0) || (blockIndex > 255)) {
          warn("Invalid block index: " + blockIndex + " in palette: " + name);
        } else if ((blockIndex != afh.a(afi.c)) && (blockIndex != afh.a(afi.H)) && (blockIndex != afh.a(afi.t)) && (blockIndex != afh.a(afi.bn))) {
          if (metadata == -1)
          {
            blockPalettes[blockIndex][0] = i;
          }
          else
          {
            if (blockPalettes[blockIndex].length < 16)
            {
              blockPalettes[blockIndex] = new int[16];
              Arrays.fill(blockPalettes[blockIndex], -1);
            }
            blockPalettes[blockIndex][metadata] = i;
          }
        }
      }
    }
  }
  
  private static int readColor(Properties props, String[] names)
  {
    for (int i = 0; i < names.length; i++)
    {
      String name = names[i];
      int col = readColor(props, name);
      if (col >= 0) {
        return col;
      }
    }
    return -1;
  }
  
  private static int readColor(Properties props, String name)
  {
    String str = props.getProperty(name);
    if (str == null) {
      return -1;
    }
    str = str.trim();
    
    int color = parseColor(str);
    if (color < 0)
    {
      warn("Invalid color: " + name + " = " + str);
      return color;
    }
    dbg(name + " = " + str);
    
    return color;
  }
  
  private static int parseColor(String str)
  {
    if (str == null) {
      return -1;
    }
    str = str.trim();
    try
    {
      return Integer.parseInt(str, 16) & 0xFFFFFF;
    }
    catch (NumberFormatException e) {}
    return -1;
  }
  
  private static aui readColorVec3(Properties props, String name)
  {
    int col = readColor(props, name);
    if (col < 0) {
      return null;
    }
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    return new aui(redF, greenF, blueF);
  }
  
  private static CustomColormap getCustomColors(String basePath, String[] paths, int width, int height)
  {
    for (int i = 0; i < paths.length; i++)
    {
      String path = paths[i];
      
      path = basePath + path;
      
      CustomColormap cols = getCustomColors(path, width, height);
      if (cols != null) {
        return cols;
      }
    }
    return null;
  }
  
  public static CustomColormap getCustomColors(String pathImage, int width, int height)
  {
    try
    {
      jy loc = new jy(pathImage);
      if (!Config.hasResource(loc)) {
        return null;
      }
      dbg("Colormap " + pathImage);
      
      Properties props = new Properties();
      String pathProps = StrUtils.replaceSuffix(pathImage, ".png", ".properties");
      jy locProps = new jy(pathProps);
      if (Config.hasResource(locProps))
      {
        InputStream in = Config.getResourceStream(locProps);
        props.load(in);
        in.close();
        dbg("Colormap properties: " + pathProps);
      }
      else
      {
        props.put("format", "vanilla");
        props.put("source", pathImage);
        pathProps = pathImage;
      }
      CustomColormap cm = new CustomColormap(props, pathProps, width, height);
      if (!cm.isValid(pathProps)) {
        return null;
      }
      return cm;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return null;
  }
  
  public static void updateUseDefaultColorMultiplier()
  {
    useDefaultColorMultiplier = (foliageBirchColors == null) && (foliagePineColors == null) && (swampGrassColors == null) && (swampFoliageColors == null) && (blockPalettes == null) && (Config.isSwampColors()) && (Config.isSmoothBiomes());
  }
  
  public static int getColorMultiplier(bgg quad, afh block, adq blockAccess, cj blockPos, RenderEnv renderEnv)
  {
    if (useDefaultColorMultiplier) {
      return -1;
    }
    CustomColormap colors = null;
    CustomColormap swampColors = null;
    if (blockPalettes != null)
    {
      int blockId = renderEnv.getBlockId();
      if ((blockId >= 0) && (blockId < 256))
      {
        int[] metadataPals = blockPalettes[blockId];
        int paletteIx = -1;
        if (metadataPals.length > 1)
        {
          int metadata = renderEnv.getMetadata();
          paletteIx = metadataPals[metadata];
        }
        else
        {
          paletteIx = metadataPals[0];
        }
        if (paletteIx >= 0) {
          colors = paletteColors[paletteIx];
        }
      }
      if (colors != null)
      {
        if (Config.isSmoothBiomes()) {
          return getSmoothColorMultiplier(block, blockAccess, blockPos, colors, colors, 0, 0, renderEnv);
        }
        return colors.getColor(blockAccess, blockPos);
      }
    }
    if (!quad.b()) {
      return -1;
    }
    if (block == afi.bx) {
      return getLilypadColorMultiplier(blockAccess, blockPos);
    }
    if ((block instanceof ajx)) {
      return getStemColorMultiplier(block, blockAccess, blockPos, renderEnv);
    }
    boolean useSwampColors = Config.isSwampColors();
    boolean smoothColors = false;
    int type = 0;
    int metadata = 0;
    if ((block == afi.c) || (block == afi.H))
    {
      type = 1;
      smoothColors = Config.isSmoothBiomes();
      
      colors = grassColors;
      if (useSwampColors) {
        swampColors = swampGrassColors;
      } else {
        swampColors = colors;
      }
    }
    else if (block == afi.t)
    {
      type = 2;
      smoothColors = Config.isSmoothBiomes();
      
      metadata = renderEnv.getMetadata();
      if ((metadata & 0x3) == 1)
      {
        colors = foliagePineColors;
      }
      else if ((metadata & 0x3) == 2)
      {
        colors = foliageBirchColors;
      }
      else
      {
        colors = foliageColors;
        if (useSwampColors) {
          swampColors = swampFoliageColors;
        } else {
          swampColors = colors;
        }
      }
    }
    else if (block == afi.bn)
    {
      type = 2;
      smoothColors = Config.isSmoothBiomes();
      
      colors = foliageColors;
      if (useSwampColors) {
        swampColors = swampFoliageColors;
      } else {
        swampColors = colors;
      }
    }
    if (smoothColors) {
      return getSmoothColorMultiplier(block, blockAccess, blockPos, colors, swampColors, type, metadata, renderEnv);
    }
    if (swampColors != colors) {
      if (blockAccess.b(blockPos) == ady.v) {
        colors = swampColors;
      }
    }
    if (colors != null) {
      return colors.getColor(blockAccess, blockPos);
    }
    return -1;
  }
  
  private static int getSmoothColorMultiplier(afh block, adq blockAccess, cj blockPos, CustomColormap colors, CustomColormap swampColors, int type, int metadata, RenderEnv renderEnv)
  {
    int sumRed = 0;
    int sumGreen = 0;
    int sumBlue = 0;
    int x = blockPos.n();
    int y = blockPos.o();
    int z = blockPos.p();
    BlockPosM posM = renderEnv.getColorizerBlockPos();
    for (int ix = x - 1; ix <= x + 1; ix++) {
      for (int iz = z - 1; iz <= z + 1; iz++)
      {
        posM.setXyz(ix, y, iz);
        CustomColormap cols = colors;
        if (swampColors != cols) {
          if (blockAccess.b(posM) == ady.v) {
            cols = swampColors;
          }
        }
        int col = 0;
        if (cols == null) {
          switch (type)
          {
          case 1: 
            col = blockAccess.b(posM).b(posM);
            break;
          case 2: 
            if ((metadata & 0x3) == 1) {
              col = adj.a();
            } else if ((metadata & 0x3) == 2) {
              col = adj.b();
            } else {
              col = blockAccess.b(posM).c(posM);
            }
            break;
          default: 
            col = block.d(blockAccess, posM);break;
          }
        } else {
          col = cols.getColor(blockAccess, posM);
        }
        sumRed += (col >> 16 & 0xFF);
        sumGreen += (col >> 8 & 0xFF);
        sumBlue += (col & 0xFF);
      }
    }
    int r = sumRed / 9;
    int g = sumGreen / 9;
    int b = sumBlue / 9;
    
    return r << 16 | g << 8 | b;
  }
  
  public static int getFluidColor(afh block, adq blockAccess, cj blockPos)
  {
    if (block.t() != arm.h) {
      return block.d(blockAccess, blockPos);
    }
    if (waterColors != null)
    {
      if (Config.isSmoothBiomes()) {
        return waterColors.getColorSmooth(blockAccess, blockPos.n(), blockPos.o(), blockPos.p(), 3, 1);
      }
      return waterColors.getColor(blockAccess, blockPos);
    }
    if (!Config.isSwampColors()) {
      return 16777215;
    }
    return block.d(blockAccess, blockPos);
  }
  
  public static void updatePortalFX(beb fx)
  {
    if (particlePortalColor < 0) {
      return;
    }
    int col = particlePortalColor;
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    fx.b(redF, greenF, blueF);
  }
  
  public static void updateMyceliumFX(beb fx)
  {
    if (myceliumParticleColors == null) {
      return;
    }
    int col = myceliumParticleColors.getColorRandom();
    
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    fx.b(redF, greenF, blueF);
  }
  
  public static void updateReddustFX(beb fx, adq blockAccess, double x, double y, double z)
  {
    if (redstoneColors == null) {
      return;
    }
    alz state = blockAccess.p(new cj(x, y, z));
    int level = getRedstoneLevel(state, 15);
    
    int col = redstoneColors.getColor(level);
    
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    fx.b(redF, greenF, blueF);
  }
  
  private static int getRedstoneLevel(alz state, int def)
  {
    afh block = state.c();
    if (!(block instanceof ajb)) {
      return def;
    }
    Object val = state.b(ajb.P);
    if (!(val instanceof Integer)) {
      return def;
    }
    Integer valInt = (Integer)val;
    return valInt.intValue();
  }
  
  public static int getXpOrbColor(float timer)
  {
    if (xpOrbColors == null) {
      return -1;
    }
    int index = (int)((ns.a(timer) + 1.0F) * (xpOrbColors.getLength() - 1) / 2.0D);
    int col = xpOrbColors.getColor(index);
    return col;
  }
  
  public static void updateWaterFX(beb fx, adq blockAccess, double x, double y, double z)
  {
    if (waterColors == null) {
      return;
    }
    int col = getFluidColor(afi.j, blockAccess, new cj(x, y, z));
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    if (particleWaterColor >= 0)
    {
      int redDrop = particleWaterColor >> 16 & 0xFF;
      int greenDrop = particleWaterColor >> 8 & 0xFF;
      int blueDrop = particleWaterColor & 0xFF;
      
      redF *= redDrop / 255.0F;
      greenF *= greenDrop / 255.0F;
      blueF *= blueDrop / 255.0F;
    }
    fx.b(redF, greenF, blueF);
  }
  
  private static int getLilypadColorMultiplier(adq blockAccess, cj blockPos)
  {
    if (lilyPadColor < 0) {
      return afi.bx.d(blockAccess, blockPos);
    }
    return lilyPadColor;
  }
  
  private static aui getFogColorNether(aui col)
  {
    if (fogColorNether == null) {
      return col;
    }
    return fogColorNether;
  }
  
  private static aui getFogColorEnd(aui col)
  {
    if (fogColorEnd == null) {
      return col;
    }
    return fogColorEnd;
  }
  
  private static aui getSkyColorEnd(aui col)
  {
    if (skyColorEnd == null) {
      return col;
    }
    return skyColorEnd;
  }
  
  public static aui getSkyColor(aui skyColor3d, adq blockAccess, double x, double y, double z)
  {
    if (skyColors == null) {
      return skyColor3d;
    }
    int col = skyColors.getColorSmooth(blockAccess, x, y, z, 7, 1);
    
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    float cRed = (float)skyColor3d.a / 0.5F;
    
    float cGreen = (float)skyColor3d.b / 0.66275F;
    
    float cBlue = (float)skyColor3d.c;
    
    redF *= cRed;
    greenF *= cGreen;
    blueF *= cBlue;
    
    return new aui(redF, greenF, blueF);
  }
  
  private static aui getFogColor(aui fogColor3d, adq blockAccess, double x, double y, double z)
  {
    if (fogColors == null) {
      return fogColor3d;
    }
    int col = fogColors.getColorSmooth(blockAccess, x, y, z, 7, 1);
    
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    float cRed = (float)fogColor3d.a / 0.753F;
    
    float cGreen = (float)fogColor3d.b / 0.8471F;
    
    float cBlue = (float)fogColor3d.c;
    
    redF *= cRed;
    greenF *= cGreen;
    blueF *= cBlue;
    
    return new aui(redF, greenF, blueF);
  }
  
  public static aui getUnderwaterColor(adq blockAccess, double x, double y, double z)
  {
    if (underwaterColors == null) {
      return null;
    }
    int col = underwaterColors.getColorSmooth(blockAccess, x, y, z, 7, 1);
    
    int red = col >> 16 & 0xFF;
    int green = col >> 8 & 0xFF;
    int blue = col & 0xFF;
    
    float redF = red / 255.0F;
    float greenF = green / 255.0F;
    float blueF = blue / 255.0F;
    
    return new aui(redF, greenF, blueF);
  }
  
  private static int averageColor(int c1, int c2)
  {
    int r1 = c1 >> 16 & 0xFF;
    int g1 = c1 >> 8 & 0xFF;
    int b1 = c1 & 0xFF;
    
    int r2 = c2 >> 16 & 0xFF;
    int g2 = c2 >> 8 & 0xFF;
    int b2 = c2 & 0xFF;
    
    int r = (r1 + r2) / 2;
    int g = (g1 + g2) / 2;
    int b = (b1 + b2) / 2;
    
    return r << 16 | g << 8 | b;
  }
  
  private static int getStemColorMultiplier(afh blockStem, adq blockAccess, cj blockPos, RenderEnv renderEnv)
  {
    CustomColormap colors = stemColors;
    if ((blockStem == afi.bl) && (stemPumpkinColors != null)) {
      colors = stemPumpkinColors;
    }
    if ((blockStem == afi.bm) && (stemMelonColors != null)) {
      colors = stemMelonColors;
    }
    if (colors == null) {
      return blockStem.d(blockAccess, blockPos);
    }
    int level = renderEnv.getMetadata();
    
    return colors.getColor(level);
  }
  
  public static boolean updateLightmap(adm world, float torchFlickerX, int[] lmColors, boolean nightvision)
  {
    if (world == null) {
      return false;
    }
    if (lightMapsColorsRgb == null) {
      return false;
    }
    if (!Config.isCustomColors()) {
      return false;
    }
    int dimensionId = world.t.q();
    
    int lightMapIndex = dimensionId - lightmapMinDimensionId;
    if ((lightMapIndex < 0) || (lightMapIndex >= lightMapsColorsRgb.length)) {
      return false;
    }
    CustomColormap lightMapRgb = lightMapsColorsRgb[lightMapIndex];
    if (lightMapRgb == null) {
      return false;
    }
    int height = lightMapRgb.getHeight();
    if ((nightvision) && (height < 64)) {
      return false;
    }
    int width = lightMapRgb.getWidth();
    if (width < 16)
    {
      warn("Invalid lightmap width: " + width + " for dimension: " + dimensionId);
      lightMapsColorsRgb[lightMapIndex] = null;
      return false;
    }
    int startIndex = 0;
    if (nightvision) {
      startIndex = width * 16 * 2;
    }
    float sun = 1.1666666F * (world.b(1.0F) - 0.2F);
    if (world.ac() > 0) {
      sun = 1.0F;
    }
    sun = Config.limitTo1(sun);
    float sunX = sun * (width - 1);
    float torchX = Config.limitTo1(torchFlickerX + 0.5F) * (width - 1);
    float gamma = Config.limitTo1(Config.getGameSettings().aI);
    boolean hasGamma = gamma > 1.0E-4F;
    
    float[][] colorsRgb = lightMapRgb.getColorsRgb();
    getLightMapColumn(colorsRgb, sunX, startIndex, width, sunRgbs);
    getLightMapColumn(colorsRgb, torchX, startIndex + 16 * width, width, torchRgbs);
    
    float[] rgb = new float[3];
    for (int is = 0; is < 16; is++) {
      for (int it = 0; it < 16; it++)
      {
        for (int ic = 0; ic < 3; ic++)
        {
          float comp = Config.limitTo1(sunRgbs[is][ic] + torchRgbs[it][ic]);
          if (hasGamma)
          {
            float cg = 1.0F - comp;
            cg = 1.0F - cg * cg * cg * cg;
            comp = gamma * cg + (1.0F - gamma) * comp;
          }
          rgb[ic] = comp;
        }
        int r = (int)(rgb[0] * 255.0F);
        int g = (int)(rgb[1] * 255.0F);
        int b = (int)(rgb[2] * 255.0F);
        
        lmColors[(is * 16 + it)] = (0xFF000000 | r << 16 | g << 8 | b);
      }
    }
    return true;
  }
  
  private static void getLightMapColumn(float[][] origMap, float x, int offset, int width, float[][] colRgb)
  {
    int xLow = (int)Math.floor(x);
    int xHigh = (int)Math.ceil(x);
    if (xLow == xHigh)
    {
      for (int y = 0; y < 16; y++)
      {
        float[] rgbLow = origMap[(offset + y * width + xLow)];
        float[] rgb = colRgb[y];
        for (int i = 0; i < 3; i++) {
          rgb[i] = rgbLow[i];
        }
      }
      return;
    }
    float dLow = 1.0F - (x - xLow);
    float dHigh = 1.0F - (xHigh - x);
    for (int y = 0; y < 16; y++)
    {
      float[] rgbLow = origMap[(offset + y * width + xLow)];
      float[] rgbHigh = origMap[(offset + y * width + xHigh)];
      float[] rgb = colRgb[y];
      for (int i = 0; i < 3; i++) {
        rgb[i] = (rgbLow[i] * dLow + rgbHigh[i] * dHigh);
      }
    }
  }
  
  public static aui getWorldFogColor(aui fogVec, bdb world, pk renderViewEntity, float partialTicks)
  {
    int worldType = world.t.q();
    switch (worldType)
    {
    case -1: 
      fogVec = getFogColorNether(fogVec);
      break;
    case 0: 
      ave mc = ave.A();
      fogVec = getFogColor(fogVec, mc.f, renderViewEntity.s, renderViewEntity.t + 1.0D, renderViewEntity.u);
      break;
    case 1: 
      fogVec = getFogColorEnd(fogVec);
    }
    return fogVec;
  }
  
  public static aui getWorldSkyColor(aui skyVec, bdb world, pk renderViewEntity, float partialTicks)
  {
    int worldType = world.t.q();
    switch (worldType)
    {
    case 0: 
      ave mc = ave.A();
      skyVec = getSkyColor(skyVec, mc.f, renderViewEntity.s, renderViewEntity.t + 1.0D, renderViewEntity.u);
      break;
    case 1: 
      skyVec = getSkyColorEnd(skyVec);
    }
    return skyVec;
  }
  
  private static int[] readSpawnEggColors(Properties props, String fileName, String prefix, String logName)
  {
    List<Integer> list = new ArrayList();
    Set keys = props.keySet();
    int countColors = 0;
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(prefix))
      {
        String name = StrUtils.removePrefix(key, prefix);
        
        int id = getEntityId(name);
        int color = parseColor(value);
        if ((id < 0) || (color < 0))
        {
          warn("Invalid spawn egg color: " + key + " = " + value);
        }
        else
        {
          while (list.size() <= id) {
            list.add(Integer.valueOf(-1));
          }
          list.set(id, Integer.valueOf(color));
          
          countColors++;
        }
      }
    }
    if (countColors <= 0) {
      return null;
    }
    dbg(logName + " colors: " + countColors);
    
    int[] colors = new int[list.size()];
    for (int i = 0; i < colors.length; i++) {
      colors[i] = ((Integer)list.get(i)).intValue();
    }
    return colors;
  }
  
  private static int getSpawnEggColor(aax item, zx itemStack, int layer, int color)
  {
    int id = itemStack.i();
    int[] eggColors = layer == 0 ? spawnEggPrimaryColors : spawnEggSecondaryColors;
    if (eggColors == null) {
      return color;
    }
    if ((id < 0) || (id >= eggColors.length)) {
      return color;
    }
    int eggColor = eggColors[id];
    if (eggColor < 0) {
      return color;
    }
    return eggColor;
  }
  
  public static int getColorFromItemStack(zx itemStack, int layer, int color)
  {
    if (itemStack == null) {
      return color;
    }
    zw item = itemStack.b();
    if (item == null) {
      return color;
    }
    if ((item instanceof aax)) {
      return getSpawnEggColor((aax)item, itemStack, layer, color);
    }
    return color;
  }
  
  private static float[][] readDyeColors(Properties props, String fileName, String prefix, String logName)
  {
    zd[] dyeValues = zd.values();
    Map<String, zd> mapDyes = new HashMap();
    for (int i = 0; i < dyeValues.length; i++)
    {
      zd dye = dyeValues[i];
      mapDyes.put(dye.l(), dye);
    }
    float[][] colors = new float[dyeValues.length][];
    int countColors = 0;
    
    Set keys = props.keySet();
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(prefix))
      {
        String name = StrUtils.removePrefix(key, prefix);
        if (name.equals("lightBlue")) {
          name = "light_blue";
        }
        zd dye = (zd)mapDyes.get(name);
        int color = parseColor(value);
        if ((dye == null) || (color < 0))
        {
          warn("Invalid color: " + key + " = " + value);
        }
        else
        {
          float[] rgb = new float[3];
          rgb[0] = ((color >> 16 & 0xFF) / 255.0F);
          rgb[1] = ((color >> 8 & 0xFF) / 255.0F);
          rgb[2] = ((color & 0xFF) / 255.0F);
          
          colors[dye.ordinal()] = rgb;
          
          countColors++;
        }
      }
    }
    if (countColors <= 0) {
      return (float[][])null;
    }
    dbg(logName + " colors: " + countColors);
    
    return colors;
  }
  
  private static float[] getDyeColors(zd dye, float[][] dyeColors, float[] colors)
  {
    if (dyeColors == null) {
      return colors;
    }
    if (dye == null) {
      return colors;
    }
    float[] customColors = dyeColors[dye.ordinal()];
    if (customColors == null) {
      return colors;
    }
    return customColors;
  }
  
  public static float[] getWolfCollarColors(zd dye, float[] colors)
  {
    return getDyeColors(dye, wolfCollarColors, colors);
  }
  
  public static float[] getSheepColors(zd dye, float[] colors)
  {
    return getDyeColors(dye, sheepColors, colors);
  }
  
  private static int[] readTextColors(Properties props, String fileName, String prefix, String logName)
  {
    int[] colors = new int[32];
    Arrays.fill(colors, -1);
    int countColors = 0;
    
    Set keys = props.keySet();
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(prefix))
      {
        String name = StrUtils.removePrefix(key, prefix);
        
        int code = Config.parseInt(name, -1);
        int color = parseColor(value);
        if ((code < 0) || (code >= colors.length) || (color < 0))
        {
          warn("Invalid color: " + key + " = " + value);
        }
        else
        {
          colors[code] = color;
          
          countColors++;
        }
      }
    }
    if (countColors <= 0) {
      return null;
    }
    dbg(logName + " colors: " + countColors);
    
    return colors;
  }
  
  public static int getTextColor(int index, int color)
  {
    if (textColors == null) {
      return color;
    }
    if ((index < 0) || (index >= textColors.length)) {
      return color;
    }
    int customColor = textColors[index];
    if (customColor < 0) {
      return color;
    }
    return customColor;
  }
  
  private static int[] readMapColors(Properties props, String fileName, String prefix, String logName)
  {
    int[] colors = new int[arn.a.length];
    Arrays.fill(colors, -1);
    int countColors = 0;
    
    Set keys = props.keySet();
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(prefix))
      {
        String name = StrUtils.removePrefix(key, prefix);
        
        int index = getMapColorIndex(name);
        int color = parseColor(value);
        if ((index < 0) || (index >= colors.length) || (color < 0))
        {
          warn("Invalid color: " + key + " = " + value);
        }
        else
        {
          colors[index] = color;
          
          countColors++;
        }
      }
    }
    if (countColors <= 0) {
      return null;
    }
    dbg(logName + " colors: " + countColors);
    
    return colors;
  }
  
  private static int[] readPotionColors(Properties props, String fileName, String prefix, String logName)
  {
    int[] colors = new int[pe.a.length];
    Arrays.fill(colors, -1);
    int countColors = 0;
    
    Set keys = props.keySet();
    for (Iterator iter = keys.iterator(); iter.hasNext();)
    {
      String key = (String)iter.next();
      String value = props.getProperty(key);
      if (key.startsWith(prefix))
      {
        String name = key;
        
        int index = getPotionId(name);
        int color = parseColor(value);
        if ((index < 0) || (index >= colors.length) || (color < 0))
        {
          warn("Invalid color: " + key + " = " + value);
        }
        else
        {
          colors[index] = color;
          
          countColors++;
        }
      }
    }
    if (countColors <= 0) {
      return null;
    }
    dbg(logName + " colors: " + countColors);
    
    return colors;
  }
  
  private static int getPotionId(String name)
  {
    if (name.equals("potion.water")) {
      return 0;
    }
    pe[] potions = pe.a;
    for (int i = 0; i < potions.length; i++)
    {
      pe potion = potions[i];
      if (potion != null) {
        if (potion.a().equals(name)) {
          return potion.d();
        }
      }
    }
    return -1;
  }
  
  public static int getPotionColor(int potionId, int color)
  {
    if (potionColors == null) {
      return color;
    }
    if ((potionId < 0) || (potionId >= potionColors.length)) {
      return color;
    }
    int potionColor = potionColors[potionId];
    if (potionColor < 0) {
      return color;
    }
    return potionColor;
  }
  
  private static int getMapColorIndex(String name)
  {
    if (name == null) {
      return -1;
    }
    if (name.equals("air")) {
      return arn.b.M;
    }
    if (name.equals("grass")) {
      return arn.c.M;
    }
    if (name.equals("sand")) {
      return arn.d.M;
    }
    if (name.equals("cloth")) {
      return arn.e.M;
    }
    if (name.equals("tnt")) {
      return arn.f.M;
    }
    if (name.equals("ice")) {
      return arn.g.M;
    }
    if (name.equals("iron")) {
      return arn.h.M;
    }
    if (name.equals("foliage")) {
      return arn.i.M;
    }
    if (name.equals("snow")) {
      return arn.j.M;
    }
    if (name.equals("clay")) {
      return arn.k.M;
    }
    if (name.equals("dirt")) {
      return arn.l.M;
    }
    if (name.equals("stone")) {
      return arn.m.M;
    }
    if (name.equals("water")) {
      return arn.n.M;
    }
    if (name.equals("wood")) {
      return arn.o.M;
    }
    if (name.equals("quartz")) {
      return arn.p.M;
    }
    if (name.equals("adobe")) {
      return arn.q.M;
    }
    if (name.equals("magenta")) {
      return arn.r.M;
    }
    if (name.equals("lightBlue")) {
      return arn.s.M;
    }
    if (name.equals("light_blue")) {
      return arn.s.M;
    }
    if (name.equals("yellow")) {
      return arn.t.M;
    }
    if (name.equals("lime")) {
      return arn.u.M;
    }
    if (name.equals("pink")) {
      return arn.v.M;
    }
    if (name.equals("gray")) {
      return arn.w.M;
    }
    if (name.equals("silver")) {
      return arn.x.M;
    }
    if (name.equals("cyan")) {
      return arn.y.M;
    }
    if (name.equals("purple")) {
      return arn.z.M;
    }
    if (name.equals("blue")) {
      return arn.A.M;
    }
    if (name.equals("brown")) {
      return arn.B.M;
    }
    if (name.equals("green")) {
      return arn.C.M;
    }
    if (name.equals("red")) {
      return arn.D.M;
    }
    if (name.equals("black")) {
      return arn.E.M;
    }
    if (name.equals("gold")) {
      return arn.F.M;
    }
    if (name.equals("diamond")) {
      return arn.G.M;
    }
    if (name.equals("lapis")) {
      return arn.H.M;
    }
    if (name.equals("emerald")) {
      return arn.I.M;
    }
    if (name.equals("obsidian")) {
      return arn.J.M;
    }
    if (name.equals("netherrack")) {
      return arn.K.M;
    }
    return -1;
  }
  
  private static int[] getMapColors()
  {
    arn[] mapColors = arn.a;
    int[] colors = new int[mapColors.length];
    Arrays.fill(colors, -1);
    for (int i = 0; (i < mapColors.length) && (i < colors.length); i++)
    {
      arn mapColor = mapColors[i];
      if (mapColor != null) {
        colors[i] = mapColor.L;
      }
    }
    return colors;
  }
  
  private static void setMapColors(int[] colors)
  {
    if (colors == null) {
      return;
    }
    arn[] mapColors = arn.a;
    for (int i = 0; (i < mapColors.length) && (i < colors.length); i++)
    {
      arn mapColor = mapColors[i];
      if (mapColor != null)
      {
        int color = colors[i];
        if (color >= 0) {
          mapColor.L = color;
        }
      }
    }
  }
  
  private static int getEntityId(String name)
  {
    if (name == null) {
      return -1;
    }
    int id = pm.a(name);
    if (id < 0) {
      return -1;
    }
    String idName = pm.b(id);
    if (!Config.equals(name, idName)) {
      return -1;
    }
    return id;
  }
  
  private static void dbg(String str)
  {
    Config.dbg("CustomColors: " + str);
  }
  
  private static void warn(String str)
  {
    Config.warn("CustomColors: " + str);
  }
  
  public static int getExpBarTextColor(int color)
  {
    if (expBarTextColor < 0) {
      return color;
    }
    return expBarTextColor;
  }
  
  public static int getBossTextColor(int color)
  {
    if (bossTextColor < 0) {
      return color;
    }
    return bossTextColor;
  }
  
  public static int getSignTextColor(int color)
  {
    if (signTextColor < 0) {
      return color;
    }
    return signTextColor;
  }
}
