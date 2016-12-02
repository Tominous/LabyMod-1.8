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
    this.c = ☃;
    this.f = ☃;
    this.e = ☃;
    this.d = ☃;
  }
  
  public int a()
  {
    int ☃ = 0;
    for (bqb<bpw> ☃ : this.a) {
      ☃ += ☃.a();
    }
    return ☃;
  }
  
  public bpw b()
  {
    int ☃ = a();
    if ((this.a.isEmpty()) || (☃ == 0)) {
      return bpz.a;
    }
    int ☃ = this.b.nextInt(☃);
    for (bqb<bpw> ☃ : this.a)
    {
      ☃ -= ☃.a();
      if (☃ < 0)
      {
        bpw ☃ = (bpw)☃.g();
        
        ☃.a(☃.b() * this.e);
        ☃.b(☃.c() * this.f);
        
        return ☃;
      }
    }
    return bpz.a;
  }
  
  public void a(bqb<bpw> ☃)
  {
    this.a.add(☃);
  }
  
  public jy c()
  {
    return this.c;
  }
  
  public bpg d()
  {
    return this.d;
  }
}
