import com.google.common.collect.Lists;
import java.util.List;

public class abw
  implements abs
{
  private final zx a;
  private final List<zx> b;
  
  public abw(zx ☃, List<zx> ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public zx b()
  {
    return a;
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
    List<zx> ☃ = Lists.newArrayList(b);
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
    return a.k();
  }
  
  public int a()
  {
    return b.size();
  }
}
