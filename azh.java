import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import de.labystudio.gui.GuiAccountManager;
import de.labystudio.gui.GuiMenuScreen;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.mojangstatus.RenderMojangService;
import de.labystudio.utils.Color;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;

public class azh
  extends GuiMenuScreen
  implements awx
{
  private static final Logger a = ;
  private final bdg f = new bdg();
  private axu g;
  private azl h;
  private bdf i;
  private avs r;
  private avs s;
  private avs t;
  private boolean u;
  private boolean v;
  private boolean w;
  private boolean x;
  private String y;
  private bde z;
  private bpq.c A;
  private bpq.b B;
  private boolean C;
  avs refresh;
  long lastRefresh;
  
  public azh(axu screen)
  {
    super(screen);
    this.g = screen;
    this.childScreen = this;
    this.id = "Multiplayer";
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    if (!this.C)
    {
      this.C = true;
      this.i = new bdf(this.j);
      this.i.a();
      this.A = new bpq.c();
      try
      {
        this.B = new bpq.b(this.A);
        this.B.start();
      }
      catch (Exception exception)
      {
        a.warn("Unable to start LAN server detection: " + exception.getMessage());
      }
      this.h = new azl(this, this.j, this.l, this.m, 32, this.m - 64, 36);
      this.h.a(this.i);
    }
    else
    {
      this.h.a(this.l, this.m, 32, this.m - 64);
    }
    a();
    super.b();
  }
  
  public void k()
    throws IOException
  {
    super.k();
    this.h.p();
  }
  
  public void a()
  {
    this.n.add(this.r = new avs(7, this.l / 2 - 154, this.m - 28, 70, 20, bnq.a("selectServer.edit", new Object[0])));
    this.n.add(this.t = new avs(2, this.l / 2 - 74, this.m - 28, 70, 20, bnq.a("selectServer.delete", new Object[0])));
    this.n.add(this.s = new avs(1, this.l / 2 - 154, this.m - 52, 100, 20, bnq.a("selectServer.select", new Object[0])));
    this.n.add(new avs(4, this.l / 2 - 50, this.m - 52, 100, 20, bnq.a("selectServer.direct", new Object[0])));
    this.n.add(new avs(3, this.l / 2 + 4 + 50, this.m - 52, 100, 20, bnq.a("selectServer.add", new Object[0])));
    this.n.add(this.refresh = new avs(8, this.l / 2 + 4, this.m - 28, 70, 20, bnq.a("selectServer.refresh", new Object[0])));
    this.n.add(new avs(0, this.l / 2 + 4 + 76, this.m - 28, 75, 20, bnq.a("gui.cancel", new Object[0])));
    b(this.h.e());
    
    this.refresh.l = (!LabyMod.getInstance().refresh);
    
    this.n.add(new avs(10, this.l - 55, 4, 50, 20, "Account"));
    if (ConfigManager.settings.betterRefresh) {
      this.n.add(new avs(9, this.l - 83 - 52, 4, 78, 20, Color.booleanToColor(Boolean.valueOf(LabyMod.getInstance().refresh)) + "Auto Refresh"));
    } else {
      LabyMod.getInstance().refresh = false;
    }
  }
  
  public void e()
  {
    super.e();
    if ((this.lastRefresh + 2000L < System.currentTimeMillis()) && (LabyMod.getInstance().refresh))
    {
      this.lastRefresh = System.currentTimeMillis();
      i();
    }
    if (this.A.a())
    {
      List<bpq.a> list = this.A.c();
      this.A.b();
      this.h.a(list);
    }
    LabyMod.getInstance().resetMod();
    LabyMod.getInstance().resetIP();
    
    this.f.a();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    if (this.B != null)
    {
      this.B.interrupt();
      this.B = null;
    }
    this.f.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l)
    {
      awd.a guilistextended$iguilistentry = this.h.e() < 0 ? null : this.h.b(this.h.e());
      if ((button.k == 2) && ((guilistextended$iguilistentry instanceof azk)))
      {
        String s4 = ((azk)guilistextended$iguilistentry).a().a;
        if (s4 != null)
        {
          this.u = true;
          String s = bnq.a("selectServer.deleteQuestion", new Object[0]);
          String s1 = "'" + s4 + "' " + bnq.a("selectServer.deleteWarning", new Object[0]);
          String s2 = bnq.a("selectServer.deleteButton", new Object[0]);
          String s3 = bnq.a("gui.cancel", new Object[0]);
          awy guiyesno = new awy(this, s, s1, s2, s3, this.h.e());
          this.j.a(guiyesno);
        }
      }
      else if (button.k == 1)
      {
        f();
      }
      else if (button.k == 4)
      {
        this.x = true;
        this.j.a(new axg(this, this.z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
      }
      else if (button.k == 3)
      {
        this.v = true;
        this.j.a(new axi(this, this.z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
      }
      else if ((button.k == 7) && ((guilistextended$iguilistentry instanceof azk)))
      {
        this.w = true;
        bde serverdata = ((azk)guilistextended$iguilistentry).a();
        this.z = new bde(serverdata.a, serverdata.b, false);
        this.z.a(serverdata);
        this.j.a(new axi(this, this.z));
      }
      else if (button.k == 0)
      {
        this.j.a(this.g);
      }
      else if (button.k == 8)
      {
        i();
      }
      if (button.k == 9)
      {
        if (LabyMod.getInstance().refresh) {
          LabyMod.getInstance().refresh = false;
        } else {
          LabyMod.getInstance().refresh = true;
        }
        this.j.a(this);
      }
      if (button.k == 10) {
        this.j.a(new GuiAccountManager(this));
      }
    }
    super.actionPermformed(button);
  }
  
  private void i()
  {
    if (ConfigManager.settings.betterRefresh)
    {
      this.i = new bdf(this.j);
      this.h.a(this.i);
    }
    else
    {
      this.j.a(new azh(this.g));
    }
  }
  
  public void a(boolean result, int id)
  {
    awd.a guilistextended$iguilistentry = this.h.e() < 0 ? null : this.h.b(this.h.e());
    if (this.u)
    {
      this.u = false;
      if ((result) && ((guilistextended$iguilistentry instanceof azk)))
      {
        this.i.b(this.h.e());
        this.i.b();
        this.h.c(-1);
        this.h.a(this.i);
      }
      this.j.a(this);
    }
    else if (this.x)
    {
      this.x = false;
      if (result) {
        a(this.z);
      } else {
        this.j.a(this);
      }
    }
    else if (this.v)
    {
      this.v = false;
      if (result)
      {
        this.i.a(this.z);
        this.i.b();
        this.h.c(-1);
        this.h.a(this.i);
      }
      this.j.a(this);
    }
    else if (this.w)
    {
      this.w = false;
      if ((result) && ((guilistextended$iguilistentry instanceof azk)))
      {
        bde serverdata = ((azk)guilistextended$iguilistentry).a();
        serverdata.a = this.z.a;
        serverdata.b = this.z.b;
        serverdata.a(this.z);
        this.i.b();
        this.h.a(this.i);
      }
      this.j.a(this);
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    int i = this.h.e();
    awd.a guilistextended$iguilistentry = i < 0 ? null : this.h.b(i);
    if (keyCode == 63) {
      i();
    } else if (i >= 0)
    {
      if (keyCode == 200)
      {
        if (r())
        {
          if ((i > 0) && ((guilistextended$iguilistentry instanceof azk)))
          {
            this.i.a(i, i - 1);
            b(this.h.e() - 1);
            this.h.h(-this.h.r());
            this.h.a(this.i);
          }
        }
        else if (i > 0)
        {
          b(this.h.e() - 1);
          this.h.h(-this.h.r());
          if ((this.h.b(this.h.e()) instanceof azi)) {
            if (this.h.e() > 0)
            {
              b(this.h.b() - 1);
              this.h.h(-this.h.r());
            }
            else
            {
              b(-1);
            }
          }
        }
        else
        {
          b(-1);
        }
      }
      else if (keyCode == 208)
      {
        if (r())
        {
          if (i < this.i.c() - 1)
          {
            this.i.a(i, i + 1);
            b(i + 1);
            this.h.h(this.h.r());
            this.h.a(this.i);
          }
        }
        else if (i < this.h.b())
        {
          b(this.h.e() + 1);
          this.h.h(this.h.r());
          if ((this.h.b(this.h.e()) instanceof azi)) {
            if (this.h.e() < this.h.b() - 1)
            {
              b(this.h.b() + 1);
              this.h.h(this.h.r());
            }
            else
            {
              b(-1);
            }
          }
        }
        else
        {
          b(-1);
        }
      }
      else if ((keyCode != 28) && (keyCode != 156)) {
        super.a(typedChar, keyCode);
      } else {
        a((avs)this.n.get(2));
      }
    }
    else {
      super.a(typedChar, keyCode);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    this.y = null;
    c();
    this.h.a(mouseX, mouseY, partialTicks);
    
    super.a(mouseX, mouseY, partialTicks);
    if (this.y != null) {
      a(Lists.newArrayList(Splitter.on("\n").split(this.y)), mouseX, mouseY);
    }
    RenderMojangService.renderOnMultiplayerGui();
  }
  
  public void f()
  {
    awd.a guilistextended$iguilistentry = this.h.e() < 0 ? null : this.h.b(this.h.e());
    if ((guilistextended$iguilistentry instanceof azk))
    {
      a(((azk)guilistextended$iguilistentry).a());
    }
    else if ((guilistextended$iguilistentry instanceof azj))
    {
      bpq.a lanserverdetector$lanserver = ((azj)guilistextended$iguilistentry).a();
      a(new bde(lanserverdetector$lanserver.a(), lanserverdetector$lanserver.b(), true));
    }
  }
  
  private void a(bde server)
  {
    this.j.a(new awz(this, this.j, server));
  }
  
  public void b(int index)
  {
    this.h.c(index);
    awd.a guilistextended$iguilistentry = index < 0 ? null : this.h.b(index);
    this.s.l = false;
    this.r.l = false;
    this.t.l = false;
    if ((guilistextended$iguilistentry != null) && (!(guilistextended$iguilistentry instanceof azi)))
    {
      this.s.l = true;
      if ((guilistextended$iguilistentry instanceof azk))
      {
        this.r.l = true;
        this.t.l = true;
      }
    }
  }
  
  public bdg g()
  {
    return this.f;
  }
  
  public void a(String p_146793_1_)
  {
    this.y = p_146793_1_;
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    this.h.b(mouseX, mouseY, mouseButton);
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    super.b(mouseX, mouseY, state);
    this.h.c(mouseX, mouseY, state);
  }
  
  public bdf h()
  {
    return this.i;
  }
  
  public boolean a(azk p_175392_1_, int p_175392_2_)
  {
    return p_175392_2_ > 0;
  }
  
  public boolean b(azk p_175394_1_, int p_175394_2_)
  {
    return p_175394_2_ < this.i.c() - 1;
  }
  
  public void a(azk p_175391_1_, int p_175391_2_, boolean p_175391_3_)
  {
    int i = p_175391_3_ ? 0 : p_175391_2_ - 1;
    this.i.a(p_175391_2_, i);
    if (this.h.e() == p_175391_2_) {
      b(i);
    }
    this.h.a(this.i);
  }
  
  public void b(azk p_175393_1_, int p_175393_2_, boolean p_175393_3_)
  {
    int i = p_175393_3_ ? this.i.c() - 1 : p_175393_2_ + 1;
    this.i.a(p_175393_2_, i);
    if (this.h.e() == p_175393_2_) {
      b(i);
    }
    this.h.a(this.i);
  }
}
