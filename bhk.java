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
  
  public void a(alo te, double x, double y, double z, float partialTicks, int destroyStage)
  {
    cq enumfacing = cq.a(te.u() & 0x7);
    a((float)x, (float)y, (float)z, enumfacing, te.d() * 360 / 16.0F, te.c(), te.b(), destroyStage);
  }
  
  public void a(bhc rendererDispatcherIn)
  {
    super.a(rendererDispatcherIn);
    c = this;
  }
  
  public void a(float p_180543_1_, float p_180543_2_, float p_180543_3_, cq p_180543_4_, float p_180543_5_, int p_180543_6_, GameProfile p_180543_7_, int p_180543_8_)
  {
    bbo modelbase = this.h;
    if (p_180543_8_ >= 0)
    {
      a(a[p_180543_8_]);
      bfl.n(5890);
      bfl.E();
      bfl.a(4.0F, 2.0F, 1.0F);
      bfl.b(0.0625F, 0.0625F, 0.0625F);
      bfl.n(5888);
    }
    else
    {
      switch (p_180543_6_)
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
        modelbase = this.i;
        break;
      case 3: 
        modelbase = this.i;
        jy resourcelocation = bmz.a();
        if (p_180543_7_ != null)
        {
          ave minecraft = ave.A();
          Map<MinecraftProfileTexture.Type, MinecraftProfileTexture> map = minecraft.ab().a(p_180543_7_);
          if (map.containsKey(MinecraftProfileTexture.Type.SKIN))
          {
            resourcelocation = minecraft.ab().a((MinecraftProfileTexture)map.get(MinecraftProfileTexture.Type.SKIN), MinecraftProfileTexture.Type.SKIN);
          }
          else
          {
            UUID uuid = wn.a(p_180543_7_);
            resourcelocation = bmz.a(uuid);
          }
        }
        a(resourcelocation);
        break;
      case 4: 
        a(g);
      }
    }
    bfl.E();
    bfl.p();
    if (p_180543_4_ != cq.b) {
      switch (p_180543_4_)
      {
      case c: 
        bfl.b(p_180543_1_ + 0.5F, p_180543_2_ + 0.25F, p_180543_3_ + 0.74F);
        break;
      case d: 
        bfl.b(p_180543_1_ + 0.5F, p_180543_2_ + 0.25F, p_180543_3_ + 0.26F);
        p_180543_5_ = 180.0F;
        break;
      case e: 
        bfl.b(p_180543_1_ + 0.74F, p_180543_2_ + 0.25F, p_180543_3_ + 0.5F);
        p_180543_5_ = 270.0F;
        break;
      case f: 
      default: 
        bfl.b(p_180543_1_ + 0.26F, p_180543_2_ + 0.25F, p_180543_3_ + 0.5F);
        p_180543_5_ = 90.0F;break;
      }
    } else {
      bfl.b(p_180543_1_ + 0.5F, p_180543_2_, p_180543_3_ + 0.5F);
    }
    float f = 0.0625F;
    bfl.B();
    bfl.a(-1.0F, -1.0F, 1.0F);
    bfl.d();
    modelbase.a((pk)null, 0.0F, 0.0F, 0.0F, p_180543_5_, 0.0F, f);
    bfl.F();
    if (p_180543_8_ >= 0)
    {
      bfl.n(5890);
      bfl.F();
      bfl.n(5888);
    }
  }
}
