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
    GameProfile ☃ = lo.b(a);
    try
    {
      String ☃ = new BigInteger(ng.a(lo.c(a), lo.a(a).Q().getPublic(), lo.d(a))).toString(16);
      lo.a(a, lo.a(a).aD().hasJoinedServer(new GameProfile(null, ☃.getName()), ☃));
      if (lo.b(a) != null)
      {
        lo.e().info("UUID of player " + lo.b(a).getName() + " is " + lo.b(a).getId());
        lo.a(a, lo.a.d);
      }
      else if (lo.a(a).T())
      {
        lo.e().warn("Failed to verify username but will let them in anyway!");
        lo.a(a, a.a(☃));
        lo.a(a, lo.a.d);
      }
      else
      {
        a.a("Failed to verify username!");
        lo.e().error("Username '" + lo.b(a).getName() + "' tried to join with an invalid session");
      }
    }
    catch (AuthenticationUnavailableException ☃)
    {
      if (lo.a(a).T())
      {
        lo.e().warn("Authentication servers are down but will let them in anyway!");
        lo.a(a, a.a(☃));
        lo.a(a, lo.a.d);
      }
      else
      {
        a.a("Authentication servers are down. Please try again later, sorry!");
        lo.e().error("Couldn't verify username because servers are unavailable");
      }
    }
  }
}
