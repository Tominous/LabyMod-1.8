import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class xk
  extends xi
{
  private static final Logger f = ;
  private og g = new ye();
  private og h = new oq("Repair", true, 2)
  {
    public void p_()
    {
      super.p_();
      a(this);
    }
  };
  private adm i;
  private cj j;
  public int a;
  private int k;
  private String l;
  private final wn m;
  
  public xk(wm ☃, adm ☃, wn ☃)
  {
    this(☃, ☃, cj.a, ☃);
  }
  
  public xk(wm ☃, final adm ☃, final cj ☃, wn ☃)
  {
    j = ☃;
    i = ☃;
    m = ☃;
    
    a(new yg(h, 0, 27, 47));
    a(new yg(h, 1, 76, 47));
    a(new yg(g, 2, 134, 47)
    {
      public boolean a(zx ☃)
      {
        return false;
      }
      
      public boolean a(wn ☃)
      {
        return ((bA.d) || (bB >= a)) && (a > 0) && (e());
      }
      
      public void a(wn ☃, zx ☃)
      {
        if (!bA.d) {
          ☃.a(-a);
        }
        xk.a(xk.this).a(0, null);
        if (xk.b(xk.this) > 0)
        {
          zx ☃ = xk.a(xk.this).a(1);
          if ((☃ != null) && (b > xk.b(xk.this)))
          {
            b -= xk.b(xk.this);
            xk.a(xk.this).a(1, ☃);
          }
          else
          {
            xk.a(xk.this).a(1, null);
          }
        }
        else
        {
          xk.a(xk.this).a(1, null);
        }
        a = 0;
        
        alz ☃ = ☃.p(☃);
        if ((!bA.d) && (!☃D) && (☃.c() == afi.cf) && (☃.bc().nextFloat() < 0.12F))
        {
          int ☃ = ((Integer)☃.b(aez.b)).intValue();
          ☃++;
          if (☃ > 2)
          {
            ☃.g(☃);
            ☃.b(1020, ☃, 0);
          }
          else
          {
            ☃.a(☃, ☃.a(aez.b, Integer.valueOf(☃)), 2);
            ☃.b(1021, ☃, 0);
          }
        }
        else if (!☃D)
        {
          ☃.b(1021, ☃, 0);
        }
      }
    });
    for (int ☃ = 0; ☃ < 3; ☃++) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        a(new yg(☃, ☃ + ☃ * 9 + 9, 8 + ☃ * 18, 84 + ☃ * 18));
      }
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(new yg(☃, ☃, 8 + ☃ * 18, 142));
    }
  }
  
  public void a(og ☃)
  {
    super.a(☃);
    if (☃ == h) {
      e();
    }
  }
  
  public void e()
  {
    int ☃ = 0;
    int ☃ = 1;
    int ☃ = 1;
    int ☃ = 1;
    int ☃ = 2;
    int ☃ = 1;
    int ☃ = 1;
    
    zx ☃ = h.a(0);
    a = 1;
    int ☃ = 0;
    int ☃ = 0;
    int ☃ = 0;
    if (☃ == null)
    {
      g.a(0, null);
      a = 0;
      return;
    }
    zx ☃ = ☃.k();
    zx ☃ = h.a(1);
    Map<Integer, Integer> ☃ = ack.a(☃);
    boolean ☃ = false;
    
    ☃ += ☃.A() + (☃ == null ? 0 : ☃.A());
    
    k = 0;
    Map<Integer, Integer> ☃;
    Iterator ☃;
    if (☃ != null)
    {
      ☃ = (☃.b() == zy.cd) && (zy.cd.h(☃).c() > 0);
      if ((☃.e()) && (☃.b().a(☃, ☃)))
      {
        int ☃ = Math.min(☃.h(), ☃.j() / 4);
        if (☃ <= 0)
        {
          g.a(0, null);
          a = 0;
          return;
        }
        int ☃ = 0;
        while ((☃ > 0) && (☃ < b))
        {
          int ☃ = ☃.h() - ☃;
          ☃.b(☃);
          ☃++;
          
          ☃ = Math.min(☃.h(), ☃.j() / 4);
          ☃++;
        }
        k = ☃;
      }
      else
      {
        if ((!☃) && ((☃.b() != ☃.b()) || (!☃.e())))
        {
          g.a(0, null);
          a = 0;
          return;
        }
        if ((☃.e()) && (!☃))
        {
          int ☃ = ☃.j() - ☃.h();
          int ☃ = ☃.j() - ☃.h();
          int ☃ = ☃ + ☃.j() * 12 / 100;
          int ☃ = ☃ + ☃;
          int ☃ = ☃.j() - ☃;
          if (☃ < 0) {
            ☃ = 0;
          }
          if (☃ < ☃.i())
          {
            ☃.b(☃);
            ☃ += 2;
          }
        }
        ☃ = ack.a(☃);
        for (☃ = ☃.keySet().iterator(); ☃.hasNext();)
        {
          int ☃ = ((Integer)☃.next()).intValue();
          aci ☃ = aci.c(☃);
          if (☃ != null)
          {
            int ☃ = ☃.containsKey(Integer.valueOf(☃)) ? ((Integer)☃.get(Integer.valueOf(☃))).intValue() : 0;
            int ☃ = ((Integer)☃.get(Integer.valueOf(☃))).intValue();
            ☃++;☃ = ☃ == ☃ ? ☃ : Math.max(☃, ☃);
            boolean ☃ = ☃.a(☃);
            if ((m.bA.d) || (☃.b() == zy.cd)) {
              ☃ = true;
            }
            for (Iterator ☃ = ☃.keySet().iterator(); ☃.hasNext();)
            {
              int ☃ = ((Integer)☃.next()).intValue();
              if ((☃ != ☃) && (!☃.a(aci.c(☃))))
              {
                ☃ = false;
                ☃++;
              }
            }
            if (☃)
            {
              if (☃ > ☃.b()) {
                ☃ = ☃.b();
              }
              ☃.put(Integer.valueOf(☃), Integer.valueOf(☃));
              int ☃ = 0;
              switch (☃.d())
              {
              case 10: 
                ☃ = 1;
                break;
              case 5: 
                ☃ = 2;
                break;
              case 2: 
                ☃ = 4;
                break;
              case 1: 
                ☃ = 8;
              }
              if (☃) {
                ☃ = Math.max(1, ☃ / 2);
              }
              ☃ += ☃ * ☃;
            }
          }
        }
      }
    }
    if (StringUtils.isBlank(l))
    {
      if (☃.s())
      {
        ☃ = 1;
        
        ☃ += ☃;
        
        ☃.r();
      }
    }
    else if (!l.equals(☃.q()))
    {
      ☃ = 1;
      
      ☃ += ☃;
      
      ☃.c(l);
    }
    a = (☃ + ☃);
    if (☃ <= 0) {
      ☃ = null;
    }
    if ((☃ == ☃) && (☃ > 0) && (a >= 40)) {
      a = 39;
    }
    if ((a >= 40) && (!m.bA.d)) {
      ☃ = null;
    }
    if (☃ != null)
    {
      int ☃ = ☃.A();
      if ((☃ != null) && (☃ < ☃.A())) {
        ☃ = ☃.A();
      }
      ☃ = ☃ * 2 + 1;
      
      ☃.c(☃);
      ack.a(☃, ☃);
    }
    g.a(0, ☃);
    
    b();
  }
  
  public void a(xn ☃)
  {
    super.a(☃);
    ☃.a(this, 0, a);
  }
  
  public void b(int ☃, int ☃)
  {
    if (☃ == 0) {
      a = ☃;
    }
  }
  
  public void b(wn ☃)
  {
    super.b(☃);
    if (i.D) {
      return;
    }
    for (int ☃ = 0; ☃ < h.o_(); ☃++)
    {
      zx ☃ = h.b(☃);
      if (☃ != null) {
        ☃.a(☃, false);
      }
    }
  }
  
  public boolean a(wn ☃)
  {
    if (i.p(j).c() != afi.cf) {
      return false;
    }
    if (☃.e(j.n() + 0.5D, j.o() + 0.5D, j.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public zx b(wn ☃, int ☃)
  {
    zx ☃ = null;
    yg ☃ = (yg)c.get(☃);
    if ((☃ != null) && (☃.e()))
    {
      zx ☃ = ☃.d();
      ☃ = ☃.k();
      if (☃ == 2)
      {
        if (!a(☃, 3, 39, true)) {
          return null;
        }
        ☃.a(☃, ☃);
      }
      else if ((☃ == 0) || (☃ == 1))
      {
        if (!a(☃, 3, 39, false)) {
          return null;
        }
      }
      else if ((☃ >= 3) && (☃ < 39) && 
        (!a(☃, 0, 2, false)))
      {
        return null;
      }
      if (b == 0) {
        ☃.d(null);
      } else {
        ☃.f();
      }
      if (b == b) {
        return null;
      }
      ☃.a(☃, ☃);
    }
    return ☃;
  }
  
  public void a(String ☃)
  {
    l = ☃;
    if (a(2).e())
    {
      zx ☃ = a(2).d();
      if (StringUtils.isBlank(☃)) {
        ☃.r();
      } else {
        ☃.c(l);
      }
    }
    e();
  }
}
