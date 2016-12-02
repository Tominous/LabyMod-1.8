import java.util.Random;

public class wr
  extends pk
{
  private double a;
  private double b;
  private double c;
  private int d;
  private boolean e;
  
  public wr(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
  }
  
  protected void h() {}
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a() * 4.0D;
    if (Double.isNaN(☃)) {
      ☃ = 4.0D;
    }
    ☃ *= 64.0D;
    return ☃ < ☃ * ☃;
  }
  
  public wr(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    d = 0;
    
    a(0.25F, 0.25F);
    
    b(☃, ☃, ☃);
  }
  
  public void a(cj ☃)
  {
    double ☃ = ☃.n();
    int ☃ = ☃.o();
    double ☃ = ☃.p();
    
    double ☃ = ☃ - s;double ☃ = ☃ - u;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    if (☃ > 12.0F)
    {
      a = (s + ☃ / ☃ * 12.0D);
      c = (u + ☃ / ☃ * 12.0D);
      b = (t + 8.0D);
    }
    else
    {
      a = ☃;
      b = ☃;
      c = ☃;
    }
    d = 0;
    e = (V.nextInt(5) > 0);
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    v = ☃;
    w = ☃;
    x = ☃;
    if ((B == 0.0F) && (A == 0.0F))
    {
      float ☃ = ns.a(☃ * ☃ + ☃ * ☃);
      A = (y = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
      B = (z = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D));
    }
  }
  
  public void t_()
  {
    P = s;
    Q = t;
    R = u;
    super.t_();
    
    s += v;
    t += w;
    u += x;
    
    float ☃ = ns.a(v * v + x * x);
    y = ((float)(ns.b(v, x) * 180.0D / 3.1415927410125732D));
    z = ((float)(ns.b(w, ☃) * 180.0D / 3.1415927410125732D));
    while (z - B < -180.0F) {
      B -= 360.0F;
    }
    while (z - B >= 180.0F) {
      B += 360.0F;
    }
    while (y - A < -180.0F) {
      A -= 360.0F;
    }
    while (y - A >= 180.0F) {
      A += 360.0F;
    }
    z = (B + (z - B) * 0.2F);
    y = (A + (y - A) * 0.2F);
    if (!o.D)
    {
      double ☃ = a - s;double ☃ = c - u;
      float ☃ = (float)Math.sqrt(☃ * ☃ + ☃ * ☃);
      float ☃ = (float)ns.b(☃, ☃);
      double ☃ = ☃ + (☃ - ☃) * 0.0025D;
      if (☃ < 1.0F)
      {
        ☃ *= 0.8D;
        w *= 0.8D;
      }
      v = (Math.cos(☃) * ☃);
      x = (Math.sin(☃) * ☃);
      if (t < b) {
        w += (1.0D - w) * 0.014999999664723873D;
      } else {
        w += (-1.0D - w) * 0.014999999664723873D;
      }
    }
    float ☃ = 0.25F;
    if (V()) {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        o.a(cy.e, s - v * ☃, t - w * ☃, u - x * ☃, v, w, x, new int[0]);
      }
    } else {
      o.a(cy.y, s - v * ☃ + V.nextDouble() * 0.6D - 0.3D, t - w * ☃ - 0.5D, u - x * ☃ + V.nextDouble() * 0.6D - 0.3D, v, w, x, new int[0]);
    }
    if (!o.D)
    {
      b(s, t, u);
      
      d += 1;
      if ((d > 80) && (!o.D))
      {
        J();
        if (e) {
          o.d(new uz(o, s, t, u, new zx(zy.bH)));
        } else {
          o.b(2003, new cj(this), 0);
        }
      }
    }
  }
  
  public void b(dn ☃) {}
  
  public void a(dn ☃) {}
  
  public float c(float ☃)
  {
    return 1.0F;
  }
  
  public int b(float ☃)
  {
    return 15728880;
  }
  
  public boolean aD()
  {
    return false;
  }
}
