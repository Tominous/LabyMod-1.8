import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;

public class bda
{
  private final ave a;
  private final bcy b;
  private cj c = new cj(-1, -1, -1);
  private zx d;
  private float e;
  private float f;
  private int g;
  private boolean h;
  private adp.a i = adp.a.b;
  private int j;
  
  public bda(ave mcIn, bcy p_i45062_2_)
  {
    this.a = mcIn;
    this.b = p_i45062_2_;
  }
  
  public static void a(ave mcIn, bda p_178891_1_, cj p_178891_2_, cq p_178891_3_)
  {
    if (!mcIn.f.a(mcIn.h, p_178891_2_, p_178891_3_)) {
      p_178891_1_.a(p_178891_2_, p_178891_3_);
    }
  }
  
  public void a(wn p_78748_1_)
  {
    this.i.a(p_78748_1_.bA);
  }
  
  public boolean a()
  {
    return this.i == adp.a.e;
  }
  
  public void a(adp.a p_78746_1_)
  {
    this.i = p_78746_1_;
    this.i.a(this.a.h.bA);
  }
  
  public void b(wn playerIn)
  {
    playerIn.y = -180.0F;
  }
  
  public boolean b()
  {
    return this.i.e();
  }
  
  public boolean a(cj pos, cq side)
  {
    if (this.i.c())
    {
      if (this.i == adp.a.e) {
        return false;
      }
      if (!this.a.h.cn())
      {
        afh block = this.a.f.p(pos).c();
        zx itemstack = this.a.h.bZ();
        if (itemstack == null) {
          return false;
        }
        if (!itemstack.c(block)) {
          return false;
        }
      }
    }
    if ((this.i.d()) && (this.a.h.bA() != null) && ((this.a.h.bA().b() instanceof aay))) {
      return false;
    }
    adm world = this.a.f;
    alz iblockstate = world.p(pos);
    afh block1 = iblockstate.c();
    if (block1.t() == arm.a) {
      return false;
    }
    world.b(2001, pos, afh.f(iblockstate));
    boolean flag = world.g(pos);
    if (flag) {
      block1.d(world, pos, iblockstate);
    }
    this.c = new cj(this.c.n(), -1, this.c.p());
    if (!this.i.d())
    {
      zx itemstack1 = this.a.h.bZ();
      if (itemstack1 != null)
      {
        itemstack1.a(world, block1, pos, this.a.h);
        if (itemstack1.b == 0) {
          this.a.h.ca();
        }
      }
    }
    return flag;
  }
  
  public boolean b(cj loc, cq face)
  {
    if (this.i.c())
    {
      if (this.i == adp.a.e) {
        return false;
      }
      if (!this.a.h.cn())
      {
        afh block = this.a.f.p(loc).c();
        zx itemstack = this.a.h.bZ();
        if (itemstack == null) {
          return false;
        }
        if (!itemstack.c(block)) {
          return false;
        }
      }
    }
    if (!this.a.f.af().a(loc)) {
      return false;
    }
    if (this.i.d())
    {
      this.b.a(new ir(ir.a.a, loc, face));
      a(this.a, this, loc, face);
      this.g = 5;
    }
    else if ((!this.h) || (!a(loc)))
    {
      if (this.h) {
        this.b.a(new ir(ir.a.b, this.c, face));
      }
      this.b.a(new ir(ir.a.a, loc, face));
      afh block1 = this.a.f.p(loc).c();
      boolean flag = block1.t() != arm.a;
      if ((flag) && (this.e == 0.0F)) {
        block1.a(this.a.f, loc, this.a.h);
      }
      if ((flag) && (block1.a(this.a.h, this.a.h.o, loc) >= 1.0F))
      {
        a(loc, face);
      }
      else
      {
        this.h = true;
        this.c = loc;
        this.d = this.a.h.bA();
        this.e = 0.0F;
        this.f = 0.0F;
        this.a.f.c(this.a.h.F(), this.c, (int)(this.e * 10.0F) - 1);
      }
    }
    return true;
  }
  
  public void c()
  {
    if (this.h)
    {
      this.b.a(new ir(ir.a.b, this.c, cq.a));
      this.h = false;
      this.e = 0.0F;
      this.a.f.c(this.a.h.F(), this.c, -1);
    }
  }
  
  public boolean c(cj posBlock, cq directionFacing)
  {
    if ((ConfigManager.settings.oldBlockBuild) && (Allowed.blockBuild()) && (this.a.h != null) && (this.a.h.bS())) {
      return true;
    }
    n();
    if (this.g > 0)
    {
      this.g -= 1;
      return true;
    }
    if ((this.i.d()) && (this.a.f.af().a(posBlock)))
    {
      this.g = 5;
      this.b.a(new ir(ir.a.a, posBlock, directionFacing));
      a(this.a, this, posBlock, directionFacing);
      return true;
    }
    if (a(posBlock))
    {
      afh block = this.a.f.p(posBlock).c();
      if (block.t() == arm.a)
      {
        this.h = false;
        return false;
      }
      this.e += block.a(this.a.h, this.a.h.o, posBlock);
      if (this.f % 4.0F == 0.0F) {
        this.a.W().a(new bpf(new jy(block.H.c()), (block.H.d() + 1.0F) / 8.0F, block.H.e() * 0.5F, posBlock.n() + 0.5F, posBlock.o() + 0.5F, posBlock.p() + 0.5F));
      }
      this.f += 1.0F;
      if (this.e >= 1.0F)
      {
        this.h = false;
        this.b.a(new ir(ir.a.c, posBlock, directionFacing));
        a(posBlock, directionFacing);
        this.e = 0.0F;
        this.f = 0.0F;
        this.g = 5;
      }
      this.a.f.c(this.a.h.F(), this.c, (int)(this.e * 10.0F) - 1);
      return true;
    }
    return b(posBlock, directionFacing);
  }
  
  public float d()
  {
    return this.i.d() ? 5.0F : 4.5F;
  }
  
  public void e()
  {
    n();
    if (this.b.a().g()) {
      this.b.a().a();
    } else {
      this.b.a().l();
    }
  }
  
  private boolean a(cj pos)
  {
    zx itemstack = this.a.h.bA();
    boolean flag = (this.d == null) && (itemstack == null);
    if ((this.d != null) && (itemstack != null)) {
      flag = (itemstack.b() == this.d.b()) && (zx.a(itemstack, this.d)) && ((itemstack.e()) || (itemstack.i() == this.d.i()));
    }
    return (pos.equals(this.c)) && (flag);
  }
  
  private void n()
  {
    int i = this.a.h.bi.c;
    if (i != this.j)
    {
      this.j = i;
      this.b.a(new iv(this.j));
    }
  }
  
  public boolean a(bew player, bdb worldIn, zx heldStack, cj hitPos, cq side, aui hitVec)
  {
    n();
    float f = (float)(hitVec.a - hitPos.n());
    float f1 = (float)(hitVec.b - hitPos.o());
    float f2 = (float)(hitVec.c - hitPos.p());
    boolean flag = false;
    if (!this.a.f.af().a(hitPos)) {
      return false;
    }
    if (this.i != adp.a.e)
    {
      alz iblockstate = worldIn.p(hitPos);
      if (((!player.av()) || (player.bA() == null)) && (iblockstate.c().a(worldIn, hitPos, iblockstate, player, side, f, f1, f2))) {
        flag = true;
      }
      if ((!flag) && (heldStack != null) && ((heldStack.b() instanceof yo)))
      {
        yo itemblock = (yo)heldStack.b();
        if (!itemblock.a(worldIn, hitPos, side, player, heldStack)) {
          return false;
        }
      }
    }
    this.b.a(new ja(hitPos, side.a(), player.bi.h(), f, f1, f2));
    if ((!flag) && (this.i != adp.a.e))
    {
      if (heldStack == null) {
        return false;
      }
      if (this.i.d())
      {
        int i = heldStack.i();
        int j = heldStack.b;
        boolean flag1 = heldStack.a(player, worldIn, hitPos, side, f, f1, f2);
        heldStack.b(i);
        heldStack.b = j;
        return flag1;
      }
      return heldStack.a(player, worldIn, hitPos, side, f, f1, f2);
    }
    return true;
  }
  
  public boolean a(wn playerIn, adm worldIn, zx itemStackIn)
  {
    if (this.i == adp.a.e) {
      return false;
    }
    n();
    this.b.a(new ja(playerIn.bi.h()));
    int i = itemStackIn.b;
    zx itemstack = itemStackIn.a(worldIn, playerIn);
    if ((itemstack != itemStackIn) || ((itemstack != null) && (itemstack.b != i)))
    {
      playerIn.bi.a[playerIn.bi.c] = itemstack;
      if (itemstack.b == 0) {
        playerIn.bi.a[playerIn.bi.c] = null;
      }
      return true;
    }
    return false;
  }
  
  public bew a(adm worldIn, nb p_178892_2_)
  {
    return new bew(this.a, worldIn, this.b, p_178892_2_);
  }
  
  public void a(wn playerIn, pk targetEntity)
  {
    n();
    this.b.a(new in(targetEntity, in.a.b));
    if (this.i != adp.a.e) {
      playerIn.f(targetEntity);
    }
  }
  
  public boolean b(wn playerIn, pk targetEntity)
  {
    n();
    this.b.a(new in(targetEntity, in.a.a));
    return (this.i != adp.a.e) && (playerIn.u(targetEntity));
  }
  
  public boolean a(wn p_178894_1_, pk p_178894_2_, auh p_178894_3_)
  {
    n();
    aui vec3 = new aui(p_178894_3_.c.a - p_178894_2_.s, p_178894_3_.c.b - p_178894_2_.t, p_178894_3_.c.c - p_178894_2_.u);
    this.b.a(new in(p_178894_2_, vec3));
    return (this.i != adp.a.e) && (p_178894_2_.a(p_178894_1_, vec3));
  }
  
  public zx a(int windowId, int slotId, int mouseButtonClicked, int mode, wn playerIn)
  {
    short short1 = playerIn.bk.a(playerIn.bi);
    zx itemstack = playerIn.bk.a(slotId, mouseButtonClicked, mode, playerIn);
    this.b.a(new ik(windowId, slotId, mouseButtonClicked, mode, itemstack, short1));
    return itemstack;
  }
  
  public void a(int p_78756_1_, int p_78756_2_)
  {
    this.b.a(new ij(p_78756_1_, p_78756_2_));
  }
  
  public void a(zx itemStackIn, int slotId)
  {
    if (this.i.d()) {
      this.b.a(new iw(slotId, itemStackIn));
    }
  }
  
  public void a(zx itemStackIn)
  {
    if ((this.i.d()) && (itemStackIn != null)) {
      this.b.a(new iw(-1, itemStackIn));
    }
  }
  
  public void c(wn playerIn)
  {
    n();
    this.b.a(new ir(ir.a.f, cj.a, cq.a));
    playerIn.bU();
  }
  
  public boolean f()
  {
    return this.i.e();
  }
  
  public boolean g()
  {
    return !this.i.d();
  }
  
  public boolean h()
  {
    return this.i.d();
  }
  
  public boolean i()
  {
    return this.i.d();
  }
  
  public boolean j()
  {
    return (this.a.h.au()) && ((this.a.h.m instanceof tp));
  }
  
  public boolean k()
  {
    return this.i == adp.a.e;
  }
  
  public adp.a l()
  {
    return this.i;
  }
  
  public boolean m()
  {
    if ((ConfigManager.settings.oldBlockBuild) && (Allowed.blockBuild())) {
      return false;
    }
    return this.h;
  }
}
