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
    if (!this.o.D)
    {
      if (☃.d != null)
      {
        ☃.d.a(ow.a(this, this.a), 6.0F);
        a(this.a, ☃.d);
      }
      boolean ☃ = this.o.Q().b("mobGriefing");
      this.o.a(null, this.s, this.t, this.u, this.e, ☃, ☃);
      J();
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("ExplosionPower", this.e);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("ExplosionPower", 99)) {
      this.e = ☃.f("ExplosionPower");
    }
  }
}
