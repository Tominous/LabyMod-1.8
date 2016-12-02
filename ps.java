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
    i = new re((worldIn != null) && (B != null) ? B : null);
    bi = new re((worldIn != null) && (B != null) ? B : null);
    a = new qp(this);
    f = new qq(this);
    g = new qo(this);
    b = new qm(this);
    h = b(worldIn);
    bk = new ta(this);
    for (int var2 = 0; var2 < bj.length; var2++) {
      bj[var2] = 0.085F;
    }
    UUID uuid = aK();
    
    long uuidLow = uuid.getLeastSignificantBits();
    
    randomMobsId = ((int)(uuidLow & 0x7FFFFFFF));
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
    return a;
  }
  
  public qq q()
  {
    return f;
  }
  
  public qo r()
  {
    return g;
  }
  
  public sw s()
  {
    return h;
  }
  
  public ta t()
  {
    return bk;
  }
  
  public pr u()
  {
    return c;
  }
  
  public void d(pr p_70624_1_)
  {
    c = p_70624_1_;
    
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
    ac.a(15, Byte.valueOf((byte)0));
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
    o.B.a("mobBaseTick");
    if ((ai()) && (V.nextInt(1000) < a_++))
    {
      a_ = (-w());
      x();
    }
    o.B.b();
  }
  
  protected int b(wn p_70693_1_)
  {
    if (b_ > 0)
    {
      int var2 = b_;
      zx[] var3 = as();
      for (int var4 = 0; var4 < var3.length; var4++) {
        if ((var3[var4] != null) && (bj[var4] <= 1.0F)) {
          var2 += 1 + V.nextInt(3);
        }
      }
      return var2;
    }
    return b_;
  }
  
  public void y()
  {
    if (o.D) {
      for (int var1 = 0; var1 < 20; var1++)
      {
        double var2 = V.nextGaussian() * 0.02D;
        double var4 = V.nextGaussian() * 0.02D;
        double var6 = V.nextGaussian() * 0.02D;
        double var8 = 10.0D;
        o.a(cy.a, s + V.nextFloat() * J * 2.0F - J - var2 * var8, t + V.nextFloat() * K - var4 * var8, u + V.nextFloat() * J * 2.0F - J - var6 * var8, var2, var4, var6, new int[0]);
      }
    } else {
      o.a(this, (byte)20);
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
    if (!o.D) {
      ca();
    }
  }
  
  protected float h(float p_110146_1_, float p_110146_2_)
  {
    b.a();
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
      int var4 = V.nextInt(3);
      if (p_70628_2_ > 0) {
        var4 += V.nextInt(p_70628_2_ + 1);
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
    tagCompound.a("PersistenceRequired", bn);
    du var2 = new du();
    for (int var3 = 0; var3 < bl.length; var3++)
    {
      dn var4 = new dn();
      if (bl[var3] != null) {
        bl[var3].b(var4);
      }
      var2.a(var4);
    }
    tagCompound.a("Equipment", var2);
    du var6 = new du();
    for (int var7 = 0; var7 < bj.length; var7++) {
      var6.a(new dr(bj[var7]));
    }
    tagCompound.a("DropChances", var6);
    tagCompound.a("Leashed", bo);
    if (bp != null)
    {
      dn var4 = new dn();
      if ((bp instanceof pr))
      {
        var4.a("UUIDMost", bp.aK().getMostSignificantBits());
        var4.a("UUIDLeast", bp.aK().getLeastSignificantBits());
      }
      else if ((bp instanceof un))
      {
        cj var5 = ((un)bp).n();
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
    bn = tagCompund.n("PersistenceRequired");
    if (tagCompund.b("Equipment", 9))
    {
      du var2 = tagCompund.c("Equipment", 10);
      for (int var3 = 0; var3 < bl.length; var3++) {
        bl[var3] = zx.a(var2.b(var3));
      }
    }
    if (tagCompund.b("DropChances", 9))
    {
      du var2 = tagCompund.c("DropChances", 5);
      for (int var3 = 0; var3 < var2.c(); var3++) {
        bj[var3] = var2.e(var3);
      }
    }
    bo = tagCompund.n("Leashed");
    if ((bo) && (tagCompund.b("Leash", 10))) {
      bq = tagCompund.m("Leash");
    }
    k(tagCompund.n("NoAI"));
  }
  
  public void n(float p_70657_1_)
  {
    ba = p_70657_1_;
  }
  
  public void k(float p_70659_1_)
  {
    super.k(p_70659_1_);
    n(p_70659_1_);
  }
  
  public void m()
  {
    super.m();
    o.B.a("looting");
    if ((!o.D) && (bY()) && (!aP) && (o.Q().b("mobGriefing")))
    {
      List var1 = o.a(uz.class, aR().b(1.0D, 0.0D, 1.0D));
      Iterator var2 = var1.iterator();
      while (var2.hasNext())
      {
        uz var3 = (uz)var2.next();
        if ((!I) && (var3.l() != null) && (!var3.s())) {
          a(var3);
        }
      }
    }
    o.B.b();
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
          if (c == c) {
            var4 = (var2.i() > var5.i()) || ((var2.n()) && (!var5.n()));
          } else {
            var4 = c > c;
          }
        }
        else
        {
          var4 = false;
        }
      }
      if ((var4) && (a(var2)))
      {
        if ((var5 != null) && (V.nextFloat() - 0.1F < bj[var3])) {
          a(var5, 0.0F);
        }
        if ((var2.b() == zy.i) && (p_175445_1_.n() != null))
        {
          wn var9 = o.a(p_175445_1_.n());
          if (var9 != null) {
            var9.b(mr.x);
          }
        }
        c(var3, var2);
        bj[var3] = 2.0F;
        bn = true;
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
    if (bn)
    {
      aQ = 0;
    }
    else
    {
      if ((aQ & 0x1F) == 31) {
        if ((result = Reflector.call(Reflector.ForgeEventFactory_canEntityDespawn, new Object[] { this })) != Result_DEFAULT)
        {
          if (result == Result_DENY)
          {
            aQ = 0; return;
          }
          J(); return;
        }
      }
      wn var1 = o.a(this, -1.0D);
      if (var1 != null)
      {
        double var2 = s - s;
        double var4 = t - t;
        double var6 = u - u;
        double var8 = var2 * var2 + var4 * var4 + var6 * var6;
        if ((C()) && (var8 > 16384.0D)) {
          J();
        }
        if ((aQ > 600) && (V.nextInt(800) == 0) && (var8 > 1024.0D) && (C())) {
          J();
        } else if (var8 < 1024.0D) {
          aQ = 0;
        }
      }
    }
  }
  
  protected final void bK()
  {
    aQ += 1;
    o.B.a("checkDespawn");
    D();
    o.B.b();
    o.B.a("sensing");
    bk.a();
    o.B.b();
    o.B.a("targetSelector");
    bi.a();
    o.B.b();
    o.B.a("goalSelector");
    i.a();
    o.B.b();
    o.B.a("navigation");
    h.k();
    o.B.b();
    o.B.a("mob tick");
    E();
    o.B.b();
    o.B.a("controls");
    o.B.a("move");
    f.c();
    o.B.c("look");
    a.a();
    o.B.c("jump");
    g.b();
    o.B.b();
    o.B.b();
  }
  
  protected void E() {}
  
  public int bQ()
  {
    return 40;
  }
  
  public void a(pk p_70625_1_, float p_70625_2_, float p_70625_3_)
  {
    double var4 = s - s;
    double var8 = u - u;
    double var6;
    double var6;
    if ((p_70625_1_ instanceof pr))
    {
      pr var10 = (pr)p_70625_1_;
      var6 = t + var10.aS() - (t + aS());
    }
    else
    {
      var6 = (aRb + aRe) / 2.0D - (t + aS());
    }
    double var14 = ns.a(var4 * var4 + var8 * var8);
    float var12 = (float)(ns.b(var8, var4) * 180.0D / 3.141592653589793D) - 90.0F;
    float var13 = (float)-(ns.b(var6, var14) * 180.0D / 3.141592653589793D);
    z = b(z, var13, p_70625_3_);
    y = b(y, var12, p_70625_2_);
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
    return (o.a(aR(), this)) && (o.a(this, aR()).isEmpty()) && (!o.d(aR()));
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
    var1 -= (3 - o.aa().a()) * 4;
    if (var1 < 0) {
      var1 = 0;
    }
    return var1 + 3;
  }
  
  public zx bA()
  {
    return bl[0];
  }
  
  public zx p(int slotIn)
  {
    return bl[slotIn];
  }
  
  public zx q(int slotIn)
  {
    return bl[(slotIn + 1)];
  }
  
  public void c(int slotIn, zx stack)
  {
    bl[slotIn] = stack;
  }
  
  public zx[] as()
  {
    return bl;
  }
  
  protected void a(boolean p_82160_1_, int p_82160_2_)
  {
    for (int var3 = 0; var3 < as().length; var3++)
    {
      zx var4 = p(var3);
      boolean var5 = bj[var3] > 1.0F;
      if ((var4 != null) && ((p_82160_1_) || (var5)) && (V.nextFloat() - p_82160_2_ * 0.01F < bj[var3]))
      {
        if ((!var5) && (var4.e()))
        {
          int var6 = Math.max(var4.j() - 25, 1);
          int var7 = var4.j() - V.nextInt(V.nextInt(var6) + 1);
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
    if (V.nextFloat() < 0.15F * p_180481_1_.c())
    {
      int var2 = V.nextInt(2);
      float var3 = o.aa() == oj.d ? 0.1F : 0.25F;
      if (V.nextFloat() < 0.095F) {
        var2++;
      }
      if (V.nextFloat() < 0.095F) {
        var2++;
      }
      if (V.nextFloat() < 0.095F) {
        var2++;
      }
      for (int var4 = 3; var4 >= 0; var4--)
      {
        zx var5 = q(var4);
        if ((var4 < 3) && (V.nextFloat() < var3)) {
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
        switch (bb)
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
    if ((bA() != null) && (V.nextFloat() < 0.25F * var2)) {
      ack.a(V, bA(), (int)(5.0F + var2 * V.nextInt(18)));
    }
    for (int var3 = 0; var3 < 4; var3++)
    {
      zx var4 = q(var3);
      if ((var4 != null) && (V.nextFloat() < 0.5F * var2)) {
        ack.a(V, var4, (int)(5.0F + var2 * V.nextInt(18)));
      }
    }
  }
  
  public pu a(ok p_180482_1_, pu p_180482_2_)
  {
    a(vy.b).b(new qd("Random spawn bonus", V.nextGaussian() * 0.05D, 1));
    return p_180482_2_;
  }
  
  public boolean bW()
  {
    return false;
  }
  
  public void bX()
  {
    bn = true;
  }
  
  public void a(int p_96120_1_, float p_96120_2_)
  {
    bj[p_96120_1_] = p_96120_2_;
  }
  
  public boolean bY()
  {
    return bm;
  }
  
  public void j(boolean p_98053_1_)
  {
    bm = p_98053_1_;
  }
  
  public boolean bZ()
  {
    return bn;
  }
  
  public final boolean e(wn playerIn)
  {
    if ((cc()) && (cd() == playerIn))
    {
      a(true, !bA.d);
      return true;
    }
    zx var2 = bi.h();
    if ((var2 != null) && (var2.b() == zy.cn) && (cb()))
    {
      if ((!(this instanceof qa)) || (!((qa)this).cl()))
      {
        a(playerIn, true);
        b -= 1;
        return true;
      }
      if (((qa)this).e(playerIn))
      {
        a(playerIn, true);
        b -= 1;
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
    if (bq != null) {
      n();
    }
    if (bo)
    {
      if (!ai()) {
        a(true, true);
      }
      if ((bp == null) || (bp.I)) {
        a(true, true);
      }
    }
  }
  
  public void a(boolean p_110160_1_, boolean p_110160_2_)
  {
    if (bo)
    {
      bo = false;
      bp = null;
      if ((!o.D) && (p_110160_2_)) {
        a(zy.cn, 1);
      }
      if ((!o.D) && (p_110160_1_) && ((o instanceof le))) {
        ((le)o).s().a(this, new hl(1, this, (pk)null));
      }
    }
  }
  
  public boolean cb()
  {
    return (!cc()) && (!(this instanceof vq));
  }
  
  public boolean cc()
  {
    return bo;
  }
  
  public pk cd()
  {
    return bp;
  }
  
  public void a(pk entityIn, boolean sendAttachNotification)
  {
    bo = true;
    bp = entityIn;
    if ((!o.D) && (sendAttachNotification) && ((o instanceof le))) {
      ((le)o).s().a(this, new hl(1, this, bp));
    }
  }
  
  private void n()
  {
    if ((bo) && (bq != null)) {
      if ((bq.b("UUIDMost", 4)) && (bq.b("UUIDLeast", 4)))
      {
        UUID var5 = new UUID(bq.g("UUIDMost"), bq.g("UUIDLeast"));
        List var6 = o.a(pr.class, aR().b(10.0D, 10.0D, 10.0D));
        Iterator var3 = var6.iterator();
        while (var3.hasNext())
        {
          pr var4 = (pr)var3.next();
          if (var4.aK().equals(var5))
          {
            bp = var4;
            break;
          }
        }
      }
      else if ((bq.b("X", 99)) && (bq.b("Y", 99)) && (bq.b("Z", 99)))
      {
        cj var1 = new cj(bq.f("X"), bq.f("Y"), bq.f("Z"));
        up var2 = up.b(o, var1);
        if (var2 == null) {
          var2 = up.a(o, var1);
        }
        bp = var2;
      }
      else
      {
        a(false, true);
      }
    }
    bq = null;
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
      if ((var3 < 0) || (var3 >= bl.length)) {
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
    ac.b(15, Byte.valueOf((byte)(p_94061_1_ ? 1 : 0)));
  }
  
  public boolean ce()
  {
    return ac.a(15) != 0;
  }
  
  public static enum a
  {
    private static final a[] d = { a, b, c };
    private static final String __OBFID = "CL_00002255";
  }
  
  public boolean aj()
  {
    if (T) {
      return false;
    }
    BlockPosM posM = new BlockPosM(0, 0, 0);
    for (int var1 = 0; var1 < 8; var1++)
    {
      double var2 = s + ((var1 >> 0) % 2 - 0.5F) * J * 0.8F;
      double var4 = t + ((var1 >> 1) % 2 - 0.5F) * 0.1F;
      double var6 = u + ((var1 >> 2) % 2 - 0.5F) * J * 0.8F;
      
      posM.setXyz(var2, var4 + aS(), var6);
      if (o.p(posM).c().w()) {
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
    if (au > 0) {
      return false;
    }
    if (W < 20) {
      return false;
    }
    adm world = e();
    if (world == null) {
      return false;
    }
    if (j.size() != 1) {
      return false;
    }
    pk player = (pk)j.get(0);
    
    double dx = Math.abs(s - s) - 16.0D;
    double dz = Math.abs(u - u) - 16.0D;
    double distSq = dx * dx + dz * dz;
    if (a(distSq)) {
      return false;
    }
    return true;
  }
  
  private void onUpdateMinimal()
  {
    aQ += 1;
    if ((this instanceof vv))
    {
      float brightness = c(1.0F);
      if (brightness > 0.5F) {
        aQ += 2;
      }
    }
    D();
  }
}
