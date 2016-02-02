public class alg
  extends akw
{
  private zw a;
  private int f;
  
  public alg() {}
  
  public alg(zw ☃, int ☃)
  {
    this.a = ☃;
    this.f = ☃;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    jy ☃ = (jy)zw.e.c(this.a);
    ☃.a("Item", ☃ == null ? "" : ☃.toString());
    ☃.a("Data", this.f);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("Item", 8)) {
      this.a = zw.d(☃.j("Item"));
    } else {
      this.a = zw.b(☃.f("Item"));
    }
    this.f = ☃.f("Data");
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    
    ☃.o("Item");
    ☃.a("Item", zw.b(this.a));
    return new ft(this.c, 5, ☃);
  }
  
  public void a(zw ☃, int ☃)
  {
    this.a = ☃;
    this.f = ☃;
  }
  
  public zw b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.f;
  }
}
