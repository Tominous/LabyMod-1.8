public class bkk
  extends biv<xd>
{
  private static final jy a = new jy("textures/entity/wither/wither_invulnerable.png");
  private static final jy e = new jy("textures/entity/wither/wither.png");
  private final bbz f;
  
  public bkk(biu ☃)
  {
    super(☃);
    this.f = new bbz();
  }
  
  private float a(float ☃, float ☃, float ☃)
  {
    float ☃ = ☃ - ☃;
    while (☃ < -180.0F) {
      ☃ += 360.0F;
    }
    while (☃ >= 180.0F) {
      ☃ -= 360.0F;
    }
    return ☃ + ☃ * ☃;
  }
  
  public void a(xd ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    bfl.p();
    
    float ☃ = a(☃.A, ☃.y, ☃);
    float ☃ = ☃.B + (☃.z - ☃.B) * ☃;
    
    bfl.b((float)☃, (float)☃, (float)☃);
    
    float ☃ = 0.0625F;
    bfl.B();
    bfl.a(-1.0F, -1.0F, 1.0F);
    
    bfl.d();
    
    c(☃);
    
    this.f.a(☃, 0.0F, 0.0F, 0.0F, ☃, ☃, ☃);
    
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(xd ☃)
  {
    return ☃.l() ? a : e;
  }
}
