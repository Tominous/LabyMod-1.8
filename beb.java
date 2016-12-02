import java.util.Random;

public class beb
  extends pk
{
  protected int b;
  protected int c;
  protected float d;
  protected float e;
  protected int f;
  protected int g;
  protected float h;
  protected float i;
  protected float ar;
  protected float as;
  protected float at;
  protected float au = 1.0F;
  protected bmi av;
  public static double aw;
  public static double ax;
  public static double ay;
  
  protected beb(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    
    a(0.2F, 0.2F);
    b(☃, ☃, ☃);
    P = (p = ☃);
    Q = (q = ☃);
    R = (r = ☃);
    ar = (as = at = 1.0F);
    
    d = (V.nextFloat() * 3.0F);
    e = (V.nextFloat() * 3.0F);
    
    h = ((V.nextFloat() * 0.5F + 0.5F) * 2.0F);
    
    g = ((int)(4.0F / (V.nextFloat() * 0.9F + 0.1F)));
    f = 0;
  }
  
  public beb(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    this(☃, ☃, ☃, ☃);
    
    v = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    w = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    x = (☃ + (Math.random() * 2.0D - 1.0D) * 0.4000000059604645D);
    float ☃ = (float)(Math.random() + Math.random() + 1.0D) * 0.15F;
    
    float ☃ = ns.a(v * v + w * w + x * x);
    v = (v / ☃ * ☃ * 0.4000000059604645D);
    w = (w / ☃ * ☃ * 0.4000000059604645D + 0.10000000149011612D);
    x = (x / ☃ * ☃ * 0.4000000059604645D);
  }
  
  public beb a(float ☃)
  {
    v *= ☃;
    w = ((w - 0.10000000149011612D) * ☃ + 0.10000000149011612D);
    x *= ☃;
    return this;
  }
  
  public beb h(float ☃)
  {
    a(0.2F * ☃, 0.2F * ☃);
    h *= ☃;
    return this;
  }
  
  public void b(float ☃, float ☃, float ☃)
  {
    ar = ☃;
    as = ☃;
    at = ☃;
  }
  
  public void i(float ☃)
  {
    if ((au == 1.0F) && (☃ < 1.0F)) {
      Aj.b(this);
    } else if ((au < 1.0F) && (☃ == 1.0F)) {
      Aj.c(this);
    }
    au = ☃;
  }
  
  public float b()
  {
    return ar;
  }
  
  public float g()
  {
    return as;
  }
  
  public float i()
  {
    return at;
  }
  
  public float j()
  {
    return au;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h() {}
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    if (f++ >= g) {
      J();
    }
    w -= 0.04D * i;
    d(v, w, x);
    v *= 0.9800000190734863D;
    w *= 0.9800000190734863D;
    x *= 0.9800000190734863D;
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
    }
  }
  
  public void a(bfd ☃, pk ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = b / 16.0F;
    float ☃ = ☃ + 0.0624375F;
    float ☃ = c / 16.0F;
    float ☃ = ☃ + 0.0624375F;
    float ☃ = 0.1F * h;
    if (av != null)
    {
      ☃ = av.e();
      ☃ = av.f();
      ☃ = av.g();
      ☃ = av.h();
    }
    float ☃ = (float)(p + (s - p) * ☃ - aw);
    float ☃ = (float)(q + (t - q) * ☃ - ax);
    float ☃ = (float)(r + (u - r) * ☃ - ay);
    
    int ☃ = b(☃);
    int ☃ = ☃ >> 16 & 0xFFFF;
    int ☃ = ☃ & 0xFFFF;
    
    ☃.b(☃ - ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ - ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, au).a(☃, ☃).d();
    ☃.b(☃ - ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ - ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ + ☃ * ☃, ☃ + ☃ * ☃, ☃ + ☃ * ☃ + ☃ * ☃).a(☃, ☃).a(ar, as, at, au).a(☃, ☃).d();
    ☃.b(☃ + ☃ * ☃ - ☃ * ☃, ☃ - ☃ * ☃, ☃ + ☃ * ☃ - ☃ * ☃).a(☃, ☃).a(ar, as, at, au).a(☃, ☃).d();
  }
  
  public int a()
  {
    return 0;
  }
  
  public void b(dn ☃) {}
  
  public void a(dn ☃) {}
  
  public void a(bmi ☃)
  {
    int ☃ = a();
    if (☃ == 1) {
      av = ☃;
    } else {
      throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
    }
  }
  
  public void k(int ☃)
  {
    if (a() != 0) {
      throw new RuntimeException("Invalid call to Particle.setMiscTex");
    }
    b = (☃ % 16);
    c = (☃ / 16);
  }
  
  public void k()
  {
    b += 1;
  }
  
  public boolean aD()
  {
    return false;
  }
  
  public String toString()
  {
    return getClass().getSimpleName() + ", Pos (" + s + "," + t + "," + u + "), RGBA (" + ar + "," + as + "," + at + "," + au + "), Age " + f;
  }
}
