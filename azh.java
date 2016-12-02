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
    g = screen;
    childScreen = this;
    id = "Multiplayer";
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    if (!C)
    {
      C = true;
      i = new bdf(j);
      i.a();
      A = new bpq.c();
      try
      {
        B = new bpq.b(A);
        B.start();
      }
      catch (Exception exception)
      {
        a.warn("Unable to start LAN server detection: " + exception.getMessage());
      }
      h = new azl(this, j, l, m, 32, m - 64, 36);
      h.a(i);
    }
    else
    {
      h.a(l, m, 32, m - 64);
    }
    a();
    super.b();
  }
  
  public void k()
    throws IOException
  {
    super.k();
    h.p();
  }
  
  public void a()
  {
    n.add(r = new avs(7, l / 2 - 154, m - 28, 70, 20, bnq.a("selectServer.edit", new Object[0])));
    n.add(t = new avs(2, l / 2 - 74, m - 28, 70, 20, bnq.a("selectServer.delete", new Object[0])));
    n.add(s = new avs(1, l / 2 - 154, m - 52, 100, 20, bnq.a("selectServer.select", new Object[0])));
    n.add(new avs(4, l / 2 - 50, m - 52, 100, 20, bnq.a("selectServer.direct", new Object[0])));
    n.add(new avs(3, l / 2 + 4 + 50, m - 52, 100, 20, bnq.a("selectServer.add", new Object[0])));
    n.add(refresh = new avs(8, l / 2 + 4, m - 28, 70, 20, bnq.a("selectServer.refresh", new Object[0])));
    n.add(new avs(0, l / 2 + 4 + 76, m - 28, 75, 20, bnq.a("gui.cancel", new Object[0])));
    b(h.e());
    
    refresh.l = (!getInstancerefresh);
    
    n.add(new avs(10, l - 55, 4, 50, 20, "Account"));
    if (settingsbetterRefresh) {
      n.add(new avs(9, l - 83 - 52, 4, 78, 20, Color.booleanToColor(Boolean.valueOf(getInstancerefresh)) + "Auto Refresh"));
    } else {
      getInstancerefresh = false;
    }
  }
  
  public void e()
  {
    super.e();
    if ((lastRefresh + 2000L < System.currentTimeMillis()) && (getInstancerefresh))
    {
      lastRefresh = System.currentTimeMillis();
      i();
    }
    if (A.a())
    {
      List<bpq.a> list = A.c();
      A.b();
      h.a(list);
    }
    LabyMod.getInstance().resetMod();
    LabyMod.getInstance().resetIP();
    
    f.a();
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    if (B != null)
    {
      B.interrupt();
      B = null;
    }
    f.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l)
    {
      awd.a guilistextended$iguilistentry = h.e() < 0 ? null : h.b(h.e());
      if ((k == 2) && ((guilistextended$iguilistentry instanceof azk)))
      {
        String s4 = aa;
        if (s4 != null)
        {
          u = true;
          String s = bnq.a("selectServer.deleteQuestion", new Object[0]);
          String s1 = "'" + s4 + "' " + bnq.a("selectServer.deleteWarning", new Object[0]);
          String s2 = bnq.a("selectServer.deleteButton", new Object[0]);
          String s3 = bnq.a("gui.cancel", new Object[0]);
          awy guiyesno = new awy(this, s, s1, s2, s3, h.e());
          j.a(guiyesno);
        }
      }
      else if (k == 1)
      {
        f();
      }
      else if (k == 4)
      {
        x = true;
        j.a(new axg(this, z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
      }
      else if (k == 3)
      {
        v = true;
        j.a(new axi(this, z = new bde(bnq.a("selectServer.defaultName", new Object[0]), "", false)));
      }
      else if ((k == 7) && ((guilistextended$iguilistentry instanceof azk)))
      {
        w = true;
        bde serverdata = ((azk)guilistextended$iguilistentry).a();
        z = new bde(a, b, false);
        z.a(serverdata);
        j.a(new axi(this, z));
      }
      else if (k == 0)
      {
        j.a(g);
      }
      else if (k == 8)
      {
        i();
      }
      if (k == 9)
      {
        if (getInstancerefresh) {
          getInstancerefresh = false;
        } else {
          getInstancerefresh = true;
        }
        j.a(this);
      }
      if (k == 10) {
        j.a(new GuiAccountManager(this));
      }
    }
    super.actionPermformed(button);
  }
  
  private void i()
  {
    if (settingsbetterRefresh)
    {
      i = new bdf(j);
      h.a(i);
    }
    else
    {
      j.a(new azh(g));
    }
  }
  
  public void a(boolean result, int id)
  {
    awd.a guilistextended$iguilistentry = h.e() < 0 ? null : h.b(h.e());
    if (u)
    {
      u = false;
      if ((result) && ((guilistextended$iguilistentry instanceof azk)))
      {
        i.b(h.e());
        i.b();
        h.c(-1);
        h.a(i);
      }
      j.a(this);
    }
    else if (x)
    {
      x = false;
      if (result) {
        a(z);
      } else {
        j.a(this);
      }
    }
    else if (v)
    {
      v = false;
      if (result)
      {
        i.a(z);
        i.b();
        h.c(-1);
        h.a(i);
      }
      j.a(this);
    }
    else if (w)
    {
      w = false;
      if ((result) && ((guilistextended$iguilistentry instanceof azk)))
      {
        bde serverdata = ((azk)guilistextended$iguilistentry).a();
        a = z.a;
        b = z.b;
        serverdata.a(z);
        i.b();
        h.a(i);
      }
      j.a(this);
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    int i = h.e();
    awd.a guilistextended$iguilistentry = i < 0 ? null : h.b(i);
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
            b(h.e() - 1);
            h.h(-h.r());
            h.a(this.i);
          }
        }
        else if (i > 0)
        {
          b(h.e() - 1);
          h.h(-h.r());
          if ((h.b(h.e()) instanceof azi)) {
            if (h.e() > 0)
            {
              b(h.b() - 1);
              h.h(-h.r());
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
            h.h(h.r());
            h.a(this.i);
          }
        }
        else if (i < h.b())
        {
          b(h.e() + 1);
          h.h(h.r());
          if ((h.b(h.e()) instanceof azi)) {
            if (h.e() < h.b() - 1)
            {
              b(h.b() + 1);
              h.h(h.r());
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
        a((avs)n.get(2));
      }
    }
    else {
      super.a(typedChar, keyCode);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    y = null;
    c();
    h.a(mouseX, mouseY, partialTicks);
    
    super.a(mouseX, mouseY, partialTicks);
    if (y != null) {
      a(Lists.newArrayList(Splitter.on("\n").split(y)), mouseX, mouseY);
    }
    RenderMojangService.renderOnMultiplayerGui();
  }
  
  public void f()
  {
    awd.a guilistextended$iguilistentry = h.e() < 0 ? null : h.b(h.e());
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
    j.a(new awz(this, j, server));
  }
  
  public void b(int index)
  {
    h.c(index);
    awd.a guilistextended$iguilistentry = index < 0 ? null : h.b(index);
    s.l = false;
    r.l = false;
    t.l = false;
    if ((guilistextended$iguilistentry != null) && (!(guilistextended$iguilistentry instanceof azi)))
    {
      s.l = true;
      if ((guilistextended$iguilistentry instanceof azk))
      {
        r.l = true;
        t.l = true;
      }
    }
  }
  
  public bdg g()
  {
    return f;
  }
  
  public void a(String p_146793_1_)
  {
    y = p_146793_1_;
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    h.b(mouseX, mouseY, mouseButton);
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    super.b(mouseX, mouseY, state);
    h.c(mouseX, mouseY, state);
  }
  
  public bdf h()
  {
    return i;
  }
  
  public boolean a(azk p_175392_1_, int p_175392_2_)
  {
    return p_175392_2_ > 0;
  }
  
  public boolean b(azk p_175394_1_, int p_175394_2_)
  {
    return p_175394_2_ < i.c() - 1;
  }
  
  public void a(azk p_175391_1_, int p_175391_2_, boolean p_175391_3_)
  {
    int i = p_175391_3_ ? 0 : p_175391_2_ - 1;
    this.i.a(p_175391_2_, i);
    if (h.e() == p_175391_2_) {
      b(i);
    }
    h.a(this.i);
  }
  
  public void b(azk p_175393_1_, int p_175393_2_, boolean p_175393_3_)
  {
    int i = p_175393_3_ ? this.i.c() - 1 : p_175393_2_ + 1;
    this.i.a(p_175393_2_, i);
    if (h.e() == p_175393_2_) {
      b(i);
    }
    h.a(this.i);
  }
}
