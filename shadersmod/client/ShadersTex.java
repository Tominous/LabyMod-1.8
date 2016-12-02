package shadersmod.client;

import ave;
import bfl;
import bly;
import blz;
import bmd;
import bmf;
import bmh;
import bmi;
import bmj;
import bmk;
import bml;
import bnh;
import bni;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.IntBuffer;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import javax.imageio.ImageIO;
import jy;
import org.lwjgl.BufferUtils;
import org.lwjgl.opengl.GL11;
import shadersmod.common.SMCLog;

public class ShadersTex
{
  public static final int initialBufferSize = 1048576;
  public static ByteBuffer byteBuffer = BufferUtils.createByteBuffer(4194304);
  public static IntBuffer intBuffer = byteBuffer.asIntBuffer();
  public static int[] intArray = new int[1048576];
  public static final int defBaseTexColor = 0;
  public static final int defNormTexColor = -8421377;
  public static final int defSpecTexColor = 0;
  public static Map<Integer, MultiTexID> multiTexMap = new HashMap();
  public static bmh updatingTextureMap = null;
  public static bmi updatingSprite = null;
  public static MultiTexID updatingTex = null;
  public static MultiTexID boundTex = null;
  public static int updatingPage = 0;
  public static String iconName = null;
  
  public static IntBuffer getIntBuffer(int size)
  {
    if (intBuffer.capacity() < size)
    {
      int bufferSize = roundUpPOT(size);
      byteBuffer = BufferUtils.createByteBuffer(bufferSize * 4);
      intBuffer = byteBuffer.asIntBuffer();
    }
    return intBuffer;
  }
  
  public static int[] getIntArray(int size)
  {
    if (intArray.length < size)
    {
      intArray = null;
      intArray = new int[roundUpPOT(size)];
    }
    return intArray;
  }
  
  public static int roundUpPOT(int x)
  {
    int i = x - 1;
    i |= i >> 1;
    i |= i >> 2;
    i |= i >> 4;
    i |= i >> 8;
    i |= i >> 16;
    return i + 1;
  }
  
  public static int log2(int x)
  {
    int log = 0;
    if ((x & 0xFFFF0000) != 0)
    {
      log += 16;
      x >>= 16;
    }
    if ((x & 0xFF00) != 0)
    {
      log += 8;
      x >>= 8;
    }
    if ((x & 0xF0) != 0)
    {
      log += 4;
      x >>= 4;
    }
    if ((x & 0x6) != 0)
    {
      log += 2;
      x >>= 2;
    }
    if ((x & 0x2) != 0) {
      log++;
    }
    return log;
  }
  
  public static IntBuffer fillIntBuffer(int size, int value)
  {
    int[] aint = getIntArray(size);
    IntBuffer intBuf = getIntBuffer(size);
    Arrays.fill(intArray, 0, size, value);
    intBuffer.put(intArray, 0, size);
    return intBuffer;
  }
  
  public static int[] createAIntImage(int size)
  {
    int[] aint = new int[size * 3];
    Arrays.fill(aint, 0, size, 0);
    Arrays.fill(aint, size, size * 2, -8421377);
    Arrays.fill(aint, size * 2, size * 3, 0);
    return aint;
  }
  
  public static int[] createAIntImage(int size, int color)
  {
    int[] aint = new int[size * 3];
    Arrays.fill(aint, 0, size, color);
    Arrays.fill(aint, size, size * 2, -8421377);
    Arrays.fill(aint, size * 2, size * 3, 0);
    return aint;
  }
  
  public static MultiTexID getMultiTexID(bly tex)
  {
    MultiTexID multiTex = tex.multiTex;
    if (multiTex == null)
    {
      int baseTex = tex.b();
      multiTex = (MultiTexID)multiTexMap.get(Integer.valueOf(baseTex));
      if (multiTex == null)
      {
        multiTex = new MultiTexID(baseTex, GL11.glGenTextures(), GL11.glGenTextures());
        multiTexMap.put(Integer.valueOf(baseTex), multiTex);
      }
      tex.multiTex = multiTex;
    }
    return multiTex;
  }
  
  public static void deleteTextures(bly atex, int texid)
  {
    MultiTexID multiTex = atex.multiTex;
    if (multiTex != null)
    {
      atex.multiTex = null;
      multiTexMap.remove(Integer.valueOf(base));
      bfl.h(norm);
      bfl.h(spec);
      if (base != texid)
      {
        SMCLog.warning("Error : MultiTexID.base mismatch: " + base + ", texid: " + texid);
        bfl.h(base);
      }
    }
  }
  
  public static void bindNSTextures(int normTex, int specTex)
  {
    if ((Shaders.isRenderingWorld) && (bfl.getActiveTextureUnit() == 33984))
    {
      bfl.g(33986);
      bfl.i(normTex);
      bfl.g(33987);
      bfl.i(specTex);
      bfl.g(33984);
    }
  }
  
  public static void bindNSTextures(MultiTexID multiTex)
  {
    bindNSTextures(norm, spec);
  }
  
  public static void bindTextures(int baseTex, int normTex, int specTex)
  {
    if ((Shaders.isRenderingWorld) && (bfl.getActiveTextureUnit() == 33984))
    {
      bfl.g(33986);
      bfl.i(normTex);
      bfl.g(33987);
      bfl.i(specTex);
      bfl.g(33984);
    }
    bfl.i(baseTex);
  }
  
  public static void bindTextures(MultiTexID multiTex)
  {
    boundTex = multiTex;
    if ((Shaders.isRenderingWorld) && (bfl.getActiveTextureUnit() == 33984))
    {
      if (Shaders.configNormalMap)
      {
        bfl.g(33986);
        bfl.i(norm);
      }
      if (Shaders.configSpecularMap)
      {
        bfl.g(33987);
        bfl.i(spec);
      }
      bfl.g(33984);
    }
    bfl.i(base);
  }
  
  public static void bindTexture(bmk tex)
  {
    int texId = tex.b();
    if ((tex instanceof bmh))
    {
      Shaders.atlasSizeX = atlasWidth;
      Shaders.atlasSizeY = atlasHeight;
      bindTextures(tex.getMultiTexID());
    }
    else
    {
      Shaders.atlasSizeX = 0;
      Shaders.atlasSizeY = 0;
      bindTextures(tex.getMultiTexID());
    }
  }
  
  public static void bindTextureMapForUpdateAndRender(bmj tm, jy resLoc)
  {
    bmh tex = (bmh)tm.b(resLoc);
    Shaders.atlasSizeX = atlasWidth;
    Shaders.atlasSizeY = atlasHeight;
    bindTextures(updatingTex = tex.getMultiTexID());
  }
  
  public static void bindTextures(int baseTex)
  {
    MultiTexID multiTex = (MultiTexID)multiTexMap.get(Integer.valueOf(baseTex));
    bindTextures(multiTex);
  }
  
  public static void initDynamicTexture(int texID, int width, int height, blz tex)
  {
    MultiTexID multiTex = tex.getMultiTexID();
    
    int[] aint = tex.e();
    int size = width * height;
    Arrays.fill(aint, size, size * 2, -8421377);
    Arrays.fill(aint, size * 2, size * 3, 0);
    
    bml.a(base, width, height);
    bml.a(false, false);
    bml.a(false);
    
    bml.a(norm, width, height);
    bml.a(false, false);
    bml.a(false);
    
    bml.a(spec, width, height);
    bml.a(false, false);
    bml.a(false);
    
    bfl.i(base);
  }
  
  public static void updateDynamicTexture(int texID, int[] src, int width, int height, blz tex)
  {
    MultiTexID multiTex = tex.getMultiTexID();
    
    bfl.i(base);
    updateDynTexSubImage1(src, width, height, 0, 0, 0);
    
    bfl.i(norm);
    updateDynTexSubImage1(src, width, height, 0, 0, 1);
    
    bfl.i(spec);
    updateDynTexSubImage1(src, width, height, 0, 0, 2);
    
    bfl.i(base);
  }
  
  public static void updateDynTexSubImage1(int[] src, int width, int height, int posX, int posY, int page)
  {
    int size = width * height;
    
    IntBuffer intBuf = getIntBuffer(size);
    intBuf.clear();
    
    int offset = page * size;
    if (src.length < offset + size) {
      return;
    }
    intBuf.put(src, offset, size).position(0).limit(size);
    
    GL11.glTexSubImage2D(3553, 0, posX, posY, width, height, 32993, 33639, intBuf);
    intBuf.clear();
  }
  
  public static bmk createDefaultTexture()
  {
    blz tex = new blz(1, 1);
    tex.e()[0] = -1;
    tex.d();
    return tex;
  }
  
  public static void allocateTextureMap(int texID, int mipmapLevels, int width, int height, bmf stitcher, bmh tex)
  {
    SMCLog.info("allocateTextureMap " + mipmapLevels + " " + width + " " + height + " ");
    updatingTextureMap = tex;
    atlasWidth = width;
    atlasHeight = height;
    MultiTexID multiTex = getMultiTexID(tex);
    updatingTex = multiTex;
    bml.a(base, mipmapLevels, width, height);
    if (Shaders.configNormalMap) {
      bml.a(norm, mipmapLevels, width, height);
    }
    if (Shaders.configSpecularMap) {
      bml.a(spec, mipmapLevels, width, height);
    }
    bfl.i(texID);
  }
  
  public static bmi setSprite(bmi tas)
  {
    updatingSprite = tas;return tas;
  }
  
  public static String setIconName(String name)
  {
    iconName = name;return name;
  }
  
  public static void uploadTexSubForLoadAtlas(int[][] data, int width, int height, int xoffset, int yoffset, boolean linear, boolean clamp)
  {
    bml.a(data, width, height, xoffset, yoffset, linear, clamp);
    boolean border = false;
    if (Shaders.configNormalMap)
    {
      int[][] aaint = readImageAndMipmaps(iconName + "_n", width, height, data.length, border, -8421377);
      bfl.i(updatingTexnorm);
      bml.a(aaint, width, height, xoffset, yoffset, linear, clamp);
    }
    if (Shaders.configSpecularMap)
    {
      int[][] aaint = readImageAndMipmaps(iconName + "_s", width, height, data.length, border, 0);
      bfl.i(updatingTexspec);
      bml.a(aaint, width, height, xoffset, yoffset, linear, clamp);
    }
    bfl.i(updatingTexbase);
  }
  
  public static int[][] readImageAndMipmaps(String name, int width, int height, int numLevels, boolean border, int defColor)
  {
    int[][] aaint = new int[numLevels][];
    int[] aint;
    aaint[0] = (aint = new int[width * height]);
    boolean goodImage = false;
    BufferedImage image = readImage(updatingTextureMap.a(new jy(name), 0));
    if (image != null)
    {
      int imageWidth = image.getWidth();
      int imageHeight = image.getHeight();
      if (imageWidth + (border ? 16 : 0) == width)
      {
        goodImage = true;
        image.getRGB(0, 0, imageWidth, imageWidth, aint, 0, imageWidth);
      }
    }
    if (!goodImage) {
      Arrays.fill(aint, defColor);
    }
    bfl.i(updatingTexspec);
    aaint = genMipmapsSimple(aaint.length - 1, width, aaint);
    return aaint;
  }
  
  public static BufferedImage readImage(jy resLoc)
  {
    BufferedImage image = null;
    InputStream istr = null;
    try
    {
      istr = resManager.a(resLoc).b();
      image = ImageIO.read(istr);
    }
    catch (IOException e) {}
    if (istr != null)
    {
      try
      {
        istr.close();
      }
      catch (IOException e) {}
      istr = null;
    }
    return image;
  }
  
  public static int[][] genMipmapsSimple(int maxLevel, int width, int[][] data)
  {
    for (int level = 1; level <= maxLevel; level++) {
      if (data[level] == null)
      {
        int cw = width >> level;
        int pw = cw * 2;
        int[] aintp = data[(level - 1)];
        int[] aintc = data[level] = new int[cw * cw];
        for (int y = 0; y < cw; y++) {
          for (int x = 0; x < cw; x++)
          {
            int ppos = y * 2 * pw + x * 2;
            aintc[(y * cw + x)] = blend4Simple(aintp[ppos], aintp[(ppos + 1)], aintp[(ppos + pw)], aintp[(ppos + pw + 1)]);
          }
        }
      }
    }
    return data;
  }
  
  public static void uploadTexSub(int[][] data, int width, int height, int xoffset, int yoffset, boolean linear, boolean clamp)
  {
    bml.a(data, width, height, xoffset, yoffset, linear, clamp);
    if ((Shaders.configNormalMap) || (Shaders.configSpecularMap))
    {
      if (Shaders.configNormalMap)
      {
        bfl.i(updatingTexnorm);
        uploadTexSub1(data, width, height, xoffset, yoffset, 1);
      }
      if (Shaders.configSpecularMap)
      {
        bfl.i(updatingTexspec);
        uploadTexSub1(data, width, height, xoffset, yoffset, 2);
      }
      bfl.i(updatingTexbase);
    }
  }
  
  public static void uploadTexSub1(int[][] src, int width, int height, int posX, int posY, int page)
  {
    int size = width * height;
    IntBuffer intBuf = getIntBuffer(size);
    int numLevel = src.length;
    int level = 0;int lw = width;int lh = height;int px = posX;int py = posY;
    for (; (lw > 0) && (lh > 0) && (level < numLevel); level++)
    {
      int lsize = lw * lh;
      int[] aint = src[level];
      intBuf.clear();
      if (aint.length >= lsize * (page + 1))
      {
        intBuf.put(aint, lsize * page, lsize).position(0).limit(lsize);
        GL11.glTexSubImage2D(3553, level, px, py, lw, lh, 32993, 33639, intBuf);
      }
      lw >>= 1;
      lh >>= 1;
      px >>= 1;
      py >>= 1;
    }
    intBuf.clear();
  }
  
  public static int blend4Alpha(int c0, int c1, int c2, int c3)
  {
    int a0 = c0 >>> 24 & 0xFF;
    int a1 = c1 >>> 24 & 0xFF;
    int a2 = c2 >>> 24 & 0xFF;
    int a3 = c3 >>> 24 & 0xFF;
    int as = a0 + a1 + a2 + a3;
    int an = (as + 2) / 4;
    int dv;
    int dv;
    if (as != 0)
    {
      dv = as;
    }
    else
    {
      dv = 4;
      a3 = a2 = a1 = a0 = 1;
    }
    int frac = (dv + 1) / 2;
    
    int color = an << 24 | ((c0 >>> 16 & 0xFF) * a0 + (c1 >>> 16 & 0xFF) * a1 + (c2 >>> 16 & 0xFF) * a2 + (c3 >>> 16 & 0xFF) * a3 + frac) / dv << 16 | ((c0 >>> 8 & 0xFF) * a0 + (c1 >>> 8 & 0xFF) * a1 + (c2 >>> 8 & 0xFF) * a2 + (c3 >>> 8 & 0xFF) * a3 + frac) / dv << 8 | ((c0 >>> 0 & 0xFF) * a0 + (c1 >>> 0 & 0xFF) * a1 + (c2 >>> 0 & 0xFF) * a2 + (c3 >>> 0 & 0xFF) * a3 + frac) / dv << 0;
    
    return color;
  }
  
  public static int blend4Simple(int c0, int c1, int c2, int c3)
  {
    int color = ((c0 >>> 24 & 0xFF) + (c1 >>> 24 & 0xFF) + (c2 >>> 24 & 0xFF) + (c3 >>> 24 & 0xFF) + 2) / 4 << 24 | ((c0 >>> 16 & 0xFF) + (c1 >>> 16 & 0xFF) + (c2 >>> 16 & 0xFF) + (c3 >>> 16 & 0xFF) + 2) / 4 << 16 | ((c0 >>> 8 & 0xFF) + (c1 >>> 8 & 0xFF) + (c2 >>> 8 & 0xFF) + (c3 >>> 8 & 0xFF) + 2) / 4 << 8 | ((c0 >>> 0 & 0xFF) + (c1 >>> 0 & 0xFF) + (c2 >>> 0 & 0xFF) + (c3 >>> 0 & 0xFF) + 2) / 4 << 0;
    
    return color;
  }
  
  public static void genMipmapAlpha(int[] aint, int offset, int width, int height)
  {
    int minwh = Math.min(width, height);
    
    int w1 = w2 = width;
    int h1 = h2 = height;
    int o1 = o2 = offset;
    
    int o2 = offset;
    int w2 = width;
    int h2 = height;
    o1 = 0;
    w1 = 0;
    h1 = 0;
    for (int level = 0; (w2 > 1) && (h2 > 1); o2 = o1)
    {
      o1 = o2 + w2 * h2;
      w1 = w2 / 2;
      h1 = h2 / 2;
      for (int y = 0; y < h1; y++)
      {
        int p1 = o1 + y * w1;
        int p2 = o2 + y * 2 * w2;
        for (int x = 0; x < w1; x++) {
          aint[(p1 + x)] = blend4Alpha(aint[(p2 + x * 2)], aint[(p2 + (x * 2 + 1))], aint[(p2 + w2 + x * 2)], aint[(p2 + w2 + (x * 2 + 1))]);
        }
      }
      level++;w2 = w1;h2 = h1;
    }
    while (level > 0)
    {
      level--;
      w2 = width >> level;
      h2 = height >> level;
      o2 = o1 - w2 * h2;
      int p2 = o2;
      for (int y = 0; y < h2; y++) {
        for (int x = 0; x < w2; x++)
        {
          if (aint[p2] == 0) {
            aint[p2] = (aint[(o1 + y / 2 * w1 + x / 2)] & 0xFFFFFF);
          }
          p2++;
        }
      }
      o1 = o2;
      w1 = w2;
      h1 = h2;
    }
  }
  
  public static void genMipmapSimple(int[] aint, int offset, int width, int height)
  {
    int minwh = Math.min(width, height);
    
    int w1 = w2 = width;
    int h1 = h2 = height;
    int o1 = o2 = offset;
    
    int o2 = offset;
    int w2 = width;
    int h2 = height;
    o1 = 0;
    w1 = 0;
    h1 = 0;
    for (int level = 0; (w2 > 1) && (h2 > 1); o2 = o1)
    {
      o1 = o2 + w2 * h2;
      w1 = w2 / 2;
      h1 = h2 / 2;
      for (int y = 0; y < h1; y++)
      {
        int p1 = o1 + y * w1;
        int p2 = o2 + y * 2 * w2;
        for (int x = 0; x < w1; x++) {
          aint[(p1 + x)] = blend4Simple(aint[(p2 + x * 2)], aint[(p2 + (x * 2 + 1))], aint[(p2 + w2 + x * 2)], aint[(p2 + w2 + (x * 2 + 1))]);
        }
      }
      level++;w2 = w1;h2 = h1;
    }
    while (level > 0)
    {
      level--;
      w2 = width >> level;
      h2 = height >> level;
      o2 = o1 - w2 * h2;
      int p2 = o2;
      for (int y = 0; y < h2; y++) {
        for (int x = 0; x < w2; x++)
        {
          if (aint[p2] == 0) {
            aint[p2] = (aint[(o1 + y / 2 * w1 + x / 2)] & 0xFFFFFF);
          }
          p2++;
        }
      }
      o1 = o2;
      w1 = w2;
      h1 = h2;
    }
  }
  
  public static boolean isSemiTransparent(int[] aint, int width, int height)
  {
    int size = width * height;
    if ((aint[0] >>> 24 == 255) && (aint[(size - 1)] == 0)) {
      return true;
    }
    for (int i = 0; i < size; i++)
    {
      int alpha = aint[i] >>> 24;
      if ((alpha != 0) && (alpha != 255)) {
        return true;
      }
    }
    return false;
  }
  
  public static void updateSubTex1(int[] src, int width, int height, int posX, int posY)
  {
    int level = 0;int cw = width;int ch = height;int cx = posX;int cy = posY;
    for (; (cw > 0) && (ch > 0); cy /= 2)
    {
      GL11.glCopyTexSubImage2D(3553, level, cx, cy, 0, 0, cw, ch);level++;cw /= 2;ch /= 2;cx /= 2;
    }
  }
  
  public static void setupTexture(MultiTexID multiTex, int[] src, int width, int height, boolean linear, boolean clamp)
  {
    int mmfilter = linear ? 9729 : 9728;
    int wraptype = clamp ? 10496 : 10497;
    int size = width * height;
    IntBuffer intBuf = getIntBuffer(size);
    
    intBuf.clear();
    intBuf.put(src, 0, size).position(0).limit(size);
    bfl.i(base);
    GL11.glTexImage2D(3553, 0, 6408, width, height, 0, 32993, 33639, intBuf);
    GL11.glTexParameteri(3553, 10241, mmfilter);
    GL11.glTexParameteri(3553, 10240, mmfilter);
    GL11.glTexParameteri(3553, 10242, wraptype);
    GL11.glTexParameteri(3553, 10243, wraptype);
    
    intBuf.put(src, size, size).position(0).limit(size);
    bfl.i(norm);
    GL11.glTexImage2D(3553, 0, 6408, width, height, 0, 32993, 33639, intBuf);
    GL11.glTexParameteri(3553, 10241, mmfilter);
    GL11.glTexParameteri(3553, 10240, mmfilter);
    GL11.glTexParameteri(3553, 10242, wraptype);
    GL11.glTexParameteri(3553, 10243, wraptype);
    
    intBuf.put(src, size * 2, size).position(0).limit(size);
    bfl.i(spec);
    GL11.glTexImage2D(3553, 0, 6408, width, height, 0, 32993, 33639, intBuf);
    GL11.glTexParameteri(3553, 10241, mmfilter);
    GL11.glTexParameteri(3553, 10240, mmfilter);
    GL11.glTexParameteri(3553, 10242, wraptype);
    GL11.glTexParameteri(3553, 10243, wraptype);
    
    bfl.i(base);
  }
  
  public static void updateSubImage(MultiTexID multiTex, int[] src, int width, int height, int posX, int posY, boolean linear, boolean clamp)
  {
    int size = width * height;
    IntBuffer intBuf = getIntBuffer(size);
    
    intBuf.clear();
    intBuf.put(src, 0, size);
    intBuf.position(0).limit(size);
    bfl.i(base);
    GL11.glTexParameteri(3553, 10241, 9728);
    GL11.glTexParameteri(3553, 10240, 9728);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    GL11.glTexSubImage2D(3553, 0, posX, posY, width, height, 32993, 33639, intBuf);
    if (src.length == size * 3)
    {
      intBuf.clear();
      intBuf.put(src, size, size).position(0);
      intBuf.position(0).limit(size);
    }
    bfl.i(norm);
    GL11.glTexParameteri(3553, 10241, 9728);
    GL11.glTexParameteri(3553, 10240, 9728);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    GL11.glTexSubImage2D(3553, 0, posX, posY, width, height, 32993, 33639, intBuf);
    if (src.length == size * 3)
    {
      intBuf.clear();
      intBuf.put(src, size * 2, size);
      intBuf.position(0).limit(size);
    }
    bfl.i(spec);
    GL11.glTexParameteri(3553, 10241, 9728);
    GL11.glTexParameteri(3553, 10240, 9728);
    GL11.glTexParameteri(3553, 10242, 10497);
    GL11.glTexParameteri(3553, 10243, 10497);
    GL11.glTexSubImage2D(3553, 0, posX, posY, width, height, 32993, 33639, intBuf);
    bfl.g(33984);
  }
  
  public static jy getNSMapLocation(jy location, String mapName)
  {
    String basename = location.a();
    String[] basenameParts = basename.split(".png");
    String basenameNoFileType = basenameParts[0];
    return new jy(location.b(), basenameNoFileType + "_" + mapName + ".png");
  }
  
  public static void loadNSMap(bni manager, jy location, int width, int height, int[] aint)
  {
    if (Shaders.configNormalMap) {
      loadNSMap1(manager, getNSMapLocation(location, "n"), width, height, aint, width * height, -8421377);
    }
    if (Shaders.configSpecularMap) {
      loadNSMap1(manager, getNSMapLocation(location, "s"), width, height, aint, width * height * 2, 0);
    }
  }
  
  public static void loadNSMap1(bni manager, jy location, int width, int height, int[] aint, int offset, int defaultColor)
  {
    boolean good = false;
    try
    {
      bnh res = manager.a(location);
      BufferedImage bufferedimage = ImageIO.read(res.b());
      if ((bufferedimage.getWidth() == width) && (bufferedimage.getHeight() == height))
      {
        bufferedimage.getRGB(0, 0, width, height, aint, offset, width);
        good = true;
      }
    }
    catch (IOException ex) {}
    if (!good) {
      Arrays.fill(aint, offset, offset + width * height, defaultColor);
    }
  }
  
  public static int loadSimpleTexture(int textureID, BufferedImage bufferedimage, boolean linear, boolean clamp, bni resourceManager, jy location, MultiTexID multiTex)
  {
    int width = bufferedimage.getWidth();
    int height = bufferedimage.getHeight();
    int size = width * height;
    int[] aint = getIntArray(size * 3);
    bufferedimage.getRGB(0, 0, width, height, aint, 0, width);
    loadNSMap(resourceManager, location, width, height, aint);
    setupTexture(multiTex, aint, width, height, linear, clamp);
    return textureID;
  }
  
  public static void mergeImage(int[] aint, int dstoff, int srcoff, int size) {}
  
  public static int blendColor(int color1, int color2, int factor1)
  {
    int factor2 = 255 - factor1;
    return ((color1 >>> 24 & 0xFF) * factor1 + (color2 >>> 24 & 0xFF) * factor2) / 255 << 24 | ((color1 >>> 16 & 0xFF) * factor1 + (color2 >>> 16 & 0xFF) * factor2) / 255 << 16 | ((color1 >>> 8 & 0xFF) * factor1 + (color2 >>> 8 & 0xFF) * factor2) / 255 << 8 | ((color1 >>> 0 & 0xFF) * factor1 + (color2 >>> 0 & 0xFF) * factor2) / 255 << 0;
  }
  
  public static void loadLayeredTexture(bmd tex, bni manager, List list)
  {
    int width = 0;
    int height = 0;
    int size = 0;
    int[] image = null;
    for (Iterator<String> iterator = list.iterator(); iterator.hasNext();)
    {
      String s = (String)iterator.next();
      if (s != null) {
        try
        {
          jy location = new jy(s);
          InputStream inputstream = manager.a(location).b();
          BufferedImage bufimg = ImageIO.read(inputstream);
          if (size == 0)
          {
            width = bufimg.getWidth();
            height = bufimg.getHeight();
            size = width * height;
            image = createAIntImage(size, 0);
          }
          int[] aint = getIntArray(size * 3);
          bufimg.getRGB(0, 0, width, height, aint, 0, width);
          loadNSMap(manager, location, width, height, aint);
          for (int i = 0; i < size; i++)
          {
            int alpha = aint[i] >>> 24 & 0xFF;
            image[(size * 0 + i)] = blendColor(aint[(size * 0 + i)], image[(size * 0 + i)], alpha);
            image[(size * 1 + i)] = blendColor(aint[(size * 1 + i)], image[(size * 1 + i)], alpha);
            image[(size * 2 + i)] = blendColor(aint[(size * 2 + i)], image[(size * 2 + i)], alpha);
          }
        }
        catch (IOException ex)
        {
          ex.printStackTrace();
        }
      }
    }
    setupTexture(tex.getMultiTexID(), image, width, height, false, false);
  }
  
  static void updateTextureMinMagFilter()
  {
    bmj texman = ave.A().P();
    bmk texObj = texman.b(bmh.g);
    if (texObj != null)
    {
      MultiTexID multiTex = texObj.getMultiTexID();
      
      bfl.i(base);
      GL11.glTexParameteri(3553, 10241, Shaders.texMinFilValue[Shaders.configTexMinFilB]);
      GL11.glTexParameteri(3553, 10240, Shaders.texMagFilValue[Shaders.configTexMagFilB]);
      
      bfl.i(norm);
      GL11.glTexParameteri(3553, 10241, Shaders.texMinFilValue[Shaders.configTexMinFilN]);
      GL11.glTexParameteri(3553, 10240, Shaders.texMagFilValue[Shaders.configTexMagFilN]);
      
      bfl.i(spec);
      GL11.glTexParameteri(3553, 10241, Shaders.texMinFilValue[Shaders.configTexMinFilS]);
      GL11.glTexParameteri(3553, 10240, Shaders.texMagFilValue[Shaders.configTexMagFilS]);
      
      bfl.i(0);
    }
  }
  
  public static bni resManager = null;
  static jy resLocation = null;
  static int imageSize = 0;
  
  public static bnh loadResource(bni manager, jy location)
    throws IOException
  {
    resManager = manager;
    resLocation = location;
    return manager.a(location);
  }
  
  public static int[] loadAtlasSprite(BufferedImage bufferedimage, int startX, int startY, int w, int h, int[] aint, int offset, int scansize)
  {
    imageSize = w * h;
    bufferedimage.getRGB(startX, startY, w, h, aint, offset, scansize);
    loadNSMap(resManager, resLocation, w, h, aint);
    return aint;
  }
  
  public static int[][] getFrameTexData(int[][] src, int width, int height, int frameIndex)
  {
    int numLevel = src.length;
    int[][] dst = new int[numLevel][];
    for (int level = 0; level < numLevel; level++)
    {
      int[] sr1 = src[level];
      if (sr1 != null)
      {
        int frameSize = (width >> level) * (height >> level);
        int[] ds1 = new int[frameSize * 3];
        dst[level] = ds1;
        int srcSize = sr1.length / 3;
        int srcPos = frameSize * frameIndex;
        int dstPos = 0;
        System.arraycopy(sr1, srcPos, ds1, dstPos, frameSize);
        srcPos += srcSize;
        dstPos += frameSize;
        System.arraycopy(sr1, srcPos, ds1, dstPos, frameSize);
        srcPos += srcSize;
        dstPos += frameSize;
        System.arraycopy(sr1, srcPos, ds1, dstPos, frameSize);
      }
    }
    return dst;
  }
  
  public static int[][] prepareAF(bmi tas, int[][] src, int width, int height)
  {
    boolean skip = true;
    
    return src;
  }
  
  public static void fixTransparentColor(bmi tas, int[] aint) {}
}
