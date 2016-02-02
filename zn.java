import java.util.List;

public class zn
  extends zw
{
  public int a(zx ☃, int ☃)
  {
    if (☃ == 1)
    {
      eb ☃ = a(☃, "Colors");
      if ((☃ instanceof ds))
      {
        ds ☃ = (ds)☃;
        int[] ☃ = ☃.c();
        if (☃.length == 1) {
          return ☃[0];
        }
        int ☃ = 0;
        int ☃ = 0;
        int ☃ = 0;
        for (int ☃ : ☃)
        {
          ☃ += ((☃ & 0xFF0000) >> 16);
          ☃ += ((☃ & 0xFF00) >> 8);
          ☃ += ((☃ & 0xFF) >> 0);
        }
        ☃ /= ☃.length;
        ☃ /= ☃.length;
        ☃ /= ☃.length;
        return ☃ << 16 | ☃ << 8 | ☃;
      }
      return 9079434;
    }
    return super.a(☃, ☃);
  }
  
  public static eb a(zx ☃, String ☃)
  {
    if (☃.n())
    {
      dn ☃ = ☃.o().m("Explosion");
      if (☃ != null) {
        return ☃.a(☃);
      }
    }
    return null;
  }
  
  public void a(zx ☃, wn ☃, List<String> ☃, boolean ☃)
  {
    if (☃.n())
    {
      dn ☃ = ☃.o().m("Explosion");
      if (☃ != null) {
        a(☃, ☃);
      }
    }
  }
  
  public static void a(dn ☃, List<String> ☃)
  {
    byte ☃ = ☃.d("Type");
    if ((☃ >= 0) && (☃ <= 4)) {
      ☃.add(di.a("item.fireworksCharge.type." + ☃).trim());
    } else {
      ☃.add(di.a("item.fireworksCharge.type").trim());
    }
    int[] ☃ = ☃.l("Colors");
    if (☃.length > 0)
    {
      boolean ☃ = true;
      String ☃ = "";
      for (int ☃ : ☃)
      {
        if (!☃) {
          ☃ = ☃ + ", ";
        }
        ☃ = false;
        
        boolean ☃ = false;
        for (int ☃ = 0; ☃ < ze.a.length; ☃++) {
          if (☃ == ze.a[☃])
          {
            ☃ = true;
            ☃ = ☃ + di.a(new StringBuilder().append("item.fireworksCharge.").append(zd.a(☃).d()).toString());
            break;
          }
        }
        if (!☃) {
          ☃ = ☃ + di.a("item.fireworksCharge.customColor");
        }
      }
      ☃.add(☃);
    }
    int[] ☃ = ☃.l("FadeColors");
    if (☃.length > 0)
    {
      boolean ☃ = true;
      String ☃ = di.a("item.fireworksCharge.fadeTo") + " ";
      for (int ☃ : ☃)
      {
        if (!☃) {
          ☃ = ☃ + ", ";
        }
        ☃ = false;
        
        boolean ☃ = false;
        for (int ☃ = 0; ☃ < 16; ☃++) {
          if (☃ == ze.a[☃])
          {
            ☃ = true;
            ☃ = ☃ + di.a(new StringBuilder().append("item.fireworksCharge.").append(zd.a(☃).d()).toString());
            break;
          }
        }
        if (!☃) {
          ☃ = ☃ + di.a("item.fireworksCharge.customColor");
        }
      }
      ☃.add(☃);
    }
    boolean ☃ = ☃.n("Trail");
    if (☃) {
      ☃.add(di.a("item.fireworksCharge.trail"));
    }
    boolean ☃ = ☃.n("Flicker");
    if (☃) {
      ☃.add(di.a("item.fireworksCharge.flicker"));
    }
  }
}
