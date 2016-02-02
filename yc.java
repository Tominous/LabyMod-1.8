public class yc
  extends yg
{
  private final ya a;
  private wn b;
  private int c;
  private final acy h;
  
  public yc(wn ☃, acy ☃, ya ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃, ☃, ☃);
    this.b = ☃;
    this.h = ☃;
    this.a = ☃;
  }
  
  public boolean a(zx ☃)
  {
    return false;
  }
  
  public zx a(int ☃)
  {
    if (e()) {
      this.c += Math.min(☃, d().b);
    }
    return super.a(☃);
  }
  
  protected void a(zx ☃, int ☃)
  {
    this.c += ☃;
    c(☃);
  }
  
  protected void c(zx ☃)
  {
    ☃.a(this.b.o, this.b, this.c);
    this.c = 0;
  }
  
  public void a(wn ☃, zx ☃)
  {
    c(☃);
    
    acz ☃ = this.a.i();
    if (☃ != null)
    {
      zx ☃ = this.a.a(0);
      zx ☃ = this.a.a(1);
      if ((a(☃, ☃, ☃)) || (a(☃, ☃, ☃)))
      {
        this.h.a(☃);
        ☃.b(na.G);
        if ((☃ != null) && (☃.b <= 0)) {
          ☃ = null;
        }
        if ((☃ != null) && (☃.b <= 0)) {
          ☃ = null;
        }
        this.a.a(0, ☃);
        this.a.a(1, ☃);
      }
    }
  }
  
  private boolean a(acz ☃, zx ☃, zx ☃)
  {
    zx ☃ = ☃.a();
    zx ☃ = ☃.b();
    if ((☃ != null) && (☃.b() == ☃.b()))
    {
      if ((☃ != null) && (☃ != null) && (☃.b() == ☃.b()))
      {
        ☃.b -= ☃.b;
        ☃.b -= ☃.b;
        return true;
      }
      if ((☃ == null) && (☃ == null))
      {
        ☃.b -= ☃.b;
        return true;
      }
    }
    return false;
  }
}
