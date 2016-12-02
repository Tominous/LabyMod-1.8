import com.google.common.util.concurrent.ListeningExecutorService;

public class aff
  extends afc
{
  public aff()
  {
    super(arm.s, arn.G);
    c(3.0F);
    a(yz.f);
  }
  
  public akw a(adm ☃, int ☃)
  {
    return new akv();
  }
  
  public boolean a(adm ☃, cj ☃, alz ☃, wn ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akv))
    {
      ☃.a((akv)☃);
      ☃.b(na.N);
    }
    return true;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public int b()
  {
    return 3;
  }
  
  public void a(adm ☃, cj ☃, alz ☃, pr ☃, zx ☃)
  {
    super.a(☃, ☃, ☃, ☃, ☃);
    if (☃.s())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof akv)) {
        ((akv)☃).a(☃.q());
      }
    }
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    akw ☃ = ☃.s(☃);
    if ((☃ instanceof akv))
    {
      ((akv)☃).m();
      ☃.c(☃, this, 1, 0);
    }
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public static void f(adm ☃, final cj ☃)
  {
    nj.a.submit(new Runnable()
    {
      public void run()
      {
        amy ☃ = this.a.f(☃);
        for (int ☃ = ☃.o() - 1; ☃ >= 0; ☃--)
        {
          final cj ☃ = new cj(☃.n(), ☃, ☃.p());
          if (!☃.d(☃)) {
            break;
          }
          alz ☃ = this.a.p(☃);
          if (☃.c() == afi.bY) {
            ((le)this.a).a(new Runnable()
            {
              public void run()
              {
                akw ☃ = aff.1.this.a.s(☃);
                if ((☃ instanceof akv))
                {
                  ((akv)☃).m();
                  aff.1.this.a.c(☃, afi.bY, 1, 0);
                }
              }
            });
          }
        }
      }
    });
  }
}
