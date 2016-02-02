import java.util.List;

public class GuiAnimationSettingsOF
  extends axu
{
  private axu prevScreen;
  protected String title;
  private avh settings;
  
  public GuiAnimationSettingsOF(axu guiscreen, avh gamesettings)
  {
    this.title = "Animation Settings";
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
    this.n.add(new avs(210, this.l / 2 - 155, this.m / 6 + 168 + 11, 70, 20, "All ON"));
    this.n.add(new avs(211, this.l / 2 - 155 + 80, this.m / 6 + 168 + 11, 70, 20, "All OFF"));
    
    this.n.add(new awe(200, this.l / 2 + 5, this.m / 6 + 168 + 11, bnq.a("gui.done", new Object[0])));
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
    if (guibutton.k == 210) {
      this.j.t.setAllAnimations(true);
    }
    if (guibutton.k == 211) {
      this.j.t.setAllAnimations(false);
    }
    if (guibutton.k != avh.a.CLOUD_HEIGHT.ordinal())
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
    a(this.q, this.title, this.l / 2, 15, 16777215);
    super.a(i, j, f);
  }
  
  private static avh.a[] enumOptions = { avh.a.ANIMATED_WATER, avh.a.ANIMATED_LAVA, avh.a.ANIMATED_FIRE, avh.a.ANIMATED_PORTAL, avh.a.ANIMATED_REDSTONE, avh.a.ANIMATED_EXPLOSION, avh.a.ANIMATED_FLAME, avh.a.ANIMATED_SMOKE, avh.a.VOID_PARTICLES, avh.a.WATER_PARTICLES, avh.a.RAIN_SPLASH, avh.a.PORTAL_PARTICLES, avh.a.POTION_PARTICLES, avh.a.DRIPPING_WATER_LAVA, avh.a.ANIMATED_TERRAIN, avh.a.ANIMATED_TEXTURES, avh.a.FIREWORK_PARTICLES, avh.a.o };
}
