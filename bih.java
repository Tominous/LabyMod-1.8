import org.lwjgl.opengl.GL11;

public class bih
  extends biv<wq>
{
  private static final jy a = new jy("textures/entity/arrow.png");
  
  public bih(biu ☃)
  {
    super(☃);
  }
  
  public void a(wq ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    c(☃);
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.E();
    
    bfl.b((float)☃, (float)☃, (float)☃);
    bfl.b(A + (y - A) * ☃ - 90.0F, 0.0F, 1.0F, 0.0F);
    bfl.b(B + (z - B) * ☃, 0.0F, 0.0F, 1.0F);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = 0;
    
    float ☃ = 0.0F;
    float ☃ = 0.5F;
    float ☃ = (0 + ☃ * 10) / 32.0F;
    float ☃ = (5 + ☃ * 10) / 32.0F;
    
    float ☃ = 0.0F;
    float ☃ = 0.15625F;
    float ☃ = (5 + ☃ * 10) / 32.0F;
    float ☃ = (10 + ☃ * 10) / 32.0F;
    float ☃ = 0.05625F;
    bfl.B();
    float ☃ = b - ☃;
    if (☃ > 0.0F)
    {
      float ☃ = -ns.a(☃ * 3.0F) * ☃;
      bfl.b(☃, 0.0F, 0.0F, 1.0F);
    }
    bfl.b(45.0F, 1.0F, 0.0F, 0.0F);
    bfl.a(☃, ☃, ☃);
    
    bfl.b(-4.0F, 0.0F, 0.0F);
    
    GL11.glNormal3f(☃, 0.0F, 0.0F);
    ☃.a(7, bms.g);
    ☃.b(-7.0D, -2.0D, -2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, -2.0D, 2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, 2.0D, 2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, 2.0D, -2.0D).a(☃, ☃).d();
    ☃.b();
    
    GL11.glNormal3f(-☃, 0.0F, 0.0F);
    ☃.a(7, bms.g);
    ☃.b(-7.0D, 2.0D, -2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, 2.0D, 2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, -2.0D, 2.0D).a(☃, ☃).d();
    ☃.b(-7.0D, -2.0D, -2.0D).a(☃, ☃).d();
    ☃.b();
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
      GL11.glNormal3f(0.0F, 0.0F, ☃);
      ☃.a(7, bms.g);
      ☃.b(-8.0D, -2.0D, 0.0D).a(☃, ☃).d();
      ☃.b(8.0D, -2.0D, 0.0D).a(☃, ☃).d();
      ☃.b(8.0D, 2.0D, 0.0D).a(☃, ☃).d();
      ☃.b(-8.0D, 2.0D, 0.0D).a(☃, ☃).d();
      ☃.b();
    }
    bfl.C();
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(wq ☃)
  {
    return a;
  }
}
