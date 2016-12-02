import java.util.Random;

public class zk
  extends zw
{
  public zk()
  {
    h = 16;
    a(yz.f);
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (bA.d) {
      return ☃;
    }
    b -= 1;
    ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
    if (!D) {
      ☃.d(new xa(☃, ☃));
    }
    ☃.b(na.ad[zw.b(this)]);
    return ☃;
  }
}
