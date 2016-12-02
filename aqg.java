import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqg
{
  public static void a()
  {
    aqr.a(aqg.a.class, "MSCorridor");
    aqr.a(aqg.b.class, "MSCrossing");
    aqr.a(aqg.c.class, "MSRoom");
    aqr.a(aqg.d.class, "MSStairs");
  }
  
  private static aqt a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    int ☃ = ☃.nextInt(100);
    if (☃ >= 80)
    {
      aqe ☃ = aqg.b.a(☃, ☃, ☃, ☃, ☃, ☃);
      if (☃ != null) {
        return new aqg.b(☃, ☃, ☃, ☃);
      }
    }
    else if (☃ >= 70)
    {
      aqe ☃ = aqg.d.a(☃, ☃, ☃, ☃, ☃, ☃);
      if (☃ != null) {
        return new aqg.d(☃, ☃, ☃, ☃);
      }
    }
    else
    {
      aqe ☃ = aqg.a.a(☃, ☃, ☃, ☃, ☃, ☃);
      if (☃ != null) {
        return new aqg.a(☃, ☃, ☃, ☃);
      }
    }
    return null;
  }
  
  private static aqt b(aqt ☃, List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    if (☃ > 8) {
      return null;
    }
    if ((Math.abs(☃ - ☃.c().a) > 80) || (Math.abs(☃ - ☃.c().c) > 80)) {
      return null;
    }
    aqt ☃ = a(☃, ☃, ☃, ☃, ☃, ☃, ☃ + 1);
    if (☃ != null)
    {
      ☃.add(☃);
      ☃.a(☃, ☃, ☃);
    }
    return ☃;
  }
  
  public static class c
    extends aqt
  {
    private List<aqe> a = Lists.newLinkedList();
    
    public c() {}
    
    public c(int ☃, Random ☃, int ☃, int ☃)
    {
      super();
      
      this.l = new aqe(☃, 50, ☃, ☃ + 7 + ☃.nextInt(6), 54 + ☃.nextInt(6), ☃ + 7 + ☃.nextInt(6));
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      int ☃ = d();
      
      int ☃ = this.l.d() - 3 - 1;
      if (☃ <= 0) {
        ☃ = 1;
      }
      int ☃ = 0;
      while (☃ < this.l.c())
      {
        ☃ += ☃.nextInt(this.l.c());
        if (☃ + 3 > this.l.c()) {
          break;
        }
        aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃.nextInt(☃) + 1, this.l.c - 1, cq.c, ☃);
        if (☃ != null)
        {
          aqe ☃ = ☃.c();
          this.a.add(new aqe(☃.a, ☃.b, this.l.c, ☃.d, ☃.e, this.l.c + 1));
        }
        ☃ += 4;
      }
      ☃ = 0;
      while (☃ < this.l.c())
      {
        ☃ += ☃.nextInt(this.l.c());
        if (☃ + 3 > this.l.c()) {
          break;
        }
        aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃.nextInt(☃) + 1, this.l.f + 1, cq.d, ☃);
        if (☃ != null)
        {
          aqe ☃ = ☃.c();
          this.a.add(new aqe(☃.a, ☃.b, this.l.f - 1, ☃.d, ☃.e, this.l.f));
        }
        ☃ += 4;
      }
      ☃ = 0;
      while (☃ < this.l.e())
      {
        ☃ += ☃.nextInt(this.l.e());
        if (☃ + 3 > this.l.e()) {
          break;
        }
        aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃.nextInt(☃) + 1, this.l.c + ☃, cq.e, ☃);
        if (☃ != null)
        {
          aqe ☃ = ☃.c();
          this.a.add(new aqe(this.l.a, ☃.b, ☃.c, this.l.a + 1, ☃.e, ☃.f));
        }
        ☃ += 4;
      }
      ☃ = 0;
      while (☃ < this.l.e())
      {
        ☃ += ☃.nextInt(this.l.e());
        if (☃ + 3 > this.l.e()) {
          break;
        }
        aqt ☃ = aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃.nextInt(☃) + 1, this.l.c + ☃, cq.f, ☃);
        if (☃ != null)
        {
          aqe ☃ = ☃.c();
          this.a.add(new aqe(this.l.d - 1, ☃.b, ☃.c, this.l.d, ☃.e, ☃.f));
        }
        ☃ += 4;
      }
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
      
      a(☃, ☃, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
      for (aqe ☃ : this.a) {
        a(☃, ☃, ☃.a, ☃.e - 2, ☃.c, ☃.d, ☃.e, ☃.f, afi.a.Q(), afi.a.Q(), false);
      }
      a(☃, ☃, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
      
      return true;
    }
    
    public void a(int ☃, int ☃, int ☃)
    {
      super.a(☃, ☃, ☃);
      for (aqe ☃ : this.a) {
        ☃.a(☃, ☃, ☃);
      }
    }
    
    protected void a(dn ☃)
    {
      du ☃ = new du();
      for (aqe ☃ : this.a) {
        ☃.a(☃.g());
      }
      ☃.a("Entrances", ☃);
    }
    
    protected void b(dn ☃)
    {
      du ☃ = ☃.c("Entrances", 11);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        this.a.add(new aqe(☃.c(☃)));
      }
    }
  }
  
  public static class a
    extends aqt
  {
    private boolean a;
    private boolean b;
    private boolean c;
    private int d;
    
    public a() {}
    
    protected void a(dn ☃)
    {
      ☃.a("hr", this.a);
      ☃.a("sc", this.b);
      ☃.a("hps", this.c);
      ☃.a("Num", this.d);
    }
    
    protected void b(dn ☃)
    {
      this.a = ☃.n("hr");
      this.b = ☃.n("sc");
      this.c = ☃.n("hps");
      this.d = ☃.f("Num");
    }
    
    public a(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      this.m = ☃;
      this.l = ☃;
      this.a = (☃.nextInt(3) == 0);
      this.b = ((!this.a) && (☃.nextInt(23) == 0));
      if ((this.m == cq.c) || (this.m == cq.d)) {
        this.d = (☃.e() / 5);
      } else {
        this.d = (☃.c() / 5);
      }
    }
    
    public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
    {
      aqe ☃ = new aqe(☃, ☃, ☃, ☃, ☃ + 2, ☃);
      
      int ☃ = ☃.nextInt(3) + 2;
      while (☃ > 0)
      {
        int ☃ = ☃ * 5;
        switch (aqg.1.a[☃.ordinal()])
        {
        case 1: 
          ☃.d = (☃ + 2);
          ☃.c = (☃ - (☃ - 1));
          break;
        case 2: 
          ☃.d = (☃ + 2);
          ☃.f = (☃ + (☃ - 1));
          break;
        case 3: 
          ☃.a = (☃ - (☃ - 1));
          ☃.f = (☃ + 2);
          break;
        case 4: 
          ☃.d = (☃ + (☃ - 1));
          ☃.f = (☃ + 2);
        }
        if (aqt.a(☃, ☃) == null) {
          break;
        }
        ☃--;
      }
      if (☃ > 0) {
        return ☃;
      }
      return null;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      int ☃ = d();
      int ☃ = ☃.nextInt(4);
      if (this.m != null) {
        switch (aqg.1.a[this.m.ordinal()])
        {
        case 1: 
          if (☃ <= 1) {
            aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, this.m, ☃);
          } else if (☃ == 2) {
            aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, cq.e, ☃);
          } else {
            aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, cq.f, ☃);
          }
          break;
        case 2: 
          if (☃ <= 1) {
            aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, this.m, ☃);
          } else if (☃ == 2) {
            aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.f - 3, cq.e, ☃);
          } else {
            aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.f - 3, cq.f, ☃);
          }
          break;
        case 3: 
          if (☃ <= 1) {
            aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, this.m, ☃);
          } else if (☃ == 2) {
            aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, cq.c, ☃);
          } else {
            aqg.a(☃, ☃, ☃, this.l.a, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, cq.d, ☃);
          }
          break;
        case 4: 
          if (☃ <= 1) {
            aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b - 1 + ☃.nextInt(3), this.l.c, this.m, ☃);
          } else if (☃ == 2) {
            aqg.a(☃, ☃, ☃, this.l.d - 3, this.l.b - 1 + ☃.nextInt(3), this.l.c - 1, cq.c, ☃);
          } else {
            aqg.a(☃, ☃, ☃, this.l.d - 3, this.l.b - 1 + ☃.nextInt(3), this.l.f + 1, cq.d, ☃);
          }
          break;
        }
      }
      if (☃ < 8) {
        if ((this.m == cq.c) || (this.m == cq.d)) {
          for (int ☃ = this.l.c + 3; ☃ + 3 <= this.l.f; ☃ += 5)
          {
            int ☃ = ☃.nextInt(5);
            if (☃ == 0) {
              aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, ☃, cq.e, ☃ + 1);
            } else if (☃ == 1) {
              aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, ☃, cq.f, ☃ + 1);
            }
          }
        } else {
          for (int ☃ = this.l.a + 3; ☃ + 3 <= this.l.d; ☃ += 5)
          {
            int ☃ = ☃.nextInt(5);
            if (☃ == 0) {
              aqg.a(☃, ☃, ☃, ☃, this.l.b, this.l.c - 1, cq.c, ☃ + 1);
            } else if (☃ == 1) {
              aqg.a(☃, ☃, ☃, ☃, this.l.b, this.l.f + 1, cq.d, ☃ + 1);
            }
          }
        }
      }
    }
    
    protected boolean a(adm ☃, aqe ☃, Random ☃, int ☃, int ☃, int ☃, List<ob> ☃, int ☃)
    {
      cj ☃ = new cj(a(☃, ☃), d(☃), b(☃, ☃));
      if ((☃.b(☃)) && 
        (☃.p(☃).c().t() == arm.a))
      {
        int ☃ = ☃.nextBoolean() ? 1 : 0;
        ☃.a(☃, afi.av.a(a(afi.av, ☃)), 2);
        vb ☃ = new vb(☃, ☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F);
        ob.a(☃, ☃, ☃, ☃);
        ☃.d(☃);
        return true;
      }
      return false;
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      int ☃ = 0;
      int ☃ = 2;
      int ☃ = 0;
      int ☃ = 2;
      int ☃ = this.d * 5 - 1;
      
      a(☃, ☃, 0, 0, 0, 2, 1, ☃, afi.a.Q(), afi.a.Q(), false);
      a(☃, ☃, ☃, 0.8F, 0, 2, 0, 2, 2, ☃, afi.a.Q(), afi.a.Q(), false);
      if (this.b) {
        a(☃, ☃, ☃, 0.6F, 0, 0, 0, 2, 1, ☃, afi.G.Q(), afi.a.Q(), false);
      }
      for (int ☃ = 0; ☃ < this.d; ☃++)
      {
        int ☃ = 2 + ☃ * 5;
        
        a(☃, ☃, 0, 0, ☃, 0, 1, ☃, afi.aO.Q(), afi.a.Q(), false);
        a(☃, ☃, 2, 0, ☃, 2, 1, ☃, afi.aO.Q(), afi.a.Q(), false);
        if (☃.nextInt(4) == 0)
        {
          a(☃, ☃, 0, 2, ☃, 0, 2, ☃, afi.f.Q(), afi.a.Q(), false);
          a(☃, ☃, 2, 2, ☃, 2, 2, ☃, afi.f.Q(), afi.a.Q(), false);
        }
        else
        {
          a(☃, ☃, 0, 2, ☃, 2, 2, ☃, afi.f.Q(), afi.a.Q(), false);
        }
        a(☃, ☃, ☃, 0.1F, 0, 2, ☃ - 1, afi.G.Q());
        a(☃, ☃, ☃, 0.1F, 2, 2, ☃ - 1, afi.G.Q());
        a(☃, ☃, ☃, 0.1F, 0, 2, ☃ + 1, afi.G.Q());
        a(☃, ☃, ☃, 0.1F, 2, 2, ☃ + 1, afi.G.Q());
        a(☃, ☃, ☃, 0.05F, 0, 2, ☃ - 2, afi.G.Q());
        a(☃, ☃, ☃, 0.05F, 2, 2, ☃ - 2, afi.G.Q());
        a(☃, ☃, ☃, 0.05F, 0, 2, ☃ + 2, afi.G.Q());
        a(☃, ☃, ☃, 0.05F, 2, 2, ☃ + 2, afi.G.Q());
        
        a(☃, ☃, ☃, 0.05F, 1, 2, ☃ - 1, afi.aa.a(cq.b.a()));
        a(☃, ☃, ☃, 0.05F, 1, 2, ☃ + 1, afi.aa.a(cq.b.a()));
        if (☃.nextInt(100) == 0) {
          a(☃, ☃, ☃, 2, 0, ☃ - 1, ob.a(aqg.b(), new ob[] { zy.cd.b(☃) }), 3 + ☃.nextInt(4));
        }
        if (☃.nextInt(100) == 0) {
          a(☃, ☃, ☃, 0, 0, ☃ + 1, ob.a(aqg.b(), new ob[] { zy.cd.b(☃) }), 3 + ☃.nextInt(4));
        }
        if ((this.b) && (!this.c))
        {
          int ☃ = d(0);int ☃ = ☃ - 1 + ☃.nextInt(3);
          int ☃ = a(1, ☃);
          ☃ = b(1, ☃);
          cj ☃ = new cj(☃, ☃, ☃);
          if (☃.b(☃))
          {
            this.c = true;
            ☃.a(☃, afi.ac.Q(), 2);
            
            akw ☃ = ☃.s(☃);
            if ((☃ instanceof all)) {
              ((all)☃).b().a("CaveSpider");
            }
          }
        }
      }
      for (int ☃ = 0; ☃ <= 2; ☃++) {
        for (int ☃ = 0; ☃ <= ☃; ☃++)
        {
          int ☃ = -1;
          alz ☃ = a(☃, ☃, ☃, ☃, ☃);
          if (☃.c().t() == arm.a)
          {
            int ☃ = -1;
            a(☃, afi.f.Q(), ☃, ☃, ☃, ☃);
          }
        }
      }
      if (this.a) {
        for (int ☃ = 0; ☃ <= ☃; ☃++)
        {
          alz ☃ = a(☃, 1, -1, ☃, ☃);
          if ((☃.c().t() != arm.a) && (☃.c().o())) {
            a(☃, ☃, ☃, 0.7F, 1, 0, ☃, afi.av.a(a(afi.av, 0)));
          }
        }
      }
      return true;
    }
  }
  
  public static class b
    extends aqt
  {
    private cq a;
    private boolean b;
    
    public b() {}
    
    protected void a(dn ☃)
    {
      ☃.a("tf", this.b);
      ☃.a("D", this.a.b());
    }
    
    protected void b(dn ☃)
    {
      this.b = ☃.n("tf");
      this.a = cq.b(☃.f("D"));
    }
    
    public b(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      
      this.a = ☃;
      this.l = ☃;
      this.b = (☃.d() > 3);
    }
    
    public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
    {
      aqe ☃ = new aqe(☃, ☃, ☃, ☃, ☃ + 2, ☃);
      if (☃.nextInt(4) == 0) {
        ☃.e += 4;
      }
      switch (aqg.1.a[☃.ordinal()])
      {
      case 1: 
        ☃.a = (☃ - 1);
        ☃.d = (☃ + 3);
        ☃.c = (☃ - 4);
        break;
      case 2: 
        ☃.a = (☃ - 1);
        ☃.d = (☃ + 3);
        ☃.f = (☃ + 4);
        break;
      case 3: 
        ☃.a = (☃ - 4);
        ☃.c = (☃ - 1);
        ☃.f = (☃ + 3);
        break;
      case 4: 
        ☃.d = (☃ + 4);
        ☃.c = (☃ - 1);
        ☃.f = (☃ + 3);
      }
      if (aqt.a(☃, ☃) != null) {
        return null;
      }
      return ☃;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      int ☃ = d();
      switch (aqg.1.a[this.a.ordinal()])
      {
      case 1: 
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
        aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
        aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
        break;
      case 2: 
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
        aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
        aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
        break;
      case 3: 
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
        aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c + 1, cq.e, ☃);
        break;
      case 4: 
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.c - 1, cq.c, ☃);
        aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b, this.l.f + 1, cq.d, ☃);
        aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c + 1, cq.f, ☃);
      }
      if (this.b)
      {
        if (☃.nextBoolean()) {
          aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b + 3 + 1, this.l.c - 1, cq.c, ☃);
        }
        if (☃.nextBoolean()) {
          aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b + 3 + 1, this.l.c + 1, cq.e, ☃);
        }
        if (☃.nextBoolean()) {
          aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b + 3 + 1, this.l.c + 1, cq.f, ☃);
        }
        if (☃.nextBoolean()) {
          aqg.a(☃, ☃, ☃, this.l.a + 1, this.l.b + 3 + 1, this.l.f + 1, cq.d, ☃);
        }
      }
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      if (this.b)
      {
        a(☃, ☃, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.b + 3 - 1, this.l.f, afi.a.Q(), afi.a.Q(), false);
        a(☃, ☃, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.b + 3 - 1, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
        a(☃, ☃, this.l.a + 1, this.l.e - 2, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
        a(☃, ☃, this.l.a, this.l.e - 2, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
        a(☃, ☃, this.l.a + 1, this.l.b + 3, this.l.c + 1, this.l.d - 1, this.l.b + 3, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
      }
      else
      {
        a(☃, ☃, this.l.a + 1, this.l.b, this.l.c, this.l.d - 1, this.l.e, this.l.f, afi.a.Q(), afi.a.Q(), false);
        a(☃, ☃, this.l.a, this.l.b, this.l.c + 1, this.l.d, this.l.e, this.l.f - 1, afi.a.Q(), afi.a.Q(), false);
      }
      a(☃, ☃, this.l.a + 1, this.l.b, this.l.c + 1, this.l.a + 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.a + 1, this.l.b, this.l.f - 1, this.l.a + 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.d - 1, this.l.b, this.l.c + 1, this.l.d - 1, this.l.e, this.l.c + 1, afi.f.Q(), afi.a.Q(), false);
      a(☃, ☃, this.l.d - 1, this.l.b, this.l.f - 1, this.l.d - 1, this.l.e, this.l.f - 1, afi.f.Q(), afi.a.Q(), false);
      for (int ☃ = this.l.a; ☃ <= this.l.d; ☃++) {
        for (int ☃ = this.l.c; ☃ <= this.l.f; ☃++) {
          if (a(☃, ☃, this.l.b - 1, ☃, ☃).c().t() == arm.a) {
            a(☃, afi.f.Q(), ☃, this.l.b - 1, ☃, ☃);
          }
        }
      }
      return true;
    }
  }
  
  public static class d
    extends aqt
  {
    public d() {}
    
    public d(int ☃, Random ☃, aqe ☃, cq ☃)
    {
      super();
      this.m = ☃;
      this.l = ☃;
    }
    
    protected void a(dn ☃) {}
    
    protected void b(dn ☃) {}
    
    public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
    {
      aqe ☃ = new aqe(☃, ☃ - 5, ☃, ☃, ☃ + 2, ☃);
      switch (aqg.1.a[☃.ordinal()])
      {
      case 1: 
        ☃.d = (☃ + 2);
        ☃.c = (☃ - 8);
        break;
      case 2: 
        ☃.d = (☃ + 2);
        ☃.f = (☃ + 8);
        break;
      case 3: 
        ☃.a = (☃ - 8);
        ☃.f = (☃ + 2);
        break;
      case 4: 
        ☃.d = (☃ + 8);
        ☃.f = (☃ + 2);
      }
      if (aqt.a(☃, ☃) != null) {
        return null;
      }
      return ☃;
    }
    
    public void a(aqt ☃, List<aqt> ☃, Random ☃)
    {
      int ☃ = d();
      if (this.m != null) {
        switch (aqg.1.a[this.m.ordinal()])
        {
        case 1: 
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b, this.l.c - 1, cq.c, ☃);
          break;
        case 2: 
          aqg.a(☃, ☃, ☃, this.l.a, this.l.b, this.l.f + 1, cq.d, ☃);
          break;
        case 3: 
          aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b, this.l.c, cq.e, ☃);
          break;
        case 4: 
          aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b, this.l.c, cq.f, ☃);
        }
      }
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (a(☃, ☃)) {
        return false;
      }
      a(☃, ☃, 0, 5, 0, 2, 7, 1, afi.a.Q(), afi.a.Q(), false);
      
      a(☃, ☃, 0, 0, 7, 2, 2, 8, afi.a.Q(), afi.a.Q(), false);
      for (int ☃ = 0; ☃ < 5; ☃++) {
        a(☃, ☃, 0, 5 - ☃ - (☃ < 4 ? 1 : 0), 2 + ☃, 2, 7 - ☃, 2 + ☃, afi.a.Q(), afi.a.Q(), false);
      }
      return true;
    }
  }
  
  private static final List<ob> a = Lists.newArrayList(new ob[] { new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 1, 3, 5), new ob(zy.aC, 0, 4, 9, 5), new ob(zy.aW, zd.l.b(), 4, 9, 5), new ob(zy.i, 0, 1, 2, 3), new ob(zy.h, 0, 3, 8, 10), new ob(zy.P, 0, 1, 3, 15), new ob(zy.b, 0, 1, 1, 1), new ob(zw.a(afi.av), 0, 4, 8, 1), new ob(zy.bh, 0, 2, 4, 10), new ob(zy.bg, 0, 2, 4, 10), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1) });
}
