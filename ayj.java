import java.io.IOException;
import java.util.List;
import net.labymod.spm.GuiSPM;

public class ayj
  extends axu
{
  private static final avh.a[] h = { avh.a.a, avh.a.b, avh.a.y };
  private axu i;
  protected String a = "Controls";
  private avh r;
  public avb f = null;
  public long g;
  private ayi s;
  private avs t;
  
  public ayj(axu screen, avh settings)
  {
    this.i = screen;
    this.r = settings;
  }
  
  public void b()
  {
    this.s = new ayi(this, this.j);
    this.n.add(new avs(200, this.l / 2 - 155, this.m - 29, 150, 20, bnq.a("gui.done", new Object[0])));
    this.n.add(this.t = new avs(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, bnq.a("controls.resetAll", new Object[0])));
    this.n.add(new avs(202, this.l / 2 - 155 + 160, 42, 150, 20, "SettingsProfiles"));
    this.a = bnq.a("controls.title", new Object[0]);
    int i = 0;
    for (avh.a gamesettings$options : h)
    {
      if (gamesettings$options.a()) {
        this.n.add(new awj(gamesettings$options.c(), this.l / 2 - 155 + i % 2 * 160, 18 + 24 * (i >> 1), gamesettings$options));
      } else {
        this.n.add(new awe(gamesettings$options.c(), this.l / 2 - 155 + i % 2 * 160, 18 + 24 * (i >> 1), gamesettings$options, this.r.c(gamesettings$options)));
      }
      i++;
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    this.s.p();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 200)
    {
      this.j.a(this.i);
    }
    else if (button.k == 201)
    {
      for (avb keybinding : this.j.t.aw) {
        keybinding.b(keybinding.h());
      }
      avb.b();
    }
    else if ((button.k < 100) && ((button instanceof awe)))
    {
      this.r.a(((awe)button).c(), 1);
      button.j = this.r.c(avh.a.a(button.k));
    }
    else if (button.k == 202)
    {
      this.j.a(new GuiSPM(this));
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (this.f != null)
    {
      this.r.a(this.f, -100 + mouseButton);
      this.f = null;
      avb.b();
    }
    else if ((mouseButton != 0) || (!this.s.b(mouseX, mouseY, mouseButton)))
    {
      super.a(mouseX, mouseY, mouseButton);
    }
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    if ((state != 0) || (!this.s.c(mouseX, mouseY, state))) {
      super.b(mouseX, mouseY, state);
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (this.f != null)
    {
      if (keyCode == 1) {
        this.r.a(this.f, 0);
      } else if (keyCode != 0) {
        this.r.a(this.f, keyCode);
      } else if (typedChar > 0) {
        this.r.a(this.f, typedChar + 'Ā');
      }
      this.f = null;
      this.g = ave.J();
      avb.b();
    }
    else
    {
      super.a(typedChar, keyCode);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    this.s.a(mouseX, mouseY, partialTicks);
    a(this.q, this.a, this.l / 2, 8, 16777215);
    boolean flag = true;
    for (avb keybinding : this.r.aw) {
      if (keybinding.i() != keybinding.h())
      {
        flag = false;
        break;
      }
    }
    this.t.l = (!flag);
    super.a(mouseX, mouseY, partialTicks);
  }
}
