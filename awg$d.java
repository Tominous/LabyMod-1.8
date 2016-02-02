public class awg$d
  implements awd.a
{
  private final ave a;
  private final avp b;
  private final avp c;
  private avp d;
  
  public awg$d(avp ☃, avp ☃)
  {
    this.a = ave.A();
    this.b = ☃;
    this.c = ☃;
  }
  
  public avp a()
  {
    return this.b;
  }
  
  public avp b()
  {
    return this.c;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    a(this.b, ☃, ☃, ☃, false);
    a(this.c, ☃, ☃, ☃, false);
  }
  
  private void a(avp ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    if (☃ == null) {
      return;
    }
    if ((☃ instanceof avs)) {
      a((avs)☃, ☃, ☃, ☃, ☃);
    } else if ((☃ instanceof avw)) {
      a((avw)☃, ☃, ☃);
    } else if ((☃ instanceof avy)) {
      a((avy)☃, ☃, ☃, ☃, ☃);
    }
  }
  
  private void a(avs ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    ☃.i = ☃;
    if (!☃) {
      ☃.a(this.a, ☃, ☃);
    }
  }
  
  private void a(avw ☃, int ☃, boolean ☃)
  {
    ☃.f = ☃;
    if (!☃) {
      ☃.g();
    }
  }
  
  private void a(avy ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    ☃.h = ☃;
    if (!☃) {
      ☃.a(this.a, ☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    a(this.b, ☃, 0, 0, true);
    a(this.c, ☃, 0, 0, true);
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    boolean ☃ = a(this.b, ☃, ☃, ☃);
    boolean ☃ = a(this.c, ☃, ☃, ☃);
    return (☃) || (☃);
  }
  
  private boolean a(avp ☃, int ☃, int ☃, int ☃)
  {
    if (☃ == null) {
      return false;
    }
    if ((☃ instanceof avs)) {
      return a((avs)☃, ☃, ☃, ☃);
    }
    if ((☃ instanceof avw)) {
      a((avw)☃, ☃, ☃, ☃);
    }
    return false;
  }
  
  private boolean a(avs ☃, int ☃, int ☃, int ☃)
  {
    boolean ☃ = ☃.c(this.a, ☃, ☃);
    if (☃) {
      this.d = ☃;
    }
    return ☃;
  }
  
  private void a(avw ☃, int ☃, int ☃, int ☃)
  {
    ☃.a(☃, ☃, ☃);
    if (☃.m()) {
      this.d = ☃;
    }
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    b(this.b, ☃, ☃, ☃);
    b(this.c, ☃, ☃, ☃);
  }
  
  private void b(avp ☃, int ☃, int ☃, int ☃)
  {
    if (☃ == null) {
      return;
    }
    if ((☃ instanceof avs)) {
      b((avs)☃, ☃, ☃, ☃);
    }
  }
  
  private void b(avs ☃, int ☃, int ☃, int ☃)
  {
    ☃.a(☃, ☃);
  }
}
