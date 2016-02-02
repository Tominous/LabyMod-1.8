import java.util.List;
import java.util.Random;

public class sg
  extends rd
{
  private wi a;
  private ty b;
  private int c;
  private boolean d;
  
  public sg(wi ☃)
  {
    this.a = ☃;
    a(3);
  }
  
  public boolean a()
  {
    if (this.a.l() >= 0) {
      return false;
    }
    if (!this.a.o.w()) {
      return false;
    }
    List<ty> ☃ = this.a.o.a(ty.class, this.a.aR().b(6.0D, 2.0D, 6.0D));
    if (☃.isEmpty()) {
      return false;
    }
    for (ty ☃ : ☃) {
      if (☃.cm() > 0)
      {
        this.b = ☃;
        break;
      }
    }
    return this.b != null;
  }
  
  public boolean b()
  {
    return this.b.cm() > 0;
  }
  
  public void c()
  {
    this.c = this.a.bc().nextInt(320);
    this.d = false;
    this.b.s().n();
  }
  
  public void d()
  {
    this.b = null;
    this.a.s().n();
  }
  
  public void e()
  {
    this.a.p().a(this.b, 30.0F, 30.0F);
    if (this.b.cm() == this.c)
    {
      this.a.s().a(this.b, 0.5D);
      this.d = true;
    }
    if ((this.d) && 
      (this.a.h(this.b) < 4.0D))
    {
      this.b.a(false);
      this.a.s().n();
    }
  }
}
