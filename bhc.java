import com.google.common.collect.Maps;
import java.util.Map;

public class bhc
{
  private Map<Class<? extends akw>, bhd<? extends akw>> m = Maps.newHashMap();
  public static bhc a = new bhc();
  private avn n;
  public static double b;
  public static double c;
  public static double d;
  public bmj e;
  public adm f;
  public pk g;
  public float h;
  public float i;
  public double j;
  public double k;
  public double l;
  
  private bhc()
  {
    m.put(aln.class, new bhj());
    m.put(all.class, new bhh());
    m.put(alu.class, new bhi());
    m.put(aky.class, new bhe());
    m.put(alf.class, new bhg());
    m.put(ale.class, new bhf());
    m.put(alp.class, new bhl());
    m.put(akv.class, new bhb());
    m.put(alo.class, new bhk());
    m.put(aku.class, new bha());
    for (bhd<?> ☃ : m.values()) {
      ☃.a(this);
    }
  }
  
  public <T extends akw> bhd<T> a(Class<? extends akw> ☃)
  {
    bhd<? extends akw> ☃ = (bhd)m.get(☃);
    if ((☃ == null) && (☃ != akw.class))
    {
      ☃ = a(☃.getSuperclass());
      m.put(☃, ☃);
    }
    return ☃;
  }
  
  public <T extends akw> bhd<T> b(akw ☃)
  {
    if (☃ == null) {
      return null;
    }
    return a(☃.getClass());
  }
  
  public void a(adm ☃, bmj ☃, avn ☃, pk ☃, float ☃)
  {
    if (f != ☃) {
      a(☃);
    }
    e = ☃;
    g = ☃;
    n = ☃;
    
    h = (A + (y - A) * ☃);
    i = (B + (z - B) * ☃);
    
    j = (P + (s - P) * ☃);
    k = (Q + (t - Q) * ☃);
    l = (R + (u - R) * ☃);
  }
  
  public void a(akw ☃, float ☃, int ☃)
  {
    if (☃.a(j, k, l) < ☃.s())
    {
      int ☃ = f.b(☃.v(), 0);
      int ☃ = ☃ % 65536;
      int ☃ = ☃ / 65536;
      bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      cj ☃ = ☃.v();
      a(☃, ☃.n() - b, ☃.o() - c, ☃.p() - d, ☃, ☃);
    }
  }
  
  public void a(akw ☃, double ☃, double ☃, double ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, -1);
  }
  
  public void a(akw ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    bhd<akw> ☃ = b(☃);
    if (☃ != null) {
      try
      {
        ☃.a(☃, ☃, ☃, ☃, ☃, ☃);
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Rendering Block Entity");
        c ☃ = ☃.a("Block Entity Details");
        
        ☃.a(☃);
        
        throw new e(☃);
      }
    }
  }
  
  public void a(adm ☃)
  {
    f = ☃;
  }
  
  public avn a()
  {
    return n;
  }
}
