import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Allowed;

public class bda
{
  private final ave a;
  private final bcy b;
  public cj c = new cj(-1, -1, -1);
  private zx d;
  public float e;
  private float f;
  public int g;
  private boolean h;
  private adp.a i = adp.a.b;
  private int j;
  
  public bda(ave mcIn, bcy p_i45062_2_)
  {
    a = mcIn;
    b = p_i45062_2_;
  }
  
  public static void a(ave mcIn, bda p_178891_1_, cj p_178891_2_, cq p_178891_3_)
  {
    if (!f.a(h, p_178891_2_, p_178891_3_)) {
      p_178891_1_.a(p_178891_2_, p_178891_3_);
    }
  }
  
  public void a(wn p_78748_1_)
  {
    i.a(bA);
  }
  
  public boolean a()
  {
    return i == adp.a.e;
  }
  
  public void a(adp.a p_78746_1_)
  {
    i = p_78746_1_;
    i.a(a.h.bA);
  }
  
  public void b(wn playerIn)
  {
    y = -180.0F;
  }
  
  public boolean b()
  {
    return i.e();
  }
  
  public boolean a(cj pos, cq side)
  {
    if (i.c())
    {
      if (i == adp.a.e) {
        return false;
      }
      if (!a.h.cn())
      {
        afh block = a.f.p(pos).c();
        zx itemstack = a.h.bZ();
        if (itemstack == null) {
          return false;
        }
        if (!itemstack.c(block)) {
          return false;
        }
      }
    }
    if ((i.d()) && (a.h.bA() != null) && ((a.h.bA().b() instanceof aay))) {
      return false;
    }
    adm world = a.f;
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
    c = new cj(c.n(), -1, c.p());
    if (!i.d())
    {
      zx itemstack1 = a.h.bZ();
      if (itemstack1 != null)
      {
        itemstack1.a(world, block1, pos, a.h);
        if (b == 0) {
          a.h.ca();
        }
      }
    }
    return flag;
  }
  
  public boolean b(cj loc, cq face)
  {
    if (i.c())
    {
      if (i == adp.a.e) {
        return false;
      }
      if (!a.h.cn())
      {
        afh block = a.f.p(loc).c();
        zx itemstack = a.h.bZ();
        if (itemstack == null) {
          return false;
        }
        if (!itemstack.c(block)) {
          return false;
        }
      }
    }
    if (!a.f.af().a(loc)) {
      return false;
    }
    if (i.d())
    {
      b.a(new ir(ir.a.a, loc, face));
      a(a, this, loc, face);
      g = 5;
    }
    else if ((!h) || (!a(loc)))
    {
      if (h) {
        b.a(new ir(ir.a.b, c, face));
      }
      b.a(new ir(ir.a.a, loc, face));
      afh block1 = a.f.p(loc).c();
      boolean flag = block1.t() != arm.a;
      if ((flag) && (e == 0.0F)) {
        block1.a(a.f, loc, a.h);
      }
      if ((flag) && (block1.a(a.h, a.h.o, loc) >= 1.0F))
      {
        a(loc, face);
      }
      else
      {
        h = true;
        c = loc;
        d = a.h.bA();
        e = 0.0F;
        f = 0.0F;
        a.f.c(a.h.F(), c, (int)(e * 10.0F) - 1);
      }
    }
    return true;
  }
  
  public void c()
  {
    if (h)
    {
      b.a(new ir(ir.a.b, c, cq.a));
      h = false;
      e = 0.0F;
      a.f.c(a.h.F(), c, -1);
    }
  }
  
  public boolean c(cj posBlock, cq directionFacing)
  {
    if ((settingsoldBlockBuild) && (Allowed.blockBuild()) && (a.h != null) && (a.h.bS())) {
      return true;
    }
    n();
    if (g > 0)
    {
      g -= 1;
      return true;
    }
    if ((i.d()) && (a.f.af().a(posBlock)))
    {
      g = 5;
      b.a(new ir(ir.a.a, posBlock, directionFacing));
      a(a, this, posBlock, directionFacing);
      return true;
    }
    if (a(posBlock))
    {
      afh block = a.f.p(posBlock).c();
      if (block.t() == arm.a)
      {
        h = false;
        return false;
      }
      e += block.a(a.h, a.h.o, posBlock);
      if (f % 4.0F == 0.0F) {
        a.W().a(new bpf(new jy(H.c()), (H.d() + 1.0F) / 8.0F, H.e() * 0.5F, posBlock.n() + 0.5F, posBlock.o() + 0.5F, posBlock.p() + 0.5F));
      }
      f += 1.0F;
      if (e >= 1.0F)
      {
        h = false;
        b.a(new ir(ir.a.c, posBlock, directionFacing));
        a(posBlock, directionFacing);
        e = 0.0F;
        f = 0.0F;
        g = 5;
      }
      a.f.c(a.h.F(), c, (int)(e * 10.0F) - 1);
      return true;
    }
    return b(posBlock, directionFacing);
  }
  
  public float d()
  {
    return i.d() ? 5.0F : 4.5F;
  }
  
  public void e()
  {
    n();
    if (b.a().g()) {
      b.a().a();
    } else {
      b.a().l();
    }
  }
  
  private boolean a(cj pos)
  {
    zx itemstack = a.h.bA();
    boolean flag = (d == null) && (itemstack == null);
    if ((d != null) && (itemstack != null)) {
      flag = (itemstack.b() == d.b()) && (zx.a(itemstack, d)) && ((itemstack.e()) || (itemstack.i() == d.i()));
    }
    return (pos.equals(c)) && (flag);
  }
  
  private void n()
  {
    int i = a.h.bi.c;
    if (i != j)
    {
      j = i;
      b.a(new iv(j));
    }
  }
  
  public boolean a(bew player, bdb worldIn, zx heldStack, cj hitPos, cq side, aui hitVec)
  {
    n();
    float f = (float)(a - hitPos.n());
    float f1 = (float)(b - hitPos.o());
    float f2 = (float)(c - hitPos.p());
    boolean flag = false;
    if (!a.f.af().a(hitPos)) {
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
    b.a(new ja(hitPos, side.a(), bi.h(), f, f1, f2));
    if ((!flag) && (this.i != adp.a.e))
    {
      if (heldStack == null) {
        return false;
      }
      if (this.i.d())
      {
        int i = heldStack.i();
        int j = b;
        boolean flag1 = heldStack.a(player, worldIn, hitPos, side, f, f1, f2);
        heldStack.b(i);
        b = j;
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
    b.a(new ja(bi.h()));
    int i = b;
    zx itemstack = itemStackIn.a(worldIn, playerIn);
    if ((itemstack != itemStackIn) || ((itemstack != null) && (b != i)))
    {
      bi.a[bi.c] = itemstack;
      if (b == 0) {
        bi.a[bi.c] = null;
      }
      return true;
    }
    return false;
  }
  
  public bew a(adm worldIn, nb p_178892_2_)
  {
    return new bew(a, worldIn, b, p_178892_2_);
  }
  
  public void a(wn playerIn, pk targetEntity)
  {
    n();
    b.a(new in(targetEntity, in.a.b));
    if (i != adp.a.e) {
      playerIn.f(targetEntity);
    }
  }
  
  public boolean b(wn playerIn, pk targetEntity)
  {
    n();
    b.a(new in(targetEntity, in.a.a));
    return (i != adp.a.e) && (playerIn.u(targetEntity));
  }
  
  public boolean a(wn p_178894_1_, pk p_178894_2_, auh p_178894_3_)
  {
    n();
    aui vec3 = new aui(c.a - s, c.b - t, c.c - u);
    b.a(new in(p_178894_2_, vec3));
    return (i != adp.a.e) && (p_178894_2_.a(p_178894_1_, vec3));
  }
  
  public zx a(int windowId, int slotId, int mouseButtonClicked, int mode, wn playerIn)
  {
    short short1 = bk.a(bi);
    zx itemstack = bk.a(slotId, mouseButtonClicked, mode, playerIn);
    b.a(new ik(windowId, slotId, mouseButtonClicked, mode, itemstack, short1));
    return itemstack;
  }
  
  public void a(int p_78756_1_, int p_78756_2_)
  {
    b.a(new ij(p_78756_1_, p_78756_2_));
  }
  
  public void a(zx itemStackIn, int slotId)
  {
    if (i.d()) {
      b.a(new iw(slotId, itemStackIn));
    }
  }
  
  public void a(zx itemStackIn)
  {
    if ((i.d()) && (itemStackIn != null)) {
      b.a(new iw(-1, itemStackIn));
    }
  }
  
  public void c(wn playerIn)
  {
    n();
    b.a(new ir(ir.a.f, cj.a, cq.a));
    playerIn.bU();
  }
  
  public boolean f()
  {
    return i.e();
  }
  
  public boolean g()
  {
    return !i.d();
  }
  
  public boolean h()
  {
    return i.d();
  }
  
  public boolean i()
  {
    return i.d();
  }
  
  public boolean j()
  {
    return (a.h.au()) && ((a.h.m instanceof tp));
  }
  
  public boolean k()
  {
    return i == adp.a.e;
  }
  
  public adp.a l()
  {
    return i;
  }
  
  public boolean m()
  {
    if ((settingsoldBlockBuild) && (Allowed.blockBuild())) {
      return false;
    }
    return h;
  }
}
