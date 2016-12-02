public class alg
  extends akw
{
  private zw a;
  private int f;
  
  public alg() {}
  
  public alg(zw ☃, int ☃)
  {
    a = ☃;
    f = ☃;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    jy ☃ = (jy)zw.e.c(a);
    ☃.a("Item", ☃ == null ? "" : ☃.toString());
    ☃.a("Data", f);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("Item", 8)) {
      a = zw.d(☃.j("Item"));
    } else {
      a = zw.b(☃.f("Item"));
    }
    f = ☃.f("Data");
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    
    ☃.o("Item");
    ☃.a("Item", zw.b(a));
    return new ft(c, 5, ☃);
  }
  
  public void a(zw ☃, int ☃)
  {
    a = ☃;
    f = ☃;
  }
  
  public zw b()
  {
    return a;
  }
  
  public int c()
  {
    return f;
  }
}
