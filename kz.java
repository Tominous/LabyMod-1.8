import net.minecraft.server.MinecraftServer;

public class kz
  extends le
{
  private le a;
  
  public kz(MinecraftServer ☃, atp ☃, int ☃, le ☃, nt ☃)
  {
    super(☃, ☃, new atl(☃.P()), ☃, ☃);
    this.a = ☃;
    
    ☃.af().a(new amq()
    {
      public void a(ams ☃, double ☃)
      {
        kz.this.af().a(☃);
      }
      
      public void a(ams ☃, double ☃, double ☃, long ☃)
      {
        kz.this.af().a(☃, ☃, ☃);
      }
      
      public void a(ams ☃, double ☃, double ☃)
      {
        kz.this.af().c(☃, ☃);
      }
      
      public void a(ams ☃, int ☃)
      {
        kz.this.af().b(☃);
      }
      
      public void b(ams ☃, int ☃)
      {
        kz.this.af().c(☃);
      }
      
      public void b(ams ☃, double ☃)
      {
        kz.this.af().c(☃);
      }
      
      public void c(ams ☃, double ☃)
      {
        kz.this.af().b(☃);
      }
    });
  }
  
  protected void a() {}
  
  public adm b()
  {
    this.z = this.a.T();
    this.C = this.a.Z();
    
    String ☃ = th.a(this.t);
    th ☃ = (th)this.z.a(th.class, ☃);
    if (☃ == null)
    {
      this.A = new th(this);
      this.z.a(☃, this.A);
    }
    else
    {
      this.A = ☃;
      this.A.a(this);
    }
    return this;
  }
}
