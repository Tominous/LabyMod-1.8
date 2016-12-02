public class bga
{
  protected final bfr a;
  protected final adm b;
  protected int c;
  protected int d;
  protected int e;
  public bht[] f;
  
  public bga(adm ☃, int ☃, bfr ☃, bhu ☃)
  {
    a = ☃;
    b = ☃;
    
    a(☃);
    a(☃);
  }
  
  protected void a(bhu ☃)
  {
    int ☃ = d * c * e;
    f = new bht[☃];
    
    int ☃ = 0;
    for (int ☃ = 0; ☃ < d; ☃++) {
      for (int ☃ = 0; ☃ < c; ☃++) {
        for (int ☃ = 0; ☃ < e; ☃++)
        {
          int ☃ = (☃ * c + ☃) * d + ☃;
          cj ☃ = new cj(☃ * 16, ☃ * 16, ☃ * 16);
          f[☃] = ☃.a(b, a, ☃, ☃++);
        }
      }
    }
  }
  
  public void a()
  {
    for (bht ☃ : f) {
      ☃.a();
    }
  }
  
  protected void a(int ☃)
  {
    int ☃ = ☃ * 2 + 1;
    d = ☃;
    c = 16;
    e = ☃;
  }
  
  public void a(double ☃, double ☃)
  {
    int ☃ = ns.c(☃) - 8;
    int ☃ = ns.c(☃) - 8;
    
    int ☃ = d * 16;
    for (int ☃ = 0; ☃ < d; ☃++)
    {
      int ☃ = a(☃, ☃, ☃);
      for (int ☃ = 0; ☃ < e; ☃++)
      {
        int ☃ = a(☃, ☃, ☃);
        for (int ☃ = 0; ☃ < c; ☃++)
        {
          int ☃ = ☃ * 16;
          
          bht ☃ = f[((☃ * c + ☃) * d + ☃)];
          cj ☃ = new cj(☃, ☃, ☃);
          if (!☃.equals(☃.j())) {
            ☃.a(☃);
          }
        }
      }
    }
  }
  
  private int a(int ☃, int ☃, int ☃)
  {
    int ☃ = ☃ * 16;
    int ☃ = ☃ - ☃ + ☃ / 2;
    if (☃ < 0) {
      ☃ -= ☃ - 1;
    }
    return ☃ - ☃ / ☃ * ☃;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = ns.a(☃, 16);
    int ☃ = ns.a(☃, 16);
    int ☃ = ns.a(☃, 16);
    int ☃ = ns.a(☃, 16);
    int ☃ = ns.a(☃, 16);
    int ☃ = ns.a(☃, 16);
    for (int ☃ = ☃; ☃ <= ☃; ☃++)
    {
      int ☃ = ☃ % d;
      if (☃ < 0) {
        ☃ += d;
      }
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        int ☃ = ☃ % c;
        if (☃ < 0) {
          ☃ += c;
        }
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          int ☃ = ☃ % e;
          if (☃ < 0) {
            ☃ += e;
          }
          int ☃ = (☃ * c + ☃) * d + ☃;
          bht ☃ = f[☃];
          ☃.a(true);
        }
      }
    }
  }
  
  protected bht a(cj ☃)
  {
    int ☃ = ns.a(☃.n(), 16);
    int ☃ = ns.a(☃.o(), 16);
    int ☃ = ns.a(☃.p(), 16);
    if ((☃ < 0) || (☃ >= c)) {
      return null;
    }
    ☃ %= d;
    if (☃ < 0) {
      ☃ += d;
    }
    ☃ %= e;
    if (☃ < 0) {
      ☃ += e;
    }
    int ☃ = (☃ * c + ☃) * d + ☃;
    return f[☃];
  }
}
