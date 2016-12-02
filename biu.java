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
    a = p_i46180_1_;
    k.put(vm.class, new bil(this));
    k.put(wc.class, new bka(this));
    k.put(tt.class, new bjs(this, new bbq(), 0.7F));
    k.put(tv.class, new bjv(this, new bbw(), 0.7F));
    k.put(to.class, new bin(this, new bbb(), 0.7F));
    k.put(tr.class, new bjp(this, new bbb(), 0.7F));
    k.put(ua.class, new bkl(this, new bcm(), 0.5F));
    k.put(tn.class, new bim(this, new bba(), 0.3F));
    k.put(ts.class, new bjq(this, new bbp(), 0.4F));
    k.put(tu.class, new bju(this, new bbu(), 0.3F));
    k.put(vz.class, new bjw(this));
    k.put(vp.class, new bit(this));
    k.put(vn.class, new bio(this));
    k.put(vo.class, new bis(this));
    k.put(tw.class, new bjz(this));
    k.put(wa.class, new bjx(this));
    k.put(wd.class, new bki(this));
    k.put(vl.class, new bij(this));
    k.put(vw.class, new bjt(this));
    k.put(we.class, new bkm(this));
    k.put(wb.class, new bjy(this, new bcc(16), 0.25F));
    k.put(vu.class, new bji(this));
    k.put(vs.class, new bjb(this, new bcn(), 0.5F, 6.0F));
    k.put(vr.class, new bja(this));
    k.put(tx.class, new bkb(this, new bcf(), 0.7F));
    k.put(wi.class, new bkh(this));
    k.put(ty.class, new bkg(this));
    k.put(tk.class, new bii(this));
    k.put(vt.class, new bjc(this));
    k.put(ug.class, new bir(this));
    k.put(uf.class, new biq(this));
    k.put(uk.class, new bkj(this));
    k.put(pk.class, new bip(this));
    k.put(uq.class, new bjr(this));
    k.put(uo.class, new bjg(this, p_i46180_2_));
    k.put(up.class, new bjj(this));
    k.put(wq.class, new bih(this));
    k.put(wx.class, new bkc(this, zy.aD, p_i46180_2_));
    k.put(xa.class, new bkc(this, zy.bu, p_i46180_2_));
    k.put(wr.class, new bkc(this, zy.bH, p_i46180_2_));
    k.put(wz.class, new bkc(this, zy.aP, p_i46180_2_));
    k.put(xc.class, new bkd(this, p_i46180_2_));
    k.put(xb.class, new bkc(this, zy.bK, p_i46180_2_));
    k.put(wt.class, new bkc(this, zy.cb, p_i46180_2_));
    k.put(wu.class, new biy(this, 2.0F));
    k.put(ww.class, new biy(this, 0.5F));
    k.put(xd.class, new bkk(this));
    k.put(uz.class, new bjf(this, p_i46180_2_));
    k.put(pp.class, new biw(this));
    k.put(vj.class, new bkf(this));
    k.put(uy.class, new bix(this));
    k.put(um.class, new big(this));
    k.put(vi.class, new bke(this));
    k.put(vh.class, new bjn(this));
    k.put(va.class, new bjm(this));
    k.put(ux.class, new bik(this));
    k.put(ur.class, new biz(this));
    k.put(tp.class, new bjd(this, new bbh(), 0.75F));
    k.put(uv.class, new bjk(this));
    m = new bln(this);
    l.put("default", m);
    l.put("slim", new bln(this, true));
    
    PlayerItemsLayer.register(l);
  }
  
  public void a(double p_178628_1_, double p_178628_3_, double p_178628_5_)
  {
    o = p_178628_1_;
    p = p_178628_3_;
    q = p_178628_5_;
  }
  
  public biv a(Class p_78715_1_)
  {
    biv var2 = (biv)k.get(p_78715_1_);
    if ((var2 == null) && (p_78715_1_ != pk.class))
    {
      var2 = a(p_78715_1_.getSuperclass());
      k.put(p_78715_1_, var2);
    }
    return var2;
  }
  
  public biv a(pk p_78713_1_)
  {
    if ((p_78713_1_ instanceof bet))
    {
      String var2 = ((bet)p_78713_1_).l();
      bln var3 = (bln)l.get(var2);
      return var3 != null ? var3 : m;
    }
    return a(p_78713_1_.getClass());
  }
  
  public void a(adm worldIn, avn p_180597_2_, pk p_180597_3_, pk p_180597_4_, avh p_180597_5_, float p_180597_6_)
  {
    b = worldIn;
    g = p_180597_5_;
    c = p_180597_3_;
    d = p_180597_4_;
    n = p_180597_2_;
    if (((p_180597_3_ instanceof pr)) && (((pr)p_180597_3_).bJ()))
    {
      alz var7 = worldIn.p(new cj(p_180597_3_));
      afh var8 = var7.c();
      if (Reflector.callBoolean(Reflector.ForgeBlock_isBed, new Object[] { worldIn, new cj(p_180597_3_), (pr)p_180597_3_ }))
      {
        cq facing = (cq)Reflector.call(var8, Reflector.ForgeBlock_getBedDirection, new Object[] { worldIn, new cj(p_180597_3_) });
        int var9 = facing.b();
        e = (var9 * 90 + 180);
        f = 0.0F;
      }
      else if (var8 == afi.C)
      {
        int var9 = ((cq)var7.b(afg.O)).b();
        e = (var9 * 90 + 180);
        f = 0.0F;
      }
    }
    else
    {
      e = (A + (y - A) * p_180597_6_);
      f = (B + (z - B) * p_180597_6_);
    }
    if (aA == 2) {
      e += 180.0F;
    }
    h = (P + (s - P) * p_180597_6_);
    i = (Q + (t - Q) * p_180597_6_);
    j = (R + (u - R) * p_180597_6_);
  }
  
  public void a(float p_178631_1_)
  {
    e = p_178631_1_;
  }
  
  public boolean a()
  {
    return s;
  }
  
  public void a(boolean p_178633_1_)
  {
    s = p_178633_1_;
  }
  
  public void b(boolean p_178629_1_)
  {
    t = p_178629_1_;
  }
  
  public boolean b()
  {
    return t;
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
    if (W == 0)
    {
      P = s;
      Q = t;
      R = u;
    }
    double var4 = P + (s - P) * p_147936_2_;
    double var6 = Q + (t - Q) * p_147936_2_;
    double var8 = R + (u - R) * p_147936_2_;
    float var10 = A + (y - A) * p_147936_2_;
    int var11 = p_147936_1_.b(p_147936_2_);
    if (p_147936_1_.at()) {
      var11 = 15728880;
    }
    int var12 = var11 % 65536;
    int var13 = var11 / 65536;
    bqs.a(bqs.r, var12 / 1.0F, var13 / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    return a(p_147936_1_, var4 - o, var6 - p, var8 - q, var10, p_147936_2_, p_147936_3_);
  }
  
  public void b(pk p_178630_1_, float p_178630_2_)
  {
    double var3 = P + (s - P) * p_178630_2_;
    double var5 = Q + (t - Q) * p_178630_2_;
    double var7 = R + (u - R) * p_178630_2_;
    biv var9 = a(p_178630_1_);
    if ((var9 != null) && (a != null))
    {
      int var10 = p_178630_1_.b(p_178630_2_);
      int var11 = var10 % 65536;
      int var12 = var10 / 65536;
      bqs.a(bqs.r, var11 / 1.0F, var12 / 1.0F);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      var9.a(p_178630_1_, var3 - o, var5 - p, var7 - q);
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
      if ((var11 != null) && (a != null))
      {
        try
        {
          if ((var11 instanceof bjl)) {
            ((bjl)var11).a(r);
          }
          var11.a(p_147939_1_, p_147939_2_, p_147939_4_, p_147939_6_, p_147939_8_, p_147939_9_);
        }
        catch (Throwable var18)
        {
          throw new e(b.a(var18, "Rendering entity in world"));
        }
        try
        {
          if (!r) {
            var11.b(p_147939_1_, p_147939_2_, p_147939_4_, p_147939_6_, p_147939_8_, p_147939_9_);
          }
        }
        catch (Throwable var17)
        {
          throw new e(b.a(var17, "Post-rendering entity in world"));
        }
        if ((t) && (!p_147939_1_.ax()) && (!p_147939_10_)) {
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
      else if (a != null)
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
    float var10 = J / 2.0F;
    aug var11 = p_85094_1_.aR();
    aug var12 = new aug(a - s + p_85094_2_, b - t + p_85094_4_, c - u + p_85094_6_, d - s + p_85094_2_, e - t + p_85094_4_, f - u + p_85094_6_);
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
    var14.b(p_85094_2_ + a * 2.0D, p_85094_4_ + p_85094_1_.aS() + b * 2.0D, p_85094_6_ + c * 2.0D).b(0, 0, 255, 255).d();
    var16.b();
    bfl.w();
    bfl.e();
    bfl.o();
    bfl.k();
    bfl.a(true);
  }
  
  public void a(adm worldIn)
  {
    b = worldIn;
  }
  
  public double b(double p_78714_1_, double p_78714_3_, double p_78714_5_)
  {
    double var7 = p_78714_1_ - h;
    double var9 = p_78714_3_ - i;
    double var11 = p_78714_5_ - j;
    return var7 * var7 + var9 * var9 + var11 * var11;
  }
  
  public avn c()
  {
    return n;
  }
  
  public void c(boolean p_178632_1_)
  {
    r = p_178632_1_;
  }
  
  public Map getEntityRenderMap()
  {
    return k;
  }
  
  public void setEntityRenderMap(Map entityRenderMap)
  {
    k = entityRenderMap;
  }
  
  public Map<String, bln> getSkinMap()
  {
    return Collections.unmodifiableMap(l);
  }
}
