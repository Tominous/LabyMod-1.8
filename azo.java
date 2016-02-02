import com.google.common.collect.Lists;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Collections;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.Sys;

public class azo
  extends axu
{
  private static final Logger a = ;
  private final axu f;
  private List<azp> g;
  private List<azp> h;
  private azt i;
  private azv r;
  private boolean s = false;
  
  public azo(axu ☃)
  {
    this.f = ☃;
  }
  
  public void b()
  {
    this.n.add(new awe(2, this.l / 2 - 154, this.m - 48, bnq.a("resourcePack.openFolder", new Object[0])));
    this.n.add(new awe(1, this.l / 2 + 4, this.m - 48, bnq.a("gui.done", new Object[0])));
    if (!this.s)
    {
      this.g = Lists.newArrayList();
      this.h = Lists.newArrayList();
      
      bnm ☃ = this.j.R();
      ☃.a();
      List<bnm.a> ☃ = Lists.newArrayList(☃.b());
      ☃.removeAll(☃.c());
      for (bnm.a ☃ : ☃) {
        this.g.add(new azr(this, ☃));
      }
      for (bnm.a ☃ : Lists.reverse(☃.c())) {
        this.h.add(new azr(this, ☃));
      }
      this.h.add(new azq(this));
    }
    this.i = new azt(this.j, 200, this.m, this.g);
    this.i.i(this.l / 2 - 4 - 200);
    this.i.d(7, 8);
    this.r = new azv(this.j, 200, this.m, this.h);
    this.r.i(this.l / 2 + 4);
    this.r.d(7, 8);
  }
  
  public void k()
  {
    super.k();
    this.r.p();
    this.i.p();
  }
  
  public boolean a(azp ☃)
  {
    return this.h.contains(☃);
  }
  
  public List<azp> b(azp ☃)
  {
    if (a(☃)) {
      return this.h;
    }
    return this.g;
  }
  
  public List<azp> a()
  {
    return this.g;
  }
  
  public List<azp> f()
  {
    return this.h;
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 2)
    {
      File ☃ = this.j.R().d();
      String ☃ = ☃.getAbsolutePath();
      if (g.a() == g.a.d)
      {
        try
        {
          a.info(☃);
          Runtime.getRuntime().exec(new String[] { "/usr/bin/open", ☃ });
          
          return;
        }
        catch (IOException ☃)
        {
          a.error("Couldn't open file", ☃);
        }
      }
      else if (g.a() == g.a.c)
      {
        String ☃ = String.format("cmd.exe /C start \"Open file\" \"%s\"", new Object[] { ☃ });
        try
        {
          Runtime.getRuntime().exec(☃);
          return;
        }
        catch (IOException ☃)
        {
          a.error("Couldn't open file", ☃);
        }
      }
      boolean ☃ = false;
      try
      {
        Class<?> ☃ = Class.forName("java.awt.Desktop");
        Object ☃ = ☃.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
        ☃.getMethod("browse", new Class[] { URI.class }).invoke(☃, new Object[] { ☃.toURI() });
      }
      catch (Throwable ☃)
      {
        a.error("Couldn't open link", ☃);
        ☃ = true;
      }
      if (☃)
      {
        a.info("Opening via system class!");
        Sys.openURL("file://" + ☃);
      }
    }
    else if (☃.k == 1)
    {
      if (this.s)
      {
        List<bnm.a> ☃ = Lists.newArrayList();
        for (azp ☃ : this.h) {
          if ((☃ instanceof azr)) {
            ☃.add(((azr)☃).j());
          }
        }
        Collections.reverse(☃);
        this.j.R().a(☃);
        this.j.t.k.clear();
        this.j.t.l.clear();
        for (bnm.a ☃ : ☃)
        {
          this.j.t.k.add(☃.d());
          if (☃.f() != 1) {
            this.j.t.l.add(☃.d());
          }
        }
        this.j.t.b();
        this.j.e();
      }
      this.j.a(this.f);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    this.i.b(☃, ☃, ☃);
    this.r.b(☃, ☃, ☃);
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    super.b(☃, ☃, ☃);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c(0);
    
    this.i.a(☃, ☃, ☃);
    this.r.a(☃, ☃, ☃);
    
    a(this.q, bnq.a("resourcePack.title", new Object[0]), this.l / 2, 16, 16777215);
    a(this.q, bnq.a("resourcePack.folderInfo", new Object[0]), this.l / 2 - 77, this.m - 26, 8421504);
    
    super.a(☃, ☃, ☃);
  }
  
  public void g()
  {
    this.s = true;
  }
}
