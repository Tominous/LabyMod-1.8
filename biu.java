import com.google.common.collect.Maps;
import java.util.Collections;
import java.util.Map;

public class biu
{
  private Map k = Maps.newHashMap();
  private Map l = Maps.newHashMap();
  private bln m;
  private avn n;
  private double o;
  private double p;
  private double q;
  public bmj a;
  public adm b;
  public pk c;
  public pk d;
  public float e;
  public float f;
  public avh g;
  public double h;
  public double i;
  public double j;
  private boolean r = false;
  private boolean s = true;
  private boolean t = false;
  private static final String __OBFID = "CL_00000991";
  
  public biu(bmj p_i46180_1_, bjh p_i46180_2_)
  {
    this.a = p_i46180_1_;
    this.k.put(vm.class, new bil(this));
    this.k.put(wc.class, new bka(this));
    this.k.put(tt.class, new bjs(this, new bbq(), 0.7F));
    this.k.put(tv.class, new bjv(this, new bbw(), 0.7F));
    this.k.put(to.class, new bin(this, new bbb(), 0.7F));
    this.k.put(tr.class, new bjp(this, new bbb(), 0.7F));
    this.k.put(ua.class, new bkl(this, new bcm(), 0.5F));
    this.k.put(tn.class, new bim(this, new bba(), 0.3F));
    this.k.put(ts.class, new bjq(this, new bbp(), 0.4F));
    this.k.put(tu.class, new bju(this, new bbu(), 0.3F));
    this.k.put(vz.class, new bjw(this));
    this.k.put(vp.class, new bit(this));
    this.k.put(vn.class, new bio(this));
    this.k.put(vo.class, new bis(this));
    this.k.put(tw.class, new bjz(this));
    this.k.put(wa.class, new bjx(this));
    this.k.put(wd.class, new bki(this));
    this.k.put(vl.class, new bij(this));
    this.k.put(vw.class, new bjt(this));
    this.k.put(we.class, new bkm(this));
    this.k.put(wb.class, new bjy(this, new bcc(16), 0.25F));
    this.k.put(vu.class, new bji(this));
    this.k.put(vs.class, new bjb(this, new bcn(), 0.5F, 6.0F));
    this.k.put(vr.class, new bja(this));
    this.k.put(tx.class, new bkb(this, new bcf(), 0.7F));
    this.k.put(wi.class, new bkh(this));
    this.k.put(ty.class, new bkg(this));
    this.k.put(tk.class, new bii(this));
    this.k.put(vt.class, new bjc(this));
    this.k.put(ug.class, new bir(this));
    this.k.put(uf.class, new biq(this));
    this.k.put(uk.class, new bkj(this));
    this.k.put(pk.class, new bip(this));
    this.k.put(uq.class, new bjr(this));
    this.k.put(uo.class, new bjg(this, p_i46180_2_));
    this.k.put(up.class, new bjj(this));
    this.k.put(wq.class, new bih(this));
    this.k.put(wx.class, new bkc(this, zy.aD, p_i46180_2_));
    this.k.put(xa.class, new bkc(this, zy.bu, p_i46180_2_));
    this.k.put(wr.class, new bkc(this, zy.bH, p_i46180_2_));
    this.k.put(wz.class, new bkc(this, zy.aP, p_i46180_2_));
    this.k.put(xc.class, new bkd(this, p_i46180_2_));
    this.k.put(xb.class, new bkc(this, zy.bK, p_i46180_2_));
    this.k.put(wt.class, new bkc(this, zy.cb, p_i46180_2_));
    this.k.put(wu.class, new biy(this, 2.0F));
    this.k.put(ww.class, new biy(this, 0.5F));
    this.k.put(xd.class, new bkk(this));
    this.k.put(uz.class, new bjf(this, p_i46180_2_));
    this.k.put(pp.class, new biw(this));
    this.k.put(vj.class, new bkf(this));
    this.k.put(uy.class, new bix(this));
    this.k.put(um.class, new big(this));
    this.k.put(vi.class, new bke(this));
    this.k.put(vh.class, new bjn(this));
    this.k.put(va.class, new bjm(this));
    this.k.put(ux.class, new bik(this));
    this.k.put(ur.class, new biz(this));
    this.k.put(tp.class, new bjd(this, new bbh(), 0.75F));
    this.k.put(uv.class, new bjk(this));
    this.m = new bln(this);
    this.l.put("default", this.m);
    this.l.put("slim", new bln(this, true));
    
    PlayerItemsLayer.register(this.l);
  }
  
  public void a(double p_178628_1_, double p_178628_3_, double p_178628_5_)
  {
    this.o = p_178628_1_;
    this.p = p_178628_3_;
    this.q = p_178628_5_;
  }
  
  public biv a(Class p_78715_1_)
  {
    biv var2 = (biv)this.k.get(p_78715_1_);
    if ((var2 == null) && (p_78715_1_ != pk.class))
    {
      var2 = a(p_78715_1_.getSuperclass());
      this.k.put(p_78715_1_, var2);
    }
    return var2;
  }
  
  public biv a(pk p_78713_1_)
  {
    if ((p_78713_1_ instanceof bet))
    {
      String var2 = ((bet)p_78713_1_).l();
      bln var3 = (bln)this.l.get(var2);
      return var3 != null ? var3 : this.m;
    }
    return a(p_78713_1_.getClass());
  }
  
  public void a(adm worldIn, avn p_180597_2_, pk p_180597_3_, pk p_180597_4_, avh p_180597_5_, float p_180597_6_)
  {
    this.b = worldIn;
    this.g = p_180597_5_;
    this.c = p_180597_3_;
    this.d = p_180597_4_;
    this.n = p_180597_2_;
    if (((p_180597_3_ instanceof pr)) && (((pr)p_180597_3_).bJ()))
    {
      alz var7 = worldIn.p(new cj(p_180597_3_));
      afh var8 = var7.c();
      if (Reflector.callBoolean(Reflector.ForgeBlock_isBed, new Object[] { worldIn, new cj(p_180597_3_), (pr)p_180597_3_ }))
      {
        cq facing = (cq)Reflector.call(var8, Reflector.ForgeBlock_getBedDirection, new Object[] { worldIn, new cj(p_180597_3_) });
        int var9 = facing.b();
        this.e = (var9 * 90 + 180);
        this.f = 0.0F;
      }
      else if (var8 == afi.C)
      {
        int var9 = ((cq)var7.b(afg.O)).b();
        this.e = (var9 * 90 + 180);
        this.f = 0.0F;
      }
    }
    else
    {
      this.e = (p_180597_3_.A + (p_180597_3_.y - p_180597_3_.A) * p_180597_6_);
      this.f = (p_180597_3_.B + (p_180597_3_.z - p_180597_3_.B) * p_180597_6_);
    }
    if (p_180597_5_.aA == 2) {
      this.e += 180.0F;
    }
    this.h = (p_180597_3_.P + (p_180597_3_.s - p_180597_3_.P) * p_180597_6_);
    this.i = (p_180597_3_.Q + (p_180597_3_.t - p_180597_3_.Q) * p_180597_6_);
    this.j = (p_180597_3_.R + (p_180597_3_.u - p_180597_3_.R) * p_180597_6_);
  }
  
  public void a(float p_178631_1_)
  {
    this.e = p_178631_1_;
  }
  
  public boolean a()
  {
    return this.s;
  }
  
  public void a(boolean p_178633_1_)
  {
    this.s = p_178633_1_;
  }
  
  public void b(boolean p_178629_1_)
  {
    this.t = p_178629_1_;
  }
  
  public boolean b()
  {
    return this.t;
  }
  
  public boolean a(pk p_147937_1_, float p_147937_2_)
  {
    return a(p_147937_1_, p_147937_2_, false);
  }
  
  public boolean a(pk p_178635_1_, bia p_178635_2_, double p_178635_3_, double p_178635_5_, double p_178635_7_)
  {
    biv var9 = a(p_178635_1_);
    return (var9 != null) && (var9.a(p_178635_1_, p_178635_2_, p_178635_3_, p_178635_5_, p_178635_7_));
  }
  
  public boolean a(pk p_147936_1_, float p_147936_2_, boolean p_147936_3_)
  {
    if (p_147936_1_.W == 0)
    {
      p_147936_1_.P = p_147936_1_.s;
      p_147936_1_.Q = p_147936_1_.t;
      p_147936_1_.R = p_147936_1_.u;
    }
    double var4 = p_147936_1_.P + (p_147936_1_.s - p_147936_1_.P) * p_147936_2_;
    double var6 = p_147936_1_.Q + (p_147936_1_.t - p_147936_1_.Q) * p_147936_2_;
    double var8 = p_147936_1_.R + (p_147936_1_.u - p_147936_1_.R) * p_147936_2_;
    float var10 = p_147936_1_.A + (p_147936_1_.y - p_147936_1_.A) * p_147936_2_;
    int var11 = p_147936_1_.b(p_147936_2_);
    if (p_147936_1_.at()) {
      var11 = 15728880;
    }
    int var12 = var11 % 65536;
    int var13 = var11 / 65536;
    bqs.a(bqs.r, var12 / 1.0F, var13 / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    return a(p_147936_1_, var4 - this.o, var6 - this.p, var8 - this.q, var10, p_147936_2_, p_147936_3_);
  }
  
  public void b(pk p_178630_1_, float p_178630_2_)
  {
    double var3 = p_178630_1_.P + (p_178630_1_.s - p_178630_1_.P) * p_178630_2_;
    double var5 = p_178630_1_.Q + (p_178630_1_.t - p_178630_1_.Q) * p_178630_2_;
    double var7 = p_178630_1_.R + (p_178630_1_.u - p_178630_1_.R) * p_178630_2_;
    biv var9 = a(p_178630_1_);
    if ((var9 != null) && (this.a != null))
    {
      int var10 = p_178630_1_.b(p_178630_2_);
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      bqs.a(bqs.r, var11 / 1.0F, var12 / 1.0F);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      var9.a(p_178630_1_, var3 - this.o, var5 - this.p, var7 - this.q);
    }
  }
  
  public boolean a(pk p_147940_1_, double p_147940_2_, double p_147940_4_, double p_147940_6_, float p_147940_8_, float p_147940_9_)
  {
    return a(p_147940_1_, p_147940_2_, p_147940_4_, p_147940_6_, p_147940_8_, p_147940_9_, false);
  }
  
  public boolean a(pk p_147939_1_, double p_147939_2_, double p_147939_4_, double p_147939_6_, float p_147939_8_, float p_147939_9_, boolean p_147939_10_)
  {
    biv var11 = null;
    try
    {
      var11 = a(p_147939_1_);
      if ((var11 != null) && (this.a != null))
      {
        try
        {
          if ((var11 instanceof bjl)) {
            ((bjl)var11).a(this.r);
          }
          var11.a(p_147939_1_, p_147939_2_, p_147939_4_, p_147939_6_, p_147939_8_, p_147939_9_);
        }
        catch (Throwable var18)
        {
          throw new e(b.a(var18, "Rendering entity in world"));
        }
        try
        {
          if (!this.r) {
            var11.b(p_147939_1_, p_147939_2_, p_147939_4_, p_147939_6_, p_147939_8_, p_147939_9_);
          }
        }
        catch (Throwable var17)
        {
          throw new e(b.a(var17, "Post-rendering entity in world"));
        }
        if ((this.t) && (!p_147939_1_.ax()) && (!p_147939_10_)) {
          try
          {
            b(p_147939_1_, p_147939_2_, p_147939_4_, p_147939_6_, p_147939_8_, p_147939_9_);
          }
          catch (Throwable var16)
          {
            throw new e(b.a(var16, "Rendering entity hitbox in world"));
          }
        }
      }
      else if (this.a != null)
      {
        return false;
      }
      return true;
    }
    catch (Throwable var19)
    {
      b var13 = b.a(var19, "Rendering entity in world");
      c var14 = var13.a("Entity being rendered");
      p_147939_1_.a(var14);
      c var15 = var13.a("Renderer details");
      var15.a("Assigned renderer", var11);
      var15.a("Location", c.a(p_147939_2_, p_147939_4_, p_147939_6_));
      var15.a("Rotation", Float.valueOf(p_147939_8_));
      var15.a("Delta", Float.valueOf(p_147939_9_));
      throw new e(var13);
    }
  }
  
  private void b(pk p_85094_1_, double p_85094_2_, double p_85094_4_, double p_85094_6_, float p_85094_8_, float p_85094_9_)
  {
    bfl.a(false);
    bfl.x();
    bfl.f();
    bfl.p();
    bfl.k();
    float var10 = p_85094_1_.J / 2.0F;
    aug var11 = p_85094_1_.aR();
    aug var12 = new aug(var11.a - p_85094_1_.s + p_85094_2_, var11.b - p_85094_1_.t + p_85094_4_, var11.c - p_85094_1_.u + p_85094_6_, var11.d - p_85094_1_.s + p_85094_2_, var11.e - p_85094_1_.t + p_85094_4_, var11.f - p_85094_1_.u + p_85094_6_);
    bfr.a(var12, 255, 255, 255, 255);
    if ((p_85094_1_ instanceof pr))
    {
      float var13 = 0.01F;
      bfr.a(new aug(p_85094_2_ - var10, p_85094_4_ + p_85094_1_.aS() - 0.009999999776482582D, p_85094_6_ - var10, p_85094_2_ + var10, p_85094_4_ + p_85094_1_.aS() + 0.009999999776482582D, p_85094_6_ + var10), 255, 0, 0, 255);
    }
    bfx var16 = bfx.a();
    bfd var14 = var16.c();
    aui var15 = p_85094_1_.d(p_85094_9_);
    var14.a(3, bms.f);
    var14.b(p_85094_2_, p_85094_4_ + p_85094_1_.aS(), p_85094_6_).b(0, 0, 255, 255).d();
    var14.b(p_85094_2_ + var15.a * 2.0D, p_85094_4_ + p_85094_1_.aS() + var15.b * 2.0D, p_85094_6_ + var15.c * 2.0D).b(0, 0, 255, 255).d();
    var16.b();
    bfl.w();
    bfl.e();
    bfl.o();
    bfl.k();
    bfl.a(true);
  }
  
  public void a(adm worldIn)
  {
    this.b = worldIn;
  }
  
  public double b(double p_78714_1_, double p_78714_3_, double p_78714_5_)
  {
    double var7 = p_78714_1_ - this.h;
    double var9 = p_78714_3_ - this.i;
    double var11 = p_78714_5_ - this.j;
    return var7 * var7 + var9 * var9 + var11 * var11;
  }
  
  public avn c()
  {
    return this.n;
  }
  
  public void c(boolean p_178632_1_)
  {
    this.r = p_178632_1_;
  }
  
  public Map getEntityRenderMap()
  {
    return this.k;
  }
  
  public void setEntityRenderMap(Map entityRenderMap)
  {
    this.k = entityRenderMap;
  }
  
  public Map<String, bln> getSkinMap()
  {
    return Collections.unmodifiableMap(this.l);
  }
}
