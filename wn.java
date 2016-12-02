import com.google.common.base.Charsets;
import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;
import de.labystudio.utils.OldSneaking;
import de.labystudio.utils.TiltSupport;
import de.labystudio.utils.TiltSupport.RenderCallback;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;

public abstract class wn
  extends pr
{
  public wm bi = new wm(this);
  private yd a = new yd();
  public xi bj;
  public xi bk;
  protected xg bl = new xg();
  protected int bm;
  public float bn;
  public float bo;
  public int bp;
  public double bq;
  public double br;
  public double bs;
  public double bt;
  public double bu;
  public double bv;
  protected boolean bw;
  public cj bx;
  private int b;
  public float by;
  public float bZ;
  public float bz;
  private cj c;
  private boolean d;
  private cj e;
  public wl bA = new wl();
  public int bB;
  public int bC;
  public float bD;
  private int f;
  private zx g;
  private int h;
  protected float bE = 0.1F;
  protected float bF = 0.02F;
  private int i;
  private final GameProfile bH;
  private boolean bI = false;
  public ur bG;
  
  public wn(adm worldIn, GameProfile gameProfileIn)
  {
    super(worldIn);
    this.aq = a(gameProfileIn);
    this.bH = gameProfileIn;
    this.bj = new xy(this.bi, !worldIn.D, this);
    this.bk = this.bj;
    cj blockpos = worldIn.M();
    b(blockpos.n() + 0.5D, blockpos.o() + 1, blockpos.p() + 0.5D, 0.0F, 0.0F);
    this.aV = 180.0F;
    this.X = 20;
  }
  
  protected void aX()
  {
    super.aX();
    by().b(vy.e).a(1.0D);
    a(vy.d).a(0.10000000149011612D);
  }
  
  protected void h()
  {
    super.h();
    this.ac.a(16, Byte.valueOf((byte)0));
    this.ac.a(17, Float.valueOf(0.0F));
    this.ac.a(18, Integer.valueOf(0));
    this.ac.a(10, Byte.valueOf((byte)0));
  }
  
  public zx bQ()
  {
    return this.g;
  }
  
  public int bR()
  {
    return this.h;
  }
  
  public boolean bS()
  {
    return this.g != null;
  }
  
  public int bT()
  {
    return bS() ? this.g.l() - this.h : 0;
  }
  
  public void bU()
  {
    if (this.g != null) {
      this.g.b(this.o, this, this.h);
    }
    bV();
  }
  
  public void bV()
  {
    this.g = null;
    this.h = 0;
    if (!this.o.D) {
      f(false);
    }
  }
  
  public boolean bW()
  {
    return (bS()) && (this.g.b().e(this.g) == aba.d);
  }
  
  public void t_()
  {
    this.T = v();
    if (v()) {
      this.C = false;
    }
    if (this.g != null)
    {
      zx itemstack = this.bi.h();
      if (itemstack == this.g)
      {
        if ((this.h <= 25) && (this.h % 4 == 0)) {
          b(itemstack, 5);
        }
        if ((--this.h == 0) && (!this.o.D)) {
          s();
        }
      }
      else
      {
        bV();
      }
    }
    if (this.bp > 0) {
      this.bp -= 1;
    }
    if (bJ())
    {
      this.b += 1;
      if (this.b > 100) {
        this.b = 100;
      }
      if (!this.o.D) {
        if (!p()) {
          a(true, true, false);
        } else if (this.o.w()) {
          a(false, true, true);
        }
      }
    }
    else if (this.b > 0)
    {
      this.b += 1;
      if (this.b >= 110) {
        this.b = 0;
      }
    }
    super.t_();
    if ((!this.o.D) && (this.bk != null) && (!this.bk.a(this)))
    {
      n();
      this.bk = this.bj;
    }
    if ((at()) && (this.bA.a)) {
      N();
    }
    this.bq = this.bt;
    this.br = this.bu;
    this.bs = this.bv;
    double d5 = this.s - this.bt;
    double d0 = this.t - this.bu;
    double d1 = this.u - this.bv;
    double d2 = 10.0D;
    if (d5 > d2) {
      this.bq = (this.bt = this.s);
    }
    if (d1 > d2) {
      this.bs = (this.bv = this.u);
    }
    if (d0 > d2) {
      this.br = (this.bu = this.t);
    }
    if (d5 < -d2) {
      this.bq = (this.bt = this.s);
    }
    if (d1 < -d2) {
      this.bs = (this.bv = this.u);
    }
    if (d0 < -d2) {
      this.br = (this.bu = this.t);
    }
    this.bt += d5 * 0.25D;
    this.bv += d1 * 0.25D;
    this.bu += d0 * 0.25D;
    if (this.m == null) {
      this.e = null;
    }
    if (!this.o.D)
    {
      this.bl.a(this);
      b(na.g);
      if (ai()) {
        b(na.h);
      }
    }
    int i = 29999999;
    double d3 = ns.a(this.s, -2.9999999E7D, 2.9999999E7D);
    double d4 = ns.a(this.u, -2.9999999E7D, 2.9999999E7D);
    if ((d3 != this.s) || (d4 != this.u)) {
      b(d3, this.t, d4);
    }
  }
  
  public int L()
  {
    return this.bA.a ? 0 : 80;
  }
  
  protected String P()
  {
    return "game.player.swim";
  }
  
  protected String aa()
  {
    return "game.player.swim.splash";
  }
  
  public int aq()
  {
    return 10;
  }
  
  public void a(String name, float volume, float pitch)
  {
    this.o.a(this, name, volume, pitch);
  }
  
  protected void b(zx itemStackIn, int p_71010_2_)
  {
    if (itemStackIn.m() == aba.c) {
      a("random.drink", 0.5F, this.o.s.nextFloat() * 0.1F + 0.9F);
    }
    if (itemStackIn.m() == aba.b)
    {
      for (int i = 0; i < p_71010_2_; i++)
      {
        aui vec3 = new aui((this.V.nextFloat() - 0.5D) * 0.1D, Math.random() * 0.1D + 0.1D, 0.0D);
        vec3 = vec3.a(-this.z * 3.1415927F / 180.0F);
        vec3 = vec3.b(-this.y * 3.1415927F / 180.0F);
        double d0 = -this.V.nextFloat() * 0.6D - 0.3D;
        aui vec31 = new aui((this.V.nextFloat() - 0.5D) * 0.3D, d0, 0.6D);
        vec31 = vec31.a(-this.z * 3.1415927F / 180.0F);
        vec31 = vec31.b(-this.y * 3.1415927F / 180.0F);
        vec31 = vec31.b(this.s, this.t + aS(), this.u);
        if (itemStackIn.f()) {
          this.o.a(cy.K, vec31.a, vec31.b, vec31.c, vec3.a, vec3.b + 0.05D, vec3.c, new int[] { zw.b(itemStackIn.b()), itemStackIn.i() });
        } else {
          this.o.a(cy.K, vec31.a, vec31.b, vec31.c, vec3.a, vec3.b + 0.05D, vec3.c, new int[] { zw.b(itemStackIn.b()) });
        }
      }
      a("random.eat", 0.5F + 0.5F * this.V.nextInt(2), (this.V.nextFloat() - this.V.nextFloat()) * 0.2F + 1.0F);
    }
  }
  
  protected void s()
  {
    if (this.g != null)
    {
      b(this.g, 16);
      int i = this.g.b;
      zx itemstack = this.g.b(this.o, this);
      if ((itemstack != this.g) || ((itemstack != null) && (itemstack.b != i)))
      {
        this.bi.a[this.bi.c] = itemstack;
        if (itemstack.b == 0) {
          this.bi.a[this.bi.c] = null;
        }
      }
      bV();
    }
  }
  
  public void a(byte id)
  {
    if (id == 9) {
      s();
    } else if (id == 23) {
      this.bI = false;
    } else if (id == 22) {
      this.bI = true;
    } else {
      super.a(id);
    }
  }
  
  protected boolean bD()
  {
    return (bn() <= 0.0F) || (bJ());
  }
  
  protected void n()
  {
    this.bk = this.bj;
  }
  
  public void ak()
  {
    if ((!this.o.D) && (av()))
    {
      a((pk)null);
      c(false);
    }
    else
    {
      double d0 = this.s;
      double d1 = this.t;
      double d2 = this.u;
      float f = this.y;
      float f1 = this.z;
      super.ak();
      this.bn = this.bo;
      this.bo = 0.0F;
      l(this.s - d0, this.t - d1, this.u - d2);
      if ((this.m instanceof tt))
      {
        this.z = f1;
        this.y = f;
        this.aI = ((tt)this.m).aI;
      }
    }
  }
  
  public void I()
  {
    a(0.6F, 1.8F);
    super.I();
    i(bu());
    this.ax = 0;
  }
  
  protected void bK()
  {
    super.bK();
    bx();
    this.aK = this.y;
  }
  
  public void m()
  {
    if (this.bm > 0) {
      this.bm -= 1;
    }
    if ((this.o.aa() == oj.a) && (this.o.Q().b("naturalRegeneration")))
    {
      if ((bn() < bu()) && (this.W % 20 == 0)) {
        h(1.0F);
      }
      if ((this.bl.c()) && (this.W % 10 == 0)) {
        this.bl.a(this.bl.a() + 1);
      }
    }
    this.bi.k();
    this.bn = this.bo;
    super.m();
    qc iattributeinstance = a(vy.d);
    if (!this.o.D) {
      iattributeinstance.a(this.bA.b());
    }
    this.aM = this.bF;
    if (aw()) {
      this.aM = ((float)(this.aM + this.bF * 0.3D));
    }
    k((float)iattributeinstance.e());
    float f = ns.a(this.v * this.v + this.x * this.x);
    float f1 = (float)(Math.atan(-this.w * 0.20000000298023224D) * 15.0D);
    if (f > 0.1F) {
      f = 0.1F;
    }
    if ((!this.C) || (bn() <= 0.0F)) {
      f = 0.0F;
    }
    if ((this.C) || (bn() <= 0.0F)) {
      f1 = 0.0F;
    }
    this.bo += (f - this.bo) * 0.4F;
    this.aF += (f1 - this.aF) * 0.8F;
    if ((bn() > 0.0F) && (!v()))
    {
      aug axisalignedbb = null;
      if ((this.m != null) && (!this.m.I)) {
        axisalignedbb = aR().a(this.m.aR()).b(1.0D, 0.0D, 1.0D);
      } else {
        axisalignedbb = aR().b(1.0D, 0.5D, 1.0D);
      }
      List<pk> list = this.o.b(this, axisalignedbb);
      for (int i = 0; i < list.size(); i++)
      {
        pk entity = (pk)list.get(i);
        if (!entity.I) {
          d(entity);
        }
      }
    }
  }
  
  private void d(pk p_71044_1_)
  {
    p_71044_1_.d(this);
  }
  
  public int bX()
  {
    return this.ac.c(18);
  }
  
  public void r(int p_85040_1_)
  {
    this.ac.b(18, Integer.valueOf(p_85040_1_));
  }
  
  public void s(int p_85039_1_)
  {
    int i = bX();
    this.ac.b(18, Integer.valueOf(i + p_85039_1_));
  }
  
  public void a(ow cause)
  {
    super.a(cause);
    a(0.2F, 0.2F);
    b(this.s, this.t, this.u);
    this.w = 0.10000000149011612D;
    if (e_().equals("Notch")) {
      a(new zx(zy.e, 1), true, false);
    }
    if (!this.o.Q().b("keepInventory")) {
      this.bi.n();
    }
    if (cause != null)
    {
      this.v = (-ns.b((this.aw + this.y) * 3.1415927F / 180.0F) * 0.1F);
      this.x = (-ns.a((this.aw + this.y) * 3.1415927F / 180.0F) * 0.1F);
    }
    else
    {
      this.v = (this.x = 0.0D);
    }
    b(na.y);
    a(na.h);
  }
  
  protected String bo()
  {
    return "game.player.hurt";
  }
  
  protected String bp()
  {
    return "game.player.die";
  }
  
  public void b(pk entityIn, int amount)
  {
    s(amount);
    Collection<auk> collection = cp().a(auu.f);
    if ((entityIn instanceof wn))
    {
      b(na.B);
      collection.addAll(cp().a(auu.e));
      collection.addAll(e(entityIn));
    }
    else
    {
      b(na.z);
    }
    for (auk scoreobjective : collection)
    {
      aum score = cp().c(e_(), scoreobjective);
      score.a();
    }
  }
  
  private Collection<auk> e(pk p_175137_1_)
  {
    aul scoreplayerteam = cp().h(e_());
    if (scoreplayerteam != null)
    {
      int i = scoreplayerteam.l().b();
      if ((i >= 0) && (i < auu.i.length)) {
        for (auk scoreobjective : cp().a(auu.i[i]))
        {
          aum score = cp().c(p_175137_1_.e_(), scoreobjective);
          score.a();
        }
      }
    }
    aul scoreplayerteam1 = cp().h(p_175137_1_.e_());
    if (scoreplayerteam1 != null)
    {
      int j = scoreplayerteam1.l().b();
      if ((j >= 0) && (j < auu.h.length)) {
        return cp().a(auu.h[j]);
      }
    }
    return Lists.newArrayList();
  }
  
  public uz a(boolean dropAll)
  {
    return a(this.bi.a(this.bi.c, (dropAll) && (this.bi.h() != null) ? this.bi.h().b : 1), false, true);
  }
  
  public uz a(zx itemStackIn, boolean unused)
  {
    return a(itemStackIn, false, false);
  }
  
  public uz a(zx droppedItem, boolean dropAround, boolean traceItem)
  {
    if (droppedItem == null) {
      return null;
    }
    if (droppedItem.b == 0) {
      return null;
    }
    double d0 = this.t - 0.30000001192092896D + aS();
    uz entityitem = new uz(this.o, this.s, d0, this.u, droppedItem);
    entityitem.a(40);
    if (traceItem) {
      entityitem.c(e_());
    }
    if (dropAround)
    {
      float f = this.V.nextFloat() * 0.5F;
      float f1 = this.V.nextFloat() * 3.1415927F * 2.0F;
      entityitem.v = (-ns.a(f1) * f);
      entityitem.x = (ns.b(f1) * f);
      entityitem.w = 0.20000000298023224D;
    }
    else
    {
      float f2 = 0.3F;
      entityitem.v = (-ns.a(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * f2);
      entityitem.x = (ns.b(this.y / 180.0F * 3.1415927F) * ns.b(this.z / 180.0F * 3.1415927F) * f2);
      entityitem.w = (-ns.a(this.z / 180.0F * 3.1415927F) * f2 + 0.1F);
      float f3 = this.V.nextFloat() * 3.1415927F * 2.0F;
      f2 = 0.02F * this.V.nextFloat();
      entityitem.v += Math.cos(f3) * f2;
      entityitem.w += (this.V.nextFloat() - this.V.nextFloat()) * 0.1F;
      entityitem.x += Math.sin(f3) * f2;
    }
    a(entityitem);
    if (traceItem) {
      b(na.v);
    }
    return entityitem;
  }
  
  protected void a(uz itemIn)
  {
    this.o.d(itemIn);
  }
  
  public float a(afh p_180471_1_)
  {
    float f = this.bi.a(p_180471_1_);
    if (f > 1.0F)
    {
      int i = ack.c(this);
      zx itemstack = this.bi.h();
      if ((i > 0) && (itemstack != null)) {
        f += i * i + 1;
      }
    }
    if (a(pe.e)) {
      f *= (1.0F + (b(pe.e).c() + 1) * 0.2F);
    }
    if (a(pe.f))
    {
      float f1 = 1.0F;
      switch (b(pe.f).c())
      {
      case 0: 
        f1 = 0.3F;
        break;
      case 1: 
        f1 = 0.09F;
        break;
      case 2: 
        f1 = 0.0027F;
        break;
      case 3: 
      default: 
        f1 = 8.1E-4F;
      }
      f *= f1;
    }
    if ((a(arm.h)) && (!ack.j(this))) {
      f /= 5.0F;
    }
    if (!this.C) {
      f /= 5.0F;
    }
    return f;
  }
  
  public boolean b(afh blockToHarvest)
  {
    return this.bi.b(blockToHarvest);
  }
  
  public void a(dn tagCompund)
  {
    super.a(tagCompund);
    this.aq = a(this.bH);
    du nbttaglist = tagCompund.c("Inventory", 10);
    this.bi.b(nbttaglist);
    this.bi.c = tagCompund.f("SelectedItemSlot");
    this.bw = tagCompund.n("Sleeping");
    this.b = tagCompund.e("SleepTimer");
    this.bD = tagCompund.h("XpP");
    this.bB = tagCompund.f("XpLevel");
    this.bC = tagCompund.f("XpTotal");
    this.f = tagCompund.f("XpSeed");
    if (this.f == 0) {
      this.f = this.V.nextInt();
    }
    r(tagCompund.f("Score"));
    if (this.bw)
    {
      this.bx = new cj(this);
      a(true, true, false);
    }
    if ((tagCompund.b("SpawnX", 99)) && (tagCompund.b("SpawnY", 99)) && (tagCompund.b("SpawnZ", 99)))
    {
      this.c = new cj(tagCompund.f("SpawnX"), tagCompund.f("SpawnY"), tagCompund.f("SpawnZ"));
      this.d = tagCompund.n("SpawnForced");
    }
    this.bl.a(tagCompund);
    this.bA.b(tagCompund);
    if (tagCompund.b("EnderItems", 9))
    {
      du nbttaglist1 = tagCompund.c("EnderItems", 10);
      this.a.a(nbttaglist1);
    }
  }
  
  public void b(dn tagCompound)
  {
    super.b(tagCompound);
    tagCompound.a("Inventory", this.bi.a(new du()));
    tagCompound.a("SelectedItemSlot", this.bi.c);
    tagCompound.a("Sleeping", this.bw);
    tagCompound.a("SleepTimer", (short)this.b);
    tagCompound.a("XpP", this.bD);
    tagCompound.a("XpLevel", this.bB);
    tagCompound.a("XpTotal", this.bC);
    tagCompound.a("XpSeed", this.f);
    tagCompound.a("Score", bX());
    if (this.c != null)
    {
      tagCompound.a("SpawnX", this.c.n());
      tagCompound.a("SpawnY", this.c.o());
      tagCompound.a("SpawnZ", this.c.p());
      tagCompound.a("SpawnForced", this.d);
    }
    this.bl.b(tagCompound);
    this.bA.a(tagCompound);
    tagCompound.a("EnderItems", this.a.h());
    zx itemstack = this.bi.h();
    if ((itemstack != null) && (itemstack.b() != null)) {
      tagCompound.a("SelectedItem", itemstack.b(new dn()));
    }
  }
  
  public boolean a(ow source, float amount)
  {
    if (b(source)) {
      return false;
    }
    if ((this.bA.a) && (!source.g())) {
      return false;
    }
    this.aQ = 0;
    if (bn() <= 0.0F) {
      return false;
    }
    if ((bJ()) && (!this.o.D)) {
      a(true, true, false);
    }
    if (source.r())
    {
      if (this.o.aa() == oj.a) {
        amount = 0.0F;
      }
      if (this.o.aa() == oj.b) {
        amount = amount / 2.0F + 1.0F;
      }
      if (this.o.aa() == oj.d) {
        amount = amount * 3.0F / 2.0F;
      }
    }
    if (amount == 0.0F) {
      return false;
    }
    pk entity = source.j();
    if (((entity instanceof wq)) && (((wq)entity).c != null)) {
      entity = ((wq)entity).c;
    }
    return super.a(source, amount);
  }
  
  public boolean a(wn other)
  {
    auq team = bO();
    auq team1 = other.bO();
    return !team.a(team1) ? true : team == null ? true : team.g();
  }
  
  protected void j(float p_70675_1_)
  {
    this.bi.a(p_70675_1_);
  }
  
  public int br()
  {
    return this.bi.m();
  }
  
  public float bY()
  {
    int i = 0;
    for (zx itemstack : this.bi.b) {
      if (itemstack != null) {
        i++;
      }
    }
    return i / this.bi.b.length;
  }
  
  protected void d(ow damageSrc, float damageAmount)
  {
    if (!b(damageSrc))
    {
      if ((!damageSrc.e()) && (bW()) && (damageAmount > 0.0F)) {
        damageAmount = (1.0F + damageAmount) * 0.5F;
      }
      damageAmount = b(damageSrc, damageAmount);
      damageAmount = c(damageSrc, damageAmount);
      float f = damageAmount;
      damageAmount = Math.max(damageAmount - bN(), 0.0F);
      m(bN() - (f - damageAmount));
      if (damageAmount != 0.0F)
      {
        a(damageSrc.f());
        float f1 = bn();
        i(bn() - damageAmount);
        bs().a(damageSrc, f1, damageAmount);
        if (damageAmount < 3.4028235E37F) {
          a(na.x, Math.round(damageAmount * 10.0F));
        }
      }
    }
  }
  
  public void a(aln signTile) {}
  
  public void a(adc cmdBlockLogic) {}
  
  public void a(acy villager) {}
  
  public void a(og chestInventory) {}
  
  public void a(tp horse, og horseInventory) {}
  
  public void a(ol guiOwner) {}
  
  public void a(zx bookStack) {}
  
  public boolean u(pk p_70998_1_)
  {
    if (v())
    {
      if ((p_70998_1_ instanceof og)) {
        a((og)p_70998_1_);
      }
      return false;
    }
    zx itemstack = bZ();
    zx itemstack1 = itemstack != null ? itemstack.k() : null;
    if (!p_70998_1_.e(this))
    {
      if ((itemstack != null) && ((p_70998_1_ instanceof pr)))
      {
        if (this.bA.d) {
          itemstack = itemstack1;
        }
        if (itemstack.a(this, (pr)p_70998_1_))
        {
          if ((itemstack.b <= 0) && (!this.bA.d)) {
            ca();
          }
          return true;
        }
      }
      return false;
    }
    if ((itemstack != null) && (itemstack == bZ())) {
      if ((itemstack.b <= 0) && (!this.bA.d)) {
        ca();
      } else if ((itemstack.b < itemstack1.b) && (this.bA.d)) {
        itemstack.b = itemstack1.b;
      }
    }
    return true;
  }
  
  public zx bZ()
  {
    return this.bi.h();
  }
  
  public void ca()
  {
    this.bi.a(this.bi.c, (zx)null);
  }
  
  public double am()
  {
    return -0.35D;
  }
  
  public void f(pk targetEntity)
  {
    if (targetEntity.aD()) {
      if (!targetEntity.l(this))
      {
        float f = (float)a(vy.e).e();
        int i = 0;
        float f1 = 0.0F;
        if ((targetEntity instanceof pr)) {
          f1 = ack.a(bA(), ((pr)targetEntity).bz());
        } else {
          f1 = ack.a(bA(), pw.a);
        }
        i += ack.a(this);
        if (aw()) {
          i++;
        }
        if ((f > 0.0F) || (f1 > 0.0F))
        {
          boolean flag = (this.O > 0.0F) && (!this.C) && (!k_()) && (!V()) && (!a(pe.q)) && (this.m == null) && ((targetEntity instanceof pr));
          if ((flag) && (f > 0.0F)) {
            f *= 1.5F;
          }
          f += f1;
          boolean flag1 = false;
          int j = ack.b(this);
          if (((targetEntity instanceof pr)) && (j > 0) && (!targetEntity.at()))
          {
            flag1 = true;
            targetEntity.e(1);
          }
          double d0 = targetEntity.v;
          double d1 = targetEntity.w;
          double d2 = targetEntity.x;
          boolean flag2 = targetEntity.a(ow.a(this), f);
          if (flag2)
          {
            if (i > 0)
            {
              targetEntity.g(-ns.a(this.y * 3.1415927F / 180.0F) * i * 0.5F, 0.1D, ns.b(this.y * 3.1415927F / 180.0F) * i * 0.5F);
              this.v *= 0.6D;
              this.x *= 0.6D;
              d(false);
            }
            if (((targetEntity instanceof lf)) && (targetEntity.G))
            {
              ((lf)targetEntity).a.a(new hm(targetEntity));
              targetEntity.G = false;
              targetEntity.v = d0;
              targetEntity.w = d1;
              targetEntity.x = d2;
            }
            if (flag) {
              b(targetEntity);
            }
            if (f1 > 0.0F) {
              c(targetEntity);
            }
            if (f >= 18.0F) {
              b(mr.F);
            }
            p(targetEntity);
            if ((targetEntity instanceof pr)) {
              ack.a((pr)targetEntity, this);
            }
            ack.b(this, targetEntity);
            zx itemstack = bZ();
            pk entity = targetEntity;
            if ((targetEntity instanceof ue))
            {
              ud ientitymultipart = ((ue)targetEntity).a;
              if ((ientitymultipart instanceof pr)) {
                entity = (pr)ientitymultipart;
              }
            }
            if ((itemstack != null) && ((entity instanceof pr)))
            {
              itemstack.a((pr)entity, this);
              if (itemstack.b <= 0) {
                ca();
              }
            }
            if ((targetEntity instanceof pr))
            {
              a(na.w, Math.round(f * 10.0F));
              if (j > 0) {
                targetEntity.e(j * 4);
              }
            }
            a(0.3F);
          }
          else if (flag1)
          {
            targetEntity.N();
          }
        }
      }
    }
  }
  
  public void b(pk entityHit) {}
  
  public void c(pk entityHit) {}
  
  public void cb() {}
  
  public void J()
  {
    super.J();
    this.bj.b(this);
    if (this.bk != null) {
      this.bk.b(this);
    }
  }
  
  public boolean aj()
  {
    return (!this.bw) && (super.aj());
  }
  
  public boolean cc()
  {
    return false;
  }
  
  public GameProfile cd()
  {
    return this.bH;
  }
  
  public wn.a a(cj bedLocation)
  {
    if (!this.o.D)
    {
      if ((bJ()) || (!ai())) {
        return wn.a.e;
      }
      if (!this.o.t.d()) {
        return wn.a.b;
      }
      if (this.o.w()) {
        return wn.a.c;
      }
      if ((Math.abs(this.s - bedLocation.n()) > 3.0D) || (Math.abs(this.t - bedLocation.o()) > 2.0D) || (Math.abs(this.u - bedLocation.p()) > 3.0D)) {
        return wn.a.d;
      }
      double d0 = 8.0D;
      double d1 = 5.0D;
      List<vv> list = this.o.a(vv.class, new aug(bedLocation.n() - d0, bedLocation.o() - d1, bedLocation.p() - d0, bedLocation.n() + d0, bedLocation.o() + d1, bedLocation.p() + d0));
      if (!list.isEmpty()) {
        return wn.a.f;
      }
    }
    if (au()) {
      a((pk)null);
    }
    a(0.2F, 0.2F);
    if (this.o.e(bedLocation))
    {
      cq enumfacing = (cq)this.o.p(bedLocation).b(age.O);
      float f = 0.5F;
      float f1 = 0.5F;
      switch (enumfacing)
      {
      case d: 
        f1 = 0.9F;
        break;
      case c: 
        f1 = 0.1F;
        break;
      case e: 
        f = 0.1F;
        break;
      case f: 
        f = 0.9F;
      }
      a(enumfacing);
      b(bedLocation.n() + f, bedLocation.o() + 0.6875F, bedLocation.p() + f1);
    }
    else
    {
      b(bedLocation.n() + 0.5F, bedLocation.o() + 0.6875F, bedLocation.p() + 0.5F);
    }
    this.bw = true;
    this.b = 0;
    this.bx = bedLocation;
    this.v = (this.x = this.w = 0.0D);
    if (!this.o.D) {
      this.o.d();
    }
    return wn.a.a;
  }
  
  private void a(cq p_175139_1_)
  {
    this.by = 0.0F;
    this.bz = 0.0F;
    switch (p_175139_1_)
    {
    case d: 
      this.bz = -1.8F;
      break;
    case c: 
      this.bz = 1.8F;
      break;
    case e: 
      this.by = 1.8F;
      break;
    case f: 
      this.by = -1.8F;
    }
  }
  
  public void a(boolean p_70999_1_, boolean updateWorldFlag, boolean setSpawn)
  {
    a(0.6F, 1.8F);
    alz iblockstate = this.o.p(this.bx);
    if ((this.bx != null) && (iblockstate.c() == afi.C))
    {
      this.o.a(this.bx, iblockstate.a(afg.b, Boolean.valueOf(false)), 4);
      cj blockpos = afg.a(this.o, this.bx, 0);
      if (blockpos == null) {
        blockpos = this.bx.a();
      }
      b(blockpos.n() + 0.5F, blockpos.o() + 0.1F, blockpos.p() + 0.5F);
    }
    this.bw = false;
    if ((!this.o.D) && (updateWorldFlag)) {
      this.o.d();
    }
    this.b = (p_70999_1_ ? 0 : 100);
    if (setSpawn) {
      a(this.bx, false);
    }
  }
  
  private boolean p()
  {
    return this.o.p(this.bx).c() == afi.C;
  }
  
  public static cj a(adm worldIn, cj bedLocation, boolean forceSpawn)
  {
    afh block = worldIn.p(bedLocation).c();
    if (block != afi.C)
    {
      if (!forceSpawn) {
        return null;
      }
      boolean flag = block.g();
      boolean flag1 = worldIn.p(bedLocation.a()).c().g();
      return (flag) && (flag1) ? bedLocation : null;
    }
    return afg.a(worldIn, bedLocation, 0);
  }
  
  public float ce()
  {
    if (this.bx != null)
    {
      cq enumfacing = (cq)this.o.p(this.bx).b(age.O);
      switch (enumfacing)
      {
      case d: 
        return 90.0F;
      case c: 
        return 270.0F;
      case e: 
        return 0.0F;
      case f: 
        return 180.0F;
      }
    }
    return 0.0F;
  }
  
  public boolean bJ()
  {
    return this.bw;
  }
  
  public boolean cf()
  {
    return (this.bw) && (this.b >= 100);
  }
  
  public int cg()
  {
    return this.b;
  }
  
  public void b(eu chatComponent) {}
  
  public cj ch()
  {
    return this.c;
  }
  
  public boolean ci()
  {
    return this.d;
  }
  
  public void a(cj pos, boolean forced)
  {
    if (pos != null)
    {
      this.c = pos;
      this.d = forced;
    }
    else
    {
      this.c = null;
      this.d = false;
    }
  }
  
  public void b(mw achievementIn)
  {
    a(achievementIn, 1);
  }
  
  public void a(mw stat, int amount) {}
  
  public void a(mw p_175145_1_) {}
  
  public void bF()
  {
    super.bF();
    b(na.u);
    if (aw()) {
      a(0.8F);
    } else {
      a(0.2F);
    }
  }
  
  public void g(float strafe, float forward)
  {
    double d0 = this.s;
    double d1 = this.t;
    double d2 = this.u;
    if ((this.bA.b) && (this.m == null))
    {
      double d3 = this.w;
      float f = this.aM;
      this.aM = (this.bA.a() * (aw() ? 2 : 1));
      super.g(strafe, forward);
      this.w = (d3 * 0.6D);
      this.aM = f;
    }
    else
    {
      super.g(strafe, forward);
    }
    k(this.s - d0, this.t - d1, this.u - d2);
  }
  
  public float bI()
  {
    return (float)a(vy.d).e();
  }
  
  public void k(double p_71000_1_, double p_71000_3_, double p_71000_5_)
  {
    if (this.m == null) {
      if (a(arm.h))
      {
        int i = Math.round(ns.a(p_71000_1_ * p_71000_1_ + p_71000_3_ * p_71000_3_ + p_71000_5_ * p_71000_5_) * 100.0F);
        if (i > 0)
        {
          a(na.p, i);
          a(0.015F * i * 0.01F);
        }
      }
      else if (V())
      {
        int j = Math.round(ns.a(p_71000_1_ * p_71000_1_ + p_71000_5_ * p_71000_5_) * 100.0F);
        if (j > 0)
        {
          a(na.l, j);
          a(0.015F * j * 0.01F);
        }
      }
      else if (k_())
      {
        if (p_71000_3_ > 0.0D) {
          a(na.n, (int)Math.round(p_71000_3_ * 100.0D));
        }
      }
      else if (this.C)
      {
        int k = Math.round(ns.a(p_71000_1_ * p_71000_1_ + p_71000_5_ * p_71000_5_) * 100.0F);
        if (k > 0)
        {
          a(na.i, k);
          if (aw())
          {
            a(na.k, k);
            a(0.099999994F * k * 0.01F);
          }
          else
          {
            if (av()) {
              a(na.j, k);
            }
            a(0.01F * k * 0.01F);
          }
        }
      }
      else
      {
        int l = Math.round(ns.a(p_71000_1_ * p_71000_1_ + p_71000_5_ * p_71000_5_) * 100.0F);
        if (l > 25) {
          a(na.o, l);
        }
      }
    }
  }
  
  private void l(double p_71015_1_, double p_71015_3_, double p_71015_5_)
  {
    if (this.m != null)
    {
      int i = Math.round(ns.a(p_71015_1_ * p_71015_1_ + p_71015_3_ * p_71015_3_ + p_71015_5_ * p_71015_5_) * 100.0F);
      if (i > 0) {
        if ((this.m instanceof va))
        {
          a(na.q, i);
          if (this.e == null) {
            this.e = new cj(this);
          } else if (this.e.c(ns.c(this.s), ns.c(this.t), ns.c(this.u)) >= 1000000.0D) {
            b(mr.q);
          }
        }
        else if ((this.m instanceof ux))
        {
          a(na.r, i);
        }
        else if ((this.m instanceof tt))
        {
          a(na.s, i);
        }
        else if ((this.m instanceof tp))
        {
          a(na.t, i);
        }
      }
    }
  }
  
  public void e(float distance, float damageMultiplier)
  {
    if (!this.bA.c)
    {
      if (distance >= 2.0F) {
        a(na.m, (int)Math.round(distance * 100.0D));
      }
      super.e(distance, damageMultiplier);
    }
  }
  
  protected void X()
  {
    if (!v()) {
      super.X();
    }
  }
  
  protected String n(int damageValue)
  {
    return damageValue > 4 ? "game.player.hurt.fall.big" : "game.player.hurt.fall.small";
  }
  
  public void a(pr entityLivingIn)
  {
    if ((entityLivingIn instanceof vq)) {
      b(mr.s);
    }
    pm.a entitylist$entityegginfo = (pm.a)pm.a.get(Integer.valueOf(pm.a(entityLivingIn)));
    if (entitylist$entityegginfo != null) {
      b(entitylist$entityegginfo.d);
    }
  }
  
  public void aA()
  {
    if (!this.bA.b) {
      super.aA();
    }
  }
  
  public zx q(int slotIn)
  {
    return this.bi.e(slotIn);
  }
  
  public void u(int amount)
  {
    s(amount);
    int i = Integer.MAX_VALUE - this.bC;
    if (amount > i) {
      amount = i;
    }
    this.bD += amount / ck();
    for (this.bC += amount; this.bD >= 1.0F; this.bD /= ck())
    {
      this.bD = ((this.bD - 1.0F) * ck());
      a(1);
    }
  }
  
  public int cj()
  {
    return this.f;
  }
  
  public void b(int levels)
  {
    this.bB -= levels;
    if (this.bB < 0)
    {
      this.bB = 0;
      this.bD = 0.0F;
      this.bC = 0;
    }
    this.f = this.V.nextInt();
  }
  
  public void a(int levels)
  {
    this.bB += levels;
    if (this.bB < 0)
    {
      this.bB = 0;
      this.bD = 0.0F;
      this.bC = 0;
    }
    if ((levels > 0) && (this.bB % 5 == 0) && (this.i < this.W - 100.0F))
    {
      float f = this.bB > 30 ? 1.0F : this.bB / 30.0F;
      this.o.a(this, "random.levelup", f * 0.75F, 1.0F);
      this.i = this.W;
    }
  }
  
  public int ck()
  {
    return this.bB >= 15 ? 37 + (this.bB - 15) * 5 : this.bB >= 30 ? 112 + (this.bB - 30) * 9 : 7 + this.bB * 2;
  }
  
  public void a(float p_71020_1_)
  {
    if (!this.bA.a) {
      if (!this.o.D) {
        this.bl.a(p_71020_1_);
      }
    }
  }
  
  public xg cl()
  {
    return this.bl;
  }
  
  public boolean j(boolean ignoreHunger)
  {
    return ((ignoreHunger) || (this.bl.c())) && (!this.bA.a);
  }
  
  public boolean cm()
  {
    return (bn() > 0.0F) && (bn() < bu());
  }
  
  public void a(zx stack, int duration)
  {
    if (stack != this.g)
    {
      this.g = stack;
      this.h = duration;
      if (!this.o.D) {
        f(true);
      }
    }
  }
  
  public boolean cn()
  {
    return this.bA.e;
  }
  
  public boolean a(cj p_175151_1_, cq p_175151_2_, zx p_175151_3_)
  {
    if (this.bA.e) {
      return true;
    }
    if (p_175151_3_ == null) {
      return false;
    }
    cj blockpos = p_175151_1_.a(p_175151_2_.d());
    afh block = this.o.p(blockpos).c();
    return (p_175151_3_.d(block)) || (p_175151_3_.x());
  }
  
  protected int b(wn player)
  {
    if (this.o.Q().b("keepInventory")) {
      return 0;
    }
    int i = this.bB * 7;
    return i > 100 ? 100 : i;
  }
  
  protected boolean bb()
  {
    return true;
  }
  
  public boolean aO()
  {
    return true;
  }
  
  public void a(wn oldPlayer, boolean respawnFromEnd)
  {
    if (respawnFromEnd)
    {
      this.bi.b(oldPlayer.bi);
      i(oldPlayer.bn());
      this.bl = oldPlayer.bl;
      this.bB = oldPlayer.bB;
      this.bC = oldPlayer.bC;
      this.bD = oldPlayer.bD;
      r(oldPlayer.bX());
      this.an = oldPlayer.an;
      this.ao = oldPlayer.ao;
      this.ap = oldPlayer.ap;
    }
    else if (this.o.Q().b("keepInventory"))
    {
      this.bi.b(oldPlayer.bi);
      this.bB = oldPlayer.bB;
      this.bC = oldPlayer.bC;
      this.bD = oldPlayer.bD;
      r(oldPlayer.bX());
    }
    this.f = oldPlayer.f;
    this.a = oldPlayer.a;
    H().b(10, Byte.valueOf(oldPlayer.H().a(10)));
  }
  
  protected boolean s_()
  {
    return !this.bA.b;
  }
  
  public void t() {}
  
  public void a(adp.a gameType) {}
  
  public String e_()
  {
    return this.bH.getName();
  }
  
  public yd co()
  {
    return this.a;
  }
  
  public zx p(int slotIn)
  {
    return slotIn == 0 ? this.bi.h() : this.bi.b[(slotIn - 1)];
  }
  
  public zx bA()
  {
    return this.bi.h();
  }
  
  public void c(int slotIn, zx stack)
  {
    this.bi.b[slotIn] = stack;
  }
  
  public boolean f(wn player)
  {
    if (!ax()) {
      return false;
    }
    if (player.v()) {
      return false;
    }
    auq team = bO();
    return (team == null) || (player == null) || (player.bO() != team) || (!team.h());
  }
  
  public abstract boolean v();
  
  public zx[] as()
  {
    return this.bi.b;
  }
  
  public boolean aL()
  {
    return !this.bA.b;
  }
  
  public auo cp()
  {
    return this.o.Z();
  }
  
  public auq bO()
  {
    return cp().h(e_());
  }
  
  public eu f_()
  {
    eu ichatcomponent = new fa(aul.a(bO(), e_()));
    ichatcomponent.b().a(new et(et.a.e, "/msg " + e_() + " "));
    ichatcomponent.b().a(aQ());
    ichatcomponent.b().a(e_());
    return ichatcomponent;
  }
  
  public float aS()
  {
    float f = 1.62F;
    if (bJ()) {
      f = 0.2F;
    }
    if (av()) {
      f -= 0.08F;
    }
    if ((ConfigManager.settings.oldSneak) && (ave.A().h != null) && (equals(ave.A().h)) && 
      (ave.A().t.aA == 0) && (Allowed.sneakingAnimation())) {
      f = OldSneaking.getCustomEyeHeight(this);
    }
    if (TiltSupport.tiltCamera != null) {
      TiltSupport.tiltCamera.render(this);
    }
    return f;
  }
  
  public void m(float amount)
  {
    if (amount < 0.0F) {
      amount = 0.0F;
    }
    H().b(17, Float.valueOf(amount));
  }
  
  public float bN()
  {
    return H().d(17);
  }
  
  public static UUID a(GameProfile profile)
  {
    UUID uuid = profile.getId();
    if (uuid == null) {
      uuid = b(profile.getName());
    }
    return uuid;
  }
  
  public static UUID b(String username)
  {
    return UUID.nameUUIDFromBytes(("OfflinePlayer:" + username).getBytes(Charsets.UTF_8));
  }
  
  public boolean a(on code)
  {
    if (code.a()) {
      return true;
    }
    zx itemstack = bZ();
    return (itemstack != null) && (itemstack.s()) ? itemstack.q().equals(code.b()) : false;
  }
  
  public boolean a(wo p_175148_1_)
  {
    return (H().a(10) & p_175148_1_.a()) == p_175148_1_.a();
  }
  
  public boolean u_()
  {
    return net.minecraft.server.MinecraftServer.N().d[0].Q().b("sendCommandFeedback");
  }
  
  public boolean d(int inventorySlot, zx itemStackIn)
  {
    if ((inventorySlot >= 0) && (inventorySlot < this.bi.a.length))
    {
      this.bi.a(inventorySlot, itemStackIn);
      return true;
    }
    int i = inventorySlot - 100;
    if ((i >= 0) && (i < this.bi.b.length))
    {
      int k = i + 1;
      if ((itemStackIn != null) && (itemStackIn.b() != null)) {
        if ((itemStackIn.b() instanceof yj))
        {
          if (ps.c(itemStackIn) != k) {
            return false;
          }
        }
        else if ((k != 4) || ((itemStackIn.b() != zy.bX) && (!(itemStackIn.b() instanceof yo)))) {
          return false;
        }
      }
      this.bi.a(i + this.bi.a.length, itemStackIn);
      return true;
    }
    int j = inventorySlot - 200;
    if ((j >= 0) && (j < this.a.o_()))
    {
      this.a.a(j, itemStackIn);
      return true;
    }
    return false;
  }
  
  public boolean cq()
  {
    return this.bI;
  }
  
  public void k(boolean reducedDebug)
  {
    this.bI = reducedDebug;
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private static final b[] d;
    private final int e;
    private final String f;
    
    private b(int id, String resourceKey)
    {
      this.e = id;
      this.f = resourceKey;
    }
    
    public int a()
    {
      return this.e;
    }
    
    public static b a(int id)
    {
      return d[(id % d.length)];
    }
    
    public String b()
    {
      return this.f;
    }
    
    static
    {
      d = new b[values().length];
      for (b entityplayer$enumchatvisibility : values()) {
        d[entityplayer$enumchatvisibility.e] = entityplayer$enumchatvisibility;
      }
    }
  }
}
