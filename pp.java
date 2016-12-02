import java.util.Random;

public class pp
  extends pk
{
  public int a;
  public int b;
  public int c;
  private int d = 5;
  private int e;
  private wn f;
  private int g;
  
  public pp(adm ☃, double ☃, double ☃, double ☃, int ☃)
  {
    super(☃);
    a(0.5F, 0.5F);
    b(☃, ☃, ☃);
    
    y = ((float)(Math.random() * 360.0D));
    
    v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    w = ((float)(Math.random() * 0.2D) * 2.0F);
    x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D) * 2.0F);
    
    e = ☃;
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public pp(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
  }
  
  protected void h() {}
  
  public int b(float ☃)
  {
    float ☃ = 0.5F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    int ☃ = super.b(☃);
    
    int ☃ = ☃ & 0xFF;
    int ☃ = ☃ >> 16 & 0xFF;
    ☃ += (int)(☃ * 15.0F * 16.0F);
    if (☃ > 240) {
      ☃ = 240;
    }
    return ☃ | ☃ << 16;
  }
  
  public void t_()
  {
    super.t_();
    if (c > 0) {
      c -= 1;
    }
    p = s;
    q = t;
    r = u;
    
    w -= 0.029999999329447746D;
    if (o.p(new cj(this)).c().t() == arm.i)
    {
      w = 0.20000000298023224D;
      v = ((V.nextFloat() - V.nextFloat()) * 0.2F);
      x = ((V.nextFloat() - V.nextFloat()) * 0.2F);
      a("random.fizz", 0.4F, 2.0F + V.nextFloat() * 0.4F);
    }
    j(s, (aRb + aRe) / 2.0D, u);
    
    double ☃ = 8.0D;
    if (g < a - 20 + F() % 100)
    {
      if ((f == null) || (f.h(this) > ☃ * ☃)) {
        f = o.a(this, ☃);
      }
      g = a;
    }
    if ((f != null) && (f.v())) {
      f = null;
    }
    if (f != null)
    {
      double ☃ = (f.s - s) / ☃;
      double ☃ = (f.t + f.aS() - t) / ☃;
      double ☃ = (f.u - u) / ☃;
      double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      double ☃ = 1.0D - ☃;
      if (☃ > 0.0D)
      {
        ☃ *= ☃;
        v += ☃ / ☃ * ☃ * 0.1D;
        w += ☃ / ☃ * ☃ * 0.1D;
        x += ☃ / ☃ * ☃ * 0.1D;
      }
    }
    d(v, w, x);
    
    float ☃ = 0.98F;
    if (C) {
      ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.98F;
    }
    v *= ☃;
    w *= 0.9800000190734863D;
    x *= ☃;
    if (C) {
      w *= -0.8999999761581421D;
    }
    a += 1;
    
    b += 1;
    if (b >= 6000) {
      J();
    }
  }
  
  public boolean W()
  {
    return o.a(aR(), arm.h, this);
  }
  
  protected void f(int ☃)
  {
    a(ow.a, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    ac();
    d = ((int)(d - ☃));
    if (d <= 0) {
      J();
    }
    return false;
  }
  
  public void b(dn ☃)
  {
    ☃.a("Health", (short)(byte)d);
    ☃.a("Age", (short)b);
    ☃.a("Value", (short)e);
  }
  
  public void a(dn ☃)
  {
    d = (☃.e("Health") & 0xFF);
    b = ☃.e("Age");
    e = ☃.e("Value");
  }
  
  public void d(wn ☃)
  {
    if (o.D) {
      return;
    }
    if ((c == 0) && (bp == 0))
    {
      bp = 2;
      o.a(☃, "random.orb", 0.1F, 0.5F * ((V.nextFloat() - V.nextFloat()) * 0.7F + 1.8F));
      ☃.a(this, 1);
      ☃.u(e);
      J();
    }
  }
  
  public int j()
  {
    return e;
  }
  
  public int l()
  {
    if (e >= 2477) {
      return 10;
    }
    if (e >= 1237) {
      return 9;
    }
    if (e >= 617) {
      return 8;
    }
    if (e >= 307) {
      return 7;
    }
    if (e >= 149) {
      return 6;
    }
    if (e >= 73) {
      return 5;
    }
    if (e >= 37) {
      return 4;
    }
    if (e >= 17) {
      return 3;
    }
    if (e >= 7) {
      return 2;
    }
    if (e >= 3) {
      return 1;
    }
    return 0;
  }
  
  public static int a(int ☃)
  {
    if (☃ >= 2477) {
      return 2477;
    }
    if (☃ >= 1237) {
      return 1237;
    }
    if (☃ >= 617) {
      return 617;
    }
    if (☃ >= 307) {
      return 307;
    }
    if (☃ >= 149) {
      return 149;
    }
    if (☃ >= 73) {
      return 73;
    }
    if (☃ >= 37) {
      return 37;
    }
    if (☃ >= 17) {
      return 17;
    }
    if (☃ >= 7) {
      return 7;
    }
    if (☃ >= 3) {
      return 3;
    }
    return 1;
  }
  
  public boolean aD()
  {
    return false;
  }
}
