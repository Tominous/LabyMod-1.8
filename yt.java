import java.util.Random;

public class yt
  extends zw
{
  public static final String[] a = { "pulling_0", "pulling_1", "pulling_2" };
  
  public yt()
  {
    h = 1;
    d(384);
    a(yz.j);
  }
  
  public void a(zx ☃, adm ☃, wn ☃, int ☃)
  {
    boolean ☃ = (bA.d) || (ack.a(yB, ☃) > 0);
    if ((☃) || (bi.b(zy.g)))
    {
      int ☃ = d(☃) - ☃;
      float ☃ = ☃ / 20.0F;
      ☃ = (☃ * ☃ + ☃ * 2.0F) / 3.0F;
      if (☃ < 0.1D) {
        return;
      }
      if (☃ > 1.0F) {
        ☃ = 1.0F;
      }
      wq ☃ = new wq(☃, ☃, ☃ * 2.0F);
      if (☃ == 1.0F) {
        ☃.a(true);
      }
      int ☃ = ack.a(vB, ☃);
      if (☃ > 0) {
        ☃.b(☃.j() + ☃ * 0.5D + 0.5D);
      }
      int ☃ = ack.a(wB, ☃);
      if (☃ > 0) {
        ☃.a(☃);
      }
      if (ack.a(xB, ☃) > 0) {
        ☃.e(100);
      }
      ☃.a(1, ☃);
      
      ☃.a(☃, "random.bow", 1.0F, 1.0F / (g.nextFloat() * 0.4F + 1.2F) + ☃ * 0.5F);
      if (☃) {
        a = 2;
      } else {
        bi.a(zy.g);
      }
      ☃.b(na.ad[zw.b(this)]);
      if (!D) {
        ☃.d(☃);
      }
    }
  }
  
  public zx b(zx ☃, adm ☃, wn ☃)
  {
    return ☃;
  }
  
  public int d(zx ☃)
  {
    return 72000;
  }
  
  public aba e(zx ☃)
  {
    return aba.e;
  }
  
  public zx a(zx ☃, adm ☃, wn ☃)
  {
    if ((bA.d) || (bi.b(zy.g))) {
      ☃.a(☃, d(☃));
    }
    return ☃;
  }
  
  public int b()
  {
    return 1;
  }
}
