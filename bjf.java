import java.util.Random;
import org.lwjgl.util.vector.Vector3f;

public class bjf
  extends biv<uz>
{
  private final bjh a;
  private Random e = new Random();
  
  public bjf(biu ☃, bjh ☃)
  {
    super(☃);
    this.a = ☃;
    
    this.c = 0.15F;
    this.d = 0.75F;
  }
  
  private int a(uz ☃, double ☃, double ☃, double ☃, float ☃, boq ☃)
  {
    zx ☃ = ☃.l();
    zw ☃ = ☃.b();
    if (☃ == null) {
      return 0;
    }
    boolean ☃ = ☃.c();
    int ☃ = a(☃);
    
    float ☃ = 0.25F;
    float ☃ = ns.a((☃.o() + ☃) / 10.0F + ☃.a) * 0.1F + 0.1F;
    float ☃ = ☃.f().b(bgr.b.f).d.y;
    bfl.b((float)☃, (float)☃ + ☃ + 0.25F * ☃, (float)☃);
    if ((☃) || (this.b.g != null))
    {
      float ☃ = ((☃.o() + ☃) / 20.0F + ☃.a) * 57.295776F;
      bfl.b(☃, 0.0F, 1.0F, 0.0F);
    }
    if (!☃)
    {
      float ☃ = -0.0F * (☃ - 1) * 0.5F;
      float ☃ = -0.0F * (☃ - 1) * 0.5F;
      float ☃ = -0.046875F * (☃ - 1) * 0.5F;
      bfl.b(☃, ☃, ☃);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    return ☃;
  }
  
  private int a(zx ☃)
  {
    int ☃ = 1;
    if (☃.b > 48) {
      ☃ = 5;
    } else if (☃.b > 32) {
      ☃ = 4;
    } else if (☃.b > 16) {
      ☃ = 3;
    } else if (☃.b > 1) {
      ☃ = 2;
    }
    return ☃;
  }
  
  public void a(uz ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    zx ☃ = ☃.l();
    
    this.e.setSeed(187L);
    
    boolean ☃ = false;
    if (c(☃))
    {
      this.b.a.b(a(☃)).b(false, false);
      ☃ = true;
    }
    bfl.B();
    bfl.a(516, 0.1F);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    
    bfl.E();
    
    boq ☃ = this.a.a().a(☃);
    int ☃ = a(☃, ☃, ☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      if (☃.c())
      {
        bfl.E();
        if (☃ > 0)
        {
          float ☃ = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
          float ☃ = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
          float ☃ = (this.e.nextFloat() * 2.0F - 1.0F) * 0.15F;
          bfl.b(☃, ☃, ☃);
        }
        bfl.a(0.5F, 0.5F, 0.5F);
        ☃.f().a(bgr.b.f);
        this.a.a(☃, ☃);
        
        bfl.F();
      }
      else
      {
        bfl.E();
        ☃.f().a(bgr.b.f);
        this.a.a(☃, ☃);
        bfl.F();
        float ☃ = ☃.f().o.d.x;
        float ☃ = ☃.f().o.d.y;
        float ☃ = ☃.f().o.d.z;
        bfl.b(0.0F * ☃, 0.0F * ☃, 0.046875F * ☃);
      }
    }
    bfl.F();
    
    bfl.C();
    bfl.k();
    c(☃);
    if (☃) {
      this.b.a.b(a(☃)).a();
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(uz ☃)
  {
    return bmh.g;
  }
}
