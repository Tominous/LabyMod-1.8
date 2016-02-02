public class biz
  extends biv<ur>
{
  private static final jy a = new jy("textures/particle/particles.png");
  
  public biz(biu ☃)
  {
    super(☃);
  }
  
  public void a(ur ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    
    bfl.b((float)☃, (float)☃, (float)☃);
    bfl.B();
    bfl.a(0.5F, 0.5F, 0.5F);
    c(☃);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = 1;
    int ☃ = 2;
    float ☃ = 0.0625F;
    float ☃ = 0.125F;
    float ☃ = 0.125F;
    float ☃ = 0.1875F;
    
    float ☃ = 1.0F;
    float ☃ = 0.5F;
    float ☃ = 0.5F;
    
    bfl.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(-this.b.f, 1.0F, 0.0F, 0.0F);
    
    ☃.a(7, bms.j);
    ☃.b(-0.5D, -0.5D, 0.0D).a(0.0625D, 0.1875D).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(0.5D, -0.5D, 0.0D).a(0.125D, 0.1875D).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(0.5D, 0.5D, 0.0D).a(0.125D, 0.125D).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(-0.5D, 0.5D, 0.0D).a(0.0625D, 0.125D).c(0.0F, 1.0F, 0.0F).d();
    ☃.b();
    
    bfl.C();
    bfl.F();
    if (☃.b != null)
    {
      float ☃ = ☃.b.l(☃);
      float ☃ = ns.a(ns.c(☃) * 3.1415927F);
      
      aui ☃ = new aui(-0.36D, 0.03D, 0.35D);
      ☃ = ☃.a(-(☃.b.B + (☃.b.z - ☃.b.B) * ☃) * 3.1415927F / 180.0F);
      ☃ = ☃.b(-(☃.b.A + (☃.b.y - ☃.b.A) * ☃) * 3.1415927F / 180.0F);
      ☃ = ☃.b(☃ * 0.5F);
      ☃ = ☃.a(-☃ * 0.7F);
      
      double ☃ = ☃.b.p + (☃.b.s - ☃.b.p) * ☃ + ☃.a;
      double ☃ = ☃.b.q + (☃.b.t - ☃.b.q) * ☃ + ☃.b;
      double ☃ = ☃.b.r + (☃.b.u - ☃.b.r) * ☃ + ☃.c;
      double ☃ = ☃.b.aS();
      if (((this.b.g != null) && (this.b.g.aA > 0)) || (☃.b != ave.A().h))
      {
        float ☃ = (☃.b.aJ + (☃.b.aI - ☃.b.aJ) * ☃) * 3.1415927F / 180.0F;
        double ☃ = ns.a(☃);
        double ☃ = ns.b(☃);
        double ☃ = 0.35D;
        double ☃ = 0.8D;
        
        ☃ = ☃.b.p + (☃.b.s - ☃.b.p) * ☃ - ☃ * 0.35D - ☃ * 0.8D;
        ☃ = ☃.b.q + ☃ + (☃.b.t - ☃.b.q) * ☃ - 0.45D;
        ☃ = ☃.b.r + (☃.b.u - ☃.b.r) * ☃ - ☃ * 0.35D + ☃ * 0.8D;
        
        ☃ = ☃.b.av() ? -0.1875D : 0.0D;
      }
      double ☃ = ☃.p + (☃.s - ☃.p) * ☃;
      double ☃ = ☃.q + (☃.t - ☃.q) * ☃ + 0.25D;
      double ☃ = ☃.r + (☃.u - ☃.r) * ☃;
      
      double ☃ = (float)(☃ - ☃);
      double ☃ = (float)(☃ - ☃) + ☃;
      double ☃ = (float)(☃ - ☃);
      
      bfl.x();
      bfl.f();
      ☃.a(3, bms.f);
      int ☃ = 16;
      for (int ☃ = 0; ☃ <= 16; ☃++)
      {
        float ☃ = ☃ / 16.0F;
        ☃.b(☃ + ☃ * ☃, ☃ + ☃ * (☃ * ☃ + ☃) * 0.5D + 0.25D, ☃ + ☃ * ☃).b(0, 0, 0, 255).d();
      }
      ☃.b();
      bfl.e();
      bfl.w();
      
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  protected jy a(ur ☃)
  {
    return a;
  }
}
