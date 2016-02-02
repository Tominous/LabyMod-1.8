import java.util.Random;

public class vi
  extends va
{
  private int a = -1;
  
  public vi(adm ☃)
  {
    super(☃);
  }
  
  public vi(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  public va.a s()
  {
    return va.a.d;
  }
  
  public alz u()
  {
    return afi.W.Q();
  }
  
  public void t_()
  {
    super.t_();
    if (this.a > 0)
    {
      this.a -= 1;
      this.o.a(cy.l, this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    else if (this.a == 0)
    {
      b(this.v * this.v + this.x * this.x);
    }
    if (this.D)
    {
      double ☃ = this.v * this.v + this.x * this.x;
      if (☃ >= 0.009999999776482582D) {
        b(☃);
      }
    }
  }
  
  public boolean a(ow ☃, float ☃)
  {
    pk ☃ = ☃.i();
    if ((☃ instanceof wq))
    {
      wq ☃ = (wq)☃;
      if (☃.at()) {
        b(☃.v * ☃.v + ☃.w * ☃.w + ☃.x * ☃.x);
      }
    }
    return super.a(☃, ☃);
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    
    double ☃ = this.v * this.v + this.x * this.x;
    if ((!☃.c()) && (this.o.Q().b("doEntityDrops"))) {
      a(new zx(afi.W, 1), 0.0F);
    }
    if ((☃.o()) || (☃.c()) || (☃ >= 0.009999999776482582D)) {
      b(☃);
    }
  }
  
  protected void b(double ☃)
  {
    if (!this.o.D)
    {
      double ☃ = Math.sqrt(☃);
      if (☃ > 5.0D) {
        ☃ = 5.0D;
      }
      this.o.a(this, this.s, this.t, this.u, (float)(4.0D + this.V.nextDouble() * 1.5D * ☃), true);
      J();
    }
  }
  
  public void e(float ☃, float ☃)
  {
    if (☃ >= 3.0F)
    {
      float ☃ = ☃ / 10.0F;
      b(☃ * ☃);
    }
    super.e(☃, ☃);
  }
  
  public void a(int ☃, int ☃, int ☃, boolean ☃)
  {
    if ((☃) && (this.a < 0)) {
      j();
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 10) {
      j();
    } else {
      super.a(☃);
    }
  }
  
  public void j()
  {
    this.a = 80;
    if (!this.o.D)
    {
      this.o.a(this, (byte)10);
      if (!R()) {
        this.o.a(this, "game.tnt.primed", 1.0F, 1.0F);
      }
    }
  }
  
  public int l()
  {
    return this.a;
  }
  
  public boolean y()
  {
    return this.a > -1;
  }
  
  public float a(adi ☃, adm ☃, cj ☃, alz ☃)
  {
    if ((y()) && ((afe.d(☃)) || (afe.e(☃, ☃.a())))) {
      return 0.0F;
    }
    return super.a(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adi ☃, adm ☃, cj ☃, alz ☃, float ☃)
  {
    if ((y()) && ((afe.d(☃)) || (afe.e(☃, ☃.a())))) {
      return false;
    }
    return super.a(☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("TNTFuse", 99)) {
      this.a = ☃.f("TNTFuse");
    }
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    ☃.a("TNTFuse", this.a);
  }
}
