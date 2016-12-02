public class adv
  implements adq
{
  protected int a;
  protected int b;
  protected amy[][] c;
  protected boolean d;
  protected adm e;
  
  public adv(adm ☃, cj ☃, cj ☃, int ☃)
  {
    e = ☃;
    
    a = (☃.n() - ☃ >> 4);
    b = (☃.p() - ☃ >> 4);
    int ☃ = ☃.n() + ☃ >> 4;
    int ☃ = ☃.p() + ☃ >> 4;
    
    c = new amy[☃ - a + 1][☃ - b + 1];
    
    d = true;
    for (int ☃ = a; ☃ <= ☃; ☃++) {
      for (int ☃ = b; ☃ <= ☃; ☃++) {
        c[(☃ - a)][(☃ - b)] = ☃.a(☃, ☃);
      }
    }
    for (int ☃ = ☃.n() >> 4; ☃ <= ☃.n() >> 4; ☃++) {
      for (int ☃ = ☃.p() >> 4; ☃ <= ☃.p() >> 4; ☃++)
      {
        amy ☃ = c[(☃ - a)][(☃ - b)];
        if ((☃ != null) && 
          (!☃.c(☃.o(), ☃.o()))) {
          d = false;
        }
      }
    }
  }
  
  public boolean W()
  {
    return d;
  }
  
  public akw s(cj ☃)
  {
    int ☃ = (☃.n() >> 4) - a;
    int ☃ = (☃.p() >> 4) - b;
    
    return c[☃][☃].a(☃, amy.a.a);
  }
  
  public int b(cj ☃, int ☃)
  {
    int ☃ = a(ads.a, ☃);
    int ☃ = a(ads.b, ☃);
    if (☃ < ☃) {
      ☃ = ☃;
    }
    return ☃ << 20 | ☃ << 4;
  }
  
  public alz p(cj ☃)
  {
    if ((☃.o() >= 0) && 
      (☃.o() < 256))
    {
      int ☃ = (☃.n() >> 4) - a;
      int ☃ = (☃.p() >> 4) - b;
      if ((☃ >= 0) && (☃ < c.length) && (☃ >= 0) && (☃ < c[☃].length))
      {
        amy ☃ = c[☃][☃];
        if (☃ != null) {
          return ☃.g(☃);
        }
      }
    }
    return afi.a.Q();
  }
  
  public ady b(cj ☃)
  {
    return e.b(☃);
  }
  
  private int a(ads ☃, cj ☃)
  {
    if ((☃ == ads.a) && (e.t.o())) {
      return 0;
    }
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return c;
    }
    if (p(☃).c().s())
    {
      int ☃ = 0;
      for (cq ☃ : cq.values())
      {
        int ☃ = b(☃, ☃.a(☃));
        if (☃ > ☃) {
          ☃ = ☃;
        }
        if (☃ >= 15) {
          return ☃;
        }
      }
      return ☃;
    }
    int ☃ = (☃.n() >> 4) - a;
    int ☃ = (☃.p() >> 4) - b;
    
    return c[☃][☃].a(☃, ☃);
  }
  
  public boolean d(cj ☃)
  {
    return p(☃).c().t() == arm.a;
  }
  
  public int b(ads ☃, cj ☃)
  {
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return c;
    }
    int ☃ = (☃.n() >> 4) - a;
    int ☃ = (☃.p() >> 4) - b;
    
    return c[☃][☃].a(☃, ☃);
  }
  
  public int a(cj ☃, cq ☃)
  {
    alz ☃ = p(☃);
    return ☃.c().b(this, ☃, ☃, ☃);
  }
  
  public adr G()
  {
    return e.G();
  }
}
