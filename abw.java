import com.google.common.collect.Lists;
import java.util.List;

public class abw
  implements abs
{
  private final zx a;
  private final List<zx> b;
  
  public abw(zx ☃, List<zx> ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public zx b()
  {
    return this.a;
  }
  
  public zx[] b(xp ☃)
  {
    zx[] ☃ = new zx[☃.o_()];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b().r())) {
        ☃[☃] = new zx(☃.b().q());
      }
    }
    return ☃;
  }
  
  public boolean a(xp ☃, adm ☃)
  {
    List<zx> ☃ = Lists.newArrayList(this.b);
    for (int ☃ = 0; ☃ < ☃.h(); ☃++) {
      for (int ☃ = 0; ☃ < ☃.i(); ☃++)
      {
        zx ☃ = ☃.c(☃, ☃);
        if (☃ != null)
        {
          boolean ☃ = false;
          for (zx ☃ : ☃) {
            if ((☃.b() == ☃.b()) && ((☃.i() == 32767) || (☃.i() == ☃.i())))
            {
              ☃ = true;
              ☃.remove(☃);
              break;
            }
          }
          if (!☃) {
            return false;
          }
        }
      }
    }
    return ☃.isEmpty();
  }
  
  public zx a(xp ☃)
  {
    return this.a.k();
  }
  
  public int a()
  {
    return this.b.size();
  }
}
