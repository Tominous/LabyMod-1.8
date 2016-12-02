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
    a = netHandler;
    bJ = statFile;
    c = mcIn;
    am = 0;
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
      c.W().a(new bpe(this, (va)entityIn));
    }
  }
  
  public void t_()
  {
    if (o.e(new cj(s, 0.0D, u)))
    {
      super.t_();
      if (au())
      {
        a.a(new ip.c(y, z, C));
        a.a(new it(aZ, ba, b.c, b.d));
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
    if (flag != bQ)
    {
      if (flag) {
        a.a(new is(this, is.a.d));
      } else {
        a.a(new is(this, is.a.e));
      }
      bQ = flag;
    }
    boolean flag1 = av();
    if (flag1 != bP)
    {
      if (flag1) {
        a.a(new is(this, is.a.a));
      } else {
        a.a(new is(this, is.a.b));
      }
      bP = flag1;
    }
    if (A())
    {
      double d0 = s - bK;
      double d1 = aRb - bL;
      double d2 = u - bM;
      double d3 = y - bN;
      double d4 = z - bO;
      boolean flag2 = (d0 * d0 + d1 * d1 + d2 * d2 > 9.0E-4D) || (bR >= 20);
      boolean flag3 = (d3 != 0.0D) || (d4 != 0.0D);
      if (m == null)
      {
        if ((flag2) && (flag3)) {
          a.a(new ip.b(s, aRb, u, y, z, C));
        } else if (flag2) {
          a.a(new ip.a(s, aRb, u, C));
        } else if (flag3) {
          a.a(new ip.c(y, z, C));
        } else {
          a.a(new ip(C));
        }
      }
      else
      {
        a.a(new ip.b(v, -999.0D, x, y, z, C));
        flag2 = false;
      }
      bR += 1;
      if (flag2)
      {
        bK = s;
        bL = aRb;
        bM = u;
        bR = 0;
      }
      if (flag3)
      {
        bN = y;
        bO = z;
      }
    }
  }
  
  public uz a(boolean dropAll)
  {
    ir.a c07packetplayerdigging$action = dropAll ? ir.a.d : ir.a.e;
    a.a(new ir(c07packetplayerdigging$action, cj.a, cq.a));
    return null;
  }
  
  protected void a(uz itemIn) {}
  
  public void e(String message)
  {
    a.a(new ie(message));
  }
  
  public void bw()
  {
    super.bw();
    a.a(new iy());
  }
  
  public void cb()
  {
    a.a(new ig(ig.a.a));
  }
  
  protected void d(ow damageSrc, float damageAmount)
  {
    if (!b(damageSrc)) {
      i(bn() - damageAmount);
    }
  }
  
  public void n()
  {
    a.a(new il(bk.d));
    q();
  }
  
  public void q()
  {
    bi.b((zx)null);
    super.n();
    c.a((axu)null);
  }
  
  public void n(float health)
  {
    if (bS)
    {
      float f = bn() - health;
      if (f <= 0.0F)
      {
        i(health);
        if (f < 0.0F) {
          Z = (aD / 2);
        }
      }
      else
      {
        aX = f;
        i(bn());
        Z = aD;
        d(ow.k, f);
        au = (av = 10);
      }
    }
    else
    {
      i(health);
      bS = true;
    }
  }
  
  public void a(mw stat, int amount)
  {
    if (stat != null) {
      if (f) {
        super.a(stat, amount);
      }
    }
  }
  
  public void t()
  {
    a.a(new iq(bA));
  }
  
  public boolean cc()
  {
    return true;
  }
  
  protected void r()
  {
    a.a(new is(this, is.a.f, (int)(z() * 100.0F)));
  }
  
  public void u()
  {
    a.a(new is(this, is.a.g));
  }
  
  public void f(String brand)
  {
    bT = brand;
  }
  
  public String w()
  {
    return bT;
  }
  
  public nb x()
  {
    return bJ;
  }
  
  public void b(eu chatComponent)
  {
    c.q.d().a(chatComponent);
  }
  
  protected boolean j(double x, double y, double z)
  {
    if (T) {
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
        v = (-f);
      }
      if (i == 1) {
        v = f;
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
    return (!o.p(pos).c().v()) && (!o.p(pos.a()).c().v());
  }
  
  public void d(boolean sprinting)
  {
    super.d(sprinting);
    e = (sprinting ? 600 : 0);
  }
  
  public void a(float currentXP, int maxXP, int level)
  {
    bD = currentXP;
    bC = maxXP;
    bB = level;
  }
  
  public void a(eu component)
  {
    c.q.d().a(component);
  }
  
  public boolean a(int permLevel, String commandName)
  {
    return permLevel <= 0;
  }
  
  public cj c()
  {
    return new cj(s + 0.5D, t + 0.5D, u + 0.5D);
  }
  
  public void a(String name, float volume, float pitch)
  {
    o.a(s, t, u, name, volume, pitch, false);
  }
  
  public boolean bM()
  {
    return true;
  }
  
  public boolean y()
  {
    return (m != null) && ((m instanceof tp)) && (((tp)m).cG());
  }
  
  public float z()
  {
    return bV;
  }
  
  public void a(aln signTile)
  {
    c.a(new aze(signTile));
  }
  
  public void a(adc cmdBlockLogic)
  {
    c.a(new ayq(cmdBlockLogic));
  }
  
  public void a(zx bookStack)
  {
    zw item = bookStack.b();
    if (item == zy.bM) {
      c.a(new ayo(this, bookStack, true));
    }
  }
  
  public void a(og chestInventory)
  {
    String s = (chestInventory instanceof ol) ? ((ol)chestInventory).k() : "minecraft:container";
    if ("minecraft:chest".equals(s)) {
      c.a(new ayr(bi, chestInventory));
    } else if ("minecraft:hopper".equals(s)) {
      c.a(new aza(bi, chestInventory));
    } else if ("minecraft:furnace".equals(s)) {
      c.a(new ayz(bi, chestInventory));
    } else if ("minecraft:brewing_stand".equals(s)) {
      c.a(new ayp(bi, chestInventory));
    } else if ("minecraft:beacon".equals(s)) {
      c.a(new ayn(bi, chestInventory));
    } else if ((!"minecraft:dispenser".equals(s)) && (!"minecraft:dropper".equals(s))) {
      c.a(new ayr(bi, chestInventory));
    } else {
      c.a(new ayv(bi, chestInventory));
    }
  }
  
  public void a(tp horse, og horseInventory)
  {
    c.a(new azb(bi, horseInventory, horse));
  }
  
  public void a(ol guiOwner)
  {
    String s = guiOwner.k();
    if ("minecraft:crafting_table".equals(s)) {
      c.a(new ays(bi, o));
    } else if ("minecraft:enchanting_table".equals(s)) {
      c.a(new ayy(bi, o, guiOwner));
    } else if ("minecraft:anvil".equals(s)) {
      c.a(new aym(bi, o));
    }
  }
  
  public void a(acy villager)
  {
    c.a(new azd(bi, villager, o));
  }
  
  public void b(pk entityHit)
  {
    c.j.a(entityHit, cy.j);
  }
  
  public void c(pk entityHit)
  {
    c.j.a(entityHit, cy.k);
  }
  
  public boolean av()
  {
    boolean flag = b != null ? b.d : false;
    return (flag) && (!bw);
  }
  
  public void bK()
  {
    super.bK();
    if (A())
    {
      aZ = b.a;
      ba = b.b;
      aY = b.c;
      h = f;
      i = g;
      g = ((float)(g + (z - g) * 0.5D));
      f = ((float)(f + (y - f) * 0.5D));
    }
  }
  
  protected boolean A()
  {
    return c.ac() == this;
  }
  
  private CustomMovementInput customMovementInput = new CustomMovementInput();
  
  public void m()
  {
    if (e > 0)
    {
      e -= 1;
      if (e == 0) {
        d(false);
      }
    }
    if (d > 0) {
      d -= 1;
    }
    bI = bH;
    if (ak)
    {
      if (c.m != null) {
        c.a((axu)null);
      }
      if (bH == 0.0F) {
        c.W().a(
          bpf.a(new jy("portal.trigger"), 
          bc()
          .nextFloat() * 0.4F + 0.8F));
      }
      bH += 0.0125F;
      if (bH >= 1.0F) {
        bH = 1.0F;
      }
      ak = false;
    }
    else
    {
      if (a(pe.k)) {
        if (b(pe.k).b() > 60)
        {
          bH += 0.006666667F;
          if (bH <= 1.0F) {
            break label252;
          }
          bH = 1.0F;
          break label252;
        }
      }
      if (bH > 0.0F) {
        bH -= 0.05F;
      }
      if (bH < 0.0F) {
        bH = 0.0F;
      }
    }
    label252:
    if (aj > 0) {
      aj -= 1;
    }
    boolean isJumping = b.c;
    
    float minSpeed = 0.8F;
    boolean isMovingForward = b.b >= minSpeed;
    customMovementInput.update(c, (bev)b, this);
    if ((bS()) && (!au()))
    {
      b.a *= 0.2F;
      b.b *= 0.2F;
      d = 0;
    }
    j(s - J * 0.35D, 
    
      aRb + 0.5D, u + J * 0.35D);
    
    j(s - J * 0.35D, 
    
      aRb + 0.5D, u - J * 0.35D);
    
    j(s + J * 0.35D, 
    
      aRb + 0.5D, u - J * 0.35D);
    
    j(s + J * 0.35D, 
    
      aRb + 0.5D, u + J * 0.35D);
    
    boolean enoughHunger = (cl().a() > 6.0F) || (bA.b);
    
    boolean isSprintDisabled = !ToggleSneakMod.optionToggleSprint;
    boolean canDoubleTap = ToggleSneakMod.optionDoubleTap;
    if (ToggleSneakMod.wasSprintDisabled)
    {
      d(false);
      customMovementInput.UpdateSprint(false, false);
      ToggleSneakMod.wasSprintDisabled = false;
    }
    if (isSprintDisabled)
    {
      if ((ToggleSneakMod.optionDoubleTap) && (C) && (!isMovingForward) && (b.b >= minSpeed)) {
        if ((!aw()) && (enoughHunger) && 
          (!bS()) && 
          (!a(pe.q))) {
          if ((d <= 0) && 
            (!c.t.ad.d()))
          {
            d = 7;
          }
          else
          {
            d(true);
            customMovementInput.UpdateSprint(true, false);
          }
        }
      }
      if ((!aw()) && (b.b >= minSpeed) && (enoughHunger)) {
        if ((!bS()) && 
          (!a(pe.q)) && 
          (c.t.ad.d()))
        {
          d(true);
          customMovementInput.UpdateSprint(true, false);
        }
      }
    }
    else
    {
      boolean state = customMovementInput.sprint;
      if ((enoughHunger) && (!bS()) && 
        (!a(pe.q)) && (!customMovementInput.sprintHeldAndReleased)) {
        if (((canDoubleTap) && (!aw())) || (!canDoubleTap)) {
          d(state);
        }
      }
      if ((canDoubleTap) && (!state) && (C) && (!isMovingForward) && (b.b >= minSpeed)) {
        if ((!aw()) && (enoughHunger) && 
          (!bS()) && 
          (!a(pe.q))) {
          if (d == 0)
          {
            d = 7;
          }
          else
          {
            d(true);
            customMovementInput.UpdateSprint(true, true);
            d = 0;
          }
        }
      }
    }
    if ((aw()) && ((b.b < minSpeed) || (D) || (!enoughHunger)))
    {
      d(false);
      if ((customMovementInput.sprintHeldAndReleased == true) || (isSprintDisabled) || (customMovementInput.sprintDoubleTapped) || (bA.b) || 
      
        (au())) {
        customMovementInput.UpdateSprint(false, false);
      }
    }
    if ((ToggleSneakMod.optionEnableFlyBoost) && (bA.b)) {
      if ((c.t.ad.d()) && (bA.d))
      {
        bA.a(0.05F * (float)ToggleSneakMod.optionFlyBoostAmount);
        if (b.d) {
          w -= 0.15D * ToggleSneakMod.optionFlyBoostAmount;
        }
        if (!b.c) {
          break label1185;
        }
        w += 0.15D * ToggleSneakMod.optionFlyBoostAmount;
        break label1185;
      }
    }
    if (bA.a() != 0.05F) {
      bA.a(0.05F);
    }
    label1185:
    if ((bA.c) && (!isJumping) && (b.c)) {
      if (bm == 0)
      {
        bm = 7;
      }
      else
      {
        bA.b = (!bA.b);
        t();
        bm = 0;
      }
    }
    if (bA.b)
    {
      if (b.d) {
        w -= 0.15D;
      }
      if (b.c) {
        w += 0.15D;
      }
    }
    if (y())
    {
      if (bU < 0)
      {
        bU += 1;
        if (bU == 0) {
          bV = 0.0F;
        }
      }
      if ((isJumping) && (!b.c))
      {
        bU -= 10;
        bU = -10;
        a
          .a(new is(this, is.a.f, 
          
          (int)(z() * 100.0F)));
      }
      else if ((!isJumping) && (b.c))
      {
        bU = 0;
        bV = 0.0F;
      }
      else if (isJumping)
      {
        bU += 1;
        if (bU < 10) {
          bV = (bU * 0.1F);
        } else {
          bV = (0.8F + 2.0F / (bU - 9) * 0.1F);
        }
      }
    }
    else
    {
      bV = 0.0F;
    }
    super.m();
    if ((C) && (bA.b))
    {
      bA.b = false;
      t();
    }
  }
}
