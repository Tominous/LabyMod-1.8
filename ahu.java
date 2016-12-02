public class ahu
  extends afh
{
  public static final amm<ahu.a> a = amm.a("facing", ahu.a.class);
  public static final amk b = amk.a("powered");
  
  protected ahu()
  {
    super(arm.q);
    j(this.M.b().a(a, ahu.a.e).a(b, Boolean.valueOf(false)));
    a(yz.d);
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
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
    return afn.a(☃, ☃, ☃);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = Q().a(b, Boolean.valueOf(false));
    if (a(☃, ☃, ☃.d())) {
      return ☃.a(a, ahu.a.a(☃, ☃.aP()));
    }
    for (cq ☃ : cq.c.a) {
      if ((☃ != ☃) && (a(☃, ☃, ☃.d()))) {
        return ☃.a(a, ahu.a.a(☃, ☃.aP()));
      }
    }
    if (adm.a(☃, ☃.b())) {
      return ☃.a(a, ahu.a.a(cq.b, ☃.aP()));
    }
    return ☃;
  }
  
  public static int a(cq ☃)
  {
    switch (ahu.1.a[☃.ordinal()])
    {
    case 1: 
      return 0;
    case 2: 
      return 5;
    case 3: 
      return 4;
    case 4: 
      return 3;
    case 5: 
      return 2;
    case 6: 
      return 1;
    }
    return -1;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if ((e(☃, ☃, ☃)) && 
      (!a(☃, ☃, ((ahu.a)☃.b(a)).c().d())))
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
    float ☃ = 0.1875F;
    switch (ahu.1.b[((ahu.a)☃.p(☃).b(a)).ordinal()])
    {
    case 1: 
      a(0.0F, 0.2F, 0.5F - ☃, ☃ * 2.0F, 0.8F, 0.5F + ☃);
      break;
    case 2: 
      a(1.0F - ☃ * 2.0F, 0.2F, 0.5F - ☃, 1.0F, 0.8F, 0.5F + ☃);
      break;
    case 3: 
      a(0.5F - ☃, 0.2F, 0.0F, 0.5F + ☃, 0.8F, ☃ * 2.0F);
      break;
    case 4: 
      a(0.5F - ☃, 0.2F, 1.0F - ☃ * 2.0F, 0.5F + ☃, 0.8F, 1.0F);
      break;
    case 5: 
    case 6: 
      ☃ = 0.25F;
      a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, 0.6F, 0.5F + ☃);
      break;
    case 7: 
    case 8: 
      ☃ = 0.25F;
      a(0.5F - ☃, 0.4F, 0.5F - ☃, 0.5F + ☃, 1.0F, 0.5F + ☃);
    }
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    ☃ = ☃.a(b);
    ☃.a(☃, ☃, 3);
    ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "random.click", 0.3F, ((Boolean)☃.b(b)).booleanValue() ? 0.6F : 0.5F);
    ☃.c(☃, this);
    
    cq ☃ = ((ahu.a)☃.b(a)).c();
    ☃.c(☃.a(☃.d()), this);
    
    return true;
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    if (((Boolean)☃.b(b)).booleanValue())
    {
      ☃.c(☃, this);
      cq ☃ = ((ahu.a)☃.b(a)).c();
      ☃.c(☃.a(☃.d()), this);
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
    if (((ahu.a)☃.b(a)).c() == ☃) {
      return 15;
    }
    return 0;
  }
  
  public boolean i()
  {
    return true;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, ahu.a.a(☃ & 0x7)).a(b, Boolean.valueOf((☃ & 0x8) > 0));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((ahu.a)☃.b(a)).a();
    if (((Boolean)☃.b(b)).booleanValue()) {
      ☃ |= 0x8;
    }
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] i;
    private final int j;
    private final String k;
    private final cq l;
    
    static
    {
      i = new a[values().length];
      for (a ☃ : values()) {
        i[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃, cq ☃)
    {
      this.j = ☃;
      this.k = ☃;
      this.l = ☃;
    }
    
    public int a()
    {
      return this.j;
    }
    
    public cq c()
    {
      return this.l;
    }
    
    public String toString()
    {
      return this.k;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= i.length)) {
        ☃ = 0;
      }
      return i[☃];
    }
    
    public static a a(cq ☃, cq ☃)
    {
      switch (ahu.1.a[☃.ordinal()])
      {
      case 1: 
        switch (ahu.1.c[☃.k().ordinal()])
        {
        case 1: 
          return a;
        case 2: 
          return h;
        }
        throw new IllegalArgumentException("Invalid entityFacing " + ☃ + " for facing " + ☃);
      case 2: 
        switch (ahu.1.c[☃.k().ordinal()])
        {
        case 1: 
          return g;
        case 2: 
          return f;
        }
        throw new IllegalArgumentException("Invalid entityFacing " + ☃ + " for facing " + ☃);
      case 3: 
        return e;
      case 4: 
        return d;
      case 5: 
        return c;
      case 6: 
        return b;
      }
      throw new IllegalArgumentException("Invalid facing: " + ☃);
    }
    
    public String l()
    {
      return this.k;
    }
  }
}
