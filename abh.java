import com.google.common.collect.Lists;
import java.util.List;

public class abh
  implements abs
{
  public boolean a(xp ☃, adm ☃)
  {
    zx ☃ = null;
    List<zx> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if ((☃.b() instanceof yj))
        {
          yj ☃ = (yj)☃.b();
          if ((☃.x_() == yj.a.a) && (☃ == null)) {
            ☃ = ☃;
          } else {
            return false;
          }
        }
        else if (☃.b() == zy.aW)
        {
          ☃.add(☃);
        }
        else
        {
          return false;
        }
      }
    }
    return (☃ != null) && (!☃.isEmpty());
  }
  
  public zx a(xp ☃)
  {
    zx ☃ = null;
    int[] ☃ = new int[3];
    int ☃ = 0;
    int ☃ = 0;
    yj ☃ = null;
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        if ((☃.b() instanceof yj))
        {
          ☃ = (yj)☃.b();
          if ((☃.x_() == yj.a.a) && (☃ == null))
          {
            ☃ = ☃.k();
            ☃.b = 1;
            if (☃.d_(☃))
            {
              int ☃ = ☃.b(☃);
              float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
              float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
              float ☃ = (☃ & 0xFF) / 255.0F;
              
              ☃ = (int)(☃ + Math.max(☃, Math.max(☃, ☃)) * 255.0F); int 
              
                tmp174_173 = 0; int[] tmp174_172 = ☃;tmp174_172[tmp174_173] = ((int)(tmp174_172[tmp174_173] + ☃ * 255.0F)); int 
                tmp187_186 = 1; int[] tmp187_185 = ☃;tmp187_185[tmp187_186] = ((int)(tmp187_185[tmp187_186] + ☃ * 255.0F)); int 
                tmp200_199 = 2; int[] tmp200_198 = ☃;tmp200_198[tmp200_199] = ((int)(tmp200_198[tmp200_199] + ☃ * 255.0F));
              ☃++;
            }
          }
          else
          {
            return null;
          }
        }
        else if (☃.b() == zy.aW)
        {
          float[] ☃ = tv.a(zd.a(☃.i()));
          int ☃ = (int)(☃[0] * 255.0F);
          int ☃ = (int)(☃[1] * 255.0F);
          int ☃ = (int)(☃[2] * 255.0F);
          
          ☃ += Math.max(☃, Math.max(☃, ☃));
          
          ☃[0] += ☃;
          ☃[1] += ☃;
          ☃[2] += ☃;
          ☃++;
        }
        else
        {
          return null;
        }
      }
    }
    if (☃ == null) {
      return null;
    }
    int ☃ = ☃[0] / ☃;
    int ☃ = ☃[1] / ☃;
    int ☃ = ☃[2] / ☃;
    
    float ☃ = ☃ / ☃;
    float ☃ = Math.max(☃, Math.max(☃, ☃));
    
    ☃ = (int)(☃ * ☃ / ☃);
    ☃ = (int)(☃ * ☃ / ☃);
    ☃ = (int)(☃ * ☃ / ☃);
    
    int ☃ = ☃;
    ☃ = (☃ << 8) + ☃;
    ☃ = (☃ << 8) + ☃;
    
    ☃.b(☃, ☃);
    return ☃;
  }
  
  public int a()
  {
    return 10;
  }
  
  public zx b()
  {
    return null;
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
