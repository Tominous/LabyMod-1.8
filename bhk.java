import com.mojang.authlib.GameProfile;
import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import com.mojang.authlib.minecraft.MinecraftProfileTexture.Type;
import java.util.Map;
import java.util.UUID;

public class bhk
  extends bhd<alo>
{
  private static final jy d = new jy("textures/entity/skeleton/skeleton.png");
  private static final jy e = new jy("textures/entity/skeleton/wither_skeleton.png");
  private static final jy f = new jy("textures/entity/zombie/zombie.png");
  private static final jy g = new jy("textures/entity/creeper/creeper.png");
  public static bhk c;
  private final bbz h = new bbz(0, 0, 64, 32);
  private final bbz i = new bbi();
  
  public void a(alo ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    cq ☃ = cq.a(☃.u() & 0x7);
    
    a((float)☃, (float)☃, (float)☃, ☃, ☃.d() * 360 / 16.0F, ☃.c(), ☃.b(), ☃);
  }
  
  public void a(bhc ☃)
  {
    super.a(☃);
    c = this;
  }
  
  public void a(float ☃, float ☃, float ☃, cq ☃, float ☃, int ☃, GameProfile ☃, int ☃)
  {
    bbo ☃ = this.h;
    if (☃ >= 0)
    {
      a(a[☃]);
      bfl.n(5890);
      bfl.E();
      bfl.a(4.0F, 2.0F, 1.0F);
      bfl.b(0.0625F, 0.0625F, 0.0625F);
      bfl.n(5888);
    }
    else
    {
      switch (☃)
      {
      case 0: 
      default: 
        a(d);
        break;
      case 1: 
        a(e);
        break;
      case 2: 
        a(f);
        ☃ = this.i;
        break;
      case 3: 
        ☃ = this.i;
        jy ☃ = bmz.a();
        if (☃ != null)
        {
          ave ☃ = ave.A();
          Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> ☃ = ☃.ab().a(☃);
          if (☃.containsKey(MinecraftProfileTexture.Type.SKIN))
          {
            ☃ = ☃.ab().a((MinecraftProfileTexture)☃.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
          }
          else
          {
            UUID ☃ = wn.a(☃);
            ☃ = bmz.a(☃);
          }
        }
        a(☃);
        break;
      case 4: 
        a(g);
      }
    }
    bfl.E();
    bfl.p();
    if (☃ != cq.b) {
      switch (bhk.1.a[☃.ordinal()])
      {
      case 1: 
        bfl.b(☃ + 0.5F, ☃ + 0.25F, ☃ + 0.74F);
        break;
      case 2: 
        bfl.b(☃ + 0.5F, ☃ + 0.25F, ☃ + 0.26F);
        ☃ = 180.0F;
        break;
      case 3: 
        bfl.b(☃ + 0.74F, ☃ + 0.25F, ☃ + 0.5F);
        ☃ = 270.0F;
        break;
      case 4: 
      default: 
        bfl.b(☃ + 0.26F, ☃ + 0.25F, ☃ + 0.5F);
        ☃ = 90.0F;
        break;
      }
    } else {
      bfl.b(☃ + 0.5F, ☃, ☃ + 0.5F);
    }
    float ☃ = 0.0625F;
    bfl.B();
    bfl.a(-1.0F, -1.0F, 1.0F);
    
    bfl.d();
    
    ☃.a(null, 0.0F, 0.0F, 0.0F, ☃, 0.0F, ☃);
    
    bfl.F();
    if (☃ >= 0)
    {
      bfl.n(5890);
      bfl.F();
      bfl.n(5888);
    }
  }
}
