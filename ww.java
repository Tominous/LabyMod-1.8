public class ww
  extends ws
{
  public ww(adm ☃)
  {
    super(☃);
    a(0.3125F, 0.3125F);
  }
  
  public ww(adm ☃, pr ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
    
    a(0.3125F, 0.3125F);
  }
  
  public ww(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    a(0.3125F, 0.3125F);
  }
  
  protected void a(auh ☃)
  {
    if (!o.D)
    {
      if (d != null)
      {
        boolean ☃ = d.a(ow.a(this, a), 5.0F);
        if (☃)
        {
          a(a, d);
          if (!d.T()) {
            d.e(5);
          }
        }
      }
      else
      {
        boolean ☃ = true;
        if ((a != null) && ((a instanceof ps))) {
          ☃ = o.Q().b("mobGriefing");
        }
        if (☃)
        {
          cj ☃ = ☃.a().a(b);
          if (o.d(☃)) {
            o.a(☃, afi.ab.Q());
          }
        }
      }
      J();
    }
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    return false;
  }
}
