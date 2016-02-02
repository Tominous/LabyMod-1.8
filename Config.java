import java.awt.Dimension;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.StringTokenizer;
import javax.imageio.ImageIO;
import org.apache.commons.io.IOUtils;
import org.lwjgl.LWJGLException;
import org.lwjgl.Sys;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.opengl.PixelFormat;
import org.lwjgl.util.glu.GLU;
import shadersmod.client.Shaders;

public class Config
{
  public static final String OF_NAME = "OptiFine";
  public static final String MC_VERSION = "1.8.8";
  public static final String OF_EDITION = "HD_U";
  public static final String OF_RELEASE = "G7";
  public static final String VERSION = "OptiFine_1.8.8_HD_U_G7";
  private static String newRelease = null;
  private static boolean notify64BitJava = false;
  public static String openGlVersion = null;
  public static String openGlRenderer = null;
  public static String openGlVendor = null;
  public static boolean fancyFogAvailable = false;
  public static boolean occlusionAvailable = false;
  private static avh gameSettings = null;
  private static ave minecraft = null;
  private static boolean initialized = false;
  private static Thread minecraftThread = null;
  private static DisplayMode desktopDisplayMode = null;
  private static int antialiasingLevel = 0;
  private static int availableProcessors = 0;
  public static boolean zoomMode = false;
  private static int texturePackClouds = 0;
  public static boolean waterOpacityChanged = false;
  private static boolean fullscreenModeChecked = false;
  private static boolean desktopModeChecked = false;
  private static bna defaultResourcePack = null;
  private static PrintStream systemOut = new PrintStream(new FileOutputStream(FileDescriptor.out));
  public static final Boolean DEF_FOG_FANCY = Boolean.valueOf(true);
  public static final Float DEF_FOG_START = Float.valueOf(0.2F);
  public static final Boolean DEF_OPTIMIZE_RENDER_DISTANCE = Boolean.valueOf(false);
  public static final Boolean DEF_OCCLUSION_ENABLED = Boolean.valueOf(false);
  public static final Integer DEF_MIPMAP_LEVEL = Integer.valueOf(0);
  public static final Integer DEF_MIPMAP_TYPE = Integer.valueOf(9984);
  public static final Float DEF_ALPHA_FUNC_LEVEL = Float.valueOf(0.1F);
  public static final Boolean DEF_LOAD_CHUNKS_FAR = Boolean.valueOf(false);
  public static final Integer DEF_PRELOADED_CHUNKS = Integer.valueOf(0);
  public static final Integer DEF_CHUNKS_LIMIT = Integer.valueOf(25);
  public static final Integer DEF_UPDATES_PER_FRAME = Integer.valueOf(3);
  public static final Boolean DEF_DYNAMIC_UPDATES = Boolean.valueOf(false);
  
  public static String getVersion()
  {
    return "OptiFine_1.8.8_HD_U_G7";
  }
  
  public static String getVersionShaders()
  {
    String shaderPack = Shaders.getShaderPackName();
    if (shaderPack == null) {
      return "OptiFine_1.8.8_HD_U_G7";
    }
    return "OptiFine_1.8.8_HD_U_G7, " + shaderPack;
  }
  
  public static void initGameSettings(avh settings)
  {
    if (gameSettings != null) {
      return;
    }
    gameSettings = settings;
    
    minecraft = ave.A();
    
    desktopDisplayMode = Display.getDesktopDisplayMode();
    
    updateAvailableProcessors();
    
    ReflectorForge.putLaunchBlackboard("optifine.ForgeSplashCompatible", Boolean.TRUE);
  }
  
  public static void initDisplay()
  {
    checkInitialized();
    
    antialiasingLevel = gameSettings.ofAaLevel;
    
    checkDisplaySettings();
    
    checkDisplayMode();
    
    minecraftThread = Thread.currentThread();
    
    updateThreadPriorities();
    
    Shaders.startup(ave.A());
  }
  
  public static void checkInitialized()
  {
    if (initialized) {
      return;
    }
    if (!Display.isCreated()) {
      return;
    }
    initialized = true;
    
    checkOpenGlCaps();
    
    startVersionCheckThread();
  }
  
  private static void checkOpenGlCaps()
  {
    log("");
    log(getVersion());
    log("" + new Date());
    log("OS: " + System.getProperty("os.name") + " (" + System.getProperty("os.arch") + ") version " + System.getProperty("os.version"));
    log("Java: " + System.getProperty("java.version") + ", " + System.getProperty("java.vendor"));
    log("VM: " + System.getProperty("java.vm.name") + " (" + System.getProperty("java.vm.info") + "), " + System.getProperty("java.vm.vendor"));
    log("LWJGL: " + Sys.getVersion());
    
    openGlVersion = GL11.glGetString(7938);
    openGlRenderer = GL11.glGetString(7937);
    openGlVendor = GL11.glGetString(7936);
    log("OpenGL: " + openGlRenderer + ", version " + openGlVersion + ", " + openGlVendor);
    log("OpenGL Version: " + getOpenGlVersionString());
    if (!GLContext.getCapabilities().OpenGL12) {
      log("OpenGL Mipmap levels: Not available (GL12.GL_TEXTURE_MAX_LEVEL)");
    }
    fancyFogAvailable = GLContext.getCapabilities().GL_NV_fog_distance;
    if (!fancyFogAvailable) {
      log("OpenGL Fancy fog: Not available (GL_NV_fog_distance)");
    }
    occlusionAvailable = GLContext.getCapabilities().GL_ARB_occlusion_query;
    if (!occlusionAvailable) {
      log("OpenGL Occlussion culling: Not available (GL_ARB_occlusion_query)");
    }
    int maxTexSize = ave.C();
    dbg("Maximum texture size: " + maxTexSize + "x" + maxTexSize);
  }
  
  public static boolean isFancyFogAvailable()
  {
    return fancyFogAvailable;
  }
  
  public static boolean isOcclusionAvailable()
  {
    return occlusionAvailable;
  }
  
  public static String getOpenGlVersionString()
  {
    int ver = getOpenGlVersion();
    String verStr = "" + ver / 10 + "." + ver % 10;
    return verStr;
  }
  
  private static int getOpenGlVersion()
  {
    if (!GLContext.getCapabilities().OpenGL11) {
      return 10;
    }
    if (!GLContext.getCapabilities().OpenGL12) {
      return 11;
    }
    if (!GLContext.getCapabilities().OpenGL13) {
      return 12;
    }
    if (!GLContext.getCapabilities().OpenGL14) {
      return 13;
    }
    if (!GLContext.getCapabilities().OpenGL15) {
      return 14;
    }
    if (!GLContext.getCapabilities().OpenGL20) {
      return 15;
    }
    if (!GLContext.getCapabilities().OpenGL21) {
      return 20;
    }
    if (!GLContext.getCapabilities().OpenGL30) {
      return 21;
    }
    if (!GLContext.getCapabilities().OpenGL31) {
      return 30;
    }
    if (!GLContext.getCapabilities().OpenGL32) {
      return 31;
    }
    if (!GLContext.getCapabilities().OpenGL33) {
      return 32;
    }
    if (!GLContext.getCapabilities().OpenGL40) {
      return 33;
    }
    return 40;
  }
  
  public static void updateThreadPriorities()
  {
    updateAvailableProcessors();
    
    int ELEVATED_PRIORITY = 8;
    if (isSingleProcessor())
    {
      if (isSmoothWorld())
      {
        minecraftThread.setPriority(10);
        setThreadPriority("Server thread", 1);
      }
      else
      {
        minecraftThread.setPriority(5);
        setThreadPriority("Server thread", 5);
      }
    }
    else
    {
      minecraftThread.setPriority(10);
      setThreadPriority("Server thread", 5);
    }
  }
  
  private static void setThreadPriority(String prefix, int priority)
  {
    try
    {
      ThreadGroup tg = Thread.currentThread().getThreadGroup();
      if (tg == null) {
        return;
      }
      int num = (tg.activeCount() + 10) * 2;
      Thread[] ts = new Thread[num];
      tg.enumerate(ts, false);
      for (int i = 0; i < ts.length; i++)
      {
        Thread t = ts[i];
        if (t != null) {
          if (t.getName().startsWith(prefix)) {
            t.setPriority(priority);
          }
        }
      }
    }
    catch (Throwable e)
    {
      dbg(e.getClass().getName() + ": " + e.getMessage());
    }
  }
  
  public static boolean isMinecraftThread()
  {
    return Thread.currentThread() == minecraftThread;
  }
  
  private static void startVersionCheckThread()
  {
    VersionCheckThread vct = new VersionCheckThread();
    vct.start();
  }
  
  public static boolean isMipmaps()
  {
    return gameSettings.J > 0;
  }
  
  public static int getMipmapLevels()
  {
    return gameSettings.J;
  }
  
  public static int getMipmapType()
  {
    if (gameSettings == null) {
      return DEF_MIPMAP_TYPE.intValue();
    }
    switch (gameSettings.ofMipmapType)
    {
    case 0: 
      return 9986;
    case 1: 
      return 9986;
    case 2: 
      if (isMultiTexture()) {
        return 9985;
      }
      return 9986;
    case 3: 
      if (isMultiTexture()) {
        return 9987;
      }
      return 9986;
    }
    return 9986;
  }
  
  public static boolean isUseAlphaFunc()
  {
    float alphaFuncLevel = getAlphaFuncLevel();
    
    return alphaFuncLevel > DEF_ALPHA_FUNC_LEVEL.floatValue() + 1.0E-5F;
  }
  
  public static float getAlphaFuncLevel()
  {
    return DEF_ALPHA_FUNC_LEVEL.floatValue();
  }
  
  public static boolean isFogFancy()
  {
    if (!isFancyFogAvailable()) {
      return false;
    }
    return gameSettings.ofFogType == 2;
  }
  
  public static boolean isFogFast()
  {
    return gameSettings.ofFogType == 1;
  }
  
  public static boolean isFogOff()
  {
    return gameSettings.ofFogType == 3;
  }
  
  public static float getFogStart()
  {
    return gameSettings.ofFogStart;
  }
  
  public static void dbg(String s)
  {
    systemOut.print("[OptiFine] ");
    systemOut.println(s);
  }
  
  public static void warn(String s)
  {
    systemOut.print("[OptiFine] [WARN] ");
    systemOut.println(s);
  }
  
  public static void error(String s)
  {
    systemOut.print("[OptiFine] [ERROR] ");
    systemOut.println(s);
  }
  
  public static void log(String s)
  {
    dbg(s);
  }
  
  public static int getUpdatesPerFrame()
  {
    return gameSettings.ofChunkUpdates;
  }
  
  public static boolean isDynamicUpdates()
  {
    return gameSettings.ofChunkUpdatesDynamic;
  }
  
  public static boolean isRainFancy()
  {
    if (gameSettings.ofRain == 0) {
      return gameSettings.i;
    }
    return gameSettings.ofRain == 2;
  }
  
  public static boolean isRainOff()
  {
    return gameSettings.ofRain == 3;
  }
  
  public static boolean isCloudsFancy()
  {
    if (gameSettings.ofClouds != 0) {
      return gameSettings.ofClouds == 2;
    }
    if (texturePackClouds != 0) {
      return texturePackClouds == 2;
    }
    return gameSettings.i;
  }
  
  public static boolean isCloudsOff()
  {
    return gameSettings.ofClouds == 3;
  }
  
  public static void updateTexturePackClouds()
  {
    texturePackClouds = 0;
    
    bni rm = getResourceManager();
    if (rm == null) {
      return;
    }
    try
    {
      InputStream in = rm.a(new jy("mcpatcher/color.properties")).b();
      if (in == null) {
        return;
      }
      Properties props = new Properties();
      props.load(in);
      
      in.close();
      
      String cloudStr = props.getProperty("clouds");
      if (cloudStr == null) {
        return;
      }
      dbg("Texture pack clouds: " + cloudStr);
      cloudStr = cloudStr.toLowerCase();
      if (cloudStr.equals("fast")) {
        texturePackClouds = 1;
      }
      if (cloudStr.equals("fancy")) {
        texturePackClouds = 2;
      }
    }
    catch (Exception e) {}
  }
  
  public static boolean isTreesFancy()
  {
    if (gameSettings.ofTrees == 0) {
      return gameSettings.i;
    }
    return gameSettings.ofTrees == 2;
  }
  
  public static boolean isDroppedItemsFancy()
  {
    if (gameSettings.ofDroppedItems == 0) {
      return gameSettings.i;
    }
    return gameSettings.ofDroppedItems == 2;
  }
  
  public static int limit(int val, int min, int max)
  {
    if (val < min) {
      return min;
    }
    if (val > max) {
      return max;
    }
    return val;
  }
  
  public static float limit(float val, float min, float max)
  {
    if (val < min) {
      return min;
    }
    if (val > max) {
      return max;
    }
    return val;
  }
  
  public static float limitTo1(float val)
  {
    if (val < 0.0F) {
      return 0.0F;
    }
    if (val > 1.0F) {
      return 1.0F;
    }
    return val;
  }
  
  public static boolean isAnimatedWater()
  {
    return gameSettings.ofAnimatedWater != 2;
  }
  
  public static boolean isGeneratedWater()
  {
    return gameSettings.ofAnimatedWater == 1;
  }
  
  public static boolean isAnimatedPortal()
  {
    return gameSettings.ofAnimatedPortal;
  }
  
  public static boolean isAnimatedLava()
  {
    return gameSettings.ofAnimatedLava != 2;
  }
  
  public static boolean isGeneratedLava()
  {
    return gameSettings.ofAnimatedLava == 1;
  }
  
  public static boolean isAnimatedFire()
  {
    return gameSettings.ofAnimatedFire;
  }
  
  public static boolean isAnimatedRedstone()
  {
    return gameSettings.ofAnimatedRedstone;
  }
  
  public static boolean isAnimatedExplosion()
  {
    return gameSettings.ofAnimatedExplosion;
  }
  
  public static boolean isAnimatedFlame()
  {
    return gameSettings.ofAnimatedFlame;
  }
  
  public static boolean isAnimatedSmoke()
  {
    return gameSettings.ofAnimatedSmoke;
  }
  
  public static boolean isVoidParticles()
  {
    return gameSettings.ofVoidParticles;
  }
  
  public static boolean isWaterParticles()
  {
    return gameSettings.ofWaterParticles;
  }
  
  public static boolean isRainSplash()
  {
    return gameSettings.ofRainSplash;
  }
  
  public static boolean isPortalParticles()
  {
    return gameSettings.ofPortalParticles;
  }
  
  public static boolean isPotionParticles()
  {
    return gameSettings.ofPotionParticles;
  }
  
  public static boolean isFireworkParticles()
  {
    return gameSettings.ofFireworkParticles;
  }
  
  public static float getAmbientOcclusionLevel()
  {
    return gameSettings.ofAoLevel;
  }
  
  private static Method getMethod(Class cls, String methodName, Object[] params)
  {
    Method[] methods = cls.getMethods();
    for (int i = 0; i < methods.length; i++)
    {
      Method m = methods[i];
      if (m.getName().equals(methodName)) {
        if (m.getParameterTypes().length == params.length) {
          return m;
        }
      }
    }
    warn("No method found for: " + cls.getName() + "." + methodName + "(" + arrayToString(params) + ")");
    return null;
  }
  
  public static String arrayToString(Object[] arr)
  {
    if (arr == null) {
      return "";
    }
    StringBuffer buf = new StringBuffer(arr.length * 5);
    for (int i = 0; i < arr.length; i++)
    {
      Object obj = arr[i];
      if (i > 0) {
        buf.append(", ");
      }
      buf.append(String.valueOf(obj));
    }
    return buf.toString();
  }
  
  public static String arrayToString(int[] arr)
  {
    if (arr == null) {
      return "";
    }
    StringBuffer buf = new StringBuffer(arr.length * 5);
    for (int i = 0; i < arr.length; i++)
    {
      int x = arr[i];
      if (i > 0) {
        buf.append(", ");
      }
      buf.append(String.valueOf(x));
    }
    return buf.toString();
  }
  
  public static ave getMinecraft()
  {
    return minecraft;
  }
  
  public static bmj getTextureManager()
  {
    return minecraft.P();
  }
  
  public static bni getResourceManager()
  {
    return minecraft.Q();
  }
  
  public static InputStream getResourceStream(jy location)
    throws IOException
  {
    return getResourceStream(minecraft.Q(), location);
  }
  
  public static InputStream getResourceStream(bni resourceManager, jy location)
    throws IOException
  {
    bnh res = resourceManager.a(location);
    if (res == null) {
      return null;
    }
    return res.b();
  }
  
  public static bnh getResource(jy location)
    throws IOException
  {
    return minecraft.Q().a(location);
  }
  
  public static boolean hasResource(jy location)
  {
    try
    {
      bnh res = getResource(location);
      
      return res != null;
    }
    catch (IOException e) {}
    return false;
  }
  
  public static boolean hasResource(bni resourceManager, jy location)
  {
    try
    {
      bnh res = resourceManager.a(location);
      
      return res != null;
    }
    catch (IOException e) {}
    return false;
  }
  
  public static bnk[] getResourcePacks()
  {
    bnm rep = minecraft.R();
    List entries = rep.c();
    List list = new ArrayList();
    for (Iterator it = entries.iterator(); it.hasNext();)
    {
      bnm.a entry = (bnm.a)it.next();
      list.add(entry.c());
    }
    if (rep.e() != null) {
      list.add(rep.e());
    }
    bnk[] rps = (bnk[])list.toArray(new bnk[list.size()]);
    return rps;
  }
  
  public static String getResourcePackNames()
  {
    if (minecraft == null) {
      return "";
    }
    if (minecraft.R() == null) {
      return "";
    }
    bnk[] rps = getResourcePacks();
    if (rps.length <= 0) {
      return getDefaultResourcePack().b();
    }
    String[] names = new String[rps.length];
    for (int i = 0; i < rps.length; i++) {
      names[i] = rps[i].b();
    }
    String nameStr = arrayToString(names);
    return nameStr;
  }
  
  public static bna getDefaultResourcePack()
  {
    if (defaultResourcePack == null)
    {
      ave mc = ave.A();
      try
      {
        Field[] fields = mc.getClass().getDeclaredFields();
        for (int i = 0; i < fields.length; i++)
        {
          Field field = fields[i];
          if (field.getType() == bna.class)
          {
            field.setAccessible(true);
            defaultResourcePack = (bna)field.get(mc);
            break;
          }
        }
      }
      catch (Exception e)
      {
        dbg("Error getting default resource pack: " + e.getClass().getName() + ": " + e.getMessage());
      }
      if (defaultResourcePack == null)
      {
        bnm repository = mc.R();
        if (repository != null) {
          defaultResourcePack = (bna)repository.a;
        }
      }
    }
    return defaultResourcePack;
  }
  
  public static boolean isFromDefaultResourcePack(jy loc)
  {
    bnk rp = getDefiningResourcePack(loc);
    return rp == getDefaultResourcePack();
  }
  
  public static bnk getDefiningResourcePack(jy loc)
  {
    bnk[] rps = getResourcePacks();
    for (int i = rps.length - 1; i >= 0; i--)
    {
      bnk rp = rps[i];
      if (rp.b(loc)) {
        return rp;
      }
    }
    if (getDefaultResourcePack().b(loc)) {
      return getDefaultResourcePack();
    }
    return null;
  }
  
  public static bfr getRenderGlobal()
  {
    if (minecraft == null) {
      return null;
    }
    return minecraft.g;
  }
  
  public static boolean isBetterGrass()
  {
    return gameSettings.ofBetterGrass != 3;
  }
  
  public static boolean isBetterGrassFancy()
  {
    return gameSettings.ofBetterGrass == 2;
  }
  
  public static boolean isWeatherEnabled()
  {
    return gameSettings.ofWeather;
  }
  
  public static boolean isSkyEnabled()
  {
    return gameSettings.ofSky;
  }
  
  public static boolean isSunMoonEnabled()
  {
    return gameSettings.ofSunMoon;
  }
  
  public static boolean isVignetteEnabled()
  {
    if (gameSettings.ofVignette == 0) {
      return gameSettings.i;
    }
    return gameSettings.ofVignette == 2;
  }
  
  public static boolean isStarsEnabled()
  {
    return gameSettings.ofStars;
  }
  
  public static void sleep(long ms)
  {
    try
    {
      Thread.currentThread();Thread.sleep(ms);
    }
    catch (InterruptedException e)
    {
      e.printStackTrace();
    }
  }
  
  public static boolean isTimeDayOnly()
  {
    return gameSettings.ofTime == 1;
  }
  
  public static boolean isTimeDefault()
  {
    return (gameSettings.ofTime == 0) || (gameSettings.ofTime == 2);
  }
  
  public static boolean isTimeNightOnly()
  {
    return gameSettings.ofTime == 3;
  }
  
  public static boolean isClearWater()
  {
    return gameSettings.ofClearWater;
  }
  
  public static int getAnisotropicFilterLevel()
  {
    return gameSettings.ofAfLevel;
  }
  
  public static boolean isAnisotropicFiltering()
  {
    return getAnisotropicFilterLevel() > 1;
  }
  
  public static int getAntialiasingLevel()
  {
    return antialiasingLevel;
  }
  
  public static boolean isAntialiasing()
  {
    return getAntialiasingLevel() > 0;
  }
  
  public static boolean isAntialiasingConfigured()
  {
    return getGameSettings().ofAaLevel > 0;
  }
  
  public static boolean isMultiTexture()
  {
    if (getAnisotropicFilterLevel() > 1) {
      return true;
    }
    if (getAntialiasingLevel() > 0) {
      return true;
    }
    return false;
  }
  
  public static boolean between(int val, int min, int max)
  {
    return (val >= min) && (val <= max);
  }
  
  public static boolean isDrippingWaterLava()
  {
    return gameSettings.ofDrippingWaterLava;
  }
  
  public static boolean isBetterSnow()
  {
    return gameSettings.ofBetterSnow;
  }
  
  public static Dimension getFullscreenDimension()
  {
    if (desktopDisplayMode == null) {
      return null;
    }
    if (gameSettings == null) {
      return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
    }
    String dimStr = gameSettings.ofFullscreenMode;
    if (dimStr.equals("Default")) {
      return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
    }
    String[] dimStrs = tokenize(dimStr, " x");
    if (dimStrs.length < 2) {
      return new Dimension(desktopDisplayMode.getWidth(), desktopDisplayMode.getHeight());
    }
    return new Dimension(parseInt(dimStrs[0], -1), parseInt(dimStrs[1], -1));
  }
  
  public static int parseInt(String str, int defVal)
  {
    try
    {
      if (str == null) {
        return defVal;
      }
      return Integer.parseInt(str);
    }
    catch (NumberFormatException e) {}
    return defVal;
  }
  
  public static float parseFloat(String str, float defVal)
  {
    try
    {
      if (str == null) {
        return defVal;
      }
      return Float.parseFloat(str);
    }
    catch (NumberFormatException e) {}
    return defVal;
  }
  
  public static String[] tokenize(String str, String delim)
  {
    StringTokenizer tok = new StringTokenizer(str, delim);
    List list = new ArrayList();
    while (tok.hasMoreTokens())
    {
      String token = tok.nextToken();
      list.add(token);
    }
    String[] strs = (String[])list.toArray(new String[list.size()]);
    return strs;
  }
  
  public static DisplayMode getDesktopDisplayMode()
  {
    return desktopDisplayMode;
  }
  
  public static DisplayMode[] getFullscreenDisplayModes()
  {
    try
    {
      DisplayMode[] modes = Display.getAvailableDisplayModes();
      List list = new ArrayList();
      for (int i = 0; i < modes.length; i++)
      {
        DisplayMode dm = modes[i];
        if (desktopDisplayMode != null)
        {
          if (dm.getBitsPerPixel() == desktopDisplayMode.getBitsPerPixel()) {
            if (dm.getFrequency() != desktopDisplayMode.getFrequency()) {}
          }
        }
        else {
          list.add(dm);
        }
      }
      DisplayMode[] fsModes = (DisplayMode[])list.toArray(new DisplayMode[list.size()]);
      
      Comparator comp = new Comparator()
      {
        public int compare(Object o1, Object o2)
        {
          DisplayMode dm1 = (DisplayMode)o1;
          DisplayMode dm2 = (DisplayMode)o2;
          if (dm1.getWidth() != dm2.getWidth()) {
            return dm2.getWidth() - dm1.getWidth();
          }
          if (dm1.getHeight() != dm2.getHeight()) {
            return dm2.getHeight() - dm1.getHeight();
          }
          return 0;
        }
      };
      Arrays.sort(fsModes, comp);
      
      return fsModes;
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
    return tmp122_119;
  }
  
  public static String[] getFullscreenModes()
  {
    DisplayMode[] modes = getFullscreenDisplayModes();
    String[] names = new String[modes.length];
    for (int i = 0; i < modes.length; i++)
    {
      DisplayMode mode = modes[i];
      String name = "" + mode.getWidth() + "x" + mode.getHeight();
      names[i] = name;
    }
    return names;
  }
  
  public static DisplayMode getDisplayMode(Dimension dim)
    throws LWJGLException
  {
    DisplayMode[] modes = Display.getAvailableDisplayModes();
    for (int i = 0; i < modes.length; i++)
    {
      DisplayMode dm = modes[i];
      if (dm.getWidth() == dim.width) {
        if (dm.getHeight() == dim.height) {
          if (desktopDisplayMode != null)
          {
            if (dm.getBitsPerPixel() == desktopDisplayMode.getBitsPerPixel()) {
              if (dm.getFrequency() != desktopDisplayMode.getFrequency()) {}
            }
          }
          else {
            return dm;
          }
        }
      }
    }
    return desktopDisplayMode;
  }
  
  public static boolean isAnimatedTerrain()
  {
    return gameSettings.ofAnimatedTerrain;
  }
  
  public static boolean isAnimatedTextures()
  {
    return gameSettings.ofAnimatedTextures;
  }
  
  public static boolean isSwampColors()
  {
    return gameSettings.ofSwampColors;
  }
  
  public static boolean isRandomMobs()
  {
    return gameSettings.ofRandomMobs;
  }
  
  public static void checkGlError(String loc)
  {
    int i = GL11.glGetError();
    if (i != 0)
    {
      String text = GLU.gluErrorString(i);
      error("OpenGlError: " + i + " (" + text + "), at: " + loc);
    }
  }
  
  public static boolean isSmoothBiomes()
  {
    return gameSettings.ofSmoothBiomes;
  }
  
  public static boolean isCustomColors()
  {
    return gameSettings.ofCustomColors;
  }
  
  public static boolean isCustomSky()
  {
    return gameSettings.ofCustomSky;
  }
  
  public static boolean isCustomFonts()
  {
    return gameSettings.ofCustomFonts;
  }
  
  public static boolean isShowCapes()
  {
    return gameSettings.ofShowCapes;
  }
  
  public static boolean isConnectedTextures()
  {
    return gameSettings.ofConnectedTextures != 3;
  }
  
  public static boolean isNaturalTextures()
  {
    return gameSettings.ofNaturalTextures;
  }
  
  public static boolean isConnectedTexturesFancy()
  {
    return gameSettings.ofConnectedTextures == 2;
  }
  
  public static boolean isFastRender()
  {
    return gameSettings.ofFastRender;
  }
  
  public static boolean isTranslucentBlocksFancy()
  {
    if (gameSettings.ofTranslucentBlocks == 0) {
      return gameSettings.i;
    }
    return gameSettings.ofTranslucentBlocks == 2;
  }
  
  public static boolean isShaders()
  {
    return Shaders.shaderPackLoaded;
  }
  
  public static String[] readLines(File file)
    throws IOException
  {
    List list = new ArrayList();
    
    FileInputStream fis = new FileInputStream(file);
    InputStreamReader isr = new InputStreamReader(fis, "ASCII");
    BufferedReader br = new BufferedReader(isr);
    for (;;)
    {
      String line = br.readLine();
      if (line == null) {
        break;
      }
      list.add(line);
    }
    String[] lines = (String[])list.toArray(new String[list.size()]);
    
    return lines;
  }
  
  public static String readFile(File file)
    throws IOException
  {
    FileInputStream fin = new FileInputStream(file);
    return readInputStream(fin, "ASCII");
  }
  
  public static String readInputStream(InputStream in)
    throws IOException
  {
    return readInputStream(in, "ASCII");
  }
  
  public static String readInputStream(InputStream in, String encoding)
    throws IOException
  {
    InputStreamReader inr = new InputStreamReader(in, encoding);
    BufferedReader br = new BufferedReader(inr);
    StringBuffer sb = new StringBuffer();
    for (;;)
    {
      String line = br.readLine();
      if (line == null) {
        break;
      }
      sb.append(line);
      sb.append("\n");
    }
    return sb.toString();
  }
  
  public static byte[] readAll(InputStream is)
    throws IOException
  {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    byte[] buf = new byte['Ѐ'];
    for (;;)
    {
      int len = is.read(buf);
      if (len < 0) {
        break;
      }
      baos.write(buf, 0, len);
    }
    is.close();
    
    byte[] bytes = baos.toByteArray();
    
    return bytes;
  }
  
  public static avh getGameSettings()
  {
    return gameSettings;
  }
  
  public static String getNewRelease()
  {
    return newRelease;
  }
  
  public static void setNewRelease(String newRelease)
  {
    newRelease = newRelease;
  }
  
  public static int compareRelease(String rel1, String rel2)
  {
    String[] rels1 = splitRelease(rel1);
    String[] rels2 = splitRelease(rel2);
    
    String branch1 = rels1[0];
    String branch2 = rels2[0];
    if (!branch1.equals(branch2)) {
      return branch1.compareTo(branch2);
    }
    int rev1 = parseInt(rels1[1], -1);
    int rev2 = parseInt(rels2[1], -1);
    if (rev1 != rev2) {
      return rev1 - rev2;
    }
    String suf1 = rels1[2];
    String suf2 = rels2[2];
    return suf1.compareTo(suf2);
  }
  
  private static String[] splitRelease(String relStr)
  {
    if ((relStr == null) || (relStr.length() <= 0)) {
      return new String[] { "", "", "" };
    }
    String branch = relStr.substring(0, 1);
    if (relStr.length() <= 1) {
      return new String[] { branch, "", "" };
    }
    int pos = 1;
    while ((pos < relStr.length()) && (Character.isDigit(relStr.charAt(pos)))) {
      pos++;
    }
    String revision = relStr.substring(1, pos);
    if (pos >= relStr.length()) {
      return new String[] { branch, revision, "" };
    }
    String suffix = relStr.substring(pos);
    return new String[] { branch, revision, suffix };
  }
  
  public static int intHash(int x)
  {
    x = x ^ 0x3D ^ x >> 16;
    x += (x << 3);
    x ^= x >> 4;
    x *= 668265261;
    x ^= x >> 15;
    return x;
  }
  
  public static int getRandom(cj blockPos, int face)
  {
    int rand = intHash(face + 37);
    rand = intHash(rand + blockPos.n());
    rand = intHash(rand + blockPos.p());
    rand = intHash(rand + blockPos.o());
    
    return rand;
  }
  
  public static le getWorldServer()
  {
    if (minecraft == null) {
      return null;
    }
    adm world = minecraft.f;
    if (world == null) {
      return null;
    }
    if (!minecraft.E()) {
      return null;
    }
    bpo is = minecraft.G();
    if (is == null) {
      return null;
    }
    anm wp = world.t;
    if (wp == null) {
      return null;
    }
    int wd = wp.q();
    try
    {
      return is.a(wd);
    }
    catch (NullPointerException e) {}
    return null;
  }
  
  public static int getAvailableProcessors()
  {
    return availableProcessors;
  }
  
  public static void updateAvailableProcessors()
  {
    availableProcessors = Runtime.getRuntime().availableProcessors();
  }
  
  public static boolean isSingleProcessor()
  {
    return getAvailableProcessors() <= 1;
  }
  
  public static boolean isSmoothWorld()
  {
    return gameSettings.ofSmoothWorld;
  }
  
  public static boolean isLazyChunkLoading()
  {
    if (!isSingleProcessor()) {
      return false;
    }
    return gameSettings.ofLazyChunkLoading;
  }
  
  public static int getChunkViewDistance()
  {
    if (gameSettings == null) {
      return 10;
    }
    int chunkDistance = gameSettings.c;
    
    return chunkDistance;
  }
  
  public static boolean equals(Object o1, Object o2)
  {
    if (o1 == o2) {
      return true;
    }
    if (o1 == null) {
      return false;
    }
    return o1.equals(o2);
  }
  
  public static void checkDisplaySettings()
  {
    int samples = getAntialiasingLevel();
    if (samples > 0)
    {
      DisplayMode displayMode = Display.getDisplayMode();
      dbg("FSAA Samples: " + samples);
      try
      {
        Display.destroy();
        
        Display.setDisplayMode(displayMode);
        
        Display.create(new PixelFormat().withDepthBits(24).withSamples(samples));
        
        Display.setResizable(false);
        Display.setResizable(true);
      }
      catch (LWJGLException e)
      {
        warn("Error setting FSAA: " + samples + "x");
        e.printStackTrace();
        try
        {
          Display.setDisplayMode(displayMode);
          
          Display.create(new PixelFormat().withDepthBits(24));
          
          Display.setResizable(false);
          Display.setResizable(true);
        }
        catch (LWJGLException e2)
        {
          e2.printStackTrace();
          try
          {
            Display.setDisplayMode(displayMode);
            
            Display.create();
            
            Display.setResizable(false);
            Display.setResizable(true);
          }
          catch (LWJGLException e3)
          {
            e3.printStackTrace();
          }
        }
      }
      if ((!ave.a) && (getDefaultResourcePack() != null))
      {
        InputStream var2 = null;
        InputStream var3 = null;
        try
        {
          var2 = getDefaultResourcePack().c(new jy("icons/icon_16x16.png"));
          var3 = getDefaultResourcePack().c(new jy("icons/icon_32x32.png"));
          if ((var2 != null) && (var3 != null)) {
            Display.setIcon(new ByteBuffer[] { readIconImage(var2), readIconImage(var3) });
          }
        }
        catch (IOException var8)
        {
          dbg("Error setting window icon: " + var8.getClass().getName() + ": " + var8.getMessage());
        }
        finally
        {
          IOUtils.closeQuietly(var2);
          IOUtils.closeQuietly(var3);
        }
      }
    }
  }
  
  private static ByteBuffer readIconImage(InputStream is)
    throws IOException
  {
    BufferedImage var2 = ImageIO.read(is);
    int[] var3 = var2.getRGB(0, 0, var2.getWidth(), var2.getHeight(), (int[])null, 0, var2.getWidth());
    ByteBuffer var4 = ByteBuffer.allocate(4 * var3.length);
    int[] var5 = var3;
    int var6 = var3.length;
    for (int var7 = 0; var7 < var6; var7++)
    {
      int var8 = var5[var7];
      var4.putInt(var8 << 8 | var8 >> 24 & 0xFF);
    }
    var4.flip();
    return var4;
  }
  
  public static void checkDisplayMode()
  {
    try
    {
      if (minecraft.K())
      {
        if (fullscreenModeChecked) {
          return;
        }
        fullscreenModeChecked = true;
        desktopModeChecked = false;
        
        DisplayMode mode = Display.getDisplayMode();
        
        Dimension dim = getFullscreenDimension();
        if (dim == null) {
          return;
        }
        if ((mode.getWidth() == dim.width) && (mode.getHeight() == dim.height)) {
          return;
        }
        DisplayMode newMode = getDisplayMode(dim);
        if (newMode == null) {
          return;
        }
        Display.setDisplayMode(newMode);
        
        minecraft.d = Display.getDisplayMode().getWidth();
        minecraft.e = Display.getDisplayMode().getHeight();
        if (minecraft.d <= 0) {
          minecraft.d = 1;
        }
        if (minecraft.e <= 0) {
          minecraft.e = 1;
        }
        if (minecraft.m != null)
        {
          avr sr = new avr(minecraft);
          int sw = sr.a();
          int sh = sr.b();
          minecraft.m.a(minecraft, sw, sh);
        }
        minecraft.n = new avi(minecraft);
        
        updateFramebufferSize();
        
        Display.setFullscreen(true);
        
        minecraft.t.updateVSync();
        
        bfl.w();
      }
      else
      {
        if (desktopModeChecked) {
          return;
        }
        desktopModeChecked = true;
        fullscreenModeChecked = false;
        
        minecraft.t.updateVSync();
        Display.update();
        bfl.w();
        
        Display.setResizable(false);
        Display.setResizable(true);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  public static void updateFramebufferSize()
  {
    minecraft.b().a(minecraft.d, minecraft.e);
    if (minecraft.o != null) {
      minecraft.o.a(minecraft.d, minecraft.e);
    }
  }
  
  public static Object[] addObjectToArray(Object[] arr, Object obj)
  {
    if (arr == null) {
      throw new NullPointerException("The given array is NULL");
    }
    int arrLen = arr.length;
    int newLen = arrLen + 1;
    
    Object[] newArr = (Object[])Array.newInstance(arr.getClass().getComponentType(), newLen);
    
    System.arraycopy(arr, 0, newArr, 0, arrLen);
    
    newArr[arrLen] = obj;
    
    return newArr;
  }
  
  public static Object[] addObjectsToArray(Object[] arr, Object[] objs)
  {
    if (arr == null) {
      throw new NullPointerException("The given array is NULL");
    }
    if (objs.length == 0) {
      return arr;
    }
    int arrLen = arr.length;
    int newLen = arrLen + objs.length;
    
    Object[] newArr = (Object[])Array.newInstance(arr.getClass().getComponentType(), newLen);
    
    System.arraycopy(arr, 0, newArr, 0, arrLen);
    
    System.arraycopy(objs, 0, newArr, arrLen, objs.length);
    
    return newArr;
  }
  
  public static boolean isCustomItems()
  {
    return gameSettings.ofCustomItems;
  }
  
  private static long lastActionTime = System.currentTimeMillis();
  
  public static boolean isActing()
  {
    boolean acting = isActingNow();
    long timeNowMs = System.currentTimeMillis();
    if (acting)
    {
      lastActionTime = timeNowMs;
      return true;
    }
    return timeNowMs - lastActionTime < 100L;
  }
  
  private static boolean isActingNow()
  {
    if (Mouse.isButtonDown(0)) {
      return true;
    }
    if (Mouse.isButtonDown(1)) {
      return true;
    }
    return false;
  }
  
  public static void drawFps()
  {
    int fps = ave.ai();
    String updates = getUpdates(minecraft.C);
    int renderersActive = minecraft.g.getCountActiveRenderers();
    int entities = minecraft.g.getCountEntitiesRendered();
    int tileEntities = minecraft.g.getCountTileEntitiesRendered();
    
    String fpsStr = "" + fps + " fps, C: " + renderersActive + ", E: " + entities + "+" + tileEntities + ", U: " + updates;
    
    minecraft.k.a(fpsStr, 2, 2, -2039584);
  }
  
  private static String getUpdates(String str)
  {
    int pos1 = str.indexOf('(');
    if (pos1 < 0) {
      return "";
    }
    int pos2 = str.indexOf(' ', pos1);
    if (pos2 < 0) {
      return "";
    }
    return str.substring(pos1 + 1, pos2);
  }
  
  public static int getBitsOs()
  {
    String progFiles86 = System.getenv("ProgramFiles(X86)");
    if (progFiles86 != null) {
      return 64;
    }
    return 32;
  }
  
  public static int getBitsJre()
  {
    String[] propNames = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
    for (int i = 0; i < propNames.length; i++)
    {
      String propName = propNames[i];
      String propVal = System.getProperty(propName);
      if (propVal != null) {
        if (propVal.contains("64")) {
          return 64;
        }
      }
    }
    return 32;
  }
  
  public static boolean isNotify64BitJava()
  {
    return notify64BitJava;
  }
  
  public static void setNotify64BitJava(boolean flag)
  {
    notify64BitJava = flag;
  }
  
  public static boolean isConnectedModels()
  {
    return false;
  }
  
  public static String fillLeft(String s, int len, char fillChar)
  {
    if (s == null) {
      s = "";
    }
    if (s.length() >= len) {
      return s;
    }
    StringBuffer buf = new StringBuffer(s);
    while (buf.length() < len - s.length()) {
      buf.append(fillChar);
    }
    return buf.toString() + s;
  }
  
  public static String fillRight(String s, int len, char fillChar)
  {
    if (s == null) {
      s = "";
    }
    if (s.length() >= len) {
      return s;
    }
    StringBuffer buf = new StringBuffer(s);
    while (buf.length() < len) {
      buf.append(fillChar);
    }
    return buf.toString();
  }
  
  public static void showGuiMessage(String line1, String line2)
  {
    GuiMessage gui = new GuiMessage(minecraft.m, line1, line2);
    minecraft.a(gui);
  }
}
