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
    this.f = ☃;
    this.a = ☃;
    d.nextBytes(this.e);
  }
  
  public void c()
  {
    if (this.g == lo.a.d)
    {
      b();
    }
    else if (this.g == lo.a.e)
    {
      lf ☃ = this.f.ap().a(this.i.getId());
      if (☃ == null)
      {
        this.g = lo.a.d;
        this.f.ap().a(this.a, this.l);
        this.l = null;
      }
    }
    if (this.h++ == 600) {
      a("Took too long to log in");
    }
  }
  
  public void a(String ☃)
  {
    try
    {
      c.info("Disconnecting " + d() + ": " + ☃);
      fa ☃ = new fa(☃);
      this.a.a(new jj(☃));
      this.a.a(☃);
    }
    catch (Exception ☃)
    {
      c.error("Error whilst disconnecting player", ☃);
    }
  }
  
  public void b()
  {
    if (!this.i.isComplete()) {
      this.i = a(this.i);
    }
    String ☃ = this.f.ap().a(this.a.b(), this.i);
    if (☃ != null)
    {
      a(☃);
    }
    else
    {
      this.g = lo.a.f;
      if ((this.f.aK() >= 0) && (!this.a.c())) {
        this.a.a(new ji(this.f.aK()), new ChannelFutureListener()
        {
          public void a(ChannelFuture ☃)
            throws Exception
          {
            lo.this.a.a(lo.a(lo.this).aK());
          }
        }, new GenericFutureListener[0]);
      }
      this.a.a(new jg(this.i));
      lf ☃ = this.f.ap().a(this.i.getId());
      if (☃ != null)
      {
        this.g = lo.a.e;
        this.l = this.f.ap().g(this.i);
      }
      else
      {
        this.f.ap().a(this.a, this.f.ap().g(this.i));
      }
    }
  }
  
  public void a(eu ☃)
  {
    c.info(d() + " lost connection: " + ☃.c());
  }
  
  public String d()
  {
    if (this.i != null) {
      return this.i.toString() + " (" + this.a.b().toString() + ")";
    }
    return String.valueOf(this.a.b());
  }
  
  public void a(jl ☃)
  {
    Validate.validState(this.g == lo.a.a, "Unexpected hello packet", new Object[0]);
    this.i = ☃.a();
    if ((this.f.af()) && (!this.a.c()))
    {
      this.g = lo.a.b;
      this.a.a(new jh(this.j, this.f.Q().getPublic(), this.e));
    }
    else
    {
      this.g = lo.a.d;
    }
  }
  
  public void a(jm ☃)
  {
    Validate.validState(this.g == lo.a.b, "Unexpected key packet", new Object[0]);
    PrivateKey ☃ = this.f.Q().getPrivate();
    if (!Arrays.equals(this.e, ☃.b(☃))) {
      throw new IllegalStateException("Invalid nonce!");
    }
    this.k = ☃.a(☃);
    this.g = lo.a.c;
    
    this.a.a(this.k);
    
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
            lo.a(lo.this, lo.this.a(☃));
            lo.a(lo.this, lo.a.d);
          }
          else
          {
            lo.this.a("Failed to verify username!");
            lo.e().error("Username '" + lo.b(lo.this).getName() + "' tried to join with an invalid session");
          }
        }
        catch (AuthenticationUnavailableException ☃)
        {
          if (lo.a(lo.this).T())
          {
            lo.e().warn("Authentication servers are down but will let them in anyway!");
            lo.a(lo.this, lo.this.a(☃));
            lo.a(lo.this, lo.a.d);
          }
          else
          {
            lo.this.a("Authentication servers are down. Please try again later, sorry!");
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
