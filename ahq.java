import java.util.Random;

public class ahq
  extends afc
{
  public static class a
    extends akw
  {
    private zx a;
    
    public void a(dn ☃)
    {
      super.a(☃);
      if (☃.b("RecordItem", 10)) {
        a(zx.a(☃.m("RecordItem")));
      } else if (☃.f("Record") > 0) {
        a(new zx(zw.b(☃.f("Record")), 1, 0));
      }
    }
    
    public void b(dn ☃)
    {
      super.b(☃);
      if (a() != null) {
        ☃.a("RecordItem", a().b(new dn()));
      }
    }
    
    public zx a()
    {
      return this.a;
    }
    
    public void a(zx ☃)
    {
      this.a = ☃;
      p_();
    }
  }
  
  public static final amk a = amk.a("has_record");
  
  protected ahq()
  {
    super(arm.d, arn.l);
    j(this.M.b().a(a, Boolean.valueOf(false)));
    a(yz.c);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (((Boolean)☃.b(a)).booleanValue())
    {
      e(☃, ☃, ☃);
      
      ☃ = ☃.a(a, Boolean.valueOf(false));
      ☃.a(☃, ☃, 2);
      return true;
    }
    return false;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, zx ☃)
  {
    if (☃.D) {
      return;
    }
    akw ☃ = ☃.s(☃);
    if (!(☃ instanceof ahq.a)) {
      return;
    }
    ((ahq.a)☃).a(new zx(☃.b(), 1, ☃.i()));
    ☃.a(☃, ☃.a(a, Boolean.valueOf(true)), 2);
  }
  
  private void e(adm ☃, cj ☃, alz ☃)
  {
    if (☃.D) {
      return;
    }
    akw ☃ = ☃.s(☃);
    if (!(☃ instanceof ahq.a)) {
      return;
    }
    ahq.a ☃ = (ahq.a)☃;
    zx ☃ = ☃.a();
    if (☃ == null) {
      return;
    }
    ☃.b(1005, ☃, 0);
    ☃.a(☃, null);
    ☃.a(null);
    
    float ☃ = 0.7F;
    double ☃ = ☃.s.nextFloat() * ☃ + (1.0F - ☃) * 0.5D;
    double ☃ = ☃.s.nextFloat() * ☃ + (1.0F - ☃) * 0.2D + 0.6D;
    double ☃ = ☃.s.nextFloat() * ☃ + (1.0F - ☃) * 0.5D;
    
    zx ☃ = ☃.k();
    
    uz ☃ = new uz(☃, ☃.n() + ☃, ☃.o() + ☃, ☃.p() + ☃, ☃);
    ☃.p();
    ☃.d(☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    e(☃, ☃, ☃);
    super.b(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (☃.D) {
      return;
    }
    super.a(☃, ☃, ☃, ☃, 0);
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new ahq.a();
  }
  
  public boolean O()
  {
    return true;
  }
  
  public int l(adm ☃, cj ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof ahq.a))
    {
      zx ☃ = ((ahq.a)☃).a();
      if (☃ != null) {
        return zw.b(☃.b()) + 1 - zw.b(zy.cq);
      }
    }
    return 0;
  }
  
  public int b()
  {
    return 3;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Boolean.valueOf(☃ > 0));
  }
  
  public int c(alz ☃)
  {
    return ((Boolean)☃.b(a)).booleanValue() ? 1 : 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
}
