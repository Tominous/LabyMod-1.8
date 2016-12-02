import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class pf
{
  private static final Logger a = ;
  private int b;
  private int c;
  private int d;
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  
  public pf(int ☃, int ☃)
  {
    this(☃, ☃, 0);
  }
  
  public pf(int ☃, int ☃, int ☃)
  {
    this(☃, ☃, ☃, false, true);
  }
  
  public pf(int ☃, int ☃, int ☃, boolean ☃, boolean ☃)
  {
    b = ☃;
    c = ☃;
    d = ☃;
    f = ☃;
    h = ☃;
  }
  
  public pf(pf ☃)
  {
    b = b;
    c = c;
    d = d;
    f = f;
    h = h;
  }
  
  public void a(pf ☃)
  {
    if (b != b) {
      a.warn("This method should only be called for matching effects!");
    }
    if (d > d)
    {
      d = d;
      c = c;
    }
    else if ((d == d) && (c < c))
    {
      c = c;
    }
    else if ((!f) && (f))
    {
      f = f;
    }
    h = h;
  }
  
  public int a()
  {
    return b;
  }
  
  public int b()
  {
    return c;
  }
  
  public int c()
  {
    return d;
  }
  
  public void a(boolean ☃)
  {
    e = ☃;
  }
  
  public boolean e()
  {
    return f;
  }
  
  public boolean f()
  {
    return h;
  }
  
  public boolean a(pr ☃)
  {
    if (c > 0)
    {
      if (pe.a[b].a(c, d)) {
        b(☃);
      }
      i();
    }
    return c > 0;
  }
  
  private int i()
  {
    return --c;
  }
  
  public void b(pr ☃)
  {
    if (c > 0) {
      pe.a[b].a(☃, d);
    }
  }
  
  public String g()
  {
    return pe.a[b].a();
  }
  
  public int hashCode()
  {
    return b;
  }
  
  public String toString()
  {
    String ☃ = "";
    if (c() > 0) {
      ☃ = g() + " x " + (c() + 1) + ", Duration: " + b();
    } else {
      ☃ = g() + ", Duration: " + b();
    }
    if (e) {
      ☃ = ☃ + ", Splash: true";
    }
    if (!h) {
      ☃ = ☃ + ", Particles: false";
    }
    if (pe.a[b].j()) {
      return "(" + ☃ + ")";
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (!(☃ instanceof pf)) {
      return false;
    }
    pf ☃ = (pf)☃;
    return (b == b) && (d == d) && (c == c) && (e == e) && (f == f);
  }
  
  public dn a(dn ☃)
  {
    ☃.a("Id", (byte)a());
    ☃.a("Amplifier", (byte)c());
    ☃.a("Duration", b());
    ☃.a("Ambient", e());
    ☃.a("ShowParticles", f());
    return ☃;
  }
  
  public static pf b(dn ☃)
  {
    int ☃ = ☃.d("Id");
    if ((☃ < 0) || (☃ >= pe.a.length) || (pe.a[☃] == null)) {
      return null;
    }
    int ☃ = ☃.d("Amplifier");
    int ☃ = ☃.f("Duration");
    boolean ☃ = ☃.n("Ambient");
    boolean ☃ = true;
    if (☃.b("ShowParticles", 1)) {
      ☃ = ☃.n("ShowParticles");
    }
    return new pf(☃, ☃, ☃, ☃, ☃);
  }
  
  public void b(boolean ☃)
  {
    g = ☃;
  }
  
  public boolean h()
  {
    return g;
  }
}
