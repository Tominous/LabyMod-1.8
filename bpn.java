import com.mojang.authlib.GameProfile;
import java.net.SocketAddress;

public class bpn
  extends lx
{
  private dn f;
  
  public bpn(bpo ☃)
  {
    super(☃);
    
    a(10);
  }
  
  protected void b(lf ☃)
  {
    if (☃.e_().equals(b().S()))
    {
      this.f = new dn();
      ☃.e(this.f);
    }
    super.b(☃);
  }
  
  public String a(SocketAddress ☃, GameProfile ☃)
  {
    if ((☃.getName().equalsIgnoreCase(b().S())) && (a(☃.getName()) != null)) {
      return "That name is already taken.";
    }
    return super.a(☃, ☃);
  }
  
  public bpo b()
  {
    return (bpo)super.c();
  }
  
  public dn t()
  {
    return this.f;
  }
}
