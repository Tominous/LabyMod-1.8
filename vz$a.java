import java.util.Random;

class vz$a
  extends rz
{
  private final vz a;
  private cq b;
  private boolean c;
  
  public vz$a(vz ☃)
  {
    super(☃, 1.0D, 10);
    this.a = ☃;
    
    a(1);
  }
  
  public boolean a()
  {
    if (this.a.u() != null) {
      return false;
    }
    if (!this.a.s().m()) {
      return false;
    }
    Random ☃ = this.a.bc();
    if (☃.nextInt(10) == 0)
    {
      this.b = cq.a(☃);
      
      cj ☃ = new cj(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
      alz ☃ = this.a.o.p(☃);
      if (ahz.d(☃))
      {
        this.c = true;
        return true;
      }
    }
    this.c = false;
    return super.a();
  }
  
  public boolean b()
  {
    if (this.c) {
      return false;
    }
    return super.b();
  }
  
  public void c()
  {
    if (!this.c)
    {
      super.c();
      return;
    }
    adm ☃ = this.a.o;
    cj ☃ = new cj(this.a.s, this.a.t + 0.5D, this.a.u).a(this.b);
    alz ☃ = ☃.p(☃);
    if (ahz.d(☃))
    {
      ☃.a(☃, afi.be.Q().a(ahz.a, ahz.a.a(☃)), 3);
      this.a.y();
      this.a.J();
    }
  }
}
