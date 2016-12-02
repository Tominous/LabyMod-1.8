import net.minecraft.server.MinecraftServer;

public class kz
  extends le
{
  private le a;
  
  public kz(MinecraftServer ☃, atp ☃, int ☃, le ☃, nt ☃)
  {
    super(☃, ☃, new atl(☃.P()), ☃, ☃);
    a = ☃;
    
    ☃.af().a(new amq()
    {
      public void a(ams ☃, double ☃)
      {
        af().a(☃);
      }
      
      public void a(ams ☃, double ☃, double ☃, long ☃)
      {
        af().a(☃, ☃, ☃);
      }
      
      public void a(ams ☃, double ☃, double ☃)
      {
        af().c(☃, ☃);
      }
      
      public void a(ams ☃, int ☃)
      {
        af().b(☃);
      }
      
      public void b(ams ☃, int ☃)
      {
        af().c(☃);
      }
      
      public void b(ams ☃, double ☃)
      {
        af().c(☃);
      }
      
      public void c(ams ☃, double ☃)
      {
        af().b(☃);
      }
    });
  }
  
  protected void a() {}
  
  public adm b()
  {
    z = a.T();
    C = a.Z();
    
    String ☃ = th.a(t);
    th ☃ = (th)z.a(th.class, ☃);
    if (☃ == null)
    {
      A = new th(this);
      z.a(☃, A);
    }
    else
    {
      A = ☃;
      A.a(this);
    }
    return this;
  }
}
