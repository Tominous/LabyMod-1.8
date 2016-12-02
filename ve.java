import java.util.Random;

public class ve
  extends va
{
  private int c;
  public double a;
  public double b;
  
  public ve(adm ☃)
  {
    super(☃);
  }
  
  public ve(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public va.a s()
  {
    return va.a.c;
  }
  
  protected void h()
  {
    super.h();
    ac.a(16, new Byte((byte)0));
  }
  
  public void t_()
  {
    super.t_();
    if (c > 0) {
      c -= 1;
    }
    if (c <= 0) {
      a = (b = 0.0D);
    }
    i(c > 0);
    if ((j()) && (V.nextInt(4) == 0)) {
      o.a(cy.m, s, t + 0.8D, u, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  protected double m()
  {
    return 0.2D;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if ((!☃.c()) && (o.Q().b("doEntityDrops"))) {
      a(new zx(afi.al, 1), 0.0F);
    }
  }
  
  protected void a(cj ☃, alz ☃)
  {
    super.a(☃, ☃);
    
    double ☃ = a * a + b * b;
    if ((☃ > 1.0E-4D) && (v * v + x * x > 0.001D))
    {
      ☃ = ns.a(☃);
      a /= ☃;
      b /= ☃;
      if (a * v + b * x < 0.0D)
      {
        a = 0.0D;
        b = 0.0D;
      }
      else
      {
        double ☃ = ☃ / m();
        a *= ☃;
        b *= ☃;
      }
    }
  }
  
  protected void o()
  {
    double ☃ = a * a + b * b;
    if (☃ > 1.0E-4D)
    {
      ☃ = ns.a(☃);
      a /= ☃;
      b /= ☃;
      double ☃ = 1.0D;
      v *= 0.800000011920929D;
      w *= 0.0D;
      x *= 0.800000011920929D;
      v += a * ☃;
      x += b * ☃;
    }
    else
    {
      v *= 0.9800000190734863D;
      w *= 0.0D;
      x *= 0.9800000190734863D;
    }
    super.o();
  }
  
  public boolean e(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.h))
    {
      if (!bA.d) {
        if (--b == 0) {
          bi.a(bi.c, null);
        }
      }
      c += 3600;
    }
    a = (s - s);
    b = (u - u);
    
    return true;
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    ☃.a("PushX", a);
    ☃.a("PushZ", b);
    ☃.a("Fuel", (short)c);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    a = ☃.i("PushX");
    b = ☃.i("PushZ");
    c = ☃.e("Fuel");
  }
  
  protected boolean j()
  {
    return (ac.a(16) & 0x1) != 0;
  }
  
  protected void i(boolean ☃)
  {
    if (☃) {
      ac.b(16, Byte.valueOf((byte)(ac.a(16) | 0x1)));
    } else {
      ac.b(16, Byte.valueOf((byte)(ac.a(16) & 0xFFFFFFFE)));
    }
  }
  
  public alz u()
  {
    return (j() ? afi.am : afi.al).Q().a(ahb.a, cq.c);
  }
}
