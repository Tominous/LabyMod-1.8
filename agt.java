import java.util.List;

public class agt
  extends afh
{
  public static final amk a = amk.a("north");
  public static final amk b = amk.a("east");
  public static final amk N = amk.a("south");
  public static final amk O = amk.a("west");
  
  public agt(arm ☃)
  {
    this(☃, ☃.r());
  }
  
  public agt(arm ☃, arn ☃)
  {
    super(☃, ☃);
    j(this.M.b().a(a, Boolean.valueOf(false)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)));
    a(yz.c);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    boolean ☃ = e(☃, ☃.c());
    boolean ☃ = e(☃, ☃.d());
    boolean ☃ = e(☃, ☃.e());
    boolean ☃ = e(☃, ☃.f());
    
    float ☃ = 0.375F;
    float ☃ = 0.625F;
    float ☃ = 0.375F;
    float ☃ = 0.625F;
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    if ((☃) || (☃))
    {
      a(☃, 0.0F, ☃, ☃, 1.5F, ☃);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    ☃ = 0.375F;
    ☃ = 0.625F;
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    if ((☃) || (☃) || ((!☃) && (!☃)))
    {
      a(☃, 0.0F, ☃, ☃, 1.5F, ☃);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    a(☃, 0.0F, ☃, ☃, 1.0F, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    boolean ☃ = e(☃, ☃.c());
    boolean ☃ = e(☃, ☃.d());
    boolean ☃ = e(☃, ☃.e());
    boolean ☃ = e(☃, ☃.f());
    
    float ☃ = 0.375F;
    float ☃ = 0.625F;
    float ☃ = 0.375F;
    float ☃ = 0.625F;
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    if (☃) {
      ☃ = 0.0F;
    }
    if (☃) {
      ☃ = 1.0F;
    }
    a(☃, 0.0F, ☃, ☃, 1.0F, ☃);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return false;
  }
  
  public boolean e(adq ☃, cj ☃)
  {
    afh ☃ = ☃.p(☃).c();
    if (☃ == afi.cv) {
      return false;
    }
    if ((((☃ instanceof agt)) && (☃.J == this.J)) || ((☃ instanceof agu))) {
      return true;
    }
    if ((☃.J.k()) && (☃.d())) {
      return ☃.J != arm.C;
    }
    return false;
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    return zz.a(☃, ☃, ☃);
  }
  
  public int c(alz ☃)
  {
    return 0;
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(a, Boolean.valueOf(e(☃, ☃.c()))).a(b, Boolean.valueOf(e(☃, ☃.f()))).a(N, Boolean.valueOf(e(☃, ☃.d()))).a(O, Boolean.valueOf(e(☃, ☃.e())));
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b, O, N });
  }
}
