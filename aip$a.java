public class aip$a
{
  private final adm a;
  private final cq.a b;
  private final cq c;
  private final cq d;
  private int e = 0;
  private cj f;
  private int g;
  private int h;
  
  public aip$a(adm ☃, cj ☃, cq.a ☃)
  {
    a = ☃;
    b = ☃;
    if (☃ == cq.a.a)
    {
      d = cq.f;
      c = cq.e;
    }
    else
    {
      d = cq.c;
      c = cq.d;
    }
    cj ☃ = ☃;
    while ((☃.o() > ☃.o() - 21) && (☃.o() > 0) && (a(☃.p(☃.b()).c()))) {
      ☃ = ☃.b();
    }
    int ☃ = a(☃, d) - 1;
    if (☃ >= 0)
    {
      f = ☃.a(d, ☃);
      
      h = a(f, c);
      if ((h < 2) || (h > 21))
      {
        f = null;
        h = 0;
      }
    }
    if (f != null) {
      g = c();
    }
  }
  
  protected int a(cj ☃, cq ☃)
  {
    for (int ☃ = 0; ☃ < 22; ☃++)
    {
      cj ☃ = ☃.a(☃, ☃);
      if (!a(a.p(☃).c())) {
        break;
      }
      if (a.p(☃.b()).c() != afi.Z) {
        break;
      }
    }
    afh ☃ = a.p(☃.a(☃, ☃)).c();
    if (☃ == afi.Z) {
      return ☃;
    }
    return 0;
  }
  
  public int a()
  {
    return g;
  }
  
  public int b()
  {
    return h;
  }
  
  protected int c()
  {
    for (g = 0; g < 21; g += 1) {
      for (int ☃ = 0; ☃ < h; ☃++)
      {
        cj ☃ = f.a(c, ☃).b(g);
        
        afh ☃ = a.p(☃).c();
        if (!a(☃)) {
          break label181;
        }
        if (☃ == afi.aY) {
          e += 1;
        }
        if (☃ == 0)
        {
          ☃ = a.p(☃.a(d)).c();
          if (☃ != afi.Z) {
            break label181;
          }
        }
        else if (☃ == h - 1)
        {
          ☃ = a.p(☃.a(c)).c();
          if (☃ != afi.Z) {
            break label181;
          }
        }
      }
    }
    label181:
    for (int ☃ = 0; ☃ < h; ☃++) {
      if (a.p(f.a(c, ☃).b(g)).c() != afi.Z)
      {
        g = 0;
        break;
      }
    }
    if ((g > 21) || (g < 3))
    {
      f = null;
      h = 0;
      g = 0;
      return 0;
    }
    return g;
  }
  
  protected boolean a(afh ☃)
  {
    return (J == arm.a) || (☃ == afi.ab) || (☃ == afi.aY);
  }
  
  public boolean d()
  {
    return (f != null) && (h >= 2) && (h <= 21) && (g >= 3) && (g <= 21);
  }
  
  public void e()
  {
    for (int ☃ = 0; ☃ < h; ☃++)
    {
      cj ☃ = f.a(c, ☃);
      for (int ☃ = 0; ☃ < g; ☃++) {
        a.a(☃.b(☃), afi.aY.Q().a(aip.a, b), 2);
      }
    }
  }
}
