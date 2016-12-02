import java.util.List;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class pk
  implements m
{
  private static final aug a = new aug(0.0D, 0.0D, 0.0D, 0.0D, 0.0D, 0.0D);
  private static int b;
  private int c = b++;
  public double j = 1.0D;
  public boolean k;
  public pk l;
  public pk m;
  public boolean n;
  public adm o;
  public double p;
  public double q;
  public double r;
  public double s;
  public double t;
  public double u;
  public double v;
  public double w;
  public double x;
  public float y;
  public float z;
  public float A;
  public float B;
  private aug f = a;
  public boolean C;
  public boolean D;
  public boolean E;
  public boolean F;
  public boolean G;
  protected boolean H;
  private boolean g;
  public boolean I;
  public float J = 0.6F;
  public float K = 1.8F;
  public float L;
  public float M;
  public float N;
  public float O;
  private int h = 1;
  public double P;
  public double Q;
  public double R;
  public float S;
  public boolean T;
  public float U;
  protected Random V = new Random();
  public int W;
  public int X = 1;
  private int i;
  protected boolean Y;
  public int Z;
  protected boolean aa = true;
  protected boolean ab;
  protected pz ac;
  private double ar;
  private double as;
  public boolean ad;
  public int ae;
  public int af;
  public int ag;
  public int bW;
  public int bX;
  public int bY;
  public boolean ah;
  public boolean ai;
  public int aj;
  protected boolean ak;
  protected int al;
  public int am;
  protected cj an;
  protected aui ao;
  protected cq ap;
  private boolean at;
  protected UUID aq = ns.a(V);
  private final n au = new n();
  
  public int F()
  {
    return c;
  }
  
  public void d(int ☃)
  {
    c = ☃;
  }
  
  public void G()
  {
    J();
  }
  
  public pk(adm ☃)
  {
    o = ☃;
    b(0.0D, 0.0D, 0.0D);
    if (☃ != null) {
      am = t.q();
    }
    ac = new pz(this);
    ac.a(0, Byte.valueOf((byte)0));
    ac.a(1, Short.valueOf((short)300));
    ac.a(3, Byte.valueOf((byte)0));
    ac.a(2, "");
    ac.a(4, Byte.valueOf((byte)0));
    h();
  }
  
  protected abstract void h();
  
  public pz H()
  {
    return ac;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof pk)) {
      return c == c;
    }
    return false;
  }
  
  public int hashCode()
  {
    return c;
  }
  
  protected void I()
  {
    if (o == null) {
      return;
    }
    while ((t > 0.0D) && (t < 256.0D))
    {
      b(s, t, u);
      if (o.a(this, aR()).isEmpty()) {
        break;
      }
      t += 1.0D;
    }
    v = (w = x = 0.0D);
    z = 0.0F;
  }
  
  public void J()
  {
    I = true;
  }
  
  protected void a(float ☃, float ☃)
  {
    if ((☃ != J) || (☃ != K))
    {
      float ☃ = J;
      
      J = ☃;
      K = ☃;
      a(new aug(aRa, aRb, aRc, aRa + J, aRb + K, aRc + J));
      if ((J > ☃) && (!aa) && (!o.D)) {
        d(☃ - J, 0.0D, ☃ - J);
      }
    }
  }
  
  protected void b(float ☃, float ☃)
  {
    y = (☃ % 360.0F);
    z = (☃ % 360.0F);
  }
  
  public void b(double ☃, double ☃, double ☃)
  {
    s = ☃;
    t = ☃;
    u = ☃;
    float ☃ = J / 2.0F;
    float ☃ = K;
    a(new aug(☃ - ☃, ☃, ☃ - ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃));
  }
  
  public void c(float ☃, float ☃)
  {
    float ☃ = z;
    float ☃ = y;
    
    y = ((float)(y + ☃ * 0.15D));
    z = ((float)(z - ☃ * 0.15D));
    z = ns.a(z, -90.0F, 90.0F);
    
    B += z - ☃;
    A += y - ☃;
  }
  
  public void t_()
  {
    K();
  }
  
  public void K()
  {
    o.B.a("entityBaseTick");
    if ((m != null) && (m.I)) {
      m = null;
    }
    L = M;
    p = s;
    q = t;
    r = u;
    B = z;
    A = y;
    if ((!o.D) && ((o instanceof le)))
    {
      o.B.a("portal");
      MinecraftServer ☃ = ((le)o).r();
      int ☃ = L();
      if (ak)
      {
        if (☃.C())
        {
          if ((m == null) && 
            (al++ >= ☃))
          {
            al = ☃;
            aj = aq();
            int ☃;
            int ☃;
            if (o.t.q() == -1) {
              ☃ = 0;
            } else {
              ☃ = -1;
            }
            c(☃);
          }
          ak = false;
        }
      }
      else
      {
        if (al > 0) {
          al -= 4;
        }
        if (al < 0) {
          al = 0;
        }
      }
      if (aj > 0) {
        aj -= 1;
      }
      o.B.b();
    }
    Y();
    
    W();
    if (o.D) {
      i = 0;
    } else if (i > 0) {
      if (ab)
      {
        i -= 4;
        if (i < 0) {
          i = 0;
        }
      }
      else
      {
        if (i % 20 == 0) {
          a(ow.c, 1.0F);
        }
        i -= 1;
      }
    }
    if (ab())
    {
      M();
      O *= 0.5F;
    }
    if (t < -64.0D) {
      O();
    }
    if (!o.D) {
      b(0, i > 0);
    }
    aa = false;
    
    o.B.b();
  }
  
  public int L()
  {
    return 0;
  }
  
  protected void M()
  {
    if (ab) {
      return;
    }
    a(ow.d, 4.0F);
    e(15);
  }
  
  public void e(int ☃)
  {
    int ☃ = ☃ * 20;
    ☃ = acr.a(this, ☃);
    if (i < ☃) {
      i = ☃;
    }
  }
  
  public void N()
  {
    i = 0;
  }
  
  protected void O()
  {
    J();
  }
  
  public boolean c(double ☃, double ☃, double ☃)
  {
    aug ☃ = aR().c(☃, ☃, ☃);
    return b(☃);
  }
  
  private boolean b(aug ☃)
  {
    return (o.a(this, ☃).isEmpty()) && (!o.d(☃));
  }
  
  public void d(double ☃, double ☃, double ☃)
  {
    if (T)
    {
      a(aR().c(☃, ☃, ☃));
      m();
      return;
    }
    o.B.a("move");
    
    double ☃ = s;
    double ☃ = t;
    double ☃ = u;
    if (H)
    {
      H = false;
      
      ☃ *= 0.25D;
      ☃ *= 0.05000000074505806D;
      ☃ *= 0.25D;
      v = 0.0D;
      w = 0.0D;
      x = 0.0D;
    }
    double ☃ = ☃;
    double ☃ = ☃;
    double ☃ = ☃;
    
    boolean ☃ = (C) && (av()) && ((this instanceof wn));
    if (☃)
    {
      double ☃ = 0.05D;
      while ((☃ != 0.0D) && (o.a(this, aR().c(☃, -1.0D, 0.0D)).isEmpty()))
      {
        if ((☃ < ☃) && (☃ >= -☃)) {
          ☃ = 0.0D;
        } else if (☃ > 0.0D) {
          ☃ -= ☃;
        } else {
          ☃ += ☃;
        }
        ☃ = ☃;
      }
      while ((☃ != 0.0D) && (o.a(this, aR().c(0.0D, -1.0D, ☃)).isEmpty()))
      {
        if ((☃ < ☃) && (☃ >= -☃)) {
          ☃ = 0.0D;
        } else if (☃ > 0.0D) {
          ☃ -= ☃;
        } else {
          ☃ += ☃;
        }
        ☃ = ☃;
      }
      while ((☃ != 0.0D) && (☃ != 0.0D) && (o.a(this, aR().c(☃, -1.0D, ☃)).isEmpty()))
      {
        if ((☃ < ☃) && (☃ >= -☃)) {
          ☃ = 0.0D;
        } else if (☃ > 0.0D) {
          ☃ -= ☃;
        } else {
          ☃ += ☃;
        }
        ☃ = ☃;
        if ((☃ < ☃) && (☃ >= -☃)) {
          ☃ = 0.0D;
        } else if (☃ > 0.0D) {
          ☃ -= ☃;
        } else {
          ☃ += ☃;
        }
        ☃ = ☃;
      }
    }
    List<aug> ☃ = o.a(this, aR().a(☃, ☃, ☃));
    aug ☃ = aR();
    for (aug ☃ : ☃) {
      ☃ = ☃.b(aR(), ☃);
    }
    a(aR().c(0.0D, ☃, 0.0D));
    boolean ☃ = (C) || ((☃ != ☃) && (☃ < 0.0D));
    for (aug ☃ : ☃) {
      ☃ = ☃.a(aR(), ☃);
    }
    a(aR().c(☃, 0.0D, 0.0D));
    for (aug ☃ : ☃) {
      ☃ = ☃.c(aR(), ☃);
    }
    a(aR().c(0.0D, 0.0D, ☃));
    if ((S > 0.0F) && (☃) && ((☃ != ☃) || (☃ != ☃)))
    {
      double ☃ = ☃;
      double ☃ = ☃;
      double ☃ = ☃;
      aug ☃ = aR();
      
      a(☃);
      ☃ = ☃;
      ☃ = S;
      ☃ = ☃;
      
      List<aug> ☃ = o.a(this, aR().a(☃, ☃, ☃));
      
      aug ☃ = aR();
      aug ☃ = ☃.a(☃, 0.0D, ☃);
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.b(☃, ☃);
      }
      ☃ = ☃.c(0.0D, ☃, 0.0D);
      
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.a(☃, ☃);
      }
      ☃ = ☃.c(☃, 0.0D, 0.0D);
      
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.c(☃, ☃);
      }
      ☃ = ☃.c(0.0D, 0.0D, ☃);
      
      aug ☃ = aR();
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.b(☃, ☃);
      }
      ☃ = ☃.c(0.0D, ☃, 0.0D);
      
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.a(☃, ☃);
      }
      ☃ = ☃.c(☃, 0.0D, 0.0D);
      
      double ☃ = ☃;
      for (aug ☃ : ☃) {
        ☃ = ☃.c(☃, ☃);
      }
      ☃ = ☃.c(0.0D, 0.0D, ☃);
      
      double ☃ = ☃ * ☃ + ☃ * ☃;
      double ☃ = ☃ * ☃ + ☃ * ☃;
      if (☃ > ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
        ☃ = -☃;
        a(☃);
      }
      else
      {
        ☃ = ☃;
        ☃ = ☃;
        ☃ = -☃;
        a(☃);
      }
      for (aug ☃ : ☃) {
        ☃ = ☃.b(aR(), ☃);
      }
      a(aR().c(0.0D, ☃, 0.0D));
      if (☃ * ☃ + ☃ * ☃ >= ☃ * ☃ + ☃ * ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
        a(☃);
      }
    }
    o.B.b();
    o.B.a("rest");
    
    m();
    
    D = ((☃ != ☃) || (☃ != ☃));
    E = (☃ != ☃);
    
    C = ((E) && (☃ < 0.0D));
    F = ((D) || (E));
    
    int ☃ = ns.c(s);
    int ☃ = ns.c(t - 0.20000000298023224D);
    int ☃ = ns.c(u);
    
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = o.p(☃).c();
    if (☃.t() == arm.a)
    {
      afh ☃ = o.p(☃.b()).c();
      if (((☃ instanceof agt)) || ((☃ instanceof akl)) || ((☃ instanceof agu)))
      {
        ☃ = ☃;
        ☃ = ☃.b();
      }
    }
    a(☃, C, ☃, ☃);
    if (☃ != ☃) {
      v = 0.0D;
    }
    if (☃ != ☃) {
      x = 0.0D;
    }
    if (☃ != ☃) {
      ☃.a(o, this);
    }
    if ((s_()) && (!☃) && (m == null))
    {
      double ☃ = s - ☃;
      double ☃ = t - ☃;
      double ☃ = u - ☃;
      if (☃ != afi.au) {
        ☃ = 0.0D;
      }
      if ((☃ != null) && (C)) {
        ☃.a(o, ☃, this);
      }
      M = ((float)(M + ns.a(☃ * ☃ + ☃ * ☃) * 0.6D));
      N = ((float)(N + ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃) * 0.6D));
      if ((N > h) && (☃.t() != arm.a))
      {
        h = ((int)N + 1);
        if (V())
        {
          float ☃ = ns.a(v * v * 0.20000000298023224D + w * w + x * x * 0.20000000298023224D) * 0.35F;
          if (☃ > 1.0F) {
            ☃ = 1.0F;
          }
          a(P(), ☃, 1.0F + (V.nextFloat() - V.nextFloat()) * 0.4F);
        }
        a(☃, ☃);
      }
    }
    try
    {
      Q();
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Checking entity block collision");
      c ☃ = ☃.a("Entity being checked for collision");
      
      a(☃);
      
      throw new e(☃);
    }
    boolean ☃ = U();
    if (o.e(aR().d(0.001D, 0.001D, 0.001D)))
    {
      f(1);
      if (!☃)
      {
        i += 1;
        if (i == 0) {
          e(8);
        }
      }
    }
    else if (i <= 0)
    {
      i = (-X);
    }
    if ((☃) && (i > 0))
    {
      a("random.fizz", 0.7F, 1.6F + (V.nextFloat() - V.nextFloat()) * 0.4F);
      i = (-X);
    }
    o.B.b();
  }
  
  private void m()
  {
    s = ((aRa + aRd) / 2.0D);
    t = aRb;
    u = ((aRc + aRf) / 2.0D);
  }
  
  protected String P()
  {
    return "game.neutral.swim";
  }
  
  protected void Q()
  {
    cj ☃ = new cj(aRa + 0.001D, aRb + 0.001D, aRc + 0.001D);
    cj ☃ = new cj(aRd - 0.001D, aRe - 0.001D, aRf - 0.001D);
    if (o.a(☃, ☃)) {
      for (int ☃ = ☃.n(); ☃ <= ☃.n(); ☃++) {
        for (int ☃ = ☃.o(); ☃ <= ☃.o(); ☃++) {
          for (int ☃ = ☃.p(); ☃ <= ☃.p(); ☃++)
          {
            cj ☃ = new cj(☃, ☃, ☃);
            alz ☃ = o.p(☃);
            try
            {
              ☃.c().a(o, ☃, ☃, this);
            }
            catch (Throwable ☃)
            {
              b ☃ = b.a(☃, "Colliding entity with block");
              c ☃ = ☃.a("Block being collided with");
              
              c.a(☃, ☃, ☃);
              
              throw new e(☃);
            }
          }
        }
      }
    }
  }
  
  protected void a(cj ☃, afh ☃)
  {
    afh.b ☃ = H;
    if (o.p(☃.a()).c() == afi.aH)
    {
      ☃ = aHH;
      a(☃.c(), ☃.d() * 0.15F, ☃.e());
    }
    else if (!☃.t().d())
    {
      a(☃.c(), ☃.d() * 0.15F, ☃.e());
    }
  }
  
  public void a(String ☃, float ☃, float ☃)
  {
    if (!R()) {
      o.a(this, ☃, ☃, ☃);
    }
  }
  
  public boolean R()
  {
    return ac.a(4) == 1;
  }
  
  public void b(boolean ☃)
  {
    ac.b(4, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  protected boolean s_()
  {
    return true;
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃)
  {
    if (☃)
    {
      if (O > 0.0F)
      {
        if (☃ != null) {
          ☃.a(o, ☃, this, O);
        } else {
          e(O, 1.0F);
        }
        O = 0.0F;
      }
    }
    else if (☃ < 0.0D) {
      O = ((float)(O - ☃));
    }
  }
  
  public aug S()
  {
    return null;
  }
  
  protected void f(int ☃)
  {
    if (!ab) {
      a(ow.a, ☃);
    }
  }
  
  public final boolean T()
  {
    return ab;
  }
  
  public void e(float ☃, float ☃)
  {
    if (l != null) {
      l.e(☃, ☃);
    }
  }
  
  public boolean U()
  {
    return (Y) || (o.C(new cj(s, t, u))) || (o.C(new cj(s, t + K, u)));
  }
  
  public boolean V()
  {
    return Y;
  }
  
  public boolean W()
  {
    if (o.a(aR().b(0.0D, -0.4000000059604645D, 0.0D).d(0.001D, 0.001D, 0.001D), arm.h, this))
    {
      if ((!Y) && (!aa)) {
        X();
      }
      O = 0.0F;
      Y = true;
      i = 0;
    }
    else
    {
      Y = false;
    }
    return Y;
  }
  
  protected void X()
  {
    float ☃ = ns.a(v * v * 0.20000000298023224D + w * w + x * x * 0.20000000298023224D) * 0.2F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    a(aa(), ☃, 1.0F + (V.nextFloat() - V.nextFloat()) * 0.4F);
    float ☃ = ns.c(aRb);
    for (int ☃ = 0; ☃ < 1.0F + J * 20.0F; ☃++)
    {
      float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J;
      float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J;
      o.a(cy.e, s + ☃, ☃ + 1.0F, u + ☃, v, w - V.nextFloat() * 0.2F, x, new int[0]);
    }
    for (int ☃ = 0; ☃ < 1.0F + J * 20.0F; ☃++)
    {
      float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J;
      float ☃ = (V.nextFloat() * 2.0F - 1.0F) * J;
      o.a(cy.f, s + ☃, ☃ + 1.0F, u + ☃, v, w, x, new int[0]);
    }
  }
  
  public void Y()
  {
    if ((aw()) && (!V())) {
      Z();
    }
  }
  
  protected void Z()
  {
    int ☃ = ns.c(s);
    int ☃ = ns.c(t - 0.20000000298023224D);
    int ☃ = ns.c(u);
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = o.p(☃);
    afh ☃ = ☃.c();
    if (☃.b() != -1) {
      o.a(cy.L, s + (V.nextFloat() - 0.5D) * J, aRb + 0.1D, u + (V.nextFloat() - 0.5D) * J, -v * 4.0D, 1.5D, -x * 4.0D, new int[] { afh.f(☃) });
    }
  }
  
  protected String aa()
  {
    return "game.neutral.swim.splash";
  }
  
  public boolean a(arm ☃)
  {
    double ☃ = t + aS();
    cj ☃ = new cj(s, ☃, u);
    alz ☃ = o.p(☃);
    afh ☃ = ☃.c();
    if (☃.t() == ☃)
    {
      float ☃ = ahv.b(☃.c().c(☃)) - 0.11111111F;
      float ☃ = ☃.o() + 1 - ☃;
      boolean ☃ = ☃ < ☃;
      if ((!☃) && ((this instanceof wn))) {
        return false;
      }
      return ☃;
    }
    return false;
  }
  
  public boolean ab()
  {
    return o.a(aR().b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), arm.i);
  }
  
  public void a(float ☃, float ☃, float ☃)
  {
    float ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ < 1.0E-4F) {
      return;
    }
    ☃ = ns.c(☃);
    if (☃ < 1.0F) {
      ☃ = 1.0F;
    }
    ☃ = ☃ / ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    float ☃ = ns.a(y * 3.1415927F / 180.0F);
    float ☃ = ns.b(y * 3.1415927F / 180.0F);
    
    v += ☃ * ☃ - ☃ * ☃;
    x += ☃ * ☃ + ☃ * ☃;
  }
  
  public int b(float ☃)
  {
    cj ☃ = new cj(s, t + aS(), u);
    if (o.e(☃)) {
      return o.b(☃, 0);
    }
    return 0;
  }
  
  public float c(float ☃)
  {
    cj ☃ = new cj(s, t + aS(), u);
    if (o.e(☃)) {
      return o.o(☃);
    }
    return 0.0F;
  }
  
  public void a(adm ☃)
  {
    o = ☃;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    p = (s = ☃);
    q = (t = ☃);
    r = (u = ☃);
    A = (y = ☃);
    B = (z = ☃);
    
    double ☃ = A - ☃;
    if (☃ < -180.0D) {
      A += 360.0F;
    }
    if (☃ >= 180.0D) {
      A -= 360.0F;
    }
    b(s, t, u);
    b(☃, ☃);
  }
  
  public void a(cj ☃, float ☃, float ☃)
  {
    b(☃.n() + 0.5D, ☃.o(), ☃.p() + 0.5D, ☃, ☃);
  }
  
  public void b(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    P = (p = s = ☃);
    Q = (q = t = ☃);
    R = (r = u = ☃);
    y = ☃;
    z = ☃;
    b(s, t, u);
  }
  
  public float g(pk ☃)
  {
    float ☃ = (float)(s - s);
    float ☃ = (float)(t - t);
    float ☃ = (float)(u - u);
    return ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double e(double ☃, double ☃, double ☃)
  {
    double ☃ = s - ☃;
    double ☃ = t - ☃;
    double ☃ = u - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double b(cj ☃)
  {
    return ☃.c(s, t, u);
  }
  
  public double c(cj ☃)
  {
    return ☃.d(s, t, u);
  }
  
  public double f(double ☃, double ☃, double ☃)
  {
    double ☃ = s - ☃;
    double ☃ = t - ☃;
    double ☃ = u - ☃;
    return ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double h(pk ☃)
  {
    double ☃ = s - s;
    double ☃ = t - t;
    double ☃ = u - u;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public void d(wn ☃) {}
  
  public void i(pk ☃)
  {
    if ((l == this) || (m == this)) {
      return;
    }
    if ((T) || (T)) {
      return;
    }
    double ☃ = s - s;
    double ☃ = u - u;
    
    double ☃ = ns.a(☃, ☃);
    if (☃ >= 0.009999999776482582D)
    {
      ☃ = ns.a(☃);
      ☃ /= ☃;
      ☃ /= ☃;
      
      double ☃ = 1.0D / ☃;
      if (☃ > 1.0D) {
        ☃ = 1.0D;
      }
      ☃ *= ☃;
      ☃ *= ☃;
      
      ☃ *= 0.05000000074505806D;
      ☃ *= 0.05000000074505806D;
      
      ☃ *= (1.0F - U);
      ☃ *= (1.0F - U);
      if (l == null) {
        g(-☃, 0.0D, -☃);
      }
      if (l == null) {
        ☃.g(☃, 0.0D, ☃);
      }
    }
  }
  
  public void g(double ☃, double ☃, double ☃)
  {
    v += ☃;
    w += ☃;
    x += ☃;
    ai = true;
  }
  
  protected void ac()
  {
    G = true;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    ac();
    return false;
  }
  
  public aui d(float ☃)
  {
    if (☃ == 1.0F) {
      return f(z, y);
    }
    float ☃ = B + (z - B) * ☃;
    float ☃ = A + (y - A) * ☃;
    return f(☃, ☃);
  }
  
  protected final aui f(float ☃, float ☃)
  {
    float ☃ = ns.b(-☃ * 0.017453292F - 3.1415927F);
    float ☃ = ns.a(-☃ * 0.017453292F - 3.1415927F);
    float ☃ = -ns.b(-☃ * 0.017453292F);
    float ☃ = ns.a(-☃ * 0.017453292F);
    
    return new aui(☃ * ☃, ☃, ☃ * ☃);
  }
  
  public aui e(float ☃)
  {
    if (☃ == 1.0F) {
      return new aui(s, t + aS(), u);
    }
    double ☃ = p + (s - p) * ☃;
    double ☃ = q + (t - q) * ☃ + aS();
    double ☃ = r + (u - r) * ☃;
    
    return new aui(☃, ☃, ☃);
  }
  
  public auh a(double ☃, float ☃)
  {
    aui ☃ = e(☃);
    aui ☃ = d(☃);
    aui ☃ = ☃.b(a * ☃, b * ☃, c * ☃);
    return o.a(☃, ☃, false, false, true);
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  public void b(pk ☃, int ☃) {}
  
  public boolean h(double ☃, double ☃, double ☃)
  {
    double ☃ = s - ☃;
    double ☃ = t - ☃;
    double ☃ = u - ☃;
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    return a(☃);
  }
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a();
    if (Double.isNaN(☃)) {
      ☃ = 1.0D;
    }
    ☃ *= 64.0D * j;
    return ☃ < ☃ * ☃;
  }
  
  public boolean c(dn ☃)
  {
    String ☃ = ag();
    if ((I) || (☃ == null)) {
      return false;
    }
    ☃.a("id", ☃);
    e(☃);
    return true;
  }
  
  public boolean d(dn ☃)
  {
    String ☃ = ag();
    if ((I) || (☃ == null) || (l != null)) {
      return false;
    }
    ☃.a("id", ☃);
    e(☃);
    return true;
  }
  
  public void e(dn ☃)
  {
    try
    {
      ☃.a("Pos", a(new double[] { s, t, u }));
      ☃.a("Motion", a(new double[] { v, w, x }));
      ☃.a("Rotation", a(new float[] { y, z }));
      
      ☃.a("FallDistance", O);
      ☃.a("Fire", (short)i);
      ☃.a("Air", (short)az());
      ☃.a("OnGround", C);
      ☃.a("Dimension", am);
      ☃.a("Invulnerable", at);
      ☃.a("PortalCooldown", aj);
      
      ☃.a("UUIDMost", aK().getMostSignificantBits());
      ☃.a("UUIDLeast", aK().getLeastSignificantBits());
      if ((aM() != null) && (aM().length() > 0))
      {
        ☃.a("CustomName", aM());
        ☃.a("CustomNameVisible", aN());
      }
      au.b(☃);
      if (R()) {
        ☃.a("Silent", R());
      }
      b(☃);
      if (m != null)
      {
        dn ☃ = new dn();
        if (m.c(☃)) {
          ☃.a("Riding", ☃);
        }
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Saving entity NBT");
      c ☃ = ☃.a("Entity being saved");
      a(☃);
      throw new e(☃);
    }
  }
  
  public void f(dn ☃)
  {
    try
    {
      du ☃ = ☃.c("Pos", 6);
      du ☃ = ☃.c("Motion", 6);
      du ☃ = ☃.c("Rotation", 5);
      
      v = ☃.d(0);
      w = ☃.d(1);
      x = ☃.d(2);
      if (Math.abs(v) > 10.0D) {
        v = 0.0D;
      }
      if (Math.abs(w) > 10.0D) {
        w = 0.0D;
      }
      if (Math.abs(x) > 10.0D) {
        x = 0.0D;
      }
      p = (P = s = ☃.d(0));
      q = (Q = t = ☃.d(1));
      r = (R = u = ☃.d(2));
      
      A = (y = ☃.e(0));
      B = (z = ☃.e(1));
      
      f(y);
      g(y);
      
      O = ☃.h("FallDistance");
      i = ☃.e("Fire");
      h(☃.e("Air"));
      C = ☃.n("OnGround");
      am = ☃.f("Dimension");
      at = ☃.n("Invulnerable");
      aj = ☃.f("PortalCooldown");
      if ((☃.b("UUIDMost", 4)) && (☃.b("UUIDLeast", 4))) {
        aq = new UUID(☃.g("UUIDMost"), ☃.g("UUIDLeast"));
      } else if (☃.b("UUID", 8)) {
        aq = UUID.fromString(☃.j("UUID"));
      }
      b(s, t, u);
      b(y, z);
      if ((☃.b("CustomName", 8)) && (☃.j("CustomName").length() > 0)) {
        a(☃.j("CustomName"));
      }
      g(☃.n("CustomNameVisible"));
      au.a(☃);
      b(☃.n("Silent"));
      
      a(☃);
      if (af()) {
        b(s, t, u);
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Loading entity NBT");
      c ☃ = ☃.a("Entity being loaded");
      a(☃);
      throw new e(☃);
    }
  }
  
  protected boolean af()
  {
    return true;
  }
  
  protected final String ag()
  {
    return pm.b(this);
  }
  
  protected abstract void a(dn paramdn);
  
  protected abstract void b(dn paramdn);
  
  public void ah() {}
  
  protected du a(double... ☃)
  {
    du ☃ = new du();
    for (double ☃ : ☃) {
      ☃.a(new dp(☃));
    }
    return ☃;
  }
  
  protected du a(float... ☃)
  {
    du ☃ = new du();
    for (float ☃ : ☃) {
      ☃.a(new dr(☃));
    }
    return ☃;
  }
  
  public uz a(zw ☃, int ☃)
  {
    return a(☃, ☃, 0.0F);
  }
  
  public uz a(zw ☃, int ☃, float ☃)
  {
    return a(new zx(☃, ☃, 0), ☃);
  }
  
  public uz a(zx ☃, float ☃)
  {
    if ((b == 0) || (☃.b() == null)) {
      return null;
    }
    uz ☃ = new uz(o, s, t + ☃, u, ☃);
    ☃.p();
    o.d(☃);
    return ☃;
  }
  
  public boolean ai()
  {
    return !I;
  }
  
  public boolean aj()
  {
    if (T) {
      return false;
    }
    cj.a ☃ = new cj.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      int ☃ = ns.c(t + ((☃ >> 0) % 2 - 0.5F) * 0.1F + aS());
      int ☃ = ns.c(s + ((☃ >> 1) % 2 - 0.5F) * J * 0.8F);
      int ☃ = ns.c(u + ((☃ >> 2) % 2 - 0.5F) * J * 0.8F);
      if ((☃.n() != ☃) || (☃.o() != ☃) || (☃.p() != ☃))
      {
        ☃.c(☃, ☃, ☃);
        if (o.p(☃).c().w()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean e(wn ☃)
  {
    return false;
  }
  
  public aug j(pk ☃)
  {
    return null;
  }
  
  public void ak()
  {
    if (m.I)
    {
      m = null;
      return;
    }
    v = 0.0D;
    w = 0.0D;
    x = 0.0D;
    t_();
    if (m == null) {
      return;
    }
    m.al();
    
    as += m.y - m.A;
    ar += m.z - m.B;
    while (as >= 180.0D) {
      as -= 360.0D;
    }
    while (as < -180.0D) {
      as += 360.0D;
    }
    while (ar >= 180.0D) {
      ar -= 360.0D;
    }
    while (ar < -180.0D) {
      ar += 360.0D;
    }
    double ☃ = as * 0.5D;
    double ☃ = ar * 0.5D;
    
    float ☃ = 10.0F;
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    as -= ☃;
    ar -= ☃;
  }
  
  public void al()
  {
    if (l == null) {
      return;
    }
    l.b(s, t + an() + l.am(), u);
  }
  
  public double am()
  {
    return 0.0D;
  }
  
  public double an()
  {
    return K * 0.75D;
  }
  
  public void a(pk ☃)
  {
    ar = 0.0D;
    as = 0.0D;
    if (☃ == null)
    {
      if (m != null)
      {
        b(m.s, m.aR().b + m.K, m.u, y, z);
        m.l = null;
      }
      m = null;
      return;
    }
    if (m != null) {
      m.l = null;
    }
    if (☃ != null)
    {
      pk ☃ = m;
      while (☃ != null)
      {
        if (☃ == this) {
          return;
        }
        ☃ = m;
      }
    }
    m = ☃;
    l = this;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    b(☃, ☃, ☃);
    b(☃, ☃);
    
    List<aug> ☃ = o.a(this, aR().d(0.03125D, 0.0D, 0.03125D));
    if (!☃.isEmpty())
    {
      double ☃ = 0.0D;
      for (aug ☃ : ☃) {
        if (e > ☃) {
          ☃ = e;
        }
      }
      ☃ += ☃ - aRb;
      b(☃, ☃, ☃);
    }
  }
  
  public float ao()
  {
    return 0.1F;
  }
  
  public aui ap()
  {
    return null;
  }
  
  public void d(cj ☃)
  {
    if (aj > 0)
    {
      aj = aq();
      return;
    }
    if ((!o.D) && (!☃.equals(an)))
    {
      an = ☃;
      amd.b ☃ = afi.aY.f(o, ☃);
      
      double ☃ = ☃.b().k() == cq.a.a ? ☃.a().p() : ☃.a().n();
      double ☃ = ☃.b().k() == cq.a.a ? u : s;
      ☃ = Math.abs(ns.c(☃ - (☃.b().e().c() == cq.b.b ? 1 : 0), ☃, ☃ - ☃.d()));
      double ☃ = ns.c(t - 1.0D, ☃.a().o(), ☃.a().o() - ☃.e());
      ao = new aui(☃, ☃, 0.0D);
      ap = ☃.b();
    }
    ak = true;
  }
  
  public int aq()
  {
    return 300;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    v = ☃;
    w = ☃;
    x = ☃;
  }
  
  public void a(byte ☃) {}
  
  public void ar() {}
  
  public zx[] as()
  {
    return null;
  }
  
  public void c(int ☃, zx ☃) {}
  
  public boolean at()
  {
    boolean ☃ = (o != null) && (o.D);
    
    return (!ab) && ((i > 0) || ((☃) && (g(0))));
  }
  
  public boolean au()
  {
    return m != null;
  }
  
  public boolean av()
  {
    return g(1);
  }
  
  public void c(boolean ☃)
  {
    b(1, ☃);
  }
  
  public boolean aw()
  {
    return g(3);
  }
  
  public void d(boolean ☃)
  {
    b(3, ☃);
  }
  
  public boolean ax()
  {
    return g(5);
  }
  
  public boolean f(wn ☃)
  {
    if (☃.v()) {
      return false;
    }
    return ax();
  }
  
  public void e(boolean ☃)
  {
    b(5, ☃);
  }
  
  public boolean ay()
  {
    return g(4);
  }
  
  public void f(boolean ☃)
  {
    b(4, ☃);
  }
  
  protected boolean g(int ☃)
  {
    return (ac.a(0) & 1 << ☃) != 0;
  }
  
  protected void b(int ☃, boolean ☃)
  {
    byte ☃ = ac.a(0);
    if (☃) {
      ac.b(0, Byte.valueOf((byte)(☃ | 1 << ☃)));
    } else {
      ac.b(0, Byte.valueOf((byte)(☃ & (1 << ☃ ^ 0xFFFFFFFF))));
    }
  }
  
  public int az()
  {
    return ac.b(1);
  }
  
  public void h(int ☃)
  {
    ac.b(1, Short.valueOf((short)☃));
  }
  
  public void a(uv ☃)
  {
    a(ow.b, 5.0F);
    i += 1;
    if (i == 0) {
      e(8);
    }
  }
  
  public void a(pr ☃) {}
  
  protected boolean j(double ☃, double ☃, double ☃)
  {
    cj ☃ = new cj(☃, ☃, ☃);
    
    double ☃ = ☃ - ☃.n();
    double ☃ = ☃ - ☃.o();
    double ☃ = ☃ - ☃.p();
    
    List<aug> ☃ = o.a(aR());
    if ((!☃.isEmpty()) || (o.u(☃)))
    {
      int ☃ = 3;
      double ☃ = 9999.0D;
      if ((!o.u(☃.e())) && (☃ < ☃))
      {
        ☃ = ☃;
        ☃ = 0;
      }
      if ((!o.u(☃.f())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 1;
      }
      if ((!o.u(☃.a())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 3;
      }
      if ((!o.u(☃.c())) && (☃ < ☃))
      {
        ☃ = ☃;
        ☃ = 4;
      }
      if ((!o.u(☃.d())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 5;
      }
      float ☃ = V.nextFloat() * 0.2F + 0.1F;
      if (☃ == 0) {
        v = (-☃);
      }
      if (☃ == 1) {
        v = ☃;
      }
      if (☃ == 3) {
        w = ☃;
      }
      if (☃ == 4) {
        x = (-☃);
      }
      if (☃ == 5) {
        x = ☃;
      }
      return true;
    }
    return false;
  }
  
  public void aA()
  {
    H = true;
    O = 0.0F;
  }
  
  public String e_()
  {
    if (l_()) {
      return aM();
    }
    String ☃ = pm.b(this);
    if (☃ == null) {
      ☃ = "generic";
    }
    return di.a("entity." + ☃ + ".name");
  }
  
  public pk[] aB()
  {
    return null;
  }
  
  public boolean k(pk ☃)
  {
    return this == ☃;
  }
  
  public float aC()
  {
    return 0.0F;
  }
  
  public void f(float ☃) {}
  
  public void g(float ☃) {}
  
  public boolean aD()
  {
    return true;
  }
  
  public boolean l(pk ☃)
  {
    return false;
  }
  
  public String toString()
  {
    return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), e_(), Integer.valueOf(c), o == null ? "~NULL~" : o.P().k(), Double.valueOf(s), Double.valueOf(t), Double.valueOf(u) });
  }
  
  public boolean b(ow ☃)
  {
    return (at) && (☃ != ow.j) && (!☃.u());
  }
  
  public void m(pk ☃)
  {
    b(s, t, u, y, z);
  }
  
  public void n(pk ☃)
  {
    dn ☃ = new dn();
    ☃.e(☃);
    f(☃);
    aj = aj;
    an = an;
    ao = ao;
    ap = ap;
  }
  
  public void c(int ☃)
  {
    if ((o.D) || (I)) {
      return;
    }
    o.B.a("changeDimension");
    
    MinecraftServer ☃ = MinecraftServer.N();
    int ☃ = am;
    le ☃ = ☃.a(☃);
    le ☃ = ☃.a(☃);
    am = ☃;
    if ((☃ == 1) && (☃ == 1))
    {
      ☃ = ☃.a(0);
      am = 0;
    }
    o.e(this);
    I = false;
    o.B.a("reposition");
    ☃.ap().a(this, ☃, ☃, ☃);
    o.B.c("reloading");
    pk ☃ = pm.a(pm.b(this), ☃);
    if (☃ != null)
    {
      ☃.n(this);
      if ((☃ == 1) && (☃ == 1))
      {
        cj ☃ = o.r(☃.M());
        ☃.a(☃, y, z);
      }
      ☃.d(☃);
    }
    I = true;
    o.B.b();
    
    ☃.j();
    ☃.j();
    o.B.b();
  }
  
  public float a(adi ☃, adm ☃, cj ☃, alz ☃)
  {
    return ☃.c().a(this);
  }
  
  public boolean a(adi ☃, adm ☃, cj ☃, alz ☃, float ☃)
  {
    return true;
  }
  
  public int aE()
  {
    return 3;
  }
  
  public aui aG()
  {
    return ao;
  }
  
  public cq aH()
  {
    return ap;
  }
  
  public boolean aI()
  {
    return false;
  }
  
  public void a(c ☃)
  {
    ☃.a("Entity Type", new Callable()
    {
      public String a()
        throws Exception
      {
        return pm.b(pk.this) + " (" + getClass().getCanonicalName() + ")";
      }
    });
    ☃.a("Entity ID", Integer.valueOf(c));
    ☃.a("Entity Name", new Callable()
    {
      public String a()
        throws Exception
      {
        return e_();
      }
    });
    ☃.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(s), Double.valueOf(t), Double.valueOf(u) }));
    ☃.a("Entity's Block location", c.a(ns.c(s), ns.c(t), ns.c(u)));
    ☃.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(v), Double.valueOf(w), Double.valueOf(x) }));
    ☃.a("Entity's Rider", new Callable()
    {
      public String a()
        throws Exception
      {
        return l.toString();
      }
    });
    ☃.a("Entity's Vehicle", new Callable()
    {
      public String a()
        throws Exception
      {
        return m.toString();
      }
    });
  }
  
  public boolean aJ()
  {
    return at();
  }
  
  public UUID aK()
  {
    return aq;
  }
  
  public boolean aL()
  {
    return true;
  }
  
  public eu f_()
  {
    fa ☃ = new fa(e_());
    ☃.b().a(aQ());
    ☃.b().a(aK().toString());
    return ☃;
  }
  
  public void a(String ☃)
  {
    ac.b(2, ☃);
  }
  
  public String aM()
  {
    return ac.e(2);
  }
  
  public boolean l_()
  {
    return ac.e(2).length() > 0;
  }
  
  public void g(boolean ☃)
  {
    ac.b(3, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public boolean aN()
  {
    return ac.a(3) == 1;
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    b(☃, ☃, ☃, y, z);
  }
  
  public boolean aO()
  {
    return aN();
  }
  
  public void i(int ☃) {}
  
  public cq aP()
  {
    return cq.b(ns.c(y * 4.0F / 360.0F + 0.5D) & 0x3);
  }
  
  protected ew aQ()
  {
    dn ☃ = new dn();
    String ☃ = pm.b(this);
    
    ☃.a("id", aK().toString());
    if (☃ != null) {
      ☃.a("type", ☃);
    }
    ☃.a("name", e_());
    
    return new ew(ew.a.d, new fa(☃.toString()));
  }
  
  public boolean a(lf ☃)
  {
    return true;
  }
  
  public aug aR()
  {
    return f;
  }
  
  public void a(aug ☃)
  {
    f = ☃;
  }
  
  public float aS()
  {
    return K * 0.85F;
  }
  
  public boolean aT()
  {
    return g;
  }
  
  public void h(boolean ☃)
  {
    g = ☃;
  }
  
  public boolean d(int ☃, zx ☃)
  {
    return false;
  }
  
  public void a(eu ☃) {}
  
  public boolean a(int ☃, String ☃)
  {
    return true;
  }
  
  public cj c()
  {
    return new cj(s, t + 0.5D, u);
  }
  
  public aui d()
  {
    return new aui(s, t, u);
  }
  
  public adm e()
  {
    return o;
  }
  
  public pk f()
  {
    return this;
  }
  
  public boolean u_()
  {
    return false;
  }
  
  public void a(n.a ☃, int ☃)
  {
    au.a(this, ☃, ☃);
  }
  
  public n aU()
  {
    return au;
  }
  
  public void o(pk ☃)
  {
    au.a(☃.aU());
  }
  
  public dn aV()
  {
    return null;
  }
  
  public void g(dn ☃) {}
  
  public boolean a(wn ☃, aui ☃)
  {
    return false;
  }
  
  public boolean aW()
  {
    return false;
  }
  
  protected void a(pr ☃, pk ☃)
  {
    if ((☃ instanceof pr)) {
      ack.a((pr)☃, ☃);
    }
    ack.b(☃, ☃);
  }
}
