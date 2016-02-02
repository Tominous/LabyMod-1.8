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
    if ((var1.f != null) && (var1.h != null)) {
      a(var1.f, var1.h.s, var1.h.u, var1.h.y, false, false);
    } else {
      a((adm)null, 0.0D, 0.0D, 0.0D, true, false);
    }
  }
  
  public void a(adm worldIn, double p_94241_2_, double p_94241_4_, double p_94241_6_, boolean p_94241_8_, boolean p_94241_9_)
  {
    if (!this.a.isEmpty())
    {
      double var10 = 0.0D;
      if ((worldIn != null) && (!p_94241_8_))
      {
        cj var12 = worldIn.M();
        double var13 = var12.n() - p_94241_2_;
        double var15 = var12.p() - p_94241_4_;
        p_94241_6_ %= 360.0D;
        var10 = -((p_94241_6_ - 90.0D) * 3.141592653589793D / 180.0D - Math.atan2(var15, var13));
        if (!worldIn.t.d()) {
          var10 = Math.random() * 3.141592653589793D * 2.0D;
        }
      }
      if (p_94241_9_)
      {
        this.j = var10;
      }
      else
      {
        for (double var17 = var10 - this.j; var17 < -3.141592653589793D; var17 += 6.283185307179586D) {}
        while (var17 >= 3.141592653589793D) {
          var17 -= 6.283185307179586D;
        }
        var17 = ns.a(var17, -1.0D, 1.0D);
        this.k += var17 * 0.1D;
        this.k *= 0.8D;
        this.j += this.k;
      }
      for (int var18 = (int)((this.j / 6.283185307179586D + 1.0D) * this.a.size()) % this.a.size(); var18 < 0; var18 = (var18 + this.a.size()) % this.a.size()) {}
      if (var18 != this.h)
      {
        this.h = var18;
        if (Config.isShaders()) {
          ShadersTex.uploadTexSub((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        } else {
          bml.a((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        }
      }
    }
  }
}
