import org.lwjgl.opengl.GL11;

public class bjc
  extends bjo<vt>
{
  private static final jy e = new jy("textures/entity/guardian.png");
  private static final jy j = new jy("textures/entity/guardian_elder.png");
  private static final jy k = new jy("textures/entity/guardian_beam.png");
  int a;
  
  public bjc(biu ☃)
  {
    super(☃, new bbg(), 0.5F);
    
    a = ((bbg)f).a();
  }
  
  public boolean a(vt ☃, bia ☃, double ☃, double ☃, double ☃)
  {
    if (super.a(☃, ☃, ☃, ☃, ☃)) {
      return true;
    }
    if (☃.cp())
    {
      pr ☃ = ☃.cq();
      if (☃ != null)
      {
        aui ☃ = a(☃, K * 0.5D, 1.0F);
        aui ☃ = a(☃, ☃.aS(), 1.0F);
        if (☃.a(aug.a(a, b, c, a, b, c))) {
          return true;
        }
      }
    }
    return false;
  }
  
  private aui a(pr ☃, double ☃, float ☃)
  {
    double ☃ = P + (s - P) * ☃;
    double ☃ = ☃ + Q + (t - Q) * ☃;
    double ☃ = R + (u - R) * ☃;
    return new aui(☃, ☃, ☃);
  }
  
  public void a(vt ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    if (a != ((bbg)f).a())
    {
      f = new bbg();
      a = ((bbg)f).a();
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    pr ☃ = ☃.cq();
    if (☃ != null)
    {
      float ☃ = ☃.q(☃);
      
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      
      a(k);
      GL11.glTexParameterf(3553, 10242, 10497.0F);
      GL11.glTexParameterf(3553, 10243, 10497.0F);
      bfl.f();
      bfl.p();
      bfl.k();
      bfl.a(true);
      float ☃ = 240.0F;
      bqs.a(bqs.r, ☃, ☃);
      bfl.a(770, 1, 1, 0);
      
      float ☃ = (float)o.K() + ☃;
      float ☃ = ☃ * 0.5F % 1.0F;
      float ☃ = ☃.aS();
      
      bfl.E();
      bfl.b((float)☃, (float)☃ + ☃, (float)☃);
      
      aui ☃ = a(☃, K * 0.5D, ☃);
      aui ☃ = a(☃, ☃, ☃);
      
      aui ☃ = ☃.d(☃);
      double ☃ = ☃.b() + 1.0D;
      ☃ = ☃.a();
      
      float ☃ = (float)Math.acos(b);
      float ☃ = (float)Math.atan2(c, a);
      bfl.b((1.5707964F + -☃) * 57.295776F, 0.0F, 1.0F, 0.0F);
      bfl.b(☃ * 57.295776F, 1.0F, 0.0F, 0.0F);
      
      int ☃ = 1;
      
      double ☃ = ☃ * 0.05D * (1.0D - (☃ & 0x1) * 2.5D);
      
      ☃.a(7, bms.i);
      
      float ☃ = ☃ * ☃;
      int ☃ = 64 + (int)(☃ * 240.0F);
      int ☃ = 32 + (int)(☃ * 192.0F);
      int ☃ = 128 - (int)(☃ * 64.0F);
      
      double ☃ = ☃ * 0.2D;
      double ☃ = ☃ * 1.41D;
      
      double ☃ = 0.0D + Math.cos(☃ + 2.356194490192345D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 2.356194490192345D) * ☃;
      double ☃ = 0.0D + Math.cos(☃ + 0.7853981633974483D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 0.7853981633974483D) * ☃;
      double ☃ = 0.0D + Math.cos(☃ + 3.9269908169872414D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 3.9269908169872414D) * ☃;
      double ☃ = 0.0D + Math.cos(☃ + 5.497787143782138D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 5.497787143782138D) * ☃;
      
      double ☃ = 0.0D + Math.cos(☃ + 3.141592653589793D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 3.141592653589793D) * ☃;
      double ☃ = 0.0D + Math.cos(☃ + 0.0D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 0.0D) * ☃;
      
      double ☃ = 0.0D + Math.cos(☃ + 1.5707963267948966D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 1.5707963267948966D) * ☃;
      double ☃ = 0.0D + Math.cos(☃ + 4.71238898038469D) * ☃;
      double ☃ = 0.0D + Math.sin(☃ + 4.71238898038469D) * ☃;
      
      double ☃ = ☃;
      
      double ☃ = 0.0D;
      double ☃ = 0.4999D;
      double ☃ = -1.0F + ☃;
      double ☃ = ☃ * (0.5D / ☃) + ☃;
      
      ☃.b(☃, ☃, ☃).a(0.4999D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, 0.0D, ☃).a(0.4999D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, 0.0D, ☃).a(0.0D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, ☃, ☃).a(0.0D, ☃).b(☃, ☃, ☃, 255).d();
      
      ☃.b(☃, ☃, ☃).a(0.4999D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, 0.0D, ☃).a(0.4999D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, 0.0D, ☃).a(0.0D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, ☃, ☃).a(0.0D, ☃).b(☃, ☃, ☃, 255).d();
      
      double ☃ = 0.0D;
      if (W % 2 == 0) {
        ☃ = 0.5D;
      }
      ☃.b(☃, ☃, ☃).a(0.5D, ☃ + 0.5D).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, ☃, ☃).a(1.0D, ☃ + 0.5D).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, ☃, ☃).a(1.0D, ☃).b(☃, ☃, ☃, 255).d();
      ☃.b(☃, ☃, ☃).a(0.5D, ☃).b(☃, ☃, ☃, 255).d();
      
      ☃.b();
      
      bfl.F();
    }
  }
  
  protected void a(vt ☃, float ☃)
  {
    if (☃.cn()) {
      bfl.a(2.35F, 2.35F, 2.35F);
    }
  }
  
  protected jy a(vt ☃)
  {
    return ☃.cn() ? j : e;
  }
}
