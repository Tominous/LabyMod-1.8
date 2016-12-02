public class sj
  extends rg
{
  private int e;
  private wi f;
  
  public sj(wi ☃)
  {
    super(☃, wi.class, 3.0F, 0.02F);
    this.f = ☃;
  }
  
  public void c()
  {
    super.c();
    if ((this.f.cs()) && ((this.b instanceof wi)) && (((wi)this.b).ct())) {
      this.e = 10;
    } else {
      this.e = 0;
    }
  }
  
  public void e()
  {
    super.e();
    if (this.e > 0)
    {
      this.e -= 1;
      if (this.e == 0)
      {
        oq ☃ = this.f.cq();
        for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
        {
          zx ☃ = ☃.a(☃);
          zx ☃ = null;
          if (☃ != null)
          {
            zw ☃ = ☃.b();
            if (((☃ == zy.P) || (☃ == zy.bS) || (☃ == zy.bR)) && (☃.b > 3))
            {
              int ☃ = ☃.b / 2;
              ☃.b -= ☃;
              ☃ = new zx(☃, ☃, ☃.i());
            }
            else if ((☃ == zy.O) && (☃.b > 5))
            {
              int ☃ = ☃.b / 2 / 3 * 3;
              int ☃ = ☃ / 3;
              ☃.b -= ☃;
              ☃ = new zx(zy.P, ☃, 0);
            }
            if (☃.b <= 0) {
              ☃.a(☃, null);
            }
          }
          if (☃ != null)
          {
            double ☃ = this.f.t - 0.30000001192092896D + this.f.aS();
            uz ☃ = new uz(this.f.o, this.f.s, ☃, this.f.u, ☃);
            float ☃ = 0.3F;
            float ☃ = this.f.aK;
            float ☃ = this.f.z;
            ☃.v = (-ns.a(☃ / 180.0F * 3.1415927F) * ns.b(☃ / 180.0F * 3.1415927F) * ☃);
            ☃.x = (ns.b(☃ / 180.0F * 3.1415927F) * ns.b(☃ / 180.0F * 3.1415927F) * ☃);
            ☃.w = (-ns.a(☃ / 180.0F * 3.1415927F) * ☃ + 0.1F);
            ☃.p();
            
            this.f.o.d(☃);
            
            break;
          }
        }
      }
    }
  }
}
