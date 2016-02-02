import java.util.List;
import java.util.Random;

public class aqp$g
  extends aqp.p
{
  private boolean a;
  
  public aqp$g() {}
  
  public aqp$g(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Mob", this.a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = ☃.n("Mob");
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    if (☃ != null) {
      ((aqp.m)☃).b = this;
    }
  }
  
  public static g a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -4, -1, 0, 11, 8, 16, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new g(☃, ☃, ☃, ☃);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, 0, 0, 10, 7, 15, false, ☃, aqp.c());
    
    a(☃, ☃, ☃, aqp.p.a.c, 4, 1, 0);
    
    int ☃ = 6;
    a(☃, ☃, 1, ☃, 1, 1, ☃, 14, false, ☃, aqp.c());
    a(☃, ☃, 9, ☃, 1, 9, ☃, 14, false, ☃, aqp.c());
    a(☃, ☃, 2, ☃, 1, 8, ☃, 2, false, ☃, aqp.c());
    a(☃, ☃, 2, ☃, 14, 8, ☃, 14, false, ☃, aqp.c());
    
    a(☃, ☃, 1, 1, 1, 2, 1, 4, false, ☃, aqp.c());
    a(☃, ☃, 8, 1, 1, 9, 1, 4, false, ☃, aqp.c());
    a(☃, ☃, 1, 1, 1, 1, 1, 3, afi.k.Q(), afi.k.Q(), false);
    a(☃, ☃, 9, 1, 1, 9, 1, 3, afi.k.Q(), afi.k.Q(), false);
    
    a(☃, ☃, 3, 1, 8, 7, 1, 12, false, ☃, aqp.c());
    a(☃, ☃, 4, 1, 9, 6, 1, 11, afi.k.Q(), afi.k.Q(), false);
    for (int ☃ = 3; ☃ < 14; ☃ += 2)
    {
      a(☃, ☃, 0, 3, ☃, 0, 4, ☃, afi.bi.Q(), afi.bi.Q(), false);
      a(☃, ☃, 10, 3, ☃, 10, 4, ☃, afi.bi.Q(), afi.bi.Q(), false);
    }
    for (int ☃ = 2; ☃ < 9; ☃ += 2) {
      a(☃, ☃, ☃, 3, 15, ☃, 4, 15, afi.bi.Q(), afi.bi.Q(), false);
    }
    int ☃ = a(afi.bv, 3);
    a(☃, ☃, 4, 1, 5, 6, 1, 7, false, ☃, aqp.c());
    a(☃, ☃, 4, 2, 6, 6, 2, 7, false, ☃, aqp.c());
    a(☃, ☃, 4, 3, 7, 6, 3, 7, false, ☃, aqp.c());
    for (int ☃ = 4; ☃ <= 6; ☃++)
    {
      a(☃, afi.bv.a(☃), ☃, 1, 4, ☃);
      a(☃, afi.bv.a(☃), ☃, 2, 5, ☃);
      a(☃, afi.bv.a(☃), ☃, 3, 6, ☃);
    }
    int ☃ = cq.c.b();
    int ☃ = cq.d.b();
    int ☃ = cq.f.b();
    int ☃ = cq.e.b();
    if (this.m != null) {
      switch (aqp.3.b[this.m.ordinal()])
      {
      case 2: 
        ☃ = cq.d.b();
        ☃ = cq.c.b();
        break;
      case 4: 
        ☃ = cq.f.b();
        ☃ = cq.e.b();
        ☃ = cq.d.b();
        ☃ = cq.c.b();
        break;
      case 3: 
        ☃ = cq.e.b();
        ☃ = cq.f.b();
        ☃ = cq.d.b();
        ☃ = cq.c.b();
      }
    }
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 4, 3, 8, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 5, 3, 8, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 6, 3, 8, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 4, 3, 12, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 5, 3, 12, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 6, 3, 12, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 9, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 10, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 3, 3, 11, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 9, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 10, ☃);
    a(☃, afi.bG.a(☃).a(ago.b, Boolean.valueOf(☃.nextFloat() > 0.9F)), 7, 3, 11, ☃);
    if (!this.a)
    {
      ☃ = d(3);
      cj ☃ = new cj(a(5, 6), ☃, b(5, 6));
      if (☃.b(☃))
      {
        this.a = true;
        ☃.a(☃, afi.ac.Q(), 2);
        
        akw ☃ = ☃.s(☃);
        if ((☃ instanceof all)) {
          ((all)☃).b().a("Silverfish");
        }
      }
    }
    return true;
  }
}
