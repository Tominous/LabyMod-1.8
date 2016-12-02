import com.mojang.authlib.GameProfile;
import com.mojang.authlib.exceptions.AuthenticationException;
import com.mojang.authlib.exceptions.AuthenticationUnavailableException;
import com.mojang.authlib.exceptions.InvalidCredentialsException;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import java.math.BigInteger;
import java.security.PublicKey;
import javax.crypto.SecretKey;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bcx
  implements jf
{
  private static final Logger a = ;
  private final ave b;
  private final axu c;
  private final ek d;
  private GameProfile e;
  
  public bcx(ek ☃, ave ☃, axu ☃)
  {
    this.d = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(jh ☃)
  {
    final SecretKey ☃ = ng.a();
    String ☃ = ☃.a();
    PublicKey ☃ = ☃.b();
    String ☃ = new BigInteger(ng.a(☃, ☃, ☃)).toString(16);
    if ((this.b.D() != null) && (this.b.D().d())) {
      try
      {
        b().joinServer(this.b.L().e(), this.b.L().d(), ☃);
      }
      catch (AuthenticationException ☃)
      {
        a.warn("Couldn't connect to auth servers but will continue to join LAN");
      }
    } else {
      try
      {
        b().joinServer(this.b.L().e(), this.b.L().d(), ☃);
      }
      catch (AuthenticationUnavailableException ☃)
      {
        this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
        return;
      }
      catch (InvalidCredentialsException ☃)
      {
        this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
        return;
      }
      catch (AuthenticationException ☃)
      {
        this.d.a(new fb("disconnect.loginFailedInfo", new Object[] { ☃.getMessage() }));
        return;
      }
    }
    this.d.a(new jm(☃, ☃, ☃.c()), new GenericFutureListener()
    {
      public void operationComplete(Future<? super Void> ☃)
        throws Exception
      {
        bcx.a(bcx.this).a(☃);
      }
    }, new GenericFutureListener[0]);
  }
  
  private MinecraftSessionService b()
  {
    return this.b.aa();
  }
  
  public void a(jg ☃)
  {
    this.e = ☃.a();
    this.d.a(el.b);
    this.d.a(new bcy(this.b, this.c, this.d, this.e));
  }
  
  public void a(eu ☃)
  {
    this.b.a(new axh(this.c, "connect.failed", ☃));
  }
  
  public void a(jj ☃)
  {
    this.d.a(☃.a());
  }
  
  public void a(ji ☃)
  {
    if (!this.d.c()) {
      this.d.a(☃.a());
    }
  }
}
