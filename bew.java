import java.util.Random;
import togglesneak.CustomMovementInput;
import togglesneak.ToggleSneakMod;

public class bew
  extends bet
{
  public final bcy a;
  private final nb bJ;
  private double bK;
  private double bL;
  private double bM;
  private float bN;
  private float bO;
  private boolean bP;
  private boolean bQ;
  private int bR;
  private boolean bS;
  private String bT;
  public beu b;
  protected ave c;
  protected int d;
  public int e;
  public float f;
  public float g;
  public float h;
  public float i;
  private int bU;
  private float bV;
  public float bH;
  public float bI;
  
  public bew(ave mcIn, adm worldIn, bcy netHandler, nb statFile)
  {
    super(worldIn, netHandler.e());
    this.a = netHandler;
    this.bJ = statFile;
    this.c = mcIn;
    this.am = 0;
  }
  
  public boolean a(ow source, float amount)
  {
    return false;
  }
  
  public void h(float healAmount) {}
  
  public void a(pk entityIn)
  {
    super.a(entityIn);
    if ((entityIn instanceof va)) {
      this.c.W().a(new bpe(this, (va)entityIn));
    }
  }
  
  public void t_()
  {
    if (this.o.e(new cj(this.s, 0.0D, this.u)))
    {
      super.t_();
      if (au())
      {
        this.a.a(new ip.c(this.y, this.z, this.C));
        this.a.a(new it(this.aZ, this.ba, this.b.c, this.b.d));
      }
      else
      {
        p();
      }
    }
  }
  
  public void p()
  {
    boolean flag = aw();
    if (flag != this.bQ)
    {
      if (flag) {
        this.a.a(new is(this, is.a.d));
      } else {
        this.a.a(new is(this, is.a.e));
      }
      this.bQ = flag;
    }
    boolean flag1 = av();
    if (flag1 != this.bP)
    {
      if (flag1) {
        this.a.a(new is(this, is.a.a));
      } else {
        this.a.a(new is(this, is.a.b));
      }
      this.bP = flag1;
    }
    if (A())
    {
      double d0 = this.s - this.bK;
      double d1 = aR().b - this.bL;
      double d2 = this.u - this.bM;
      double d3 = this.y - this.bN;
      double d4 = this.z - this.bO;
      boolean flag2 = (d0 * d0 + d1 * d1 + d2 * d2 > 9.0E-4D) || (this.bR >= 20);
      boolean flag3 = (d3 != 0.0D) || (d4 != 0.0D);
      if (this.m == null)
      {
        if ((flag2) && (flag3)) {
          this.a.a(new ip.b(this.s, aR().b, this.u, this.y, this.z, this.C));
        } else if (flag2) {
          this.a.a(new ip.a(this.s, aR().b, this.u, this.C));
        } else if (flag3) {
          this.a.a(new ip.c(this.y, this.z, this.C));
        } else {
          this.a.a(new ip(this.C));
        }
      }
      else
      {
        this.a.a(new ip.b(this.v, -999.0D, this.x, this.y, this.z, this.C));
        flag2 = false;
      }
      this.bR += 1;
      if (flag2)
      {
        this.bK = this.s;
        this.bL = aR().b;
        this.bM = this.u;
        this.bR = 0;
      }
      if (flag3)
      {
        this.bN = this.y;
        this.bO = this.z;
      }
    }
  }
  
  public uz a(boolean dropAll)
  {
    ir.a c07packetplayerdigging$action = dropAll ? ir.a.d : ir.a.e;
    this.a.a(new ir(c07packetplayerdigging$action, cj.a, cq.a));
    return null;
  }
  
  protected void a(uz itemIn) {}
  
  public void e(String message)
  {
    this.a.a(new ie(message));
  }
  
  public void bw()
  {
    super.bw();
    this.a.a(new iy());
  }
  
  public void cb()
  {
    this.a.a(new ig(ig.a.a));
  }
  
  protected void d(ow damageSrc, float damageAmount)
  {
    if (!b(damageSrc)) {
      i(bn() - damageAmount);
    }
  }
  
  public void n()
  {
    this.a.a(new il(this.bk.d));
    q();
  }
  
  public void q()
  {
    this.bi.b((zx)null);
    super.n();
    this.c.a((axu)null);
  }
  
  public void n(float health)
  {
    if (this.bS)
    {
      float f = bn() - health;
      if (f <= 0.0F)
      {
        i(health);
        if (f < 0.0F) {
          this.Z = (this.aD / 2);
        }
      }
      else
      {
        this.aX = f;
        i(bn());
        this.Z = this.aD;
        d(ow.k, f);
        this.au = (this.av = 10);
      }
    }
    else
    {
      i(health);
      this.bS = true;
    }
  }
  
  public void a(mw stat, int amount)
  {
    if (stat != null) {
      if (stat.f) {
        super.a(stat, amount);
      }
    }
  }
  
  public void t()
  {
    this.a.a(new iq(this.bA));
  }
  
  public boolean cc()
  {
    return true;
  }
  
  protected void r()
  {
    this.a.a(new is(this, is.a.f, (int)(z() * 100.0F)));
  }
  
  public void u()
  {
    this.a.a(new is(this, is.a.g));
  }
  
  public void f(String brand)
  {
    this.bT = brand;
  }
  
  public String w()
  {
    return this.bT;
  }
  
  public nb x()
  {
    return this.bJ;
  }
  
  public void b(eu chatComponent)
  {
    this.c.q.d().a(chatComponent);
  }
  
  protected boolean j(double x, double y, double z)
  {
    if (this.T) {
      return false;
    }
    cj blockpos = new cj(x, y, z);
    double d0 = x - blockpos.n();
    double d1 = z - blockpos.p();
    if (!e(blockpos))
    {
      int i = -1;
      double d2 = 9999.0D;
      if ((e(blockpos.e())) && (d0 < d2))
      {
        d2 = d0;
        i = 0;
      }
      if ((e(blockpos.f())) && (1.0D - d0 < d2))
      {
        d2 = 1.0D - d0;
        i = 1;
      }
      if ((e(blockpos.c())) && (d1 < d2))
      {
        d2 = d1;
        i = 4;
      }
      if ((e(blockpos.d())) && (1.0D - d1 < d2))
      {
        d2 = 1.0D - d1;
        i = 5;
      }
      float f = 0.1F;
      if (i == 0) {
        this.v = (-f);
      }
      if (i == 1) {
        this.v = f;
      }
      if (i == 4) {
        this.x = (-f);
      }
      if (i == 5) {
        this.x = f;
      }
    }
    return false;
  }
  
  private boolean e(cj pos)
  {
    return (!this.o.p(pos).c().v()) && (!this.o.p(pos.a()).c().v());
  }
  
  public void d(boolean sprinting)
  {
    super.d(sprinting);
    this.e = (sprinting ? 600 : 0);
  }
  
  public void a(float currentXP, int maxXP, int level)
  {
    this.bD = currentXP;
    this.bC = maxXP;
    this.bB = level;
  }
  
  public void a(eu component)
  {
    this.c.q.d().a(component);
  }
  
  public boolean a(int permLevel, String commandName)
  {
    return permLevel <= 0;
  }
  
  public cj c()
  {
    return new cj(this.s + 0.5D, this.t + 0.5D, this.u + 0.5D);
  }
  
  public void a(String name, float volume, float pitch)
  {
    this.o.a(this.s, this.t, this.u, name, volume, pitch, false);
  }
  
  public boolean bM()
  {
    return true;
  }
  
  public boolean y()
  {
    return (this.m != null) && ((this.m instanceof tp)) && (((tp)this.m).cG());
  }
  
  public float z()
  {
    return this.bV;
  }
  
  public void a(aln signTile)
  {
    this.c.a(new aze(signTile));
  }
  
  public void a(adc cmdBlockLogic)
  {
    this.c.a(new ayq(cmdBlockLogic));
  }
  
  public void a(zx bookStack)
  {
    zw item = bookStack.b();
    if (item == zy.bM) {
      this.c.a(new ayo(this, bookStack, true));
    }
  }
  
  public void a(og chestInventory)
  {
    String s = (chestInventory instanceof ol) ? ((ol)chestInventory).k() : "minecraft:container";
    if ("minecraft:chest".equals(s)) {
      this.c.a(new ayr(this.bi, chestInventory));
    } else if ("minecraft:hopper".equals(s)) {
      this.c.a(new aza(this.bi, chestInventory));
    } else if ("minecraft:furnace".equals(s)) {
      this.c.a(new ayz(this.bi, chestInventory));
    } else if ("minecraft:brewing_stand".equals(s)) {
      this.c.a(new ayp(this.bi, chestInventory));
    } else if ("minecraft:beacon".equals(s)) {
      this.c.a(new ayn(this.bi, chestInventory));
    } else if ((!"minecraft:dispenser".equals(s)) && (!"minecraft:dropper".equals(s))) {
      this.c.a(new ayr(this.bi, chestInventory));
    } else {
      this.c.a(new ayv(this.bi, chestInventory));
    }
  }
  
  public void a(tp horse, og horseInventory)
  {
    this.c.a(new azb(this.bi, horseInventory, horse));
  }
  
  public void a(ol guiOwner)
  {
    String s = guiOwner.k();
    if ("minecraft:crafting_table".equals(s)) {
      this.c.a(new ays(this.bi, this.o));
    } else if ("minecraft:enchanting_table".equals(s)) {
      this.c.a(new ayy(this.bi, this.o, guiOwner));
    } else if ("minecraft:anvil".equals(s)) {
      this.c.a(new aym(this.bi, this.o));
    }
  }
  
  public void a(acy villager)
  {
    this.c.a(new azd(this.bi, villager, this.o));
  }
  
  public void b(pk entityHit)
  {
    this.c.j.a(entityHit, cy.j);
  }
  
  public void c(pk entityHit)
  {
    this.c.j.a(entityHit, cy.k);
  }
  
  public boolean av()
  {
    boolean flag = this.b != null ? this.b.d : false;
    return (flag) && (!this.bw);
  }
  
  public void bK()
  {
    super.bK();
    if (A())
    {
      this.aZ = this.b.a;
      this.ba = this.b.b;
      this.aY = this.b.c;
      this.h = this.f;
      this.i = this.g;
      this.g = ((float)(this.g + (this.z - this.g) * 0.5D));
      this.f = ((float)(this.f + (this.y - this.f) * 0.5D));
    }
  }
  
  protected boolean A()
  {
    return this.c.ac() == this;
  }
  
  private CustomMovementInput customMovementInput = new CustomMovementInput();
  
  public void m()
  {
    if (this.e > 0)
    {
      this.e -= 1;
      if (this.e == 0) {
        d(false);
      }
    }
    if (this.d > 0) {
      this.d -= 1;
    }
    this.bI = this.bH;
    if (this.ak)
    {
      if (this.c.m != null) {
        this.c.a((axu)null);
      }
      if (this.bH == 0.0F) {
        this.c.W().a(
          bpf.a(new jy("portal.trigger"), 
          bc()
          .nextFloat() * 0.4F + 0.8F));
      }
      this.bH += 0.0125F;
      if (this.bH >= 1.0F) {
        this.bH = 1.0F;
      }
      this.ak = false;
    }
    else
    {
      if (a(pe.k)) {
        if (b(pe.k).b() > 60)
        {
          this.bH += 0.006666667F;
          if (this.bH <= 1.0F) {
            break label252;
          }
          this.bH = 1.0F;
          break label252;
        }
      }
      if (this.bH > 0.0F) {
        this.bH -= 0.05F;
      }
      if (this.bH < 0.0F) {
        this.bH = 0.0F;
      }
    }
    label252:
    if (this.aj > 0) {
      this.aj -= 1;
    }
    boolean isJumping = this.b.c;
    
    float minSpeed = 0.8F;
    boolean isMovingForward = this.b.b >= minSpeed;
    this.customMovementInput.update(this.c, (bev)this.b, this);
    if ((bS()) && (!au()))
    {
      this.b.a *= 0.2F;
      this.b.b *= 0.2F;
      this.d = 0;
    }
    j(this.s - this.J * 0.35D, 
    
      aR().b + 0.5D, this.u + this.J * 0.35D);
    
    j(this.s - this.J * 0.35D, 
    
      aR().b + 0.5D, this.u - this.J * 0.35D);
    
    j(this.s + this.J * 0.35D, 
    
      aR().b + 0.5D, this.u - this.J * 0.35D);
    
    j(this.s + this.J * 0.35D, 
    
      aR().b + 0.5D, this.u + this.J * 0.35D);
    
    boolean enoughHunger = (cl().a() > 6.0F) || (this.bA.b);
    
    boolean isSprintDisabled = !ToggleSneakMod.optionToggleSprint;
    boolean canDoubleTap = ToggleSneakMod.optionDoubleTap;
    if (ToggleSneakMod.wasSprintDisabled)
    {
      d(false);
      this.customMovementInput.UpdateSprint(false, false);
      ToggleSneakMod.wasSprintDisabled = false;
    }
    if (isSprintDisabled)
    {
      if ((ToggleSneakMod.optionDoubleTap) && (this.C) && (!isMovingForward) && (this.b.b >= minSpeed)) {
        if ((!aw()) && (enoughHunger) && 
          (!bS()) && 
          (!a(pe.q))) {
          if ((this.d <= 0) && 
            (!this.c.t.ad.d()))
          {
            this.d = 7;
          }
          else
          {
            d(true);
            this.customMovementInput.UpdateSprint(true, false);
          }
        }
      }
      if ((!aw()) && (this.b.b >= minSpeed) && (enoughHunger)) {
        if ((!bS()) && 
          (!a(pe.q)) && 
          (this.c.t.ad.d()))
        {
          d(true);
          this.customMovementInput.UpdateSprint(true, false);
        }
      }
    }
    else
    {
      boolean state = this.customMovementInput.sprint;
      if ((enoughHunger) && (!bS()) && 
        (!a(pe.q)) && (!this.customMovementInput.sprintHeldAndReleased)) {
        if (((canDoubleTap) && (!aw())) || (!canDoubleTap)) {
          d(state);
        }
      }
      if ((canDoubleTap) && (!state) && (this.C) && (!isMovingForward) && (this.b.b >= minSpeed)) {
        if ((!aw()) && (enoughHunger) && 
          (!bS()) && 
          (!a(pe.q))) {
          if (this.d == 0)
          {
            this.d = 7;
          }
          else
          {
            d(true);
            this.customMovementInput.UpdateSprint(true, true);
            this.d = 0;
          }
        }
      }
    }
    if ((aw()) && ((this.b.b < minSpeed) || (this.D) || (!enoughHunger)))
    {
      d(false);
      if ((this.customMovementInput.sprintHeldAndReleased == true) || (isSprintDisabled) || (this.customMovementInput.sprintDoubleTapped) || (this.bA.b) || 
      
        (au())) {
        this.customMovementInput.UpdateSprint(false, false);
      }
    }
    if ((ToggleSneakMod.optionEnableFlyBoost) && (this.bA.b)) {
      if ((this.c.t.ad.d()) && (this.bA.d))
      {
        this.bA.a(0.05F * (float)ToggleSneakMod.optionFlyBoostAmount);
        if (this.b.d) {
          this.w -= 0.15D * ToggleSneakMod.optionFlyBoostAmount;
        }
        if (!this.b.c) {
          break label1185;
        }
        this.w += 0.15D * ToggleSneakMod.optionFlyBoostAmount;
        break label1185;
      }
    }
    if (this.bA.a() != 0.05F) {
      this.bA.a(0.05F);
    }
    label1185:
    if ((this.bA.c) && (!isJumping) && (this.b.c)) {
      if (this.bm == 0)
      {
        this.bm = 7;
      }
      else
      {
        this.bA.b = (!this.bA.b);
        t();
        this.bm = 0;
      }
    }
    if (this.bA.b)
    {
      if (this.b.d) {
        this.w -= 0.15D;
      }
      if (this.b.c) {
        this.w += 0.15D;
      }
    }
    if (y())
    {
      if (this.bU < 0)
      {
        this.bU += 1;
        if (this.bU == 0) {
          this.bV = 0.0F;
        }
      }
      if ((isJumping) && (!this.b.c))
      {
        this.bU -= 10;
        this.bU = -10;
        this.a
          .a(new is(this, is.a.f, 
          
          (int)(z() * 100.0F)));
      }
      else if ((!isJumping) && (this.b.c))
      {
        this.bU = 0;
        this.bV = 0.0F;
      }
      else if (isJumping)
      {
        this.bU += 1;
        if (this.bU < 10) {
          this.bV = (this.bU * 0.1F);
        } else {
          this.bV = (0.8F + 2.0F / (this.bU - 9) * 0.1F);
        }
      }
    }
    else
    {
      this.bV = 0.0F;
    }
    super.m();
    if ((this.C) && (this.bA.b))
    {
      this.bA.b = false;
      t();
    }
  }
}
