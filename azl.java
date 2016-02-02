import com.google.common.collect.Lists;
import java.util.List;

public class azl
  extends awd
{
  private final azh u;
  private final List<azk> v = Lists.newArrayList();
  private final List<azj> w = Lists.newArrayList();
  private final awd.a x = new azi();
  private int y = -1;
  
  public azl(azh ☃, ave ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    this.u = ☃;
  }
  
  public awd.a b(int ☃)
  {
    if (☃ < this.v.size()) {
      return (awd.a)this.v.get(☃);
    }
    ☃ -= this.v.size();
    if (☃ == 0) {
      return this.x;
    }
    ☃--;
    
    return (awd.a)this.w.get(☃);
  }
  
  protected int b()
  {
    return this.v.size() + 1 + this.w.size();
  }
  
  public void c(int ☃)
  {
    this.y = ☃;
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == this.y;
  }
  
  public int e()
  {
    return this.y;
  }
  
  public void a(bdf ☃)
  {
    this.v.clear();
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      this.v.add(new azk(this.u, ☃.a(☃)));
    }
  }
  
  public void a(List<bpq.a> ☃)
  {
    this.w.clear();
    for (bpq.a ☃ : ☃) {
      this.w.add(new azj(this.u, ☃));
    }
  }
  
  protected int d()
  {
    return super.d() + 30;
  }
  
  public int c()
  {
    return super.c() + 85;
  }
}
