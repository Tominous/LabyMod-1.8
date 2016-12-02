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
    this.m.put(aln.class, new bhj());
    this.m.put(all.class, new bhh());
    this.m.put(alu.class, new bhi());
    this.m.put(aky.class, new bhe());
    this.m.put(alf.class, new bhg());
    this.m.put(ale.class, new bhf());
    this.m.put(alp.class, new bhl());
    this.m.put(akv.class, new bhb());
    this.m.put(alo.class, new bhk());
    this.m.put(aku.class, new bha());
    for (bhd<?> ☃ : this.m.values()) {
      ☃.a(this);
    }
  }
  
  public <T extends akw> bhd<T> a(Class<? extends akw> ☃)
  {
    bhd<? extends akw> ☃ = (bhd)this.m.get(☃);
    if ((☃ == null) && (☃ != akw.class))
    {
      ☃ = a(☃.getSuperclass());
      this.m.put(☃, ☃);
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
    if (this.f != ☃) {
      a(☃);
    }
    this.e = ☃;
    this.g = ☃;
    this.n = ☃;
    
    this.h = (☃.A + (☃.y - ☃.A) * ☃);
    this.i = (☃.B + (☃.z - ☃.B) * ☃);
    
    this.j = (☃.P + (☃.s - ☃.P) * ☃);
    this.k = (☃.Q + (☃.t - ☃.Q) * ☃);
    this.l = (☃.R + (☃.u - ☃.R) * ☃);
  }
  
  public void a(akw ☃, float ☃, int ☃)
  {
    if (☃.a(this.j, this.k, this.l) < ☃.s())
    {
      int ☃ = this.f.b(☃.v(), 0);
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
    this.f = ☃;
  }
  
  public avn a()
  {
    return this.n;
  }
}
