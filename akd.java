import java.util.List;
import java.util.Random;

public class akd
  extends afh
{
  public static final amk b = amk.a("north");
  public static final amk N = amk.a("east");
  public static final amk O = amk.a("south");
  public static final amk P = amk.a("west");
  private final boolean a;
  
  protected akd(arm ☃, boolean ☃)
  {
    super(☃);
    j(M.b().a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)));
    a = ☃;
    a(yz.c);
  }
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    return ☃.a(b, Boolean.valueOf(c(☃.p(☃.c()).c()))).a(O, Boolean.valueOf(c(☃.p(☃.d()).c()))).a(P, Boolean.valueOf(c(☃.p(☃.e()).c()))).a(N, Boolean.valueOf(c(☃.p(☃.f()).c())));
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    if (!a) {
      return null;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (☃.p(☃).c() == this) {
      return false;
    }
    return super.a(☃, ☃, ☃);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    boolean ☃ = c(☃.p(☃.c()).c());
    boolean ☃ = c(☃.p(☃.d()).c());
    boolean ☃ = c(☃.p(☃.e()).c());
    boolean ☃ = c(☃.p(☃.f()).c());
    if (((☃) && (☃)) || ((!☃) && (!☃) && (!☃) && (!☃)))
    {
      a(0.0F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    else if (☃)
    {
      a(0.0F, 0.0F, 0.4375F, 0.5F, 1.0F, 0.5625F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    else if (☃)
    {
      a(0.5F, 0.0F, 0.4375F, 1.0F, 1.0F, 0.5625F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    if (((☃) && (☃)) || ((!☃) && (!☃) && (!☃) && (!☃)))
    {
      a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 1.0F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    else if (☃)
    {
      a(0.4375F, 0.0F, 0.0F, 0.5625F, 1.0F, 0.5F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
    else if (☃)
    {
      a(0.4375F, 0.0F, 0.5F, 0.5625F, 1.0F, 1.0F);
      super.a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void j()
  {
    a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
  }
  
  public void a(adq ☃, cj ☃)
  {
    float ☃ = 0.4375F;
    float ☃ = 0.5625F;
    float ☃ = 0.4375F;
    float ☃ = 0.5625F;
    
    boolean ☃ = c(☃.p(☃.c()).c());
    boolean ☃ = c(☃.p(☃.d()).c());
    boolean ☃ = c(☃.p(☃.e()).c());
    boolean ☃ = c(☃.p(☃.f()).c());
    if (((☃) && (☃)) || ((!☃) && (!☃) && (!☃) && (!☃)))
    {
      ☃ = 0.0F;
      ☃ = 1.0F;
    }
    else if (☃)
    {
      ☃ = 0.0F;
    }
    else if (☃)
    {
      ☃ = 1.0F;
    }
    if (((☃) && (☃)) || ((!☃) && (!☃) && (!☃) && (!☃)))
    {
      ☃ = 0.0F;
      ☃ = 1.0F;
    }
    else if (☃)
    {
      ☃ = 0.0F;
    }
    else if (☃)
    {
      ☃ = 1.0F;
    }
    a(☃, 0.0F, ☃, ☃, 1.0F, ☃);
  }
  
  public final boolean c(afh ☃)
  {
    return (☃.o()) || (☃ == this) || (☃ == afi.w) || (☃ == afi.cG) || (☃ == afi.cH) || ((☃ instanceof akd));
  }
  
  protected boolean I()
  {
    return true;
  }
  
  public adf m()
  {
    return adf.b;
  }
  
  public int c(alz ☃)
  {
    return 0;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { b, N, P, O });
  }
}
