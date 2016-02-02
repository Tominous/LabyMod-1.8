import java.util.List;
import java.util.Random;

public class bko
  implements blb<pr>
{
  private final bjl a;
  
  public bko(bjl p_i46124_1_)
  {
    this.a = p_i46124_1_;
  }
  
  public void a(pr entitylivingbaseIn, float p_177141_2_, float p_177141_3_, float partialTicks, float p_177141_5_, float p_177141_6_, float p_177141_7_, float scale)
  {
    int i = entitylivingbaseIn.bv();
    if (i > 0)
    {
      pk entity = new wq(entitylivingbaseIn.o, entitylivingbaseIn.s, entitylivingbaseIn.t, entitylivingbaseIn.u);
      Random random = new Random(entitylivingbaseIn.F());
      avc.a();
      for (int j = 0; j < i; j++)
      {
        bfl.E();
        bct modelrenderer = this.a.b().a(random);
        if (!modelrenderer.k)
        {
          bcr modelbox = (bcr)modelrenderer.l.get(random.nextInt(modelrenderer.l.size()));
          modelrenderer.c(0.0625F);
          float f = random.nextFloat();
          float f1 = random.nextFloat();
          float f2 = random.nextFloat();
          float f3 = (modelbox.a + (modelbox.d - modelbox.a) * f) / 16.0F;
          float f4 = (modelbox.b + (modelbox.e - modelbox.b) * f1) / 16.0F;
          float f5 = (modelbox.c + (modelbox.f - modelbox.c) * f2) / 16.0F;
          bfl.b(f3, f4, f5);
          f = f * 2.0F - 1.0F;
          f1 = f1 * 2.0F - 1.0F;
          f2 = f2 * 2.0F - 1.0F;
          f *= -1.0F;
          f1 *= -1.0F;
          f2 *= -1.0F;
          float f6 = ns.c(f * f + f2 * f2);
          entity.A = (entity.y = (float)(Math.atan2(f, f2) * 180.0D / 3.141592653589793D));
          entity.B = (entity.z = (float)(Math.atan2(f1, f6) * 180.0D / 3.141592653589793D));
          double d0 = 0.0D;
          double d1 = 0.0D;
          double d2 = 0.0D;
          this.a.d().a(entity, d0, d1, d2, 0.0F, partialTicks);
        }
        bfl.F();
      }
      avc.b();
    }
  }
  
  public boolean b()
  {
    return false;
  }
}
