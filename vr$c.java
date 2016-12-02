class vr$c
  extends rd
{
  private vr b;
  public int a;
  
  public vr$c(vr ☃)
  {
    b = ☃;
  }
  
  public boolean a()
  {
    return b.u() != null;
  }
  
  public void c()
  {
    a = 0;
  }
  
  public void d()
  {
    b.a(false);
  }
  
  public void e()
  {
    pr ☃ = b.u();
    
    double ☃ = 64.0D;
    if ((☃.h(b) < ☃ * ☃) && (b.t(☃)))
    {
      adm ☃ = b.o;
      
      a += 1;
      if (a == 10) {
        ☃.a(null, 1007, new cj(b), 0);
      }
      if (a == 20)
      {
        double ☃ = 4.0D;
        aui ☃ = b.d(1.0F);
        
        double ☃ = s - (b.s + a * ☃);
        double ☃ = aRb + K / 2.0F - (0.5D + b.t + b.K / 2.0F);
        double ☃ = u - (b.u + c * ☃);
        
        ☃.a(null, 1008, new cj(b), 0);
        wu ☃ = new wu(☃, b, ☃, ☃, ☃);
        e = b.cf();
        s = (b.s + a * ☃);
        t = (b.t + b.K / 2.0F + 0.5D);
        u = (b.u + c * ☃);
        ☃.d(☃);
        a = -40;
      }
    }
    else if (a > 0)
    {
      a -= 1;
    }
    b.a(a > 10);
  }
}
