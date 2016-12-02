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
    a = ☃;
    
    a(1);
  }
  
  public boolean a()
  {
    if (a.u() != null) {
      return false;
    }
    if (!a.s().m()) {
      return false;
    }
    Random ☃ = a.bc();
    if (☃.nextInt(10) == 0)
    {
      b = cq.a(☃);
      
      cj ☃ = new cj(a.s, a.t + 0.5D, a.u).a(b);
      alz ☃ = a.o.p(☃);
      if (ahz.d(☃))
      {
        c = true;
        return true;
      }
    }
    c = false;
    return super.a();
  }
  
  public boolean b()
  {
    if (c) {
      return false;
    }
    return super.b();
  }
  
  public void c()
  {
    if (!c)
    {
      super.c();
      return;
    }
    adm ☃ = a.o;
    cj ☃ = new cj(a.s, a.t + 0.5D, a.u).a(b);
    alz ☃ = ☃.p(☃);
    if (ahz.d(☃))
    {
      ☃.a(☃, afi.be.Q().a(ahz.a, ahz.a.a(☃)), 3);
      a.y();
      a.J();
    }
  }
}
