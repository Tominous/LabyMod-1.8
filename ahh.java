import java.util.List;
import java.util.Random;

public abstract class ahh
  extends afh
{
  public static final amm<ahh.a> a = amm.a("half", ahh.a.class);
  
  public ahh(arm ☃)
  {
    super(☃);
    if (l()) {
      this.r = true;
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
    e(255);
  }
  
  protected boolean I()
  {
    return false;
  }
  
  public void a(adq ☃, cj ☃)
  {
    if (l())
    {
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      return;
    }
    alz ☃ = ☃.p(☃);
    if (☃.c() == this) {
      if (☃.b(a) == ahh.a.a) {
        a(0.0F, 0.5F, 0.0F, 1.0F, 1.0F, 1.0F);
      } else {
        a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
      }
    }
  }
  
  public void j()
  {
    if (l()) {
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
    } else {
      a(0.0F, 0.0F, 0.0F, 1.0F, 0.5F, 1.0F);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, aug ☃, List<aug> ☃, pk ☃)
  {
    a(☃, ☃);
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean c()
  {
    return l();
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    alz ☃ = super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃).a(a, ahh.a.b);
    if (l()) {
      return ☃;
    }
    if ((☃ == cq.a) || ((☃ != cq.b) && (☃ > 0.5D))) {
      return ☃.a(a, ahh.a.a);
    }
    return ☃;
  }
  
  public int a(Random ☃)
  {
    if (l()) {
      return 2;
    }
    return 1;
  }
  
  public boolean d()
  {
    return l();
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    if (l()) {
      return super.a(☃, ☃, ☃);
    }
    if ((☃ != cq.b) && (☃ != cq.a) && (!super.a(☃, ☃, ☃))) {
      return false;
    }
    cj ☃ = ☃.a(☃.d());
    
    alz ☃ = ☃.p(☃);
    alz ☃ = ☃.p(☃);
    
    boolean ☃ = (c(☃.c())) && (☃.b(a) == ahh.a.a);
    boolean ☃ = (c(☃.c())) && (☃.b(a) == ahh.a.a);
    if (☃)
    {
      if (☃ == cq.a) {
        return true;
      }
      if ((☃ == cq.b) && (super.a(☃, ☃, ☃))) {
        return true;
      }
      return (!c(☃.c())) || (!☃);
    }
    if (☃ == cq.b) {
      return true;
    }
    if ((☃ == cq.a) && (super.a(☃, ☃, ☃))) {
      return true;
    }
    return (!c(☃.c())) || (☃);
  }
  
  protected static boolean c(afh ☃)
  {
    return (☃ == afi.U) || (☃ == afi.bM) || (☃ == afi.cP);
  }
  
  public abstract String b(int paramInt);
  
  public int j(adm ☃, cj ☃)
  {
    return super.j(☃, ☃) & 0x7;
  }
  
  public abstract boolean l();
  
  public abstract amo<?> n();
  
  public abstract Object a(zx paramzx);
  
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
