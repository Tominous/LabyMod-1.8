import java.util.List;
import shadersmod.client.GuiShaders;

public class ayb
  extends axu
{
  private axu f;
  protected String a = "Video Settings";
  private avh g;
  private boolean is64bit;
  private static avh.a[] i = { avh.a.l, avh.a.f, avh.a.m, avh.a.i, avh.a.AO_LEVEL, avh.a.g, avh.a.n, avh.a.x, avh.a.d, avh.a.P, avh.a.FOG_FANCY, avh.a.FOG_START };
  private static final String __OBFID = "CL_00000718";
  private int lastMouseX = 0;
  private int lastMouseY = 0;
  private long mouseStillTime = 0L;
  
  public ayb(axu par1GuiScreen, avh par2GameSettings)
  {
    this.f = par1GuiScreen;
    this.g = par2GameSettings;
  }
  
  public void b()
  {
    this.a = bnq.a("options.videoTitle", new Object[0]);
    this.n.clear();
    
    this.is64bit = false;
    String[] var1 = { "sun.arch.data.model", "com.ibm.vm.bitmode", "os.arch" };
    String[] var2 = var1;
    int var3 = var1.length;
    for (int var4 = 0; var4 < var3; var4++)
    {
      String var5 = var2[var4];
      String var6 = System.getProperty(var5);
      if ((var6 != null) && (var6.contains("64")))
      {
        this.is64bit = true;
        break;
      }
    }
    int var8 = 0;
    var3 = this.is64bit ? 0 : -15;
    avh.a[] var9 = i;
    int var10 = var9.length;
    
    int var11 = 0;
    for (var11 = 0; var11 < var10; var11++)
    {
      avh.a var7 = var9[var11];
      if (var7 != null)
      {
        int x = this.l / 2 - 155 + var11 % 2 * 160;
        int y = this.m / 6 + 21 * (var11 / 2) - 12;
        if (var7.a()) {
          this.n.add(new awj(var7.c(), x, y, var7));
        } else {
          this.n.add(new awe(var7.c(), x, y, var7, this.g.c(var7)));
        }
      }
    }
    int y = this.m / 6 + 21 * (var11 / 2) - 12;
    int x = 0;
    
    x = this.l / 2 - 155 + 0;
    this.n.add(new awe(231, x, y, "Shaders..."));
    
    x = this.l / 2 - 155 + 160;
    this.n.add(new awe(202, x, y, "Quality..."));
    
    y += 21;
    
    x = this.l / 2 - 155 + 0;
    this.n.add(new awe(201, x, y, "Details..."));
    
    x = this.l / 2 - 155 + 160;
    this.n.add(new awe(212, x, y, "Performance..."));
    
    y += 21;
    
    x = this.l / 2 - 155 + 0;
    this.n.add(new awe(211, x, y, "Animations..."));
    
    x = this.l / 2 - 155 + 160;
    this.n.add(new awe(222, x, y, "Other..."));
    
    y += 21;
    
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs par1GuiButton)
  {
    if (par1GuiButton.l)
    {
      int var2 = this.g.aK;
      if ((par1GuiButton.k < 200) && ((par1GuiButton instanceof awe)))
      {
        this.g.a(((awe)par1GuiButton).c(), 1);
        par1GuiButton.j = this.g.c(avh.a.a(par1GuiButton.k));
      }
      if (par1GuiButton.k == 200)
      {
        this.j.t.b();
        this.j.a(this.f);
      }
      if (this.g.aK != var2)
      {
        avr var3 = new avr(this.j);
        int var4 = var3.a();
        int var5 = var3.b();
        a(this.j, var4, var5);
      }
      if (par1GuiButton.k == 201)
      {
        this.j.t.b();
        GuiDetailSettingsOF scr = new GuiDetailSettingsOF(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == 202)
      {
        this.j.t.b();
        GuiQualitySettingsOF scr = new GuiQualitySettingsOF(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == 211)
      {
        this.j.t.b();
        GuiAnimationSettingsOF scr = new GuiAnimationSettingsOF(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == 212)
      {
        this.j.t.b();
        GuiPerformanceSettingsOF scr = new GuiPerformanceSettingsOF(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == 222)
      {
        this.j.t.b();
        GuiOtherSettingsOF scr = new GuiOtherSettingsOF(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == 231)
      {
        if ((Config.isAntialiasing()) || (Config.isAntialiasingConfigured()))
        {
          Config.showGuiMessage("Shaders are not compatible with Antialiasing.", "Please set Quality -> Antialiasing to OFF and restart the game.");
          return;
        }
        if (Config.isAnisotropicFiltering())
        {
          Config.showGuiMessage("Shaders are not compatible with Anisotropic Filtering.", "Please set Quality -> Anisotropic Filtering to OFF.");
          return;
        }
        if (Config.isFastRender())
        {
          Config.showGuiMessage("Shaders are not compatible with Fast Render.", "Please set Performance -> Fast Render to OFF.");
          return;
        }
        this.j.t.b();
        GuiShaders scr = new GuiShaders(this, this.g);
        this.j.a(scr);
      }
      if (par1GuiButton.k == avh.a.AO_LEVEL.ordinal()) {}
    }
  }
  
  public void a(int x, int y, float z)
  {
    c();
    a(this.q, this.a, this.l / 2, 15, 16777215);
    
    String ver = Config.getVersion();
    String ed = "HD_U";
    if (ed.equals("HD")) {
      ver = "OptiFine HD G7";
    }
    if (ed.equals("HD_U")) {
      ver = "OptiFine HD G7 Ultra";
    }
    if (ed.equals("L")) {
      ver = "OptiFine G7 Light";
    }
    c(this.q, ver, 2, this.m - 10, 8421504);
    
    String verMc = "Minecraft 1.8.8";
    int lenMc = this.q.a(verMc);
    c(this.q, verMc, this.l - lenMc - 2, this.m - 10, 8421504);
    if ((!this.is64bit) && (this.g.c > 8)) {}
    super.a(x, y, z);
    if ((Math.abs(x - this.lastMouseX) > 5) || (Math.abs(y - this.lastMouseY) > 5))
    {
      this.lastMouseX = x;
      this.lastMouseY = y;
      this.mouseStillTime = System.currentTimeMillis();
      return;
    }
    int activateDelay = 700;
    if (System.currentTimeMillis() < this.mouseStillTime + activateDelay) {
      return;
    }
    int x1 = this.l / 2 - 150;
    int y1 = this.m / 6 - 7;
    if (y <= y1 + 98) {
      y1 += 105;
    }
    int x2 = x1 + 150 + 150;
    int y2 = y1 + 84 + 10;
    
    avs btn = getSelectedButton(x, y);
    if (btn != null)
    {
      String s = getButtonName(btn.j);
      String[] lines = getTooltipLines(s);
      if (lines == null) {
        return;
      }
      a(x1, y1, x2, y2, -536870912, -536870912);
      for (int i = 0; i < lines.length; i++)
      {
        String line = lines[i];
        this.q.a(line, x1 + 5, y1 + 5 + i * 11, 14540253);
      }
    }
  }
  
  private String[] getTooltipLines(String btnName)
  {
    if (btnName.equals("Graphics")) {
      return new String[] { "Visual quality", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Changes the appearance of clouds, leaves, water,", "shadows and grass sides." };
    }
    if (btnName.equals("Render Distance")) {
      return new String[] { "Visible distance", "  2 Tiny - 32m (fastest)", "  4 Short - 64m (faster)", "  8 Normal - 128m", "  16 Far - 256m (slower)", "  32 Extreme - 512m (slowest!)", "The Extreme view distance is very resource demanding!", "Values over 16 Far are only effective in local worlds." };
    }
    if (btnName.equals("Smooth Lighting")) {
      return new String[] { "Smooth lighting", "  OFF - no smooth lighting (faster)", "  Minimum - simple smooth lighting (slower)", "  Maximum - complex smooth lighting (slowest)" };
    }
    if (btnName.equals("Smooth Lighting Level")) {
      return new String[] { "Smooth lighting level", "  OFF - no shadows", "  50% - light shadows", "  100% - dark shadows" };
    }
    if (btnName.equals("Max Framerate")) {
      return new String[] { "Max framerate", "  VSync - limit to monitor framerate (60, 30, 20)", "  5-255 - variable", "  Unlimited - no limit (fastest)", "The framerate limit decreases the FPS even if", "the limit value is not reached." };
    }
    if (btnName.equals("View Bobbing")) {
      return new String[] { "More realistic movement.", "When using mipmaps set it to OFF for best results." };
    }
    if (btnName.equals("GUI Scale")) {
      return new String[] { "GUI Scale", "Smaller GUI might be faster" };
    }
    if (btnName.equals("Server Textures")) {
      return new String[] { "Server textures", "Use the resource pack recommended by the server" };
    }
    if (btnName.equals("Advanced OpenGL")) {
      return new String[] { "Detect and render only visible geometry", "  OFF - all geometry is rendered (slower)", "  Fast - only visible geometry is rendered (fastest)", "  Fancy - conservative, avoids visual artifacts (faster)", "The option is available only if it is supported by the ", "graphic card." };
    }
    if (btnName.equals("Fog")) {
      return new String[] { "Fog type", "  Fast - faster fog", "  Fancy - slower fog, looks better", "  OFF - no fog, fastest", "The fancy fog is available only if it is supported by the ", "graphic card." };
    }
    if (btnName.equals("Fog Start")) {
      return new String[] { "Fog start", "  0.2 - the fog starts near the player", "  0.8 - the fog starts far from the player", "This option usually does not affect the performance." };
    }
    if (btnName.equals("Brightness")) {
      return new String[] { "Increases the brightness of darker objects", "  OFF - standard brightness", "  100% - maximum brightness for darker objects", "This options does not change the brightness of ", "fully black objects" };
    }
    if (btnName.equals("Chunk Loading")) {
      return new String[] { "Chunk Loading", "  Default - unstable FPS when loading chunks", "  Smooth - stable FPS", "  Multi-Core - stable FPS, 3x faster world loading", "Smooth and Multi-Core remove the stuttering and ", "freezes caused by chunk loading.", "Multi-Core can speed up 3x the world loading and", "increase FPS by using a second CPU core." };
    }
    if (btnName.equals("Alternate Blocks")) {
      return new String[] { "Alternate Blocks", "Uses alternative block models for some blocks.", "Depends on the selected resource pack." };
    }
    if (btnName.equals("Use VBOs")) {
      return new String[] { "Vertex Buffer Objects", "Uses an alternative rendering model which is usually", "faster (5-10%) than the default rendering." };
    }
    if (btnName.equals("3D Anaglyph")) {
      return new String[] { "3D Anaglyph", "Enables a stereoscopic 3D effect using different colors", "for each eye.", "Requires red-cyan glasses for proper viewing." };
    }
    return null;
  }
  
  private String getButtonName(String displayString)
  {
    int pos = displayString.indexOf(':');
    if (pos < 0) {
      return displayString;
    }
    return displayString.substring(0, pos);
  }
  
  private avs getSelectedButton(int i, int j)
  {
    for (int k = 0; k < this.n.size(); k++)
    {
      avs btn = (avs)this.n.get(k);
      boolean flag = (i >= btn.h) && (j >= btn.i) && (i < btn.h + btn.f) && (j < btn.i + btn.g);
      if (flag) {
        return btn;
      }
    }
    return null;
  }
  
  public static int getButtonWidth(avs btn)
  {
    return btn.f;
  }
  
  public static int getButtonHeight(avs btn)
  {
    return btn.g;
  }
}
