import com.google.common.collect.Iterables;
import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftSessionService;
import com.mojang.authlib.properties.Property;
import com.mojang.authlib.properties.PropertyMap;
import net.minecraft.server.MinecraftServer;

public class alo
  extends akw
{
  private int a;
  private int f;
  private GameProfile g = null;
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("SkullType", (byte)(a & 0xFF));
    ☃.a("Rot", (byte)(f & 0xFF));
    if (g != null)
    {
      dn ☃ = new dn();
      dy.a(☃, g);
      ☃.a("Owner", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    a = ☃.d("SkullType");
    f = ☃.d("Rot");
    if (a == 3) {
      if (☃.b("Owner", 10))
      {
        g = dy.a(☃.m("Owner"));
      }
      else if (☃.b("ExtraType", 8))
      {
        String ☃ = ☃.j("ExtraType");
        if (!nx.b(☃))
        {
          g = new GameProfile(null, ☃);
          e();
        }
      }
    }
  }
  
  public GameProfile b()
  {
    return g;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(c, 4, ☃);
  }
  
  public void a(int ☃)
  {
    a = ☃;
    g = null;
  }
  
  public void a(GameProfile ☃)
  {
    a = 3;
    g = ☃;
    e();
  }
  
  private void e()
  {
    g = b(g);
    p_();
  }
  
  public static GameProfile b(GameProfile ☃)
  {
    if ((☃ == null) || (nx.b(☃.getName()))) {
      return ☃;
    }
    if ((☃.isComplete()) && (☃.getProperties().containsKey("textures"))) {
      return ☃;
    }
    if (MinecraftServer.N() == null) {
      return ☃;
    }
    GameProfile ☃ = MinecraftServer.N().aF().a(☃.getName());
    if (☃ == null) {
      return ☃;
    }
    Property ☃ = (Property)Iterables.getFirst(☃.getProperties().get("textures"), null);
    if (☃ == null) {
      ☃ = MinecraftServer.N().aD().fillProfileProperties(☃, true);
    }
    return ☃;
  }
  
  public int c()
  {
    return a;
  }
  
  public int d()
  {
    return f;
  }
  
  public void b(int ☃)
  {
    f = ☃;
  }
}
