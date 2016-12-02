import com.google.common.collect.Lists;
import java.util.List;

public class abm
  implements abs
{
  private zx a;
  
  public boolean a(xp ☃, adm ☃)
  {
    a = null;
    
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if (☃.b() == zy.H) {
          ☃++;
        } else if (☃.b() == zy.cc) {
          ☃++;
        } else if (☃.b() == zy.aW) {
          ☃++;
        } else if (☃.b() == zy.aK) {
          ☃++;
        } else if (☃.b() == zy.aT) {
          ☃++;
        } else if (☃.b() == zy.i) {
          ☃++;
        } else if (☃.b() == zy.bL) {
          ☃++;
        } else if (☃.b() == zy.G) {
          ☃++;
        } else if (☃.b() == zy.bx) {
          ☃++;
        } else if (☃.b() == zy.bX) {
          ☃++;
        } else {
          return false;
        }
      }
    }
    ☃ += ☃ + ☃;
    if ((☃ > 3) || (☃ > 1)) {
      return false;
    }
    if ((☃ >= 1) && (☃ == 1) && (☃ == 0))
    {
      a = new zx(zy.cb);
      if (☃ > 0)
      {
        dn ☃ = new dn();
        dn ☃ = new dn();
        du ☃ = new du();
        for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
        {
          zx ☃ = ☃.a(☃);
          if ((☃ != null) && (☃.b() == zy.cc)) {
            if ((☃.n()) && (☃.o().b("Explosion", 10))) {
              ☃.a(☃.o().m("Explosion"));
            }
          }
        }
        ☃.a("Explosions", ☃);
        ☃.a("Flight", (byte)☃);
        ☃.a("Fireworks", ☃);
        a.d(☃);
      }
      return true;
    }
    if ((☃ == 1) && (☃ == 0) && (☃ == 0) && (☃ > 0) && (☃ <= 1))
    {
      a = new zx(zy.cc);
      dn ☃ = new dn();
      dn ☃ = new dn();
      
      byte ☃ = 0;
      
      List<Integer> ☃ = Lists.newArrayList();
      for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
      {
        zx ☃ = ☃.a(☃);
        if (☃ != null) {
          if (☃.b() == zy.aW) {
            ☃.add(Integer.valueOf(ze.a[(☃.i() & 0xF)]));
          } else if (☃.b() == zy.aT) {
            ☃.a("Flicker", true);
          } else if (☃.b() == zy.i) {
            ☃.a("Trail", true);
          } else if (☃.b() == zy.bL) {
            ☃ = 1;
          } else if (☃.b() == zy.G) {
            ☃ = 4;
          } else if (☃.b() == zy.bx) {
            ☃ = 2;
          } else if (☃.b() == zy.bX) {
            ☃ = 3;
          }
        }
      }
      int[] ☃ = new int[☃.size()];
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = ((Integer)☃.get(☃)).intValue();
      }
      ☃.a("Colors", ☃);
      ☃.a("Type", ☃);
      ☃.a("Explosion", ☃);
      a.d(☃);
      return true;
    }
    if ((☃ == 0) && (☃ == 0) && (☃ == 1) && (☃ > 0) && (☃ == ☃))
    {
      List<Integer> ☃ = Lists.newArrayList();
      for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
      {
        zx ☃ = ☃.a(☃);
        if (☃ != null) {
          if (☃.b() == zy.aW)
          {
            ☃.add(Integer.valueOf(ze.a[(☃.i() & 0xF)]));
          }
          else if (☃.b() == zy.cc)
          {
            a = ☃.k();
            a.b = 1;
          }
        }
      }
      int[] ☃ = new int[☃.size()];
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        ☃[☃] = ((Integer)☃.get(☃)).intValue();
      }
      if ((a != null) && (a.n()))
      {
        dn ☃ = a.o().m("Explosion");
        if (☃ == null) {
          return false;
        }
        ☃.a("FadeColors", ☃);
      }
      else
      {
        return false;
      }
      return true;
    }
    return false;
  }
  
  public zx a(xp ☃)
  {
    return a.k();
  }
  
  public int a()
  {
    return 10;
  }
  
  public zx b()
  {
    return a;
  }
  
  public zx[] b(xp ☃)
  {
    zx[] ☃ = new zx[☃.o_()];
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      zx ☃ = ☃.a(☃);
      if ((☃ != null) && (☃.b().r())) {
        ☃[☃] = new zx(☃.b().q());
      }
    }
    return ☃;
  }
}
