import com.google.common.collect.Maps;
import java.util.Map;

public class biu
{
  private Map<Class<? extends pk>, biv<? extends pk>> k = Maps.newHashMap();
  private Map<String, bln> l = Maps.newHashMap();
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
  
  public biu(bmj ☃, bjh ☃)
  {
    this.a = ☃;
    
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
    this.k.put(uo.class, new bjg(this, ☃));
    this.k.put(up.class, new bjj(this));
    this.k.put(wq.class, new bih(this));
    this.k.put(wx.class, new bkc(this, zy.aD, ☃));
    this.k.put(xa.class, new bkc(this, zy.bu, ☃));
    this.k.put(wr.class, new bkc(this, zy.bH, ☃));
    this.k.put(wz.class, new bkc(this, zy.aP, ☃));
    this.k.put(xc.class, new bkd(this, ☃));
    this.k.put(xb.class, new bkc(this, zy.bK, ☃));
    this.k.put(wt.class, new bkc(this, zy.cb, ☃));
    this.k.put(wu.class, new biy(this, 2.0F));
    this.k.put(ww.class, new biy(this, 0.5F));
    this.k.put(xd.class, new bkk(this));
    this.k.put(uz.class, new bjf(this, ☃));
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
  }
  
  public void a(double ☃, double ☃, double ☃)
  {
    this.o = ☃;
    this.p = ☃;
    this.q = ☃;
  }
  
  public <T extends pk> biv<T> a(Class<? extends pk> ☃)
  {
    biv<? extends pk> ☃ = (biv)this.k.get(☃);
    if ((☃ == null) && (☃ != pk.class))
    {
      ☃ = a(☃.getSuperclass());
      this.k.put(☃, ☃);
    }
    return ☃;
  }
  
  public <T extends pk> biv<T> a(pk ☃)
  {
    if ((☃ instanceof bet))
    {
      String ☃ = ((bet)☃).l();
      bln ☃ = (bln)this.l.get(☃);
      if (☃ != null) {
        return ☃;
      }
      return this.m;
    }
    return a(☃.getClass());
  }
  
  public void a(adm ☃, avn ☃, pk ☃, pk ☃, avh ☃, float ☃)
  {
    this.b = ☃;
    this.g = ☃;
    this.c = ☃;
    this.d = ☃;
    this.n = ☃;
    if (((☃ instanceof pr)) && (((pr)☃).bJ()))
    {
      alz ☃ = ☃.p(new cj(☃));
      afh ☃ = ☃.c();
      if (☃ == afi.C)
      {
        int ☃ = ((cq)☃.b(afg.O)).b();
        this.e = (☃ * 90 + 180);
        this.f = 0.0F;
      }
    }
    else
    {
      this.e = (☃.A + (☃.y - ☃.A) * ☃);
      this.f = (☃.B + (☃.z - ☃.B) * ☃);
    }
    if (☃.aA == 2) {
      this.e += 180.0F;
    }
    this.h = (☃.P + (☃.s - ☃.P) * ☃);
    this.i = (☃.Q + (☃.t - ☃.Q) * ☃);
    this.j = (☃.R + (☃.u - ☃.R) * ☃);
  }
  
  public void a(float ☃)
  {
    this.e = ☃;
  }
  
  public boolean a()
  {
    return this.s;
  }
  
  public void a(boolean ☃)
  {
    this.s = ☃;
  }
  
  public void b(boolean ☃)
  {
    this.t = ☃;
  }
  
  public boolean b()
  {
    return this.t;
  }
  
  public boolean a(pk ☃, float ☃)
  {
    return a(☃, ☃, false);
  }
  
  public boolean a(pk ☃, bia ☃, double ☃, double ☃, double ☃)
  {
    biv<pk> ☃ = a(☃);
    if ((☃ != null) && 
      (☃.a(☃, ☃, ☃, ☃, ☃))) {
      return true;
    }
    return false;
  }
  
  public boolean a(pk ☃, float ☃, boolean ☃)
  {
    if (☃.W == 0)
    {
      ☃.P = ☃.s;
      ☃.Q = ☃.t;
      ☃.R = ☃.u;
    }
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    float ☃ = ☃.A + (☃.y - ☃.A) * ☃;
    
    int ☃ = ☃.b(☃);
    if (☃.at()) {
      ☃ = 15728880;
    }
    int ☃ = ☃ % 65536;
    int ☃ = ☃ / 65536;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    return a(☃, ☃ - this.o, ☃ - this.p, ☃ - this.q, ☃, ☃, ☃);
  }
  
  private boolean t = false;
  
  public void b(pk ☃, float ☃)
  {
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    
    biv<pk> ☃ = a(☃);
    if ((☃ != null) && (this.a != null))
    {
      int ☃ = ☃.b(☃);
      int ☃ = ☃ % 65536;
      int ☃ = ☃ / 65536;
      bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      ☃.a(☃, ☃ - this.o, ☃ - this.p, ☃ - this.q);
    }
  }
  
  public boolean a(pk ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    return a(☃, ☃, ☃, ☃, ☃, ☃, false);
  }
  
  public boolean a(pk ☃, double ☃, double ☃, double ☃, float ☃, float ☃, boolean ☃)
  {
    biv<pk> ☃ = null;
    try
    {
      ☃ = a(☃);
      if ((☃ != null) && (this.a != null))
      {
        try
        {
          if ((☃ instanceof bjl)) {
            ((bjl)☃).a(this.r);
          }
          ☃.a(☃, ☃, ☃, ☃, ☃, ☃);
        }
        catch (Throwable ☃)
        {
          throw new e(b.a(☃, "Rendering entity in world"));
        }
        try
        {
          if (!this.r) {
            ☃.b(☃, ☃, ☃, ☃, ☃, ☃);
          }
        }
        catch (Throwable ☃)
        {
          throw new e(b.a(☃, "Post-rendering entity in world"));
        }
        if ((this.t) && (!☃.ax()) && (!☃)) {
          try
          {
            b(☃, ☃, ☃, ☃, ☃, ☃);
          }
          catch (Throwable ☃)
          {
            throw new e(b.a(☃, "Rendering entity hitbox in world"));
          }
        }
      }
      else if (this.a != null)
      {
        return false;
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Rendering entity in world");
      c ☃ = ☃.a("Entity being rendered");
      ☃.a(☃);
      
      c ☃ = ☃.a("Renderer details");
      ☃.a("Assigned renderer", ☃);
      ☃.a("Location", c.a(☃, ☃, ☃));
      ☃.a("Rotation", Float.valueOf(☃));
      ☃.a("Delta", Float.valueOf(☃));
      
      throw new e(☃);
    }
    return true;
  }
  
  private void b(pk ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.a(false);
    bfl.x();
    bfl.f();
    bfl.p();
    bfl.k();
    
    float ☃ = ☃.J / 2.0F;
    aug ☃ = ☃.aR();
    aug ☃ = new aug(☃.a - ☃.s + ☃, ☃.b - ☃.t + ☃, ☃.c - ☃.u + ☃, ☃.d - ☃.s + ☃, ☃.e - ☃.t + ☃, ☃.f - ☃.u + ☃);
    bfr.a(☃, 255, 255, 255, 255);
    if ((☃ instanceof pr))
    {
      float ☃ = 0.01F;
      bfr.a(new aug(☃ - ☃, ☃ + ☃.aS() - 0.009999999776482582D, ☃ - ☃, ☃ + ☃, ☃ + ☃.aS() + 0.009999999776482582D, ☃ + ☃), 255, 0, 0, 255);
    }
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    aui ☃ = ☃.d(☃);
    ☃.a(3, bms.f);
    ☃.b(☃, ☃ + ☃.aS(), ☃).b(0, 0, 255, 255).d();
    ☃.b(☃ + ☃.a * 2.0D, ☃ + ☃.aS() + ☃.b * 2.0D, ☃ + ☃.c * 2.0D).b(0, 0, 255, 255).d();
    ☃.b();
    
    bfl.w();
    bfl.e();
    bfl.o();
    bfl.k();
    bfl.a(true);
  }
  
  public void a(adm ☃)
  {
    this.b = ☃;
  }
  
  public double b(double ☃, double ☃, double ☃)
  {
    double ☃ = ☃ - this.h;
    double ☃ = ☃ - this.i;
    double ☃ = ☃ - this.j;
    return ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
  }
  
  public avn c()
  {
    return this.n;
  }
  
  public void c(boolean ☃)
  {
    this.r = ☃;
  }
}
