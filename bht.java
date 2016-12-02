import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.nio.FloatBuffer;
import java.util.EnumMap;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;

public class bht
{
  private adm d;
  private final bfr e;
  public static int a;
  private cj f;
  public bhq b = bhq.a;
  private final ReentrantLock g = new ReentrantLock();
  private final ReentrantLock h = new ReentrantLock();
  private bhn i = null;
  private final Set<akw> j = Sets.newHashSet();
  private final int k;
  private final FloatBuffer l = avd.h(16);
  private final bmt[] m = new bmt[adf.values().length];
  public aug c;
  private int n = -1;
  private boolean o = true;
  private EnumMap<cq, cj> p = Maps.newEnumMap(cq.class);
  
  public bht(adm ☃, bfr ☃, cj ☃, int ☃)
  {
    this.d = ☃;
    this.e = ☃;
    this.k = ☃;
    if (!☃.equals(j())) {
      a(☃);
    }
    if (bqs.f()) {
      for (int ☃ = 0; ☃ < adf.values().length; ☃++) {
        this.m[☃] = new bmt(bms.a);
      }
    }
  }
  
  public boolean a(int ☃)
  {
    if (this.n == ☃) {
      return false;
    }
    this.n = ☃;
    return true;
  }
  
  public bmt b(int ☃)
  {
    return this.m[☃];
  }
  
  public void a(cj ☃)
  {
    h();
    this.f = ☃;
    this.c = new aug(☃, ☃.a(16, 16, 16));
    for (cq ☃ : cq.values()) {
      this.p.put(☃, ☃.a(☃, 16));
    }
    m();
  }
  
  public void a(float ☃, float ☃, float ☃, bhn ☃)
  {
    bhq ☃ = ☃.c();
    if ((☃.c() == null) || (☃.b(adf.d))) {
      return;
    }
    a(☃.d().a(adf.d), this.f);
    
    ☃.d().a(adf.d).a(☃.c());
    
    a(adf.d, ☃, ☃, ☃, ☃.d().a(adf.d), ☃);
  }
  
  public void b(float ☃, float ☃, float ☃, bhn ☃)
  {
    bhq ☃ = new bhq();
    int ☃ = 1;
    
    cj ☃ = this.f;
    cj ☃ = ☃.a(15, 15, 15);
    
    ☃.f().lock();
    adq ☃;
    try
    {
      if (☃.a() != bhn.a.b) {
        return;
      }
      ☃ = new bff(this.d, ☃.a(-1, -1, -1), ☃.a(1, 1, 1), 1);
      ☃.a(☃);
    }
    finally
    {
      ☃.f().unlock();
    }
    bhw ☃ = new bhw();
    Set<akw> ☃ = Sets.newHashSet();
    if (!☃.W())
    {
      a += 1;
      
      boolean[] ☃ = new boolean[adf.values().length];
      
      bgd ☃ = ave.A().ae();
      for (cj.a ☃ : cj.b(☃, ☃))
      {
        alz ☃ = ☃.p(☃);
        afh ☃ = ☃.c();
        if (☃.c()) {
          ☃.a(☃);
        }
        if (☃.z())
        {
          akw ☃ = ☃.s(new cj(☃));
          bhd<akw> ☃ = bhc.a.b(☃);
          if ((☃ != null) && (☃ != null))
          {
            ☃.a(☃);
            if (☃.a()) {
              ☃.add(☃);
            }
          }
        }
        adf ☃ = ☃.m();
        int ☃ = ☃.ordinal();
        if (☃.b() != -1)
        {
          bfd ☃ = ☃.d().a(☃);
          if (!☃.d(☃))
          {
            ☃.c(☃);
            a(☃, ☃);
          }
          ☃[☃] |= ☃.a(☃, ☃, ☃, ☃);
        }
      }
      for (adf ☃ : adf.values())
      {
        if (☃[☃.ordinal()] != 0) {
          ☃.a(☃);
        }
        if (☃.d(☃)) {
          a(☃, ☃, ☃, ☃, ☃.d().a(☃), ☃);
        }
      }
    }
    ☃.a(☃.a());
    
    this.g.lock();
    try
    {
      Set<akw> ☃ = Sets.newHashSet(☃);
      Set<akw> ☃ = Sets.newHashSet(this.j);
      ☃.removeAll(this.j);
      ☃.removeAll(☃);
      this.j.clear();
      this.j.addAll(☃);
      this.e.a(☃, ☃);
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  protected void b()
  {
    this.g.lock();
    try
    {
      if ((this.i != null) && (this.i.a() != bhn.a.d))
      {
        this.i.e();
        this.i = null;
      }
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  public ReentrantLock c()
  {
    return this.g;
  }
  
  public bhn d()
  {
    this.g.lock();
    try
    {
      b();
      this.i = new bhn(this, bhn.b.a);
      return this.i;
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  public bhn e()
  {
    this.g.lock();
    try
    {
      bhn localbhn;
      if ((this.i != null) && (this.i.a() == bhn.a.a)) {
        return null;
      }
      if ((this.i != null) && (this.i.a() != bhn.a.d))
      {
        this.i.e();
        this.i = null;
      }
      this.i = new bhn(this, bhn.b.b);
      this.i.a(this.b);
      return this.i;
    }
    finally
    {
      this.g.unlock();
    }
  }
  
  private void a(bfd ☃, cj ☃)
  {
    ☃.a(7, bms.a);
    ☃.c(-☃.n(), -☃.o(), -☃.p());
  }
  
  private void a(adf ☃, float ☃, float ☃, float ☃, bfd ☃, bhq ☃)
  {
    if ((☃ == adf.d) && (!☃.b(☃)))
    {
      ☃.a(☃, ☃, ☃);
      
      ☃.a(☃.a());
    }
    ☃.e();
  }
  
  private void m()
  {
    bfl.E();
    bfl.D();
    float ☃ = 1.000001F;
    bfl.b(-8.0F, -8.0F, -8.0F);
    bfl.a(☃, ☃, ☃);
    bfl.b(8.0F, 8.0F, 8.0F);
    bfl.a(2982, this.l);
    bfl.F();
  }
  
  public void f()
  {
    bfl.a(this.l);
  }
  
  public bhq g()
  {
    return this.b;
  }
  
  public void a(bhq ☃)
  {
    this.h.lock();
    try
    {
      this.b = ☃;
    }
    finally
    {
      this.h.unlock();
    }
  }
  
  public void h()
  {
    b();
    this.b = bhq.a;
  }
  
  public void a()
  {
    h();
    this.d = null;
    for (int ☃ = 0; ☃ < adf.values().length; ☃++) {
      if (this.m[☃] != null) {
        this.m[☃].c();
      }
    }
  }
  
  public cj j()
  {
    return this.f;
  }
  
  public void a(boolean ☃)
  {
    this.o = ☃;
  }
  
  public boolean l()
  {
    return this.o;
  }
  
  public cj a(cq ☃)
  {
    return (cj)this.p.get(☃);
  }
}
