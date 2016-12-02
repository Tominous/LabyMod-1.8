import java.util.Random;

public class qw
  extends rd
{
  private final ps a;
  private final float b;
  private float c;
  private boolean d;
  private int e;
  private int f;
  
  public qw(ps ☃, float ☃)
  {
    a = ☃;
    b = ☃;
    a(7);
  }
  
  public void c()
  {
    c = 0.0F;
  }
  
  public void d()
  {
    d = false;
    c = 0.0F;
  }
  
  public boolean a()
  {
    return (a.ai()) && (a.l != null) && ((a.l instanceof wn)) && ((d) || (a.bW()));
  }
  
  public void e()
  {
    wn ☃ = (wn)a.l;
    py ☃ = (py)a;
    
    float ☃ = ns.g(y - a.y) * 0.5F;
    if (☃ > 5.0F) {
      ☃ = 5.0F;
    }
    if (☃ < -5.0F) {
      ☃ = -5.0F;
    }
    a.y = ns.g(a.y + ☃);
    if (c < b) {
      c += (b - c) * 0.01F;
    }
    if (c > b) {
      c = b;
    }
    int ☃ = ns.c(a.s);
    int ☃ = ns.c(a.t);
    int ☃ = ns.c(a.u);
    float ☃ = c;
    if (d)
    {
      if (e++ > f) {
        d = false;
      }
      ☃ += ☃ * 1.15F * ns.a(e / f * 3.1415927F);
    }
    float ☃ = 0.91F;
    if (a.C) {
      ☃ = a.o.p(new cj(ns.d(☃), ns.d(☃) - 1, ns.d(☃))).c().L * 0.91F;
    }
    float ☃ = 0.16277136F / (☃ * ☃ * ☃);
    float ☃ = ns.a(y * 3.1415927F / 180.0F);
    float ☃ = ns.b(y * 3.1415927F / 180.0F);
    float ☃ = ☃.bI() * ☃;
    float ☃ = Math.max(☃, 1.0F);
    ☃ = ☃ / ☃;
    float ☃ = ☃ * ☃;
    float ☃ = -(☃ * ☃);
    float ☃ = ☃ * ☃;
    if (ns.e(☃) > ns.e(☃))
    {
      if (☃ < 0.0F) {
        ☃ -= a.J / 2.0F;
      }
      if (☃ > 0.0F) {
        ☃ += a.J / 2.0F;
      }
      ☃ = 0.0F;
    }
    else
    {
      ☃ = 0.0F;
      if (☃ < 0.0F) {
        ☃ -= a.J / 2.0F;
      }
      if (☃ > 0.0F) {
        ☃ += a.J / 2.0F;
      }
    }
    int ☃ = ns.c(a.s + ☃);
    int ☃ = ns.c(a.u + ☃);
    
    int ☃ = ns.d(a.J + 1.0F);
    int ☃ = ns.d(a.K + K + 1.0F);
    int ☃ = ns.d(a.J + 1.0F);
    if ((☃ != ☃) || (☃ != ☃))
    {
      afh ☃ = a.o.p(new cj(☃, ☃, ☃)).c();
      boolean ☃ = (!a(☃)) && ((☃.t() != arm.a) || (!a(a.o.p(new cj(☃, ☃ - 1, ☃)).c())));
      if ((☃) && (0 == ata.a(a.o, a, ☃, ☃, ☃, ☃, ☃, ☃, false, false, true)) && (1 == ata.a(a.o, a, ☃, ☃ + 1, ☃, ☃, ☃, ☃, false, false, true)) && (1 == ata.a(a.o, a, ☃, ☃ + 1, ☃, ☃, ☃, ☃, false, false, true))) {
        ☃.r().a();
      }
    }
    if ((!bA.d) && (c >= b * 0.5F) && (a.bc().nextFloat() < 0.006F) && (!d))
    {
      zx ☃ = ☃.bA();
      if ((☃ != null) && (☃.b() == zy.bY))
      {
        ☃.a(1, ☃);
        if (b == 0)
        {
          zx ☃ = new zx(zy.aR);
          ☃.d(☃.o());
          bi.a[bi.c] = ☃;
        }
      }
    }
    a.g(0.0F, ☃);
  }
  
  private boolean a(afh ☃)
  {
    return ((☃ instanceof aju)) || ((☃ instanceof ahh));
  }
  
  public boolean f()
  {
    return d;
  }
  
  public void g()
  {
    d = true;
    e = 0;
    f = (a.bc().nextInt(841) + 140);
  }
  
  public boolean h()
  {
    return (!f()) && (c > b * 0.3F);
  }
}
