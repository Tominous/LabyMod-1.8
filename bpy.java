import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class bpy
  implements bqb<bpw>
{
  private final List<bqb<bpw>> a = Lists.newArrayList();
  private final Random b = new Random();
  private final jy c;
  private final bpg d;
  private double e;
  private double f;
  
  public bpy(jy ☃, double ☃, double ☃, bpg ☃)
  {
    c = ☃;
    f = ☃;
    e = ☃;
    d = ☃;
  }
  
  public int a()
  {
    int ☃ = 0;
    for (bqb<bpw> ☃ : a) {
      ☃ += ☃.a();
    }
    return ☃;
  }
  
  public bpw b()
  {
    int ☃ = a();
    if ((a.isEmpty()) || (☃ == 0)) {
      return bpz.a;
    }
    int ☃ = b.nextInt(☃);
    for (bqb<bpw> ☃ : a)
    {
      ☃ -= ☃.a();
      if (☃ < 0)
      {
        bpw ☃ = (bpw)☃.g();
        
        ☃.a(☃.b() * e);
        ☃.b(☃.c() * f);
        
        return ☃;
      }
    }
    return bpz.a;
  }
  
  public void a(bqb<bpw> ☃)
  {
    a.add(☃);
  }
  
  public jy c()
  {
    return c;
  }
  
  public bpg d()
  {
    return d;
  }
}
