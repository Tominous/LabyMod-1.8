public class sb
  extends rd
{
  private py a;
  private te b;
  
  public sb(py ☃)
  {
    this.a = ☃;
    if (!(☃.s() instanceof sv)) {
      throw new IllegalArgumentException("Unsupported mob type for RestrictOpenDoorGoal");
    }
  }
  
  public boolean a()
  {
    if (this.a.o.w()) {
      return false;
    }
    cj ☃ = new cj(this.a);
    
    tf ☃ = this.a.o.ae().a(☃, 16);
    if (☃ == null) {
      return false;
    }
    this.b = ☃.b(☃);
    if (this.b == null) {
      return false;
    }
    return this.b.b(☃) < 2.25D;
  }
  
  public boolean b()
  {
    if (this.a.o.w()) {
      return false;
    }
    return (!this.b.i()) && (this.b.c(new cj(this.a)));
  }
  
  public void c()
  {
    ((sv)this.a.s()).b(false);
    ((sv)this.a.s()).c(false);
  }
  
  public void d()
  {
    ((sv)this.a.s()).b(true);
    ((sv)this.a.s()).c(true);
    this.b = null;
  }
  
  public void e()
  {
    this.b.b();
  }
}
