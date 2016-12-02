import java.util.Random;

public class zq
  extends zw
{
  public zq()
  {
    d(64);
    c(1);
    a(yz.i);
  }
  
  public boolean w_()
  {
    return true;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if (☃.bG != null)
    {
      int ☃ = ☃.bG.l();
      ☃.a(☃, ☃);
      ☃.bw();
    }
    else
    {
      ☃.a(☃, "random.bow", 0.5F, 0.4F / (g.nextFloat() * 0.4F + 0.8F));
      if (!☃.D) {
        ☃.d(new ur(☃, ☃));
      }
      ☃.bw();
      ☃.b(na.ad[zw.b(this)]);
    }
    return ☃;
  }
  
  public boolean f_(zx ☃)
  {
    return super.f_(☃);
  }
  
  public int b()
  {
    return 1;
  }
}
