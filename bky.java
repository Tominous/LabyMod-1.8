import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;

public class bky
  implements blb<pr>
{
  private final bjl<?> a;
  
  public bky(bjl<?> livingEntityRendererIn)
  {
    this.a = livingEntityRendererIn;
  }
  
  public void a(pr entitylivingbaseIn, float p_177141_2_, float p_177141_3_, float partialTicks, float p_177141_5_, float p_177141_6_, float p_177141_7_, float scale)
  {
    zx itemstack = entitylivingbaseIn.bA();
    if (itemstack != null)
    {
      bfl.E();
      if (this.a.b().r)
      {
        float f = 0.5F;
        bfl.b(0.0F, 0.625F, 0.0F);
        bfl.b(-20.0F, -1.0F, 0.0F, 0.0F);
        bfl.a(f, f, f);
      }
      if ((ConfigManager.settings.oldSword.booleanValue()) && (Allowed.animations()))
      {
        if (entitylivingbaseIn.isBlocking())
        {
          if (entitylivingbaseIn.av())
          {
            ((bbj)this.a.b()).a(0.0325F);
            bfl.b(-0.58F, 0.3F, -0.2F);
            bfl.b(-24390.0F, 137290.0F, -2009900.0F, -2054900.0F);
          }
          else
          {
            ((bbj)this.a.b()).a(0.0325F);
            bfl.b(-0.48F, 0.2F, -0.2F);
            bfl.b(-24390.0F, 137290.0F, -2009900.0F, -2054900.0F);
          }
        }
        else {
          ((bbj)this.a.b()).a(0.0625F);
        }
      }
      else {
        ((bbj)this.a.b()).a(0.0625F);
      }
      bfl.b(-0.0625F, 0.4375F, 0.0625F);
      if (((entitylivingbaseIn instanceof wn)) && (((wn)entitylivingbaseIn).bG != null)) {
        itemstack = new zx(zy.aR, 0);
      }
      zw item = itemstack.b();
      ave minecraft = ave.A();
      if (((item instanceof yo)) && (afh.a(item).b() == 2))
      {
        bfl.b(0.0F, 0.1875F, -0.3125F);
        bfl.b(20.0F, 1.0F, 0.0F, 0.0F);
        bfl.b(45.0F, 0.0F, 1.0F, 0.0F);
        float f1 = 0.375F;
        bfl.a(-f1, -f1, f1);
      }
      if (entitylivingbaseIn.av()) {
        bfl.b(0.0F, 0.203125F, 0.0F);
      }
      minecraft.ah().a(entitylivingbaseIn, itemstack, bgr.b.b);
      bfl.F();
    }
  }
  
  public boolean b()
  {
    return false;
  }
}
