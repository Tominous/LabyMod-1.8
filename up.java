import java.util.List;

public class up
  extends un
{
  public up(adm ☃)
  {
    super(☃);
  }
  
  public up(adm ☃, cj ☃)
  {
    super(☃, ☃);
    b(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D);
    float ☃ = 0.125F;
    float ☃ = 0.1875F;
    float ☃ = 0.25F;
    a(new aug(this.s - 0.1875D, this.t - 0.25D + 0.125D, this.u - 0.1875D, this.s + 0.1875D, this.t + 0.25D + 0.125D, this.u + 0.1875D));
  }
  
  protected void h()
  {
    super.h();
  }
  
  public void a(cq ☃) {}
  
  public int l()
  {
    return 9;
  }
  
  public int m()
  {
    return 9;
  }
  
  public float aS()
  {
    return -0.0625F;
  }
  
  public boolean a(double ☃)
  {
    return ☃ < 1024.0D;
  }
  
  public void b(pk ☃) {}
  
  public boolean d(dn ☃)
  {
    return false;
  }
  
  public void b(dn ☃) {}
  
  public void a(dn ☃) {}
  
  public boolean e(wn ☃)
  {
    zx ☃ = ☃.bA();
    
    boolean ☃ = false;
    if ((☃ != null) && (☃.b() == zy.cn) && 
      (!this.o.D))
    {
      double ☃ = 7.0D;
      List<ps> ☃ = this.o.a(ps.class, new aug(this.s - ☃, this.t - ☃, this.u - ☃, this.s + ☃, this.t + ☃, this.u + ☃));
      for (ps ☃ : ☃) {
        if ((☃.cc()) && (☃.cd() == ☃))
        {
          ☃.a(this, true);
          ☃ = true;
        }
      }
    }
    if ((!this.o.D) && (!☃))
    {
      J();
      if (☃.bA.d)
      {
        double ☃ = 7.0D;
        List<ps> ☃ = this.o.a(ps.class, new aug(this.s - ☃, this.t - ☃, this.u - ☃, this.s + ☃, this.t + ☃, this.u + ☃));
        for (ps ☃ : ☃) {
          if ((☃.cc()) && (☃.cd() == this)) {
            ☃.a(true, false);
          }
        }
      }
    }
    return true;
  }
  
  public boolean j()
  {
    return this.o.p(this.a).c() instanceof agt;
  }
  
  public static up a(adm ☃, cj ☃)
  {
    up ☃ = new up(☃, ☃);
    ☃.n = true;
    ☃.d(☃);
    return ☃;
  }
  
  public static up b(adm ☃, cj ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    
    List<up> ☃ = ☃.a(up.class, new aug(☃ - 1.0D, ☃ - 1.0D, ☃ - 1.0D, ☃ + 1.0D, ☃ + 1.0D, ☃ + 1.0D));
    for (up ☃ : ☃) {
      if (☃.n().equals(☃)) {
        return ☃;
      }
    }
    return null;
  }
}
