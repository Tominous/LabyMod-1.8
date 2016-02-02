import com.google.common.collect.Lists;
import java.util.List;

public class zo
  extends zw
{
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.D)
    {
      wt ☃ = new wt(☃, ☃.n() + ☃, ☃.o() + ☃, ☃.p() + ☃, ☃);
      ☃.d(☃);
      if (!☃.bA.d) {
        ☃.b -= 1;
      }
      return true;
    }
    return false;
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    if (!☃.n()) {
      return;
    }
    dn ☃ = ☃.o().m("Fireworks");
    if (☃ == null) {
      return;
    }
    if (☃.b("Flight", 99)) {
      ☃.add(di.a("item.fireworks.flight") + " " + ☃.d("Flight"));
    }
    du ☃ = ☃.c("Explosions", 10);
    if ((☃ != null) && (☃.c() > 0)) {
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        
        List<String> ☃ = Lists.newArrayList();
        zn.a(☃, ☃);
        if (☃.size() > 0)
        {
          for (int ☃ = 1; ☃ < ☃.size(); ☃++) {
            ☃.set(☃, "  " + (String)☃.get(☃));
          }
          ☃.addAll(☃);
        }
      }
    }
  }
}
