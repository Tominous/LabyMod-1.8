import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Collection;
import java.util.List;
import java.util.Map;

public class abe
{
  private static final Map<Integer, String> o = ;
  private static final Map<Integer, String> p = Maps.newHashMap();
  
  static
  {
    a = null;
    
    c = "+0-1-2-3&4-4+13";
    o.put(Integer.valueOf(pe.l.d()), "0 & !1 & !2 & !3 & 0+6");
    
    b = "-0+1-2-3&4-4+13";
    o.put(Integer.valueOf(pe.c.d()), "!0 & 1 & !2 & !3 & 1+6");
    
    h = "+0+1-2-3&4-4+13";
    o.put(Integer.valueOf(pe.n.d()), "0 & 1 & !2 & !3 & 0+6");
    
    f = "+0-1+2-3&4-4+13";
    o.put(Integer.valueOf(pe.h.d()), "0 & !1 & 2 & !3");
    
    d = "-0-1+2-3&4-4+13";
    o.put(Integer.valueOf(pe.u.d()), "!0 & !1 & 2 & !3 & 2+6");
    
    e = "-0+3-4+13";
    o.put(Integer.valueOf(pe.t.d()), "!0 & !1 & !2 & 3 & 3+6");
    o.put(Integer.valueOf(pe.i.d()), "!0 & !1 & 2 & 3");
    o.put(Integer.valueOf(pe.d.d()), "!0 & 1 & !2 & 3 & 3+6");
    
    g = "+0-1-2+3&4-4+13";
    o.put(Integer.valueOf(pe.g.d()), "0 & !1 & !2 & 3 & 3+6");
    
    l = "-0+1+2-3+13&4-4";
    o.put(Integer.valueOf(pe.r.d()), "!0 & 1 & 2 & !3 & 2+6");
    
    o.put(Integer.valueOf(pe.p.d()), "!0 & 1 & 2 & 3 & 2+6");
    
    m = "+0-1+2+3+13&4-4";
    o.put(Integer.valueOf(pe.o.d()), "0 & !1 & 2 & 3 & 2+6");
    
    n = "+0+1-2+3&4-4+13";
    o.put(Integer.valueOf(pe.j.d()), "0 & 1 & !2 & 3 & 3+6");
    
    j = "+5-6-7";
    p.put(Integer.valueOf(pe.c.d()), "5");
    p.put(Integer.valueOf(pe.e.d()), "5");
    p.put(Integer.valueOf(pe.g.d()), "5");
    p.put(Integer.valueOf(pe.l.d()), "5");
    p.put(Integer.valueOf(pe.i.d()), "5");
    p.put(Integer.valueOf(pe.h.d()), "5");
    p.put(Integer.valueOf(pe.m.d()), "5");
    p.put(Integer.valueOf(pe.u.d()), "5");
    p.put(Integer.valueOf(pe.j.d()), "5");
  }
  
  public static final String i = "-5+6-7";
  public static final String k = "+14&13-13";
  
  public static boolean a(int ☃, int ☃)
  {
    return (☃ & 1 << ☃) != 0;
  }
  
  private static int c(int ☃, int ☃)
  {
    return a(☃, ☃) ? 1 : 0;
  }
  
  private static int d(int ☃, int ☃)
  {
    return a(☃, ☃) ? 0 : 1;
  }
  
  public static int a(int ☃)
  {
    return a(☃, 5, 4, 3, 2, 1);
  }
  
  public static int a(Collection<pf> ☃)
  {
    int ☃ = 3694022;
    if ((☃ == null) || (☃.isEmpty())) {
      return ☃;
    }
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    for (pf ☃ : ☃) {
      if (☃.f())
      {
        int ☃ = pe.a[☃.a()].k();
        for (int ☃ = 0; ☃ <= ☃.c(); ☃++)
        {
          ☃ += (☃ >> 16 & 0xFF) / 255.0F;
          ☃ += (☃ >> 8 & 0xFF) / 255.0F;
          ☃ += (☃ >> 0 & 0xFF) / 255.0F;
          ☃ += 1.0F;
        }
      }
    }
    if (☃ == 0.0F) {
      return 0;
    }
    ☃ = ☃ / ☃ * 255.0F;
    ☃ = ☃ / ☃ * 255.0F;
    ☃ = ☃ / ☃ * 255.0F;
    
    return (int)☃ << 16 | (int)☃ << 8 | (int)☃;
  }
  
  public static boolean b(Collection<pf> ☃)
  {
    for (pf ☃ : ☃) {
      if (!☃.e()) {
        return false;
      }
    }
    return true;
  }
  
  private static final Map<Integer, Integer> q = Maps.newHashMap();
  
  public static int a(int ☃, boolean ☃)
  {
    Integer ☃ = nl.a(☃);
    if (!☃)
    {
      if (q.containsKey(☃)) {
        return ((Integer)q.get(☃)).intValue();
      }
      int ☃ = a(b(☃.intValue(), false));
      q.put(☃, Integer.valueOf(☃));
      return ☃;
    }
    return a(b(☃.intValue(), true));
  }
  
  private static final String[] r = { "potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky" };
  public static final String a;
  public static final String b;
  public static final String c;
  public static final String d;
  public static final String e;
  public static final String f;
  public static final String g;
  public static final String h;
  public static final String j;
  public static final String l;
  public static final String m;
  public static final String n;
  
  public static String c(int ☃)
  {
    int ☃ = a(☃);
    return r[☃];
  }
  
  private static int a(boolean ☃, boolean ☃, boolean ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = 0;
    if (☃) {
      ☃ = d(☃, ☃);
    } else if (☃ != -1)
    {
      if ((☃ == 0) && (h(☃) == ☃)) {
        ☃ = 1;
      } else if ((☃ == 1) && (h(☃) > ☃)) {
        ☃ = 1;
      } else if ((☃ == 2) && (h(☃) < ☃)) {
        ☃ = 1;
      }
    }
    else {
      ☃ = c(☃, ☃);
    }
    if (☃) {
      ☃ *= ☃;
    }
    if (☃) {
      ☃ *= -1;
    }
    return ☃;
  }
  
  private static int h(int ☃)
  {
    for (int ☃ = 0; ☃ > 0; ☃++) {
      ☃ &= ☃ - 1;
    }
    return ☃;
  }
  
  private static int a(String ☃, int ☃, int ☃, int ☃)
  {
    if ((☃ >= ☃.length()) || (☃ < 0) || (☃ >= ☃)) {
      return 0;
    }
    int ☃ = ☃.indexOf('|', ☃);
    if ((☃ >= 0) && (☃ < ☃))
    {
      int ☃ = a(☃, ☃, ☃ - 1, ☃);
      if (☃ > 0) {
        return ☃;
      }
      int ☃ = a(☃, ☃ + 1, ☃, ☃);
      if (☃ > 0) {
        return ☃;
      }
      return 0;
    }
    int ☃ = ☃.indexOf('&', ☃);
    if ((☃ >= 0) && (☃ < ☃))
    {
      int ☃ = a(☃, ☃, ☃ - 1, ☃);
      if (☃ <= 0) {
        return 0;
      }
      int ☃ = a(☃, ☃ + 1, ☃, ☃);
      if (☃ <= 0) {
        return 0;
      }
      if (☃ > ☃) {
        return ☃;
      }
      return ☃;
    }
    boolean ☃ = false;
    boolean ☃ = false;
    boolean ☃ = false;
    boolean ☃ = false;
    boolean ☃ = false;
    int ☃ = -1;
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    for (int ☃ = ☃; ☃ < ☃; ☃++)
    {
      char ☃ = ☃.charAt(☃);
      if ((☃ >= '0') && (☃ <= '9'))
      {
        if (☃)
        {
          ☃ = ☃ - '0';
          ☃ = true;
        }
        else
        {
          ☃ *= 10;
          ☃ += ☃ - '0';
          ☃ = true;
        }
      }
      else if (☃ == '*')
      {
        ☃ = true;
      }
      else if (☃ == '!')
      {
        if (☃)
        {
          ☃ += a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = ☃ = 0;
          ☃ = -1;
        }
        ☃ = true;
      }
      else if (☃ == '-')
      {
        if (☃)
        {
          ☃ += a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = ☃ = 0;
          ☃ = -1;
        }
        ☃ = true;
      }
      else if ((☃ == '=') || (☃ == '<') || (☃ == '>'))
      {
        if (☃)
        {
          ☃ += a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = ☃ = 0;
          ☃ = -1;
        }
        if (☃ == '=') {
          ☃ = 0;
        } else if (☃ == '<') {
          ☃ = 2;
        } else if (☃ == '>') {
          ☃ = 1;
        }
      }
      else if ((☃ == '+') && 
        (☃))
      {
        ☃ += a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
        ☃ = ☃ = ☃ = ☃ = ☃ = 0;
        ☃ = ☃ = 0;
        ☃ = -1;
      }
    }
    if (☃) {
      ☃ += a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
    return ☃;
  }
  
  public static List<pf> b(int ☃, boolean ☃)
  {
    List<pf> ☃ = null;
    for (pe ☃ : pe.a) {
      if ((☃ != null) && ((!☃.j()) || (☃)))
      {
        String ☃ = (String)o.get(Integer.valueOf(☃.d()));
        if (☃ != null)
        {
          int ☃ = a(☃, 0, ☃.length(), ☃);
          if (☃ > 0)
          {
            int ☃ = 0;
            String ☃ = (String)p.get(Integer.valueOf(☃.d()));
            if (☃ != null)
            {
              ☃ = a(☃, 0, ☃.length(), ☃);
              if (☃ < 0) {
                ☃ = 0;
              }
            }
            if (☃.b())
            {
              ☃ = 1;
            }
            else
            {
              ☃ = 1200 * (☃ * 3 + (☃ - 1) * 2);
              ☃ >>= ☃;
              ☃ = (int)Math.round(☃ * ☃.h());
              if ((☃ & 0x4000) != 0) {
                ☃ = (int)Math.round(☃ * 0.75D + 0.5D);
              }
            }
            if (☃ == null) {
              ☃ = Lists.newArrayList();
            }
            pf ☃ = new pf(☃.d(), ☃, ☃);
            if ((☃ & 0x4000) != 0) {
              ☃.a(true);
            }
            ☃.add(☃);
          }
        }
      }
    }
    return ☃;
  }
  
  private static int a(int ☃, int ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    if (☃)
    {
      if (!a(☃, ☃)) {
        return 0;
      }
    }
    else if (☃) {
      ☃ &= (1 << ☃ ^ 0xFFFFFFFF);
    } else if (☃)
    {
      if ((☃ & 1 << ☃) == 0) {
        ☃ |= 1 << ☃;
      } else {
        ☃ &= (1 << ☃ ^ 0xFFFFFFFF);
      }
    }
    else {
      ☃ |= 1 << ☃;
    }
    return ☃;
  }
  
  public static int a(int ☃, String ☃)
  {
    int ☃ = 0;
    int ☃ = ☃.length();
    
    boolean ☃ = false;
    boolean ☃ = false;
    boolean ☃ = false;
    boolean ☃ = false;
    int ☃ = 0;
    for (int ☃ = ☃; ☃ < ☃; ☃++)
    {
      char ☃ = ☃.charAt(☃);
      if ((☃ >= '0') && (☃ <= '9'))
      {
        ☃ *= 10;
        ☃ += ☃ - '0';
        ☃ = true;
      }
      else if (☃ == '!')
      {
        if (☃)
        {
          ☃ = a(☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = 0;
        }
        ☃ = true;
      }
      else if (☃ == '-')
      {
        if (☃)
        {
          ☃ = a(☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = 0;
        }
        ☃ = true;
      }
      else if (☃ == '+')
      {
        if (☃)
        {
          ☃ = a(☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = 0;
        }
      }
      else if (☃ == '&')
      {
        if (☃)
        {
          ☃ = a(☃, ☃, ☃, ☃, ☃);
          ☃ = ☃ = ☃ = ☃ = 0;
          ☃ = 0;
        }
        ☃ = true;
      }
    }
    if (☃) {
      ☃ = a(☃, ☃, ☃, ☃, ☃);
    }
    return ☃ & 0x7FFF;
  }
  
  public static int a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    return (a(☃, ☃) ? 16 : 0) | (a(☃, ☃) ? 8 : 0) | (a(☃, ☃) ? 4 : 0) | (a(☃, ☃) ? 2 : 0) | (a(☃, ☃) ? 1 : 0);
  }
}
