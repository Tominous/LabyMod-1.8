public class wu
  extends ws
{
  public int e = 1;
  
  public wu(adm ☃)
  {
    super(☃);
  }
  
  public wu(adm ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public wu(adm ☃, pr ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃, ☃);
  }
  
  protected void a(auh ☃)
  {
    if (!o.D)
    {
      if (d != null)
      {
        d.a(ow.a(this, a), 6.0F);
        a(a, d);
      }
      boolean ☃ = o.Q().b("mobGriefing");
      o.a(null, s, t, u, e, ☃, ☃);
      J();
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("ExplosionPower", e);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("ExplosionPower", 99)) {
      e = ☃.f("ExplosionPower");
    }
  }
}
