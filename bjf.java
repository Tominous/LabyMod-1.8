import java.util.Random;
import mods.itemphysic.ClientPhysic;
import org.lwjgl.util.vector.Vector3f;

public class bjf
  extends biv<uz>
{
  private final bjh a;
  private Random e = new Random();
  
  public bjf(biu renderManagerIn, bjh p_i46167_2_)
  {
    super(renderManagerIn);
    this.a = p_i46167_2_;
    this.c = 0.15F;
    this.d = 0.75F;
  }
  
  private int a(uz itemIn, double p_177077_2_, double p_177077_4_, double p_177077_6_, float p_177077_8_, boq p_177077_9_)
  {
    zx itemstack = itemIn.l();
    zw item = itemstack.b();
    if (item == null) {
      return 0;
    }
    boolean flag = p_177077_9_.c();
    int i = a(itemstack);
    float f = 0.25F;
    float f1 = ns.a((itemIn.o() + p_177077_8_) / 10.0F + itemIn.a) * 0.1F + 0.1F;
    float f2 = p_177077_9_.f().b(bgr.b.f).d.y;
    bfl.b((float)p_177077_2_, (float)p_177077_4_ + f1 + 0.25F * f2, (float)p_177077_6_);
    if ((flag) || (this.b.g != null))
    {
      float f3 = ((itemIn.o() + p_177077_8_) / 20.0F + itemIn.a) * 57.295776F;
      bfl.b(f3, 0.0F, 1.0F, 0.0F);
    }
    if (!flag)
    {
      float f6 = -0.0F * (i - 1) * 0.5F;
      float f4 = -0.0F * (i - 1) * 0.5F;
      float f5 = -0.046875F * (i - 1) * 0.5F;
      bfl.b(f6, f4, f5);
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    return i;
  }
  
  private int a(zx stack)
  {
    int i = 1;
    if (stack.b > 48) {
      i = 5;
    } else if (stack.b > 32) {
      i = 4;
    } else if (stack.b > 16) {
      i = 3;
    } else if (stack.b > 1) {
      i = 2;
    }
    return i;
  }
  
  public void a(uz entity, double x, double y, double z, float entityYaw, float partialTicks)
  {
    ClientPhysic.doRender(entity, x, y, z, entityYaw, partialTicks);
  }
  
  protected jy a(uz entity)
  {
    return bmh.g;
  }
}
