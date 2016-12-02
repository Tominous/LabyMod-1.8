import java.util.List;
import java.util.Random;

public class tg
{
  private adm a;
  private boolean b;
  private int c = -1;
  private int d;
  private int e;
  private tf f;
  private int g;
  private int h;
  private int i;
  
  public tg(adm ☃)
  {
    a = ☃;
  }
  
  public void a()
  {
    if (a.w())
    {
      c = 0;
      return;
    }
    if (c == 2) {
      return;
    }
    if (c == 0)
    {
      float ☃ = a.c(0.0F);
      if ((☃ < 0.5D) || (☃ > 0.501D)) {
        return;
      }
      c = (a.s.nextInt(10) == 0 ? 1 : 2);
      b = false;
      if (c == 2) {
        return;
      }
    }
    if (c == -1) {
      return;
    }
    if (!b) {
      if (b()) {
        b = true;
      } else {
        return;
      }
    }
    if (e > 0)
    {
      e -= 1;
      return;
    }
    e = 2;
    if (d > 0)
    {
      c();
      d -= 1;
    }
    else
    {
      c = 2;
    }
  }
  
  private boolean b()
  {
    List<wn> ☃ = a.j;
    for (wn ☃ : ☃) {
      if (!☃.v())
      {
        f = a.ae().a(new cj(☃), 1);
        if ((f != null) && 
        
          (f.c() >= 10) && 
          
          (f.d() >= 20) && 
          
          (f.e() >= 20))
        {
          cj ☃ = f.a();
          float ☃ = f.b();
          
          boolean ☃ = false;
          for (int ☃ = 0; ☃ < 10; ☃++)
          {
            float ☃ = a.s.nextFloat() * 3.1415927F * 2.0F;
            g = (☃.n() + (int)(ns.b(☃) * ☃ * 0.9D));
            h = ☃.o();
            i = (☃.p() + (int)(ns.a(☃) * ☃ * 0.9D));
            ☃ = false;
            for (tf ☃ : a.ae().b()) {
              if (☃ != f) {
                if (☃.a(new cj(g, h, i)))
                {
                  ☃ = true;
                  break;
                }
              }
            }
            if (!☃) {
              break;
            }
          }
          if (☃) {
            return false;
          }
          aui ☃ = a(new cj(g, h, i));
          if (☃ != null)
          {
            e = 0;
            d = 20;
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean c()
  {
    aui ☃ = a(new cj(g, h, i));
    if (☃ == null) {
      return false;
    }
    we ☃;
    try
    {
      ☃ = new we(a);
      ☃.a(a.E(new cj(☃)), null);
      ☃.m(false);
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
      return false;
    }
    ☃.b(a, b, c, a.s.nextFloat() * 360.0F, 0.0F);
    a.d(☃);
    cj ☃ = f.a();
    ☃.a(☃, f.b());
    return true;
  }
  
  private aui a(cj ☃)
  {
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(a.s.nextInt(16) - 8, a.s.nextInt(6) - 3, a.s.nextInt(16) - 8);
      if (f.a(☃)) {
        if (adt.a(ps.a.a, a, ☃)) {
          return new aui(☃.n(), ☃.o(), ☃.p());
        }
      }
    }
    return null;
  }
}
