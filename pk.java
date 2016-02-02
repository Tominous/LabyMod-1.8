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
  private int c;
  public double j;
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
  private aug f;
  public boolean C;
  public boolean D;
  public boolean E;
  public boolean F;
  public boolean G;
  protected boolean H;
  private boolean g;
  public boolean I;
  public float J;
  public float K;
  public float L;
  public float M;
  public float N;
  public float O;
  private int h;
  public double P;
  public double Q;
  public double R;
  public float S;
  public boolean T;
  public float U;
  protected Random V;
  public int W;
  public int X;
  private int i;
  protected boolean Y;
  public int Z;
  protected boolean aa;
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
  protected UUID aq;
  private final n au;
  
  public int F()
  {
    return this.c;
  }
  
  public void d(int id)
  {
    this.c = id;
  }
  
  public void G()
  {
    J();
  }
  
  public pk(adm worldIn)
  {
    this.c = (b++);
    this.j = 1.0D;
    this.f = a;
    this.J = 0.6F;
    this.K = 1.8F;
    this.h = 1;
    this.V = new Random();
    this.X = 1;
    this.aa = true;
    this.aq = ns.a(this.V);
    this.au = new n();
    this.o = worldIn;
    b(0.0D, 0.0D, 0.0D);
    if (worldIn != null) {
      this.am = worldIn.t.q();
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
  
  public boolean equals(Object p_equals_1_)
  {
    return ((pk)p_equals_1_).c == this.c;
  }
  
  public int hashCode()
  {
    return this.c;
  }
  
  protected void I()
  {
    if (this.o != null)
    {
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
  }
  
  public void J()
  {
    this.I = true;
  }
  
  protected void a(float width, float height)
  {
    if ((width != this.J) || (height != this.K))
    {
      float f = this.J;
      this.J = width;
      this.K = height;
      a(new aug(aR().a, aR().b, aR().c, aR().a + this.J, aR().b + this.K, aR().c + this.J));
      if ((this.J > f) && (!this.aa) && (!this.o.D)) {
        d(f - this.J, 0.0D, f - this.J);
      }
    }
  }
  
  protected void b(float yaw, float pitch)
  {
    this.y = (yaw % 360.0F);
    this.z = (pitch % 360.0F);
  }
  
  public void b(double x, double y, double z)
  {
    this.s = x;
    this.t = y;
    this.u = z;
    float f = this.J / 2.0F;
    float f1 = this.K;
    a(new aug(x - f, y, z - f, x + f, y + f1, z + f));
  }
  
  public void c(float yaw, float pitch)
  {
    float f = this.z;
    float f1 = this.y;
    this.y = ((float)(this.y + yaw * 0.15D));
    this.z = ((float)(this.z - pitch * 0.15D));
    this.z = ns.a(this.z, -90.0F, 90.0F);
    this.B += this.z - f;
    this.A += this.y - f1;
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
      MinecraftServer minecraftserver = ((le)this.o).r();
      int i = L();
      if (this.ak)
      {
        if (minecraftserver.C())
        {
          if ((this.m == null) && (this.al++ >= i))
          {
            this.al = i;
            this.aj = aq();
            int j;
            int j;
            if (this.o.t.q() == -1) {
              j = 0;
            } else {
              j = -1;
            }
            c(j);
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
    if (!this.ab)
    {
      a(ow.d, 4.0F);
      e(15);
    }
  }
  
  public void e(int seconds)
  {
    int i = seconds * 20;
    i = acr.a(this, i);
    if (this.i < i) {
      this.i = i;
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
  
  public boolean c(double x, double y, double z)
  {
    aug axisalignedbb = aR().c(x, y, z);
    return b(axisalignedbb);
  }
  
  private boolean b(aug bb)
  {
    return (this.o.a(this, bb).isEmpty()) && (!this.o.d(bb));
  }
  
  public void d(double x, double y, double z)
  {
    if (this.T)
    {
      a(aR().c(x, y, z));
      m();
    }
    else
    {
      this.o.B.a("move");
      double d0 = this.s;
      double d1 = this.t;
      double d2 = this.u;
      if (this.H)
      {
        this.H = false;
        x *= 0.25D;
        y *= 0.05000000074505806D;
        z *= 0.25D;
        this.v = 0.0D;
        this.w = 0.0D;
        this.x = 0.0D;
      }
      double d3 = x;
      double d4 = y;
      double d5 = z;
      boolean flag = (this.C) && (av()) && ((this instanceof wn));
      if (flag)
      {
        for (double d6 = 0.05D; (x != 0.0D) && (this.o.a(this, aR().c(x, -1.0D, 0.0D)).isEmpty()); d3 = x) {
          if ((x < d6) && (x >= -d6)) {
            x = 0.0D;
          } else if (x > 0.0D) {
            x -= d6;
          } else {
            x += d6;
          }
        }
        for (; (z != 0.0D) && (this.o.a(this, aR().c(0.0D, -1.0D, z)).isEmpty()); d5 = z) {
          if ((z < d6) && (z >= -d6)) {
            z = 0.0D;
          } else if (z > 0.0D) {
            z -= d6;
          } else {
            z += d6;
          }
        }
        for (; (x != 0.0D) && (z != 0.0D) && (this.o.a(this, aR().c(x, -1.0D, z)).isEmpty()); d5 = z)
        {
          if ((x < d6) && (x >= -d6)) {
            x = 0.0D;
          } else if (x > 0.0D) {
            x -= d6;
          } else {
            x += d6;
          }
          d3 = x;
          if ((z < d6) && (z >= -d6)) {
            z = 0.0D;
          } else if (z > 0.0D) {
            z -= d6;
          } else {
            z += d6;
          }
        }
      }
      List<aug> list1 = this.o.a(this, aR().a(x, y, z));
      aug axisalignedbb = aR();
      for (aug axisalignedbb1 : list1) {
        y = axisalignedbb1.b(aR(), y);
      }
      a(aR().c(0.0D, y, 0.0D));
      boolean flag1 = (this.C) || ((d4 != y) && (d4 < 0.0D));
      for (aug axisalignedbb2 : list1) {
        x = axisalignedbb2.a(aR(), x);
      }
      a(aR().c(x, 0.0D, 0.0D));
      for (aug axisalignedbb13 : list1) {
        z = axisalignedbb13.c(aR(), z);
      }
      a(aR().c(0.0D, 0.0D, z));
      if ((this.S > 0.0F) && (flag1) && ((d3 != x) || (d5 != z)))
      {
        double d11 = x;
        double d7 = y;
        double d8 = z;
        aug axisalignedbb3 = aR();
        a(axisalignedbb);
        y = this.S;
        List<aug> list = this.o.a(this, aR().a(d3, y, d5));
        aug axisalignedbb4 = aR();
        aug axisalignedbb5 = axisalignedbb4.a(d3, 0.0D, d5);
        double d9 = y;
        for (aug axisalignedbb6 : list) {
          d9 = axisalignedbb6.b(axisalignedbb5, d9);
        }
        axisalignedbb4 = axisalignedbb4.c(0.0D, d9, 0.0D);
        double d15 = d3;
        for (aug axisalignedbb7 : list) {
          d15 = axisalignedbb7.a(axisalignedbb4, d15);
        }
        axisalignedbb4 = axisalignedbb4.c(d15, 0.0D, 0.0D);
        double d16 = d5;
        for (aug axisalignedbb8 : list) {
          d16 = axisalignedbb8.c(axisalignedbb4, d16);
        }
        axisalignedbb4 = axisalignedbb4.c(0.0D, 0.0D, d16);
        aug axisalignedbb14 = aR();
        double d17 = y;
        for (aug axisalignedbb9 : list) {
          d17 = axisalignedbb9.b(axisalignedbb14, d17);
        }
        axisalignedbb14 = axisalignedbb14.c(0.0D, d17, 0.0D);
        double d18 = d3;
        for (aug axisalignedbb10 : list) {
          d18 = axisalignedbb10.a(axisalignedbb14, d18);
        }
        axisalignedbb14 = axisalignedbb14.c(d18, 0.0D, 0.0D);
        double d19 = d5;
        for (aug axisalignedbb11 : list) {
          d19 = axisalignedbb11.c(axisalignedbb14, d19);
        }
        axisalignedbb14 = axisalignedbb14.c(0.0D, 0.0D, d19);
        double d20 = d15 * d15 + d16 * d16;
        double d10 = d18 * d18 + d19 * d19;
        if (d20 > d10)
        {
          x = d15;
          z = d16;
          y = -d9;
          a(axisalignedbb4);
        }
        else
        {
          x = d18;
          z = d19;
          y = -d17;
          a(axisalignedbb14);
        }
        for (aug axisalignedbb12 : list) {
          y = axisalignedbb12.b(aR(), y);
        }
        a(aR().c(0.0D, y, 0.0D));
        if (d11 * d11 + d8 * d8 >= x * x + z * z)
        {
          x = d11;
          y = d7;
          z = d8;
          a(axisalignedbb3);
        }
      }
      this.o.B.b();
      this.o.B.a("rest");
      m();
      this.D = ((d3 != x) || (d5 != z));
      this.E = (d4 != y);
      this.C = ((this.E) && (d4 < 0.0D));
      this.F = ((this.D) || (this.E));
      int i = ns.c(this.s);
      int j = ns.c(this.t - 0.20000000298023224D);
      int k = ns.c(this.u);
      cj blockpos = new cj(i, j, k);
      afh block1 = this.o.p(blockpos).c();
      if (block1.t() == arm.a)
      {
        afh block = this.o.p(blockpos.b()).c();
        if (((block instanceof agt)) || ((block instanceof akl)) || ((block instanceof agu)))
        {
          block1 = block;
          blockpos = blockpos.b();
        }
      }
      a(y, this.C, block1, blockpos);
      if (d3 != x) {
        this.v = 0.0D;
      }
      if (d5 != z) {
        this.x = 0.0D;
      }
      if (d4 != y) {
        block1.a(this.o, this);
      }
      if ((s_()) && (!flag) && (this.m == null))
      {
        double d12 = this.s - d0;
        double d13 = this.t - d1;
        double d14 = this.u - d2;
        if (block1 != afi.au) {
          d13 = 0.0D;
        }
        if ((block1 != null) && (this.C)) {
          block1.a(this.o, blockpos, this);
        }
        this.M = ((float)(this.M + ns.a(d12 * d12 + d14 * d14) * 0.6D));
        this.N = ((float)(this.N + ns.a(d12 * d12 + d13 * d13 + d14 * d14) * 0.6D));
        if ((this.N > this.h) && (block1.t() != arm.a))
        {
          this.h = ((int)this.N + 1);
          if (V())
          {
            float f = ns.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.35F;
            if (f > 1.0F) {
              f = 1.0F;
            }
            a(P(), f, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
          }
          a(blockpos, block1);
        }
      }
      try
      {
        Q();
      }
      catch (Throwable throwable)
      {
        b crashreport = b.a(throwable, "Checking entity block collision");
        c crashreportcategory = crashreport.a("Entity being checked for collision");
        a(crashreportcategory);
        throw new e(crashreport);
      }
      boolean flag2 = U();
      if (this.o.e(aR().d(0.001D, 0.001D, 0.001D)))
      {
        f(1);
        if (!flag2)
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
      if ((flag2) && (this.i > 0))
      {
        a("random.fizz", 0.7F, 1.6F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
        this.i = (-this.X);
      }
      this.o.B.b();
    }
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
    cj blockpos = new cj(aR().a + 0.001D, aR().b + 0.001D, aR().c + 0.001D);
    cj blockpos1 = new cj(aR().d - 0.001D, aR().e - 0.001D, aR().f - 0.001D);
    if (this.o.a(blockpos, blockpos1)) {
      for (int i = blockpos.n(); i <= blockpos1.n(); i++) {
        for (int j = blockpos.o(); j <= blockpos1.o(); j++) {
          for (int k = blockpos.p(); k <= blockpos1.p(); k++)
          {
            cj blockpos2 = new cj(i, j, k);
            alz iblockstate = this.o.p(blockpos2);
            try
            {
              iblockstate.c().a(this.o, blockpos2, iblockstate, this);
            }
            catch (Throwable throwable)
            {
              b crashreport = b.a(throwable, "Colliding entity with block");
              c crashreportcategory = crashreport.a("Block being collided with");
              c.a(crashreportcategory, blockpos2, iblockstate);
              throw new e(crashreport);
            }
          }
        }
      }
    }
  }
  
  protected void a(cj pos, afh blockIn)
  {
    afh.b block$soundtype = blockIn.H;
    if (this.o.p(pos.a()).c() == afi.aH)
    {
      block$soundtype = afi.aH.H;
      a(block$soundtype.c(), block$soundtype.d() * 0.15F, block$soundtype.e());
    }
    else if (!blockIn.t().d())
    {
      a(block$soundtype.c(), block$soundtype.d() * 0.15F, block$soundtype.e());
    }
  }
  
  public void a(String name, float volume, float pitch)
  {
    if (!R()) {
      this.o.a(this, name, volume, pitch);
    }
  }
  
  public boolean R()
  {
    return this.ac.a(4) == 1;
  }
  
  public void b(boolean isSilent)
  {
    this.ac.b(4, Byte.valueOf((byte)(isSilent ? 1 : 0)));
  }
  
  protected boolean s_()
  {
    return true;
  }
  
  protected void a(double y, boolean onGroundIn, afh blockIn, cj pos)
  {
    if (onGroundIn)
    {
      if (this.O > 0.0F)
      {
        if (blockIn != null) {
          blockIn.a(this.o, pos, this, this.O);
        } else {
          e(this.O, 1.0F);
        }
        this.O = 0.0F;
      }
    }
    else if (y < 0.0D) {
      this.O = ((float)(this.O - y));
    }
  }
  
  public aug S()
  {
    return null;
  }
  
  protected void f(int amount)
  {
    if (!this.ab) {
      a(ow.a, amount);
    }
  }
  
  public final boolean T()
  {
    return this.ab;
  }
  
  public void e(float distance, float damageMultiplier)
  {
    if (this.l != null) {
      this.l.e(distance, damageMultiplier);
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
    float f = ns.a(this.v * this.v * 0.20000000298023224D + this.w * this.w + this.x * this.x * 0.20000000298023224D) * 0.2F;
    if (f > 1.0F) {
      f = 1.0F;
    }
    a(aa(), f, 1.0F + (this.V.nextFloat() - this.V.nextFloat()) * 0.4F);
    float f1 = ns.c(aR().b);
    for (int i = 0; i < 1.0F + this.J * 20.0F; i++)
    {
      float f2 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      float f3 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      this.o.a(cy.e, this.s + f2, f1 + 1.0F, this.u + f3, this.v, this.w - this.V.nextFloat() * 0.2F, this.x, new int[0]);
    }
    for (int j = 0; j < 1.0F + this.J * 20.0F; j++)
    {
      float f4 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      float f5 = (this.V.nextFloat() * 2.0F - 1.0F) * this.J;
      this.o.a(cy.f, this.s + f4, f1 + 1.0F, this.u + f5, this.v, this.w, this.x, new int[0]);
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
    int i = ns.c(this.s);
    int j = ns.c(this.t - 0.20000000298023224D);
    int k = ns.c(this.u);
    cj blockpos = new cj(i, j, k);
    alz iblockstate = this.o.p(blockpos);
    afh block = iblockstate.c();
    if (block.b() != -1) {
      this.o.a(cy.L, this.s + (this.V.nextFloat() - 0.5D) * this.J, aR().b + 0.1D, this.u + (this.V.nextFloat() - 0.5D) * this.J, -this.v * 4.0D, 1.5D, -this.x * 4.0D, new int[] { afh.f(iblockstate) });
    }
  }
  
  protected String aa()
  {
    return "game.neutral.swim.splash";
  }
  
  public boolean a(arm materialIn)
  {
    double d0 = this.t + aS();
    cj blockpos = new cj(this.s, d0, this.u);
    alz iblockstate = this.o.p(blockpos);
    afh block = iblockstate.c();
    if (block.t() == materialIn)
    {
      float f = ahv.b(iblockstate.c().c(iblockstate)) - 0.11111111F;
      float f1 = blockpos.o() + 1 - f;
      boolean flag = d0 < f1;
      return (!flag) && ((this instanceof wn)) ? false : flag;
    }
    return false;
  }
  
  public boolean ab()
  {
    return this.o.a(aR().b(-0.10000000149011612D, -0.4000000059604645D, -0.10000000149011612D), arm.i);
  }
  
  public void a(float strafe, float forward, float friction)
  {
    float f = strafe * strafe + forward * forward;
    if (f >= 1.0E-4F)
    {
      f = ns.c(f);
      if (f < 1.0F) {
        f = 1.0F;
      }
      f = friction / f;
      strafe *= f;
      forward *= f;
      float f1 = ns.a(this.y * 3.1415927F / 180.0F);
      float f2 = ns.b(this.y * 3.1415927F / 180.0F);
      this.v += strafe * f2 - forward * f1;
      this.x += forward * f2 + strafe * f1;
    }
  }
  
  public int b(float partialTicks)
  {
    cj blockpos = new cj(this.s, this.t + aS(), this.u);
    return this.o.e(blockpos) ? this.o.b(blockpos, 0) : 0;
  }
  
  public float c(float partialTicks)
  {
    cj blockpos = new cj(this.s, this.t + aS(), this.u);
    return this.o.e(blockpos) ? this.o.o(blockpos) : 0.0F;
  }
  
  public void a(adm worldIn)
  {
    this.o = worldIn;
  }
  
  public void a(double x, double y, double z, float yaw, float pitch)
  {
    this.p = (this.s = x);
    this.q = (this.t = y);
    this.r = (this.u = z);
    this.A = (this.y = yaw);
    this.B = (this.z = pitch);
    double d0 = this.A - yaw;
    if (d0 < -180.0D) {
      this.A += 360.0F;
    }
    if (d0 >= 180.0D) {
      this.A -= 360.0F;
    }
    b(this.s, this.t, this.u);
    b(yaw, pitch);
  }
  
  public void a(cj pos, float rotationYawIn, float rotationPitchIn)
  {
    b(pos.n() + 0.5D, pos.o(), pos.p() + 0.5D, rotationYawIn, rotationPitchIn);
  }
  
  public void b(double x, double y, double z, float yaw, float pitch)
  {
    this.P = (this.p = this.s = x);
    this.Q = (this.q = this.t = y);
    this.R = (this.r = this.u = z);
    this.y = yaw;
    this.z = pitch;
    b(this.s, this.t, this.u);
  }
  
  public float g(pk entityIn)
  {
    float f = (float)(this.s - entityIn.s);
    float f1 = (float)(this.t - entityIn.t);
    float f2 = (float)(this.u - entityIn.u);
    return ns.c(f * f + f1 * f1 + f2 * f2);
  }
  
  public double e(double x, double y, double z)
  {
    double d0 = this.s - x;
    double d1 = this.t - y;
    double d2 = this.u - z;
    return d0 * d0 + d1 * d1 + d2 * d2;
  }
  
  public double b(cj pos)
  {
    return pos.c(this.s, this.t, this.u);
  }
  
  public double c(cj pos)
  {
    return pos.d(this.s, this.t, this.u);
  }
  
  public double f(double x, double y, double z)
  {
    double d0 = this.s - x;
    double d1 = this.t - y;
    double d2 = this.u - z;
    return ns.a(d0 * d0 + d1 * d1 + d2 * d2);
  }
  
  public double h(pk entityIn)
  {
    double d0 = this.s - entityIn.s;
    double d1 = this.t - entityIn.t;
    double d2 = this.u - entityIn.u;
    return d0 * d0 + d1 * d1 + d2 * d2;
  }
  
  public void d(wn entityIn) {}
  
  public void i(pk entityIn)
  {
    if ((entityIn.l != this) && (entityIn.m != this)) {
      if ((!entityIn.T) && (!this.T))
      {
        double d0 = entityIn.s - this.s;
        double d1 = entityIn.u - this.u;
        double d2 = ns.a(d0, d1);
        if (d2 >= 0.009999999776482582D)
        {
          d2 = ns.a(d2);
          d0 /= d2;
          d1 /= d2;
          double d3 = 1.0D / d2;
          if (d3 > 1.0D) {
            d3 = 1.0D;
          }
          d0 *= d3;
          d1 *= d3;
          d0 *= 0.05000000074505806D;
          d1 *= 0.05000000074505806D;
          d0 *= (1.0F - this.U);
          d1 *= (1.0F - this.U);
          if (this.l == null) {
            g(-d0, 0.0D, -d1);
          }
          if (entityIn.l == null) {
            entityIn.g(d0, 0.0D, d1);
          }
        }
      }
    }
  }
  
  public void g(double x, double y, double z)
  {
    this.v += x;
    this.w += y;
    this.x += z;
    this.ai = true;
  }
  
  protected void ac()
  {
    this.G = true;
  }
  
  public boolean a(ow source, float amount)
  {
    if (b(source)) {
      return false;
    }
    ac();
    return false;
  }
  
  public aui d(float partialTicks)
  {
    if (partialTicks == 1.0F) {
      return f(this.z, this.y);
    }
    float f = this.B + (this.z - this.B) * partialTicks;
    float f1 = this.A + (this.y - this.A) * partialTicks;
    return f(f, f1);
  }
  
  protected final aui f(float pitch, float yaw)
  {
    float f = ns.b(-yaw * 0.017453292F - 3.1415927F);
    float f1 = ns.a(-yaw * 0.017453292F - 3.1415927F);
    float f2 = -ns.b(-pitch * 0.017453292F);
    float f3 = ns.a(-pitch * 0.017453292F);
    return new aui(f1 * f2, f3, f * f2);
  }
  
  public aui e(float partialTicks)
  {
    if (partialTicks == 1.0F) {
      return new aui(this.s, this.t + aS(), this.u);
    }
    double d0 = this.p + (this.s - this.p) * partialTicks;
    double d1 = this.q + (this.t - this.q) * partialTicks + aS();
    double d2 = this.r + (this.u - this.r) * partialTicks;
    return new aui(d0, d1, d2);
  }
  
  public auh a(double blockReachDistance, float partialTicks)
  {
    aui vec3 = e(partialTicks);
    aui vec31 = d(partialTicks);
    aui vec32 = vec3.b(vec31.a * blockReachDistance, vec31.b * blockReachDistance, vec31.c * blockReachDistance);
    return this.o.a(vec3, vec32, false, false, true);
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public boolean ae()
  {
    return false;
  }
  
  public void b(pk entityIn, int amount) {}
  
  public boolean h(double x, double y, double z)
  {
    double d0 = this.s - x;
    double d1 = this.t - y;
    double d2 = this.u - z;
    double d3 = d0 * d0 + d1 * d1 + d2 * d2;
    return a(d3);
  }
  
  public boolean a(double distance)
  {
    double d0 = aR().a();
    if (Double.isNaN(d0)) {
      d0 = 1.0D;
    }
    d0 = d0 * 64.0D * this.j;
    return distance < d0 * d0;
  }
  
  public boolean c(dn tagCompund)
  {
    String s = ag();
    if ((!this.I) && (s != null))
    {
      tagCompund.a("id", s);
      e(tagCompund);
      return true;
    }
    return false;
  }
  
  public boolean d(dn tagCompund)
  {
    String s = ag();
    if ((!this.I) && (s != null) && (this.l == null))
    {
      tagCompund.a("id", s);
      e(tagCompund);
      return true;
    }
    return false;
  }
  
  public void e(dn tagCompund)
  {
    try
    {
      tagCompund.a("Pos", a(new double[] { this.s, this.t, this.u }));
      tagCompund.a("Motion", a(new double[] { this.v, this.w, this.x }));
      tagCompund.a("Rotation", a(new float[] { this.y, this.z }));
      tagCompund.a("FallDistance", this.O);
      tagCompund.a("Fire", (short)this.i);
      tagCompund.a("Air", (short)az());
      tagCompund.a("OnGround", this.C);
      tagCompund.a("Dimension", this.am);
      tagCompund.a("Invulnerable", this.at);
      tagCompund.a("PortalCooldown", this.aj);
      tagCompund.a("UUIDMost", aK().getMostSignificantBits());
      tagCompund.a("UUIDLeast", aK().getLeastSignificantBits());
      if ((aM() != null) && (aM().length() > 0))
      {
        tagCompund.a("CustomName", aM());
        tagCompund.a("CustomNameVisible", aN());
      }
      this.au.b(tagCompund);
      if (R()) {
        tagCompund.a("Silent", R());
      }
      b(tagCompund);
      if (this.m != null)
      {
        dn nbttagcompound = new dn();
        if (this.m.c(nbttagcompound)) {
          tagCompund.a("Riding", nbttagcompound);
        }
      }
    }
    catch (Throwable throwable)
    {
      b crashreport = b.a(throwable, "Saving entity NBT");
      c crashreportcategory = crashreport.a("Entity being saved");
      a(crashreportcategory);
      throw new e(crashreport);
    }
  }
  
  public void f(dn tagCompund)
  {
    try
    {
      du nbttaglist = tagCompund.c("Pos", 6);
      du nbttaglist1 = tagCompund.c("Motion", 6);
      du nbttaglist2 = tagCompund.c("Rotation", 5);
      this.v = nbttaglist1.d(0);
      this.w = nbttaglist1.d(1);
      this.x = nbttaglist1.d(2);
      if (Math.abs(this.v) > 10.0D) {
        this.v = 0.0D;
      }
      if (Math.abs(this.w) > 10.0D) {
        this.w = 0.0D;
      }
      if (Math.abs(this.x) > 10.0D) {
        this.x = 0.0D;
      }
      this.p = (this.P = this.s = nbttaglist.d(0));
      this.q = (this.Q = this.t = nbttaglist.d(1));
      this.r = (this.R = this.u = nbttaglist.d(2));
      this.A = (this.y = nbttaglist2.e(0));
      this.B = (this.z = nbttaglist2.e(1));
      f(this.y);
      g(this.y);
      this.O = tagCompund.h("FallDistance");
      this.i = tagCompund.e("Fire");
      h(tagCompund.e("Air"));
      this.C = tagCompund.n("OnGround");
      this.am = tagCompund.f("Dimension");
      this.at = tagCompund.n("Invulnerable");
      this.aj = tagCompund.f("PortalCooldown");
      if ((tagCompund.b("UUIDMost", 4)) && (tagCompund.b("UUIDLeast", 4))) {
        this.aq = new UUID(tagCompund.g("UUIDMost"), tagCompund.g("UUIDLeast"));
      } else if (tagCompund.b("UUID", 8)) {
        this.aq = UUID.fromString(tagCompund.j("UUID"));
      }
      b(this.s, this.t, this.u);
      b(this.y, this.z);
      if ((tagCompund.b("CustomName", 8)) && (tagCompund.j("CustomName").length() > 0)) {
        a(tagCompund.j("CustomName"));
      }
      g(tagCompund.n("CustomNameVisible"));
      this.au.a(tagCompund);
      b(tagCompund.n("Silent"));
      a(tagCompund);
      if (af()) {
        b(this.s, this.t, this.u);
      }
    }
    catch (Throwable throwable)
    {
      b crashreport = b.a(throwable, "Loading entity NBT");
      c crashreportcategory = crashreport.a("Entity being loaded");
      a(crashreportcategory);
      throw new e(crashreport);
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
  
  protected du a(double... numbers)
  {
    du nbttaglist = new du();
    for (double d0 : numbers) {
      nbttaglist.a(new dp(d0));
    }
    return nbttaglist;
  }
  
  protected du a(float... numbers)
  {
    du nbttaglist = new du();
    for (float f : numbers) {
      nbttaglist.a(new dr(f));
    }
    return nbttaglist;
  }
  
  public uz a(zw itemIn, int size)
  {
    return a(itemIn, size, 0.0F);
  }
  
  public uz a(zw itemIn, int size, float offsetY)
  {
    return a(new zx(itemIn, size, 0), offsetY);
  }
  
  public uz a(zx itemStackIn, float offsetY)
  {
    if ((itemStackIn.b != 0) && (itemStackIn.b() != null))
    {
      uz entityitem = new uz(this.o, this.s, this.t + offsetY, this.u, itemStackIn);
      entityitem.p();
      this.o.d(entityitem);
      return entityitem;
    }
    return null;
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
    cj.a blockpos$mutableblockpos = new cj.a(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    for (int i = 0; i < 8; i++)
    {
      int j = ns.c(this.t + ((i >> 0) % 2 - 0.5F) * 0.1F + aS());
      int k = ns.c(this.s + ((i >> 1) % 2 - 0.5F) * this.J * 0.8F);
      int l = ns.c(this.u + ((i >> 2) % 2 - 0.5F) * this.J * 0.8F);
      if ((blockpos$mutableblockpos.n() != k) || (blockpos$mutableblockpos.o() != j) || (blockpos$mutableblockpos.p() != l))
      {
        blockpos$mutableblockpos.c(k, j, l);
        if (this.o.p(blockpos$mutableblockpos).c().w()) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean e(wn playerIn)
  {
    return false;
  }
  
  public aug j(pk entityIn)
  {
    return null;
  }
  
  public void ak()
  {
    if (this.m.I)
    {
      this.m = null;
    }
    else
    {
      this.v = 0.0D;
      this.w = 0.0D;
      this.x = 0.0D;
      t_();
      if (this.m != null)
      {
        this.m.al();
        this.as += this.m.y - this.m.A;
        for (this.ar += this.m.z - this.m.B; this.as >= 180.0D; this.as -= 360.0D) {}
        while (this.as < -180.0D) {
          this.as += 360.0D;
        }
        while (this.ar >= 180.0D) {
          this.ar -= 360.0D;
        }
        while (this.ar < -180.0D) {
          this.ar += 360.0D;
        }
        double d0 = this.as * 0.5D;
        double d1 = this.ar * 0.5D;
        float f = 10.0F;
        if (d0 > f) {
          d0 = f;
        }
        if (d0 < -f) {
          d0 = -f;
        }
        if (d1 > f) {
          d1 = f;
        }
        if (d1 < -f) {
          d1 = -f;
        }
        this.as -= d0;
        this.ar -= d1;
      }
    }
  }
  
  public void al()
  {
    if (this.l != null) {
      this.l.b(this.s, this.t + an() + this.l.am(), this.u);
    }
  }
  
  public double am()
  {
    return 0.0D;
  }
  
  public double an()
  {
    return this.K * 0.75D;
  }
  
  public void a(pk entityIn)
  {
    this.ar = 0.0D;
    this.as = 0.0D;
    if (entityIn == null)
    {
      if (this.m != null)
      {
        b(this.m.s, this.m.aR().b + this.m.K, this.m.u, this.y, this.z);
        this.m.l = null;
      }
      this.m = null;
    }
    else
    {
      if (this.m != null) {
        this.m.l = null;
      }
      if (entityIn != null) {
        for (pk entity = entityIn.m; entity != null; entity = entity.m) {
          if (entity == this) {
            return;
          }
        }
      }
      this.m = entityIn;
      entityIn.l = this;
    }
  }
  
  public void a(double x, double y, double z, float yaw, float pitch, int posRotationIncrements, boolean p_180426_10_)
  {
    b(x, y, z);
    b(yaw, pitch);
    List<aug> list = this.o.a(this, aR().d(0.03125D, 0.0D, 0.03125D));
    if (!list.isEmpty())
    {
      double d0 = 0.0D;
      for (aug axisalignedbb : list) {
        if (axisalignedbb.e > d0) {
          d0 = axisalignedbb.e;
        }
      }
      y += d0 - aR().b;
      b(x, y, z);
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
  
  public void d(cj p_181015_1_)
  {
    if (this.aj > 0)
    {
      this.aj = aq();
    }
    else
    {
      if ((!this.o.D) && (!p_181015_1_.equals(this.an)))
      {
        this.an = p_181015_1_;
        amd.b blockpattern$patternhelper = afi.aY.f(this.o, p_181015_1_);
        double d0 = blockpattern$patternhelper.b().k() == cq.a.a ? blockpattern$patternhelper.a().p() : blockpattern$patternhelper.a().n();
        double d1 = blockpattern$patternhelper.b().k() == cq.a.a ? this.u : this.s;
        d1 = Math.abs(ns.c(d1 - (blockpattern$patternhelper.b().e().c() == cq.b.b ? 1 : 0), d0, d0 - blockpattern$patternhelper.d()));
        double d2 = ns.c(this.t - 1.0D, blockpattern$patternhelper.a().o(), blockpattern$patternhelper.a().o() - blockpattern$patternhelper.e());
        this.ao = new aui(d1, d2, 0.0D);
        this.ap = blockpattern$patternhelper.b();
      }
      this.ak = true;
    }
  }
  
  public int aq()
  {
    return 300;
  }
  
  public void i(double x, double y, double z)
  {
    this.v = x;
    this.w = y;
    this.x = z;
  }
  
  public void a(byte id) {}
  
  public void ar() {}
  
  public zx[] as()
  {
    return null;
  }
  
  public void c(int slotIn, zx stack) {}
  
  public boolean at()
  {
    boolean flag = (this.o != null) && (this.o.D);
    return (!this.ab) && ((this.i > 0) || ((flag) && (g(0))));
  }
  
  public boolean au()
  {
    return this.m != null;
  }
  
  public boolean av()
  {
    return g(1);
  }
  
  public void c(boolean sneaking)
  {
    b(1, sneaking);
  }
  
  public boolean aw()
  {
    return g(3);
  }
  
  public void d(boolean sprinting)
  {
    b(3, sprinting);
  }
  
  public boolean ax()
  {
    return g(5);
  }
  
  public boolean f(wn player)
  {
    return player.v() ? false : ax();
  }
  
  public void e(boolean invisible)
  {
    b(5, invisible);
  }
  
  public boolean ay()
  {
    return g(4);
  }
  
  public void f(boolean eating)
  {
    b(4, eating);
  }
  
  boolean blocking = false;
  
  public boolean isBlocking()
  {
    return this.blocking;
  }
  
  public void setBlocking(boolean blocking)
  {
    this.blocking = blocking;
  }
  
  protected boolean g(int flag)
  {
    return (this.ac.a(0) & 1 << flag) != 0;
  }
  
  protected void b(int flag, boolean set)
  {
    byte b0 = this.ac.a(0);
    if (set) {
      this.ac.b(0, Byte.valueOf((byte)(b0 | 1 << flag)));
    } else {
      this.ac.b(0, Byte.valueOf((byte)(b0 & (1 << flag ^ 0xFFFFFFFF))));
    }
  }
  
  public int az()
  {
    return this.ac.b(1);
  }
  
  public void h(int air)
  {
    this.ac.b(1, Short.valueOf((short)air));
  }
  
  public void a(uv lightningBolt)
  {
    a(ow.b, 5.0F);
    this.i += 1;
    if (this.i == 0) {
      e(8);
    }
  }
  
  public void a(pr entityLivingIn) {}
  
  protected boolean j(double x, double y, double z)
  {
    cj blockpos = new cj(x, y, z);
    double d0 = x - blockpos.n();
    double d1 = y - blockpos.o();
    double d2 = z - blockpos.p();
    List<aug> list = this.o.a(aR());
    if ((list.isEmpty()) && (!this.o.u(blockpos))) {
      return false;
    }
    int i = 3;
    double d3 = 9999.0D;
    if ((!this.o.u(blockpos.e())) && (d0 < d3))
    {
      d3 = d0;
      i = 0;
    }
    if ((!this.o.u(blockpos.f())) && (1.0D - d0 < d3))
    {
      d3 = 1.0D - d0;
      i = 1;
    }
    if ((!this.o.u(blockpos.a())) && (1.0D - d1 < d3))
    {
      d3 = 1.0D - d1;
      i = 3;
    }
    if ((!this.o.u(blockpos.c())) && (d2 < d3))
    {
      d3 = d2;
      i = 4;
    }
    if ((!this.o.u(blockpos.d())) && (1.0D - d2 < d3))
    {
      d3 = 1.0D - d2;
      i = 5;
    }
    float f = this.V.nextFloat() * 0.2F + 0.1F;
    if (i == 0) {
      this.v = (-f);
    }
    if (i == 1) {
      this.v = f;
    }
    if (i == 3) {
      this.w = f;
    }
    if (i == 4) {
      this.x = (-f);
    }
    if (i == 5) {
      this.x = f;
    }
    return true;
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
    String s = pm.b(this);
    if (s == null) {
      s = "generic";
    }
    return di.a("entity." + s + ".name");
  }
  
  public pk[] aB()
  {
    return null;
  }
  
  public boolean k(pk entityIn)
  {
    return this == entityIn;
  }
  
  public float aC()
  {
    return 0.0F;
  }
  
  public void f(float rotation) {}
  
  public void g(float p_181013_1_) {}
  
  public boolean aD()
  {
    return true;
  }
  
  public boolean l(pk entityIn)
  {
    return false;
  }
  
  public String toString()
  {
    return String.format("%s['%s'/%d, l='%s', x=%.2f, y=%.2f, z=%.2f]", new Object[] { getClass().getSimpleName(), e_(), Integer.valueOf(this.c), this.o == null ? "~NULL~" : this.o.P().k(), Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) });
  }
  
  public boolean b(ow source)
  {
    return (this.at) && (source != ow.j) && (!source.u());
  }
  
  public void m(pk entityIn)
  {
    b(entityIn.s, entityIn.t, entityIn.u, entityIn.y, entityIn.z);
  }
  
  public void n(pk entityIn)
  {
    dn nbttagcompound = new dn();
    entityIn.e(nbttagcompound);
    f(nbttagcompound);
    this.aj = entityIn.aj;
    this.an = entityIn.an;
    this.ao = entityIn.ao;
    this.ap = entityIn.ap;
  }
  
  public void c(int dimensionId)
  {
    if ((!this.o.D) && (!this.I))
    {
      this.o.B.a("changeDimension");
      MinecraftServer minecraftserver = MinecraftServer.N();
      int i = this.am;
      le worldserver = minecraftserver.a(i);
      le worldserver1 = minecraftserver.a(dimensionId);
      this.am = dimensionId;
      if ((i == 1) && (dimensionId == 1))
      {
        worldserver1 = minecraftserver.a(0);
        this.am = 0;
      }
      this.o.e(this);
      this.I = false;
      this.o.B.a("reposition");
      minecraftserver.ap().a(this, i, worldserver, worldserver1);
      this.o.B.c("reloading");
      pk entity = pm.a(pm.b(this), worldserver1);
      if (entity != null)
      {
        entity.n(this);
        if ((i == 1) && (dimensionId == 1))
        {
          cj blockpos = this.o.r(worldserver1.M());
          entity.a(blockpos, entity.y, entity.z);
        }
        worldserver1.d(entity);
      }
      this.I = true;
      this.o.B.b();
      worldserver.j();
      worldserver1.j();
      this.o.B.b();
    }
  }
  
  public float a(adi explosionIn, adm worldIn, cj pos, alz blockStateIn)
  {
    return blockStateIn.c().a(this);
  }
  
  public boolean a(adi explosionIn, adm worldIn, cj pos, alz blockStateIn, float p_174816_5_)
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
  
  public void a(c category)
  {
    category.a("Entity Type", new Callable()
    {
      public String a()
        throws Exception
      {
        return pm.b(pk.this) + " (" + pk.this.getClass().getCanonicalName() + ")";
      }
    });
    category.a("Entity ID", Integer.valueOf(this.c));
    category.a("Entity Name", new Callable()
    {
      public String a()
        throws Exception
      {
        return pk.this.e_();
      }
    });
    category.a("Entity's Exact location", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.s), Double.valueOf(this.t), Double.valueOf(this.u) }));
    category.a("Entity's Block location", c.a(ns.c(this.s), ns.c(this.t), ns.c(this.u)));
    category.a("Entity's Momentum", String.format("%.2f, %.2f, %.2f", new Object[] { Double.valueOf(this.v), Double.valueOf(this.w), Double.valueOf(this.x) }));
    category.a("Entity's Rider", new Callable()
    {
      public String a()
        throws Exception
      {
        return pk.this.l.toString();
      }
    });
    category.a("Entity's Vehicle", new Callable()
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
    fa chatcomponenttext = new fa(e_());
    chatcomponenttext.b().a(aQ());
    chatcomponenttext.b().a(aK().toString());
    return chatcomponenttext;
  }
  
  public void a(String name)
  {
    this.ac.b(2, name);
  }
  
  public String aM()
  {
    return this.ac.e(2);
  }
  
  public boolean l_()
  {
    return this.ac.e(2).length() > 0;
  }
  
  public void g(boolean alwaysRenderNameTag)
  {
    this.ac.b(3, Byte.valueOf((byte)(alwaysRenderNameTag ? 1 : 0)));
  }
  
  public boolean aN()
  {
    return this.ac.a(3) == 1;
  }
  
  public void a(double x, double y, double z)
  {
    b(x, y, z, this.y, this.z);
  }
  
  public boolean aO()
  {
    return aN();
  }
  
  public void i(int dataID) {}
  
  public cq aP()
  {
    return cq.b(ns.c(this.y * 4.0F / 360.0F + 0.5D) & 0x3);
  }
  
  protected ew aQ()
  {
    dn nbttagcompound = new dn();
    String s = pm.b(this);
    nbttagcompound.a("id", aK().toString());
    if (s != null) {
      nbttagcompound.a("type", s);
    }
    nbttagcompound.a("name", e_());
    return new ew(ew.a.d, new fa(nbttagcompound.toString()));
  }
  
  public boolean a(lf player)
  {
    return true;
  }
  
  public aug aR()
  {
    return this.f;
  }
  
  public void a(aug bb)
  {
    this.f = bb;
  }
  
  public float aS()
  {
    return this.K * 0.85F;
  }
  
  public boolean aT()
  {
    return this.g;
  }
  
  public void h(boolean outsideBorder)
  {
    this.g = outsideBorder;
  }
  
  public boolean d(int inventorySlot, zx itemStackIn)
  {
    return false;
  }
  
  public void a(eu component) {}
  
  public boolean a(int permLevel, String commandName)
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
  
  public void a(n.a type, int amount)
  {
    this.au.a(this, type, amount);
  }
  
  public n aU()
  {
    return this.au;
  }
  
  public void o(pk entityIn)
  {
    this.au.a(entityIn.aU());
  }
  
  public dn aV()
  {
    return null;
  }
  
  public void g(dn compound) {}
  
  public boolean a(wn player, aui targetVec3)
  {
    return false;
  }
  
  public boolean aW()
  {
    return false;
  }
  
  protected void a(pr entityLivingBaseIn, pk entityIn)
  {
    if ((entityIn instanceof pr)) {
      ack.a((pr)entityIn, entityLivingBaseIn);
    }
    ack.b(entityLivingBaseIn, entityIn);
  }
}
