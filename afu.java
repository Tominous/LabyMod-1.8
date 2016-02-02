import java.util.Random;

public class afu
  extends age
  implements afj
{
  public static final amn a = amn.a("age", 0, 2);
  
  public afu()
  {
    super(arm.k);
    j(this.M.b().a(O, cq.c).a(a, Integer.valueOf(0)));
    a(true);
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!e(☃, ☃, ☃))
    {
      f(☃, ☃, ☃);
    }
    else if (☃.s.nextInt(5) == 0)
    {
      int ☃ = ((Integer)☃.b(a)).intValue();
      if (☃ < 2) {
        ☃.a(☃, ☃.a(a, Integer.valueOf(☃ + 1)), 2);
      }
    }
  }
  
  public boolean e(adm ☃, cj ☃, alz ☃)
  {
    ☃ = ☃.a((cq)☃.b(O));
    
    alz ☃ = ☃.p(☃);
    return (☃.c() == afi.r) && (☃.b(aio.a) == aio.a.d);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    a(☃, ☃);
    return super.a(☃, ☃, ☃);
  }
  
  public aug b(adm ☃, cj ☃)
  {
    a(☃, ☃);
    return super.b(☃, ☃);
  }
  
  public void a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    cq ☃ = (cq)☃.b(O);
    int ☃ = ((Integer)☃.b(a)).intValue();
    
    int ☃ = 4 + ☃ * 2;
    int ☃ = 5 + ☃ * 2;
    
    float ☃ = ☃ / 2.0F;
    switch (afu.1.a[☃.ordinal()])
    {
    case 1: 
      a((8.0F - ☃) / 16.0F, (12.0F - ☃) / 16.0F, (15.0F - ☃) / 16.0F, (8.0F + ☃) / 16.0F, 0.75F, 0.9375F);
      break;
    case 2: 
      a((8.0F - ☃) / 16.0F, (12.0F - ☃) / 16.0F, 0.0625F, (8.0F + ☃) / 16.0F, 0.75F, (1.0F + ☃) / 16.0F);
      break;
    case 3: 
      a(0.0625F, (12.0F - ☃) / 16.0F, (8.0F - ☃) / 16.0F, (1.0F + ☃) / 16.0F, 0.75F, (8.0F + ☃) / 16.0F);
      break;
    case 4: 
      a((15.0F - ☃) / 16.0F, (12.0F - ☃) / 16.0F, (8.0F - ☃) / 16.0F, 0.9375F, 0.75F, (8.0F + ☃) / 16.0F);
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    cq ☃ = cq.a(☃.y);
    ☃.a(☃, ☃.a(O, ☃), 2);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    if (!☃.k().c()) {
      ☃ = cq.c;
    }
    return Q().a(O, ☃.d()).a(a, Integer.valueOf(0));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if (!e(☃, ☃, ☃)) {
      f(☃, ☃, ☃);
    }
  }
  
  private void f(adm ☃, cj ☃, alz ☃)
  {
    ☃.a(☃, afi.a.Q(), 3);
    b(☃, ☃, ☃, 0);
  }
  
  public void a(adm ☃, cj ☃, alz ☃, float ☃, int ☃)
  {
    int ☃ = ((Integer)☃.b(a)).intValue();
    int ☃ = 1;
    if (☃ >= 2) {
      ☃ = 3;
    }
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      a(☃, ☃, new zx(zy.aW, 1, zd.m.b()));
    }
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zy.aW;
  }
  
  public int j(adm ☃, cj ☃)
  {
    return zd.m.b();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, boolean ☃)
  {
    return ((Integer)☃.b(a)).intValue() < 2;
  }
  
  public boolean a(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    return true;
  }
  
  public void b(adm ☃, Random ☃, cj ☃, alz ☃)
  {
    ☃.a(☃, ☃.a(a, Integer.valueOf(((Integer)☃.b(a)).intValue() + 1)), 2);
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(O, cq.b(☃)).a(a, Integer.valueOf((☃ & 0xF) >> 2));
  }
  
  public int c(alz ☃)
  {
    int ☃ = 0;
    
    ☃ |= ((cq)☃.b(O)).b();
    ☃ |= ((Integer)☃.b(a)).intValue() << 2;
    
    return ☃;
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { O, a });
  }
}
