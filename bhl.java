import java.nio.FloatBuffer;
import java.util.Random;

public class bhl
  extends bhd<alp>
{
  private static final jy d = new jy("textures/environment/end_sky.png");
  private static final jy e = new jy("textures/entity/end_portal.png");
  private static final Random f = new Random(31100L);
  
  public void a(alp ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    float ☃ = (float)b.j;
    float ☃ = (float)b.k;
    float ☃ = (float)b.l;
    
    bfl.f();
    
    f.setSeed(31100L);
    
    float ☃ = 0.75F;
    for (int ☃ = 0; ☃ < 16; ☃++)
    {
      bfl.E();
      
      float ☃ = 16 - ☃;
      float ☃ = 0.0625F;
      
      float ☃ = 1.0F / (☃ + 1.0F);
      if (☃ == 0)
      {
        a(d);
        ☃ = 0.1F;
        ☃ = 65.0F;
        ☃ = 0.125F;
        bfl.l();
        bfl.b(770, 771);
      }
      if (☃ >= 1) {
        a(e);
      }
      if (☃ == 1)
      {
        bfl.l();
        bfl.b(1, 1);
        ☃ = 0.5F;
      }
      float ☃ = (float)-(☃ + ☃);
      
      float ☃ = ☃ + (float)ab;
      float ☃ = ☃ + ☃ + (float)ab;
      float ☃ = ☃ / ☃;
      ☃ = (float)(☃ + ☃) + ☃;
      
      bfl.b(☃, ☃, ☃);
      
      bfl.a(bfl.o.a, 9217);
      bfl.a(bfl.o.b, 9217);
      bfl.a(bfl.o.c, 9217);
      bfl.a(bfl.o.d, 9216);
      bfl.a(bfl.o.a, 9473, a(1.0F, 0.0F, 0.0F, 0.0F));
      bfl.a(bfl.o.b, 9473, a(0.0F, 0.0F, 1.0F, 0.0F));
      bfl.a(bfl.o.c, 9473, a(0.0F, 0.0F, 0.0F, 1.0F));
      bfl.a(bfl.o.d, 9474, a(0.0F, 1.0F, 0.0F, 0.0F));
      bfl.a(bfl.o.a);
      bfl.a(bfl.o.b);
      bfl.a(bfl.o.c);
      bfl.a(bfl.o.d);
      
      bfl.F();
      bfl.n(5890);
      
      bfl.E();
      bfl.D();
      
      bfl.b(0.0F, (float)(ave.J() % 700000L) / 700000.0F, 0.0F);
      bfl.a(☃, ☃, ☃);
      bfl.b(0.5F, 0.5F, 0.0F);
      bfl.b((☃ * ☃ * 4321 + ☃ * 9) * 2.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(-0.5F, -0.5F, 0.0F);
      bfl.b(-☃, -☃, -☃);
      float ☃ = ☃ + (float)ab;
      bfl.b((float)aa * ☃ / ☃, (float)ac * ☃ / ☃, -☃);
      
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      
      ☃.a(7, bms.f);
      
      float ☃ = (f.nextFloat() * 0.5F + 0.1F) * ☃;
      float ☃ = (f.nextFloat() * 0.5F + 0.4F) * ☃;
      float ☃ = (f.nextFloat() * 0.5F + 0.5F) * ☃;
      if (☃ == 0) {
        ☃ = ☃ = ☃ = 1.0F * ☃;
      }
      ☃.b(☃, ☃ + ☃, ☃).a(☃, ☃, ☃, 1.0F).d();
      ☃.b(☃, ☃ + ☃, ☃ + 1.0D).a(☃, ☃, ☃, 1.0F).d();
      ☃.b(☃ + 1.0D, ☃ + ☃, ☃ + 1.0D).a(☃, ☃, ☃, 1.0F).d();
      ☃.b(☃ + 1.0D, ☃ + ☃, ☃).a(☃, ☃, ☃, 1.0F).d();
      ☃.b();
      
      bfl.F();
      bfl.n(5888);
      a(d);
    }
    bfl.k();
    
    bfl.b(bfl.o.a);
    bfl.b(bfl.o.b);
    bfl.b(bfl.o.c);
    bfl.b(bfl.o.d);
    bfl.e();
  }
  
  FloatBuffer c = avd.h(16);
  
  private FloatBuffer a(float ☃, float ☃, float ☃, float ☃)
  {
    c.clear();
    c.put(☃).put(☃).put(☃).put(☃);
    c.flip();
    return c;
  }
}
