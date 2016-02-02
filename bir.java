public class bir
  extends bjo<ug>
{
  private static final jy e = new jy("textures/entity/endercrystal/endercrystal_beam.png");
  private static final jy j = new jy("textures/entity/enderdragon/dragon_exploding.png");
  private static final jy k = new jy("textures/entity/enderdragon/dragon.png");
  protected bco a;
  
  public bir(biu ☃)
  {
    super(☃, new bco(0.0F), 0.5F);
    
    this.a = ((bco)this.f);
    
    a(new bkv(this));
    a(new bku());
  }
  
  protected void a(ug ☃, float ☃, float ☃, float ☃)
  {
    float ☃ = (float)☃.b(7, ☃)[0];
    float ☃ = (float)(☃.b(5, ☃)[1] - ☃.b(10, ☃)[1]);
    bfl.b(-☃, 0.0F, 1.0F, 0.0F);
    bfl.b(☃ * 10.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(0.0F, 0.0F, 1.0F);
    if (☃.ax > 0)
    {
      float ☃ = (☃.ax + ☃ - 1.0F) / 20.0F * 1.6F;
      ☃ = ns.c(☃);
      if (☃ > 1.0F) {
        ☃ = 1.0F;
      }
      bfl.b(☃ * b(☃), 0.0F, 0.0F, 1.0F);
    }
  }
  
  protected void a(ug ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if (☃.by > 0)
    {
      float ☃ = ☃.by / 200.0F;
      bfl.c(515);
      bfl.d();
      bfl.a(516, ☃);
      a(j);
      this.f.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      bfl.a(516, 0.1F);
      
      bfl.c(514);
    }
    c(☃);
    this.f.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (☃.au > 0)
    {
      bfl.c(514);
      bfl.x();
      bfl.l();
      bfl.b(770, 771);
      bfl.c(1.0F, 0.0F, 0.0F, 0.5F);
      this.f.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
      bfl.w();
      bfl.k();
      bfl.c(515);
    }
  }
  
  public void a(ug ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfc.a(☃, false);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    if (☃.bz != null) {
      a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  protected void a(ug ☃, double ☃, double ☃, double ☃, float ☃)
  {
    float ☃ = ☃.bz.a + ☃;
    float ☃ = ns.a(☃ * 0.2F) / 2.0F + 0.5F;
    ☃ = (☃ * ☃ + ☃) * 0.2F;
    
    float ☃ = (float)(☃.bz.s - ☃.s - (☃.p - ☃.s) * (1.0F - ☃));
    float ☃ = (float)(☃ + ☃.bz.t - 1.0D - ☃.t - (☃.q - ☃.t) * (1.0F - ☃));
    float ☃ = (float)(☃.bz.u - ☃.u - (☃.r - ☃.u) * (1.0F - ☃));
    
    float ☃ = ns.c(☃ * ☃ + ☃ * ☃);
    float ☃ = ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
    
    bfl.E();
    bfl.b((float)☃, (float)☃ + 2.0F, (float)☃);
    bfl.b((float)-Math.atan2(☃, ☃) * 180.0F / 3.1415927F - 90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b((float)-Math.atan2(☃, ☃) * 180.0F / 3.1415927F - 90.0F, 1.0F, 0.0F, 0.0F);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    avc.a();
    bfl.p();
    
    a(e);
    
    bfl.j(7425);
    
    float ☃ = 0.0F - (☃.W + ☃) * 0.01F;
    float ☃ = ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃) / 32.0F - (☃.W + ☃) * 0.01F;
    
    ☃.a(5, bms.i);
    
    int ☃ = 8;
    for (int ☃ = 0; ☃ <= 8; ☃++)
    {
      float ☃ = ns.a(☃ % 8 * 3.1415927F * 2.0F / 8.0F) * 0.75F;
      float ☃ = ns.b(☃ % 8 * 3.1415927F * 2.0F / 8.0F) * 0.75F;
      float ☃ = ☃ % 8 * 1.0F / 8.0F;
      ☃.b(☃ * 0.2F, ☃ * 0.2F, 0.0D).a(☃, ☃).b(0, 0, 0, 255).d();
      ☃.b(☃, ☃, ☃).a(☃, ☃).b(255, 255, 255, 255).d();
    }
    ☃.b();
    bfl.o();
    bfl.j(7424);
    
    avc.b();
    bfl.F();
  }
  
  protected jy a(ug ☃)
  {
    return k;
  }
}
