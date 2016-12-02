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
    d = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(jh ☃)
  {
    final SecretKey ☃ = ng.a();
    String ☃ = ☃.a();
    PublicKey ☃ = ☃.b();
    String ☃ = new BigInteger(ng.a(☃, ☃, ☃)).toString(16);
    if ((b.D() != null) && (b.D().d())) {
      try
      {
        b().joinServer(b.L().e(), b.L().d(), ☃);
      }
      catch (AuthenticationException ☃)
      {
        a.warn("Couldn't connect to auth servers but will continue to join LAN");
      }
    } else {
      try
      {
        b().joinServer(b.L().e(), b.L().d(), ☃);
      }
      catch (AuthenticationUnavailableException ☃)
      {
        d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.serversUnavailable", new Object[0]) }));
        return;
      }
      catch (InvalidCredentialsException ☃)
      {
        d.a(new fb("disconnect.loginFailedInfo", new Object[] { new fb("disconnect.loginFailedInfo.invalidSession", new Object[0]) }));
        return;
      }
      catch (AuthenticationException ☃)
      {
        d.a(new fb("disconnect.loginFailedInfo", new Object[] { ☃.getMessage() }));
        return;
      }
    }
    d.a(new jm(☃, ☃, ☃.c()), new GenericFutureListener()
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
    return b.aa();
  }
  
  public void a(jg ☃)
  {
    e = ☃.a();
    d.a(el.b);
    d.a(new bcy(b, c, d, e));
  }
  
  public void a(eu ☃)
  {
    b.a(new axh(c, "connect.failed", ☃));
  }
  
  public void a(jj ☃)
  {
    d.a(☃.a());
  }
  
  public void a(ji ☃)
  {
    if (!d.c()) {
      d.a(☃.a());
    }
  }
}
