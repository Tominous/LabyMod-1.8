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
    this.a = ☃;
    this.b = ☃;
    
    a(☃);
    a(☃);
  }
  
  protected void a(bhu ☃)
  {
    int ☃ = this.d * this.c * this.e;
    this.f = new bht[☃];
    
    int ☃ = 0;
    for (int ☃ = 0; ☃ < this.d; ☃++) {
      for (int ☃ = 0; ☃ < this.c; ☃++) {
        for (int ☃ = 0; ☃ < this.e; ☃++)
        {
          int ☃ = (☃ * this.c + ☃) * this.d + ☃;
          cj ☃ = new cj(☃ * 16, ☃ * 16, ☃ * 16);
          this.f[☃] = ☃.a(this.b, this.a, ☃, ☃++);
        }
      }
    }
  }
  
  public void a()
  {
    for (bht ☃ : this.f) {
      ☃.a();
    }
  }
  
  protected void a(int ☃)
  {
    int ☃ = ☃ * 2 + 1;
    this.d = ☃;
    this.c = 16;
    this.e = ☃;
  }
  
  public void a(double ☃, double ☃)
  {
    int ☃ = ns.c(☃) - 8;
    int ☃ = ns.c(☃) - 8;
    
    int ☃ = this.d * 16;
    for (int ☃ = 0; ☃ < this.d; ☃++)
    {
      int ☃ = a(☃, ☃, ☃);
      for (int ☃ = 0; ☃ < this.e; ☃++)
      {
        int ☃ = a(☃, ☃, ☃);
        for (int ☃ = 0; ☃ < this.c; ☃++)
        {
          int ☃ = ☃ * 16;
          
          bht ☃ = this.f[((☃ * this.c + ☃) * this.d + ☃)];
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
      int ☃ = ☃ % this.d;
      if (☃ < 0) {
        ☃ += this.d;
      }
      for (int ☃ = ☃; ☃ <= ☃; ☃++)
      {
        int ☃ = ☃ % this.c;
        if (☃ < 0) {
          ☃ += this.c;
        }
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          int ☃ = ☃ % this.e;
          if (☃ < 0) {
            ☃ += this.e;
          }
          int ☃ = (☃ * this.c + ☃) * this.d + ☃;
          bht ☃ = this.f[☃];
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
    if ((☃ < 0) || (☃ >= this.c)) {
      return null;
    }
    ☃ %= this.d;
    if (☃ < 0) {
      ☃ += this.d;
    }
    ☃ %= this.e;
    if (☃ < 0) {
      ☃ += this.e;
    }
    int ☃ = (☃ * this.c + ☃) * this.d + ☃;
    return this.f[☃];
  }
}
