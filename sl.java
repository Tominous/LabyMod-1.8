import java.util.Random;

public class sl
  extends st
{
  ty a;
  pr b;
  
  public sl(ty ☃)
  {
    super(☃, false, true);
    this.a = ☃;
    a(1);
  }
  
  public boolean a()
  {
    tf ☃ = this.a.n();
    if (☃ == null) {
      return false;
    }
    this.b = ☃.b(this.a);
    if ((this.b instanceof vn)) {
      return false;
    }
    if (!a(this.b, false))
    {
      if (this.e.bc().nextInt(20) == 0)
      {
        this.b = ☃.c(this.a);
        return a(this.b, false);
      }
      return false;
    }
    return true;
  }
  
  public void c()
  {
    this.a.d(this.b);
    super.c();
  }
}
