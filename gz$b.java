import com.google.common.base.Objects;
import com.google.common.base.Objects.ToStringHelper;
import com.mojang.authlib.GameProfile;

public class gz$b
{
  private final int b;
  private final adp.a c;
  private final GameProfile d;
  private final eu e;
  
  public gz$b(gz paramgz, GameProfile ☃, int ☃, adp.a ☃, eu ☃)
  {
    d = ☃;
    b = ☃;
    c = ☃;
    e = ☃;
  }
  
  public GameProfile a()
  {
    return d;
  }
  
  public int b()
  {
    return b;
  }
  
  public adp.a c()
  {
    return c;
  }
  
  public eu d()
  {
    return e;
  }
  
  public String toString()
  {
    return Objects.toStringHelper(this).add("latency", b).add("gameMode", c).add("profile", d).add("displayName", e == null ? null : eu.a.a(e)).toString();
  }
}
