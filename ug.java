import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ug
  extends ps
  implements uc, ud, vq
{
  public double a;
  public double b;
  public double c;
  public double[][] bk = new double[64][3];
  public int bl = -1;
  public ue[] bm;
  public ue bn;
  public ue bo;
  public ue bp;
  public ue bq;
  public ue br;
  public ue bs;
  public ue bt;
  public float bu;
  public float bv;
  public boolean bw;
  public boolean bx;
  private pk bA;
  public int by;
  public uf bz;
  
  public ug(adm ☃)
  {
    super(☃);
    
    bm = new ue[] { bn = new ue(this, "head", 6.0F, 6.0F), bo = new ue(this, "body", 8.0F, 8.0F), bp = new ue(this, "tail", 4.0F, 4.0F), bq = new ue(this, "tail", 4.0F, 4.0F), br = new ue(this, "tail", 4.0F, 4.0F), bs = new ue(this, "wing", 4.0F, 4.0F), bt = new ue(this, "wing", 4.0F, 4.0F) };
    
    i(bu());
    
    a(16.0F, 8.0F);
    
    T = true;
    ab = true;
    
    b = 100.0D;
    
    ah = true;
  }
  
  protected void aX()
  {
    super.aX();
    
    a(vy.a).a(200.0D);
  }
  
  protected void h()
  {
    super.h();
  }
  
  public double[] b(int ☃, float ☃)
  {
    if (bn() <= 0.0F) {
      ☃ = 0.0F;
    }
    ☃ = 1.0F - ☃;
    
    int ☃ = bl - ☃ * 1 & 0x3F;
    int ☃ = bl - ☃ * 1 - 1 & 0x3F;
    double[] ☃ = new double[3];
    double ☃ = bk[☃][0];
    double ☃ = ns.g(bk[☃][0] - ☃);
    ☃[0] = (☃ + ☃ * ☃);
    
    ☃ = bk[☃][1];
    ☃ = bk[☃][1] - ☃;
    
    ☃[1] = (☃ + ☃ * ☃);
    ☃[2] = (bk[☃][2] + (bk[☃][2] - bk[☃][2]) * ☃);
    return ☃;
  }
  
  public void m()
  {
    if (o.D)
    {
      float ☃ = ns.b(bv * 3.1415927F * 2.0F);
      float ☃ = ns.b(bu * 3.1415927F * 2.0F);
      if ((☃ <= -0.3F) && (☃ >= -0.3F) && (!R())) {
        o.a(s, t, u, "mob.enderdragon.wings", 5.0F, 0.8F + V.nextFloat() * 0.3F, false);
      }
    }
    bu = bv;
    if (bn() <= 0.0F)
    {
      float ☃ = (V.nextFloat() - 0.5F) * 8.0F;
      float ☃ = (V.nextFloat() - 0.5F) * 4.0F;
      float ☃ = (V.nextFloat() - 0.5F) * 8.0F;
      o.a(cy.b, s + ☃, t + 2.0D + ☃, u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      return;
    }
    n();
    
    float ☃ = 0.2F / (ns.a(v * v + x * x) * 10.0F + 1.0F);
    ☃ *= (float)Math.pow(2.0D, w);
    if (bx) {
      bv += ☃ * 0.5F;
    } else {
      bv += ☃;
    }
    y = ns.g(y);
    if (ce())
    {
      bv = 0.5F;
      return;
    }
    if (bl < 0) {
      for (int ☃ = 0; ☃ < bk.length; ☃++)
      {
        bk[☃][0] = y;
        bk[☃][1] = t;
      }
    }
    if (++bl == bk.length) {
      bl = 0;
    }
    bk[bl][0] = y;
    bk[bl][1] = t;
    if (o.D)
    {
      if (bc > 0)
      {
        double ☃ = s + (bd - s) / bc;
        double ☃ = t + (be - t) / bc;
        double ☃ = u + (bf - u) / bc;
        
        double ☃ = ns.g(bg - y);
        
        y = ((float)(y + ☃ / bc));
        z = ((float)(z + (bh - z) / bc));
        
        bc -= 1;
        b(☃, ☃, ☃);
        b(y, z);
      }
    }
    else
    {
      double ☃ = a - s;
      double ☃ = b - t;
      double ☃ = c - u;
      
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (bA != null)
      {
        a = bA.s;
        c = bA.u;
        
        double ☃ = a - s;
        double ☃ = c - u;
        double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃);
        double ☃ = 0.4000000059604645D + ☃ / 80.0D - 1.0D;
        if (☃ > 10.0D) {
          ☃ = 10.0D;
        }
        b = (bA.aR().b + ☃);
      }
      else
      {
        a += V.nextGaussian() * 2.0D;
        c += V.nextGaussian() * 2.0D;
      }
      if ((bw) || (☃ < 100.0D) || (☃ > 22500.0D) || (D) || (E)) {
        cf();
      }
      ☃ /= ns.a(☃ * ☃ + ☃ * ☃);
      float ☃ = 0.6F;
      ☃ = ns.a(☃, -☃, ☃);
      w += ☃ * 0.10000000149011612D;
      y = ns.g(y);
      
      double ☃ = 180.0D - ns.b(☃, ☃) * 180.0D / 3.1415927410125732D;
      double ☃ = ns.g(☃ - y);
      if (☃ > 50.0D) {
        ☃ = 50.0D;
      }
      if (☃ < -50.0D) {
        ☃ = -50.0D;
      }
      aui ☃ = new aui(a - s, b - t, c - u).a();
      double ☃ = -ns.b(y * 3.1415927F / 180.0F);
      aui ☃ = new aui(ns.a(y * 3.1415927F / 180.0F), w, ☃).a();
      float ☃ = ((float)☃.b(☃) + 0.5F) / 1.5F;
      if (☃ < 0.0F) {
        ☃ = 0.0F;
      }
      bb *= 0.8F;
      
      float ☃ = ns.a(v * v + x * x) * 1.0F + 1.0F;
      double ☃ = Math.sqrt(v * v + x * x) * 1.0D + 1.0D;
      if (☃ > 40.0D) {
        ☃ = 40.0D;
      }
      bb = ((float)(bb + ☃ * (0.699999988079071D / ☃ / ☃)));
      y += bb * 0.1F;
      
      float ☃ = (float)(2.0D / (☃ + 1.0D));
      float ☃ = 0.06F;
      a(0.0F, -1.0F, ☃ * (☃ * ☃ + (1.0F - ☃)));
      if (bx) {
        d(v * 0.800000011920929D, w * 0.800000011920929D, x * 0.800000011920929D);
      } else {
        d(v, w, x);
      }
      aui ☃ = new aui(v, w, x).a();
      float ☃ = ((float)☃.b(☃) + 1.0F) / 2.0F;
      ☃ = 0.8F + 0.15F * ☃;
      
      v *= ☃;
      x *= ☃;
      w *= 0.9100000262260437D;
    }
    aI = y;
    
    bn.J = (bn.K = 3.0F);
    bp.J = (bp.K = 2.0F);
    bq.J = (bq.K = 2.0F);
    br.J = (br.K = 2.0F);
    bo.K = 3.0F;
    bo.J = 5.0F;
    bs.K = 2.0F;
    bs.J = 4.0F;
    bt.K = 3.0F;
    bt.J = 4.0F;
    
    float ☃ = (float)(b(5, 1.0F)[1] - b(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
    float ☃ = ns.b(☃);
    float ☃ = -ns.a(☃);
    
    float ☃ = y * 3.1415927F / 180.0F;
    float ☃ = ns.a(☃);
    float ☃ = ns.b(☃);
    
    bo.t_();
    bo.b(s + ☃ * 0.5F, t, u - ☃ * 0.5F, 0.0F, 0.0F);
    bs.t_();
    bs.b(s + ☃ * 4.5F, t + 2.0D, u + ☃ * 4.5F, 0.0F, 0.0F);
    bt.t_();
    bt.b(s - ☃ * 4.5F, t + 2.0D, u - ☃ * 4.5F, 0.0F, 0.0F);
    if ((!o.D) && (au == 0))
    {
      a(o.b(this, bs.aR().b(4.0D, 2.0D, 4.0D).c(0.0D, -2.0D, 0.0D)));
      a(o.b(this, bt.aR().b(4.0D, 2.0D, 4.0D).c(0.0D, -2.0D, 0.0D)));
      b(o.b(this, bn.aR().b(1.0D, 1.0D, 1.0D)));
    }
    double[] ☃ = b(5, 1.0F);
    
    double[] ☃ = b(0, 1.0F);
    float ☃ = ns.a(y * 3.1415927F / 180.0F - bb * 0.01F);
    float ☃ = ns.b(y * 3.1415927F / 180.0F - bb * 0.01F);
    bn.t_();
    bn.b(s + ☃ * 5.5F * ☃, t + (☃[1] - ☃[1]) * 1.0D + ☃ * 5.5F, u - ☃ * 5.5F * ☃, 0.0F, 0.0F);
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      ue ☃ = null;
      if (☃ == 0) {
        ☃ = bp;
      }
      if (☃ == 1) {
        ☃ = bq;
      }
      if (☃ == 2) {
        ☃ = br;
      }
      double[] ☃ = b(12 + ☃ * 2, 1.0F);
      
      float ☃ = y * 3.1415927F / 180.0F + b(☃[0] - ☃[0]) * 3.1415927F / 180.0F * 1.0F;
      float ☃ = ns.a(☃);
      float ☃ = ns.b(☃);
      
      float ☃ = 1.5F;
      float ☃ = (☃ + 1) * 2.0F;
      ☃.t_();
      ☃.b(s - (☃ * ☃ + ☃ * ☃) * ☃, t + (☃[1] - ☃[1]) * 1.0D - (☃ + ☃) * ☃ + 1.5D, u + (☃ * ☃ + ☃ * ☃) * ☃, 0.0F, 0.0F);
    }
    if (!o.D) {
      bx = (b(bn.aR()) | b(bo.aR()));
    }
  }
  
  private void n()
  {
    if (bz != null) {
      if (bz.I)
      {
        if (!o.D) {
          a(bn, ow.a(null), 10.0F);
        }
        bz = null;
      }
      else if ((W % 10 == 0) && 
        (bn() < bu()))
      {
        i(bn() + 1.0F);
      }
    }
    if (V.nextInt(10) == 0)
    {
      float ☃ = 32.0F;
      List<uf> ☃ = o.a(uf.class, aR().b(☃, ☃, ☃));
      
      uf ☃ = null;
      double ☃ = Double.MAX_VALUE;
      for (uf ☃ : ☃)
      {
        double ☃ = ☃.h(this);
        if (☃ < ☃)
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
      bz = ☃;
    }
  }
  
  private void a(List<pk> ☃)
  {
    double ☃ = (bo.aR().a + bo.aR().d) / 2.0D;
    double ☃ = (bo.aR().c + bo.aR().f) / 2.0D;
    for (pk ☃ : ☃) {
      if ((☃ instanceof pr))
      {
        double ☃ = s - ☃;
        double ☃ = u - ☃;
        double ☃ = ☃ * ☃ + ☃ * ☃;
        ☃.g(☃ / ☃ * 4.0D, 0.20000000298023224D, ☃ / ☃ * 4.0D);
      }
    }
  }
  
  private void b(List<pk> ☃)
  {
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if ((☃ instanceof pr))
      {
        ☃.a(ow.a(this), 10.0F);
        a(this, ☃);
      }
    }
  }
  
  private void cf()
  {
    bw = false;
    List<wn> ☃ = Lists.newArrayList(o.j);
    Iterator<wn> ☃ = ☃.iterator();
    while (☃.hasNext()) {
      if (((wn)☃.next()).v()) {
        ☃.remove();
      }
    }
    if ((V.nextInt(2) == 0) && (!☃.isEmpty()))
    {
      bA = ((pk)☃.get(V.nextInt(☃.size())));
    }
    else
    {
      boolean ☃;
      do
      {
        a = 0.0D;
        b = (70.0F + V.nextFloat() * 50.0F);
        c = 0.0D;
        a += V.nextFloat() * 120.0F - 60.0F;
        c += V.nextFloat() * 120.0F - 60.0F;
        double ☃ = s - a;
        double ☃ = t - b;
        double ☃ = u - c;
        ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 100.0D;
      } while (!☃);
      bA = null;
    }
  }
  
  private float b(double ☃)
  {
    return (float)ns.g(☃);
  }
  
  private boolean b(aug ☃)
  {
    int ☃ = ns.c(a);
    int ☃ = ns.c(b);
    int ☃ = ns.c(c);
    int ☃ = ns.c(d);
    int ☃ = ns.c(e);
    int ☃ = ns.c(f);
    boolean ☃ = false;
    boolean ☃ = false;
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = new cj(☃, ☃, ☃);
          afh ☃ = o.p(☃).c();
          if (☃.t() != arm.a) {
            if ((☃ == afi.cv) || (☃ == afi.Z) || (☃ == afi.bH) || (☃ == afi.h) || (☃ == afi.bX) || (!o.Q().b("mobGriefing"))) {
              ☃ = true;
            } else {
              ☃ = (o.g(☃)) || (☃);
            }
          }
        }
      }
    }
    if (☃)
    {
      double ☃ = a + (d - a) * V.nextFloat();
      double ☃ = b + (e - b) * V.nextFloat();
      double ☃ = c + (f - c) * V.nextFloat();
      o.a(cy.b, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    return ☃;
  }
  
  public boolean a(ue ☃, ow ☃, float ☃)
  {
    if (☃ != bn) {
      ☃ = ☃ / 4.0F + 1.0F;
    }
    float ☃ = y * 3.1415927F / 180.0F;
    float ☃ = ns.a(☃);
    float ☃ = ns.b(☃);
    
    a = (s + ☃ * 5.0F + (V.nextFloat() - 0.5F) * 2.0F);
    b = (t + V.nextFloat() * 3.0F + 1.0D);
    c = (u - ☃ * 5.0F + (V.nextFloat() - 0.5F) * 2.0F);
    bA = null;
    if (((☃.j() instanceof wn)) || (☃.c())) {
      e(☃, ☃);
    }
    return true;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (((☃ instanceof ox)) && (((ox)☃).w())) {
      e(☃, ☃);
    }
    return false;
  }
  
  protected boolean e(ow ☃, float ☃)
  {
    return super.a(☃, ☃);
  }
  
  public void G()
  {
    J();
  }
  
  protected void aZ()
  {
    by += 1;
    if ((by >= 180) && (by <= 200))
    {
      float ☃ = (V.nextFloat() - 0.5F) * 8.0F;
      float ☃ = (V.nextFloat() - 0.5F) * 4.0F;
      float ☃ = (V.nextFloat() - 0.5F) * 8.0F;
      o.a(cy.c, s + ☃, t + 2.0D + ☃, u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    boolean ☃ = o.Q().b("doMobLoot");
    if (!o.D)
    {
      if ((by > 150) && (by % 5 == 0) && (☃))
      {
        int ☃ = 1000;
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          o.d(new pp(o, s, t, u, ☃));
        }
      }
      if (by == 1) {
        o.a(1018, new cj(this), 0);
      }
    }
    d(0.0D, 0.10000000149011612D, 0.0D);
    aI = (y += 20.0F);
    if ((by == 200) && (!o.D))
    {
      if (☃)
      {
        int ☃ = 2000;
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          o.d(new pp(o, s, t, u, ☃));
        }
      }
      a(new cj(s, 64.0D, u));
      J();
    }
  }
  
  private void a(cj ☃)
  {
    int ☃ = 4;
    double ☃ = 12.25D;
    double ☃ = 6.25D;
    for (int ☃ = -1; ☃ <= 32; ☃++) {
      for (int ☃ = -4; ☃ <= 4; ☃++) {
        for (int ☃ = -4; ☃ <= 4; ☃++)
        {
          double ☃ = ☃ * ☃ + ☃ * ☃;
          if (☃ <= 12.25D)
          {
            cj ☃ = ☃.a(☃, ☃, ☃);
            if (☃ < 0)
            {
              if (☃ <= 6.25D) {
                o.a(☃, afi.h.Q());
              }
            }
            else if (☃ > 0) {
              o.a(☃, afi.a.Q());
            } else if (☃ > 6.25D) {
              o.a(☃, afi.h.Q());
            } else {
              o.a(☃, afi.bF.Q());
            }
          }
        }
      }
    }
    o.a(☃, afi.h.Q());
    o.a(☃.a(), afi.h.Q());
    cj ☃ = ☃.b(2);
    o.a(☃, afi.h.Q());
    o.a(☃.e(), afi.aa.Q().a(akf.a, cq.f));
    o.a(☃.f(), afi.aa.Q().a(akf.a, cq.e));
    o.a(☃.c(), afi.aa.Q().a(akf.a, cq.d));
    o.a(☃.d(), afi.aa.Q().a(akf.a, cq.c));
    o.a(☃.b(3), afi.h.Q());
    o.a(☃.b(4), afi.bI.Q());
  }
  
  protected void D() {}
  
  public pk[] aB()
  {
    return bm;
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public adm a()
  {
    return o;
  }
  
  protected String z()
  {
    return "mob.enderdragon.growl";
  }
  
  protected String bo()
  {
    return "mob.enderdragon.hit";
  }
  
  protected float bB()
  {
    return 5.0F;
  }
}
