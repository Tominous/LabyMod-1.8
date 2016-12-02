import com.google.common.base.Charsets;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.util.Arrays;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;
import javax.crypto.SecretKey;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.Validate;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lo
  implements jk, km
{
  private static final AtomicInteger b = new AtomicInteger(0);
  private static final Logger c = LogManager.getLogger();
  private static final Random d = new Random();
  private final byte[] e = new byte[4];
  private final MinecraftServer f;
  public final ek a;
  private lo.a g = lo.a.a;
  private int h;
  private GameProfile i;
  private String j = "";
  private SecretKey k;
  private lf l;
  
  public lo(MinecraftServer ☃, ek ☃)
  {
    f = ☃;
    a = ☃;
    d.nextBytes(e);
  }
  
  public void c()
  {
    if (g == lo.a.d)
    {
      b();
    }
    else if (g == lo.a.e)
    {
      lf ☃ = f.ap().a(i.getId());
      if (☃ == null)
      {
        g = lo.a.d;
        f.ap().a(a, l);
        l = null;
      }
    }
    if (h++ == 600) {
      a("Took too long to log in");
    }
  }
  
  public void a(String ☃)
  {
    try
    {
      c.info("Disconnecting " + d() + ": " + ☃);
      fa ☃ = new fa(☃);
      a.a(new jj(☃));
      a.a(☃);
    }
    catch (Exception ☃)
    {
      c.error("Error whilst disconnecting player", ☃);
    }
  }
  
  public void b()
  {
    if (!i.isComplete()) {
      i = a(i);
    }
    String ☃ = f.ap().a(a.b(), i);
    if (☃ != null)
    {
      a(☃);
    }
    else
    {
      g = lo.a.f;
      if ((f.aK() >= 0) && (!a.c())) {
        a.a(new ji(f.aK()), new ChannelFutureListener()
        {
          public void a(ChannelFuture ☃)
            throws Exception
          {
            a.a(lo.a(lo.this).aK());
          }
        }, new GenericFutureListener[0]);
      }
      a.a(new jg(i));
      lf ☃ = f.ap().a(i.getId());
      if (☃ != null)
      {
        g = lo.a.e;
        l = f.ap().g(i);
      }
      else
      {
        f.ap().a(a, f.ap().g(i));
      }
    }
  }
  
  public void a(eu ☃)
  {
    c.info(d() + " lost connection: " + ☃.c());
  }
  
  public String d()
  {
    if (i != null) {
      return i.toString() + " (" + a.b().toString() + ")";
    }
    return String.valueOf(a.b());
  }
  
  public void a(jl ☃)
  {
    Validate.validState(g == lo.a.a, "Unexpected hello packet", new Object[0]);
    i = ☃.a();
    if ((f.af()) && (!a.c()))
    {
      g = lo.a.b;
      a.a(new jh(j, f.Q().getPublic(), e));
    }
    else
    {
      g = lo.a.d;
    }
  }
  
  public void a(jm ☃)
  {
    Validate.validState(g == lo.a.b, "Unexpected key packet", new Object[0]);
    PrivateKey ☃ = f.Q().getPrivate();
    if (!Arrays.equals(e, ☃.b(☃))) {
      throw new IllegalStateException("Invalid nonce!");
    }
    k = ☃.a(☃);
    g = lo.a.c;
    
    a.a(k);
    
    new Thread("User Authenticator #" + b.incrementAndGet())
    {
      public void run()
      {
        GameProfile ☃ = lo.b(lo.this);
        try
        {
          String ☃ = new BigInteger(ng.a(lo.c(lo.this), lo.a(lo.this).Q().getPublic(), lo.d(lo.this))).toString(16);
          lo.a(lo.this, lo.a(lo.this).aD().hasJoinedServer(new GameProfile(null, ☃.getName()), ☃));
          if (lo.b(lo.this) != null)
          {
            lo.e().info("UUID of player " + lo.b(lo.this).getName() + " is " + lo.b(lo.this).getId());
            lo.a(lo.this, lo.a.d);
          }
          else if (lo.a(lo.this).T())
          {
            lo.e().warn("Failed to verify username but will let them in anyway!");
            lo.a(lo.this, a(☃));
            lo.a(lo.this, lo.a.d);
          }
          else
          {
            a("Failed to verify username!");
            lo.e().error("Username '" + lo.b(lo.this).getName() + "' tried to join with an invalid session");
          }
        }
        catch (AuthenticationUnavailableException ☃)
        {
          if (lo.a(lo.this).T())
          {
            lo.e().warn("Authentication servers are down but will let them in anyway!");
            lo.a(lo.this, a(☃));
            lo.a(lo.this, lo.a.d);
          }
          else
          {
            a("Authentication servers are down. Please try again later, sorry!");
            lo.e().error("Couldn't verify username because servers are unavailable");
          }
        }
      }
    }.start();
  }
  
  protected GameProfile a(GameProfile ☃)
  {
    UUID ☃ = UUID.nameUUIDFromBytes(("OfflinePlayer:" + ☃.getName()).getBytes(Charsets.UTF_8));
    return new GameProfile(☃, ☃.getName());
  }
  
  static enum a
  {
    private a() {}
  }
}
