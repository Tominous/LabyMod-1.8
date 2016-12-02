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
    
    c = ☃;
  }
  
  public xc(adm ☃, double ☃, double ☃, double ☃, int ☃)
  {
    this(☃, ☃, ☃, ☃, new zx(zy.bz, 1, ☃));
  }
  
  public xc(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    super(☃, ☃, ☃, ☃);
    c = ☃;
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
    if (c == null) {
      c = new zx(zy.bz, 1, 0);
    }
    c.b(☃);
  }
  
  public int o()
  {
    if (c == null) {
      c = new zx(zy.bz, 1, 0);
    }
    return c.i();
  }
  
  protected void a(auh ☃)
  {
    if (!o.D)
    {
      List<pf> ☃ = zy.bz.h(c);
      Iterator ☃;
      if ((☃ != null) && (!☃.isEmpty()))
      {
        aug ☃ = aR().b(4.0D, 2.0D, 4.0D);
        List<pr> ☃ = o.a(pr.class, ☃);
        if (!☃.isEmpty()) {
          for (☃ = ☃.iterator(); ☃.hasNext();)
          {
            ☃ = (pr)☃.next();
            double ☃ = h(☃);
            if (☃ < 16.0D)
            {
              ☃ = 1.0D - Math.sqrt(☃) / 4.0D;
              if (☃ == d) {
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
      o.b(2002, new cj(this), o());
      
      J();
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("Potion", 10)) {
      c = zx.a(☃.m("Potion"));
    } else {
      a(☃.f("potionValue"));
    }
    if (c == null) {
      J();
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (c != null) {
      ☃.a("Potion", c.b(new dn()));
    }
  }
}
