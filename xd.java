public class xd
  extends ws
{
  public xd(adm ☃)
  {
    super(☃);
    a(0.3125F, 0.3125F);
  }
  
  public xd(adm ☃, pr ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
    
    a(0.3125F, 0.3125F);
  }
  
  protected float j()
  {
    return l() ? 0.73F : super.j();
  }
  
  public xd(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a(0.3125F, 0.3125F);
  }
  
  public boolean at()
  {
    return false;
  }
  
  public float a(adi ☃, adm ☃, cj ☃, alz ☃)
  {
    float ☃ = super.a(☃, ☃, ☃, ☃);
    
    afh ☃ = ☃.c();
    if ((l()) && (uk.a(☃))) {
      ☃ = Math.min(0.8F, ☃);
    }
    return ☃;
  }
  
  protected void a(auh ☃)
  {
    if (!this.o.D)
    {
      if (☃.d != null)
      {
        if (this.a != null)
        {
          if (☃.d.a(ow.a(this.a), 8.0F)) {
            if (!☃.d.ai()) {
              this.a.h(5.0F);
            } else {
              a(this.a, ☃.d);
            }
          }
        }
        else {
          ☃.d.a(ow.l, 5.0F);
        }
        if ((☃.d instanceof pr))
        {
          int ☃ = 0;
          if (this.o.aa() == oj.c) {
            ☃ = 10;
          } else if (this.o.aa() == oj.d) {
            ☃ = 40;
          }
          if (☃ > 0) {
            ((pr)☃.d).c(new pf(pe.v.H, 20 * ☃, 1));
          }
        }
      }
      this.o.a(this, this.s, this.t, this.u, 1.0F, false, this.o.Q().b("mobGriefing"));
      J();
    }
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    return false;
  }
  
  protected void h()
  {
    this.ac.a(10, Byte.valueOf((byte)0));
  }
  
  public boolean l()
  {
    return this.ac.a(10) == 1;
  }
  
  public void a(boolean ☃)
  {
    this.ac.b(10, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
}
