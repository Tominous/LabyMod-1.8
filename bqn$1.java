import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;

class bqn$1
  extends Thread
{
  bqn$1(bqn parambqn, String ☃, Property paramProperty)
  {
    super(☃);
  }
  
  public void run()
  {
    try
    {
      URL ☃ = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(this.a.getValue(), "UTF-8"));
      String ☃ = nj.a(☃);
      JsonObject ☃ = ni.l(new JsonParser().parse(☃), "Response");
      JsonObject ☃ = ni.s(☃, "token");
      if (ni.i(☃, "valid"))
      {
        String ☃ = ni.h(☃, "user_name");
        bqn.G().debug(bqn.a, "Authenticated with twitch; username is {}", new Object[] { ☃ });
        AuthToken ☃ = new AuthToken();
        ☃.data = this.a.getValue();
        
        bqn.a(this.b).a(☃, ☃);
        bqn.b(this.b).c(☃);
        bqn.b(this.b).a(☃);
        
        Runtime.getRuntime().addShutdownHook(new Thread("Twitch shutdown hook")
        {
          public void run()
          {
            bqn.1.this.b.f();
          }
        });
        bqn.a(this.b).C();
        
        bqn.b(this.b).n();
      }
      else
      {
        bqn.a(this.b, bqm.a.b);
        bqn.G().error(bqn.a, "Given twitch access token is invalid");
      }
    }
    catch (IOException ☃)
    {
      bqn.a(this.b, bqm.a.a);
      bqn.G().error(bqn.a, "Could not authenticate with twitch", ☃);
    }
  }
}
