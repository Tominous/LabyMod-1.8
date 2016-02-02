import java.util.Random;

public class ajw
  extends ahv
{
  protected ajw(arm ☃)
  {
    super(☃);
    
    a(false);
    if (☃ == arm.i) {
      a(true);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!e(☃, ☃, ☃)) {
      f(☃, ☃, ☃);
    }
  }
  
  private void f(adm ☃, cj ☃, alz ☃)
  {
    agl ☃ = a(this.J);
    ☃.a(☃, ☃.Q().a(b, ☃.b(b)), 2);
    ☃.a(☃, ☃, a(☃));
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (this.J != arm.i) {
      return;
    }
    if (!☃.Q().b("doFireTick")) {
      return;
    }
    int ☃ = ☃.nextInt(3);
    if (☃ > 0)
    {
      cj ☃ = ☃;
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        ☃ = ☃.a(☃.nextInt(3) - 1, 1, ☃.nextInt(3) - 1);
        afh ☃ = ☃.p(☃).c();
        if (☃.J == arm.a)
        {
          if (f(☃, ☃)) {
            ☃.a(☃, afi.ab.Q());
          }
        }
        else if (☃.J.c()) {
          return;
        }
      }
    }
    else
    {
      for (int ☃ = 0; ☃ < 3; ☃++)
      {
        cj ☃ = ☃.a(☃.nextInt(3) - 1, 0, ☃.nextInt(3) - 1);
        if ((☃.d(☃.a())) && (m(☃, ☃))) {
          ☃.a(☃.a(), afi.ab.Q());
        }
      }
    }
  }
  
  protected boolean f(adm ☃, cj ☃)
  {
    for (cq ☃ : ) {
      if (m(☃, ☃.a(☃))) {
        return true;
      }
    }
    return false;
  }
  
  private boolean m(adm ☃, cj ☃)
  {
    return ☃.p(☃).c().t().h();
  }
}
