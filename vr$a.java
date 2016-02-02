class vr$a
  extends rd
{
  private vr a;
  
  public vr$a(vr ☃)
  {
    this.a = ☃;
    
    a(2);
  }
  
  public boolean a()
  {
    return true;
  }
  
  public void e()
  {
    if (this.a.u() == null)
    {
      this.a.aI = (this.a.y = -(float)ns.b(this.a.v, this.a.x) * 180.0F / 3.1415927F);
    }
    else
    {
      pr ☃ = this.a.u();
      
      double ☃ = 64.0D;
      if (☃.h(this.a) < ☃ * ☃)
      {
        double ☃ = ☃.s - this.a.s;
        double ☃ = ☃.u - this.a.u;
        this.a.aI = (this.a.y = -(float)ns.b(☃, ☃) * 180.0F / 3.1415927F);
      }
    }
  }
}
