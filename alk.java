public abstract class alk
  extends akw
  implements ol, oo
{
  private on a = on.a;
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    a = on.b(☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (a != null) {
      a.a(☃);
    }
  }
  
  public boolean r_()
  {
    return (a != null) && (!a.a());
  }
  
  public on i()
  {
    return a;
  }
  
  public void a(on ☃)
  {
    a = ☃;
  }
  
  public eu f_()
  {
    if (l_()) {
      return new fa(e_());
    }
    return new fb(e_(), new Object[0]);
  }
}
