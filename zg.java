import java.util.Random;

public class zg
  extends zw
{
  public zg()
  {
    this.h = 16;
    a(yz.l);
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (!☃.bA.d) {
      ☃.b -= 1;
    }
    ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
    if (!☃.D) {
      ☃.d(new wz(☃, ☃));
    }
    ☃.b(na.ad[zw.b(this)]);
    return ☃;
  }
}
