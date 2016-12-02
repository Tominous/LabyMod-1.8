public class sj
  extends rg
{
  private int e;
  private wi f;
  
  public sj(wi ☃)
  {
    super(☃, wi.class, 3.0F, 0.02F);
    f = ☃;
  }
  
  public void c()
  {
    super.c();
    if ((f.cs()) && ((b instanceof wi)) && (((wi)b).ct())) {
      e = 10;
    } else {
      e = 0;
    }
  }
  
  public void e()
  {
    super.e();
    if (e > 0)
    {
      e -= 1;
      if (e == 0)
      {
        oq ☃ = f.cq();
        for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
        {
          zx ☃ = ☃.a(☃);
          zx ☃ = null;
          if (☃ != null)
          {
            zw ☃ = ☃.b();
            if (((☃ == zy.P) || (☃ == zy.bS) || (☃ == zy.bR)) && (b > 3))
            {
              int ☃ = b / 2;
              b -= ☃;
              ☃ = new zx(☃, ☃, ☃.i());
            }
            else if ((☃ == zy.O) && (b > 5))
            {
              int ☃ = b / 2 / 3 * 3;
              int ☃ = ☃ / 3;
              b -= ☃;
              ☃ = new zx(zy.P, ☃, 0);
            }
            if (b <= 0) {
              ☃.a(☃, null);
            }
          }
          if (☃ != null)
          {
            double ☃ = f.t - 0.30000001192092896D + f.aS();
            uz ☃ = new uz(f.o, f.s, ☃, f.u, ☃);
            float ☃ = 0.3F;
            float ☃ = f.aK;
            float ☃ = f.z;
            v = (-ns.a(☃ / 180.0F * 3.1415927F) * ns.b(☃ / 180.0F * 3.1415927F) * ☃);
            x = (ns.b(☃ / 180.0F * 3.1415927F) * ns.b(☃ / 180.0F * 3.1415927F) * ☃);
            w = (-ns.a(☃ / 180.0F * 3.1415927F) * ☃ + 0.1F);
            ☃.p();
            
            f.o.d(☃);
            
            break;
          }
        }
      }
    }
  }
}
