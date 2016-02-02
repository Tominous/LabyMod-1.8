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
    this.e = ☃;
    
    this.a = (☃.n() - ☃ >> 4);
    this.b = (☃.p() - ☃ >> 4);
    int ☃ = ☃.n() + ☃ >> 4;
    int ☃ = ☃.p() + ☃ >> 4;
    
    this.c = new amy[☃ - this.a + 1][☃ - this.b + 1];
    
    this.d = true;
    for (int ☃ = this.a; ☃ <= ☃; ☃++) {
      for (int ☃ = this.b; ☃ <= ☃; ☃++) {
        this.c[(☃ - this.a)][(☃ - this.b)] = ☃.a(☃, ☃);
      }
    }
    for (int ☃ = ☃.n() >> 4; ☃ <= ☃.n() >> 4; ☃++) {
      for (int ☃ = ☃.p() >> 4; ☃ <= ☃.p() >> 4; ☃++)
      {
        amy ☃ = this.c[(☃ - this.a)][(☃ - this.b)];
        if ((☃ != null) && 
          (!☃.c(☃.o(), ☃.o()))) {
          this.d = false;
        }
      }
    }
  }
  
  public boolean W()
  {
    return this.d;
  }
  
  public akw s(cj ☃)
  {
    int ☃ = (☃.n() >> 4) - this.a;
    int ☃ = (☃.p() >> 4) - this.b;
    
    return this.c[☃][☃].a(☃, amy.a.a);
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
      int ☃ = (☃.n() >> 4) - this.a;
      int ☃ = (☃.p() >> 4) - this.b;
      if ((☃ >= 0) && (☃ < this.c.length) && (☃ >= 0) && (☃ < this.c[☃].length))
      {
        amy ☃ = this.c[☃][☃];
        if (☃ != null) {
          return ☃.g(☃);
        }
      }
    }
    return afi.a.Q();
  }
  
  public ady b(cj ☃)
  {
    return this.e.b(☃);
  }
  
  private int a(ads ☃, cj ☃)
  {
    if ((☃ == ads.a) && (this.e.t.o())) {
      return 0;
    }
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return ☃.c;
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
    int ☃ = (☃.n() >> 4) - this.a;
    int ☃ = (☃.p() >> 4) - this.b;
    
    return this.c[☃][☃].a(☃, ☃);
  }
  
  public boolean d(cj ☃)
  {
    return p(☃).c().t() == arm.a;
  }
  
  public int b(ads ☃, cj ☃)
  {
    if ((☃.o() < 0) || (☃.o() >= 256)) {
      return ☃.c;
    }
    int ☃ = (☃.n() >> 4) - this.a;
    int ☃ = (☃.p() >> 4) - this.b;
    
    return this.c[☃][☃].a(☃, ☃);
  }
  
  public int a(cj ☃, cq ☃)
  {
    alz ☃ = p(☃);
    return ☃.c().b(this, ☃, ☃, ☃);
  }
  
  public adr G()
  {
    return this.e.G();
  }
}
