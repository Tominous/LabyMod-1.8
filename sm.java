import java.util.List;

public class sm
  extends st
{
  private boolean a;
  private int b;
  private final Class[] c;
  
  public sm(py ☃, boolean ☃, Class... ☃)
  {
    super(☃, false);
    this.a = ☃;
    this.c = ☃;
    a(1);
  }
  
  public boolean a()
  {
    int ☃ = this.e.be();
    return (☃ != this.b) && (a(this.e.bd(), false));
  }
  
  public void c()
  {
    this.e.d(this.e.bd());
    this.b = this.e.be();
    if (this.a)
    {
      double ☃ = f();
      List<py> ☃ = this.e.o.a(this.e.getClass(), new aug(this.e.s, this.e.t, this.e.u, this.e.s + 1.0D, this.e.t + 1.0D, this.e.u + 1.0D).b(☃, 10.0D, ☃));
      for (py ☃ : ☃) {
        if ((this.e != ☃) && 
        
          (☃.u() == null) && 
          
          (!☃.c(this.e.bd())))
        {
          boolean ☃ = false;
          for (Class ☃ : this.c) {
            if (☃.getClass() == ☃)
            {
              ☃ = true;
              break;
            }
          }
          if (!☃) {
            a(☃, this.e.bd());
          }
        }
      }
    }
    super.c();
  }
  
  protected void a(py ☃, pr ☃)
  {
    ☃.d(☃);
  }
}
