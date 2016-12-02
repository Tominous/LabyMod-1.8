import com.google.common.collect.Maps;
import java.util.Map;
import shadersmod.client.Shaders;
import shadersmod.client.ShadersRender;

public abstract class bkn
  implements blb
{
  protected static final jy b = new jy("textures/misc/enchanted_item_glint.png");
  protected bbo c;
  protected bbo d;
  private final bjl a;
  private float e = 1.0F;
  private float f = 1.0F;
  private float g = 1.0F;
  private float h = 1.0F;
  private boolean i;
  private static final Map j = Maps.newHashMap();
  private static final String __OBFID = "CL_00002428";
  
  public bkn(bjl p_i46125_1_)
  {
    a = p_i46125_1_;
    a();
  }
  
  public void a(pr p_177141_1_, float p_177141_2_, float p_177141_3_, float p_177141_4_, float p_177141_5_, float p_177141_6_, float p_177141_7_, float p_177141_8_)
  {
    a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_, 4);
    a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_, 3);
    a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_, 2);
    a(p_177141_1_, p_177141_2_, p_177141_3_, p_177141_4_, p_177141_5_, p_177141_6_, p_177141_7_, p_177141_8_, 1);
  }
  
  public boolean b()
  {
    return false;
  }
  
  private void a(pr p_177182_1_, float p_177182_2_, float p_177182_3_, float p_177182_4_, float p_177182_5_, float p_177182_6_, float p_177182_7_, float p_177182_8_, int p_177182_9_)
  {
    zx var10 = a(p_177182_1_, p_177182_9_);
    if ((var10 != null) && ((var10.b() instanceof yj)))
    {
      yj var11 = (yj)var10.b();
      bbo var12 = a(p_177182_9_);
      var12.a(a.b());
      var12.a(p_177182_1_, p_177182_2_, p_177182_3_, p_177182_4_);
      if (Reflector.ForgeHooksClient.exists()) {
        var12 = getArmorModelHook(p_177182_1_, var10, p_177182_9_, var12);
      }
      a(var12, p_177182_9_);
      boolean var13 = b(p_177182_9_);
      if (Reflector.ForgeHooksClient_getArmorTexture.exists())
      {
        int var14 = var11.b(var10);
        if (var14 != -1)
        {
          float var15 = (var14 >> 16 & 0xFF) / 255.0F;
          float var16 = (var14 >> 8 & 0xFF) / 255.0F;
          float var17 = (var14 & 0xFF) / 255.0F;
          bfl.c(f * var15, g * var16, h * var17, e);
          var12.a(p_177182_1_, p_177182_2_, p_177182_3_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
          if (Config.isCustomItems())
          {
            if (CustomItems.bindCustomArmorTexture(var10, var13 ? 2 : 1, "overlay")) {}
          }
          else {
            a.a(getArmorResource(p_177182_1_, var10, var13 ? 2 : 1, "overlay"));
          }
        }
        else
        {
          bfl.c(f, g, h, e);
          var12.a(p_177182_1_, p_177182_2_, p_177182_3_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
        }
        if ((!i) && (var10.w())) {
          if ((!Config.isCustomItems()) || (!CustomItems.renderCustomArmorEffect(p_177182_1_, var10, var12, p_177182_2_, p_177182_3_, p_177182_4_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_))) {
            a(p_177182_1_, var12, p_177182_2_, p_177182_3_, p_177182_4_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
          }
        }
        return;
      }
      if (Config.isCustomItems())
      {
        if (CustomItems.bindCustomArmorTexture(var10, var13 ? 2 : 1, null)) {}
      }
      else {
        a.a(a(var11, var13));
      }
      switch (bkn.1.a[var11.x_().ordinal()])
      {
      case 1: 
        int var14 = var11.b(var10);
        float var15 = (var14 >> 16 & 0xFF) / 255.0F;
        float var16 = (var14 >> 8 & 0xFF) / 255.0F;
        float var17 = (var14 & 0xFF) / 255.0F;
        bfl.c(f * var15, g * var16, h * var17, e);
        var12.a(p_177182_1_, p_177182_2_, p_177182_3_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
        if (Config.isCustomItems()) {
          if (CustomItems.bindCustomArmorTexture(var10, var13 ? 2 : 1, "overlay")) {
            break;
          }
        } else {
          a.a(a(var11, var13, "overlay"));
        }
      case 2: 
      case 3: 
      case 4: 
      case 5: 
        bfl.c(f, g, h, e);
        var12.a(p_177182_1_, p_177182_2_, p_177182_3_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
      }
      if ((!i) && (var10.w())) {
        if ((!Config.isCustomItems()) || (!CustomItems.renderCustomArmorEffect(p_177182_1_, var10, var12, p_177182_2_, p_177182_3_, p_177182_4_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_))) {
          a(p_177182_1_, var12, p_177182_2_, p_177182_3_, p_177182_4_, p_177182_5_, p_177182_6_, p_177182_7_, p_177182_8_);
        }
      }
    }
  }
  
  public zx a(pr p_177176_1_, int p_177176_2_)
  {
    return p_177176_1_.q(p_177176_2_ - 1);
  }
  
  public bbo a(int p_177175_1_)
  {
    return b(p_177175_1_) ? c : d;
  }
  
  private boolean b(int p_177180_1_)
  {
    return p_177180_1_ == 2;
  }
  
  private void a(pr p_177183_1_, bbo p_177183_2_, float p_177183_3_, float p_177183_4_, float p_177183_5_, float p_177183_6_, float p_177183_7_, float p_177183_8_, float p_177183_9_)
  {
    if (Config.isShaders())
    {
      if (Shaders.isShadowPass) {
        return;
      }
      ShadersRender.layerArmorBaseDrawEnchantedGlintBegin();
    }
    float var10 = W + p_177183_5_;
    a.a(b);
    bfl.l();
    bfl.c(514);
    bfl.a(false);
    float var11 = 0.5F;
    bfl.c(var11, var11, var11, 1.0F);
    for (int var12 = 0; var12 < 2; var12++)
    {
      bfl.f();
      bfl.b(768, 1);
      float var13 = 0.76F;
      bfl.c(0.5F * var13, 0.25F * var13, 0.8F * var13, 1.0F);
      bfl.n(5890);
      bfl.D();
      float var14 = 0.33333334F;
      bfl.a(var14, var14, var14);
      bfl.b(30.0F - var12 * 60.0F, 0.0F, 0.0F, 1.0F);
      bfl.b(0.0F, var10 * (0.001F + var12 * 0.003F) * 20.0F, 0.0F);
      bfl.n(5888);
      p_177183_2_.a(p_177183_1_, p_177183_3_, p_177183_4_, p_177183_6_, p_177183_7_, p_177183_8_, p_177183_9_);
    }
    bfl.n(5890);
    bfl.D();
    bfl.n(5888);
    bfl.e();
    bfl.a(true);
    bfl.c(515);
    bfl.k();
    if (Config.isShaders()) {
      ShadersRender.layerArmorBaseDrawEnchantedGlintEnd();
    }
  }
  
  private jy a(yj p_177181_1_, boolean p_177181_2_)
  {
    return a(p_177181_1_, p_177181_2_, (String)null);
  }
  
  private jy a(yj p_177178_1_, boolean p_177178_2_, String p_177178_3_)
  {
    String var4 = String.format("textures/models/armor/%s_layer_%d%s.png", new Object[] { p_177178_1_.x_().c(), Integer.valueOf(p_177178_2_ ? 2 : 1), p_177178_3_ == null ? "" : String.format("_%s", new Object[] { p_177178_3_ }) });
    jy var5 = (jy)j.get(var4);
    if (var5 == null)
    {
      var5 = new jy(var4);
      j.put(var4, var5);
    }
    return var5;
  }
  
  protected abstract void a();
  
  protected abstract void a(bbo parambbo, int paramInt);
  
  protected bbo getArmorModelHook(pr entity, zx itemStack, int slot, bbo model)
  {
    return model;
  }
  
  public jy getArmorResource(pk entity, zx stack, int slot, String type)
  {
    yj item = (yj)stack.b();
    String texture = item.x_().c();
    String domain = "minecraft";
    int idx = texture.indexOf(':');
    if (idx != -1)
    {
      domain = texture.substring(0, idx);
      texture = texture.substring(idx + 1);
    }
    String s1 = String.format("%s:textures/models/armor/%s_layer_%d%s.png", new Object[] { domain, texture, Integer.valueOf(slot == 2 ? 2 : 1), type == null ? "" : String.format("_%s", new Object[] { type }) });
    
    s1 = Reflector.callString(Reflector.ForgeHooksClient_getArmorTexture, new Object[] { entity, stack, s1, Integer.valueOf(slot), type });
    jy resourcelocation = (jy)j.get(s1);
    if (resourcelocation == null)
    {
      resourcelocation = new jy(s1);
      j.put(s1, resourcelocation);
    }
    return resourcelocation;
  }
}
