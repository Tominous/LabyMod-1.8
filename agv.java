import com.google.common.collect.Maps;
import java.util.Map;
import java.util.Random;

public class agv
  extends afh
{
  public static final amn a = amn.a("age", 0, 15);
  public static final amk b = amk.a("flip");
  public static final amk N = amk.a("alt");
  public static final amk O = amk.a("north");
  public static final amk P = amk.a("east");
  public static final amk Q = amk.a("south");
  public static final amk R = amk.a("west");
  public static final amn S = amn.a("upper", 0, 2);
  
  public alz a(alz ☃, adq ☃, cj ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if ((adm.a(☃, ☃.b())) || (afi.ab.e(☃, ☃.b()))) {
      return Q();
    }
    boolean ☃ = (☃ + ☃ + ☃ & 0x1) == 1;
    boolean ☃ = (☃ / 2 + ☃ / 2 + ☃ / 2 & 0x1) == 1;
    
    int ☃ = 0;
    if (e(☃, ☃.a())) {
      ☃ = ☃ ? 1 : 2;
    }
    return ☃.a(O, Boolean.valueOf(e(☃, ☃.c()))).a(P, Boolean.valueOf(e(☃, ☃.f()))).a(Q, Boolean.valueOf(e(☃, ☃.d()))).a(R, Boolean.valueOf(e(☃, ☃.e()))).a(S, Integer.valueOf(☃)).a(b, Boolean.valueOf(☃)).a(N, Boolean.valueOf(☃));
  }
  
  private final Map<afh, Integer> T = Maps.newIdentityHashMap();
  private final Map<afh, Integer> U = Maps.newIdentityHashMap();
  
  protected agv()
  {
    super(arm.o);
    j(this.M.b().a(a, Integer.valueOf(0)).a(b, Boolean.valueOf(false)).a(N, Boolean.valueOf(false)).a(O, Boolean.valueOf(false)).a(P, Boolean.valueOf(false)).a(Q, Boolean.valueOf(false)).a(R, Boolean.valueOf(false)).a(S, Integer.valueOf(0)));
    a(true);
  }
  
  public static void l()
  {
    afi.ab.a(afi.f, 5, 20);
    afi.ab.a(afi.bL, 5, 20);
    afi.ab.a(afi.bM, 5, 20);
    afi.ab.a(afi.bo, 5, 20);
    afi.ab.a(afi.bp, 5, 20);
    afi.ab.a(afi.bq, 5, 20);
    afi.ab.a(afi.br, 5, 20);
    afi.ab.a(afi.bs, 5, 20);
    afi.ab.a(afi.bt, 5, 20);
    afi.ab.a(afi.aO, 5, 20);
    afi.ab.a(afi.aP, 5, 20);
    afi.ab.a(afi.aQ, 5, 20);
    afi.ab.a(afi.aR, 5, 20);
    afi.ab.a(afi.aS, 5, 20);
    afi.ab.a(afi.aT, 5, 20);
    afi.ab.a(afi.ad, 5, 20);
    afi.ab.a(afi.bV, 5, 20);
    afi.ab.a(afi.bU, 5, 20);
    afi.ab.a(afi.bW, 5, 20);
    afi.ab.a(afi.r, 5, 5);
    afi.ab.a(afi.s, 5, 5);
    afi.ab.a(afi.t, 30, 60);
    afi.ab.a(afi.u, 30, 60);
    afi.ab.a(afi.X, 30, 20);
    afi.ab.a(afi.W, 15, 100);
    afi.ab.a(afi.H, 60, 100);
    afi.ab.a(afi.cF, 60, 100);
    afi.ab.a(afi.N, 60, 100);
    afi.ab.a(afi.O, 60, 100);
    afi.ab.a(afi.I, 60, 100);
    afi.ab.a(afi.L, 30, 60);
    afi.ab.a(afi.bn, 15, 100);
    afi.ab.a(afi.cA, 5, 5);
    afi.ab.a(afi.cx, 60, 20);
    afi.ab.a(afi.cy, 60, 20);
  }
  
  public void a(afh ☃, int ☃, int ☃)
  {
    this.T.put(☃, Integer.valueOf(☃));
    this.U.put(☃, Integer.valueOf(☃));
  }
  
  public aug a(adm ☃, cj ☃, alz ☃)
  {
    return null;
  }
  
  public boolean c()
  {
    return false;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public int a(Random ☃)
  {
    return 0;
  }
  
  public int a(adm ☃)
  {
    return 30;
  }
  
  public void b(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (!☃.Q().b("doFireTick")) {
      return;
    }
    if (!d(☃, ☃)) {
      ☃.g(☃);
    }
    afh ☃ = ☃.p(☃.b()).c();
    boolean ☃ = ☃ == afi.aV;
    if (((☃.t instanceof anp)) && (☃ == afi.h)) {
      ☃ = true;
    }
    if ((!☃) && (☃.S()) && (e(☃, ☃)))
    {
      ☃.g(☃);
      return;
    }
    int ☃ = ((Integer)☃.b(a)).intValue();
    if (☃ < 15)
    {
      ☃ = ☃.a(a, Integer.valueOf(☃ + ☃.nextInt(3) / 2));
      ☃.a(☃, ☃, 4);
    }
    ☃.a(☃, this, a(☃) + ☃.nextInt(10));
    if (!☃)
    {
      if (!f(☃, ☃))
      {
        if ((!adm.a(☃, ☃.b())) || (☃ > 3)) {
          ☃.g(☃);
        }
        return;
      }
      if ((!e(☃, ☃.b())) && (☃ == 15) && (☃.nextInt(4) == 0))
      {
        ☃.g(☃);
        return;
      }
    }
    boolean ☃ = ☃.D(☃);
    int ☃ = 0;
    if (☃) {
      ☃ = -50;
    }
    a(☃, ☃.f(), 300 + ☃, ☃, ☃);
    a(☃, ☃.e(), 300 + ☃, ☃, ☃);
    a(☃, ☃.b(), 250 + ☃, ☃, ☃);
    a(☃, ☃.a(), 250 + ☃, ☃, ☃);
    a(☃, ☃.c(), 300 + ☃, ☃, ☃);
    a(☃, ☃.d(), 300 + ☃, ☃, ☃);
    for (int ☃ = -1; ☃ <= 1; ☃++) {
      for (int ☃ = -1; ☃ <= 1; ☃++) {
        for (int ☃ = -1; ☃ <= 4; ☃++) {
          if ((☃ != 0) || (☃ != 0) || (☃ != 0))
          {
            int ☃ = 100;
            if (☃ > 1) {
              ☃ += (☃ - 1) * 100;
            }
            cj ☃ = ☃.a(☃, ☃, ☃);
            int ☃ = m(☃, ☃);
            if (☃ > 0)
            {
              int ☃ = (☃ + 40 + ☃.aa().a() * 7) / (☃ + 30);
              if (☃) {
                ☃ /= 2;
              }
              if ((☃ > 0) && (☃.nextInt(☃) <= ☃) && (
                (!☃.S()) || (!e(☃, ☃))))
              {
                int ☃ = ☃ + ☃.nextInt(5) / 4;
                if (☃ > 15) {
                  ☃ = 15;
                }
                ☃.a(☃, ☃.a(a, Integer.valueOf(☃)), 3);
              }
            }
          }
        }
      }
    }
  }
  
  protected boolean e(adm ☃, cj ☃)
  {
    return (☃.C(☃)) || (☃.C(☃.e())) || (☃.C(☃.f())) || (☃.C(☃.c())) || (☃.C(☃.d()));
  }
  
  public boolean N()
  {
    return false;
  }
  
  private int c(afh ☃)
  {
    Integer ☃ = (Integer)this.U.get(☃);
    return ☃ == null ? 0 : ☃.intValue();
  }
  
  private int d(afh ☃)
  {
    Integer ☃ = (Integer)this.T.get(☃);
    return ☃ == null ? 0 : ☃.intValue();
  }
  
  private void a(adm ☃, cj ☃, int ☃, Random ☃, int ☃)
  {
    int ☃ = c(☃.p(☃).c());
    if (☃.nextInt(☃) < ☃)
    {
      alz ☃ = ☃.p(☃);
      if ((☃.nextInt(☃ + 10) < 5) && (!☃.C(☃)))
      {
        int ☃ = ☃ + ☃.nextInt(5) / 4;
        if (☃ > 15) {
          ☃ = 15;
        }
        ☃.a(☃, Q().a(a, Integer.valueOf(☃)), 3);
      }
      else
      {
        ☃.g(☃);
      }
      if (☃.c() == afi.W) {
        afi.W.d(☃, ☃, ☃.a(ake.a, Boolean.valueOf(true)));
      }
    }
  }
  
  private boolean f(adm ☃, cj ☃)
  {
    for (cq ☃ : ) {
      if (e(☃, ☃.a(☃))) {
        return true;
      }
    }
    return false;
  }
  
  private int m(adm ☃, cj ☃)
  {
    if (!☃.d(☃)) {
      return 0;
    }
    int ☃ = 0;
    for (cq ☃ : cq.values()) {
      ☃ = Math.max(d(☃.p(☃.a(☃)).c()), ☃);
    }
    return ☃;
  }
  
  public boolean A()
  {
    return false;
  }
  
  public boolean e(adq ☃, cj ☃)
  {
    return d(☃.p(☃).c()) > 0;
  }
  
  public boolean d(adm ☃, cj ☃)
  {
    return (adm.a(☃, ☃.b())) || (f(☃, ☃));
  }
  
  public void a(adm ☃, cj ☃, alz ☃, afh ☃)
  {
    if ((!adm.a(☃, ☃.b())) && (!f(☃, ☃))) {
      ☃.g(☃);
    }
  }
  
  public void c(adm ☃, cj ☃, alz ☃)
  {
    if ((☃.t.q() <= 0) && 
      (afi.aY.e(☃, ☃))) {
      return;
    }
    if ((!adm.a(☃, ☃.b())) && (!f(☃, ☃)))
    {
      ☃.g(☃);
      return;
    }
    ☃.a(☃, this, a(☃) + ☃.s.nextInt(10));
  }
  
  public void c(adm ☃, cj ☃, alz ☃, Random ☃)
  {
    if (☃.nextInt(24) == 0) {
      ☃.a(☃.n() + 0.5F, ☃.o() + 0.5F, ☃.p() + 0.5F, "fire.fire", 1.0F + ☃.nextFloat(), ☃.nextFloat() * 0.7F + 0.3F, false);
    }
    if ((adm.a(☃, ☃.b())) || (afi.ab.e(☃, ☃.b())))
    {
      for (int ☃ = 0; ☃ < 3; ☃++)
      {
        double ☃ = ☃.n() + ☃.nextDouble();
        double ☃ = ☃.o() + ☃.nextDouble() * 0.5D + 0.5D;
        double ☃ = ☃.p() + ☃.nextDouble();
        ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
    else
    {
      if (afi.ab.e(☃, ☃.e())) {
        for (int ☃ = 0; ☃ < 2; ☃++)
        {
          double ☃ = ☃.n() + ☃.nextDouble() * 0.10000000149011612D;
          double ☃ = ☃.o() + ☃.nextDouble();
          double ☃ = ☃.p() + ☃.nextDouble();
          ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (afi.ab.e(☃, ☃.f())) {
        for (int ☃ = 0; ☃ < 2; ☃++)
        {
          double ☃ = ☃.n() + 1 - ☃.nextDouble() * 0.10000000149011612D;
          double ☃ = ☃.o() + ☃.nextDouble();
          double ☃ = ☃.p() + ☃.nextDouble();
          ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (afi.ab.e(☃, ☃.c())) {
        for (int ☃ = 0; ☃ < 2; ☃++)
        {
          double ☃ = ☃.n() + ☃.nextDouble();
          double ☃ = ☃.o() + ☃.nextDouble();
          double ☃ = ☃.p() + ☃.nextDouble() * 0.10000000149011612D;
          ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (afi.ab.e(☃, ☃.d())) {
        for (int ☃ = 0; ☃ < 2; ☃++)
        {
          double ☃ = ☃.n() + ☃.nextDouble();
          double ☃ = ☃.o() + ☃.nextDouble();
          double ☃ = ☃.p() + 1 - ☃.nextDouble() * 0.10000000149011612D;
          ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
      if (afi.ab.e(☃, ☃.a())) {
        for (int ☃ = 0; ☃ < 2; ☃++)
        {
          double ☃ = ☃.n() + ☃.nextDouble();
          double ☃ = ☃.o() + 1 - ☃.nextDouble() * 0.10000000149011612D;
          double ☃ = ☃.p() + ☃.nextDouble();
          ☃.a(cy.m, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
        }
      }
    }
  }
  
  public arn g(alz ☃)
  {
    return arn.f;
  }
  
  public adf m()
  {
    return adf.c;
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, Integer.valueOf(☃));
  }
  
  public int c(alz ☃)
  {
    return ((Integer)☃.b(a)).intValue();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a, O, P, Q, R, S, b, N });
  }
}
