import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqn$b
  extends aqn.c
{
  private boolean e;
  private boolean f;
  private boolean g;
  private boolean h;
  private static final List<ob> i = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
  private static final List<ob> j = Lists.newArrayList(new ob[] { new ob(zy.g, 0, 2, 7, 30) });
  
  public aqn$b() {}
  
  public aqn$b(Random ☃, int ☃, int ☃)
  {
    super(☃, ☃, 64, ☃, 12, 10, 15);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("placedMainChest", this.e);
    ☃.a("placedHiddenChest", this.f);
    ☃.a("placedTrap1", this.g);
    ☃.a("placedTrap2", this.h);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.e = ☃.n("placedMainChest");
    this.f = ☃.n("placedHiddenChest");
    this.g = ☃.n("placedTrap1");
    this.h = ☃.n("placedTrap2");
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (!a(☃, ☃, 0)) {
      return false;
    }
    int ☃ = a(afi.aw, 3);
    int ☃ = a(afi.aw, 2);
    int ☃ = a(afi.aw, 0);
    int ☃ = a(afi.aw, 1);
    
    a(☃, ☃, 0, -4, 0, this.a - 1, 0, this.c - 1, false, ☃, k);
    
    a(☃, ☃, 2, 1, 2, 9, 2, 2, false, ☃, k);
    a(☃, ☃, 2, 1, 12, 9, 2, 12, false, ☃, k);
    a(☃, ☃, 2, 1, 3, 2, 2, 11, false, ☃, k);
    a(☃, ☃, 9, 1, 3, 9, 2, 11, false, ☃, k);
    
    a(☃, ☃, 1, 3, 1, 10, 6, 1, false, ☃, k);
    a(☃, ☃, 1, 3, 13, 10, 6, 13, false, ☃, k);
    a(☃, ☃, 1, 3, 2, 1, 6, 12, false, ☃, k);
    a(☃, ☃, 10, 3, 2, 10, 6, 12, false, ☃, k);
    
    a(☃, ☃, 2, 3, 2, 9, 3, 12, false, ☃, k);
    a(☃, ☃, 2, 6, 2, 9, 6, 12, false, ☃, k);
    a(☃, ☃, 3, 7, 3, 8, 7, 11, false, ☃, k);
    a(☃, ☃, 4, 8, 4, 7, 8, 10, false, ☃, k);
    
    a(☃, ☃, 3, 1, 3, 8, 2, 11);
    a(☃, ☃, 4, 3, 6, 7, 3, 9);
    a(☃, ☃, 2, 4, 2, 9, 5, 12);
    a(☃, ☃, 4, 6, 5, 7, 6, 9);
    a(☃, ☃, 5, 7, 6, 6, 7, 8);
    
    a(☃, ☃, 5, 1, 2, 6, 2, 2);
    a(☃, ☃, 5, 2, 12, 6, 2, 12);
    a(☃, ☃, 5, 5, 1, 6, 5, 1);
    a(☃, ☃, 5, 5, 13, 6, 5, 13);
    a(☃, afi.a.Q(), 1, 5, 5, ☃);
    a(☃, afi.a.Q(), 10, 5, 5, ☃);
    a(☃, afi.a.Q(), 1, 5, 9, ☃);
    a(☃, afi.a.Q(), 10, 5, 9, ☃);
    for (int ☃ = 0; ☃ <= 14; ☃ += 14)
    {
      a(☃, ☃, 2, 4, ☃, 2, 5, ☃, false, ☃, k);
      a(☃, ☃, 4, 4, ☃, 4, 5, ☃, false, ☃, k);
      a(☃, ☃, 7, 4, ☃, 7, 5, ☃, false, ☃, k);
      a(☃, ☃, 9, 4, ☃, 9, 5, ☃, false, ☃, k);
    }
    a(☃, ☃, 5, 6, 0, 6, 6, 0, false, ☃, k);
    for (int ☃ = 0; ☃ <= 11; ☃ += 11)
    {
      for (int ☃ = 2; ☃ <= 12; ☃ += 2) {
        a(☃, ☃, ☃, 4, ☃, ☃, 5, ☃, false, ☃, k);
      }
      a(☃, ☃, ☃, 6, 5, ☃, 6, 5, false, ☃, k);
      a(☃, ☃, ☃, 6, 9, ☃, 6, 9, false, ☃, k);
    }
    a(☃, ☃, 2, 7, 2, 2, 9, 2, false, ☃, k);
    a(☃, ☃, 9, 7, 2, 9, 9, 2, false, ☃, k);
    a(☃, ☃, 2, 7, 12, 2, 9, 12, false, ☃, k);
    a(☃, ☃, 9, 7, 12, 9, 9, 12, false, ☃, k);
    a(☃, ☃, 4, 9, 4, 4, 9, 4, false, ☃, k);
    a(☃, ☃, 7, 9, 4, 7, 9, 4, false, ☃, k);
    a(☃, ☃, 4, 9, 10, 4, 9, 10, false, ☃, k);
    a(☃, ☃, 7, 9, 10, 7, 9, 10, false, ☃, k);
    a(☃, ☃, 5, 9, 7, 6, 9, 7, false, ☃, k);
    a(☃, afi.aw.a(☃), 5, 9, 6, ☃);
    a(☃, afi.aw.a(☃), 6, 9, 6, ☃);
    a(☃, afi.aw.a(☃), 5, 9, 8, ☃);
    a(☃, afi.aw.a(☃), 6, 9, 8, ☃);
    
    a(☃, afi.aw.a(☃), 4, 0, 0, ☃);
    a(☃, afi.aw.a(☃), 5, 0, 0, ☃);
    a(☃, afi.aw.a(☃), 6, 0, 0, ☃);
    a(☃, afi.aw.a(☃), 7, 0, 0, ☃);
    
    a(☃, afi.aw.a(☃), 4, 1, 8, ☃);
    a(☃, afi.aw.a(☃), 4, 2, 9, ☃);
    a(☃, afi.aw.a(☃), 4, 3, 10, ☃);
    a(☃, afi.aw.a(☃), 7, 1, 8, ☃);
    a(☃, afi.aw.a(☃), 7, 2, 9, ☃);
    a(☃, afi.aw.a(☃), 7, 3, 10, ☃);
    a(☃, ☃, 4, 1, 9, 4, 1, 9, false, ☃, k);
    a(☃, ☃, 7, 1, 9, 7, 1, 9, false, ☃, k);
    a(☃, ☃, 4, 1, 10, 7, 2, 10, false, ☃, k);
    
    a(☃, ☃, 5, 4, 5, 6, 4, 5, false, ☃, k);
    a(☃, afi.aw.a(☃), 4, 4, 5, ☃);
    a(☃, afi.aw.a(☃), 7, 4, 5, ☃);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      a(☃, afi.aw.a(☃), 5, 0 - ☃, 6 + ☃, ☃);
      a(☃, afi.aw.a(☃), 6, 0 - ☃, 6 + ☃, ☃);
      a(☃, ☃, 5, 0 - ☃, 7 + ☃, 6, 0 - ☃, 9 + ☃);
    }
    a(☃, ☃, 1, -3, 12, 10, -1, 13);
    a(☃, ☃, 1, -3, 1, 3, -1, 13);
    a(☃, ☃, 1, -3, 1, 9, -1, 5);
    for (int ☃ = 1; ☃ <= 13; ☃ += 2) {
      a(☃, ☃, 1, -3, ☃, 1, -2, ☃, false, ☃, k);
    }
    for (int ☃ = 2; ☃ <= 12; ☃ += 2) {
      a(☃, ☃, 1, -1, ☃, 3, -1, ☃, false, ☃, k);
    }
    a(☃, ☃, 2, -2, 1, 5, -2, 1, false, ☃, k);
    a(☃, ☃, 7, -2, 1, 9, -2, 1, false, ☃, k);
    a(☃, ☃, 6, -3, 1, 6, -3, 1, false, ☃, k);
    a(☃, ☃, 6, -1, 1, 6, -1, 1, false, ☃, k);
    
    a(☃, afi.bR.a(a(afi.bR, cq.f.b())).a(akj.N, Boolean.valueOf(true)), 1, -3, 8, ☃);
    a(☃, afi.bR.a(a(afi.bR, cq.e.b())).a(akj.N, Boolean.valueOf(true)), 4, -3, 8, ☃);
    a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 2, -3, 8, ☃);
    a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 3, -3, 8, ☃);
    a(☃, afi.af.Q(), 5, -3, 7, ☃);
    a(☃, afi.af.Q(), 5, -3, 6, ☃);
    a(☃, afi.af.Q(), 5, -3, 5, ☃);
    a(☃, afi.af.Q(), 5, -3, 4, ☃);
    a(☃, afi.af.Q(), 5, -3, 3, ☃);
    a(☃, afi.af.Q(), 5, -3, 2, ☃);
    a(☃, afi.af.Q(), 5, -3, 1, ☃);
    a(☃, afi.af.Q(), 4, -3, 1, ☃);
    a(☃, afi.Y.Q(), 3, -3, 1, ☃);
    if (!this.g) {
      this.g = a(☃, ☃, ☃, 3, -2, 1, cq.c.a(), j, 2);
    }
    a(☃, afi.bn.a(15), 3, -2, 2, ☃);
    
    a(☃, afi.bR.a(a(afi.bR, cq.c.b())).a(akj.N, Boolean.valueOf(true)), 7, -3, 1, ☃);
    a(☃, afi.bR.a(a(afi.bR, cq.d.b())).a(akj.N, Boolean.valueOf(true)), 7, -3, 5, ☃);
    a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 2, ☃);
    a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 3, ☃);
    a(☃, afi.bS.Q().a(aki.N, Boolean.valueOf(true)), 7, -3, 4, ☃);
    a(☃, afi.af.Q(), 8, -3, 6, ☃);
    a(☃, afi.af.Q(), 9, -3, 6, ☃);
    a(☃, afi.af.Q(), 9, -3, 5, ☃);
    a(☃, afi.Y.Q(), 9, -3, 4, ☃);
    a(☃, afi.af.Q(), 9, -2, 4, ☃);
    if (!this.h) {
      this.h = a(☃, ☃, ☃, 9, -2, 3, cq.e.a(), j, 2);
    }
    a(☃, afi.bn.a(15), 8, -1, 3, ☃);
    a(☃, afi.bn.a(15), 8, -2, 3, ☃);
    if (!this.e) {
      this.e = a(☃, ☃, ☃, 8, -3, 3, ob.a(i, new ob[] { zy.cd.b(☃) }), 2 + ☃.nextInt(5));
    }
    a(☃, afi.Y.Q(), 9, -3, 2, ☃);
    a(☃, afi.Y.Q(), 8, -3, 1, ☃);
    a(☃, afi.Y.Q(), 4, -3, 5, ☃);
    a(☃, afi.Y.Q(), 5, -2, 5, ☃);
    a(☃, afi.Y.Q(), 5, -1, 5, ☃);
    a(☃, afi.Y.Q(), 6, -3, 5, ☃);
    a(☃, afi.Y.Q(), 7, -2, 5, ☃);
    a(☃, afi.Y.Q(), 7, -1, 5, ☃);
    a(☃, afi.Y.Q(), 8, -3, 5, ☃);
    a(☃, ☃, 9, -1, 1, 9, -1, 5, false, ☃, k);
    
    a(☃, ☃, 8, -3, 8, 10, -1, 10);
    a(☃, afi.bf.a(ajz.P), 8, -2, 11, ☃);
    a(☃, afi.bf.a(ajz.P), 9, -2, 11, ☃);
    a(☃, afi.bf.a(ajz.P), 10, -2, 11, ☃);
    a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 8, -2, 12, ☃);
    a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 9, -2, 12, ☃);
    a(☃, afi.ay.a(ahu.a(cq.a(a(afi.ay, cq.c.a())))), 10, -2, 12, ☃);
    a(☃, ☃, 8, -3, 8, 8, -3, 10, false, ☃, k);
    a(☃, ☃, 10, -3, 8, 10, -3, 10, false, ☃, k);
    a(☃, afi.Y.Q(), 10, -2, 9, ☃);
    a(☃, afi.af.Q(), 8, -2, 9, ☃);
    a(☃, afi.af.Q(), 8, -2, 10, ☃);
    a(☃, afi.af.Q(), 10, -1, 9, ☃);
    a(☃, afi.F.a(cq.b.a()), 9, -2, 8, ☃);
    a(☃, afi.F.a(a(afi.F, cq.e.a())), 10, -2, 8, ☃);
    a(☃, afi.F.a(a(afi.F, cq.e.a())), 10, -1, 8, ☃);
    a(☃, afi.bb.a(a(afi.bb, cq.c.b())), 10, -2, 10, ☃);
    if (!this.f) {
      this.f = a(☃, ☃, ☃, 9, -3, 10, ob.a(i, new ob[] { zy.cd.b(☃) }), 2 + ☃.nextInt(5));
    }
    return true;
  }
  
  static class a
    extends aqt.a
  {
    public void a(Random ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      if (☃.nextFloat() < 0.4F) {
        this.a = afi.e.Q();
      } else {
        this.a = afi.Y.Q();
      }
    }
  }
  
  private static aqn.b.a k = new aqn.b.a(null);
}
