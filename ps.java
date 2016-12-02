import java.util.List;
import java.util.Random;
import java.util.UUID;

public abstract class ps
  extends pr
{
  public int a_;
  protected int b_;
  private qp a;
  protected qq f;
  protected qo g;
  private qm b;
  protected sw h;
  protected final re i;
  protected final re bi;
  private pr c;
  private ta bk;
  private zx[] bl = new zx[5];
  protected float[] bj = new float[5];
  private boolean bm;
  private boolean bn;
  private boolean bo;
  private pk bp;
  private dn bq;
  
  public ps(adm ☃)
  {
    super(☃);
    
    this.i = new re((☃ == null) || (☃.B == null) ? null : ☃.B);
    this.bi = new re((☃ == null) || (☃.B == null) ? null : ☃.B);
    this.a = new qp(this);
    this.f = new qq(this);
    this.g = new qo(this);
    this.b = new qm(this);
    this.h = b(☃);
    this.bk = new ta(this);
    for (int ☃ = 0; ☃ < this.bj.length; ☃++) {
      this.bj[☃] = 0.085F;
    }
  }
  
  protected void aX()
  {
    super.aX();
    
    by().b(vy.b).a(16.0D);
  }
  
  protected sw b(adm ☃)
  {
    return new sv(this, ☃);
  }
  
  public qp p()
  {
    return this.a;
  }
  
  public qq q()
  {
    return this.f;
  }
  
  public qo r()
  {
    return this.g;
  }
  
  public sw s()
  {
    return this.h;
  }
  
  public ta t()
  {
    return this.bk;
  }
  
  public pr u()
  {
    return this.c;
  }
  
  public void d(pr ☃)
  {
    this.c = ☃;
  }
  
  public boolean a(Class<? extends pr> ☃)
  {
    return ☃ != vr.class;
  }
  
  public void v() {}
  
  protected void h()
  {
    super.h();
    this.ac.a(15, Byte.valueOf((byte)0));
  }
  
  public int w()
  {
    return 80;
  }
  
  public void x()
  {
    String ☃ = z();
    if (☃ != null) {
      a(☃, bB(), bC());
    }
  }
  
  public void K()
  {
    super.K();
    
    this.o.B.a("mobBaseTick");
    if ((ai()) && (this.V.nextInt(1000) < this.a_++))
    {
      this.a_ = (-w());
      x();
    }
    this.o.B.b();
  }
  
  protected int b(wn ☃)
  {
    if (this.b_ > 0)
    {
      int ☃ = this.b_;
      
      zx[] ☃ = as();
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        if ((☃[☃] != null) && (this.bj[☃] <= 1.0F)) {
          ☃ += 1 + this.V.nextInt(3);
        }
      }
      return ☃;
    }
    return this.b_;
  }
  
  public void y()
  {
    if (this.o.D) {
      for (int ☃ = 0; ☃ < 20; ☃++)
      {
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = this.V.nextGaussian() * 0.02D;
        double ☃ = 10.0D;
        this.o.a(cy.a, this.s + this.V.nextFloat() * this.J * 2.0F - this.J - ☃ * ☃, this.t + this.V.nextFloat() * this.K - ☃ * ☃, this.u + this.V.nextFloat() * this.J * 2.0F - this.J - ☃ * ☃, ☃, ☃, ☃, new int[0]);
      }
    } else {
      this.o.a(this, (byte)20);
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 20) {
      y();
    } else {
      super.a(☃);
    }
  }
  
  public void t_()
  {
    super.t_();
    if (!this.o.D) {
      ca();
    }
  }
  
  protected float h(float ☃, float ☃)
  {
    this.b.a();
    return ☃;
  }
  
  protected String z()
  {
    return null;
  }
  
  protected zw A()
  {
    return null;
  }
  
  protected void b(boolean ☃, int ☃)
  {
    zw ☃ = A();
    if (☃ != null)
    {
      int ☃ = this.V.nextInt(3);
      if (☃ > 0) {
        ☃ += this.V.nextInt(☃ + 1);
      }
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        a(☃, 1);
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("CanPickUpLoot", bY());
    ☃.a("PersistenceRequired", this.bn);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.bl.length; ☃++)
    {
      dn ☃ = new dn();
      if (this.bl[☃] != null) {
        this.bl[☃].b(☃);
      }
      ☃.a(☃);
    }
    ☃.a("Equipment", ☃);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.bj.length; ☃++) {
      ☃.a(new dr(this.bj[☃]));
    }
    ☃.a("DropChances", ☃);
    
    ☃.a("Leashed", this.bo);
    if (this.bp != null)
    {
      dn ☃ = new dn();
      if ((this.bp instanceof pr))
      {
        ☃.a("UUIDMost", this.bp.aK().getMostSignificantBits());
        ☃.a("UUIDLeast", this.bp.aK().getLeastSignificantBits());
      }
      else if ((this.bp instanceof un))
      {
        cj ☃ = ((un)this.bp).n();
        ☃.a("X", ☃.n());
        ☃.a("Y", ☃.o());
        ☃.a("Z", ☃.p());
      }
      ☃.a("Leash", ☃);
    }
    if (ce()) {
      ☃.a("NoAI", ce());
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    if (☃.b("CanPickUpLoot", 1)) {
      j(☃.n("CanPickUpLoot"));
    }
    this.bn = ☃.n("PersistenceRequired");
    if (☃.b("Equipment", 9))
    {
      du ☃ = ☃.c("Equipment", 10);
      for (int ☃ = 0; ☃ < this.bl.length; ☃++) {
        this.bl[☃] = zx.a(☃.b(☃));
      }
    }
    if (☃.b("DropChances", 9))
    {
      du ☃ = ☃.c("DropChances", 5);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        this.bj[☃] = ☃.e(☃);
      }
    }
    this.bo = ☃.n("Leashed");
    if ((this.bo) && (☃.b("Leash", 10))) {
      this.bq = ☃.m("Leash");
    }
    k(☃.n("NoAI"));
  }
  
  public void n(float ☃)
  {
    this.ba = ☃;
  }
  
  public void k(float ☃)
  {
    super.k(☃);
    n(☃);
  }
  
  public void m()
  {
    super.m();
    
    this.o.B.a("looting");
    if ((!this.o.D) && (bY()) && (!this.aP) && (this.o.Q().b("mobGriefing")))
    {
      List<uz> ☃ = this.o.a(uz.class, aR().b(1.0D, 0.0D, 1.0D));
      for (uz ☃ : ☃) {
        if ((!☃.I) && (☃.l() != null) && (!☃.s())) {
          a(☃);
        }
      }
    }
    this.o.B.b();
  }
  
  protected void a(uz ☃)
  {
    zx ☃ = ☃.l();
    int ☃ = c(☃);
    if (☃ > -1)
    {
      boolean ☃ = true;
      zx ☃ = p(☃);
      if (☃ != null) {
        if (☃ == 0)
        {
          if (((☃.b() instanceof aay)) && (!(☃.b() instanceof aay)))
          {
            ☃ = true;
          }
          else if (((☃.b() instanceof aay)) && ((☃.b() instanceof aay)))
          {
            aay ☃ = (aay)☃.b();
            aay ☃ = (aay)☃.b();
            if (☃.g() == ☃.g()) {
              ☃ = (☃.i() > ☃.i()) || ((☃.n()) && (!☃.n()));
            } else {
              ☃ = ☃.g() > ☃.g();
            }
          }
          else if (((☃.b() instanceof yt)) && ((☃.b() instanceof yt)))
          {
            ☃ = (☃.n()) && (!☃.n());
          }
          else
          {
            ☃ = false;
          }
        }
        else if (((☃.b() instanceof yj)) && (!(☃.b() instanceof yj)))
        {
          ☃ = true;
        }
        else if (((☃.b() instanceof yj)) && ((☃.b() instanceof yj)))
        {
          yj ☃ = (yj)☃.b();
          yj ☃ = (yj)☃.b();
          if (☃.c == ☃.c) {
            ☃ = (☃.i() > ☃.i()) || ((☃.n()) && (!☃.n()));
          } else {
            ☃ = ☃.c > ☃.c;
          }
        }
        else
        {
          ☃ = false;
        }
      }
      if ((☃) && (a(☃)))
      {
        if ((☃ != null) && (this.V.nextFloat() - 0.1F < this.bj[☃])) {
          a(☃, 0.0F);
        }
        if ((☃.b() == zy.i) && (☃.n() != null))
        {
          wn ☃ = this.o.a(☃.n());
          if (☃ != null) {
            ☃.b(mr.x);
          }
        }
        c(☃, ☃);
        this.bj[☃] = 2.0F;
        this.bn = true;
        a(☃, 1);
        ☃.J();
      }
    }
  }
  
  protected boolean a(zx ☃)
  {
    return true;
  }
  
  protected boolean C()
  {
    return true;
  }
  
  protected void D()
  {
    if (this.bn)
    {
      this.aQ = 0;
      return;
    }
    pk ☃ = this.o.a(this, -1.0D);
    if (☃ != null)
    {
      double ☃ = ☃.s - this.s;
      double ☃ = ☃.t - this.t;
      double ☃ = ☃.u - this.u;
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if ((C()) && (☃ > 16384.0D)) {
        J();
      }
      if ((this.aQ > 600) && (this.V.nextInt(800) == 0) && (☃ > 1024.0D) && (C())) {
        J();
      } else if (☃ < 1024.0D) {
        this.aQ = 0;
      }
    }
  }
  
  protected final void bK()
  {
    this.aQ += 1;
    this.o.B.a("checkDespawn");
    D();
    this.o.B.b();
    
    this.o.B.a("sensing");
    this.bk.a();
    this.o.B.b();
    
    this.o.B.a("targetSelector");
    this.bi.a();
    this.o.B.b();
    
    this.o.B.a("goalSelector");
    this.i.a();
    this.o.B.b();
    
    this.o.B.a("navigation");
    this.h.k();
    this.o.B.b();
    
    this.o.B.a("mob tick");
    E();
    this.o.B.b();
    
    this.o.B.a("controls");
    this.o.B.a("move");
    this.f.c();
    this.o.B.c("look");
    this.a.a();
    this.o.B.c("jump");
    this.g.b();
    this.o.B.b();
    this.o.B.b();
  }
  
  protected void E() {}
  
  public int bQ()
  {
    return 40;
  }
  
  public void a(pk ☃, float ☃, float ☃)
  {
    double ☃ = ☃.s - this.s;
    
    double ☃ = ☃.u - this.u;
    double ☃;
    double ☃;
    if ((☃ instanceof pr))
    {
      pr ☃ = (pr)☃;
      ☃ = ☃.t + ☃.aS() - (this.t + aS());
    }
    else
    {
      ☃ = (☃.aR().b + ☃.aR().e) / 2.0D - (this.t + aS());
    }
    double ☃ = ns.a(☃ * ☃ + ☃ * ☃);
    
    float ☃ = (float)(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D) - 90.0F;
    float ☃ = (float)-(ns.b(☃, ☃) * 180.0D / 3.1415927410125732D);
    this.z = b(this.z, ☃, ☃);
    this.y = b(this.y, ☃, ☃);
  }
  
  private float b(float ☃, float ☃, float ☃)
  {
    float ☃ = ns.g(☃ - ☃);
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    return ☃ + ☃;
  }
  
  public boolean bR()
  {
    return true;
  }
  
  public boolean bS()
  {
    return (this.o.a(aR(), this)) && (this.o.a(this, aR()).isEmpty()) && (!this.o.d(aR()));
  }
  
  public float bT()
  {
    return 1.0F;
  }
  
  public int bV()
  {
    return 4;
  }
  
  public int aE()
  {
    if (u() == null) {
      return 3;
    }
    int ☃ = (int)(bn() - bu() * 0.33F);
    ☃ -= (3 - this.o.aa().a()) * 4;
    if (☃ < 0) {
      ☃ = 0;
    }
    return ☃ + 3;
  }
  
  public zx bA()
  {
    return this.bl[0];
  }
  
  public zx p(int ☃)
  {
    return this.bl[☃];
  }
  
  public zx q(int ☃)
  {
    return this.bl[(☃ + 1)];
  }
  
  public void c(int ☃, zx ☃)
  {
    this.bl[☃] = ☃;
  }
  
  public zx[] as()
  {
    return this.bl;
  }
  
  protected void a(boolean ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < as().length; ☃++)
    {
      zx ☃ = p(☃);
      boolean ☃ = this.bj[☃] > 1.0F;
      if ((☃ != null) && ((☃) || (☃)) && (this.V.nextFloat() - ☃ * 0.01F < this.bj[☃]))
      {
        if ((!☃) && (☃.e()))
        {
          int ☃ = Math.max(☃.j() - 25, 1);
          int ☃ = ☃.j() - this.V.nextInt(this.V.nextInt(☃) + 1);
          if (☃ > ☃) {
            ☃ = ☃;
          }
          if (☃ < 1) {
            ☃ = 1;
          }
          ☃.b(☃);
        }
        a(☃, 0.0F);
      }
    }
  }
  
  protected void a(ok ☃)
  {
    if (this.V.nextFloat() < 0.15F * ☃.c())
    {
      int ☃ = this.V.nextInt(2);
      float ☃ = this.o.aa() == oj.d ? 0.1F : 0.25F;
      if (this.V.nextFloat() < 0.095F) {
        ☃++;
      }
      if (this.V.nextFloat() < 0.095F) {
        ☃++;
      }
      if (this.V.nextFloat() < 0.095F) {
        ☃++;
      }
      for (int ☃ = 3; ☃ >= 0; ☃--)
      {
        zx ☃ = q(☃);
        if ((☃ < 3) && (this.V.nextFloat() < ☃)) {
          break;
        }
        if (☃ == null)
        {
          zw ☃ = a(☃ + 1, ☃);
          if (☃ != null) {
            c(☃ + 1, new zx(☃));
          }
        }
      }
    }
  }
  
  public static int c(zx ☃)
  {
    if ((☃.b() == zw.a(afi.aU)) || (☃.b() == zy.bX)) {
      return 4;
    }
    if ((☃.b() instanceof yj)) {
      switch (((yj)☃.b()).b)
      {
      case 3: 
        return 1;
      case 2: 
        return 2;
      case 1: 
        return 3;
      case 0: 
        return 4;
      }
    }
    return 0;
  }
  
  public static zw a(int ☃, int ☃)
  {
    switch (☃)
    {
    case 4: 
      if (☃ == 0) {
        return zy.Q;
      }
      if (☃ == 1) {
        return zy.ag;
      }
      if (☃ == 2) {
        return zy.U;
      }
      if (☃ == 3) {
        return zy.Y;
      }
      if (☃ == 4) {
        return zy.ac;
      }
    case 3: 
      if (☃ == 0) {
        return zy.R;
      }
      if (☃ == 1) {
        return zy.ah;
      }
      if (☃ == 2) {
        return zy.V;
      }
      if (☃ == 3) {
        return zy.Z;
      }
      if (☃ == 4) {
        return zy.ad;
      }
    case 2: 
      if (☃ == 0) {
        return zy.S;
      }
      if (☃ == 1) {
        return zy.ai;
      }
      if (☃ == 2) {
        return zy.W;
      }
      if (☃ == 3) {
        return zy.aa;
      }
      if (☃ == 4) {
        return zy.ae;
      }
    case 1: 
      if (☃ == 0) {
        return zy.T;
      }
      if (☃ == 1) {
        return zy.aj;
      }
      if (☃ == 2) {
        return zy.X;
      }
      if (☃ == 3) {
        return zy.ab;
      }
      if (☃ == 4) {
        return zy.af;
      }
      break;
    }
    return null;
  }
  
  protected void b(ok ☃)
  {
    float ☃ = ☃.c();
    if ((bA() != null) && (this.V.nextFloat() < 0.25F * ☃)) {
      ack.a(this.V, bA(), (int)(5.0F + ☃ * this.V.nextInt(18)));
    }
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      zx ☃ = q(☃);
      if ((☃ != null) && (this.V.nextFloat() < 0.5F * ☃)) {
        ack.a(this.V, ☃, (int)(5.0F + ☃ * this.V.nextInt(18)));
      }
    }
  }
  
  public pu a(ok ☃, pu ☃)
  {
    a(vy.b).b(new qd("Random spawn bonus", this.V.nextGaussian() * 0.05D, 1));
    
    return ☃;
  }
  
  public boolean bW()
  {
    return false;
  }
  
  public void bX()
  {
    this.bn = true;
  }
  
  public void a(int ☃, float ☃)
  {
    this.bj[☃] = ☃;
  }
  
  public boolean bY()
  {
    return this.bm;
  }
  
  public void j(boolean ☃)
  {
    this.bm = ☃;
  }
  
  public boolean bZ()
  {
    return this.bn;
  }
  
  public final boolean e(wn ☃)
  {
    if ((cc()) && (cd() == ☃))
    {
      a(true, !☃.bA.d);
      return true;
    }
    zx ☃ = ☃.bi.h();
    if (☃ != null) {
      if ((☃.b() == zy.cn) && 
        (cb())) {
        if (((this instanceof qa)) && (((qa)this).cl()))
        {
          if (((qa)this).e(☃))
          {
            a(☃, true);
            ☃.b -= 1;
            return true;
          }
        }
        else
        {
          a(☃, true);
          ☃.b -= 1;
          return true;
        }
      }
    }
    if (a(☃)) {
      return true;
    }
    return super.e(☃);
  }
  
  protected boolean a(wn ☃)
  {
    return false;
  }
  
  protected void ca()
  {
    if (this.bq != null) {
      n();
    }
    if (!this.bo) {
      return;
    }
    if (!ai()) {
      a(true, true);
    }
    if ((this.bp == null) || (this.bp.I))
    {
      a(true, true);
      return;
    }
  }
  
  public void a(boolean ☃, boolean ☃)
  {
    if (this.bo)
    {
      this.bo = false;
      this.bp = null;
      if ((!this.o.D) && (☃)) {
        a(zy.cn, 1);
      }
      if ((!this.o.D) && (☃) && ((this.o instanceof le))) {
        ((le)this.o).s().a(this, new hl(1, this, null));
      }
    }
  }
  
  public boolean cb()
  {
    return (!cc()) && (!(this instanceof vq));
  }
  
  public boolean cc()
  {
    return this.bo;
  }
  
  public pk cd()
  {
    return this.bp;
  }
  
  public void a(pk ☃, boolean ☃)
  {
    this.bo = true;
    this.bp = ☃;
    if ((!this.o.D) && (☃) && ((this.o instanceof le))) {
      ((le)this.o).s().a(this, new hl(1, this, this.bp));
    }
  }
  
  private void n()
  {
    if ((this.bo) && (this.bq != null))
    {
      UUID ☃;
      if ((this.bq.b("UUIDMost", 4)) && (this.bq.b("UUIDLeast", 4)))
      {
        ☃ = new UUID(this.bq.g("UUIDMost"), this.bq.g("UUIDLeast"));
        List<pr> ☃ = this.o.a(pr.class, aR().b(10.0D, 10.0D, 10.0D));
        for (pr ☃ : ☃) {
          if (☃.aK().equals(☃))
          {
            this.bp = ☃;
            break;
          }
        }
      }
      else if ((this.bq.b("X", 99)) && (this.bq.b("Y", 99)) && (this.bq.b("Z", 99)))
      {
        cj ☃ = new cj(this.bq.f("X"), this.bq.f("Y"), this.bq.f("Z"));
        
        up ☃ = up.b(this.o, ☃);
        if (☃ == null) {
          ☃ = up.a(this.o, ☃);
        }
        this.bp = ☃;
      }
      else
      {
        a(false, true);
      }
    }
    this.bq = null;
  }
  
  public boolean d(int ☃, zx ☃)
  {
    int ☃;
    int ☃;
    if (☃ == 99)
    {
      ☃ = 0;
    }
    else
    {
      ☃ = ☃ - 100 + 1;
      if ((☃ < 0) || (☃ >= this.bl.length)) {
        return false;
      }
    }
    if ((☃ == null) || (c(☃) == ☃) || ((☃ == 4) && ((☃.b() instanceof yo))))
    {
      c(☃, ☃);
      return true;
    }
    return false;
  }
  
  public boolean bM()
  {
    return (super.bM()) && (!ce());
  }
  
  public void k(boolean ☃)
  {
    this.ac.b(15, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public boolean ce()
  {
    return this.ac.a(15) != 0;
  }
  
  public static enum a
  {
    private a() {}
  }
}
