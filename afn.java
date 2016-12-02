import java.util.List;
import java.util.Random;

public abstract class afn
  extends afh
{
  public static final aml a = aml.a("facing");
  public static final amk b = amk.a("powered");
  private final boolean N;
  
  protected afn(boolean ☃)
  {
    super(arm.q);
    j(this.M.b().a(a, cq.c).a(b, Boolean.valueOf(false)));
    a(true);
    a(yz.d);
    this.N = ☃;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public int a(adm ☃)
  {
    return this.N ? 30 : 20;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return a(☃, ☃, ☃.d());
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    for (cq ☃ : ) {
      if (a(☃, ☃, ☃)) {
        return true;
      }
    }
    return false;
  }
  
  protected static boolean a(adm ☃, cj ☃, cq ☃)
  {
    cj ☃ = ☃.a(☃);
    if (☃ == cq.a) {
      return adm.a(☃, ☃);
    }
    return ☃.p(☃).c().v();
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    if (a(☃, ☃, ☃.d())) {
      return Q().a(a, ☃).a(b, Boolean.valueOf(false));
    }
    return Q().a(a, cq.a).a(b, Boolean.valueOf(false));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if ((e(☃, ☃, ☃)) && 
      (!a(☃, ☃, ((cq)☃.b(a)).d())))
    {
      b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  private boolean e(adm ☃, cj ☃, alz ☃)
  {
    if (d(☃, ☃)) {
      return true;
    }
    b(☃, ☃, ☃, 0);
    ☃.g(☃);
    return false;
  }
  
  public void a(adq ☃, cj ☃)
  {
    d(☃.p(☃));
  }
  
  private void d(alz ☃)
  {
    cq ☃ = (cq)☃.b(a);
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    
    float ☃ = 0.25F;
    float ☃ = 0.375F;
    float ☃ = (☃ ? 1 : 2) / 16.0F;
    float ☃ = 0.125F;
    float ☃ = 0.1875F;
    switch (afn.1.a[☃.ordinal()])
    {
    case 1: 
      a(0.0F, 0.375F, 0.3125F, ☃, 0.625F, 0.6875F);
      break;
    case 2: 
      a(1.0F - ☃, 0.375F, 0.3125F, 1.0F, 0.625F, 0.6875F);
      break;
    case 3: 
      a(0.3125F, 0.375F, 0.0F, 0.6875F, 0.625F, ☃);
      break;
    case 4: 
      a(0.3125F, 0.375F, 1.0F - ☃, 0.6875F, 0.625F, 1.0F);
      break;
    case 5: 
      a(0.3125F, 0.0F, 0.375F, 0.6875F, 0.0F + ☃, 0.625F);
      break;
    case 6: 
      a(0.3125F, 1.0F - ☃, 0.375F, 0.6875F, 1.0F, 0.625F);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (((Boolean)☃.b(b)).booleanValue()) {
      return true;
    }
    ☃.a(☃, ☃.a(b, Boolean.valueOf(true)), 3);
    ☃.b(☃, ☃);
    
    ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, 0.6F);
    
    c(☃, ☃, (cq)☃.b(a));
    
    ☃.a(☃, this, a(☃));
    
    return true;
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (((Boolean)☃.b(b)).booleanValue()) {
      c(☃, ☃, (cq)☃.b(a));
    }
    super.b(☃, ☃, ☃);
  }
  
  public int a(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    return ((Boolean)☃.b(b)).booleanValue() ? 15 : 0;
  }
  
  public int b(adq ☃, cj ☃, alz ☃, cq ☃)
  {
    if (!((Boolean)☃.b(b)).booleanValue()) {
      return 0;
    }
    if (☃.b(a) == ☃) {
      return 15;
    }
    return 0;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, Random ☃) {}
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.D) {
      return;
    }
    if (!((Boolean)☃.b(b)).booleanValue()) {
      return;
    }
    if (this.N)
    {
      f(☃, ☃, ☃);
    }
    else
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(false)));
      
      c(☃, ☃, (cq)☃.b(a));
      
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, 0.5F);
      ☃.b(☃, ☃);
    }
  }
  
  public void j()
  {
    float ☃ = 0.1875F;
    float ☃ = 0.125F;
    float ☃ = 0.125F;
    a(0.5F - ☃, 0.5F - ☃, 0.5F - ☃, 0.5F + ☃, 0.5F + ☃, 0.5F + ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pk ☃)
  {
    if (☃.D) {
      return;
    }
    if (!this.N) {
      return;
    }
    if (((Boolean)☃.b(b)).booleanValue()) {
      return;
    }
    f(☃, ☃, ☃);
  }
  
  private void f(adm ☃, cj ☃, alz ☃)
  {
    d(☃);
    List<? extends pk> ☃ = ☃.a(wq.class, new aug(☃.n() + this.B, ☃.o() + this.C, ☃.p() + this.D, ☃.n() + this.E, ☃.o() + this.F, ☃.p() + this.G));
    boolean ☃ = !☃.isEmpty();
    boolean ☃ = ((Boolean)☃.b(b)).booleanValue();
    if ((☃) && (!☃))
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(true)));
      c(☃, ☃, (cq)☃.b(a));
      ☃.b(☃, ☃);
      
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, 0.6F);
    }
    if ((!☃) && (☃))
    {
      ☃.a(☃, ☃.a(b, Boolean.valueOf(false)));
      c(☃, ☃, (cq)☃.b(a));
      ☃.b(☃, ☃);
      
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, 0.5F);
    }
    if (☃) {
      ☃.a(☃, this, a(☃));
    }
  }
  
  private void c(adm ☃, cj ☃, cq ☃)
  {
    ☃.c(☃, this);
    ☃.c(☃.a(☃.d()), this);
  }
  
  public alz a(int ☃)
  {
    cq ☃;
    switch (☃ & 0x7)
    {
    case 0: 
      ☃ = cq.a;
      break;
    case 1: 
      ☃ = cq.f;
      break;
    case 2: 
      ☃ = cq.e;
      break;
    case 3: 
      ☃ = cq.d;
      break;
    case 4: 
      ☃ = cq.c;
      break;
    case 5: 
    default: 
      ☃ = cq.b;
    }
    return Q().a(a, ☃).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃;
    switch (afn.1.a[((cq)☃.b(a)).ordinal()])
    {
    case 6: 
      ☃ = 0;
      break;
    case 1: 
      ☃ = 1;
      break;
    case 2: 
      ☃ = 2;
      break;
    case 3: 
      ☃ = 3;
      break;
    case 4: 
      ☃ = 4;
      break;
    case 5: 
    default: 
      ☃ = 5;
    }
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
