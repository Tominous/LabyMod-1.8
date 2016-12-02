import java.util.List;
import java.util.Random;

public class yk
  extends zw
{
  public yk()
  {
    a(yz.c);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃ == cq.a) {
      return false;
    }
    boolean ☃ = ☃.p(☃).c().a(☃, ☃);
    cj ☃ = ☃ ? ☃ : ☃.a(☃);
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    cj ☃ = ☃.a();
    boolean ☃ = (!☃.d(☃)) && (!☃.p(☃).c().a(☃, ☃));
    ☃ |= ((!☃.d(☃)) && (!☃.p(☃).c().a(☃, ☃)));
    if (☃) {
      return false;
    }
    double ☃ = ☃.n();
    double ☃ = ☃.o();
    double ☃ = ☃.p();
    
    List<pk> ☃ = ☃.b(null, aug.a(☃, ☃, ☃, ☃ + 1.0D, ☃ + 2.0D, ☃ + 1.0D));
    if (☃.size() > 0) {
      return false;
    }
    if (!☃.D)
    {
      ☃.g(☃);
      ☃.g(☃);
      
      um ☃ = new um(☃, ☃ + 0.5D, ☃, ☃ + 0.5D);
      float ☃ = ns.d((ns.g(☃.y - 180.0F) + 22.5F) / 45.0F) * 45.0F;
      ☃.b(☃ + 0.5D, ☃, ☃ + 0.5D, ☃, 0.0F);
      a(☃, ☃.s);
      dn ☃ = ☃.o();
      if ((☃ != null) && (☃.b("EntityTag", 10)))
      {
        dn ☃ = new dn();
        ☃.d(☃);
        ☃.a(☃.m("EntityTag"));
        ☃.f(☃);
      }
      ☃.d(☃);
    }
    ☃.b -= 1;
    return true;
  }
  
  private void a(um ☃, Random ☃)
  {
    dc ☃ = ☃.t();
    float ☃ = ☃.nextFloat() * 5.0F;
    float ☃ = ☃.nextFloat() * 20.0F - 10.0F;
    dc ☃ = new dc(☃.b() + ☃, ☃.c() + ☃, ☃.d());
    ☃.a(☃);
    
    ☃ = ☃.u();
    ☃ = ☃.nextFloat() * 10.0F - 5.0F;
    ☃ = new dc(☃.b(), ☃.c() + ☃, ☃.d());
    ☃.b(☃);
  }
}
