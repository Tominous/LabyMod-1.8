import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import java.math.BigInteger;
import java.security.KeyPair;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.Logger;

class lo$2
  extends Thread
{
  lo$2(lo paramlo, String ☃)
  {
    super(☃);
  }
  
  public void run()
  {
    GameProfile ☃ = lo.b(this.a);
    try
    {
      String ☃ = new BigInteger(ng.a(lo.c(this.a), lo.a(this.a).Q().getPublic(), lo.d(this.a))).toString(16);
      lo.a(this.a, lo.a(this.a).aD().hasJoinedServer(new GameProfile(null, ☃.getName()), ☃));
      if (lo.b(this.a) != null)
      {
        lo.e().info("UUID of player " + lo.b(this.a).getName() + " is " + lo.b(this.a).getId());
        lo.a(this.a, lo.a.d);
      }
      else if (lo.a(this.a).T())
      {
        lo.e().warn("Failed to verify username but will let them in anyway!");
        lo.a(this.a, this.a.a(☃));
        lo.a(this.a, lo.a.d);
      }
      else
      {
        this.a.a("Failed to verify username!");
        lo.e().error("Username '" + lo.b(this.a).getName() + "' tried to join with an invalid session");
      }
    }
    catch (AuthenticationUnavailableException ☃)
    {
      if (lo.a(this.a).T())
      {
        lo.e().warn("Authentication servers are down but will let them in anyway!");
        lo.a(this.a, this.a.a(☃));
        lo.a(this.a, lo.a.d);
      }
      else
      {
        this.a.a("Authentication servers are down. Please try again later, sorry!");
        lo.e().error("Couldn't verify username because servers are unavailable");
      }
    }
  }
}
