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
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.f = ☃;
    this.h = ☃;
  }
  
  public pf(pf ☃)
  {
    this.b = ☃.b;
    this.c = ☃.c;
    this.d = ☃.d;
    this.f = ☃.f;
    this.h = ☃.h;
  }
  
  public void a(pf ☃)
  {
    if (this.b != ☃.b) {
      a.warn("This method should only be called for matching effects!");
    }
    if (☃.d > this.d)
    {
      this.d = ☃.d;
      this.c = ☃.c;
    }
    else if ((☃.d == this.d) && (this.c < ☃.c))
    {
      this.c = ☃.c;
    }
    else if ((!☃.f) && (this.f))
    {
      this.f = ☃.f;
    }
    this.h = ☃.h;
  }
  
  public int a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public void a(boolean ☃)
  {
    this.e = ☃;
  }
  
  public boolean e()
  {
    return this.f;
  }
  
  public boolean f()
  {
    return this.h;
  }
  
  public boolean a(pr ☃)
  {
    if (this.c > 0)
    {
      if (pe.a[this.b].a(this.c, this.d)) {
        b(☃);
      }
      i();
    }
    return this.c > 0;
  }
  
  private int i()
  {
    return --this.c;
  }
  
  public void b(pr ☃)
  {
    if (this.c > 0) {
      pe.a[this.b].a(☃, this.d);
    }
  }
  
  public String g()
  {
    return pe.a[this.b].a();
  }
  
  public int hashCode()
  {
    return this.b;
  }
  
  public String toString()
  {
    String ☃ = "";
    if (c() > 0) {
      ☃ = g() + " x " + (c() + 1) + ", Duration: " + b();
    } else {
      ☃ = g() + ", Duration: " + b();
    }
    if (this.e) {
      ☃ = ☃ + ", Splash: true";
    }
    if (!this.h) {
      ☃ = ☃ + ", Particles: false";
    }
    if (pe.a[this.b].j()) {
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
    return (this.b == ☃.b) && (this.d == ☃.d) && (this.c == ☃.c) && (this.e == ☃.e) && (this.f == ☃.f);
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
    this.g = ☃;
  }
  
  public boolean h()
  {
    return this.g;
  }
}
