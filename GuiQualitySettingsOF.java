import java.util.List;

public class GuiQualitySettingsOF
  extends axu
{
  public GuiQualitySettingsOF(axu guiscreen, avh gamesettings)
  {
    title = "Quality Settings";
    prevScreen = guiscreen;
    settings = gamesettings;
  }
  
  public void b()
  {
    int i = 0;
    avh.a[] aenumoptions = enumOptions;
    int j = aenumoptions.length;
    for (int k = 0; k < j; k++)
    {
      avh.a enumoptions = aenumoptions[k];
      
      int x = l / 2 - 155 + i % 2 * 160;
      int y = m / 6 + 21 * (i / 2) - 12;
      if (!enumoptions.a()) {
        n.add(new awe(enumoptions.c(), x, y, enumoptions, settings.c(enumoptions)));
      } else {
        n.add(new awj(enumoptions.c(), x, y, enumoptions));
      }
      i++;
    }
    n.add(new avs(200, l / 2 - 100, m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs guibutton)
  {
    if (!l) {
      return;
    }
    if ((k < 200) && ((guibutton instanceof awe)))
    {
      settings.a(((awe)guibutton).c(), 1);
      j = settings.c(avh.a.a(k));
    }
    if (k == 200)
    {
      jt.b();
      this.j.a(prevScreen);
    }
    if (k != avh.a.CLOUD_HEIGHT.ordinal())
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
    a(q, title, l / 2, 15, 16777215);
    super.a(x, y, f);
    if ((Math.abs(x - lastMouseX) > 5) || (Math.abs(y - lastMouseY) > 5))
    {
      lastMouseX = x;
      lastMouseY = y;
      mouseStillTime = System.currentTimeMillis();
      return;
    }
    int activateDelay = 700;
    if (System.currentTimeMillis() < mouseStillTime + activateDelay) {
      return;
    }
    int x1 = l / 2 - 150;
    int y1 = m / 6 - 7;
    if (y <= y1 + 98) {
      y1 += 105;
    }
    int x2 = x1 + 150 + 150;
    int y2 = y1 + 84 + 10;
    
    avs btn = getSelectedButton(x, y);
    if (btn != null)
    {
      String s = getButtonName(j);
      String[] lines = getTooltipLines(s);
      if (lines == null) {
        return;
      }
      a(x1, y1, x2, y2, -536870912, -536870912);
      for (int i = 0; i < lines.length; i++)
      {
        String line = lines[i];
        int col = 14540253;
        if (line.endsWith("!")) {
          col = 16719904;
        }
        q.a(line, x1 + 5, y1 + 5 + i * 11, col);
      }
    }
  }
  
  private String[] getTooltipLines(String btnName)
  {
    if (btnName.equals("Mipmap Levels")) {
      return new String[] { "Visual effect which makes distant objects look better", "by smoothing the texture details", "  OFF - no smoothing", "  1 - minimum smoothing", "  4 - maximum smoothing", "This option usually does not affect the performance." };
    }
    if (btnName.equals("Mipmap Type")) {
      return new String[] { "Visual effect which makes distant objects look better", "by smoothing the texture details", "  Nearest - rough smoothing (fastest)", "  Linear - normal smoothing", "  Bilinear - fine smoothing", "  Trilinear - finest smoothing (slowest)" };
    }
    if (btnName.equals("Anisotropic Filtering")) {
      return new String[] { "Anisotropic Filtering", " OFF - (default) standard texture detail (faster)", " 2-16 - finer details in mipmapped textures (slower)", "The Anisotropic Filtering restores details in", "mipmapped textures.", "When enabled it may substantially decrease the FPS." };
    }
    if (btnName.equals("Antialiasing")) {
      return new String[] { "Antialiasing", " OFF - (default) no antialiasing (faster)", " 2-16 - antialiased lines and edges (slower)", "The Antialiasing smooths jagged lines and ", "sharp color transitions.", "When enabled it may substantially decrease the FPS.", "Not all levels are supported by all graphics cards.", "Effective after a RESTART!" };
    }
    if (btnName.equals("Clear Water")) {
      return new String[] { "Clear Water", "  ON - clear, transparent water", "  OFF - default water" };
    }
    if (btnName.equals("Better Grass")) {
      return new String[] { "Better Grass", "  OFF - default side grass texture, fastest", "  Fast - full side grass texture, slower", "  Fancy - dynamic side grass texture, slowest" };
    }
    if (btnName.equals("Better Snow")) {
      return new String[] { "Better Snow", "  OFF - default snow, faster", "  ON - better snow, slower", "Shows snow under transparent blocks (fence, tall grass)", "when bordering with snow blocks" };
    }
    if (btnName.equals("Random Mobs")) {
      return new String[] { "Random Mobs", "  OFF - no random mobs, faster", "  ON - random mobs, slower", "Random mobs uses random textures for the game creatures.", "It needs a texture pack which has multiple mob textures." };
    }
    if (btnName.equals("Swamp Colors")) {
      return new String[] { "Swamp Colors", "  ON - use swamp colors (default), slower", "  OFF - do not use swamp colors, faster", "The swamp colors affect grass, leaves, vines and water." };
    }
    if (btnName.equals("Smooth Biomes")) {
      return new String[] { "Smooth Biomes", "  ON - smoothing of biome borders (default), slower", "  OFF - no smoothing of biome borders, faster", "The smoothing of biome borders is done by sampling and", "averaging the color of all surrounding blocks.", "Affected are grass, leaves, vines and water." };
    }
    if (btnName.equals("Custom Fonts")) {
      return new String[] { "Custom Fonts", "  ON - uses custom fonts (default), slower", "  OFF - uses default font, faster", "The custom fonts are supplied by the current", "texture pack" };
    }
    if (btnName.equals("Custom Colors")) {
      return new String[] { "Custom Colors", "  ON - uses custom colors (default), slower", "  OFF - uses default colors, faster", "The custom colors are supplied by the current", "texture pack" };
    }
    if (btnName.equals("Show Capes")) {
      return new String[] { "Show Capes", "  ON - show player capes (default)", "  OFF - do not show player capes" };
    }
    if (btnName.equals("Connected Textures")) {
      return new String[] { "Connected Textures", "  OFF - no connected textures (default)", "  Fast - fast connected textures", "  Fancy - fancy connected textures", "Connected textures joins the textures of glass,", "sandstone and bookshelves when placed next to", "each other. The connected textures are supplied", "by the current texture pack." };
    }
    if (btnName.equals("Far View")) {
      return new String[] { "Far View", " OFF - (default) standard view distance", " ON - 3x view distance", "Far View is very resource demanding!", "3x view distance => 9x chunks to be loaded => FPS / 9", "Standard view distances: 32, 64, 128, 256", "Far view distances: 96, 192, 384, 512" };
    }
    if (btnName.equals("Natural Textures")) {
      return new String[] { "Natural Textures", "  OFF - no natural textures (default)", "  ON - use natural textures", "Natural textures remove the gridlike pattern", "created by repeating blocks of the same type.", "It uses rotated and flipped variants of the base", "block texture. The configuration for the natural", "textures is supplied by the current texture pack" };
    }
    if (btnName.equals("Custom Sky")) {
      return new String[] { "Custom Sky", "  ON - custom sky textures (default), slow", "  OFF - default sky, faster", "The custom sky textures are supplied by the current", "texture pack" };
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
    for (int k = 0; k < n.size(); k++)
    {
      avs btn = (avs)n.get(k);
      int btnWidth = ayb.getButtonWidth(btn);
      int btnHeight = ayb.getButtonHeight(btn);
      boolean flag = (i >= h) && (j >= i) && (i < h + btnWidth) && (j < i + btnHeight);
      if (flag) {
        return btn;
      }
    }
    return null;
  }
  
  private int lastMouseX = 0;
  private int lastMouseY = 0;
  private long mouseStillTime = 0L;
  private static avh.a[] enumOptions = { avh.a.D, avh.a.MIPMAP_TYPE, avh.a.AF_LEVEL, avh.a.AA_LEVEL, avh.a.CLEAR_WATER, avh.a.RANDOM_MOBS, avh.a.BETTER_GRASS, avh.a.BETTER_SNOW, avh.a.CUSTOM_FONTS, avh.a.CUSTOM_COLORS, avh.a.SWAMP_COLORS, avh.a.SMOOTH_BIOMES, avh.a.CONNECTED_TEXTURES, avh.a.NATURAL_TEXTURES, avh.a.CUSTOM_SKY, avh.a.CUSTOM_ITEMS };
  private axu prevScreen;
  protected String title;
  private avh settings;
}
