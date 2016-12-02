import java.util.List;
import java.util.Random;

public class ux
  extends pk
{
  private boolean a = true;
  private double b = 0.07D;
  private int c;
  private double d;
  private double e;
  private double f;
  private double g;
  private double h;
  private double i;
  private double ar;
  private double as;
  
  public ux(adm ☃)
  {
    super(☃);
    k = true;
    a(1.5F, 0.6F);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h()
  {
    ac.a(17, new Integer(0));
    ac.a(18, new Integer(1));
    ac.a(19, new Float(0.0F));
  }
  
  public aug j(pk ☃)
  {
    return ☃.aR();
  }
  
  public aug S()
  {
    return aR();
  }
  
  public boolean ae()
  {
    return true;
  }
  
  public ux(adm ☃, double ☃, double ☃, double ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
    
    v = 0.0D;
    w = 0.0D;
    x = 0.0D;
    
    p = ☃;
    q = ☃;
    r = ☃;
  }
  
  public double an()
  {
    return -0.3D;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((o.D) || (I)) {
      return true;
    }
    if ((l != null) && (l == ☃.j()) && ((☃ instanceof oy))) {
      return false;
    }
    b(-m());
    a(10);
    a(j() + ☃ * 10.0F);
    ac();
    boolean ☃ = ((☃.j() instanceof wn)) && (jbA.d);
    if ((☃) || (j() > 40.0F))
    {
      if (l != null) {
        l.a(this);
      }
      if ((!☃) && (o.Q().b("doEntityDrops"))) {
        a(zy.aE, 1, 0.0F);
      }
      J();
    }
    return true;
  }
  
  public void ar()
  {
    b(-m());
    a(10);
    a(j() * 11.0F);
  }
  
  public boolean ad()
  {
    return !I;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    if ((☃) && (l != null))
    {
      p = (s = ☃);
      q = (t = ☃);
      r = (u = ☃);
      y = ☃;
      z = ☃;
      c = 0;
      b(☃, ☃, ☃);
      
      v = (i = 0.0D);
      w = (ar = 0.0D);
      x = (as = 0.0D);
      
      return;
    }
    if (a)
    {
      c = (☃ + 5);
    }
    else
    {
      double ☃ = ☃ - s;
      double ☃ = ☃ - t;
      double ☃ = ☃ - u;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (☃ > 1.0D) {
        c = 3;
      } else {
        return;
      }
    }
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    h = ☃;
    
    v = i;
    w = ar;
    x = as;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    i = (v = ☃);
    ar = (w = ☃);
    as = (x = ☃);
  }
  
  public void t_()
  {
    super.t_();
    if (l() > 0) {
      a(l() - 1);
    }
    if (j() > 0.0F) {
      a(j() - 1.0F);
    }
    p = s;
    q = t;
    r = u;
    
    int ☃ = 5;
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = aRb + (aRe - aRb) * (☃ + 0) / ☃ - 0.125D;
      double ☃ = aRb + (aRe - aRb) * (☃ + 1) / ☃ - 0.125D;
      aug ☃ = new aug(aRa, ☃, aRc, aRd, ☃, aRf);
      if (o.b(☃, arm.h)) {
        ☃ += 1.0D / ☃;
      }
    }
    double ☃ = Math.sqrt(v * v + x * x);
    if (☃ > 0.2975D)
    {
      double ☃ = Math.cos(y * 3.141592653589793D / 180.0D);
      double ☃ = Math.sin(y * 3.141592653589793D / 180.0D);
      for (int ☃ = 0; ☃ < 1.0D + ☃ * 60.0D; ☃++)
      {
        double ☃ = V.nextFloat() * 2.0F - 1.0F;
        
        double ☃ = (V.nextInt(2) * 2 - 1) * 0.7D;
        if (V.nextBoolean())
        {
          double ☃ = s - ☃ * ☃ * 0.8D + ☃ * ☃;
          double ☃ = u - ☃ * ☃ * 0.8D - ☃ * ☃;
          o.a(cy.f, ☃, t - 0.125D, ☃, v, w, x, new int[0]);
        }
        else
        {
          double ☃ = s + ☃ + ☃ * ☃ * 0.7D;
          double ☃ = u + ☃ - ☃ * ☃ * 0.7D;
          o.a(cy.f, ☃, t - 0.125D, ☃, v, w, x, new int[0]);
        }
      }
    }
    if ((o.D) && (a))
    {
      if (c > 0)
      {
        double ☃ = s + (d - s) / c;
        double ☃ = t + (e - t) / c;
        double ☃ = u + (f - u) / c;
        
        double ☃ = ns.g(g - y);
        
        y = ((float)(y + ☃ / c));
        z = ((float)(z + (h - z) / c));
        
        c -= 1;
        b(☃, ☃, ☃);
        b(y, z);
      }
      else
      {
        double ☃ = s + v;
        double ☃ = t + w;
        double ☃ = u + x;
        b(☃, ☃, ☃);
        if (C)
        {
          v *= 0.5D;
          w *= 0.5D;
          x *= 0.5D;
        }
        v *= 0.9900000095367432D;
        w *= 0.949999988079071D;
        x *= 0.9900000095367432D;
      }
      return;
    }
    if (☃ < 1.0D)
    {
      double ☃ = ☃ * 2.0D - 1.0D;
      w += 0.03999999910593033D * ☃;
    }
    else
    {
      if (w < 0.0D) {
        w /= 2.0D;
      }
      w += 0.007000000216066837D;
    }
    if ((l instanceof pr))
    {
      pr ☃ = (pr)l;
      float ☃ = l.y + -aZ * 90.0F;
      v += -Math.sin(☃ * 3.1415927F / 180.0F) * b * ba * 0.05000000074505806D;
      x += Math.cos(☃ * 3.1415927F / 180.0F) * b * ba * 0.05000000074505806D;
    }
    double ☃ = Math.sqrt(v * v + x * x);
    if (☃ > 0.35D)
    {
      double ☃ = 0.35D / ☃;
      
      v *= ☃;
      x *= ☃;
      ☃ = 0.35D;
    }
    if ((☃ > ☃) && (b < 0.35D))
    {
      b += (0.35D - b) / 35.0D;
      if (b > 0.35D) {
        b = 0.35D;
      }
    }
    else
    {
      b -= (b - 0.07D) / 35.0D;
      if (b < 0.07D) {
        b = 0.07D;
      }
    }
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = ns.c(s + (☃ % 2 - 0.5D) * 0.8D);
      int ☃ = ns.c(u + (☃ / 2 - 0.5D) * 0.8D);
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        int ☃ = ns.c(t) + ☃;
        
        cj ☃ = new cj(☃, ☃, ☃);
        afh ☃ = o.p(☃).c();
        if (☃ == afi.aH)
        {
          o.g(☃);
          D = false;
        }
        else if (☃ == afi.bx)
        {
          o.b(☃, true);
          D = false;
        }
      }
    }
    if (C)
    {
      v *= 0.5D;
      w *= 0.5D;
      x *= 0.5D;
    }
    d(v, w, x);
    if ((D) && (☃ > 0.2975D))
    {
      if ((!o.D) && (!I))
      {
        J();
        if (o.Q().b("doEntityDrops"))
        {
          for (int ☃ = 0; ☃ < 3; ☃++) {
            a(zw.a(afi.f), 1, 0.0F);
          }
          for (int ☃ = 0; ☃ < 2; ☃++) {
            a(zy.y, 1, 0.0F);
          }
        }
      }
    }
    else
    {
      v *= 0.9900000095367432D;
      w *= 0.949999988079071D;
      x *= 0.9900000095367432D;
    }
    z = 0.0F;
    double ☃ = y;
    double ☃ = p - s;
    double ☃ = r - u;
    if (☃ * ☃ + ☃ * ☃ > 0.001D) {
      ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.141592653589793D);
    }
    double ☃ = ns.g(☃ - y);
    if (☃ > 20.0D) {
      ☃ = 20.0D;
    }
    if (☃ < -20.0D) {
      ☃ = -20.0D;
    }
    y = ((float)(y + ☃));
    b(y, z);
    if (o.D) {
      return;
    }
    List<pk> ☃ = o.b(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
    if ((☃ != null) && (!☃.isEmpty())) {
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        if ((☃ != l) && (☃.ae()) && ((☃ instanceof ux))) {
          ☃.i(this);
        }
      }
    }
    if ((l != null) && 
      (l.I)) {
      l = null;
    }
  }
  
  public void al()
  {
    if (l == null) {
      return;
    }
    double ☃ = Math.cos(y * 3.141592653589793D / 180.0D) * 0.4D;
    double ☃ = Math.sin(y * 3.141592653589793D / 180.0D) * 0.4D;
    l.b(s + ☃, t + an() + l.am(), u + ☃);
  }
  
  protected void b(dn ☃) {}
  
  protected void a(dn ☃) {}
  
  public boolean e(wn ☃)
  {
    if ((l != null) && ((l instanceof wn)) && (l != ☃)) {
      return true;
    }
    if (!o.D) {
      ☃.a(this);
    }
    return true;
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃)
  {
    if (☃)
    {
      if (O > 3.0F)
      {
        e(O, 1.0F);
        if ((!o.D) && (!I))
        {
          J();
          if (o.Q().b("doEntityDrops"))
          {
            for (int ☃ = 0; ☃ < 3; ☃++) {
              a(zw.a(afi.f), 1, 0.0F);
            }
            for (int ☃ = 0; ☃ < 2; ☃++) {
              a(zy.y, 1, 0.0F);
            }
          }
        }
        O = 0.0F;
      }
    }
    else if ((o.p(new cj(this).b()).c().t() != arm.h) && 
      (☃ < 0.0D)) {
      O = ((float)(O - ☃));
    }
  }
  
  public void a(float ☃)
  {
    ac.b(19, Float.valueOf(☃));
  }
  
  public float j()
  {
    return ac.d(19);
  }
  
  public void a(int ☃)
  {
    ac.b(17, Integer.valueOf(☃));
  }
  
  public int l()
  {
    return ac.c(17);
  }
  
  public void b(int ☃)
  {
    ac.b(18, Integer.valueOf(☃));
  }
  
  public int m()
  {
    return ac.c(18);
  }
  
  public void a(boolean ☃)
  {
    a = ☃;
  }
}
