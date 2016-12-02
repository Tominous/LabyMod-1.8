public class bkp
  implements blb<bet>
{
  private final bln a;
  
  public bkp(bln ☃)
  {
    this.a = ☃;
  }
  
  public void a(bet ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if ((!☃.a()) || (☃.ax()) || (!☃.a(wo.a)) || (☃.k() == null)) {
      return;
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    this.a.a(☃.k());
    bfl.E();
    bfl.b(0.0F, 0.0F, 0.125F);
    
    double ☃ = ☃.bq + (☃.bt - ☃.bq) * ☃ - (☃.p + (☃.s - ☃.p) * ☃);
    double ☃ = ☃.br + (☃.bu - ☃.br) * ☃ - (☃.q + (☃.t - ☃.q) * ☃);
    double ☃ = ☃.bs + (☃.bv - ☃.bs) * ☃ - (☃.r + (☃.u - ☃.r) * ☃);
    
    float ☃ = ☃.aJ + (☃.aI - ☃.aJ) * ☃;
    
    double ☃ = ns.a(☃ * 3.1415927F / 180.0F);
    double ☃ = -ns.b(☃ * 3.1415927F / 180.0F);
    
    float ☃ = (float)☃ * 10.0F;
    ☃ = ns.a(☃, -6.0F, 32.0F);
    float ☃ = (float)(☃ * ☃ + ☃ * ☃) * 100.0F;
    float ☃ = (float)(☃ * ☃ - ☃ * ☃) * 100.0F;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    float ☃ = ☃.bn + (☃.bo - ☃.bn) * ☃;
    
    ☃ += ns.a((☃.L + (☃.M - ☃.L) * ☃) * 6.0F) * 32.0F * ☃;
    if (☃.av()) {
      ☃ += 25.0F;
    }
    bfl.b(6.0F + ☃ / 2.0F + ☃, 1.0F, 0.0F, 0.0F);
    bfl.b(☃ / 2.0F, 0.0F, 0.0F, 1.0F);
    bfl.b(-☃ / 2.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
    this.a.g().c(0.0625F);
    bfl.F();
  }
  
  public boolean b()
  {
    return false;
  }
}
