import com.mojang.authlib.GameProfile;
import java.io.IOException;

public class jl
  implements ff<jk>
{
  private GameProfile a;
  
  public jl() {}
  
  public jl(GameProfile ☃)
  {
    a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = new GameProfile(null, ☃.c(16));
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a.getName());
  }
  
  public void a(jk ☃)
  {
    ☃.a(this);
  }
  
  public GameProfile a()
  {
    return a;
  }
}
