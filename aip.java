import com.google.common.cache.LoadingCache;
import java.util.Random;

public class aip
  extends ahj
{
  public static final amm<cq.a> a = amm.a("axis", cq.a.class, new cq.a[] { cq.a.a, cq.a.c });
  
  public aip()
  {
    super(arm.E, false);
    j(this.M.b().a(a, cq.a.a));
    a(true);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    super.b(☃, ☃, ☃, ☃);
    if ((☃.t.d()) && (☃.Q().b("doMobSpawning")) && (☃.nextInt(2000) < ☃.aa().a()))
    {
      int ☃ = ☃.o();
      cj ☃ = ☃;
      while ((!adm.a(☃, ☃)) && (☃.o() > 0)) {
        ☃ = ☃.b();
      }
      if ((☃ > 0) && (!☃.p(☃.a()).c().v()))
      {
        pk ☃ = aax.a(☃, 57, ☃.n() + 0.5D, ☃.o() + 1.1D, ☃.p() + 0.5D);
        if (☃ != null) {
          ☃.aj = ☃.aq();
        }
      }
    }
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public void a(adq ☃, cj ☃)
  {
    cq.a ☃ = (cq.a)☃.p(☃).b(a);
    
    float ☃ = 0.125F;
    float ☃ = 0.125F;
    if (☃ == cq.a.a) {
      ☃ = 0.5F;
    }
    if (☃ == cq.a.c) {
      ☃ = 0.5F;
    }
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 1.0F, 0.5F + ☃);
  }
  
  public static int a(cq.a ☃)
  {
    if (☃ == cq.a.a) {
      return 1;
    }
    if (☃ == cq.a.c) {
      return 2;
    }
    return 0;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e(adm ☃, cj ☃)
  {
    aip.a ☃ = new aip.a(☃, ☃, cq.a.a);
    if ((☃.d()) && (aip.a.a(☃) == 0))
    {
      ☃.e();
      return true;
    }
    aip.a ☃ = new aip.a(☃, ☃, cq.a.c);
    if ((☃.d()) && (aip.a.a(☃) == 0))
    {
      ☃.e();
      return true;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    cq.a ☃ = (cq.a)☃.b(a);
    if (☃ == cq.a.a)
    {
      aip.a ☃ = new aip.a(☃, ☃, cq.a.a);
      if ((!☃.d()) || (aip.a.a(☃) < aip.a.b(☃) * aip.a.c(☃))) {
        ☃.a(☃, afi.a.Q());
      }
    }
    else if (☃ == cq.a.c)
    {
      aip.a ☃ = new aip.a(☃, ☃, cq.a.c);
      if ((!☃.d()) || (aip.a.a(☃) < aip.a.b(☃) * aip.a.c(☃))) {
        ☃.a(☃, afi.a.Q());
      }
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    cq.a ☃ = null;
    alz ☃ = ☃.p(☃);
    if (☃.p(☃).c() == this)
    {
      ☃ = (cq.a)☃.b(a);
      if (☃ == null) {
        return false;
      }
      if ((☃ == cq.a.c) && (☃ != cq.f) && (☃ != cq.e)) {
        return false;
      }
      if ((☃ == cq.a.a) && (☃ != cq.d) && (☃ != cq.c)) {
        return false;
      }
    }
    boolean ☃ = (☃.p(☃.e()).c() == this) && (☃.p(☃.f(2)).c() != this);
    boolean ☃ = (☃.p(☃.f()).c() == this) && (☃.p(☃.g(2)).c() != this);
    
    boolean ☃ = (☃.p(☃.c()).c() == this) && (☃.p(☃.d(2)).c() != this);
    boolean ☃ = (☃.p(☃.d()).c() == this) && (☃.p(☃.e(2)).c() != this);
    
    boolean ☃ = (☃) || (☃) || (☃ == cq.a.a);
    boolean ☃ = (☃) || (☃) || (☃ == cq.a.c);
    if ((☃) && (☃ == cq.e)) {
      return true;
    }
    if ((☃) && (☃ == cq.f)) {
      return true;
    }
    if ((☃) && (☃ == cq.c)) {
      return true;
    }
    if ((☃) && (☃ == cq.d)) {
      return true;
    }
    return false;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public adf m()
  {
    return adf.d;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if ((☃.m == null) && (☃.l == null)) {
      ☃.d(☃);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.nextInt(100) == 0) {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "portal.portal", 0.5F, ☃.nextFloat() * 0.4F + 0.8F, false);
    }
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      double ☃ = ☃.n() + ☃.nextFloat();
      double ☃ = ☃.o() + ☃.nextFloat();
      double ☃ = ☃.p() + ☃.nextFloat();
      double ☃ = (☃.nextFloat() - 0.5D) * 0.5D;
      double ☃ = (☃.nextFloat() - 0.5D) * 0.5D;
      double ☃ = (☃.nextFloat() - 0.5D) * 0.5D;
      
      int ☃ = ☃.nextInt(2) * 2 - 1;
      if ((☃.p(☃.e()).c() == this) || (☃.p(☃.f()).c() == this))
      {
        ☃ = ☃.p() + 0.5D + 0.25D * ☃;
        ☃ = ☃.nextFloat() * 2.0F * ☃;
      }
      else
      {
        ☃ = ☃.n() + 0.5D + 0.25D * ☃;
        ☃ = ☃.nextFloat() * 2.0F * ☃;
      }
      ☃.a(cy.y, ☃, ☃, ☃, ☃, ☃, ☃, new int[0]);
    }
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return null;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, (☃ & 0x3) == 2 ? cq.a.c : cq.a.a);
  }
  
  public int c(alz ☃)
  {
    return a((cq.a)☃.b(a));
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public amd.b f(adm ☃, cj ☃)
  {
    cq.a ☃ = cq.a.c;
    aip.a ☃ = new aip.a(☃, ☃, cq.a.a);
    LoadingCache<cj, amc> ☃ = amd.a(☃, true);
    if (!☃.d())
    {
      ☃ = cq.a.a;
      ☃ = new aip.a(☃, ☃, cq.a.c);
    }
    if (!☃.d()) {
      return new amd.b(☃, cq.c, cq.b, ☃, 1, 1, 1);
    }
    int[] ☃ = new int[cq.b.values().length];
    cq ☃ = aip.a.d(☃).f();
    cj ☃ = aip.a.e(☃).b(☃.a() - 1);
    for (cq.b ☃ : cq.b.values())
    {
      amd.b ☃ = new amd.b(☃.c() == ☃ ? ☃ : ☃.a(aip.a.d(☃), ☃.b() - 1), cq.a(☃, ☃), cq.b, ☃, ☃.b(), ☃.a(), 1);
      for (int ☃ = 0; ☃ < ☃.b(); ☃++) {
        for (int ☃ = 0; ☃ < ☃.a(); ☃++)
        {
          amc ☃ = ☃.a(☃, ☃, 1);
          if ((☃.a() != null) && (☃.a().c().t() != arm.a)) {
            ☃[☃.ordinal()] += 1;
          }
        }
      }
    }
    cq.b ☃ = cq.b.a;
    for (cq.b ☃ : cq.b.values()) {
      if (☃[☃.ordinal()] < ☃[☃.ordinal()]) {
        ☃ = ☃;
      }
    }
    return new amd.b(☃.c() == ☃ ? ☃ : ☃.a(aip.a.d(☃), ☃.b() - 1), cq.a(☃, ☃), cq.b, ☃, ☃.b(), ☃.a(), 1);
  }
  
  public static class a
  {
    private final adm a;
    private final cq.a b;
    private final cq c;
    private final cq d;
    private int e = 0;
    private cj f;
    private int g;
    private int h;
    
    public a(adm ☃, cj ☃, cq.a ☃)
    {
      this.a = ☃;
      this.b = ☃;
      if (☃ == cq.a.a)
      {
        this.d = cq.f;
        this.c = cq.e;
      }
      else
      {
        this.d = cq.c;
        this.c = cq.d;
      }
      cj ☃ = ☃;
      while ((☃.o() > ☃.o() - 21) && (☃.o() > 0) && (a(☃.p(☃.b()).c()))) {
        ☃ = ☃.b();
      }
      int ☃ = a(☃, this.d) - 1;
      if (☃ >= 0)
      {
        this.f = ☃.a(this.d, ☃);
        
        this.h = a(this.f, this.c);
        if ((this.h < 2) || (this.h > 21))
        {
          this.f = null;
          this.h = 0;
        }
      }
      if (this.f != null) {
        this.g = c();
      }
    }
    
    protected int a(cj ☃, cq ☃)
    {
      for (int ☃ = 0; ☃ < 22; ☃++)
      {
        cj ☃ = ☃.a(☃, ☃);
        if (!a(this.a.p(☃).c())) {
          break;
        }
        if (this.a.p(☃.b()).c() != afi.Z) {
          break;
        }
      }
      afh ☃ = this.a.p(☃.a(☃, ☃)).c();
      if (☃ == afi.Z) {
        return ☃;
      }
      return 0;
    }
    
    public int a()
    {
      return this.g;
    }
    
    public int b()
    {
      return this.h;
    }
    
    protected int c()
    {
      for (this.g = 0; this.g < 21; this.g += 1) {
        for (int ☃ = 0; ☃ < this.h; ☃++)
        {
          cj ☃ = this.f.a(this.c, ☃).b(this.g);
          
          afh ☃ = this.a.p(☃).c();
          if (!a(☃)) {
            break label181;
          }
          if (☃ == afi.aY) {
            this.e += 1;
          }
          if (☃ == 0)
          {
            ☃ = this.a.p(☃.a(this.d)).c();
            if (☃ != afi.Z) {
              break label181;
            }
          }
          else if (☃ == this.h - 1)
          {
            ☃ = this.a.p(☃.a(this.c)).c();
            if (☃ != afi.Z) {
              break label181;
            }
          }
        }
      }
      label181:
      for (int ☃ = 0; ☃ < this.h; ☃++) {
        if (this.a.p(this.f.a(this.c, ☃).b(this.g)).c() != afi.Z)
        {
          this.g = 0;
          break;
        }
      }
      if ((this.g > 21) || (this.g < 3))
      {
        this.f = null;
        this.h = 0;
        this.g = 0;
        return 0;
      }
      return this.g;
    }
    
    protected boolean a(afh ☃)
    {
      return (☃.J == arm.a) || (☃ == afi.ab) || (☃ == afi.aY);
    }
    
    public boolean d()
    {
      return (this.f != null) && (this.h >= 2) && (this.h <= 21) && (this.g >= 3) && (this.g <= 21);
    }
    
    public void e()
    {
      for (int ☃ = 0; ☃ < this.h; ☃++)
      {
        cj ☃ = this.f.a(this.c, ☃);
        for (int ☃ = 0; ☃ < this.g; ☃++) {
          this.a.a(☃.b(☃), afi.aY.Q().a(aip.a, this.b), 2);
        }
      }
    }
  }
}
