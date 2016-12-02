import java.util.Random;

public class qz
  extends rd
{
  private py a;
  private double b;
  private double c;
  private double d;
  private double e;
  private adm f;
  
  public qz(py ☃, double ☃)
  {
    this.a = ☃;
    this.e = ☃;
    this.f = ☃.o;
    a(1);
  }
  
  public boolean a()
  {
    if (!this.f.w()) {
      return false;
    }
    if (!this.a.at()) {
      return false;
    }
    if (!this.f.i(new cj(this.a.s, this.a.aR().b, this.a.u))) {
      return false;
    }
    aui ☃ = f();
    if (☃ == null) {
      return false;
    }
    this.b = ☃.a;
    this.c = ☃.b;
    this.d = ☃.c;
    return true;
  }
  
  public boolean b()
  {
    return !this.a.s().m();
  }
  
  public void c()
  {
    this.a.s().a(this.b, this.c, this.d, this.e);
  }
  
  private aui f()
  {
    Random ☃ = this.a.bc();
    cj ☃ = new cj(this.a.s, this.a.aR().b, this.a.u);
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(☃.nextInt(20) - 10, ☃.nextInt(6) - 3, ☃.nextInt(20) - 10);
      if ((!this.f.i(☃)) && (this.a.a(☃) < 0.0F)) {
        return new aui(☃.n(), ☃.o(), ☃.p());
      }
    }
    return null;
  }
}
