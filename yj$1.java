import com.google.common.base.Predicates;
import java.util.List;

final class yj$1
  extends cn
{
  protected zx b(ck ☃, zx ☃)
  {
    cj ☃ = ☃.d().a(agg.b(☃.f()));
    
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    aug ☃ = new aug(☃, ☃, ☃, ☃ + 1, ☃ + 1, ☃ + 1);
    List<pr> ☃ = ☃.i().a(pr.class, ☃, Predicates.and(po.d, new po.a(☃)));
    if (☃.size() > 0)
    {
      pr ☃ = (pr)☃.get(0);
      int ☃ = (☃ instanceof wn) ? 1 : 0;
      int ☃ = ps.c(☃);
      zx ☃ = ☃.k();
      b = 1;
      ☃.c(☃ - ☃, ☃);
      if ((☃ instanceof ps)) {
        ((ps)☃).a(☃, 2.0F);
      }
      b -= 1;
      return ☃;
    }
    return super.b(☃, ☃);
  }
}
