class vt$a
  extends rd
{
  private vt a;
  private int b;
  
  public vt$a(vt ☃)
  {
    this.a = ☃;
    
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = this.a.u();
    if ((☃ == null) || (!☃.ai())) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return (super.b()) && ((this.a.cn()) || (this.a.h(this.a.u()) > 9.0D));
  }
  
  public void c()
  {
    this.b = -10;
    this.a.s().n();
    this.a.p().a(this.a.u(), 90.0F, 90.0F);
    
    this.a.ai = true;
  }
  
  public void d()
  {
    vt.a(this.a, 0);
    this.a.d(null);
    
    vt.a(this.a).f();
  }
  
  public void e()
  {
    pr ☃ = this.a.u();
    
    this.a.s().n();
    this.a.p().a(☃, 90.0F, 90.0F);
    if (!this.a.t(☃))
    {
      this.a.d(null);
      return;
    }
    this.b += 1;
    if (this.b == 0)
    {
      vt.a(this.a, this.a.u().F());
      this.a.o.a(this.a, (byte)21);
    }
    else if (this.b >= this.a.cm())
    {
      float ☃ = 1.0F;
      if (this.a.o.aa() == oj.d) {
        ☃ += 2.0F;
      }
      if (this.a.cn()) {
        ☃ += 2.0F;
      }
      ☃.a(ow.b(this.a, this.a), ☃);
      ☃.a(ow.a(this.a), (float)this.a.a(vy.e).e());
      this.a.d(null);
    }
    else if ((this.b < 60) || (this.b % 20 != 0)) {}
    super.e();
  }
}
