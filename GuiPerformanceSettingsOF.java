import java.util.List;

public class GuiPerformanceSettingsOF
  extends axu
{
  public GuiPerformanceSettingsOF(axu guiscreen, avh gamesettings)
  {
    title = "Performance Settings";
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
        q.a(line, x1 + 5, y1 + 5 + i * 11, 14540253);
      }
    }
  }
  
  private String[] getTooltipLines(String btnName)
  {
    if (btnName.equals("Smooth FPS")) {
      return new String[] { "Stabilizes FPS by flushing the graphic driver buffers", "  OFF - no stabilization, FPS may fluctuate", "  ON - FPS stabilization", "This option is graphics driver dependant and its effect", "is not always visible" };
    }
    if (btnName.equals("Smooth World")) {
      return new String[] { "Removes lag spikes caused by the internal server.", "  OFF - no stabilization, FPS may fluctuate", "  ON - FPS stabilization", "Stabilizes FPS by distributing the internal server load.", "Effective only for local worlds (single player)." };
    }
    if (btnName.equals("Load Far")) {
      return new String[] { "Loads the world chunks at distance Far.", "Switching the render distance does not cause all chunks ", "to be loaded again.", "  OFF - world chunks loaded up to render distance", "  ON - world chunks loaded at distance Far, allows", "       fast render distance switching" };
    }
    if (btnName.equals("Preloaded Chunks")) {
      return new String[] { "Defines an area in which no chunks will be loaded", "  OFF - after 5m new chunks will be loaded", "  2 - after 32m  new chunks will be loaded", "  8 - after 128m new chunks will be loaded", "Higher values need more time to load all the chunks", "and may decrease the FPS." };
    }
    if (btnName.equals("Chunk Updates")) {
      return new String[] { "Chunk updates", " 1 - slower world loading, higher FPS (default)", " 3 - faster world loading, lower FPS", " 5 - fastest world loading, lowest FPS", "Number of chunk updates per rendered frame,", "higher values may destabilize the framerate." };
    }
    if (btnName.equals("Dynamic Updates")) {
      return new String[] { "Dynamic chunk updates", " OFF - (default) standard chunk updates per frame", " ON - more updates while the player is standing still", "Dynamic updates force more chunk updates while", "the player is standing still to load the world faster." };
    }
    if (btnName.equals("Lazy Chunk Loading")) {
      return new String[] { "Lazy Chunk Loading", " OFF - default server chunk loading", " ON - lazy server chunk loading (smoother)", "Smooths the integrated server chunk loading by", "distributing the chunks over several ticks.", "Turn it OFF if parts of the world do not load correctly.", "Effective only for local worlds and single-core CPU." };
    }
    if (btnName.equals("Fast Math")) {
      return new String[] { "Fast Math", " OFF - standard math (default)", " ON - faster math", "Uses optimized sin() and cos() functions which can", "better utilize the CPU cache and increase the FPS." };
    }
    if (btnName.equals("Fast Render")) {
      return new String[] { "Fast Render", " OFF - standard rendering (default)", " ON - optimized rendering (faster)", "Uses optimized rendering algorithm which decreases", "the GPU load and may substantionally increase the FPS." };
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
  private static avh.a[] enumOptions = { avh.a.SMOOTH_FPS, avh.a.SMOOTH_WORLD, avh.a.FAST_RENDER, avh.a.FAST_MATH, avh.a.CHUNK_UPDATES, avh.a.CHUNK_UPDATES_DYNAMIC, avh.a.LAZY_CHUNK_LOADING };
  private axu prevScreen;
  protected String title;
  private avh settings;
}
