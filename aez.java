import java.util.List;

public class aez
  extends agr
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amn b = amn.a("damage", 0, 2);
  
  protected aez()
  {
    super(arm.g);
    j(this.M.b().a(a, cq.c).a(b, Integer.valueOf(0)));
    e(0);
    a(yz.c);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    cq ☃ = ☃.aP().e();
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃).a(a, ☃).a(b, Integer.valueOf(☃ >> 2));
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (!☃.D) {
      ☃.a(new aez.a(☃, ☃));
    }
    return true;
  }
  
  public int a(alz ☃)
  {
    return ((Integer)☃.b(b)).intValue();
  }
  
  public void a(adq ☃, cj ☃)
  {
    cq ☃ = (cq)☃.p(☃).b(a);
    if (☃.k() == cq.a.a) {
      a(0.0F, 0.0F, 0.125F, 1.0F, 1.0F, 0.875F);
    } else {
      a(0.125F, 0.0F, 0.0F, 0.875F, 1.0F, 1.0F);
    }
  }
  
  public void a(zw ☃, yz ☃, List<zx> ☃)
  {
    ☃.add(new zx(☃, 1, 0));
    ☃.add(new zx(☃, 1, 1));
    ☃.add(new zx(☃, 1, 2));
  }
  
  protected void a(uy ☃)
  {
    ☃.a(true);
  }
  
  public void a_(adm ☃, cj ☃)
  {
    ☃.b(1022, ☃, 0);
  }
  
  public boolean a(adq ☃, cj ☃, cq ☃)
  {
    return true;
  }
  
  public static class a
    implements ol
  {
    private final adm a;
    private final cj b;
    
    public a(adm ☃, cj ☃)
    {
      this.a = ☃;
      this.b = ☃;
    }
    
    public String e_()
    {
      return "anvil";
    }
    
    public boolean l_()
    {
      return false;
    }
    
    public eu f_()
    {
      return new fb(afi.cf.a() + ".name", new Object[0]);
    }
    
    public xi a(wm ☃, wn ☃)
    {
      return new xk(☃, this.a, this.b, ☃);
    }
    
    public String k()
    {
      return "minecraft:anvil";
    }
  }
  
  public alz b(alz ☃)
  {
    return Q().a(a, cq.d);
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, cq.b(☃ & 0x3)).a(b, Integer.valueOf((☃ & 0xF) >> 2));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(a)).b();
    ☃ |= ((Integer)☃.b(b)).intValue() << 2;
    
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, b });
  }
}
