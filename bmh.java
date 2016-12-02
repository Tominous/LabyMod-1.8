import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import shadersmod.client.ShadersTex;

public class bmh
  extends bly
  implements bmn
{
  private static final Logger h = ;
  public static final jy f = new jy("missingno");
  public static final jy g = new jy("textures/atlas/blocks.png");
  private final List i;
  private final Map j;
  private final Map k;
  private final String l;
  private final bmb m;
  private int n;
  private final bmi o;
  private static final String __OBFID = "CL_00001058";
  private bmi[] iconGrid = null;
  private int iconGridSize = -1;
  private int iconGridCountX = -1;
  private int iconGridCountY = -1;
  private double iconGridSizeU = -1.0D;
  private double iconGridSizeV = -1.0D;
  private static final boolean ENABLE_SKIP = Boolean.parseBoolean(System.getProperty("fml.skipFirstTextureLoad", "true"));
  private boolean skipFirst = false;
  public int atlasWidth = 0;
  public int atlasHeight = 0;
  
  public bmh(String p_i46099_1_)
  {
    this(p_i46099_1_, (bmb)null);
  }
  
  public bmh(String p_i46099_1_, boolean skipFirst)
  {
    this(p_i46099_1_, (bmb)null, skipFirst);
  }
  
  public bmh(String p_i46100_1_, bmb p_i46100_2_)
  {
    this(p_i46100_1_, p_i46100_2_, false);
  }
  
  public bmh(String p_i46100_1_, bmb p_i46100_2_, boolean skipFirst)
  {
    i = Lists.newArrayList();
    j = Maps.newHashMap();
    k = Maps.newHashMap();
    o = new bmi("missingno");
    l = p_i46100_1_;
    m = p_i46100_2_;
    
    this.skipFirst = ((skipFirst) && (ENABLE_SKIP));
  }
  
  private void g()
  {
    int size = getMinSpriteSize();
    
    int[] var1 = getMissingImageData(size);
    
    o.b(size);
    o.c(size);
    
    int[][] var2 = new int[n + 1][];
    var2[0] = var1;
    o.a(Lists.newArrayList(new int[][][] { var2 }));
    
    o.setIndexInMap(0);
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    ShadersTex.resManager = p_110551_1_;
    if (m != null) {
      a(p_110551_1_, m);
    }
  }
  
  public void a(bni p_174943_1_, bmb p_174943_2_)
  {
    j.clear();
    p_174943_2_.a(this);
    if (n >= 4)
    {
      n = detectMaxMipmapLevel(j, p_174943_1_);
      Config.log("Mipmap levels: " + n);
    }
    g();
    c();
    b(p_174943_1_);
  }
  
  public void b(bni p_110571_1_)
  {
    ShadersTex.resManager = p_110571_1_;
    
    Config.dbg("Multitexture: " + Config.isMultiTexture());
    Iterator it;
    if (Config.isMultiTexture()) {
      for (it = k.values().iterator(); it.hasNext();)
      {
        bmi ts = (bmi)it.next();
        
        ts.deleteSpriteTexture();
      }
    }
    ConnectedTextures.updateIcons(this);
    
    CustomItems.updateIcons(this);
    
    int var2 = ave.C();
    bmf var3 = new bmf(var2, var2, true, 0, n);
    k.clear();
    i.clear();
    int var4 = Integer.MAX_VALUE;
    
    Reflector.callVoid(Reflector.ForgeHooksClient_onTextureStitchedPre, new Object[] { this });
    
    int minSpriteSize = getMinSpriteSize();
    
    iconGridSize = minSpriteSize;
    
    int var5 = 1 << n;
    Iterator var6 = j.entrySet().iterator();
    while ((var6.hasNext()) && (!skipFirst))
    {
      Map.Entry var7 = (Map.Entry)var6.next();
      bmi var8 = (bmi)var7.getValue();
      jy var9 = new jy(var8.i());
      jy var10 = a(var9, 0);
      if (var8.hasCustomLoader(p_110571_1_, var9))
      {
        if (!var8.load(p_110571_1_, var9))
        {
          var4 = Math.min(var4, Math.min(var8.c(), var8.d()));
          var3.a(var8);
        }
      }
      else
      {
        try
        {
          bnh var11 = ShadersTex.loadResource(p_110571_1_, var10);
          
          BufferedImage[] var12 = new BufferedImage[1 + n];
          var12[0] = bml.a(var11.b());
          
          BufferedImage[] imgs = var12;
          if (imgs != null)
          {
            int ws = imgs[0].getWidth();
            if ((ws < minSpriteSize) || (n > 0))
            {
              imgs[0] = TextureUtils.scaleToPowerOfTwo(imgs[0], minSpriteSize);
              int ws2 = imgs[0].getWidth();
              if (ws2 != ws) {
                if (!TextureUtils.isPowerOfTwo(ws)) {
                  Config.log("Scaled non power of 2: " + var8.i() + ", " + ws + " -> " + ws2);
                } else {
                  Config.log("Scaled too small texture: " + var8.i() + ", " + ws + " -> " + ws2);
                }
              }
            }
          }
          bon var13 = (bon)var11.a("texture");
          if (var13 != null)
          {
            List var14 = var13.c();
            if (!var14.isEmpty())
            {
              int var15 = var12[0].getWidth();
              int var16 = var12[0].getHeight();
              if ((ns.b(var15) != var15) || (ns.b(var16) != var16)) {
                throw new RuntimeException("Unable to load extra miplevels, source-texture is not power of two");
              }
            }
            Iterator var39 = var14.iterator();
            while (var39.hasNext())
            {
              int var16 = ((Integer)var39.next()).intValue();
              if ((var16 > 0) && (var16 < var12.length - 1) && (var12[var16] == null))
              {
                jy var17 = a(var9, var16);
                try
                {
                  var12[var16] = bml.a(ShadersTex.loadResource(p_110571_1_, var17).b());
                }
                catch (IOException var22)
                {
                  h.error("Unable to load miplevel {} from: {}", new Object[] { Integer.valueOf(var16), var17, var22 });
                }
              }
            }
          }
          boa var37 = (boa)var11.a("animation");
          var8.a(var12, var37);
        }
        catch (RuntimeException var23)
        {
          h.error("Unable to parse metadata from " + var10, var23);
          
          ReflectorForge.FMLClientHandler_trackBrokenTexture(var10, var23.getMessage());
          continue;
        }
        catch (IOException var24)
        {
          h.error("Using missing texture, unable to load " + var10 + ", " + var24.getClass().getName());
          
          ReflectorForge.FMLClientHandler_trackMissingTexture(var10);
        }
        continue;
        
        var4 = Math.min(var4, Math.min(var8.c(), var8.d()));
        int var32 = Math.min(Integer.lowestOneBit(var8.c()), Integer.lowestOneBit(var8.d()));
        if (var32 < var5)
        {
          h.warn("Texture {} with size {}x{} limits mip level from {} to {}", new Object[] { var10, Integer.valueOf(var8.c()), Integer.valueOf(var8.d()), Integer.valueOf(ns.c(var5)), Integer.valueOf(ns.c(var32)) });
          var5 = var32;
        }
        var3.a(var8);
      }
    }
    int var25 = Math.min(var4, var5);
    int var26 = ns.c(var25);
    if (var26 < 0) {
      var26 = 0;
    }
    if (var26 < n)
    {
      h.info("{}: dropping miplevel from {} to {}, because of minimum power of two: {}", new Object[] { l, Integer.valueOf(n), Integer.valueOf(var26), Integer.valueOf(var25) });
      n = var26;
    }
    Iterator var27 = j.values().iterator();
    while ((var27.hasNext()) && (!skipFirst))
    {
      final bmi var29 = (bmi)var27.next();
      try
      {
        var29.d(n);
      }
      catch (Throwable var21)
      {
        b var33 = b.a(var21, "Applying mipmap");
        c var35 = var33.a("Sprite being mipmapped");
        var35.a("Sprite name", new Callable()
        {
          private static final String __OBFID = "CL_00001059";
          
          public String a()
            throws Exception
          {
            return var29.i();
          }
        });
        var35.a("Sprite size", new Callable()
        {
          private static final String __OBFID = "CL_00001060";
          
          public String a()
            throws Exception
          {
            return var29.c() + " x " + var29.d();
          }
        });
        var35.a("Sprite frames", new Callable()
        {
          private static final String __OBFID = "CL_00001061";
          
          public String a()
            throws Exception
          {
            return var29.k() + " frames";
          }
        });
        var35.a("Mipmap levels", Integer.valueOf(n));
        throw new e(var33);
      }
    }
    o.d(n);
    var3.a(o);
    
    skipFirst = false;
    try
    {
      var3.c();
    }
    catch (bmg var20)
    {
      throw var20;
    }
    h.info("Created: {}x{} {}-atlas", new Object[] { Integer.valueOf(var3.a()), Integer.valueOf(var3.b()), l });
    if (Config.isShaders()) {
      ShadersTex.allocateTextureMap(b(), n, var3.a(), var3.b(), var3, this);
    } else {
      bml.a(b(), n, var3.a(), var3.b());
    }
    HashMap var28 = Maps.newHashMap(j);
    Iterator var30 = var3.d().iterator();
    while (var30.hasNext())
    {
      bmi var31 = (bmi)var30.next();
      if (Config.isShaders()) {
        ShadersTex.setIconName(ShadersTex.setSprite(var31).i());
      }
      String var34 = var31.i();
      var28.remove(var34);
      k.put(var34, var31);
      try
      {
        if (Config.isShaders()) {
          ShadersTex.uploadTexSubForLoadAtlas(var31.a(0), var31.c(), var31.d(), var31.a(), var31.b(), false, false);
        } else {
          bml.a(var31.a(0), var31.c(), var31.d(), var31.a(), var31.b(), false, false);
        }
      }
      catch (Throwable var19)
      {
        b var36 = b.a(var19, "Stitching texture atlas");
        c var38 = var36.a("Texture being stitched together");
        var38.a("Atlas path", l);
        var38.a("Sprite", var31);
        throw new e(var36);
      }
      if (var31.m()) {
        i.add(var31);
      }
    }
    var30 = var28.values().iterator();
    while (var30.hasNext())
    {
      bmi var31 = (bmi)var30.next();
      var31.a(o);
    }
    if (Config.isMultiTexture())
    {
      int sheetWidth = var3.a();
      int sheetHeight = var3.b();
      
      List listSprites = var3.d();
      for (Iterator it = listSprites.iterator(); it.hasNext();)
      {
        bmi tas = (bmi)it.next();
        
        sheetWidth = sheetWidth;
        sheetHeight = sheetHeight;
        mipmapLevels = n;
        
        bmi ss = spriteSingle;
        if (ss != null)
        {
          sheetWidth = sheetWidth;
          sheetHeight = sheetHeight;
          mipmapLevels = n;
          
          tas.bindSpriteTexture();
          
          boolean texBlur = false;
          boolean texClamp = true;
          bml.a(ss.a(0), ss.c(), ss.d(), ss.a(), ss.b(), texBlur, texClamp);
        }
      }
      Config.getMinecraft().P().a(g);
    }
    Reflector.callVoid(Reflector.ForgeHooksClient_onTextureStitchedPost, new Object[] { this });
    
    updateIconGrid(var3.a(), var3.b());
    if (Config.equals(System.getProperty("saveTextureMap"), "true"))
    {
      Config.dbg("Exporting texture map to: " + l + "_x.png");
      bml.saveGlTexture(l.replaceAll("/", "_"), b(), n, var3.a(), var3.b());
    }
  }
  
  public jy a(jy p_147634_1_, int p_147634_2_)
  {
    if (isAbsoluteLocation(p_147634_1_))
    {
      if (p_147634_2_ == 0) {
        return new jy(p_147634_1_.b(), p_147634_1_.a() + ".png");
      }
      return new jy(p_147634_1_.b(), p_147634_1_.a() + "mipmap" + p_147634_2_ + ".png");
    }
    return p_147634_2_ == 0 ? new jy(p_147634_1_.b(), String.format("%s/%s%s", new Object[] { l, p_147634_1_.a(), ".png" })) : new jy(p_147634_1_.b(), String.format("%s/mipmaps/%s.%d%s", new Object[] { l, p_147634_1_.a(), Integer.valueOf(p_147634_2_), ".png" }));
  }
  
  public bmi a(String p_110572_1_)
  {
    bmi var2 = (bmi)k.get(p_110572_1_);
    if (var2 == null) {
      var2 = o;
    }
    return var2;
  }
  
  public void d()
  {
    if (Config.isShaders()) {
      ShadersTex.updatingTex = getMultiTexID();
    }
    bml.b(b());
    Iterator var1 = i.iterator();
    while (var1.hasNext())
    {
      bmi var2 = (bmi)var1.next();
      if (isTerrainAnimationActive(var2)) {
        var2.j();
      }
    }
    if (Config.isMultiTexture())
    {
      for (Iterator it = i.iterator(); it.hasNext();)
      {
        bmi ts = (bmi)it.next();
        if (isTerrainAnimationActive(ts))
        {
          bmi spriteSingle = spriteSingle;
          if (spriteSingle != null)
          {
            h = h;
            ts.bindSpriteTexture();
            spriteSingle.j();
          }
        }
      }
      bml.b(b());
    }
    if (Config.isShaders()) {
      ShadersTex.updatingTex = null;
    }
  }
  
  public bmi a(jy p_174942_1_)
  {
    if (p_174942_1_ == null) {
      throw new IllegalArgumentException("Location cannot be null!");
    }
    bmi var2 = (bmi)j.get(p_174942_1_.toString());
    if (var2 == null)
    {
      var2 = bmi.a(p_174942_1_);
      j.put(p_174942_1_.toString(), var2);
      if ((var2 instanceof bmi))
      {
        bmi tas = var2;
        if (tas.getIndexInMap() < 0) {
          tas.setIndexInMap(j.size());
        }
      }
    }
    return var2;
  }
  
  public void e()
  {
    d();
  }
  
  public void a(int p_147633_1_)
  {
    n = p_147633_1_;
  }
  
  public bmi f()
  {
    return o;
  }
  
  public bmi getTextureExtry(String name)
  {
    jy loc = new jy(name);
    return (bmi)j.get(loc.toString());
  }
  
  public boolean setTextureEntry(String name, bmi entry)
  {
    if (!j.containsKey(name))
    {
      j.put(name, entry);
      if (entry.getIndexInMap() < 0) {
        entry.setIndexInMap(j.size());
      }
      return true;
    }
    return false;
  }
  
  private boolean isAbsoluteLocation(jy loc)
  {
    String path = loc.a();
    return isAbsoluteLocationPath(path);
  }
  
  private boolean isAbsoluteLocationPath(String resPath)
  {
    String path = resPath.toLowerCase();
    if ((path.startsWith("mcpatcher/")) || (path.startsWith("optifine/"))) {
      return true;
    }
    return false;
  }
  
  public bmi getSpriteSafe(String name)
  {
    jy loc = new jy(name);
    return (bmi)j.get(loc.toString());
  }
  
  private boolean isTerrainAnimationActive(bmi ts)
  {
    if ((ts == TextureUtils.iconWaterStill) || (ts == TextureUtils.iconWaterFlow)) {
      return Config.isAnimatedWater();
    }
    if ((ts == TextureUtils.iconLavaStill) || (ts == TextureUtils.iconLavaFlow)) {
      return Config.isAnimatedLava();
    }
    if ((ts == TextureUtils.iconFireLayer0) || (ts == TextureUtils.iconFireLayer1)) {
      return Config.isAnimatedFire();
    }
    if (ts == TextureUtils.iconPortal) {
      return Config.isAnimatedPortal();
    }
    return Config.isAnimatedTerrain();
  }
  
  public int getCountRegisteredSprites()
  {
    return j.size();
  }
  
  private int detectMaxMipmapLevel(Map mapSprites, bni rm)
  {
    int minSize = detectMinimumSpriteSize(mapSprites, rm, 20);
    if (minSize < 16) {
      minSize = 16;
    }
    minSize = ns.b(minSize);
    if (minSize > 16) {
      Config.log("Sprite size: " + minSize);
    }
    int minLevel = ns.c(minSize);
    if (minLevel < 4) {
      minLevel = 4;
    }
    return minLevel;
  }
  
  private int detectMinimumSpriteSize(Map mapSprites, bni rm, int percentScale)
  {
    Map mapSizeCounts = new HashMap();
    Set entrySetSprites = mapSprites.entrySet();
    for (Iterator it = entrySetSprites.iterator(); it.hasNext();)
    {
      Map.Entry entry = (Map.Entry)it.next();
      bmi sprite = (bmi)entry.getValue();
      jy loc = new jy(sprite.i());
      jy locComplete = a(loc, 0);
      if (!sprite.hasCustomLoader(rm, loc)) {
        try
        {
          bnh res = rm.a(locComplete);
          if (res == null) {
            continue;
          }
          InputStream in = res.b();
          if (in == null) {
            continue;
          }
          Dimension dim = TextureUtils.getImageSize(in, "png");
          if (dim == null) {
            continue;
          }
          int width = width;
          int width2 = ns.b(width);
          if (!mapSizeCounts.containsKey(Integer.valueOf(width2)))
          {
            mapSizeCounts.put(Integer.valueOf(width2), Integer.valueOf(1));
            continue;
          }
          int count = ((Integer)mapSizeCounts.get(Integer.valueOf(width2))).intValue();
          mapSizeCounts.put(Integer.valueOf(width2), Integer.valueOf(count + 1));
        }
        catch (Exception e) {}
      }
    }
    int countSprites = 0;
    Set setSizes = mapSizeCounts.keySet();
    Set setSizesSorted = new TreeSet(setSizes);
    for (Iterator it = setSizesSorted.iterator(); it.hasNext();)
    {
      int size = ((Integer)it.next()).intValue();
      int count = ((Integer)mapSizeCounts.get(Integer.valueOf(size))).intValue();
      countSprites += count;
    }
    int minSize = 16;
    int countScale = 0;
    
    int countScaleMax = countSprites * percentScale / 100;
    for (Iterator it = setSizesSorted.iterator(); it.hasNext();)
    {
      int size = ((Integer)it.next()).intValue();
      int count = ((Integer)mapSizeCounts.get(Integer.valueOf(size))).intValue();
      countScale += count;
      if (size > minSize) {
        minSize = size;
      }
      if (countScale > countScaleMax) {
        return minSize;
      }
    }
    return minSize;
  }
  
  private int getMinSpriteSize()
  {
    int minSize = 1 << n;
    if (minSize < 16) {
      minSize = 16;
    }
    return minSize;
  }
  
  private int[] getMissingImageData(int size)
  {
    BufferedImage bi = new BufferedImage(16, 16, 2);
    
    bi.setRGB(0, 0, 16, 16, bml.b, 0, 16);
    
    BufferedImage bi2 = TextureUtils.scaleToPowerOfTwo(bi, size);
    
    int[] data = new int[size * size];
    bi2.getRGB(0, 0, size, size, data, 0, size);
    
    return data;
  }
  
  public boolean isTextureBound()
  {
    int boundTexId = bfl.getBoundTexture();
    int texId = b();
    
    return boundTexId == texId;
  }
  
  private void updateIconGrid(int sheetWidth, int sheetHeight)
  {
    iconGridCountX = -1;
    iconGridCountY = -1;
    iconGrid = null;
    if (iconGridSize <= 0) {
      return;
    }
    iconGridCountX = (sheetWidth / iconGridSize);
    iconGridCountY = (sheetHeight / iconGridSize);
    
    iconGrid = new bmi[iconGridCountX * iconGridCountY];
    iconGridSizeU = (1.0D / iconGridCountX);
    iconGridSizeV = (1.0D / iconGridCountY);
    for (Iterator it = k.values().iterator(); it.hasNext();)
    {
      bmi ts = (bmi)it.next();
      double uMin = Math.min(ts.e(), ts.f());
      double vMin = Math.min(ts.g(), ts.h());
      double uMax = Math.max(ts.e(), ts.f());
      double vMax = Math.max(ts.g(), ts.h());
      int iuMin = (int)(uMin / iconGridSizeU);
      int ivMin = (int)(vMin / iconGridSizeV);
      int iuMax = (int)(uMax / iconGridSizeU);
      int ivMax = (int)(vMax / iconGridSizeV);
      for (int iu = iuMin; iu <= iuMax; iu++) {
        if ((iu < 0) || (iu >= iconGridCountX)) {
          Config.warn("Invalid grid U: " + iu + ", icon: " + ts.i());
        } else {
          for (int iv = ivMin; iv <= ivMax; iv++) {
            if ((iv < 0) || (iv >= iconGridCountX))
            {
              Config.warn("Invalid grid V: " + iv + ", icon: " + ts.i());
            }
            else
            {
              int index = iv * iconGridCountX + iu;
              iconGrid[index] = ts;
            }
          }
        }
      }
    }
  }
  
  public bmi getIconByUV(double u, double v)
  {
    if (iconGrid == null) {
      return null;
    }
    int iu = (int)(u / iconGridSizeU);
    int iv = (int)(v / iconGridSizeV);
    int index = iv * iconGridCountX + iu;
    if ((index < 0) || (index > iconGrid.length)) {
      return null;
    }
    return iconGrid[index];
  }
}
