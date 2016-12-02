class vt$a
  extends rd
{
  private vt a;
  private int b;
  
  public vt$a(vt ☃)
  {
    a = ☃;
    
    a(3);
  }
  
  public boolean a()
  {
    pr ☃ = a.u();
    if ((☃ == null) || (!☃.ai())) {
      return false;
    }
    return true;
  }
  
  public boolean b()
  {
    return (super.b()) && ((a.cn()) || (a.h(a.u()) > 9.0D));
  }
  
  public void c()
  {
    b = -10;
    a.s().n();
    a.p().a(a.u(), 90.0F, 90.0F);
    
    a.ai = true;
  }
  
  public void d()
  {
    vt.a(a, 0);
    a.d(null);
    
    vt.a(a).f();
  }
  
  public void e()
  {
    pr ☃ = a.u();
    
    a.s().n();
    a.p().a(☃, 90.0F, 90.0F);
    if (!a.t(☃))
    {
      a.d(null);
      return;
    }
    b += 1;
    if (b == 0)
    {
      vt.a(a, a.u().F());
      a.o.a(a, (byte)21);
    }
    else if (b >= a.cm())
    {
      float ☃ = 1.0F;
      if (a.o.aa() == oj.d) {
        ☃ += 2.0F;
      }
      if (a.cn()) {
        ☃ += 2.0F;
      }
      ☃.a(ow.b(a, a), ☃);
      ☃.a(ow.a(a), (float)a.a(vy.e).e());
      a.d(null);
    }
    else if ((b < 60) || (b % 20 != 0)) {}
    super.e();
  }
}
