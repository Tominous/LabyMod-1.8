import com.google.common.collect.ImmutableList;
import com.google.common.collect.UnmodifiableIterator;
import java.util.Random;

public class aim
  extends afh
{
  public aim()
  {
    this(arm.e.r());
  }
  
  public aim(arn ☃)
  {
    super(arm.e, ☃);
    a(yz.b);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (this == afi.q) {
      return zy.h;
    }
    if (this == afi.ag) {
      return zy.i;
    }
    if (this == afi.x) {
      return zy.aW;
    }
    if (this == afi.bP) {
      return zy.bO;
    }
    if (this == afi.co) {
      return zy.cg;
    }
    return zw.a(this);
  }
  
  public int a(Random ☃)
  {
    if (this == afi.x) {
      return 4 + ☃.nextInt(5);
    }
    return 1;
  }
  
  public int a(int ☃, Random ☃)
  {
    if ((☃ > 0) && (zw.a(this) != a((alz)P().a().iterator().next(), ☃, ☃)))
    {
      int ☃ = ☃.nextInt(☃ + 2) - 1;
      if (☃ < 0) {
        ☃ = 0;
      }
      return a(☃) * (☃ + 1);
    }
    return a(☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (a(☃, ☃.s, ☃) != zw.a(this))
    {
      int ☃ = 0;
      if (this == afi.q) {
        ☃ = ns.a(☃.s, 0, 2);
      } else if (this == afi.ag) {
        ☃ = ns.a(☃.s, 3, 7);
      } else if (this == afi.bP) {
        ☃ = ns.a(☃.s, 3, 7);
      } else if (this == afi.x) {
        ☃ = ns.a(☃.s, 2, 5);
      } else if (this == afi.co) {
        ☃ = ns.a(☃.s, 2, 5);
      }
      b(☃, ☃, ☃);
    }
  }
  
  public int j(adm ☃, cj ☃)
  {
    return 0;
  }
  
  public int a(alz ☃)
  {
    if (this == afi.x) {
      return zd.l.b();
    }
    return 0;
  }
}
