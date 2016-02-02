import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class aju
  extends afh
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amm<aju.a> b = amm.a("half", aju.a.class);
  public static final amm<aju.b> N = amm.a("shape", aju.b.class);
  private static final int[][] O = { { 4, 5 }, { 5, 7 }, { 6, 7 }, { 4, 6 }, { 0, 1 }, { 1, 3 }, { 2, 3 }, { 0, 2 } };
  private final afh P;
  private final alz Q;
  private boolean R;
  private int S;
  
  protected aju(alz ☃)
  {
    super(☃.c().J);
    j(this.M.b().a(a, cq.c).a(b, aju.a.b).a(N, aju.b.a));
    this.P = ☃.c();
    this.Q = ☃;
    c(this.P.w);
    b(this.P.x / 3.0F);
    a(this.P.H);
    e(255);
    a(yz.b);
  }
  
  public void a(adq ☃, cj ☃)
  {
    if (this.R) {
      a(0.5F * (this.S % 2), 0.5F * (this.S / 4 % 2), 0.5F * (this.S / 2 % 2), 0.5F + 0.5F * (this.S % 2), 0.5F + 0.5F * (this.S / 4 % 2), 0.5F + 0.5F * (this.S / 2 % 2));
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
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
  
  public void e(adq ☃, cj ☃)
  {
    if (☃.p(☃).b(b) == aju.a.a) {
      a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
  }
  
  public static boolean c(afh ☃)
  {
    return ☃ instanceof aju;
  }
  
  public static boolean a(adq ☃, cj ☃, alz ☃)
  {
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if ((c(☃)) && (☃.b(b) == ☃.b(b)) && (☃.b(a) == ☃.b(a))) {
      return true;
    }
    return false;
  }
  
  public int f(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    cq ☃ = (cq)☃.b(a);
    aju.a ☃ = (aju.a)☃.b(b);
    boolean ☃ = ☃ == aju.a.a;
    if (☃ == cq.f)
    {
      alz ☃ = ☃.p(☃.f());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.d(), ☃))) {
          return ☃ ? 1 : 2;
        }
        if ((☃ == cq.d) && (!a(☃, ☃.c(), ☃))) {
          return ☃ ? 2 : 1;
        }
      }
    }
    else if (☃ == cq.e)
    {
      alz ☃ = ☃.p(☃.e());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.d(), ☃))) {
          return ☃ ? 2 : 1;
        }
        if ((☃ == cq.d) && (!a(☃, ☃.c(), ☃))) {
          return ☃ ? 1 : 2;
        }
      }
    }
    else if (☃ == cq.d)
    {
      alz ☃ = ☃.p(☃.d());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.f(), ☃))) {
          return ☃ ? 2 : 1;
        }
        if ((☃ == cq.f) && (!a(☃, ☃.e(), ☃))) {
          return ☃ ? 1 : 2;
        }
      }
    }
    else if (☃ == cq.c)
    {
      alz ☃ = ☃.p(☃.c());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.f(), ☃))) {
          return ☃ ? 1 : 2;
        }
        if ((☃ == cq.f) && (!a(☃, ☃.e(), ☃))) {
          return ☃ ? 2 : 1;
        }
      }
    }
    return 0;
  }
  
  public int g(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    cq ☃ = (cq)☃.b(a);
    aju.a ☃ = (aju.a)☃.b(b);
    boolean ☃ = ☃ == aju.a.a;
    if (☃ == cq.f)
    {
      alz ☃ = ☃.p(☃.e());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.c(), ☃))) {
          return ☃ ? 1 : 2;
        }
        if ((☃ == cq.d) && (!a(☃, ☃.d(), ☃))) {
          return ☃ ? 2 : 1;
        }
      }
    }
    else if (☃ == cq.e)
    {
      alz ☃ = ☃.p(☃.f());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.c(), ☃))) {
          return ☃ ? 2 : 1;
        }
        if ((☃ == cq.d) && (!a(☃, ☃.d(), ☃))) {
          return ☃ ? 1 : 2;
        }
      }
    }
    else if (☃ == cq.d)
    {
      alz ☃ = ☃.p(☃.c());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.e(), ☃))) {
          return ☃ ? 2 : 1;
        }
        if ((☃ == cq.f) && (!a(☃, ☃.f(), ☃))) {
          return ☃ ? 1 : 2;
        }
      }
    }
    else if (☃ == cq.c)
    {
      alz ☃ = ☃.p(☃.d());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.e(), ☃))) {
          return ☃ ? 1 : 2;
        }
        if ((☃ == cq.f) && (!a(☃, ☃.f(), ☃))) {
          return ☃ ? 2 : 1;
        }
      }
    }
    return 0;
  }
  
  public boolean h(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    cq ☃ = (cq)☃.b(a);
    aju.a ☃ = (aju.a)☃.b(b);
    boolean ☃ = ☃ == aju.a.a;
    
    float ☃ = 0.5F;
    float ☃ = 1.0F;
    if (☃)
    {
      ☃ = 0.0F;
      ☃ = 0.5F;
    }
    float ☃ = 0.0F;
    float ☃ = 1.0F;
    float ☃ = 0.0F;
    float ☃ = 0.5F;
    
    boolean ☃ = true;
    if (☃ == cq.f)
    {
      ☃ = 0.5F;
      ☃ = 1.0F;
      
      alz ☃ = ☃.p(☃.f());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.d(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
        else if ((☃ == cq.d) && (!a(☃, ☃.c(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
      }
    }
    else if (☃ == cq.e)
    {
      ☃ = 0.5F;
      ☃ = 1.0F;
      
      alz ☃ = ☃.p(☃.e());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.d(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
        else if ((☃ == cq.d) && (!a(☃, ☃.c(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
      }
    }
    else if (☃ == cq.d)
    {
      ☃ = 0.5F;
      ☃ = 1.0F;
      
      alz ☃ = ☃.p(☃.d());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.f(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
        else if ((☃ == cq.f) && (!a(☃, ☃.e(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
      }
    }
    else if (☃ == cq.c)
    {
      alz ☃ = ☃.p(☃.c());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.f(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
        else if ((☃ == cq.f) && (!a(☃, ☃.e(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = false;
        }
      }
    }
    a(☃, ☃, ☃, ☃, ☃, ☃);
    return ☃;
  }
  
  public boolean i(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    cq ☃ = (cq)☃.b(a);
    aju.a ☃ = (aju.a)☃.b(b);
    boolean ☃ = ☃ == aju.a.a;
    
    float ☃ = 0.5F;
    float ☃ = 1.0F;
    if (☃)
    {
      ☃ = 0.0F;
      ☃ = 0.5F;
    }
    float ☃ = 0.0F;
    float ☃ = 0.5F;
    float ☃ = 0.5F;
    float ☃ = 1.0F;
    
    boolean ☃ = false;
    if (☃ == cq.f)
    {
      alz ☃ = ☃.p(☃.e());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.c(), ☃)))
        {
          ☃ = 0.0F;
          ☃ = 0.5F;
          ☃ = true;
        }
        else if ((☃ == cq.d) && (!a(☃, ☃.d(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = 1.0F;
          ☃ = true;
        }
      }
    }
    else if (☃ == cq.e)
    {
      alz ☃ = ☃.p(☃.f());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        ☃ = 0.5F;
        ☃ = 1.0F;
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.c) && (!a(☃, ☃.c(), ☃)))
        {
          ☃ = 0.0F;
          ☃ = 0.5F;
          ☃ = true;
        }
        else if ((☃ == cq.d) && (!a(☃, ☃.d(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = 1.0F;
          ☃ = true;
        }
      }
    }
    else if (☃ == cq.d)
    {
      alz ☃ = ☃.p(☃.c());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        ☃ = 0.0F;
        ☃ = 0.5F;
        
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.e(), ☃)))
        {
          ☃ = true;
        }
        else if ((☃ == cq.f) && (!a(☃, ☃.f(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = 1.0F;
          ☃ = true;
        }
      }
    }
    else if (☃ == cq.c)
    {
      alz ☃ = ☃.p(☃.d());
      afh ☃ = ☃.c();
      if ((c(☃)) && (☃ == ☃.b(b)))
      {
        cq ☃ = (cq)☃.b(a);
        if ((☃ == cq.e) && (!a(☃, ☃.e(), ☃)))
        {
          ☃ = true;
        }
        else if ((☃ == cq.f) && (!a(☃, ☃.f(), ☃)))
        {
          ☃ = 0.5F;
          ☃ = 1.0F;
          ☃ = true;
        }
      }
    }
    if (☃) {
      a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    return ☃;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    e(☃, ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    
    boolean ☃ = h(☃, ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
    if ((☃) && 
      (i(☃, ☃))) {
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    this.P.c(☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, wn ☃)
  {
    this.P.a(☃, ☃, ☃);
  }
  
  public void d(adm ☃, cj ☃, alz ☃)
  {
    this.P.d(☃, ☃, ☃);
  }
  
  public int c(adq ☃, cj ☃)
  {
    return this.P.c(☃, ☃);
  }
  
  public float a(pk ☃)
  {
    return this.P.a(☃);
  }
  
  public adf m()
  {
    return this.P.m();
  }
  
  public int a(adm ☃)
  {
    return this.P.a(☃);
  }
  
  public aug b(adm ☃, cj ☃)
  {
    return this.P.b(☃, ☃);
  }
  
  public aui a(adm ☃, cj ☃, pk ☃, aui ☃)
  {
    return this.P.a(☃, ☃, ☃, ☃);
  }
  
  public boolean A()
  {
    return this.P.A();
  }
  
  public boolean a(alz ☃, boolean ☃)
  {
    return this.P.a(☃, ☃);
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return this.P.d(☃, ☃);
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃, this.Q, afi.a);
    this.P.c(☃, ☃, this.Q);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    this.P.b(☃, ☃, this.Q);
  }
  
  public void a(adm ☃, cj ☃, pk ☃)
  {
    this.P.a(☃, ☃, ☃);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    this.P.b(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    return this.P.a(☃, ☃, this.Q, ☃, cq.a, 0.0F, 0.0F, 0.0F);
  }
  
  public void a(adm ☃, cj ☃, adi ☃)
  {
    this.P.a(☃, ☃, ☃);
  }
  
  public arn g(alz ☃)
  {
    return this.P.g(this.Q);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    
    ☃ = ☃.a(a, ☃.aP()).a(N, aju.b.a);
    if ((☃ == cq.a) || ((☃ != cq.b) && (☃ > 0.5D))) {
      return ☃.a(b, aju.a.a);
    }
    return ☃.a(b, aju.a.b);
  }
  
  public auh a(adm ☃, cj ☃, aui ☃, aui ☃)
  {
    auh[] ☃ = new auh[8];
    alz ☃ = ☃.p(☃);
    int ☃ = ((cq)☃.b(a)).b();
    boolean ☃ = ☃.b(b) == aju.a.a;
    int[] ☃ = O[(☃ + 0)];
    
    this.R = true;
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      this.S = ☃;
      if (Arrays.binarySearch(☃, ☃) < 0) {
        ☃[☃] = super.a(☃, ☃, ☃, ☃);
      }
    }
    for (int ☃ : ☃) {
      ☃[☃] = null;
    }
    auh ☃ = null;
    double ☃ = 0.0D;
    for (auh ☃ : ☃) {
      if (☃ != null)
      {
        double ☃ = ☃.c.g(☃);
        if (☃ > ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    return ☃;
  }
  
  public alz a(int ☃)
  {
    alz ☃ = Q().a(b, (☃ & 0x4) > 0 ? aju.a.a : aju.a.b);
    
    ☃ = ☃.a(a, cq.a(5 - (☃ & 0x3)));
    
    return ☃;
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    if (☃.b(b) == aju.a.a) {
      ☃ |= 0x4;
    }
    ☃ |= 5 - ((cq)☃.b(a)).a();
    
    return ☃;
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    if (h(☃, ☃)) {
      switch (g(☃, ☃))
      {
      case 0: 
        ☃ = ☃.a(N, aju.b.a);
        break;
      case 1: 
        ☃ = ☃.a(N, aju.b.c);
        break;
      case 2: 
        ☃ = ☃.a(N, aju.b.b);
      }
    } else {
      switch (f(☃, ☃))
      {
      case 0: 
        ☃ = ☃.a(N, aju.b.a);
        break;
      case 1: 
        ☃ = ☃.a(N, aju.b.e);
        break;
      case 2: 
        ☃ = ☃.a(N, aju.b.d);
      }
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
  
  public static enum b
    implements nw
  {
    private final String f;
    
    private b(String ☃)
    {
      this.f = ☃;
    }
    
    public String toString()
    {
      return this.f;
    }
    
    public String l()
    {
      return this.f;
    }
  }
}
