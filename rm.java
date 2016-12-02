import java.util.Random;

public class rm
  extends rd
{
  private int d = -1;
  private int c = -1;
  private te b;
  private py a;
  
  public rm(py ☃)
  {
    this.a = ☃;
    a(1);
  }
  
  public boolean a()
  {
    cj ☃ = new cj(this.a);
    if (((this.a.o.w()) && ((!this.a.o.S()) || (this.a.o.b(☃).e()))) || (this.a.o.t.o())) {
      return false;
    }
    if (this.a.bc().nextInt(50) != 0) {
      return false;
    }
    if ((this.c != -1) && (this.a.e(this.c, this.a.t, this.d) < 4.0D)) {
      return false;
    }
    tf ☃ = this.a.o.ae().a(☃, 14);
    if (☃ == null) {
      return false;
    }
    this.b = ☃.c(☃);
    return this.b != null;
  }
  
  public boolean b()
  {
    return !this.a.s().m();
  }
  
  public void c()
  {
    this.c = -1;
    cj ☃ = this.b.e();
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if (this.a.b(☃) > 256.0D)
    {
      aui ☃ = tc.a(this.a, 14, 3, new aui(☃ + 0.5D, ☃, ☃ + 0.5D));
      if (☃ != null) {
        this.a.s().a(☃.a, ☃.b, ☃.c, 1.0D);
      }
    }
    else
    {
      this.a.s().a(☃ + 0.5D, ☃, ☃ + 0.5D, 1.0D);
    }
  }
  
  public void d()
  {
    this.c = this.b.e().n();
    this.d = this.b.e().p();
    this.b = null;
  }
}
