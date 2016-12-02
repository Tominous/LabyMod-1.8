import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqn
{
  public static void a()
  {
    aqr.a(aqn.a.class, "TeDP");
    aqr.a(aqn.b.class, "TeJP");
    aqr.a(aqn.d.class, "TeSH");
  }
  
  static abstract class c
    extends aqt
  {
    protected int a;
    protected int b;
    protected int c;
    protected int d = -1;
    
    public c() {}
    
    protected c(Random ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      super();
      
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
      
      this.m = cq.c.a.a(☃);
      switch (aqn.1.a[this.m.ordinal()])
      {
      case 1: 
      case 2: 
        this.l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
        break;
      default: 
        this.l = new aqe(☃, ☃, ☃, ☃ + ☃ - 1, ☃ + ☃ - 1, ☃ + ☃ - 1);
      }
    }
    
    protected void a(dn ☃)
    {
      ☃.a("Width", this.a);
      ☃.a("Height", this.b);
      ☃.a("Depth", this.c);
      ☃.a("HPos", this.d);
    }
    
    protected void b(dn ☃)
    {
      this.a = ☃.f("Width");
      this.b = ☃.f("Height");
      this.c = ☃.f("Depth");
      this.d = ☃.f("HPos");
    }
    
    protected boolean a(adm ☃, aqe ☃, int ☃)
    {
      if (this.d >= 0) {
        return true;
      }
      int ☃ = 0;
      int ☃ = 0;
      cj.a ☃ = new cj.a();
      for (int ☃ = this.l.c; ☃ <= this.l.f; ☃++) {
        for (int ☃ = this.l.a; ☃ <= this.l.d; ☃++)
        {
          ☃.c(☃, 64, ☃);
          if (☃.b(☃))
          {
            ☃ += Math.max(☃.r(☃).o(), ☃.t.i());
            ☃++;
          }
        }
      }
      if (☃ == 0) {
        return false;
      }
      this.d = (☃ / ☃);
      this.l.a(0, this.d - this.l.b + ☃, 0);
      return true;
    }
  }
  
  public static class a
    extends aqn.c
  {
    private boolean[] e = new boolean[4];
    private static final List<ob> f = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
    
    public a() {}
    
    public a(Random ☃, int ☃, int ☃)
    {
      super(☃, 64, ☃, 21, 15, 21);
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
  
  public static class b
    extends aqn.c
  {
    private boolean e;
    private boolean f;
    private boolean g;
    private boolean h;
    private static final List<ob> i = Lists.newArrayList(new ob[] { new ob(zy.i, 0, 1, 3, 3), new ob(zy.j, 0, 1, 5, 10), new ob(zy.k, 0, 2, 7, 15), new ob(zy.bO, 0, 1, 3, 2), new ob(zy.aX, 0, 4, 6, 20), new ob(zy.bt, 0, 3, 7, 16), new ob(zy.aA, 0, 1, 1, 3), new ob(zy.ck, 0, 1, 1, 1), new ob(zy.cl, 0, 1, 1, 1), new ob(zy.cm, 0, 1, 1, 1) });
    private static final List<ob> j = Lists.newArrayList(new ob[] { new ob(zy.g, 0, 2, 7, 30) });
    
    public b() {}
    
    public b(Random ☃, int ☃, int ☃)
    {
      super(☃, 64, ☃, 12, 10, 15);
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
  
  public static class d
    extends aqn.c
  {
    private boolean e;
    
    public d() {}
    
    public d(Random ☃, int ☃, int ☃)
    {
      super(☃, 64, ☃, 7, 7, 9);
    }
    
    protected void a(dn ☃)
    {
      super.a(☃);
      ☃.a("Witch", this.e);
    }
    
    protected void b(dn ☃)
    {
      super.b(☃);
      this.e = ☃.n("Witch");
    }
    
    public boolean a(adm ☃, Random ☃, aqe ☃)
    {
      if (!a(☃, ☃, 0)) {
        return false;
      }
      a(☃, ☃, 1, 1, 1, 5, 1, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      a(☃, ☃, 1, 4, 2, 5, 4, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      a(☃, ☃, 2, 1, 0, 4, 1, 0, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      
      a(☃, ☃, 2, 2, 2, 3, 3, 2, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      a(☃, ☃, 1, 2, 3, 1, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      a(☃, ☃, 5, 2, 3, 5, 3, 6, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      a(☃, ☃, 2, 2, 7, 4, 3, 7, afi.f.a(aio.a.b.a()), afi.f.a(aio.a.b.a()), false);
      
      a(☃, ☃, 1, 0, 2, 1, 3, 2, afi.r.Q(), afi.r.Q(), false);
      a(☃, ☃, 5, 0, 2, 5, 3, 2, afi.r.Q(), afi.r.Q(), false);
      a(☃, ☃, 1, 0, 7, 1, 3, 7, afi.r.Q(), afi.r.Q(), false);
      a(☃, ☃, 5, 0, 7, 5, 3, 7, afi.r.Q(), afi.r.Q(), false);
      
      a(☃, afi.aO.Q(), 2, 3, 2, ☃);
      a(☃, afi.aO.Q(), 3, 3, 7, ☃);
      a(☃, afi.a.Q(), 1, 3, 4, ☃);
      a(☃, afi.a.Q(), 5, 3, 4, ☃);
      a(☃, afi.a.Q(), 5, 3, 5, ☃);
      a(☃, afi.ca.Q().a(agx.b, agx.a.r), 1, 3, 5, ☃);
      
      a(☃, afi.ai.Q(), 3, 2, 6, ☃);
      a(☃, afi.bE.Q(), 4, 2, 6, ☃);
      
      a(☃, afi.aO.Q(), 1, 2, 1, ☃);
      a(☃, afi.aO.Q(), 5, 2, 1, ☃);
      
      int ☃ = a(afi.ad, 3);
      int ☃ = a(afi.ad, 1);
      int ☃ = a(afi.ad, 0);
      int ☃ = a(afi.ad, 2);
      
      a(☃, ☃, 0, 4, 1, 6, 4, 1, afi.bU.a(☃), afi.bU.a(☃), false);
      a(☃, ☃, 0, 4, 2, 0, 4, 7, afi.bU.a(☃), afi.bU.a(☃), false);
      a(☃, ☃, 6, 4, 2, 6, 4, 7, afi.bU.a(☃), afi.bU.a(☃), false);
      a(☃, ☃, 0, 4, 8, 6, 4, 8, afi.bU.a(☃), afi.bU.a(☃), false);
      for (int ☃ = 2; ☃ <= 7; ☃ += 5) {
        for (int ☃ = 1; ☃ <= 5; ☃ += 4) {
          b(☃, afi.r.Q(), ☃, -1, ☃, ☃);
        }
      }
      if (!this.e)
      {
        int ☃ = a(2, 5);
        int ☃ = d(2);
        int ☃ = b(2, 5);
        if (☃.b(new cj(☃, ☃, ☃)))
        {
          this.e = true;
          
          wd ☃ = new wd(☃);
          ☃.b(☃ + 0.5D, ☃, ☃ + 0.5D, 0.0F, 0.0F);
          ☃.a(☃.E(new cj(☃, ☃, ☃)), null);
          ☃.d(☃);
        }
      }
      return true;
    }
  }
}
