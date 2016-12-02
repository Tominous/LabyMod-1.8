import com.google.common.collect.Lists;
import java.util.List;

public class bkm
  extends bje<we>
{
  private static final jy j = new jy("textures/entity/zombie/zombie.png");
  private static final jy k = new jy("textures/entity/zombie/zombie_villager.png");
  private final bbj l;
  private final bcj m;
  private final List<blb<we>> n;
  private final List<blb<we>> o;
  
  public bkm(biu ☃)
  {
    super(☃, new bcn(), 0.5F, 1.0F);
    blb ☃ = (blb)this.h.get(0);
    
    this.l = this.a;
    this.m = new bcj();
    
    a(new bky(this));
    
    bkx ☃ = new bkx(this)
    {
      protected void a()
      {
        this.c = new bcn(0.5F, true);
        this.d = new bcn(1.0F, true);
      }
    };
    a(☃);
    this.o = Lists.newArrayList(this.h);
    if ((☃ instanceof bks))
    {
      b(☃);
      a(new bks(this.m.e));
    }
    b(☃);
    a(new blg(this));
    this.n = Lists.newArrayList(this.h);
  }
  
  public void a(we ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    b(☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(we ☃)
  {
    if (☃.co()) {
      return k;
    }
    return j;
  }
  
  private void b(we ☃)
  {
    if (☃.co())
    {
      this.f = this.m;
      this.h = this.n;
    }
    else
    {
      this.f = this.l;
      this.h = this.o;
    }
    this.a = ((bbj)this.f);
  }
  
  protected void a(we ☃, float ☃, float ☃, float ☃)
  {
    if (☃.cp()) {
      ☃ += (float)(Math.cos(☃.W * 3.25D) * 3.141592653589793D * 0.25D);
    }
    super.a(☃, ☃, ☃, ☃);
  }
}
