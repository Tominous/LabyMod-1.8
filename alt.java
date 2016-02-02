import java.util.List;
import java.util.Random;

public class alt
  extends afh
{
  public static final aml a = aml.a("facing");
  public static final amm<alt.a> b = amm.a("type", alt.a.class);
  public static final amk N = amk.a("short");
  
  public alt()
  {
    super(arm.H);
    j(this.M.b().a(a, cq.c).a(b, alt.a.a).a(N, Boolean.valueOf(false)));
    a(i);
    c(0.5F);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, wn ☃)
  {
    if (☃.bA.d)
    {
      cq ☃ = (cq)☃.b(a);
      if (☃ != null)
      {
        cj ☃ = ☃.a(☃.d());
        afh ☃ = ☃.p(☃).c();
        if ((☃ == afi.J) || (☃ == afi.F)) {
          ☃.g(☃);
        }
      }
    }
    super.a(☃, ☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    super.b(☃, ☃, ☃);
    cq ☃ = ((cq)☃.b(a)).d();
    ☃ = ☃.a(☃);
    
    alz ☃ = ☃.p(☃);
    if (((☃.c() == afi.J) || (☃.c() == afi.F)) && 
      (((Boolean)☃.b(als.b)).booleanValue()))
    {
      ☃.c().b(☃, ☃, ☃, 0);
      ☃.g(☃);
    }
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return false;
  }
  
  public boolean b(adm ☃, cj ☃, cq ☃)
  {
    return false;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    d(☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    e(☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  private void e(alz ☃)
  {
    float ☃ = 0.25F;
    float ☃ = 0.375F;
    float ☃ = 0.625F;
    float ☃ = 0.25F;
    float ☃ = 0.75F;
    switch (alt.1.a[((cq)☃.b(a)).ordinal()])
    {
    case 1: 
      a(0.375F, 0.25F, 0.375F, 0.625F, 1.0F, 0.625F);
      break;
    case 2: 
      a(0.375F, 0.0F, 0.375F, 0.625F, 0.75F, 0.625F);
      break;
    case 3: 
      a(0.25F, 0.375F, 0.25F, 0.75F, 0.625F, 1.0F);
      break;
    case 4: 
      a(0.25F, 0.375F, 0.0F, 0.75F, 0.625F, 0.75F);
      break;
    case 5: 
      a(0.375F, 0.25F, 0.25F, 0.625F, 0.75F, 1.0F);
      break;
    case 6: 
      a(0.0F, 0.375F, 0.25F, 0.75F, 0.625F, 0.75F);
    }
  }
  
  public void a(adq ☃, cj ☃)
  {
    d(☃.p(☃));
  }
  
  public void d(alz ☃)
  {
    float ☃ = 0.25F;
    cq ☃ = (cq)☃.b(a);
    if (☃ == null) {
      return;
    }
    switch (alt.1.a[☃.ordinal()])
    {
    case 1: 
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
      break;
    case 2: 
      a(0.0F, 0.75F, 0.0F, 1.0F, 1.0F, 1.0F);
      break;
    case 3: 
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 0.25F);
      break;
    case 4: 
      a(0.0F, 0.0F, 0.75F, 1.0F, 1.0F, 1.0F);
      break;
    case 5: 
      a(0.0F, 0.0F, 0.0F, 0.25F, 1.0F, 1.0F);
      break;
    case 6: 
      a(0.75F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    cq ☃ = (cq)☃.b(a);
    cj ☃ = ☃.a(☃.d());
    alz ☃ = ☃.p(☃);
    if ((☃.c() != afi.J) && (☃.c() != afi.F)) {
      ☃.g(☃);
    } else {
      ☃.c().a(☃, ☃, ☃, ☃);
    }
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public static cq b(int ☃)
  {
    int ☃ = ☃ & 0x7;
    if (☃ > 5) {
      return null;
    }
    return cq.a(☃);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    if (☃.p(☃).b(b) == alt.a.b) {
      return zw.a(afi.F);
    }
    return zw.a(afi.J);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, b(☃)).a(b, (☃ & 0x8) > 0 ? alt.a.b : alt.a.a);
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).a();
    if (☃.b(b) == alt.a.b) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, N });
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
