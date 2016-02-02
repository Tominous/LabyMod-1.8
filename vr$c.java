class vr$c
  extends rd
{
  private vr b;
  public int a;
  
  public vr$c(vr ☃)
  {
    this.b = ☃;
  }
  
  public boolean a()
  {
    return this.b.u() != null;
  }
  
  public void c()
  {
    this.a = 0;
  }
  
  public void d()
  {
    this.b.a(false);
  }
  
  public void e()
  {
    pr ☃ = this.b.u();
    
    double ☃ = 64.0D;
    if ((☃.h(this.b) < ☃ * ☃) && (this.b.t(☃)))
    {
      adm ☃ = this.b.o;
      
      this.a += 1;
      if (this.a == 10) {
        ☃.a(null, 1007, new cj(this.b), 0);
      }
      if (this.a == 20)
      {
        double ☃ = 4.0D;
        aui ☃ = this.b.d(1.0F);
        
        double ☃ = ☃.s - (this.b.s + ☃.a * ☃);
        double ☃ = ☃.aR().b + ☃.K / 2.0F - (0.5D + this.b.t + this.b.K / 2.0F);
        double ☃ = ☃.u - (this.b.u + ☃.c * ☃);
        
        ☃.a(null, 1008, new cj(this.b), 0);
        wu ☃ = new wu(☃, this.b, ☃, ☃, ☃);
        ☃.e = this.b.cf();
        ☃.s = (this.b.s + ☃.a * ☃);
        ☃.t = (this.b.t + this.b.K / 2.0F + 0.5D);
        ☃.u = (this.b.u + ☃.c * ☃);
        ☃.d(☃);
        this.a = -40;
      }
    }
    else if (this.a > 0)
    {
      this.a -= 1;
    }
    this.b.a(this.a > 10);
  }
}
