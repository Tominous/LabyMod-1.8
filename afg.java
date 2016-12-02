import java.util.Random;

public class afg
  extends age
{
  public static final amm<afg.a> a = amm.a("part", afg.a.class);
  public static final amk b = amk.a("occupied");
  
  public afg()
  {
    super(arm.n);
    j(this.M.b().a(a, afg.a.b).a(b, Boolean.valueOf(false)));
    l();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    if (☃.b(a) != afg.a.a)
    {
      ☃ = ☃.a((cq)☃.b(O));
      ☃ = ☃.p(☃);
      if (☃.c() != this) {
        return true;
      }
    }
    if ((!☃.t.e()) || (☃.b(☃) == ady.x))
    {
      ☃.g(☃);
      
      cj ☃ = ☃.a(((cq)☃.b(O)).d());
      if (☃.p(☃).c() == this) {
        ☃.g(☃);
      }
      ☃.a(null, ☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, 5.0F, true, true);
      return true;
    }
    if (((Boolean)☃.b(b)).booleanValue())
    {
      wn ☃ = f(☃, ☃);
      if (☃ == null)
      {
        ☃ = ☃.a(b, Boolean.valueOf(false));
        ☃.a(☃, ☃, 4);
      }
      else
      {
        ☃.b(new fb("tile.bed.occupied", new Object[0]));
        return true;
      }
    }
    wn.a ☃ = ☃.a(☃);
    if (☃ == wn.a.a)
    {
      ☃ = ☃.a(b, Boolean.valueOf(true));
      ☃.a(☃, ☃, 4);
      return true;
    }
    if (☃ == wn.a.c) {
      ☃.b(new fb("tile.bed.noSleep", new Object[0]));
    } else if (☃ == wn.a.f) {
      ☃.b(new fb("tile.bed.notSafe", new Object[0]));
    }
    return true;
  }
  
  private wn f(adm ☃, cj ☃)
  {
    for (wn ☃ : ☃.j) {
      if ((☃.bJ()) && (☃.bx.equals(☃))) {
        return ☃;
      }
    }
    return null;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public void a(adq ☃, cj ☃)
  {
    l();
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    cq ☃ = (cq)☃.b(O);
    if (☃.b(a) == afg.a.a)
    {
      if (☃.p(☃.a(☃.d())).c() != this) {
        ☃.g(☃);
      }
    }
    else if (☃.p(☃.a(☃)).c() != this)
    {
      ☃.g(☃);
      if (!☃.D) {
        b(☃, ☃, ☃, 0);
      }
    }
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (☃.b(a) == afg.a.a) {
      return null;
    }
    return zy.ba;
  }
  
  private void l()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 0.5625F, 1.0F);
  }
  
  public static cj a(adm ☃, cj ☃, int ☃)
  {
    cq ☃ = (cq)☃.p(☃).b(O);
    
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    for (int ☃ = 0; ☃ <= 1; ☃++)
    {
      int ☃ = ☃ - ☃.g() * ☃ - 1;
      int ☃ = ☃ - ☃.i() * ☃ - 1;
      int ☃ = ☃ + 2;
      int ☃ = ☃ + 2;
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = new cj(☃, ☃, ☃);
          if (e(☃, ☃)) {
            if (☃ > 0) {
              ☃--;
            } else {
              return ☃;
            }
          }
        }
      }
    }
    return null;
  }
  
  protected static boolean e(adm ☃, cj ☃)
  {
    return (adm.a(☃, ☃.b())) && (!☃.p(☃).c().t().a()) && (!☃.p(☃.a()).c().t().a());
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    if (☃.b(a) == afg.a.b) {
      super.a(☃, ☃, ☃, ☃, 0);
    }
  }
  
  public int k()
  {
    return 1;
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.ba;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if ((☃.bA.d) && 
      (☃.b(a) == afg.a.a))
    {
      cj ☃ = ☃.a(((cq)☃.b(O)).d());
      if (☃.p(☃).c() == this) {
        ☃.g(☃);
      }
    }
  }
  
  public alz a(int ☃)
  {
    cq ☃ = cq.b(☃);
    if ((☃ & 0x8) > 0) {
      return Q().a(a, afg.a.a).a(O, ☃).a(b, Boolean.valueOf((☃ & 0x4) > 0));
    }
    return Q().a(a, afg.a.b).a(O, ☃);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    if (☃.b(a) == afg.a.b)
    {
      alz ☃ = ☃.p(☃.a((cq)☃.b(O)));
      if (☃.c() == this) {
        ☃ = ☃.a(b, ☃.b(b));
      }
    }
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(O)).b();
    if (☃.b(a) == afg.a.a)
    {
      ☃ |= 0x8;
      if (((Boolean)☃.b(b)).booleanValue()) {
        ☃ |= 0x4;
      }
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O, a, b });
  }
  
  public static enum a
    implements nw
  {
    private final String c;
    
    private a(String ☃)
    {
      this.c = ☃;
    }
    
    public String toString()
    {
      return this.c;
    }
    
    public String l()
    {
      return this.c;
    }
  }
}
