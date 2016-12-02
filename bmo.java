import java.util.List;
import shadersmod.client.ShadersTex;

public class bmo
  extends bmi
{
  private double j;
  private double k;
  private static final String __OBFID = "CL_00001070";
  
  public bmo(String p_i1285_1_)
  {
    super(p_i1285_1_);
  }
  
  public void j()
  {
    if (!a.isEmpty())
    {
      ave var1 = ave.A();
      double var2 = 0.0D;
      if ((f != null) && (h != null))
      {
        var2 = f.c(1.0F);
        if (!f.t.d()) {
          var2 = Math.random();
        }
      }
      for (double var4 = var2 - j; var4 < -0.5D; var4 += 1.0D) {}
      while (var4 >= 0.5D) {
        var4 -= 1.0D;
      }
      var4 = ns.a(var4, -1.0D, 1.0D);
      k += var4 * 0.1D;
      k *= 0.8D;
      j += k;
      for (int var6 = (int)((j + 1.0D) * a.size()) % a.size(); var6 < 0; var6 = (var6 + a.size()) % a.size()) {}
      if (var6 != h)
      {
        h = var6;
        if (Config.isShaders()) {
          ShadersTex.uploadTexSub((int[][])a.get(h), f, g, d, e, false, false);
        } else {
          bml.a((int[][])a.get(h), f, g, d, e, false, false);
        }
      }
    }
  }
}
