import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class ack
{
  private static final Random a = new Random();
  
  public static int a(int ☃, zx ☃)
  {
    if (☃ == null) {
      return 0;
    }
    du ☃ = ☃.p();
    if (☃ == null) {
      return 0;
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      int ☃ = ☃.b(☃).e("id");
      int ☃ = ☃.b(☃).e("lvl");
      if (☃ == ☃) {
        return ☃;
      }
    }
    return 0;
  }
  
  public static Map<Integer, Integer> a(zx ☃)
  {
    Map<Integer, Integer> ☃ = Maps.newLinkedHashMap();
    du ☃ = ☃.b() == zy.cd ? zy.cd.h(☃) : ☃.p();
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        int ☃ = ☃.b(☃).e("id");
        int ☃ = ☃.b(☃).e("lvl");
        
        ☃.put(Integer.valueOf(☃), Integer.valueOf(☃));
      }
    }
    return ☃;
  }
  
  public static void a(Map<Integer, Integer> ☃, zx ☃)
  {
    du ☃ = new du();
    for (Iterator ☃ = ☃.keySet().iterator(); ☃.hasNext();)
    {
      int ☃ = ((Integer)☃.next()).intValue();
      aci ☃ = aci.c(☃);
      if (☃ != null)
      {
        dn ☃ = new dn();
        
        ☃.a("id", (short)☃);
        ☃.a("lvl", (short)((Integer)☃.get(Integer.valueOf(☃))).intValue());
        
        ☃.a(☃);
        if (☃.b() == zy.cd) {
          zy.cd.a(☃, new acl(☃, ((Integer)☃.get(Integer.valueOf(☃))).intValue()));
        }
      }
    }
    if (☃.c() > 0)
    {
      if (☃.b() != zy.cd) {
        ☃.a("ench", ☃);
      }
    }
    else if (☃.n()) {
      ☃.o().o("ench");
    }
  }
  
  public static int a(int ☃, zx[] ☃)
  {
    if (☃ == null) {
      return 0;
    }
    int ☃ = 0;
    for (zx ☃ : ☃)
    {
      int ☃ = a(☃, ☃);
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  private static void a(ack.c ☃, zx ☃)
  {
    if (☃ == null) {
      return;
    }
    du ☃ = ☃.p();
    if (☃ == null) {
      return;
    }
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      int ☃ = ☃.b(☃).e("id");
      int ☃ = ☃.b(☃).e("lvl");
      if (aci.c(☃) != null) {
        ☃.a(aci.c(☃), ☃);
      }
    }
  }
  
  private static void a(ack.c ☃, zx[] ☃)
  {
    for (zx ☃ : ☃) {
      a(☃, ☃);
    }
  }
  
  static abstract interface c
  {
    public abstract void a(aci paramaci, int paramInt);
  }
  
  static final class e
    implements ack.c
  {
    public int a;
    public ow b;
    
    public void a(aci ☃, int ☃)
    {
      this.a += ☃.a(☃, this.b);
    }
  }
  
  private static final ack.e b = new ack.e(null);
  
  public static int a(zx[] ☃, ow ☃)
  {
    b.a = 0;
    b.b = ☃;
    
    a(b, ☃);
    if (b.a > 25) {
      b.a = 25;
    } else if (b.a < 0) {
      b.a = 0;
    }
    return (b.a + 1 >> 1) + a.nextInt((b.a >> 1) + 1);
  }
  
  static final class d
    implements ack.c
  {
    public float a;
    public pw b;
    
    public void a(aci ☃, int ☃)
    {
      this.a += ☃.a(☃, this.b);
    }
  }
  
  private static final ack.d c = new ack.d(null);
  
  public static float a(zx ☃, pw ☃)
  {
    c.a = 0.0F;
    c.b = ☃;
    
    a(c, ☃);
    
    return c.a;
  }
  
  static final class b
    implements ack.c
  {
    public pr a;
    public pk b;
    
    public void a(aci ☃, int ☃)
    {
      ☃.b(this.a, this.b, ☃);
    }
  }
  
  private static final ack.b d = new ack.b(null);
  
  public static void a(pr ☃, pk ☃)
  {
    d.b = ☃;
    d.a = ☃;
    if (☃ != null) {
      a(d, ☃.as());
    }
    if ((☃ instanceof wn)) {
      a(d, ☃.bA());
    }
  }
  
  static final class a
    implements ack.c
  {
    public pr a;
    public pk b;
    
    public void a(aci ☃, int ☃)
    {
      ☃.a(this.a, this.b, ☃);
    }
  }
  
  private static final ack.a e = new ack.a(null);
  
  public static void b(pr ☃, pk ☃)
  {
    e.a = ☃;
    e.b = ☃;
    if (☃ != null) {
      a(e, ☃.as());
    }
    if ((☃ instanceof wn)) {
      a(e, ☃.bA());
    }
  }
  
  public static int a(pr ☃)
  {
    return a(aci.o.B, ☃.bA());
  }
  
  public static int b(pr ☃)
  {
    return a(aci.p.B, ☃.bA());
  }
  
  public static int a(pk ☃)
  {
    return a(aci.h.B, ☃.as());
  }
  
  public static int b(pk ☃)
  {
    return a(aci.k.B, ☃.as());
  }
  
  public static int c(pr ☃)
  {
    return a(aci.r.B, ☃.bA());
  }
  
  public static boolean e(pr ☃)
  {
    return a(aci.s.B, ☃.bA()) > 0;
  }
  
  public static int f(pr ☃)
  {
    return a(aci.u.B, ☃.bA());
  }
  
  public static int g(pr ☃)
  {
    return a(aci.z.B, ☃.bA());
  }
  
  public static int h(pr ☃)
  {
    return a(aci.A.B, ☃.bA());
  }
  
  public static int i(pr ☃)
  {
    return a(aci.q.B, ☃.bA());
  }
  
  public static boolean j(pr ☃)
  {
    return a(aci.i.B, ☃.as()) > 0;
  }
  
  public static zx a(aci ☃, pr ☃)
  {
    for (zx ☃ : ☃.as()) {
      if ((☃ != null) && (a(☃.B, ☃) > 0)) {
        return ☃;
      }
    }
    return null;
  }
  
  public static int a(Random ☃, int ☃, int ☃, zx ☃)
  {
    zw ☃ = ☃.b();
    int ☃ = ☃.b();
    if (☃ <= 0) {
      return 0;
    }
    if (☃ > 15) {
      ☃ = 15;
    }
    int ☃ = ☃.nextInt(8) + 1 + (☃ >> 1) + ☃.nextInt(☃ + 1);
    if (☃ == 0) {
      return Math.max(☃ / 3, 1);
    }
    if (☃ == 1) {
      return ☃ * 2 / 3 + 1;
    }
    return Math.max(☃, ☃ * 2);
  }
  
  public static zx a(Random ☃, zx ☃, int ☃)
  {
    List<acl> ☃ = b(☃, ☃, ☃);
    boolean ☃ = ☃.b() == zy.aL;
    if (☃) {
      ☃.a(zy.cd);
    }
    if (☃ != null) {
      for (acl ☃ : ☃) {
        if (☃) {
          zy.cd.a(☃, ☃);
        } else {
          ☃.a(☃.b, ☃.c);
        }
      }
    }
    return ☃;
  }
  
  public static List<acl> b(Random ☃, zx ☃, int ☃)
  {
    zw ☃ = ☃.b();
    int ☃ = ☃.b();
    if (☃ <= 0) {
      return null;
    }
    ☃ /= 2;
    ☃ = 1 + ☃.nextInt((☃ >> 1) + 1) + ☃.nextInt((☃ >> 1) + 1);
    
    int ☃ = ☃ + ☃;
    
    float ☃ = (☃.nextFloat() + ☃.nextFloat() - 1.0F) * 0.15F;
    int ☃ = (int)(☃ * (1.0F + ☃) + 0.5F);
    if (☃ < 1) {
      ☃ = 1;
    }
    List<acl> ☃ = null;
    
    Map<Integer, acl> ☃ = b(☃, ☃);
    if ((☃ != null) && (!☃.isEmpty()))
    {
      acl ☃ = (acl)oa.a(☃, ☃.values());
      if (☃ != null)
      {
        ☃ = Lists.newArrayList();
        ☃.add(☃);
        
        int ☃ = ☃;
        while (☃.nextInt(50) <= ☃)
        {
          Iterator<Integer> ☃ = ☃.keySet().iterator();
          while (☃.hasNext())
          {
            Integer ☃ = (Integer)☃.next();
            boolean ☃ = true;
            for (acl ☃ : ☃) {
              if (!☃.b.a(aci.c(☃.intValue())))
              {
                ☃ = false;
                break;
              }
            }
            if (!☃) {
              ☃.remove();
            }
          }
          if (!☃.isEmpty())
          {
            acl ☃ = (acl)oa.a(☃, ☃.values());
            ☃.add(☃);
          }
          ☃ >>= 1;
        }
      }
    }
    return ☃;
  }
  
  public static Map<Integer, acl> b(int ☃, zx ☃)
  {
    zw ☃ = ☃.b();
    Map<Integer, acl> ☃ = null;
    boolean ☃ = ☃.b() == zy.aL;
    for (aci ☃ : aci.b) {
      if (☃ != null) {
        if ((☃.C.a(☃)) || (☃)) {
          for (int ☃ = ☃.e(); ☃ <= ☃.b(); ☃++) {
            if ((☃ >= ☃.a(☃)) && (☃ <= ☃.b(☃)))
            {
              if (☃ == null) {
                ☃ = Maps.newHashMap();
              }
              ☃.put(Integer.valueOf(☃.B), new acl(☃, ☃));
            }
          }
        }
      }
    }
    return ☃;
  }
}
