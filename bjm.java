public class bjm<T extends va>
  extends biv<T>
{
  private static final jy e = new jy("textures/entity/minecart.png");
  protected bbo a = new bbn();
  
  public bjm(biu ☃)
  {
    super(☃);
    this.c = 0.5F;
  }
  
  public void a(T ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    
    c(☃);
    
    long ☃ = ☃.F() * 493286711L;
    ☃ = ☃ * ☃ * 4392167121L + ☃ * 98761L;
    
    float ☃ = (((float)(☃ >> 16 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    float ☃ = (((float)(☃ >> 20 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    float ☃ = (((float)(☃ >> 24 & 0x7) + 0.5F) / 8.0F - 0.5F) * 0.004F;
    
    bfl.b(☃, ☃, ☃);
    
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    
    double ☃ = 0.30000001192092896D;
    
    aui ☃ = ☃.k(☃, ☃, ☃);
    
    float ☃ = ☃.B + (☃.z - ☃.B) * ☃;
    if (☃ != null)
    {
      aui ☃ = ☃.a(☃, ☃, ☃, ☃);
      aui ☃ = ☃.a(☃, ☃, ☃, -☃);
      if (☃ == null) {
        ☃ = ☃;
      }
      if (☃ == null) {
        ☃ = ☃;
      }
      ☃ += ☃.a - ☃;
      ☃ += (☃.b + ☃.b) / 2.0D - ☃;
      ☃ += ☃.c - ☃;
      
      aui ☃ = ☃.b(-☃.a, -☃.b, -☃.c);
      if (☃.b() != 0.0D)
      {
        ☃ = ☃.a();
        ☃ = (float)(Math.atan2(☃.c, ☃.a) * 180.0D / 3.141592653589793D);
        ☃ = (float)(Math.atan(☃.b) * 73.0D);
      }
    }
    bfl.b((float)☃, (float)☃ + 0.375F, (float)☃);
    
    bfl.b(180.0F - ☃, 0.0F, 1.0F, 0.0F);
    bfl.b(-☃, 0.0F, 0.0F, 1.0F);
    float ☃ = ☃.q() - ☃;
    float ☃ = ☃.p() - ☃;
    if (☃ < 0.0F) {
      ☃ = 0.0F;
    }
    if (☃ > 0.0F) {
      bfl.b(ns.a(☃) * ☃ * ☃ / 10.0F * ☃.r(), 1.0F, 0.0F, 0.0F);
    }
    int ☃ = ☃.v();
    
    alz ☃ = ☃.t();
    if (☃.c().b() != -1)
    {
      bfl.E();
      
      a(bmh.g);
      float ☃ = 0.75F;
      
      bfl.a(☃, ☃, ☃);
      bfl.b(-0.5F, (☃ - 8) / 16.0F, 0.5F);
      a(☃, ☃, ☃);
      
      bfl.F();
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      c(☃);
    }
    bfl.a(-1.0F, -1.0F, 1.0F);
    this.a.a(☃, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(T ☃)
  {
    return e;
  }
  
  protected void a(T ☃, float ☃, alz ☃)
  {
    bfl.E();
    ave.A().ae().a(☃, ☃.c(☃));
    bfl.F();
  }
}
