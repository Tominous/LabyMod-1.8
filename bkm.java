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
    blb ☃ = (blb)h.get(0);
    
    l = a;
    m = new bcj();
    
    a(new bky(this));
    
    bkx ☃ = new bkx(this)
    {
      protected void a()
      {
        c = new bcn(0.5F, true);
        d = new bcn(1.0F, true);
      }
    };
    a(☃);
    o = Lists.newArrayList(h);
    if ((☃ instanceof bks))
    {
      b(☃);
      a(new bks(m.e));
    }
    b(☃);
    a(new blg(this));
    n = Lists.newArrayList(h);
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
      f = m;
      h = n;
    }
    else
    {
      f = l;
      h = o;
    }
    a = ((bbj)f);
  }
  
  protected void a(we ☃, float ☃, float ☃, float ☃)
  {
    if (☃.cp()) {
      ☃ += (float)(Math.cos(W * 3.25D) * 3.141592653589793D * 0.25D);
    }
    super.a(☃, ☃, ☃, ☃);
  }
}
