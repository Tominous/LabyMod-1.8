import com.mojang.authlib.GameProfile;
import java.io.IOException;
import java.util.UUID;

public class jg
  implements ff<jf>
{
  private GameProfile a;
  
  public jg() {}
  
  public jg(GameProfile ☃)
  {
    a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    String ☃ = ☃.c(36);
    String ☃ = ☃.c(16);
    UUID ☃ = UUID.fromString(☃);
    a = new GameProfile(☃, ☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    UUID ☃ = a.getId();
    ☃.a(☃ == null ? "" : ☃.toString());
    ☃.a(a.getName());
  }
  
  public void a(jf ☃)
  {
    ☃.a(this);
  }
  
  public GameProfile a()
  {
    return a;
  }
}
