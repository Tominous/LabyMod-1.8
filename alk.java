public abstract class alk
  extends akw
  implements ol, oo
{
  private on a = on.a;
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    this.a = on.b(☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (this.a != null) {
      this.a.a(☃);
    }
  }
  
  public boolean r_()
  {
    return (this.a != null) && (!this.a.a());
  }
  
  public on i()
  {
    return this.a;
  }
  
  public void a(on ☃)
  {
    this.a = ☃;
  }
  
  public eu f_()
  {
    if (l_()) {
      return new fa(e_());
    }
    return new fb(e_(), new Object[0]);
  }
}
