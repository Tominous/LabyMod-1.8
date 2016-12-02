package shadersmod.client;

import Config;
import ave;
import avh;
import avn;
import avs;
import axu;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Iterator;
import java.util.List;
import org.lwjgl.Sys;

public class GuiShaders
  extends axu
{
  protected axu parentGui;
  private int updateTimer = -1;
  private GuiSlotShaders shaderList;
  private static final String ANTIALIASING = "Antialiasing: ";
  private static final String NORMAL_MAP = "Normap Map: ";
  private static final String SPECULAR_MAP = "Specular Map: ";
  private static final String RENDER_RES_MUL = "Render Quality: ";
  private static final String SHADOW_RES_MUL = "Shadow Quality: ";
  private static final String HAND_DEPTH = "Hand Depth: ";
  private static final String CLOUD_SHADOW = "Cloud Shadow: ";
  private static final String OLD_LIGHTING = "Classic Lighting: ";
  private static float[] QUALITY_MULTIPLIERS = { 0.5F, 0.70710677F, 1.0F, 1.4142135F, 2.0F };
  private static String[] QUALITY_MULTIPLIER_NAMES = { "0.5x", "0.7x", "1x", "1.5x", "2x" };
  private static float[] HAND_DEPTH_VALUES = { 0.0625F, 0.125F, 0.25F, 0.5F, 1.0F };
  private static String[] HAND_DEPTH_NAMES = { "0.5x", "1x", "2x", "4x", "8x" };
  public static final int EnumOS_UNKNOWN = 0;
  public static final int EnumOS_WINDOWS = 1;
  public static final int EnumOS_OSX = 2;
  public static final int EnumOS_SOLARIS = 3;
  public static final int EnumOS_LINUX = 4;
  
  public GuiShaders(axu par1GuiScreen, avh par2GameSettings)
  {
    parentGui = par1GuiScreen;
  }
  
  private static String toStringOnOff(boolean value)
  {
    String on = "ON";
    String off = "OFF";
    return value ? on : off;
  }
  
  private static String toStringAa(int value)
  {
    if (value == 2) {
      return "FXAA 2x";
    }
    if (value == 4) {
      return "FXAA 4x";
    }
    return "OFF";
  }
  
  private static String toStringValue(float val, float[] values, String[] names)
  {
    int index = getValueIndex(val, values);
    
    return names[index];
  }
  
  private static int getValueIndex(float val, float[] values)
  {
    for (int i = 0; i < values.length; i++)
    {
      float value = values[i];
      if (value >= val) {
        return i;
      }
    }
    return values.length - 1;
  }
  
  private static String toStringQuality(float val)
  {
    return toStringValue(val, QUALITY_MULTIPLIERS, QUALITY_MULTIPLIER_NAMES);
  }
  
  private static String toStringHandDepth(float val)
  {
    return toStringValue(val, HAND_DEPTH_VALUES, HAND_DEPTH_NAMES);
  }
  
  public void b()
  {
    if (Shaders.shadersConfig == null) {
      Shaders.loadConfig();
    }
    int baseY = 30;
    int stepY = 20;
    int btnX = l - 130;
    int btnWidth = 120;
    int btnHeight = 20;
    
    int shaderListWidth = l - btnWidth - 20;
    shaderList = new GuiSlotShaders(this, shaderListWidth, m, baseY, m - 50, 16);
    shaderList.d(7, 8);
    
    n.add(new avs(20, btnX, 0 * stepY + baseY, btnWidth, btnHeight, "Antialiasing: " + toStringAa(Shaders.configAntialiasingLevel)));
    n.add(new avs(17, btnX, 1 * stepY + baseY, btnWidth, btnHeight, "Normap Map: " + toStringOnOff(Shaders.configNormalMap)));
    n.add(new avs(18, btnX, 2 * stepY + baseY, btnWidth, btnHeight, "Specular Map: " + toStringOnOff(Shaders.configSpecularMap)));
    n.add(new avs(15, btnX, 3 * stepY + baseY, btnWidth, btnHeight, "Render Quality: " + toStringQuality(Shaders.configRenderResMul)));
    n.add(new avs(16, btnX, 4 * stepY + baseY, btnWidth, btnHeight, "Shadow Quality: " + toStringQuality(Shaders.configShadowResMul)));
    n.add(new avs(10, btnX, 5 * stepY + baseY, btnWidth, btnHeight, "Hand Depth: " + toStringHandDepth(Shaders.configHandDepthMul)));
    n.add(new avs(9, btnX, 6 * stepY + baseY, btnWidth, btnHeight, "Cloud Shadow: " + toStringOnOff(Shaders.configCloudShadow)));
    
    n.add(new avs(19, btnX, 7 * stepY + baseY, btnWidth, btnHeight, "Classic Lighting: " + toStringOnOff(Shaders.configOldLighting)));
    
    n.add(new avs(6, btnX, m - 25, btnWidth, btnHeight, "Done"));
    int btnFolderWidth = 160;
    n.add(new avs(5, shaderListWidth / 2 - btnFolderWidth / 2, m - 25, btnFolderWidth, btnHeight, "Open shader packs folder"));
    
    updateButtons();
  }
  
  public void updateButtons()
  {
    boolean shaderActive = Config.isShaders();
    for (Iterator it = n.iterator(); it.hasNext();)
    {
      avs button = (avs)it.next();
      if ((k > 8) && 
      
        (k != 20)) {
        l = shaderActive;
      }
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    shaderList.p();
  }
  
  protected void a(avs button)
  {
    if (l) {
      switch (k)
      {
      case 4: 
        Shaders.configTweakBlockDamage = !Shaders.configTweakBlockDamage;
        
        j = ("tweakBlockDamage: " + toStringOnOff(Shaders.configTweakBlockDamage));
        break;
      case 9: 
        Shaders.configCloudShadow = !Shaders.configCloudShadow;
        j = ("Cloud Shadow: " + toStringOnOff(Shaders.configCloudShadow));
        break;
      case 10: 
        float val = Shaders.configHandDepthMul;
        float[] values = HAND_DEPTH_VALUES;
        String[] names = HAND_DEPTH_NAMES;
        int index = getValueIndex(val, values);
        if (r())
        {
          index--;
          if (index < 0) {
            index = values.length - 1;
          }
        }
        else
        {
          index++;
          if (index >= values.length) {
            index = 0;
          }
        }
        Shaders.configHandDepthMul = values[index];
        j = ("Hand Depth: " + names[index]);
        break;
      case 15: 
        float val = Shaders.configRenderResMul;
        float[] values = QUALITY_MULTIPLIERS;
        String[] names = QUALITY_MULTIPLIER_NAMES;
        int index = getValueIndex(val, values);
        if (r())
        {
          index--;
          if (index < 0) {
            index = values.length - 1;
          }
        }
        else
        {
          index++;
          if (index >= values.length) {
            index = 0;
          }
        }
        Shaders.configRenderResMul = values[index];
        j = ("Render Quality: " + names[index]);
        Shaders.scheduleResize();
        break;
      case 16: 
        float val = Shaders.configShadowResMul;
        float[] values = QUALITY_MULTIPLIERS;
        String[] names = QUALITY_MULTIPLIER_NAMES;
        int index = getValueIndex(val, values);
        if (r())
        {
          index--;
          if (index < 0) {
            index = values.length - 1;
          }
        }
        else
        {
          index++;
          if (index >= values.length) {
            index = 0;
          }
        }
        Shaders.configShadowResMul = values[index];
        j = ("Shadow Quality: " + names[index]);
        Shaders.scheduleResizeShadow();
        break;
      case 17: 
        Shaders.configNormalMap = !Shaders.configNormalMap;
        
        j = ("Normap Map: " + toStringOnOff(Shaders.configNormalMap));
        j.B();
        break;
      case 18: 
        Shaders.configSpecularMap = !Shaders.configSpecularMap;
        
        j = ("Specular Map: " + toStringOnOff(Shaders.configSpecularMap));
        j.B();
        break;
      case 19: 
        Shaders.configOldLighting = !Shaders.configOldLighting;
        
        j = ("Classic Lighting: " + toStringOnOff(Shaders.configOldLighting));
        Shaders.updateBlockLightLevel();
        
        j.B();
        break;
      case 20: 
        Shaders.nextAntialiasingLevel();
        
        j = ("Antialiasing: " + toStringAa(Shaders.configAntialiasingLevel));
        Shaders.uninit();
        break;
      case 11: 
        Shaders.configTexMinFilB = (Shaders.configTexMinFilB + 1) % 3;
        Shaders.configTexMinFilN = Shaders.configTexMinFilS = Shaders.configTexMinFilB;
        j = ("Tex Min: " + Shaders.texMinFilDesc[Shaders.configTexMinFilB]);
        ShadersTex.updateTextureMinMagFilter();
        break;
      case 12: 
        Shaders.configTexMagFilN = (Shaders.configTexMagFilN + 1) % 2;
        j = ("Tex_n Mag: " + Shaders.texMagFilDesc[Shaders.configTexMagFilN]);
        ShadersTex.updateTextureMinMagFilter();
        break;
      case 13: 
        Shaders.configTexMagFilS = (Shaders.configTexMagFilS + 1) % 2;
        j = ("Tex_s Mag: " + Shaders.texMagFilDesc[Shaders.configTexMagFilS]);
        ShadersTex.updateTextureMinMagFilter();
        break;
      case 14: 
        Shaders.configShadowClipFrustrum = !Shaders.configShadowClipFrustrum;
        j = ("ShadowClipFrustrum: " + toStringOnOff(Shaders.configShadowClipFrustrum));
        ShadersTex.updateTextureMinMagFilter();
        break;
      case 5: 
        switch (getOSType())
        {
        case 2: 
          try
          {
            Runtime.getRuntime().exec(new String[] { "/usr/bin/open", Shaders.shaderpacksdir.getAbsolutePath() });
            return;
          }
          catch (IOException var7)
          {
            var7.printStackTrace();
          }
        case 1: 
          String var2 = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { Shaders.shaderpacksdir.getAbsolutePath() });
          try
          {
            Runtime.getRuntime().exec(var2);
            return;
          }
          catch (IOException var6)
          {
            var6.printStackTrace();
          }
        }
        boolean var8 = false;
        try
        {
          Class var3 = Class.forName("java.awt.Desktop");
          Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
          var3.getMethod("browse", new Class[] { URI.class }).invoke(var4, new Object[] { new File(j.v, Shaders.shaderpacksdirname).toURI() });
        }
        catch (Throwable var5)
        {
          var5.printStackTrace();
          var8 = true;
        }
        if (var8)
        {
          System.out.println("Opening via system class!");
          Sys.openURL("file://" + Shaders.shaderpacksdir.getAbsolutePath());
        }
        break;
      case 6: 
        File confshader = new File(Shaders.shadersdir, "current.cfg");
        try
        {
          Shaders.storeConfig();
        }
        catch (Exception ex) {}
        j.a(parentGui);
        break;
      case 7: 
      case 8: 
      default: 
        shaderList.a(button);
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    shaderList.a(mouseX, mouseY, partialTicks);
    if (updateTimer <= 0)
    {
      shaderList.updateList();
      updateTimer += 20;
    }
    a(q, "Shaders ", l / 2, 15, 16777215);
    
    String info = "OpenGL: " + Shaders.glVersionString + ", " + Shaders.glVendorString + ", " + Shaders.glRendererString;
    int infoWidth = q.a(info);
    if (infoWidth < l - 5) {
      a(q, info, l / 2, m - 40, 8421504);
    } else {
      c(q, info, 5, m - 40, 8421504);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
  
  public void e()
  {
    super.e();
    updateTimer -= 1;
  }
  
  public ave getMc()
  {
    return j;
  }
  
  public void drawCenteredString(String text, int x, int y, int color)
  {
    a(q, text, x, y, color);
  }
  
  public static int getOSType()
  {
    String osName = System.getProperty("os.name").toLowerCase();
    if (osName.contains("win")) {
      return 1;
    }
    if (osName.contains("mac")) {
      return 2;
    }
    if (osName.contains("solaris")) {
      return 3;
    }
    if (osName.contains("sunos")) {
      return 3;
    }
    if (osName.contains("linux")) {
      return 4;
    }
    if (osName.contains("unix")) {
      return 4;
    }
    return 0;
  }
}
