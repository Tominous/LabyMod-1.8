import java.util.Random;

public class sd
  extends rd
{
  private tp a;
  private double b;
  private double c;
  private double d;
  private double e;
  
  public sd(tp ☃, double ☃)
  {
    this.a = ☃;
    this.b = ☃;
    a(1);
  }
  
  public boolean a()
  {
    if ((this.a.co()) || (this.a.l == null)) {
      return false;
    }
    aui ☃ = tc.a(this.a, 5, 4);
    if (☃ == null) {
      return false;
    }
    this.c = ☃.a;
    this.d = ☃.b;
    this.e = ☃.c;
    return true;
  }
  
  public void c()
  {
    this.a.s().a(this.c, this.d, this.e, this.b);
  }
  
  public boolean b()
  {
    return (!this.a.s().m()) && (this.a.l != null);
  }
  
  public void e()
  {
    if (this.a.bc().nextInt(50) == 0)
    {
      if ((this.a.l instanceof wn))
      {
        int ☃ = this.a.cC();
        int ☃ = this.a.cI();
        if ((☃ > 0) && (this.a.bc().nextInt(☃) < ☃))
        {
          this.a.h((wn)this.a.l);
          this.a.o.a(this.a, (byte)7);
          return;
        }
        this.a.u(5);
      }
      this.a.l.a(null);
      this.a.l = null;
      this.a.cW();
      this.a.o.a(this.a, (byte)6);
    }
  }
}
