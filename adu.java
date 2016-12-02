import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class adu
{
  private final le a;
  private final Random b;
  private final nq<adu.a> c = new nq();
  private final List<Long> d = Lists.newArrayList();
  
  public adu(le ☃)
  {
    this.a = ☃;
    this.b = new Random(☃.J());
  }
  
  public void a(pk ☃, float ☃)
  {
    if (this.a.t.q() == 1)
    {
      int ☃ = ns.c(☃.s);
      int ☃ = ns.c(☃.t) - 1;
      int ☃ = ns.c(☃.u);
      
      int ☃ = 1;
      int ☃ = 0;
      for (int ☃ = -2; ☃ <= 2; ☃++) {
        for (int ☃ = -2; ☃ <= 2; ☃++) {
          for (int ☃ = -1; ☃ < 3; ☃++)
          {
            int ☃ = ☃ + ☃ * ☃ + ☃ * ☃;
            int ☃ = ☃ + ☃;
            int ☃ = ☃ + ☃ * ☃ - ☃ * ☃;
            
            boolean ☃ = ☃ < 0;
            
            this.a.a(new cj(☃, ☃, ☃), ☃ ? afi.Z.Q() : afi.a.Q());
          }
        }
      }
      ☃.b(☃, ☃, ☃, ☃.y, 0.0F);
      ☃.v = (☃.w = ☃.x = 0.0D);
      
      return;
    }
    if (b(☃, ☃)) {
      return;
    }
    a(☃);
    b(☃, ☃);
  }
  
  public boolean b(pk ☃, float ☃)
  {
    int ☃ = 128;
    double ☃ = -1.0D;
    
    int ☃ = ns.c(☃.s);
    int ☃ = ns.c(☃.u);
    boolean ☃ = true;
    
    cj ☃ = cj.a;
    
    long ☃ = adg.a(☃, ☃);
    if (this.c.b(☃))
    {
      adu.a ☃ = (adu.a)this.c.a(☃);
      
      ☃ = 0.0D;
      
      ☃ = ☃;
      ☃.c = this.a.K();
      ☃ = false;
    }
    else
    {
      cj ☃ = new cj(☃);
      for (int ☃ = -128; ☃ <= 128; ☃++) {
        for (int ☃ = -128; ☃ <= 128; ☃++)
        {
          cj ☃ = ☃.a(☃, this.a.V() - 1 - ☃.o(), ☃);
          while (☃.o() >= 0)
          {
            cj ☃ = ☃.b();
            if (this.a.p(☃).c() == afi.aY)
            {
              while (this.a.p(☃ = ☃.b()).c() == afi.aY) {
                ☃ = ☃;
              }
              double ☃ = ☃.i(☃);
              if ((☃ < 0.0D) || (☃ < ☃))
              {
                ☃ = ☃;
                ☃ = ☃;
              }
            }
            ☃ = ☃;
          }
        }
      }
    }
    if (☃ >= 0.0D)
    {
      if (☃)
      {
        this.c.a(☃, new adu.a(☃, this.a.K()));
        this.d.add(Long.valueOf(☃));
      }
      double ☃ = ☃.n() + 0.5D;
      double ☃ = ☃.o() + 0.5D;
      double ☃ = ☃.p() + 0.5D;
      
      amd.b ☃ = afi.aY.f(this.a, ☃);
      boolean ☃ = ☃.b().e().c() == cq.b.b;
      double ☃ = ☃.b().k() == cq.a.a ? ☃.a().p() : ☃.a().n();
      ☃ = ☃.a().o() + 1 - ☃.aG().b * ☃.e();
      if (☃) {
        ☃ += 1.0D;
      }
      if (☃.b().k() == cq.a.a) {
        ☃ = ☃ + (1.0D - ☃.aG().a) * ☃.d() * ☃.b().e().c().a();
      } else {
        ☃ = ☃ + (1.0D - ☃.aG().a) * ☃.d() * ☃.b().e().c().a();
      }
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      float ☃ = 0.0F;
      if (☃.b().d() == ☃.aH())
      {
        ☃ = 1.0F;
        ☃ = 1.0F;
      }
      else if (☃.b().d() == ☃.aH().d())
      {
        ☃ = -1.0F;
        ☃ = -1.0F;
      }
      else if (☃.b().d() == ☃.aH().e())
      {
        ☃ = 1.0F;
        ☃ = -1.0F;
      }
      else
      {
        ☃ = -1.0F;
        ☃ = 1.0F;
      }
      double ☃ = ☃.v;
      double ☃ = ☃.x;
      ☃.v = (☃ * ☃ + ☃ * ☃);
      ☃.x = (☃ * ☃ + ☃ * ☃);
      ☃.y = (☃ - ☃.aH().d().b() * 90 + ☃.b().b() * 90);
      
      ☃.b(☃, ☃, ☃, ☃.y, ☃.z);
      return true;
    }
    return false;
  }
  
  public boolean a(pk ☃)
  {
    int ☃ = 16;
    double ☃ = -1.0D;
    
    int ☃ = ns.c(☃.s);
    int ☃ = ns.c(☃.t);
    int ☃ = ns.c(☃.u);
    
    int ☃ = ☃;
    int ☃ = ☃;
    int ☃ = ☃;
    int ☃ = 0;
    
    int ☃ = this.b.nextInt(4);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
    {
      double ☃ = ☃ + 0.5D - ☃.s;
      for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
      {
        double ☃ = ☃ + 0.5D - ☃.u;
        label464:
        for (int ☃ = this.a.V() - 1; ☃ >= 0; ☃--) {
          if (this.a.d(☃.c(☃, ☃, ☃)))
          {
            while ((☃ > 0) && (this.a.d(☃.c(☃, ☃ - 1, ☃)))) {
              ☃--;
            }
            for (int ☃ = ☃; ☃ < ☃ + 4; ☃++)
            {
              int ☃ = ☃ % 2;
              int ☃ = 1 - ☃;
              if (☃ % 4 >= 2)
              {
                ☃ = -☃;
                ☃ = -☃;
              }
              for (int ☃ = 0; ☃ < 3; ☃++) {
                for (int ☃ = 0; ☃ < 4; ☃++) {
                  for (int ☃ = -1; ☃ < 4; ☃++)
                  {
                    int ☃ = ☃ + (☃ - 1) * ☃ + ☃ * ☃;
                    int ☃ = ☃ + ☃;
                    int ☃ = ☃ + (☃ - 1) * ☃ - ☃ * ☃;
                    
                    ☃.c(☃, ☃, ☃);
                    if ((☃ < 0) && (!this.a.p(☃).c().t().a())) {
                      break label464;
                    }
                    if ((☃ >= 0) && (!this.a.d(☃))) {
                      break label464;
                    }
                  }
                }
              }
              double ☃ = ☃ + 0.5D - ☃.t;
              double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
              if ((☃ < 0.0D) || (☃ < ☃))
              {
                ☃ = ☃;
                ☃ = ☃;
                ☃ = ☃;
                ☃ = ☃;
                ☃ = ☃ % 4;
              }
            }
          }
        }
      }
    }
    if (☃ < 0.0D) {
      for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
      {
        double ☃ = ☃ + 0.5D - ☃.s;
        for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
        {
          double ☃ = ☃ + 0.5D - ☃.u;
          label839:
          for (int ☃ = this.a.V() - 1; ☃ >= 0; ☃--) {
            if (this.a.d(☃.c(☃, ☃, ☃)))
            {
              while ((☃ > 0) && (this.a.d(☃.c(☃, ☃ - 1, ☃)))) {
                ☃--;
              }
              for (int ☃ = ☃; ☃ < ☃ + 2; ☃++)
              {
                int ☃ = ☃ % 2;
                int ☃ = 1 - ☃;
                for (int ☃ = 0; ☃ < 4; ☃++) {
                  for (int ☃ = -1; ☃ < 4; ☃++)
                  {
                    int ☃ = ☃ + (☃ - 1) * ☃;
                    int ☃ = ☃ + ☃;
                    int ☃ = ☃ + (☃ - 1) * ☃;
                    
                    ☃.c(☃, ☃, ☃);
                    if ((☃ < 0) && (!this.a.p(☃).c().t().a())) {
                      break label839;
                    }
                    if ((☃ >= 0) && (!this.a.d(☃))) {
                      break label839;
                    }
                  }
                }
                double ☃ = ☃ + 0.5D - ☃.t;
                double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
                if ((☃ < 0.0D) || (☃ < ☃))
                {
                  ☃ = ☃;
                  ☃ = ☃;
                  ☃ = ☃;
                  ☃ = ☃;
                  ☃ = ☃ % 2;
                }
              }
            }
          }
        }
      }
    }
    int ☃ = ☃;
    
    int ☃ = ☃;
    int ☃ = ☃;
    int ☃ = ☃;
    
    int ☃ = ☃ % 2;
    int ☃ = 1 - ☃;
    if (☃ % 4 >= 2)
    {
      ☃ = -☃;
      ☃ = -☃;
    }
    if (☃ < 0.0D)
    {
      ☃ = ns.a(☃, 70, this.a.V() - 10);
      ☃ = ☃;
      for (int ☃ = -1; ☃ <= 1; ☃++) {
        for (int ☃ = 1; ☃ < 3; ☃++) {
          for (int ☃ = -1; ☃ < 3; ☃++)
          {
            int ☃ = ☃ + (☃ - 1) * ☃ + ☃ * ☃;
            int ☃ = ☃ + ☃;
            int ☃ = ☃ + (☃ - 1) * ☃ - ☃ * ☃;
            
            boolean ☃ = ☃ < 0;
            
            this.a.a(new cj(☃, ☃, ☃), ☃ ? afi.Z.Q() : afi.a.Q());
          }
        }
      }
    }
    alz ☃ = afi.aY.Q().a(aip.a, ☃ != 0 ? cq.a.a : cq.a.c);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      for (int ☃ = 0; ☃ < 4; ☃++) {
        for (int ☃ = -1; ☃ < 4; ☃++)
        {
          int ☃ = ☃ + (☃ - 1) * ☃;
          int ☃ = ☃ + ☃;
          int ☃ = ☃ + (☃ - 1) * ☃;
          
          boolean ☃ = (☃ == 0) || (☃ == 3) || (☃ == -1) || (☃ == 3);
          this.a.a(new cj(☃, ☃, ☃), ☃ ? afi.Z.Q() : ☃, 2);
        }
      }
      for (int ☃ = 0; ☃ < 4; ☃++) {
        for (int ☃ = -1; ☃ < 4; ☃++)
        {
          int ☃ = ☃ + (☃ - 1) * ☃;
          int ☃ = ☃ + ☃;
          int ☃ = ☃ + (☃ - 1) * ☃;
          
          cj ☃ = new cj(☃, ☃, ☃);
          this.a.c(☃, this.a.p(☃).c());
        }
      }
    }
    return true;
  }
  
  public void a(long ☃)
  {
    if (☃ % 100L == 0L)
    {
      Iterator<Long> ☃ = this.d.iterator();
      long ☃ = ☃ - 300L;
      while (☃.hasNext())
      {
        Long ☃ = (Long)☃.next();
        adu.a ☃ = (adu.a)this.c.a(☃.longValue());
        if ((☃ == null) || (☃.c < ☃))
        {
          ☃.remove();
          this.c.d(☃.longValue());
        }
      }
    }
  }
  
  public class a
    extends cj
  {
    public long c;
    
    public a(cj ☃, long ☃)
    {
      super(☃.o(), ☃.p());
      this.c = ☃;
    }
  }
}
