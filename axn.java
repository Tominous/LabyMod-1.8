import de.labystudio.gui.GuiCompModSettings;
import de.labystudio.gui.GuiModSettings;
import de.labystudio.modapi.ModManager;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

public class axn
  extends axu
  implements awx
{
  private static final avh.a[] f = { avh.a.c };
  private final axu g;
  private final avh h;
  private avs i;
  private awc r;
  protected String a = "Options";
  
  public axn(axu p_i1046_1_, avh p_i1046_2_)
  {
    g = p_i1046_1_;
    h = p_i1046_2_;
  }
  
  public void b()
  {
    int i = 0;
    a = bnq.a("options.title", new Object[0]);
    for (avh.a gamesettings$options : f)
    {
      if (gamesettings$options.a())
      {
        n.add(new awj(gamesettings$options.c(), l / 2 - 155 + i % 2 * 160, m / 6 - 12 + 24 * (i >> 1), gamesettings$options));
      }
      else
      {
        awe guioptionbutton = new awe(gamesettings$options.c(), l / 2 - 155 + i % 2 * 160, m / 6 - 12 + 24 * (i >> 1), gamesettings$options, h.c(gamesettings$options));
        n.add(guioptionbutton);
      }
      i++;
    }
    if (j.f != null)
    {
      oj enumdifficulty = j.f.aa();
      this.i = new avs(108, l / 2 - 155 + i % 2 * 160, m / 6 - 12 + 24 * (i >> 1), 150, 20, a(enumdifficulty));
      n.add(this.i);
      if ((j.F()) && (!j.f.P().t()))
      {
        this.i.a(this.i.b() - 20);
        r = new awc(109, ih + this.i.b(), ii);
        n.add(r);
        r.b(j.f.P().z());
        r.l = (!r.c());
        il = (!r.c());
      }
      else
      {
        il = false;
      }
    }
    n.add(new avs(110, l / 2 - 155, m / 6 + 48 - 6, 150, 20, bnq.a("options.skinCustomisation", new Object[0])));
    n.add(new avs(8675309, l / 2 + 5, m / 6 + 48 - 6, 150, 20, "Super Secret Settings...")
    {
      public void a(bpz soundHandlerIn)
      {
        bpy soundeventaccessorcomposite = soundHandlerIn.a(new bpg[] { bpg.g, bpg.e, bpg.f, bpg.h, bpg.d });
        if (soundeventaccessorcomposite != null) {
          soundHandlerIn.a(bpf.a(soundeventaccessorcomposite.c(), 0.5F));
        }
      }
    });
    n.add(new avs(106, l / 2 - 155, m / 6 + 72 - 6, 150, 20, bnq.a("options.sounds", new Object[0])));
    n.add(new avs(107, l / 2 + 5, m / 6 + 72 - 6, 150, 20, bnq.a("options.stream", new Object[0])));
    n.add(new avs(101, l / 2 - 155, m / 6 + 96 - 6, 150, 20, bnq.a("options.video", new Object[0])));
    n.add(new avs(100, l / 2 + 5, m / 6 + 96 - 6, 150, 20, bnq.a("options.controls", new Object[0])));
    n.add(new avs(102, l / 2 - 155, m / 6 + 120 - 6, 150, 20, bnq.a("options.language", new Object[0])));
    n.add(new avs(103, l / 2 + 5, m / 6 + 120 - 6, 150, 20, bnq.a("options.chat.title", new Object[0])));
    n.add(new avs(105, l / 2 - 155, m / 6 + 144 - 6, 150, 20, bnq.a("options.resourcepack", new Object[0])));
    n.add(new avs(104, l / 2 + 5, m / 6 + 144 - 6, 150, 20, bnq.a("options.snooper.view", new Object[0])));
    n.add(new avs(200, l / 2 - 100, m / 6 + 168, bnq.a("gui.done", new Object[0])));
    
    n.add(new avs(201, l / 2 + 5, m / 6 + 25 - 6, 150, 20, bnq.a("LabyMod Settings", new Object[0])));
    if (ModManager.getSettings().size() != 0)
    {
      String s = "s";
      if (ModManager.getSettings().size() == 1) {
        s = "";
      }
      n.add(new avs(202, l / 2 - 155, m / 6 + 25 - 6, 150, 20, bnq.a("Mod Settings (" + ModManager.getSettings().size() + " Mod" + s + ")", new Object[0])));
    }
  }
  
  public String a(oj p_175355_1_)
  {
    eu ichatcomponent = new fa("");
    ichatcomponent.a(new fb("options.difficulty", new Object[0]));
    ichatcomponent.a(": ");
    ichatcomponent.a(new fb(p_175355_1_.b(), new Object[0]));
    return ichatcomponent.d();
  }
  
  public void a(boolean result, int id)
  {
    j.a(this);
    if ((id == 109) && (result) && (j.f != null))
    {
      j.f.P().e(true);
      r.b(true);
      r.l = false;
      i.l = false;
    }
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l)
    {
      if ((k < 100) && ((button instanceof awe)))
      {
        avh.a gamesettings$options = ((awe)button).c();
        h.a(gamesettings$options, 1);
        j = h.c(avh.a.a(k));
      }
      if (k == 108)
      {
        j.f.P().a(oj.a(j.f.aa().a() + 1));
        i.j = a(j.f.aa());
      }
      if (k == 109) {
        j.a(new awy(this, new fb("difficulty.lock.title", new Object[0]).d(), new fb("difficulty.lock.question", new Object[] { new fb(j.f.P().y().b(), new Object[0]) }).d(), 109));
      }
      if (k == 110)
      {
        j.t.b();
        j.a(new axx(this));
      }
      if (k == 8675309) {
        j.o.d();
      }
      if (k == 101)
      {
        j.t.b();
        j.a(new ayb(this, h));
      }
      if (k == 100)
      {
        j.t.b();
        j.a(new ayj(this, h));
      }
      if (k == 102)
      {
        j.t.b();
        j.a(new axl(this, h, j.S()));
      }
      if (k == 103)
      {
        j.t.b();
        j.a(new awu(this, h));
      }
      if (k == 104)
      {
        j.t.b();
        j.a(new axy(this, h));
      }
      if (k == 200)
      {
        j.t.b();
        j.a(g);
      }
      if (k == 105)
      {
        j.t.b();
        j.a(new azo(this));
      }
      if (k == 106)
      {
        j.t.b();
        j.a(new axz(this, h));
      }
      if (k == 107)
      {
        j.t.b();
        bqm istream = j.Y();
        if ((istream.i()) && (istream.A())) {
          j.a(new azz(this, h));
        } else {
          baa.a(this);
        }
      }
      if (k == 201)
      {
        j.t.b();
        j.a(new GuiModSettings(this, h));
      }
      if (k == 202)
      {
        j.t.b();
        j.a(new GuiCompModSettings(this));
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, a, l / 2, 15, 16777215);
    super.a(mouseX, mouseY, partialTicks);
  }
}
