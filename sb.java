public class sb
  extends rd
{
  private py a;
  private te b;
  
  public sb(py ☃)
  {
    a = ☃;
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
    }
  }
  
  public boolean a()
  {
    if (a.o.w()) {
      return false;
    }
    cj ☃ = new cj(a);
    
    tf ☃ = a.o.ae().a(☃, 16);
    if (☃ == null) {
      return false;
    }
    b = ☃.b(☃);
    if (b == null) {
      return false;
    }
    return b.b(☃) < 2.25D;
  }
  
  public boolean b()
  {
    if (a.o.w()) {
      return false;
    }
    return (!b.i()) && (b.c(new cj(a)));
  }
  
  public void c()
  {
    ((sv)a.s()).b(false);
    ((sv)a.s()).c(false);
  }
  
  public void d()
  {
    ((sv)a.s()).b(true);
    ((sv)a.s()).c(true);
    b = null;
  }
  
  public void e()
  {
    b.b();
  }
}
