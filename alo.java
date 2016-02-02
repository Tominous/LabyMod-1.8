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
    ☃.a("SkullType", (byte)(this.a & 0xFF));
    ☃.a("Rot", (byte)(this.f & 0xFF));
    if (this.g != null)
    {
      dn ☃ = new dn();
      dy.a(☃, this.g);
      ☃.a("Owner", ☃);
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    this.a = ☃.d("SkullType");
    this.f = ☃.d("Rot");
    if (this.a == 3) {
      if (☃.b("Owner", 10))
      {
        this.g = dy.a(☃.m("Owner"));
      }
      else if (☃.b("ExtraType", 8))
      {
        String ☃ = ☃.j("ExtraType");
        if (!nx.b(☃))
        {
          this.g = new GameProfile(null, ☃);
          e();
        }
      }
    }
  }
  
  public GameProfile b()
  {
    return this.g;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(this.c, 4, ☃);
  }
  
  public void a(int ☃)
  {
    this.a = ☃;
    this.g = null;
  }
  
  public void a(GameProfile ☃)
  {
    this.a = 3;
    this.g = ☃;
    e();
  }
  
  private void e()
  {
    this.g = b(this.g);
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
    return this.a;
  }
  
  public int d()
  {
    return this.f;
  }
  
  public void b(int ☃)
  {
    this.f = ☃;
  }
}
