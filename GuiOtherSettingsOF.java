import java.util.List;

public class GuiOtherSettingsOF
  extends axu
  implements awx
{
  public GuiOtherSettingsOF(axu guiscreen, avh gamesettings)
  {
    this.title = "Other Settings";
    this.prevScreen = guiscreen;
    this.settings = gamesettings;
  }
  
  public void b()
  {
    int i = 0;
    avh.a[] aenumoptions = enumOptions;
    int j = aenumoptions.length;
    for (int k = 0; k < j; k++)
    {
      avh.a enumoptions = aenumoptions[k];
      
      int x = this.l / 2 - 155 + i % 2 * 160;
      int y = this.m / 6 + 21 * (i / 2) - 12;
      if (!enumoptions.a()) {
        this.n.add(new awe(enumoptions.c(), x, y, enumoptions, this.settings.c(enumoptions)));
      } else {
        this.n.add(new awj(enumoptions.c(), x, y, enumoptions));
      }
      i++;
    }
    this.n.add(new avs(210, this.l / 2 - 100, this.m / 6 + 168 + 11 - 44, "Reset Video Settings..."));
    
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs guibutton)
  {
    if (!guibutton.l) {
      return;
    }
    if ((guibutton.k < 200) && ((guibutton instanceof awe)))
    {
      this.settings.a(((awe)guibutton).c(), 1);
      guibutton.j = this.settings.c(avh.a.a(guibutton.k));
    }
    if (guibutton.k == 200)
    {
      this.j.t.b();
      this.j.a(this.prevScreen);
    }
    if (guibutton.k == 210)
    {
      this.j.t.b();
      awy guiyesno = new awy(this, "Reset all video settings to their default values?", "", 9999);
      this.j.a(guiyesno);
    }
    if (guibutton.k != avh.a.CLOUD_HEIGHT.ordinal())
    {
      avr scaledresolution = new avr(this.j);
      int i = scaledresolution.a();
      int j = scaledresolution.b();
      a(this.j, i, j);
    }
  }
  
  public void a(boolean flag, int i)
  {
    if (flag) {
      this.j.t.resetSettings();
    }
    this.j.a(this);
  }
  
  public void a(int x, int y, float f)
  {
    c();
    a(this.q, this.title, this.l / 2, 15, 16777215);
    super.a(x, y, f);
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
    if (btnName.equals("Autosave")) {
      return new String[] { "Autosave interval", "Default autosave interval (2s) is NOT RECOMMENDED.", "Autosave causes the famous Lag Spike of Death." };
    }
    if (btnName.equals("Lagometer")) {
      return new String[] { "Shows the lagometer on the debug screen (F3).", "* Orange - Memory garbage collection", "* Cyan - Tick", "* Blue - Scheduled executables", "* Purple - Chunk upload", "* Red - Chunk updates", "* Yellow - Visibility check", "* Green - Render terrain" };
    }
    if (btnName.equals("Debug Profiler")) {
      return new String[] { "Debug Profiler", "  ON - debug profiler is active, slower", "  OFF - debug profiler is not active, faster", "The debug profiler collects and shows debug information", "when the debug screen is open (F3)" };
    }
    if (btnName.equals("Time")) {
      return new String[] { "Time", " Default - normal day/night cycles", " Day Only - day only", " Night Only - night only", "The time setting is only effective in CREATIVE mode", "and for local worlds." };
    }
    if (btnName.equals("Weather")) {
      return new String[] { "Weather", "  ON - weather is active, slower", "  OFF - weather is not active, faster", "The weather controls rain, snow and thunderstorms.", "Weather control is only possible for local worlds." };
    }
    if (btnName.equals("Fullscreen")) {
      return new String[] { "Fullscreen", "  ON - use fullscreen mode", "  OFF - use window mode", "Fullscreen mode may be faster or slower than", "window mode, depending on the graphics card." };
    }
    if (btnName.equals("Fullscreen Mode")) {
      return new String[] { "Fullscreen mode", "  Default - use desktop screen resolution, slower", "  WxH - use custom screen resolution, may be faster", "The selected resolution is used in fullscreen mode (F11).", "Lower resolutions should generally be faster." };
    }
    if (btnName.equals("3D Anaglyph")) {
      return new String[] { "3D mode used with red-cyan 3D glasses." };
    }
    if (btnName.equals("Show FPS")) {
      return new String[] { "Shows compact FPS and render information", "  C: - chunk renderers", "  E: - rendered entities + block entities", "  U: - chunk updates", "The compact FPS information is only shown when the", "debug screen is not visible." };
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
      int btnWidth = ayb.getButtonWidth(btn);
      int btnHeight = ayb.getButtonHeight(btn);
      boolean flag = (i >= btn.h) && (j >= btn.i) && (i < btn.h + btnWidth) && (j < btn.i + btnHeight);
      if (flag) {
        return btn;
      }
    }
    return null;
  }
  
  private int lastMouseX = 0;
  private int lastMouseY = 0;
  private long mouseStillTime = 0L;
  private static avh.a[] enumOptions = { avh.a.LAGOMETER, avh.a.PROFILER, avh.a.WEATHER, avh.a.TIME, avh.a.v, avh.a.FULLSCREEN_MODE, avh.a.SHOW_FPS, avh.a.AUTOSAVE_TICKS, avh.a.h };
  private axu prevScreen;
  protected String title;
  private avh settings;
}
