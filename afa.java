import java.util.Random;

public class afa
  extends afc
{
  public static final aml a = aml.a("facing", cq.c.a);
  public static final amn b = amn.a("rotation", 0, 15);
  
  protected afa()
  {
    super(arm.d);
    float ☃ = 0.25F;
    float ☃ = 1.0F;
    a(0.5F - ☃, 0.0F, 0.5F - ☃, 0.5F + ☃, ☃, 0.5F + ☃);
  }
  
  public String f()
  {
    return di.a("item.banner.white.name");
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public aug b(adm ☃, cj ☃)
  {
    a(☃, ☃);
    return super.b(☃, ☃);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean b(adq ☃, cj ☃)
  {
    return true;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean g()
  {
    return true;
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new aku();
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.cE;
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.cE;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof aku))
    {
      zx ☃ = new zx(zy.cE, 1, ((aku)☃).b());
      
      dn ☃ = new dn();
      ☃.b(☃);
      ☃.o("x");
      ☃.o("y");
      ☃.o("z");
      ☃.o("id");
      ☃.a("BlockEntityTag", ☃);
      
      a(☃, ☃, ☃);
    }
    else
    {
      super.a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (!e(☃, ☃)) && (super.d(☃, ☃));
  }
  
  public void a(adm ☃, wn ☃, cj ☃, alz ☃, akw ☃)
  {
    if ((☃ instanceof aku))
    {
      aku ☃ = (aku)☃;
      zx ☃ = new zx(zy.cE, 1, ((aku)☃).b());
      
      dn ☃ = new dn();
      aku.a(☃, ☃.b(), ☃.d());
      ☃.a("BlockEntityTag", ☃);
      
      a(☃, ☃, ☃);
    }
    else
    {
      super.a(☃, ☃, ☃, ☃, null);
    }
  }
  
  public static class b
    extends afa
  {
    public b()
    {
      j(this.M.b().a(a, cq.c));
    }
    
    public void a(adq ☃, cj ☃)
    {
      cq ☃ = (cq)☃.p(☃).b(a);
      
      float ☃ = 0.0F;
      float ☃ = 0.78125F;
      float ☃ = 0.0F;
      float ☃ = 1.0F;
      
      float ☃ = 0.125F;
      
      a(0.0F, 0.0F, 0.0F, 1.0F, 1.0F, 1.0F);
      switch (afa.1.a[☃.ordinal()])
      {
      case 1: 
      default: 
        a(☃, ☃, 1.0F - ☃, ☃, ☃, 1.0F);
        break;
      case 2: 
        a(☃, ☃, 0.0F, ☃, ☃, ☃);
        break;
      case 3: 
        a(1.0F - ☃, ☃, ☃, 1.0F, ☃, ☃);
        break;
      case 4: 
        a(0.0F, ☃, ☃, ☃, ☃, ☃);
      }
    }
    
    public void a(adm ☃, cj ☃, alz ☃, afh ☃)
    {
      cq ☃ = (cq)☃.b(a);
      if (!☃.p(☃.a(☃.d())).c().t().a())
      {
        b(☃, ☃, ☃, 0);
        ☃.g(☃);
      }
      super.a(☃, ☃, ☃, ☃);
    }
    
    public alz a(int ☃)
    {
      cq ☃ = cq.a(☃);
      if (☃.k() == cq.a.b) {
        ☃ = cq.c;
      }
      return Q().a(a, ☃);
    }
    
    public int c(alz ☃)
    {
      return ((cq)☃.b(a)).a();
    }
    
    protected ama e()
    {
      return new ama(this, new amo[] { a });
    }
  }
  
  public static class a
    extends afa
  {
    public a()
    {
      j(this.M.b().a(b, Integer.valueOf(0)));
    }
    
    public void a(adm ☃, cj ☃, alz ☃, afh ☃)
    {
      if (!☃.p(☃.b()).c().t().a())
      {
        b(☃, ☃, ☃, 0);
        ☃.g(☃);
      }
      super.a(☃, ☃, ☃, ☃);
    }
    
    public alz a(int ☃)
    {
      return Q().a(b, Integer.valueOf(☃));
    }
    
    public int c(alz ☃)
    {
      return ((Integer)☃.b(b)).intValue();
    }
    
    protected ama e()
    {
      return new ama(this, new amo[] { b });
    }
  }
}
