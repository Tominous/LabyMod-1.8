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
  protected UUID aq = ns.a(this.V);
  private final n au = new n();
  
  public int F()
  {
    return this.c;
  }
  
  public void d(int ☃)
  {
    this.c = ☃;
  }
  
  public void G()
  {
    J();
  }
  
  public pk(adm ☃)
  {
    this.o = ☃;
    b(0.0D, 0.0D, 0.0D);
    if (☃ != null) {
      this.am = ☃.t.q();
    }
    this.ac = new pz(this);
    this.ac.a(0, Byte.valueOf((byte)0));
    this.ac.a(1, Short.valueOf((short)300));
    this.ac.a(3, Byte.valueOf((byte)0));
    this.ac.a(2, "");
    this.ac.a(4, Byte.valueOf((byte)0));
    h();
  }
  
  protected abstract void h();
  
  public pz H()
  {
    return this.ac;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof pk)) {
      return ((pk)☃).c == this.c;
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.c;
  }
  
  protected void I()
  {
    if (this.o == null) {
      return;
    }
    while ((this.t > 0.0D) && (this.t < 256.0D))
    {
      b(this.s, this.t, this.u);
      if (this.o.a(this, aR()).isEmpty()) {
        break;
      }
      this.t += 1.0D;
    }
    this.v = (this.w = this.x = 0.0D);
    this.z = 0.0F;
  }
  
  public void J()
  {
    this.I = true;
  }
  
  protected void a(float ☃, float ☃)
  {
    if ((☃ != this.J) || (☃ != this.K))
    {
      float ☃ = this.J;
      
      this.J = ☃;
      this.K = ☃;
      a(new aug(aR().a, aR().b, aR().c, aR().a + this.J, aR().b + this.K, aR().c + this.J));
      if ((this.J > ☃) && (!this.aa) && (!this.o.D)) {
        d(☃ - this.J, 0.0D, ☃ - this.J);
      }
    }
  }
  
  protected void b(float ☃, float ☃)
  {
    this.y = (☃ % 360.0F);
    this.z = (☃ % 360.0F);
  }
  
  public void b(double ☃, double ☃, double ☃)
  {
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    float ☃ = this.J / 2.0F;
    float ☃ = this.K;
    a(new aug(☃ - ☃, ☃, ☃ - ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃));
  }
  
  public void c(float ☃, float ☃)
  {
    float ☃ = this.z;
    float ☃ = this.y;
    
    this.y = ((float)(this.y + ☃ * 0.15D));
    this.z = ((float)(this.z - ☃ * 0.15D));
    this.z = ns.a(this.z, -90.0F, 90.0F);
    
    this.B += this.z - ☃;
    this.A += this.y - ☃;
  }
  
  public void t_()
  {
    K();
  }
  
  public void K()
  {
    this.o.B.a("entityBaseTick");
    if ((this.m != null) && (this.m.I)) {
      this.m = null;
    }
    this.L = this.M;
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    this.B = this.z;
    this.A = this.y;
    if ((!this.o.D) && ((this.o instanceof le)))
    {
      this.o.B.a("portal");
      MinecraftServer ☃ = ((le)this.o).r();
      int ☃ = L();
      if (this.ak)
      {
        if (☃.C())
        {
          if ((this.m == null) && 
            (this.al++ >= ☃))
          {
            this.al = ☃;
            this.aj = aq();
            int ☃;
            int ☃;
            if (this.o.t.q() == -1) {
              ☃ = 0;
            } else {
              ☃ = -1;
            }
            c(☃);
          }
          this.ak = false;
        }
      }
      else
      {
        if (this.al > 0) {
          this.al -= 4;
        }
        if (this.al < 0) {
          this.al = 0;
        }
      }
      if (this.aj > 0) {
        this.aj -= 1;
      }
      this.o.B.b();
    }
    Y();
    
    W();
    if (this.o.D) {
      this.i = 0;
    } else if (this.i > 0) {
      if (this.ab)
      {
        this.i -= 4;
        if (this.i < 0) {
          this.i = 0;
        }
      }
      else
      {
        if (this.i % 20 == 0) {
          a(ow.c, 1.0F);
        }
        this.i -= 1;
      }
    }
    if (ab())
    {
      M();
      this.O *= 0.5F;
    }
    if (this.t < -64.0D) {
      O();
    }
    if (!this.o.D) {
      b(0, this.i > 0);
    }
    this.aa = false;
    
    this.o.B.b();
  }
  
  public int L()
  {
    return 0;
  }
  
  protected void M()
  {
    if (this.ab) {
      return;
    }
    a(ow.d, 4.0F);
    e(15);
  }
  
  public void e(int ☃)
  {
    int ☃ = ☃ * 20;
    ☃ = acr.a(this, ☃);
    if (this.i < ☃) {
      this.i = ☃;
    }
  }
  
  public void N()
  {
    this.i = 0;
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
    return (this.o.a(this, ☃).isEmpty()) && (!this.o.d(☃));
  }
  
  public void d(double ☃, double ☃, double ☃)
  {
    if (this.T)
    {
      a(aR().c(☃, ☃, ☃));
      m();
      return;
    }
    this.o.B.a("move");
    
    double ☃ = this.s;
    double ☃ = this.t;
    double ☃ = this.u;
    if (this.H)
    {
      this.H = false;
      
      ☃ *= 0.25D;
      ☃ *= 0.05000000074505806D;
      ☃ *= 0.25D;
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
    }
    double ☃ = ☃;
    double ☃ = ☃;
    double ☃ = ☃;
    
    boolean ☃ = (this.C) && (av()) && ((this instanceof wn));
    if (☃)
    {
      double ☃ = 0.05D;
      while ((☃ != 0.0D) && (this.o.a(this, aR().c(☃, -1.0D, 0.0D)).isEmpty()))
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
      while ((☃ != 0.0D) && (this.o.a(this, aR().c(0.0D, -1.0D, ☃)).isEmpty()))
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
      while ((☃ != 0.0D) && (☃ != 0.0D) && (this.o.a(this, aR().c(☃, -1.0D, ☃)).isEmpty()))
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
    List<aug> ☃ = this.o.a(this, aR().a(☃, ☃, ☃));
    aug ☃ = aR();
    for (aug ☃ : ☃) {
      ☃ = ☃.b(aR(), ☃);
    }
    a(aR().c(0.0D, ☃, 0.0D));
    boolean ☃ = (this.C) || ((☃ != ☃) && (☃ < 0.0D));
    for (aug ☃ : ☃) {
      ☃ = ☃.a(aR(), ☃);
    }
    a(aR().c(☃, 0.0D, 0.0D));
    for (aug ☃ : ☃) {
      ☃ = ☃.c(aR(), ☃);
    }
    a(aR().c(0.0D, 0.0D, ☃));
    if ((this.S > 0.0F) && (☃) && ((☃ != ☃) || (☃ != ☃)))
    {
      double ☃ = ☃;
      double ☃ = ☃;
      double ☃ = ☃;
      aug ☃ = aR();
      
      a(☃);
      ☃ = ☃;
      ☃ = this.S;
      ☃ = ☃;
      
      List<aug> ☃ = this.o.a(this, aR().a(☃, ☃, ☃));
      
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
    this.o.B.b();
    this.o.B.a("rest");
    
    m();
    
    this.D = ((☃ != ☃) || (☃ != ☃));
    this.E = (☃ != ☃);
    
    this.C = ((this.E) && (☃ < 0.0D));
    this.F = ((this.D) || (this.E));
    
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.t - 0.20000000298023224D);
    int ☃ = ns.c(this.u);
    
    cj ☃ = new cj(☃, ☃, ☃);
    afh ☃ = this.o.p(☃).c();
    if (☃.t() == arm.a)
    {
      afh ☃ = this.o.p(☃.b()).c();
      if (((☃ instanceof agt)) || ((☃ instanceof akl)) || ((☃ instanceof agu)))
      {
        ☃ = ☃;
        ☃ = ☃.b();
      }
    }
    a(☃, this.C, ☃, ☃);
    if (☃ != ☃) {
      this.v = 0.0D;
    }
    if (☃ != ☃) {
      this.x = 0.0D;
    }
    if (☃ != ☃) {
      ☃.a(this.o, this);
    }
    if ((s_()) && (!☃) && (this.m == null))
    {
      double ☃ = this.s - ☃;
      double ☃ = this.t - ☃;
      double ☃ = this.u - ☃;
      if (☃ != afi.au) {
        ☃ = 0.0D;
      }
      if ((☃ != null) && (this.C)) {
        ☃.a(this.o, ☃, this);
      }
      this.M = ((float)(this.M + ns.a(☃ * ☃ + ☃ * ☃) * 0.6D));
      this.N = ((float)(this.N + ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃) * 0.6D));
      if ((this.N > this.h) && (☃.t() != arm.a))
      {
        this.h = ((int)this.N + 1);
        if (V())
        {
          float ☃ = ns.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.35F;
          if (☃ > 1.0F) {
            ☃ = 1.0F;
          }
          a(P(), ☃, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
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
    if (this.o.e(aR().d(0.001D, 0.001D, 0.001D)))
    {
      f(1);
      if (!☃)
      {
        this.i += 1;
        if (this.i == 0) {
          e(8);
        }
      }
    }
    else if (this.i <= 0)
    {
      this.i = (-this.X);
    }
    if ((☃) && (this.i > 0))
    {
      a("random.fizz", 0.7F, 1.6F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
      this.i = (-this.X);
    }
    this.o.B.b();
  }
  
  private void m()
  {
    this.s = ((aR().a + aR().d) / 2.0D);
    this.t = aR().b;
    this.u = ((aR().c + aR().f) / 2.0D);
  }
  
  protected String P()
  {
    return "game.neutral.swim";
  }
  
  protected void Q()
  {
    cj ☃ = new cj(aR().a + 0.001D, aR().b + 0.001D, aR().c + 0.001D);
    cj ☃ = new cj(aR().d - 0.001D, aR().e - 0.001D, aR().f - 0.001D);
    if (this.o.a(☃, ☃)) {
      for (int ☃ = ☃.n(); ☃ <= ☃.n(); ☃++) {
        for (int ☃ = ☃.o(); ☃ <= ☃.o(); ☃++) {
          for (int ☃ = ☃.p(); ☃ <= ☃.p(); ☃++)
          {
            cj ☃ = new cj(☃, ☃, ☃);
            alz ☃ = this.o.p(☃);
            try
            {
              ☃.c().a(this.o, ☃, ☃, this);
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
    afh.b ☃ = ☃.H;
    if (this.o.p(☃.a()).c() == afi.aH)
    {
      ☃ = afi.aH.H;
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
      this.o.a(this, ☃, ☃, ☃);
    }
  }
  
  public boolean R()
  {
    return this.ac.a(4) == 1;
  }
  
  public void b(boolean ☃)
  {
    this.ac.b(4, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  protected boolean s_()
  {
    return true;
  }
  
  protected void a(double ☃, boolean ☃, afh ☃, cj ☃)
  {
    if (☃)
    {
      if (this.O > 0.0F)
      {
        if (☃ != null) {
          ☃.a(this.o, ☃, this, this.O);
        } else {
          e(this.O, 1.0F);
        }
        this.O = 0.0F;
      }
    }
    else if (☃ < 0.0D) {
      this.O = ((float)(this.O - ☃));
    }
  }
  
  public aug S()
  {
    return null;
  }
  
  protected void f(int ☃)
  {
    if (!this.ab) {
      a(ow.a, ☃);
    }
  }
  
  public final boolean T()
  {
    return this.ab;
  }
  
  public void e(float ☃, float ☃)
  {
    if (this.l != null) {
      this.l.e(☃, ☃);
    }
  }
  
  public boolean U()
  {
    return (this.Y) || (this.o.C(new cj(this.s, this.t, this.u))) || (this.o.C(new cj(this.s, this.t + this.K, this.u)));
  }
  
  public boolean V()
  {
    return this.Y;
  }
  
  public boolean W()
  {
    if (this.o.a(aR().b(0.0D, -0.4000000059604645D, 0.0D).d(0.001D, 0.001D, 0.001D), arm.h, this))
    {
      if ((!this.Y) && (!this.aa)) {
        X();
      }
      this.O = 0.0F;
      this.Y = true;
      this.i = 0;
    }
    else
    {
      this.Y = false;
    }
    return this.Y;
  }
  
  protected void X()
  {
    float ☃ = ns.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.2F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    a(aa(), ☃, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
    float ☃ = ns.c(aR().b);
    for (int ☃ = 0; ☃ < 1.0F + this.J * 20.0F; ☃++)
    {
      float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      this.o.a(cy.e, this.s + ☃, ☃ + 1.0F, this.u + ☃, this.v, this.w - this.V.nextFloat() * 0.2F, this.x, new int[0]);
    }
    for (int ☃ = 0; ☃ < 1.0F + this.J * 20.0F; ☃++)
    {
      float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      float ☃ = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      this.o.a(cy.f, this.s + ☃, ☃ + 1.0F, this.u + ☃, this.v, this.w, this.x, new int[0]);
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
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.t - 0.20000000298023224D);
    int ☃ = ns.c(this.u);
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = this.o.p(☃);
    afh ☃ = ☃.c();
    if (☃.b() != -1) {
      this.o.a(cy.L, this.s + (this.V.nextFloat() - 0.5D) * this.J, aR().b + 0.1D, this.u + (this.V.nextFloat() - 0.5D) * this.J, -this.v * 4.0D, 1.5D, -this.x * 4.0D, new int[] { afh.f(☃) });
    }
  }
  
  protected String aa()
  {
    return "game.neutral.swim.splash";
  }
  
  public boolean a(arm ☃)
  {
    double ☃ = this.t + aS();
    cj ☃ = new cj(this.s, ☃, this.u);
    alz ☃ = this.o.p(☃);
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
    return this.o.a(aR().b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), arm.i);
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
    
    float ☃ = ns.a(this.y * 3.1415927F / 180.0F);
    float ☃ = ns.b(this.y * 3.1415927F / 180.0F);
    
    this.v += ☃ * ☃ - ☃ * ☃;
    this.x += ☃ * ☃ + ☃ * ☃;
  }
  
  public int b(float ☃)
  {
    cj ☃ = new cj(this.s, this.t + aS(), this.u);
    if (this.o.e(☃)) {
      return this.o.b(☃, 0);
    }
    return 0;
  }
  
  public float c(float ☃)
  {
    cj ☃ = new cj(this.s, this.t + aS(), this.u);
    if (this.o.e(☃)) {
      return this.o.o(☃);
    }
    return 0.0F;
  }
  
  public void a(adm ☃)
  {
    this.o = ☃;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.p = (this.s = ☃);
    this.q = (this.t = ☃);
    this.r = (this.u = ☃);
    this.A = (this.y = ☃);
    this.B = (this.z = ☃);
    
    double ☃ = this.A - ☃;
    if (☃ < -180.0D) {
      this.A += 360.0F;
    }
    if (☃ >= 180.0D) {
      this.A -= 360.0F;
    }
    b(this.s, this.t, this.u);
    b(☃, ☃);
  }
  
  public void a(cj ☃, float ☃, float ☃)
  {
    b(☃.n() + 0.5D, ☃.o(), ☃.p() + 0.5D, ☃, ☃);
  }
  
  public void b(double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.P = (this.p = this.s = ☃);
    this.Q = (this.q = this.t = ☃);
    this.R = (this.r = this.u = ☃);
    this.y = ☃;
    this.z = ☃;
    b(this.s, this.t, this.u);
  }
  
  public float g(pk ☃)
  {
    float ☃ = (float)(this.s - ☃.s);
    float ☃ = (float)(this.t - ☃.t);
    float ☃ = (float)(this.u - ☃.u);
    return ns.c(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double e(double ☃, double ☃, double ☃)
  {
    double ☃ = this.s - ☃;
    double ☃ = this.t - ☃;
    double ☃ = this.u - ☃;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public double b(cj ☃)
  {
    return ☃.c(this.s, this.t, this.u);
  }
  
  public double c(cj ☃)
  {
    return ☃.d(this.s, this.t, this.u);
  }
  
  public double f(double ☃, double ☃, double ☃)
  {
    double ☃ = this.s - ☃;
    double ☃ = this.t - ☃;
    double ☃ = this.u - ☃;
    return ns.a(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
  }
  
  public double h(pk ☃)
  {
    double ☃ = this.s - ☃.s;
    double ☃ = this.t - ☃.t;
    double ☃ = this.u - ☃.u;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public void d(wn ☃) {}
  
  public void i(pk ☃)
  {
    if ((☃.l == this) || (☃.m == this)) {
      return;
    }
    if ((☃.T) || (this.T)) {
      return;
    }
    double ☃ = ☃.s - this.s;
    double ☃ = ☃.u - this.u;
    
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
      
      ☃ *= (1.0F - this.U);
      ☃ *= (1.0F - this.U);
      if (this.l == null) {
        g(-☃, 0.0D, -☃);
      }
      if (☃.l == null) {
        ☃.g(☃, 0.0D, ☃);
      }
    }
  }
  
  public void g(double ☃, double ☃, double ☃)
  {
    this.v += ☃;
    this.w += ☃;
    this.x += ☃;
    this.ai = true;
  }
  
  protected void ac()
  {
    this.G = true;
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
      return f(this.z, this.y);
    }
    float ☃ = this.B + (this.z - this.B) * ☃;
    float ☃ = this.A + (this.y - this.A) * ☃;
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
      return new aui(this.s, this.t + aS(), this.u);
    }
    double ☃ = this.p + (this.s - this.p) * ☃;
    double ☃ = this.q + (this.t - this.q) * ☃ + aS();
    double ☃ = this.r + (this.u - this.r) * ☃;
    
    return new aui(☃, ☃, ☃);
  }
  
  public auh a(double ☃, float ☃)
  {
    aui ☃ = e(☃);
    aui ☃ = d(☃);
    aui ☃ = ☃.b(☃.a * ☃, ☃.b * ☃, ☃.c * ☃);
    return this.o.a(☃, ☃, false, false, true);
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
    double ☃ = this.s - ☃;
    double ☃ = this.t - ☃;
    double ☃ = this.u - ☃;
    double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
    return a(☃);
  }
  
  public boolean a(double ☃)
  {
    double ☃ = aR().a();
    if (Double.isNaN(☃)) {
      ☃ = 1.0D;
    }
    ☃ *= 64.0D * this.j;
    return ☃ < ☃ * ☃;
  }
  
  public boolean c(dn ☃)
  {
    String ☃ = ag();
    if ((this.I) || (☃ == null)) {
      return false;
    }
    ☃.a("id", ☃);
    e(☃);
    return true;
  }
  
  public boolean d(dn ☃)
  {
    String ☃ = ag();
    if ((this.I) || (☃ == null) || (this.l != null)) {
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
      ☃.a("Pos", a(new double[] { this.s, this.t, this.u }));
      ☃.a("Motion", a(new double[] { this.v, this.w, this.x }));
      ☃.a("Rotation", a(new float[] { this.y, this.z }));
      
      ☃.a("FallDistance", this.O);
      ☃.a("Fire", (short)this.i);
      ☃.a("Air", (short)az());
      ☃.a("OnGround", this.C);
      ☃.a("Dimension", this.am);
      ☃.a("Invulnerable", this.at);
      ☃.a("PortalCooldown", this.aj);
      
      ☃.a("UUIDMost", aK().getMostSignificantBits());
      ☃.a("UUIDLeast", aK().getLeastSignificantBits());
      if ((aM() != null) && (aM().length() > 0))
      {
        ☃.a("CustomName", aM());
        ☃.a("CustomNameVisible", aN());
      }
      this.au.b(☃);
      if (R()) {
        ☃.a("Silent", R());
      }
      b(☃);
      if (this.m != null)
      {
        dn ☃ = new dn();
        if (this.m.c(☃)) {
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
      
      this.v = ☃.d(0);
      this.w = ☃.d(1);
      this.x = ☃.d(2);
      if (Math.abs(this.v) > 10.0D) {
        this.v = 0.0D;
      }
      if (Math.abs(this.w) > 10.0D) {
        this.w = 0.0D;
      }
      if (Math.abs(this.x) > 10.0D) {
        this.x = 0.0D;
      }
      this.p = (this.P = this.s = ☃.d(0));
      this.q = (this.Q = this.t = ☃.d(1));
      this.r = (this.R = this.u = ☃.d(2));
      
      this.A = (this.y = ☃.e(0));
      this.B = (this.z = ☃.e(1));
      
      f(this.y);
      g(this.y);
      
      this.O = ☃.h("FallDistance");
      this.i = ☃.e("Fire");
      h(☃.e("Air"));
      this.C = ☃.n("OnGround");
      this.am = ☃.f("Dimension");
      this.at = ☃.n("Invulnerable");
      this.aj = ☃.f("PortalCooldown");
      if ((☃.b("UUIDMost", 4)) && (☃.b("UUIDLeast", 4))) {
        this.aq = new UUID(☃.g("UUIDMost"), ☃.g("UUIDLeast"));
      } else if (☃.b("UUID", 8)) {
        this.aq = UUID.fromString(☃.j("UUID"));
      }
      b(this.s, this.t, this.u);
      b(this.y, this.z);
      if ((☃.b("CustomName", 8)) && (☃.j("CustomName").length() > 0)) {
        a(☃.j("CustomName"));
      }
      g(☃.n("CustomNameVisible"));
      this.au.a(☃);
      b(☃.n("Silent"));
      
      a(☃);
      if (af()) {
        b(this.s, this.t, this.u);
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
    if ((☃.b == 0) || (☃.b() == null)) {
      return null;
    }
    uz ☃ = new uz(this.o, this.s, this.t + ☃, this.u, ☃);
    ☃.p();
    this.o.d(☃);
    return ☃;
  }
  
  public boolean ai()
  {
    return !this.I;
  }
  
  public boolean aj()
  {
    if (this.T) {
      return false;
    }
    cj.a ☃ = new cj.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      int ☃ = ns.c(this.t + ((☃ >> 0) % 2 - 0.5F) * 0.1F + aS());
      int ☃ = ns.c(this.s + ((☃ >> 1) % 2 - 0.5F) * this.J * 0.8F);
      int ☃ = ns.c(this.u + ((☃ >> 2) % 2 - 0.5F) * this.J * 0.8F);
      if ((☃.n() != ☃) || (☃.o() != ☃) || (☃.p() != ☃))
      {
        ☃.c(☃, ☃, ☃);
        if (this.o.p(☃).c().w()) {
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
    if (this.m.I)
    {
      this.m = null;
      return;
    }
    this.v = 0.0D;
    this.w = 0.0D;
    this.x = 0.0D;
    t_();
    if (this.m == null) {
      return;
    }
    this.m.al();
    
    this.as += this.m.y - this.m.A;
    this.ar += this.m.z - this.m.B;
    while (this.as >= 180.0D) {
      this.as -= 360.0D;
    }
    while (this.as < -180.0D) {
      this.as += 360.0D;
    }
    while (this.ar >= 180.0D) {
      this.ar -= 360.0D;
    }
    while (this.ar < -180.0D) {
      this.ar += 360.0D;
    }
    double ☃ = this.as * 0.5D;
    double ☃ = this.ar * 0.5D;
    
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
    this.as -= ☃;
    this.ar -= ☃;
  }
  
  public void al()
  {
    if (this.l == null) {
      return;
    }
    this.l.b(this.s, this.t + an() + this.l.am(), this.u);
  }
  
  public double am()
  {
    return 0.0D;
  }
  
  public double an()
  {
    return this.K * 0.75D;
  }
  
  public void a(pk ☃)
  {
    this.ar = 0.0D;
    this.as = 0.0D;
    if (☃ == null)
    {
      if (this.m != null)
      {
        b(this.m.s, this.m.aR().b + this.m.K, this.m.u, this.y, this.z);
        this.m.l = null;
      }
      this.m = null;
      return;
    }
    if (this.m != null) {
      this.m.l = null;
    }
    if (☃ != null)
    {
      pk ☃ = ☃.m;
      while (☃ != null)
      {
        if (☃ == this) {
          return;
        }
        ☃ = ☃.m;
      }
    }
    this.m = ☃;
    ☃.l = this;
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    b(☃, ☃, ☃);
    b(☃, ☃);
    
    List<aug> ☃ = this.o.a(this, aR().d(0.03125D, 0.0D, 0.03125D));
    if (!☃.isEmpty())
    {
      double ☃ = 0.0D;
      for (aug ☃ : ☃) {
        if (☃.e > ☃) {
          ☃ = ☃.e;
        }
      }
      ☃ += ☃ - aR().b;
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
    if (this.aj > 0)
    {
      this.aj = aq();
      return;
    }
    if ((!this.o.D) && (!☃.equals(this.an)))
    {
      this.an = ☃;
      amd.b ☃ = afi.aY.f(this.o, ☃);
      
      double ☃ = ☃.b().k() == cq.a.a ? ☃.a().p() : ☃.a().n();
      double ☃ = ☃.b().k() == cq.a.a ? this.u : this.s;
      ☃ = Math.abs(ns.c(☃ - (☃.b().e().c() == cq.b.b ? 1 : 0), ☃, ☃ - ☃.d()));
      double ☃ = ns.c(this.t - 1.0D, ☃.a().o(), ☃.a().o() - ☃.e());
      this.ao = new aui(☃, ☃, 0.0D);
      this.ap = ☃.b();
    }
    this.ak = true;
  }
  
  public int aq()
  {
    return 300;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    this.v = ☃;
    this.w = ☃;
    this.x = ☃;
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
    boolean ☃ = (this.o != null) && (this.o.D);
    
    return (!this.ab) && ((this.i > 0) || ((☃) && (g(0))));
  }
  
  public boolean au()
  {
    return this.m != null;
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
    return (this.ac.a(0) & 1 << ☃) != 0;
  }
  
  protected void b(int ☃, boolean ☃)
  {
    byte ☃ = this.ac.a(0);
    if (☃) {
      this.ac.b(0, Byte.valueOf((byte)(☃ | 1 << ☃)));
    } else {
      this.ac.b(0, Byte.valueOf((byte)(☃ & (1 << ☃ ^ 0xFFFFFFFF))));
    }
  }
  
  public int az()
  {
    return this.ac.b(1);
  }
  
  public void h(int ☃)
  {
    this.ac.b(1, Short.valueOf((short)☃));
  }
  
  public void a(uv ☃)
  {
    a(ow.b, 5.0F);
    this.i += 1;
    if (this.i == 0) {
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
    
    List<aug> ☃ = this.o.a(aR());
    if ((!☃.isEmpty()) || (this.o.u(☃)))
    {
      int ☃ = 3;
      double ☃ = 9999.0D;
      if ((!this.o.u(☃.e())) && (☃ < ☃))
      {
        ☃ = ☃;
        ☃ = 0;
      }
      if ((!this.o.u(☃.f())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 1;
      }
      if ((!this.o.u(☃.a())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 3;
      }
      if ((!this.o.u(☃.c())) && (☃ < ☃))
      {
        ☃ = ☃;
        ☃ = 4;
      }
      if ((!this.o.u(☃.d())) && (1.0D - ☃ < ☃))
      {
        ☃ = 1.0D - ☃;
        ☃ = 5;
      }
      float ☃ = this.V.nextFloat() * 0.2F + 0.1F;
      if (☃ == 0) {
        this.v = (-☃);
      }
      if (☃ == 1) {
        this.v = ☃;
      }
      if (☃ == 3) {
        this.w = ☃;
      }
      if (☃ == 4) {
        this.x = (-☃);
      }
      if (☃ == 5) {
        this.x = ☃;
      }
      return true;
    }
    return false;
  }
  
  public void aA()
  {
    this.H = true;
    this.O = 0.0F;
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
    return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), e_(), Integer.valueOf(this.c), this.o == null ? "~NULL~" : this.o.P().k(), Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) });
  }
  
  public boolean b(ow ☃)
  {
    return (this.at) && (☃ != ow.j) && (!☃.u());
  }
  
  public void m(pk ☃)
  {
    b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
  }
  
  public void n(pk ☃)
  {
    dn ☃ = new dn();
    ☃.e(☃);
    f(☃);
    this.aj = ☃.aj;
    this.an = ☃.an;
    this.ao = ☃.ao;
    this.ap = ☃.ap;
  }
  
  public void c(int ☃)
  {
    if ((this.o.D) || (this.I)) {
      return;
    }
    this.o.B.a("changeDimension");
    
    MinecraftServer ☃ = MinecraftServer.N();
    int ☃ = this.am;
    le ☃ = ☃.a(☃);
    le ☃ = ☃.a(☃);
    this.am = ☃;
    if ((☃ == 1) && (☃ == 1))
    {
      ☃ = ☃.a(0);
      this.am = 0;
    }
    this.o.e(this);
    this.I = false;
    this.o.B.a("reposition");
    ☃.ap().a(this, ☃, ☃, ☃);
    this.o.B.c("reloading");
    pk ☃ = pm.a(pm.b(this), ☃);
    if (☃ != null)
    {
      ☃.n(this);
      if ((☃ == 1) && (☃ == 1))
      {
        cj ☃ = this.o.r(☃.M());
        ☃.a(☃, ☃.y, ☃.z);
      }
      ☃.d(☃);
    }
    this.I = true;
    this.o.B.b();
    
    ☃.j();
    ☃.j();
    this.o.B.b();
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
    return this.ao;
  }
  
  public cq aH()
  {
    return this.ap;
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
        return pm.b(pk.this) + " (" + pk.this.getClass().getCanonicalName() + ")";
      }
    });
    ☃.a("Entity ID", Integer.valueOf(this.c));
    ☃.a("Entity Name", new Callable()
    {
      public String a()
        throws Exception
      {
        return pk.this.e_();
      }
    });
    ☃.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) }));
    ☃.a("Entity's Block location", c.a(ns.c(this.s), ns.c(this.t), ns.c(this.u)));
    ☃.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.v), Double.valueOf(this.w), Double.valueOf(this.x) }));
    ☃.a("Entity's Rider", new Callable()
    {
      public String a()
        throws Exception
      {
        return pk.this.l.toString();
      }
    });
    ☃.a("Entity's Vehicle", new Callable()
    {
      public String a()
        throws Exception
      {
        return pk.this.m.toString();
      }
    });
  }
  
  public boolean aJ()
  {
    return at();
  }
  
  public UUID aK()
  {
    return this.aq;
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
    this.ac.b(2, ☃);
  }
  
  public String aM()
  {
    return this.ac.e(2);
  }
  
  public boolean l_()
  {
    return this.ac.e(2).length() > 0;
  }
  
  public void g(boolean ☃)
  {
    this.ac.b(3, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public boolean aN()
  {
    return this.ac.a(3) == 1;
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    b(☃, ☃, ☃, this.y, this.z);
  }
  
  public boolean aO()
  {
    return aN();
  }
  
  public void i(int ☃) {}
  
  public cq aP()
  {
    return cq.b(ns.c(this.y * 4.0F / 360.0F + 0.5D) & 0x3);
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
    return this.f;
  }
  
  public void a(aug ☃)
  {
    this.f = ☃;
  }
  
  public float aS()
  {
    return this.K * 0.85F;
  }
  
  public boolean aT()
  {
    return this.g;
  }
  
  public void h(boolean ☃)
  {
    this.g = ☃;
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
    return new cj(this.s, this.t + 0.5D, this.u);
  }
  
  public aui d()
  {
    return new aui(this.s, this.t, this.u);
  }
  
  public adm e()
  {
    return this.o;
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
    this.au.a(this, ☃, ☃);
  }
  
  public n aU()
  {
    return this.au;
  }
  
  public void o(pk ☃)
  {
    this.au.a(☃.aU());
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
