import java.util.List;

public class GuiDetailSettingsOF
  extends axu
{
  public GuiDetailSettingsOF(axu guiscreen, avh gamesettings)
  {
    this.title = "Detail Settings";
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
    if (guibutton.k != avh.a.CLOUD_HEIGHT.ordinal())
    {
      avr scaledresolution = new avr(this.j);
      int i = scaledresolution.a();
      int j = scaledresolution.b();
      a(this.j, i, j);
    }
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
    if (btnName.equals("Clouds")) {
      return new String[] { "Clouds", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "  OFF - no clouds, fastest", "Fast clouds are rendered 2D.", "Fancy clouds are rendered 3D." };
    }
    if (btnName.equals("Cloud Height")) {
      return new String[] { "Cloud Height", "  OFF - default height", "  100% - above world height limit" };
    }
    if (btnName.equals("Trees")) {
      return new String[] { "Trees", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast trees have opaque leaves.", "Fancy trees have transparent leaves." };
    }
    if (btnName.equals("Grass")) {
      return new String[] { "Grass", "  Default - as set by setting Graphics", "  Fast - lower quality, faster", "  Fancy - higher quality, slower", "Fast grass uses default side texture.", "Fancy grass uses biome side texture." };
    }
    if (btnName.equals("Dropped Items")) {
      return new String[] { "Dropped Items", "  Default - as set by setting Graphics", "  Fast - 2D dropped items, faster", "  Fancy - 3D dropped items, slower" };
    }
    if (btnName.equals("Water")) {
      return new String[] { "Water", "  Default - as set by setting Graphics", "  Fast  - lower quality, faster", "  Fancy - higher quality, slower", "Fast water (1 pass) has some visual artifacts", "Fancy water (2 pass) has no visual artifacts" };
    }
    if (btnName.equals("Rain & Snow")) {
      return new String[] { "Rain & Snow", "  Default - as set by setting Graphics", "  Fast  - light rain/snow, faster", "  Fancy - heavy rain/snow, slower", "  OFF - no rain/snow, fastest", "When rain is OFF the splashes and rain sounds", "are still active." };
    }
    if (btnName.equals("Sky")) {
      return new String[] { "Sky", "  ON - sky is visible, slower", "  OFF  - sky is not visible, faster", "When sky is OFF the moon and sun are still visible." };
    }
    if (btnName.equals("Sun & Moon")) {
      return new String[] { "Sun & Moon", "  ON - sun and moon are visible (default)", "  OFF  - sun and moon are not visible (faster)" };
    }
    if (btnName.equals("Stars")) {
      return new String[] { "Stars", "  ON - stars are visible, slower", "  OFF  - stars are not visible, faster" };
    }
    if (btnName.equals("Depth Fog")) {
      return new String[] { "Depth Fog", "  ON - fog moves closer at bedrock levels (default)", "  OFF - same fog at all levels" };
    }
    if (btnName.equals("Show Capes")) {
      return new String[] { "Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes" };
    }
    if (btnName.equals("Held Item Tooltips")) {
      return new String[] { "Held item tooltips", "  ON - show tooltips for held items (default)", "  OFF - do not show tooltips for held items" };
    }
    if (btnName.equals("Translucent Blocks")) {
      return new String[] { "Translucent Blocks", "  Fancy - correct color blending (default)", "  Fast - fast color blending (faster)", "Controls the color blending of translucent blocks", "with different color (stained glass, water, ice)", "when placed behind each other with air between them." };
    }
    if (btnName.equals("Vignette")) {
      return new String[] { "Visual effect which slightly darkens the screen corners", "  Default - as set by the setting Graphics (default)", "  Fast - vignette disabled (faster)", "  Fancy - vignette enabled (slower)", "The vignette may have a significant effect on the FPS,", "especially when playing fullscreen.", "The vignette effect is very subtle and can safely", "be disabled" };
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
  private static avh.a[] enumOptions = { avh.a.CLOUDS, avh.a.CLOUD_HEIGHT, avh.a.TREES, avh.a.RAIN, avh.a.SKY, avh.a.STARS, avh.a.SUN_MOON, avh.a.SHOW_CAPES, avh.a.TRANSLUCENT_BLOCKS, avh.a.HELD_ITEM_TOOLTIPS, avh.a.DROPPED_ITEMS, avh.a.R, avh.a.VIGNETTE };
  private axu prevScreen;
  protected String title;
  private avh settings;
}
