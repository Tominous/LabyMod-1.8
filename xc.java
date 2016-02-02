import java.util.Iterator;
import java.util.List;

public class xc
  extends wy
{
  private zx c;
  
  public xc(adm ☃)
  {
    super(☃);
  }
  
  public xc(adm ☃, pr ☃, int ☃)
  {
    this(☃, ☃, new zx(zy.bz, 1, ☃));
  }
  
  public xc(adm ☃, pr ☃, zx ☃)
  {
    super(☃, ☃);
    
    this.c = ☃;
  }
  
  public xc(adm ☃, double ☃, double ☃, double ☃, int ☃)
  {
    this(☃, ☃, ☃, ☃, new zx(zy.bz, 1, ☃));
  }
  
  public xc(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    super(☃, ☃, ☃, ☃);
    this.c = ☃;
  }
  
  protected float m()
  {
    return 0.05F;
  }
  
  protected float j()
  {
    return 0.5F;
  }
  
  protected float l()
  {
    return -20.0F;
  }
  
  public void a(int ☃)
  {
    if (this.c == null) {
      this.c = new zx(zy.bz, 1, 0);
    }
    this.c.b(☃);
  }
  
  public int o()
  {
    if (this.c == null) {
      this.c = new zx(zy.bz, 1, 0);
    }
    return this.c.i();
  }
  
  protected void a(auh ☃)
  {
    if (!this.o.D)
    {
      List<pf> ☃ = zy.bz.h(this.c);
      Iterator ☃;
      if ((☃ != null) && (!☃.isEmpty()))
      {
        aug ☃ = aR().b(4.0D, 2.0D, 4.0D);
        List<pr> ☃ = this.o.a(pr.class, ☃);
        if (!☃.isEmpty()) {
          for (☃ = ☃.iterator(); ☃.hasNext();)
          {
            ☃ = (pr)☃.next();
            double ☃ = h(☃);
            if (☃ < 16.0D)
            {
              ☃ = 1.0D - Math.sqrt(☃) / 4.0D;
              if (☃ == ☃.d) {
                ☃ = 1.0D;
              }
              for (pf ☃ : ☃)
              {
                int ☃ = ☃.a();
                if (pe.a[☃].b())
                {
                  pe.a[☃].a(this, n(), ☃, ☃.c(), ☃);
                }
                else
                {
                  int ☃ = (int)(☃ * ☃.b() + 0.5D);
                  if (☃ > 20) {
                    ☃.c(new pf(☃, ☃, ☃.c()));
                  }
                }
              }
            }
          }
        }
      }
      pr ☃;
      double ☃;
      this.o.b(2002, new cj(this), o());
      
      J();
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("Potion", 10)) {
      this.c = zx.a(☃.m("Potion"));
    } else {
      a(☃.f("potionValue"));
    }
    if (this.c == null) {
      J();
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (this.c != null) {
      ☃.a("Potion", this.c.b(new dn()));
    }
  }
}
