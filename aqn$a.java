import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqn$a
  extends aqn.c
{
  private boolean[] e = new boolean[4];
  private static final List<ob> f = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
  
  public aqn$a() {}
  
  public aqn$a(Random ☃, int ☃, int ☃)
  {
    super(☃, ☃, 64, ☃, 21, 15, 21);
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("hasPlacedChest0", this.e[0]);
    ☃.a("hasPlacedChest1", this.e[1]);
    ☃.a("hasPlacedChest2", this.e[2]);
    ☃.a("hasPlacedChest3", this.e[3]);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.e[0] = ☃.n("hasPlacedChest0");
    this.e[1] = ☃.n("hasPlacedChest1");
    this.e[2] = ☃.n("hasPlacedChest2");
    this.e[3] = ☃.n("hasPlacedChest3");
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    a(☃, ☃, 0, -4, 0, this.a - 1, 0, this.c - 1, afi.A.Q(), afi.A.Q(), false);
    for (int ☃ = 1; ☃ <= 9; ☃++)
    {
      a(☃, ☃, ☃, ☃, ☃, this.a - 1 - ☃, ☃, this.c - 1 - ☃, afi.A.Q(), afi.A.Q(), false);
      a(☃, ☃, ☃ + 1, ☃, ☃ + 1, this.a - 2 - ☃, ☃, this.c - 2 - ☃, afi.a.Q(), afi.a.Q(), false);
    }
    for (int ☃ = 0; ☃ < this.a; ☃++) {
      for (int ☃ = 0; ☃ < this.c; ☃++)
      {
        int ☃ = -5;
        b(☃, afi.A.Q(), ☃, ☃, ☃, ☃);
      }
    }
    int ☃ = a(afi.bO, 3);
    int ☃ = a(afi.bO, 2);
    int ☃ = a(afi.bO, 0);
    int ☃ = a(afi.bO, 1);
    int ☃ = (zd.b.b() ^ 0xFFFFFFFF) & 0xF;
    int ☃ = (zd.l.b() ^ 0xFFFFFFFF) & 0xF;
    
    a(☃, ☃, 0, 0, 0, 4, 9, 4, afi.A.Q(), afi.a.Q(), false);
    a(☃, ☃, 1, 10, 1, 3, 10, 3, afi.A.Q(), afi.A.Q(), false);
    a(☃, afi.bO.a(☃), 2, 10, 0, ☃);
    a(☃, afi.bO.a(☃), 2, 10, 4, ☃);
    a(☃, afi.bO.a(☃), 0, 10, 2, ☃);
    a(☃, afi.bO.a(☃), 4, 10, 2, ☃);
    a(☃, ☃, this.a - 5, 0, 0, this.a - 1, 9, 4, afi.A.Q(), afi.a.Q(), false);
    a(☃, ☃, this.a - 4, 10, 1, this.a - 2, 10, 3, afi.A.Q(), afi.A.Q(), false);
    a(☃, afi.bO.a(☃), this.a - 3, 10, 0, ☃);
    a(☃, afi.bO.a(☃), this.a - 3, 10, 4, ☃);
    a(☃, afi.bO.a(☃), this.a - 5, 10, 2, ☃);
    a(☃, afi.bO.a(☃), this.a - 1, 10, 2, ☃);
    
    a(☃, ☃, 8, 0, 0, 12, 4, 4, afi.A.Q(), afi.a.Q(), false);
    a(☃, ☃, 9, 1, 0, 11, 3, 4, afi.a.Q(), afi.a.Q(), false);
    a(☃, afi.A.a(aji.a.c.a()), 9, 1, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 9, 2, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 9, 3, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 10, 3, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 11, 3, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 11, 2, 1, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 11, 1, 1, ☃);
    
    a(☃, ☃, 4, 1, 1, 8, 3, 3, afi.A.Q(), afi.a.Q(), false);
    a(☃, ☃, 4, 1, 2, 8, 2, 2, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 12, 1, 1, 16, 3, 3, afi.A.Q(), afi.a.Q(), false);
    a(☃, ☃, 12, 1, 2, 16, 2, 2, afi.a.Q(), afi.a.Q(), false);
    
    a(☃, ☃, 5, 4, 5, this.a - 6, 4, this.c - 6, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, 9, 4, 9, 11, 4, 11, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, 8, 1, 8, 8, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, 12, 1, 8, 12, 3, 8, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, 8, 1, 12, 8, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, 12, 1, 12, 12, 3, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    
    a(☃, ☃, 1, 1, 5, 4, 4, 11, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, this.a - 5, 1, 5, this.a - 2, 4, 11, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, 6, 7, 9, 6, 7, 11, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, this.a - 7, 7, 9, this.a - 7, 7, 11, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, 5, 5, 9, 5, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, this.a - 6, 5, 9, this.a - 6, 7, 11, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, afi.a.Q(), 5, 5, 10, ☃);
    a(☃, afi.a.Q(), 5, 6, 10, ☃);
    a(☃, afi.a.Q(), 6, 6, 10, ☃);
    a(☃, afi.a.Q(), this.a - 6, 5, 10, ☃);
    a(☃, afi.a.Q(), this.a - 6, 6, 10, ☃);
    a(☃, afi.a.Q(), this.a - 7, 6, 10, ☃);
    
    a(☃, ☃, 2, 4, 4, 2, 6, 4, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, this.a - 3, 4, 4, this.a - 3, 6, 4, afi.a.Q(), afi.a.Q(), false);
    a(☃, afi.bO.a(☃), 2, 4, 5, ☃);
    a(☃, afi.bO.a(☃), 2, 3, 4, ☃);
    a(☃, afi.bO.a(☃), this.a - 3, 4, 5, ☃);
    a(☃, afi.bO.a(☃), this.a - 3, 3, 4, ☃);
    a(☃, ☃, 1, 1, 3, 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, this.a - 3, 1, 3, this.a - 2, 2, 3, afi.A.Q(), afi.A.Q(), false);
    a(☃, afi.bO.Q(), 1, 1, 2, ☃);
    a(☃, afi.bO.Q(), this.a - 2, 1, 2, ☃);
    a(☃, afi.U.a(akb.a.b.a()), 1, 2, 2, ☃);
    a(☃, afi.U.a(akb.a.b.a()), this.a - 2, 2, 2, ☃);
    a(☃, afi.bO.a(☃), 2, 1, 2, ☃);
    a(☃, afi.bO.a(☃), this.a - 3, 1, 2, ☃);
    
    a(☃, ☃, 4, 3, 5, 4, 3, 18, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, this.a - 5, 3, 5, this.a - 5, 3, 17, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, 3, 1, 5, 4, 2, 16, afi.a.Q(), afi.a.Q(), false);
    a(☃, ☃, this.a - 6, 1, 5, this.a - 5, 2, 16, afi.a.Q(), afi.a.Q(), false);
    for (int ☃ = 5; ☃ <= 17; ☃ += 2)
    {
      a(☃, afi.A.a(aji.a.c.a()), 4, 1, ☃, ☃);
      a(☃, afi.A.a(aji.a.b.a()), 4, 2, ☃, ☃);
      a(☃, afi.A.a(aji.a.c.a()), this.a - 5, 1, ☃, ☃);
      a(☃, afi.A.a(aji.a.b.a()), this.a - 5, 2, ☃, ☃);
    }
    a(☃, afi.cu.a(☃), 10, 0, 7, ☃);
    a(☃, afi.cu.a(☃), 10, 0, 8, ☃);
    a(☃, afi.cu.a(☃), 9, 0, 9, ☃);
    a(☃, afi.cu.a(☃), 11, 0, 9, ☃);
    a(☃, afi.cu.a(☃), 8, 0, 10, ☃);
    a(☃, afi.cu.a(☃), 12, 0, 10, ☃);
    a(☃, afi.cu.a(☃), 7, 0, 10, ☃);
    a(☃, afi.cu.a(☃), 13, 0, 10, ☃);
    a(☃, afi.cu.a(☃), 9, 0, 11, ☃);
    a(☃, afi.cu.a(☃), 11, 0, 11, ☃);
    a(☃, afi.cu.a(☃), 10, 0, 12, ☃);
    a(☃, afi.cu.a(☃), 10, 0, 13, ☃);
    a(☃, afi.cu.a(☃), 10, 0, 10, ☃);
    for (int ☃ = 0; ☃ <= this.a - 1; ☃ += this.a - 1)
    {
      a(☃, afi.A.a(aji.a.c.a()), ☃, 2, 1, ☃);
      a(☃, afi.cu.a(☃), ☃, 2, 2, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 2, 3, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 3, 1, ☃);
      a(☃, afi.cu.a(☃), ☃, 3, 2, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 3, 3, ☃);
      a(☃, afi.cu.a(☃), ☃, 4, 1, ☃);
      a(☃, afi.A.a(aji.a.b.a()), ☃, 4, 2, ☃);
      a(☃, afi.cu.a(☃), ☃, 4, 3, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 5, 1, ☃);
      a(☃, afi.cu.a(☃), ☃, 5, 2, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 5, 3, ☃);
      a(☃, afi.cu.a(☃), ☃, 6, 1, ☃);
      a(☃, afi.A.a(aji.a.b.a()), ☃, 6, 2, ☃);
      a(☃, afi.cu.a(☃), ☃, 6, 3, ☃);
      a(☃, afi.cu.a(☃), ☃, 7, 1, ☃);
      a(☃, afi.cu.a(☃), ☃, 7, 2, ☃);
      a(☃, afi.cu.a(☃), ☃, 7, 3, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 8, 1, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 8, 2, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 8, 3, ☃);
    }
    for (int ☃ = 2; ☃ <= this.a - 3; ☃ += this.a - 3 - 2)
    {
      a(☃, afi.A.a(aji.a.c.a()), ☃ - 1, 2, 0, ☃);
      a(☃, afi.cu.a(☃), ☃, 2, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ + 1, 2, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ - 1, 3, 0, ☃);
      a(☃, afi.cu.a(☃), ☃, 3, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ + 1, 3, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ - 1, 4, 0, ☃);
      a(☃, afi.A.a(aji.a.b.a()), ☃, 4, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ + 1, 4, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ - 1, 5, 0, ☃);
      a(☃, afi.cu.a(☃), ☃, 5, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ + 1, 5, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ - 1, 6, 0, ☃);
      a(☃, afi.A.a(aji.a.b.a()), ☃, 6, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ + 1, 6, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ - 1, 7, 0, ☃);
      a(☃, afi.cu.a(☃), ☃, 7, 0, ☃);
      a(☃, afi.cu.a(☃), ☃ + 1, 7, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ - 1, 8, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃, 8, 0, ☃);
      a(☃, afi.A.a(aji.a.c.a()), ☃ + 1, 8, 0, ☃);
    }
    a(☃, ☃, 8, 4, 0, 12, 6, 0, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, afi.a.Q(), 8, 6, 0, ☃);
    a(☃, afi.a.Q(), 12, 6, 0, ☃);
    a(☃, afi.cu.a(☃), 9, 5, 0, ☃);
    a(☃, afi.A.a(aji.a.b.a()), 10, 5, 0, ☃);
    a(☃, afi.cu.a(☃), 11, 5, 0, ☃);
    
    a(☃, ☃, 8, -14, 8, 12, -11, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, 8, -10, 8, 12, -10, 12, afi.A.a(aji.a.b.a()), afi.A.a(aji.a.b.a()), false);
    a(☃, ☃, 8, -9, 8, 12, -9, 12, afi.A.a(aji.a.c.a()), afi.A.a(aji.a.c.a()), false);
    a(☃, ☃, 8, -8, 8, 12, -1, 12, afi.A.Q(), afi.A.Q(), false);
    a(☃, ☃, 9, -11, 9, 11, -1, 11, afi.a.Q(), afi.a.Q(), false);
    a(☃, afi.az.Q(), 10, -11, 10, ☃);
    a(☃, ☃, 9, -13, 9, 11, -13, 11, afi.W.Q(), afi.a.Q(), false);
    a(☃, afi.a.Q(), 8, -11, 10, ☃);
    a(☃, afi.a.Q(), 8, -10, 10, ☃);
    a(☃, afi.A.a(aji.a.b.a()), 7, -10, 10, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 7, -11, 10, ☃);
    a(☃, afi.a.Q(), 12, -11, 10, ☃);
    a(☃, afi.a.Q(), 12, -10, 10, ☃);
    a(☃, afi.A.a(aji.a.b.a()), 13, -10, 10, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 13, -11, 10, ☃);
    a(☃, afi.a.Q(), 10, -11, 8, ☃);
    a(☃, afi.a.Q(), 10, -10, 8, ☃);
    a(☃, afi.A.a(aji.a.b.a()), 10, -10, 7, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 10, -11, 7, ☃);
    a(☃, afi.a.Q(), 10, -11, 12, ☃);
    a(☃, afi.a.Q(), 10, -10, 12, ☃);
    a(☃, afi.A.a(aji.a.b.a()), 10, -10, 13, ☃);
    a(☃, afi.A.a(aji.a.c.a()), 10, -11, 13, ☃);
    for (cq ☃ : cq.c.a) {
      if (this.e[☃.b()] == 0)
      {
        int ☃ = ☃.g() * 2;
        int ☃ = ☃.i() * 2;
        this.e[☃.b()] = a(☃, ☃, ☃, 10 + ☃, -11, 10 + ☃, ob.a(f, new ob[] { zy.cd.b(☃) }), 2 + ☃.nextInt(5));
      }
    }
    return true;
  }
}
