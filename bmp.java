import java.util.List;
import shadersmod.client.ShadersTex;

public class bmp
  extends bmi
{
  public double j;
  public double k;
  public static String l;
  private static final String __OBFID = "CL_00001071";
  
  public bmp(String p_i1286_1_)
  {
    super(p_i1286_1_);
    l = p_i1286_1_;
  }
  
  public void j()
  {
    ave var1 = ave.A();
    if ((f != null) && (h != null)) {
      a(f, h.s, h.u, h.y, false, false);
    } else {
      a((adm)null, 0.0D, 0.0D, 0.0D, true, false);
    }
  }
  
  public void a(adm worldIn, double p_94241_2_, double p_94241_4_, double p_94241_6_, boolean p_94241_8_, boolean p_94241_9_)
  {
    if (!a.isEmpty())
    {
      double var10 = 0.0D;
      if ((worldIn != null) && (!p_94241_8_))
      {
        cj var12 = worldIn.M();
        double var13 = var12.n() - p_94241_2_;
        double var15 = var12.p() - p_94241_4_;
        p_94241_6_ %= 360.0D;
        var10 = -((p_94241_6_ - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(var15, var13));
        if (!t.d()) {
          var10 = Math.random() * 3.141592653589793D * 2.0D;
        }
      }
      if (p_94241_9_)
      {
        j = var10;
      }
      else
      {
        for (double var17 = var10 - j; var17 < -3.141592653589793D; var17 += 6.283185307179586D) {}
        while (var17 >= 3.141592653589793D) {
          var17 -= 6.283185307179586D;
        }
        var17 = ns.a(var17, -1.0D, 1.0D);
        k += var17 * 0.1D;
        k *= 0.8D;
        j += k;
      }
      for (int var18 = (int)((j / 6.283185307179586D + 1.0D) * a.size()) % a.size(); var18 < 0; var18 = (var18 + a.size()) % a.size()) {}
      if (var18 != h)
      {
        h = var18;
        if (Config.isShaders()) {
          ShadersTex.uploadTexSub((int[][])a.get(h), f, g, d, e, false, false);
        } else {
          bml.a((int[][])a.get(h), f, g, d, e, false, false);
        }
      }
    }
  }
}
