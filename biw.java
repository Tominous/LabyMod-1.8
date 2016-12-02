public class biw
  extends biv<pp>
{
  private static final jy a = new jy("textures/entity/experience_orb.png");
  
  public biw(biu ☃)
  {
    super(☃);
    this.c = 0.15F;
    this.d = 0.75F;
  }
  
  public void a(pp ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    bfl.b((float)☃, (float)☃, (float)☃);
    
    c(☃);
    
    int ☃ = ☃.l();
    float ☃ = (☃ % 4 * 16 + 0) / 64.0F;
    float ☃ = (☃ % 4 * 16 + 16) / 64.0F;
    float ☃ = (☃ / 4 * 16 + 0) / 64.0F;
    float ☃ = (☃ / 4 * 16 + 16) / 64.0F;
    
    float ☃ = 1.0F;
    float ☃ = 0.5F;
    float ☃ = 0.25F;
    
    int ☃ = ☃.b(☃);
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    float ☃ = 255.0F;
    float ☃ = (☃.a + ☃) / 2.0F;
    int ☃ = (int)((ns.a(☃ + 0.0F) + 1.0F) * 0.5F * 255.0F);
    int ☃ = 255;
    int ☃ = (int)((ns.a(☃ + 4.1887903F) + 1.0F) * 0.1F * 255.0F);
    bfl.b(180.0F - this.b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(-this.b.f, 1.0F, 0.0F, 0.0F);
    
    float ☃ = 0.3F;
    bfl.a(0.3F, 0.3F, 0.3F);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.l);
    ☃.b(0.0F - ☃, 0.0F - ☃, 0.0D).a(☃, ☃).b(☃, 255, ☃, 128).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃ - ☃, 0.0F - ☃, 0.0D).a(☃, ☃).b(☃, 255, ☃, 128).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃ - ☃, 1.0F - ☃, 0.0D).a(☃, ☃).b(☃, 255, ☃, 128).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(0.0F - ☃, 1.0F - ☃, 0.0D).a(☃, ☃).b(☃, 255, ☃, 128).c(0.0F, 1.0F, 0.0F).d();
    ☃.b();
    
    bfl.k();
    bfl.C();
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(pp ☃)
  {
    return a;
  }
}
