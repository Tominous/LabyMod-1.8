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
    i = screen;
    r = settings;
  }
  
  public void b()
  {
    s = new ayi(this, j);
    n.add(new avs(200, l / 2 - 155, m - 29, 150, 20, bnq.a("gui.done", new Object[0])));
    n.add(t = new avs(201, l / 2 - 155 + 160, m - 29, 150, 20, bnq.a("controls.resetAll", new Object[0])));
    n.add(new avs(202, l / 2 - 155 + 160, 42, 150, 20, "SettingsProfiles"));
    a = bnq.a("controls.title", new Object[0]);
    int i = 0;
    for (avh.a gamesettings$options : h)
    {
      if (gamesettings$options.a()) {
        n.add(new awj(gamesettings$options.c(), l / 2 - 155 + i % 2 * 160, 18 + 24 * (i >> 1), gamesettings$options));
      } else {
        n.add(new awe(gamesettings$options.c(), l / 2 - 155 + i % 2 * 160, 18 + 24 * (i >> 1), gamesettings$options, r.c(gamesettings$options)));
      }
      i++;
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    s.p();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 200)
    {
      j.a(i);
    }
    else if (k == 201)
    {
      for (avb keybinding : j.t.aw) {
        keybinding.b(keybinding.h());
      }
      avb.b();
    }
    else if ((k < 100) && ((button instanceof awe)))
    {
      r.a(((awe)button).c(), 1);
      j = r.c(avh.a.a(k));
    }
    else if (k == 202)
    {
      j.a(new GuiSPM(this));
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (f != null)
    {
      r.a(f, -100 + mouseButton);
      f = null;
      avb.b();
    }
    else if ((mouseButton != 0) || (!s.b(mouseX, mouseY, mouseButton)))
    {
      super.a(mouseX, mouseY, mouseButton);
    }
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    if ((state != 0) || (!s.c(mouseX, mouseY, state))) {
      super.b(mouseX, mouseY, state);
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (f != null)
    {
      if (keyCode == 1) {
        r.a(f, 0);
      } else if (keyCode != 0) {
        r.a(f, keyCode);
      } else if (typedChar > 0) {
        r.a(f, typedChar + 'Ā');
      }
      f = null;
      g = ave.J();
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
    s.a(mouseX, mouseY, partialTicks);
    a(q, a, l / 2, 8, 16777215);
    boolean flag = true;
    for (avb keybinding : r.aw) {
      if (keybinding.i() != keybinding.h())
      {
        flag = false;
        break;
      }
    }
    t.l = (!flag);
    super.a(mouseX, mouseY, partialTicks);
  }
}
