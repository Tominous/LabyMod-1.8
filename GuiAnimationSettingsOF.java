import java.util.List;

public class GuiAnimationSettingsOF
  extends axu
{
  private axu prevScreen;
  protected String title;
  private avh settings;
  
  public GuiAnimationSettingsOF(axu guiscreen, avh gamesettings)
  {
    title = "Animation Settings";
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
    n.add(new avs(210, l / 2 - 155, m / 6 + 168 + 11, 70, 20, "All ON"));
    n.add(new avs(211, l / 2 - 155 + 80, m / 6 + 168 + 11, 70, 20, "All OFF"));
    
    n.add(new awe(200, l / 2 + 5, m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
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
    if (k == 210) {
      jt.setAllAnimations(true);
    }
    if (k == 211) {
      jt.setAllAnimations(false);
    }
    if (k != avh.a.CLOUD_HEIGHT.ordinal())
    {
      avr scaledresolution = new avr(this.j);
      int i = scaledresolution.a();
      int j = scaledresolution.b();
      a(this.j, i, j);
    }
  }
  
  public void a(int i, int j, float f)
  {
    c();
    a(q, title, l / 2, 15, 16777215);
    super.a(i, j, f);
  }
  
  private static avh.a[] enumOptions = { avh.a.ANIMATED_WATER, avh.a.ANIMATED_LAVA, avh.a.ANIMATED_FIRE, avh.a.ANIMATED_PORTAL, avh.a.ANIMATED_REDSTONE, avh.a.ANIMATED_EXPLOSION, avh.a.ANIMATED_FLAME, avh.a.ANIMATED_SMOKE, avh.a.VOID_PARTICLES, avh.a.WATER_PARTICLES, avh.a.RAIN_SPLASH, avh.a.PORTAL_PARTICLES, avh.a.POTION_PARTICLES, avh.a.DRIPPING_WATER_LAVA, avh.a.ANIMATED_TERRAIN, avh.a.ANIMATED_TEXTURES, avh.a.FIREWORK_PARTICLES, avh.a.o };
}
