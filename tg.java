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
    this.a = ☃;
  }
  
  public void a()
  {
    if (this.a.w())
    {
      this.c = 0;
      return;
    }
    if (this.c == 2) {
      return;
    }
    if (this.c == 0)
    {
      float ☃ = this.a.c(0.0F);
      if ((☃ < 0.5D) || (☃ > 0.501D)) {
        return;
      }
      this.c = (this.a.s.nextInt(10) == 0 ? 1 : 2);
      this.b = false;
      if (this.c == 2) {
        return;
      }
    }
    if (this.c == -1) {
      return;
    }
    if (!this.b) {
      if (b()) {
        this.b = true;
      } else {
        return;
      }
    }
    if (this.e > 0)
    {
      this.e -= 1;
      return;
    }
    this.e = 2;
    if (this.d > 0)
    {
      c();
      this.d -= 1;
    }
    else
    {
      this.c = 2;
    }
  }
  
  private boolean b()
  {
    List<wn> ☃ = this.a.j;
    for (wn ☃ : ☃) {
      if (!☃.v())
      {
        this.f = this.a.ae().a(new cj(☃), 1);
        if ((this.f != null) && 
        
          (this.f.c() >= 10) && 
          
          (this.f.d() >= 20) && 
          
          (this.f.e() >= 20))
        {
          cj ☃ = this.f.a();
          float ☃ = this.f.b();
          
          boolean ☃ = false;
          for (int ☃ = 0; ☃ < 10; ☃++)
          {
            float ☃ = this.a.s.nextFloat() * 3.1415927F * 2.0F;
            this.g = (☃.n() + (int)(ns.b(☃) * ☃ * 0.9D));
            this.h = ☃.o();
            this.i = (☃.p() + (int)(ns.a(☃) * ☃ * 0.9D));
            ☃ = false;
            for (tf ☃ : this.a.ae().b()) {
              if (☃ != this.f) {
                if (☃.a(new cj(this.g, this.h, this.i)))
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
          aui ☃ = a(new cj(this.g, this.h, this.i));
          if (☃ != null)
          {
            this.e = 0;
            this.d = 20;
            return true;
          }
        }
      }
    }
    return false;
  }
  
  private boolean c()
  {
    aui ☃ = a(new cj(this.g, this.h, this.i));
    if (☃ == null) {
      return false;
    }
    we ☃;
    try
    {
      ☃ = new we(this.a);
      ☃.a(this.a.E(new cj(☃)), null);
      ☃.m(false);
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
      return false;
    }
    ☃.b(☃.a, ☃.b, ☃.c, this.a.s.nextFloat() * 360.0F, 0.0F);
    this.a.d(☃);
    cj ☃ = this.f.a();
    ☃.a(☃, this.f.b());
    return true;
  }
  
  private aui a(cj ☃)
  {
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
      if (this.f.a(☃)) {
        if (adt.a(ps.a.a, this.a, ☃)) {
          return new aui(☃.n(), ☃.o(), ☃.p());
        }
      }
    }
    return null;
  }
}
