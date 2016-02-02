import java.util.Iterator;
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
  private static final String __OBFID = "CL_00001550";
  public int randomMobsId = 0;
  public ady spawnBiome = null;
  public cj spawnPosition = null;
  
  public ps(adm worldIn)
  {
    super(worldIn);
    this.i = new re((worldIn != null) && (worldIn.B != null) ? worldIn.B : null);
    this.bi = new re((worldIn != null) && (worldIn.B != null) ? worldIn.B : null);
    this.a = new qp(this);
    this.f = new qq(this);
    this.g = new qo(this);
    this.b = new qm(this);
    this.h = b(worldIn);
    this.bk = new ta(this);
    for (int var2 = 0; var2 < this.bj.length; var2++) {
      this.bj[var2] = 0.085F;
    }
    UUID uuid = aK();
    
    long uuidLow = uuid.getLeastSignificantBits();
    
    this.randomMobsId = ((int)(uuidLow & 0x7FFFFFFF));
  }
  
  protected void aX()
  {
    super.aX();
    by().b(vy.b).a(16.0D);
  }
  
  protected sw b(adm worldIn)
  {
    return new sv(this, worldIn);
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
  
  public void d(pr p_70624_1_)
  {
    this.c = p_70624_1_;
    
    Reflector.callVoid(Reflector.ForgeHooks_onLivingSetAttackTarget, new Object[] { this, p_70624_1_ });
  }
  
  public boolean a(Class p_70686_1_)
  {
    return p_70686_1_ != vr.class;
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
    String var1 = z();
    if (var1 != null) {
      a(var1, bB(), bC());
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
  
  protected int b(wn p_70693_1_)
  {
    if (this.b_ > 0)
    {
      int var2 = this.b_;
      zx[] var3 = as();
      for (int var4 = 0; var4 < var3.length; var4++) {
        if ((var3[var4] != null) && (this.bj[var4] <= 1.0F)) {
          var2 += 1 + this.V.nextInt(3);
        }
      }
      return var2;
    }
    return this.b_;
  }
  
  public void y()
  {
    if (this.o.D) {
      for (int var1 = 0; var1 < 20; var1++)
      {
        double var2 = this.V.nextGaussian() * 0.02D;
        double var4 = this.V.nextGaussian() * 0.02D;
        double var6 = this.V.nextGaussian() * 0.02D;
        double var8 = 10.0D;
        this.o.a(cy.a, this.s + this.V.nextFloat() * this.J * 2.0F - this.J - var2 * var8, this.t + this.V.nextFloat() * this.K - var4 * var8, this.u + this.V.nextFloat() * this.J * 2.0F - this.J - var6 * var8, var2, var4, var6, new int[0]);
      }
    } else {
      this.o.a(this, (byte)20);
    }
  }
  
  public void a(byte p_70103_1_)
  {
    if (p_70103_1_ == 20) {
      y();
    } else {
      super.a(p_70103_1_);
    }
  }
  
  public void t_()
  {
    if (Config.isSmoothWorld()) {
      if (canSkipUpdate())
      {
        onUpdateMinimal();
        return;
      }
    }
    super.t_();
    if (!this.o.D) {
      ca();
    }
  }
  
  protected float h(float p_110146_1_, float p_110146_2_)
  {
    this.b.a();
    return p_110146_2_;
  }
  
  protected String z()
  {
    return null;
  }
  
  protected zw A()
  {
    return null;
  }
  
  protected void b(boolean p_70628_1_, int p_70628_2_)
  {
    zw var3 = A();
    if (var3 != null)
    {
      int var4 = this.V.nextInt(3);
      if (p_70628_2_ > 0) {
        var4 += this.V.nextInt(p_70628_2_ + 1);
      }
      for (int var5 = 0; var5 < var4; var5++) {
        a(var3, 1);
      }
    }
  }
  
  public void b(dn tagCompound)
  {
    super.b(tagCompound);
    tagCompound.a("CanPickUpLoot", bY());
    tagCompound.a("PersistenceRequired", this.bn);
    du var2 = new du();
    for (int var3 = 0; var3 < this.bl.length; var3++)
    {
      dn var4 = new dn();
      if (this.bl[var3] != null) {
        this.bl[var3].b(var4);
      }
      var2.a(var4);
    }
    tagCompound.a("Equipment", var2);
    du var6 = new du();
    for (int var7 = 0; var7 < this.bj.length; var7++) {
      var6.a(new dr(this.bj[var7]));
    }
    tagCompound.a("DropChances", var6);
    tagCompound.a("Leashed", this.bo);
    if (this.bp != null)
    {
      dn var4 = new dn();
      if ((this.bp instanceof pr))
      {
        var4.a("UUIDMost", this.bp.aK().getMostSignificantBits());
        var4.a("UUIDLeast", this.bp.aK().getLeastSignificantBits());
      }
      else if ((this.bp instanceof un))
      {
        cj var5 = ((un)this.bp).n();
        var4.a("X", var5.n());
        var4.a("Y", var5.o());
        var4.a("Z", var5.p());
      }
      tagCompound.a("Leash", var4);
    }
    if (ce()) {
      tagCompound.a("NoAI", ce());
    }
  }
  
  public void a(dn tagCompund)
  {
    super.a(tagCompund);
    if (tagCompund.b("CanPickUpLoot", 1)) {
      j(tagCompund.n("CanPickUpLoot"));
    }
    this.bn = tagCompund.n("PersistenceRequired");
    if (tagCompund.b("Equipment", 9))
    {
      du var2 = tagCompund.c("Equipment", 10);
      for (int var3 = 0; var3 < this.bl.length; var3++) {
        this.bl[var3] = zx.a(var2.b(var3));
      }
    }
    if (tagCompund.b("DropChances", 9))
    {
      du var2 = tagCompund.c("DropChances", 5);
      for (int var3 = 0; var3 < var2.c(); var3++) {
        this.bj[var3] = var2.e(var3);
      }
    }
    this.bo = tagCompund.n("Leashed");
    if ((this.bo) && (tagCompund.b("Leash", 10))) {
      this.bq = tagCompund.m("Leash");
    }
    k(tagCompund.n("NoAI"));
  }
  
  public void n(float p_70657_1_)
  {
    this.ba = p_70657_1_;
  }
  
  public void k(float p_70659_1_)
  {
    super.k(p_70659_1_);
    n(p_70659_1_);
  }
  
  public void m()
  {
    super.m();
    this.o.B.a("looting");
    if ((!this.o.D) && (bY()) && (!this.aP) && (this.o.Q().b("mobGriefing")))
    {
      List var1 = this.o.a(uz.class, aR().b(1.0D, 0.0D, 1.0D));
      Iterator var2 = var1.iterator();
      while (var2.hasNext())
      {
        uz var3 = (uz)var2.next();
        if ((!var3.I) && (var3.l() != null) && (!var3.s())) {
          a(var3);
        }
      }
    }
    this.o.B.b();
  }
  
  protected void a(uz p_175445_1_)
  {
    zx var2 = p_175445_1_.l();
    int var3 = c(var2);
    if (var3 > -1)
    {
      boolean var4 = true;
      zx var5 = p(var3);
      if (var5 != null) {
        if (var3 == 0)
        {
          if (((var2.b() instanceof aay)) && (!(var5.b() instanceof aay)))
          {
            var4 = true;
          }
          else if (((var2.b() instanceof aay)) && ((var5.b() instanceof aay)))
          {
            aay var6 = (aay)var2.b();
            aay var7 = (aay)var5.b();
            if (var6.g() == var7.g()) {
              var4 = (var2.i() > var5.i()) || ((var2.n()) && (!var5.n()));
            } else {
              var4 = var6.g() > var7.g();
            }
          }
          else if (((var2.b() instanceof yt)) && ((var5.b() instanceof yt)))
          {
            var4 = (var2.n()) && (!var5.n());
          }
          else
          {
            var4 = false;
          }
        }
        else if (((var2.b() instanceof yj)) && (!(var5.b() instanceof yj)))
        {
          var4 = true;
        }
        else if (((var2.b() instanceof yj)) && ((var5.b() instanceof yj)))
        {
          yj var8 = (yj)var2.b();
          yj var10 = (yj)var5.b();
          if (var8.c == var10.c) {
            var4 = (var2.i() > var5.i()) || ((var2.n()) && (!var5.n()));
          } else {
            var4 = var8.c > var10.c;
          }
        }
        else
        {
          var4 = false;
        }
      }
      if ((var4) && (a(var2)))
      {
        if ((var5 != null) && (this.V.nextFloat() - 0.1F < this.bj[var3])) {
          a(var5, 0.0F);
        }
        if ((var2.b() == zy.i) && (p_175445_1_.n() != null))
        {
          wn var9 = this.o.a(p_175445_1_.n());
          if (var9 != null) {
            var9.b(mr.x);
          }
        }
        c(var3, var2);
        this.bj[var3] = 2.0F;
        this.bn = true;
        a(p_175445_1_, 1);
        p_175445_1_.J();
      }
    }
  }
  
  protected boolean a(zx p_175448_1_)
  {
    return true;
  }
  
  protected boolean C()
  {
    return true;
  }
  
  protected void D()
  {
    Object result = null;
    Object Result_DEFAULT = Reflector.getFieldValue(Reflector.Event_Result_DEFAULT);
    Object Result_DENY = Reflector.getFieldValue(Reflector.Event_Result_DENY);
    if (this.bn)
    {
      this.aQ = 0;
    }
    else
    {
      if ((this.aQ & 0x1F) == 31) {
        if ((result = Reflector.call(Reflector.ForgeEventFactory_canEntityDespawn, new Object[] { this })) != Result_DEFAULT)
        {
          if (result == Result_DENY)
          {
            this.aQ = 0; return;
          }
          J(); return;
        }
      }
      wn var1 = this.o.a(this, -1.0D);
      if (var1 != null)
      {
        double var2 = var1.s - this.s;
        double var4 = var1.t - this.t;
        double var6 = var1.u - this.u;
        double var8 = var2 * var2 + var4 * var4 + var6 * var6;
        if ((C()) && (var8 > 16384.0D)) {
          J();
        }
        if ((this.aQ > 600) && (this.V.nextInt(800) == 0) && (var8 > 1024.0D) && (C())) {
          J();
        } else if (var8 < 1024.0D) {
          this.aQ = 0;
        }
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
  
  public void a(pk p_70625_1_, float p_70625_2_, float p_70625_3_)
  {
    double var4 = p_70625_1_.s - this.s;
    double var8 = p_70625_1_.u - this.u;
    double var6;
    double var6;
    if ((p_70625_1_ instanceof pr))
    {
      pr var10 = (pr)p_70625_1_;
      var6 = var10.t + var10.aS() - (this.t + aS());
    }
    else
    {
      var6 = (p_70625_1_.aR().b + p_70625_1_.aR().e) / 2.0D - (this.t + aS());
    }
    double var14 = ns.a(var4 * var4 + var8 * var8);
    float var12 = (float)(ns.b(var8, var4) * 180.0D / 3.141592653589793D) - 90.0F;
    float var13 = (float)-(ns.b(var6, var14) * 180.0D / 3.141592653589793D);
    this.z = b(this.z, var13, p_70625_3_);
    this.y = b(this.y, var12, p_70625_2_);
  }
  
  private float b(float p_70663_1_, float p_70663_2_, float p_70663_3_)
  {
    float var4 = ns.g(p_70663_2_ - p_70663_1_);
    if (var4 > p_70663_3_) {
      var4 = p_70663_3_;
    }
    if (var4 < -p_70663_3_) {
      var4 = -p_70663_3_;
    }
    return p_70663_1_ + var4;
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
    int var1 = (int)(bn() - bu() * 0.33F);
    var1 -= (3 - this.o.aa().a()) * 4;
    if (var1 < 0) {
      var1 = 0;
    }
    return var1 + 3;
  }
  
  public zx bA()
  {
    return this.bl[0];
  }
  
  public zx p(int slotIn)
  {
    return this.bl[slotIn];
  }
  
  public zx q(int slotIn)
  {
    return this.bl[(slotIn + 1)];
  }
  
  public void c(int slotIn, zx stack)
  {
    this.bl[slotIn] = stack;
  }
  
  public zx[] as()
  {
    return this.bl;
  }
  
  protected void a(boolean p_82160_1_, int p_82160_2_)
  {
    for (int var3 = 0; var3 < as().length; var3++)
    {
      zx var4 = p(var3);
      boolean var5 = this.bj[var3] > 1.0F;
      if ((var4 != null) && ((p_82160_1_) || (var5)) && (this.V.nextFloat() - p_82160_2_ * 0.01F < this.bj[var3]))
      {
        if ((!var5) && (var4.e()))
        {
          int var6 = Math.max(var4.j() - 25, 1);
          int var7 = var4.j() - this.V.nextInt(this.V.nextInt(var6) + 1);
          if (var7 > var6) {
            var7 = var6;
          }
          if (var7 < 1) {
            var7 = 1;
          }
          var4.b(var7);
        }
        a(var4, 0.0F);
      }
    }
  }
  
  protected void a(ok p_180481_1_)
  {
    if (this.V.nextFloat() < 0.15F * p_180481_1_.c())
    {
      int var2 = this.V.nextInt(2);
      float var3 = this.o.aa() == oj.d ? 0.1F : 0.25F;
      if (this.V.nextFloat() < 0.095F) {
        var2++;
      }
      if (this.V.nextFloat() < 0.095F) {
        var2++;
      }
      if (this.V.nextFloat() < 0.095F) {
        var2++;
      }
      for (int var4 = 3; var4 >= 0; var4--)
      {
        zx var5 = q(var4);
        if ((var4 < 3) && (this.V.nextFloat() < var3)) {
          break;
        }
        if (var5 == null)
        {
          zw var6 = a(var4 + 1, var2);
          if (var6 != null) {
            c(var4 + 1, new zx(var6));
          }
        }
      }
    }
  }
  
  public static int c(zx p_82159_0_)
  {
    if ((p_82159_0_.b() != zw.a(afi.aU)) && (p_82159_0_.b() != zy.bX))
    {
      if ((p_82159_0_.b() instanceof yj)) {
        switch (((yj)p_82159_0_.b()).b)
        {
        case 0: 
          return 4;
        case 1: 
          return 3;
        case 2: 
          return 2;
        case 3: 
          return 1;
        }
      }
      return 0;
    }
    return 4;
  }
  
  public static zw a(int armorSlot, int itemTier)
  {
    switch (armorSlot)
    {
    case 4: 
      if (itemTier == 0) {
        return zy.Q;
      }
      if (itemTier == 1) {
        return zy.ag;
      }
      if (itemTier == 2) {
        return zy.U;
      }
      if (itemTier == 3) {
        return zy.Y;
      }
      if (itemTier == 4) {
        return zy.ac;
      }
    case 3: 
      if (itemTier == 0) {
        return zy.R;
      }
      if (itemTier == 1) {
        return zy.ah;
      }
      if (itemTier == 2) {
        return zy.V;
      }
      if (itemTier == 3) {
        return zy.Z;
      }
      if (itemTier == 4) {
        return zy.ad;
      }
    case 2: 
      if (itemTier == 0) {
        return zy.S;
      }
      if (itemTier == 1) {
        return zy.ai;
      }
      if (itemTier == 2) {
        return zy.W;
      }
      if (itemTier == 3) {
        return zy.aa;
      }
      if (itemTier == 4) {
        return zy.ae;
      }
    case 1: 
      if (itemTier == 0) {
        return zy.T;
      }
      if (itemTier == 1) {
        return zy.aj;
      }
      if (itemTier == 2) {
        return zy.X;
      }
      if (itemTier == 3) {
        return zy.ab;
      }
      if (itemTier == 4) {
        return zy.af;
      }
      break;
    }
    return null;
  }
  
  protected void b(ok p_180483_1_)
  {
    float var2 = p_180483_1_.c();
    if ((bA() != null) && (this.V.nextFloat() < 0.25F * var2)) {
      ack.a(this.V, bA(), (int)(5.0F + var2 * this.V.nextInt(18)));
    }
    for (int var3 = 0; var3 < 4; var3++)
    {
      zx var4 = q(var3);
      if ((var4 != null) && (this.V.nextFloat() < 0.5F * var2)) {
        ack.a(this.V, var4, (int)(5.0F + var2 * this.V.nextInt(18)));
      }
    }
  }
  
  public pu a(ok p_180482_1_, pu p_180482_2_)
  {
    a(vy.b).b(new qd("Random spawn bonus", this.V.nextGaussian() * 0.05D, 1));
    return p_180482_2_;
  }
  
  public boolean bW()
  {
    return false;
  }
  
  public void bX()
  {
    this.bn = true;
  }
  
  public void a(int p_96120_1_, float p_96120_2_)
  {
    this.bj[p_96120_1_] = p_96120_2_;
  }
  
  public boolean bY()
  {
    return this.bm;
  }
  
  public void j(boolean p_98053_1_)
  {
    this.bm = p_98053_1_;
  }
  
  public boolean bZ()
  {
    return this.bn;
  }
  
  public final boolean e(wn playerIn)
  {
    if ((cc()) && (cd() == playerIn))
    {
      a(true, !playerIn.bA.d);
      return true;
    }
    zx var2 = playerIn.bi.h();
    if ((var2 != null) && (var2.b() == zy.cn) && (cb()))
    {
      if ((!(this instanceof qa)) || (!((qa)this).cl()))
      {
        a(playerIn, true);
        var2.b -= 1;
        return true;
      }
      if (((qa)this).e(playerIn))
      {
        a(playerIn, true);
        var2.b -= 1;
        return true;
      }
    }
    return a(playerIn) ? true : super.e(playerIn);
  }
  
  protected boolean a(wn player)
  {
    return false;
  }
  
  protected void ca()
  {
    if (this.bq != null) {
      n();
    }
    if (this.bo)
    {
      if (!ai()) {
        a(true, true);
      }
      if ((this.bp == null) || (this.bp.I)) {
        a(true, true);
      }
    }
  }
  
  public void a(boolean p_110160_1_, boolean p_110160_2_)
  {
    if (this.bo)
    {
      this.bo = false;
      this.bp = null;
      if ((!this.o.D) && (p_110160_2_)) {
        a(zy.cn, 1);
      }
      if ((!this.o.D) && (p_110160_1_) && ((this.o instanceof le))) {
        ((le)this.o).s().a(this, new hl(1, this, (pk)null));
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
  
  public void a(pk entityIn, boolean sendAttachNotification)
  {
    this.bo = true;
    this.bp = entityIn;
    if ((!this.o.D) && (sendAttachNotification) && ((this.o instanceof le))) {
      ((le)this.o).s().a(this, new hl(1, this, this.bp));
    }
  }
  
  private void n()
  {
    if ((this.bo) && (this.bq != null)) {
      if ((this.bq.b("UUIDMost", 4)) && (this.bq.b("UUIDLeast", 4)))
      {
        UUID var5 = new UUID(this.bq.g("UUIDMost"), this.bq.g("UUIDLeast"));
        List var6 = this.o.a(pr.class, aR().b(10.0D, 10.0D, 10.0D));
        Iterator var3 = var6.iterator();
        while (var3.hasNext())
        {
          pr var4 = (pr)var3.next();
          if (var4.aK().equals(var5))
          {
            this.bp = var4;
            break;
          }
        }
      }
      else if ((this.bq.b("X", 99)) && (this.bq.b("Y", 99)) && (this.bq.b("Z", 99)))
      {
        cj var1 = new cj(this.bq.f("X"), this.bq.f("Y"), this.bq.f("Z"));
        up var2 = up.b(this.o, var1);
        if (var2 == null) {
          var2 = up.a(this.o, var1);
        }
        this.bp = var2;
      }
      else
      {
        a(false, true);
      }
    }
    this.bq = null;
  }
  
  public boolean d(int p_174820_1_, zx p_174820_2_)
  {
    int var3;
    int var3;
    if (p_174820_1_ == 99)
    {
      var3 = 0;
    }
    else
    {
      var3 = p_174820_1_ - 100 + 1;
      if ((var3 < 0) || (var3 >= this.bl.length)) {
        return false;
      }
    }
    if ((p_174820_2_ != null) && (c(p_174820_2_) != var3) && ((var3 != 4) || (!(p_174820_2_.b() instanceof yo)))) {
      return false;
    }
    c(var3, p_174820_2_);
    return true;
  }
  
  public boolean bM()
  {
    return (super.bM()) && (!ce());
  }
  
  public void k(boolean p_94061_1_)
  {
    this.ac.b(15, Byte.valueOf((byte)(p_94061_1_ ? 1 : 0)));
  }
  
  public boolean ce()
  {
    return this.ac.a(15) != 0;
  }
  
  public static enum a
  {
    private static final a[] d = { a, b, c };
    private static final String __OBFID = "CL_00002255";
  }
  
  public boolean aj()
  {
    if (this.T) {
      return false;
    }
    BlockPosM posM = new BlockPosM(0, 0, 0);
    for (int var1 = 0; var1 < 8; var1++)
    {
      double var2 = this.s + ((var1 >> 0) % 2 - 0.5F) * this.J * 0.8F;
      double var4 = this.t + ((var1 >> 1) % 2 - 0.5F) * 0.1F;
      double var6 = this.u + ((var1 >> 2) % 2 - 0.5F) * this.J * 0.8F;
      
      posM.setXyz(var2, var4 + aS(), var6);
      if (this.o.p(posM).c().w()) {
        return true;
      }
    }
    return false;
  }
  
  private boolean canSkipUpdate()
  {
    if (j_()) {
      return false;
    }
    if (this.au > 0) {
      return false;
    }
    if (this.W < 20) {
      return false;
    }
    adm world = e();
    if (world == null) {
      return false;
    }
    if (world.j.size() != 1) {
      return false;
    }
    pk player = (pk)world.j.get(0);
    
    double dx = Math.abs(this.s - player.s) - 16.0D;
    double dz = Math.abs(this.u - player.u) - 16.0D;
    double distSq = dx * dx + dz * dz;
    if (a(distSq)) {
      return false;
    }
    return true;
  }
  
  private void onUpdateMinimal()
  {
    this.aQ += 1;
    if ((this instanceof vv))
    {
      float brightness = c(1.0F);
      if (brightness > 0.5F) {
        this.aQ += 2;
      }
    }
    D();
  }
}
