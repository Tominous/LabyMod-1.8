import java.util.Random;

public class aaw
  extends zw
{
  public aaw()
  {
    this.h = 16;
    a(yz.f);
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (!☃.bA.d) {
      ☃.b -= 1;
    }
    ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
    if (!☃.D) {
      ☃.d(new wx(☃, ☃));
    }
    ☃.b(na.ad[zw.b(this)]);
    return ☃;
  }
}
