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
    this.k = true;
    a(1.5F, 0.6F);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h()
  {
    this.ac.a(17, new Integer(0));
    this.ac.a(18, new Integer(1));
    this.ac.a(19, new Float(0.0F));
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
    
    this.v = 0.0D;
    this.w = 0.0D;
    this.x = 0.0D;
    
    this.p = ☃;
    this.q = ☃;
    this.r = ☃;
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
    if ((this.o.D) || (this.I)) {
      return true;
    }
    if ((this.l != null) && (this.l == ☃.j()) && ((☃ instanceof oy))) {
      return false;
    }
    b(-m());
    a(10);
    a(j() + ☃ * 10.0F);
    ac();
    boolean ☃ = ((☃.j() instanceof wn)) && (((wn)☃.j()).bA.d);
    if ((☃) || (j() > 40.0F))
    {
      if (this.l != null) {
        this.l.a(this);
      }
      if ((!☃) && (this.o.Q().b("doEntityDrops"))) {
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
    return !this.I;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    if ((☃) && (this.l != null))
    {
      this.p = (this.s = ☃);
      this.q = (this.t = ☃);
      this.r = (this.u = ☃);
      this.y = ☃;
      this.z = ☃;
      this.c = 0;
      b(☃, ☃, ☃);
      
      this.v = (this.i = 0.0D);
      this.w = (this.ar = 0.0D);
      this.x = (this.as = 0.0D);
      
      return;
    }
    if (this.a)
    {
      this.c = (☃ + 5);
    }
    else
    {
      double ☃ = ☃ - this.s;
      double ☃ = ☃ - this.t;
      double ☃ = ☃ - this.u;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (☃ > 1.0D) {
        this.c = 3;
      } else {
        return;
      }
    }
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = ☃;
    
    this.v = this.i;
    this.w = this.ar;
    this.x = this.as;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    this.i = (this.v = ☃);
    this.ar = (this.w = ☃);
    this.as = (this.x = ☃);
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
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    int ☃ = 5;
    double ☃ = 0.0D;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      double ☃ = aR().b + (aR().e - aR().b) * (☃ + 0) / ☃ - 0.125D;
      double ☃ = aR().b + (aR().e - aR().b) * (☃ + 1) / ☃ - 0.125D;
      aug ☃ = new aug(aR().a, ☃, aR().c, aR().d, ☃, aR().f);
      if (this.o.b(☃, arm.h)) {
        ☃ += 1.0D / ☃;
      }
    }
    double ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
    if (☃ > 0.2975D)
    {
      double ☃ = Math.cos(this.y * 3.141592653589793D / 180.0D);
      double ☃ = Math.sin(this.y * 3.141592653589793D / 180.0D);
      for (int ☃ = 0; ☃ < 1.0D + ☃ * 60.0D; ☃++)
      {
        double ☃ = this.V.nextFloat() * 2.0F - 1.0F;
        
        double ☃ = (this.V.nextInt(2) * 2 - 1) * 0.7D;
        if (this.V.nextBoolean())
        {
          double ☃ = this.s - ☃ * ☃ * 0.8D + ☃ * ☃;
          double ☃ = this.u - ☃ * ☃ * 0.8D - ☃ * ☃;
          this.o.a(cy.f, ☃, this.t - 0.125D, ☃, this.v, this.w, this.x, new int[0]);
        }
        else
        {
          double ☃ = this.s + ☃ + ☃ * ☃ * 0.7D;
          double ☃ = this.u + ☃ - ☃ * ☃ * 0.7D;
          this.o.a(cy.f, ☃, this.t - 0.125D, ☃, this.v, this.w, this.x, new int[0]);
        }
      }
    }
    if ((this.o.D) && (this.a))
    {
      if (this.c > 0)
      {
        double ☃ = this.s + (this.d - this.s) / this.c;
        double ☃ = this.t + (this.e - this.t) / this.c;
        double ☃ = this.u + (this.f - this.u) / this.c;
        
        double ☃ = ns.g(this.g - this.y);
        
        this.y = ((float)(this.y + ☃ / this.c));
        this.z = ((float)(this.z + (this.h - this.z) / this.c));
        
        this.c -= 1;
        b(☃, ☃, ☃);
        b(this.y, this.z);
      }
      else
      {
        double ☃ = this.s + this.v;
        double ☃ = this.t + this.w;
        double ☃ = this.u + this.x;
        b(☃, ☃, ☃);
        if (this.C)
        {
          this.v *= 0.5D;
          this.w *= 0.5D;
          this.x *= 0.5D;
        }
        this.v *= 0.9900000095367432D;
        this.w *= 0.949999988079071D;
        this.x *= 0.9900000095367432D;
      }
      return;
    }
    if (☃ < 1.0D)
    {
      double ☃ = ☃ * 2.0D - 1.0D;
      this.w += 0.03999999910593033D * ☃;
    }
    else
    {
      if (this.w < 0.0D) {
        this.w /= 2.0D;
      }
      this.w += 0.007000000216066837D;
    }
    if ((this.l instanceof pr))
    {
      pr ☃ = (pr)this.l;
      float ☃ = this.l.y + -☃.aZ * 90.0F;
      this.v += -Math.sin(☃ * 3.1415927F / 180.0F) * this.b * ☃.ba * 0.05000000074505806D;
      this.x += Math.cos(☃ * 3.1415927F / 180.0F) * this.b * ☃.ba * 0.05000000074505806D;
    }
    double ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
    if (☃ > 0.35D)
    {
      double ☃ = 0.35D / ☃;
      
      this.v *= ☃;
      this.x *= ☃;
      ☃ = 0.35D;
    }
    if ((☃ > ☃) && (this.b < 0.35D))
    {
      this.b += (0.35D - this.b) / 35.0D;
      if (this.b > 0.35D) {
        this.b = 0.35D;
      }
    }
    else
    {
      this.b -= (this.b - 0.07D) / 35.0D;
      if (this.b < 0.07D) {
        this.b = 0.07D;
      }
    }
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      int ☃ = ns.c(this.s + (☃ % 2 - 0.5D) * 0.8D);
      int ☃ = ns.c(this.u + (☃ / 2 - 0.5D) * 0.8D);
      for (int ☃ = 0; ☃ < 2; ☃++)
      {
        int ☃ = ns.c(this.t) + ☃;
        
        cj ☃ = new cj(☃, ☃, ☃);
        afh ☃ = this.o.p(☃).c();
        if (☃ == afi.aH)
        {
          this.o.g(☃);
          this.D = false;
        }
        else if (☃ == afi.bx)
        {
          this.o.b(☃, true);
          this.D = false;
        }
      }
    }
    if (this.C)
    {
      this.v *= 0.5D;
      this.w *= 0.5D;
      this.x *= 0.5D;
    }
    d(this.v, this.w, this.x);
    if ((this.D) && (☃ > 0.2975D))
    {
      if ((!this.o.D) && (!this.I))
      {
        J();
        if (this.o.Q().b("doEntityDrops"))
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
      this.v *= 0.9900000095367432D;
      this.w *= 0.949999988079071D;
      this.x *= 0.9900000095367432D;
    }
    this.z = 0.0F;
    double ☃ = this.y;
    double ☃ = this.p - this.s;
    double ☃ = this.r - this.u;
    if (☃ * ☃ + ☃ * ☃ > 0.001D) {
      ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.141592653589793D);
    }
    double ☃ = ns.g(☃ - this.y);
    if (☃ > 20.0D) {
      ☃ = 20.0D;
    }
    if (☃ < -20.0D) {
      ☃ = -20.0D;
    }
    this.y = ((float)(this.y + ☃));
    b(this.y, this.z);
    if (this.o.D) {
      return;
    }
    List<pk> ☃ = this.o.b(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D));
    if ((☃ != null) && (!☃.isEmpty())) {
      for (int ☃ = 0; ☃ < ☃.size(); ☃++)
      {
        pk ☃ = (pk)☃.get(☃);
        if ((☃ != this.l) && (☃.ae()) && ((☃ instanceof ux))) {
          ☃.i(this);
        }
      }
    }
    if ((this.l != null) && 
      (this.l.I)) {
      this.l = null;
    }
  }
  
  public void al()
  {
    if (this.l == null) {
      return;
    }
    double ☃ = Math.cos(this.y * 3.141592653589793D / 180.0D) * 0.4D;
    double ☃ = Math.sin(this.y * 3.141592653589793D / 180.0D) * 0.4D;
    this.l.b(this.s + ☃, this.t + an() + this.l.am(), this.u + ☃);
  }
  
  protected void b(dn ☃) {}
  
  protected void a(dn ☃) {}
  
  public boolean e(wn ☃)
  {
    if ((this.l != null) && ((this.l instanceof wn)) && (this.l != ☃)) {
      return true;
    }
    if (!this.o.D) {
      ☃.a(this);
    }
    return true;
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃)
  {
    if (☃)
    {
      if (this.O > 3.0F)
      {
        e(this.O, 1.0F);
        if ((!this.o.D) && (!this.I))
        {
          J();
          if (this.o.Q().b("doEntityDrops"))
          {
            for (int ☃ = 0; ☃ < 3; ☃++) {
              a(zw.a(afi.f), 1, 0.0F);
            }
            for (int ☃ = 0; ☃ < 2; ☃++) {
              a(zy.y, 1, 0.0F);
            }
          }
        }
        this.O = 0.0F;
      }
    }
    else if ((this.o.p(new cj(this).b()).c().t() != arm.h) && 
      (☃ < 0.0D)) {
      this.O = ((float)(this.O - ☃));
    }
  }
  
  public void a(float ☃)
  {
    this.ac.b(19, Float.valueOf(☃));
  }
  
  public float j()
  {
    return this.ac.d(19);
  }
  
  public void a(int ☃)
  {
    this.ac.b(17, Integer.valueOf(☃));
  }
  
  public int l()
  {
    return this.ac.c(17);
  }
  
  public void b(int ☃)
  {
    this.ac.b(18, Integer.valueOf(☃));
  }
  
  public int m()
  {
    return this.ac.c(18);
  }
  
  public void a(boolean ☃)
  {
    this.a = ☃;
  }
}
