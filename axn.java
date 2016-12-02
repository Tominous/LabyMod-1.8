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
    this.g = p_i1046_1_;
    this.h = p_i1046_2_;
  }
  
  public void b()
  {
    int i = 0;
    this.a = bnq.a("options.title", new Object[0]);
    for (avh.a gamesettings$options : f)
    {
      if (gamesettings$options.a())
      {
        this.n.add(new awj(gamesettings$options.c(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), gamesettings$options));
      }
      else
      {
        awe guioptionbutton = new awe(gamesettings$options.c(), this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), gamesettings$options, this.h.c(gamesettings$options));
        this.n.add(guioptionbutton);
      }
      i++;
    }
    if (this.j.f != null)
    {
      oj enumdifficulty = this.j.f.aa();
      this.i = new avs(108, this.l / 2 - 155 + i % 2 * 160, this.m / 6 - 12 + 24 * (i >> 1), 150, 20, a(enumdifficulty));
      this.n.add(this.i);
      if ((this.j.F()) && (!this.j.f.P().t()))
      {
        this.i.a(this.i.b() - 20);
        this.r = new awc(109, this.i.h + this.i.b(), this.i.i);
        this.n.add(this.r);
        this.r.b(this.j.f.P().z());
        this.r.l = (!this.r.c());
        this.i.l = (!this.r.c());
      }
      else
      {
        this.i.l = false;
      }
    }
    this.n.add(new avs(110, this.l / 2 - 155, this.m / 6 + 48 - 6, 150, 20, bnq.a("options.skinCustomisation", new Object[0])));
    this.n.add(new avs(8675309, this.l / 2 + 5, this.m / 6 + 48 - 6, 150, 20, "Super Secret Settings...")
    {
      public void a(bpz soundHandlerIn)
      {
        bpy soundeventaccessorcomposite = soundHandlerIn.a(new bpg[] { bpg.g, bpg.e, bpg.f, bpg.h, bpg.d });
        if (soundeventaccessorcomposite != null) {
          soundHandlerIn.a(bpf.a(soundeventaccessorcomposite.c(), 0.5F));
        }
      }
    });
    this.n.add(new avs(106, this.l / 2 - 155, this.m / 6 + 72 - 6, 150, 20, bnq.a("options.sounds", new Object[0])));
    this.n.add(new avs(107, this.l / 2 + 5, this.m / 6 + 72 - 6, 150, 20, bnq.a("options.stream", new Object[0])));
    this.n.add(new avs(101, this.l / 2 - 155, this.m / 6 + 96 - 6, 150, 20, bnq.a("options.video", new Object[0])));
    this.n.add(new avs(100, this.l / 2 + 5, this.m / 6 + 96 - 6, 150, 20, bnq.a("options.controls", new Object[0])));
    this.n.add(new avs(102, this.l / 2 - 155, this.m / 6 + 120 - 6, 150, 20, bnq.a("options.language", new Object[0])));
    this.n.add(new avs(103, this.l / 2 + 5, this.m / 6 + 120 - 6, 150, 20, bnq.a("options.chat.title", new Object[0])));
    this.n.add(new avs(105, this.l / 2 - 155, this.m / 6 + 144 - 6, 150, 20, bnq.a("options.resourcepack", new Object[0])));
    this.n.add(new avs(104, this.l / 2 + 5, this.m / 6 + 144 - 6, 150, 20, bnq.a("options.snooper.view", new Object[0])));
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 168, bnq.a("gui.done", new Object[0])));
    
    this.n.add(new avs(201, this.l / 2 + 5, this.m / 6 + 25 - 6, 150, 20, bnq.a("LabyMod Settings", new Object[0])));
    if (ModManager.getSettings().size() != 0)
    {
      String s = "s";
      if (ModManager.getSettings().size() == 1) {
        s = "";
      }
      this.n.add(new avs(202, this.l / 2 - 155, this.m / 6 + 25 - 6, 150, 20, bnq.a("Mod Settings (" + ModManager.getSettings().size() + " Mod" + s + ")", new Object[0])));
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
    this.j.a(this);
    if ((id == 109) && (result) && (this.j.f != null))
    {
      this.j.f.P().e(true);
      this.r.b(true);
      this.r.l = false;
      this.i.l = false;
    }
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l)
    {
      if ((button.k < 100) && ((button instanceof awe)))
      {
        avh.a gamesettings$options = ((awe)button).c();
        this.h.a(gamesettings$options, 1);
        button.j = this.h.c(avh.a.a(button.k));
      }
      if (button.k == 108)
      {
        this.j.f.P().a(oj.a(this.j.f.aa().a() + 1));
        this.i.j = a(this.j.f.aa());
      }
      if (button.k == 109) {
        this.j.a(new awy(this, new fb("difficulty.lock.title", new Object[0]).d(), new fb("difficulty.lock.question", new Object[] { new fb(this.j.f.P().y().b(), new Object[0]) }).d(), 109));
      }
      if (button.k == 110)
      {
        this.j.t.b();
        this.j.a(new axx(this));
      }
      if (button.k == 8675309) {
        this.j.o.d();
      }
      if (button.k == 101)
      {
        this.j.t.b();
        this.j.a(new ayb(this, this.h));
      }
      if (button.k == 100)
      {
        this.j.t.b();
        this.j.a(new ayj(this, this.h));
      }
      if (button.k == 102)
      {
        this.j.t.b();
        this.j.a(new axl(this, this.h, this.j.S()));
      }
      if (button.k == 103)
      {
        this.j.t.b();
        this.j.a(new awu(this, this.h));
      }
      if (button.k == 104)
      {
        this.j.t.b();
        this.j.a(new axy(this, this.h));
      }
      if (button.k == 200)
      {
        this.j.t.b();
        this.j.a(this.g);
      }
      if (button.k == 105)
      {
        this.j.t.b();
        this.j.a(new azo(this));
      }
      if (button.k == 106)
      {
        this.j.t.b();
        this.j.a(new axz(this, this.h));
      }
      if (button.k == 107)
      {
        this.j.t.b();
        bqm istream = this.j.Y();
        if ((istream.i()) && (istream.A())) {
          this.j.a(new azz(this, this.h));
        } else {
          baa.a(this);
        }
      }
      if (button.k == 201)
      {
        this.j.t.b();
        this.j.a(new GuiModSettings(this, this.h));
      }
      if (button.k == 202)
      {
        this.j.t.b();
        this.j.a(new GuiCompModSettings(this));
      }
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, this.a, this.l / 2, 15, 16777215);
    super.a(mouseX, mouseY, partialTicks);
  }
}
