import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqg$c
  extends aqt
{
  private List<aqe> a = Lists.newLinkedList();
  
  public aqg$c() {}
  
  public aqg$c(int ☃, Random ☃, int ☃, int ☃)
  {
    super(☃);
    
    l = new aqe(☃, 50, ☃, ☃ + 7 + ☃.nextInt(6), 54 + ☃.nextInt(6), ☃ + 7 + ☃.nextInt(6));
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    
    int ☃ = l.d() - 3 - 1;
    if (☃ <= 0) {
      ☃ = 1;
    }
    int ☃ = 0;
    while (☃ < l.c())
    {
      ☃ += ☃.nextInt(l.c());
      if (☃ + 3 > l.c()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, l.a + ☃, l.b + ☃.nextInt(☃) + 1, l.c - 1, cq.c, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        a.add(new aqe(a, b, l.c, d, e, l.c + 1));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < l.c())
    {
      ☃ += ☃.nextInt(l.c());
      if (☃ + 3 > l.c()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, l.a + ☃, l.b + ☃.nextInt(☃) + 1, l.f + 1, cq.d, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        a.add(new aqe(a, b, l.f - 1, d, e, l.f));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < l.e())
    {
      ☃ += ☃.nextInt(l.e());
      if (☃ + 3 > l.e()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, l.a - 1, l.b + ☃.nextInt(☃) + 1, l.c + ☃, cq.e, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        a.add(new aqe(l.a, b, c, l.a + 1, e, f));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < l.e())
    {
      ☃ += ☃.nextInt(l.e());
      if (☃ + 3 > l.e()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, l.d + 1, l.b + ☃.nextInt(☃) + 1, l.c + ☃, cq.f, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        a.add(new aqe(l.d - 1, b, c, l.d, e, f));
      }
      ☃ += 4;
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, l.a, l.b, l.c, l.d, l.b, l.f, afi.d.Q(), afi.a.Q(), true);
    
    a(☃, ☃, l.a, l.b + 1, l.c, l.d, Math.min(l.b + 3, l.e), l.f, afi.a.Q(), afi.a.Q(), false);
    for (aqe ☃ : a) {
      a(☃, ☃, a, e - 2, c, d, e, f, afi.a.Q(), afi.a.Q(), false);
    }
    a(☃, ☃, l.a, l.b + 4, l.c, l.d, l.e, l.f, afi.a.Q(), false);
    
    return true;
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    for (aqe ☃ : a) {
      ☃.a(☃, ☃, ☃);
    }
  }
  
  protected void a(dn ☃)
  {
    du ☃ = new du();
    for (aqe ☃ : a) {
      ☃.a(☃.g());
    }
    ☃.a("Entrances", ☃);
  }
  
  protected void b(dn ☃)
  {
    du ☃ = ☃.c("Entrances", 11);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      a.add(new aqe(☃.c(☃)));
    }
  }
}
