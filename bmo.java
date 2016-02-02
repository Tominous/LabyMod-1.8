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
    if (!this.a.isEmpty())
    {
      ave var1 = ave.A();
      double var2 = 0.0D;
      if ((var1.f != null) && (var1.h != null))
      {
        var2 = var1.f.c(1.0F);
        if (!var1.f.t.d()) {
          var2 = Math.random();
        }
      }
      for (double var4 = var2 - this.j; var4 < -0.5D; var4 += 1.0D) {}
      while (var4 >= 0.5D) {
        var4 -= 1.0D;
      }
      var4 = ns.a(var4, -1.0D, 1.0D);
      this.k += var4 * 0.1D;
      this.k *= 0.8D;
      this.j += this.k;
      for (int var6 = (int)((this.j + 1.0D) * this.a.size()) % this.a.size(); var6 < 0; var6 = (var6 + this.a.size()) % this.a.size()) {}
      if (var6 != this.h)
      {
        this.h = var6;
        if (Config.isShaders()) {
          ShadersTex.uploadTexSub((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        } else {
          bml.a((int[][])this.a.get(this.h), this.f, this.g, this.d, this.e, false, false);
        }
      }
    }
  }
}
