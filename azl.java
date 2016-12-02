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
    u = ☃;
  }
  
  public awd.a b(int ☃)
  {
    if (☃ < v.size()) {
      return (awd.a)v.get(☃);
    }
    ☃ -= v.size();
    if (☃ == 0) {
      return x;
    }
    ☃--;
    
    return (awd.a)w.get(☃);
  }
  
  protected int b()
  {
    return v.size() + 1 + w.size();
  }
  
  public void c(int ☃)
  {
    y = ☃;
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == y;
  }
  
  public int e()
  {
    return y;
  }
  
  public void a(bdf ☃)
  {
    v.clear();
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      v.add(new azk(u, ☃.a(☃)));
    }
  }
  
  public void a(List<bpq.a> ☃)
  {
    w.clear();
    for (bpq.a ☃ : ☃) {
      w.add(new azj(u, ☃));
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
