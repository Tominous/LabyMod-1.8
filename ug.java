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
    
    this.bm = new ue[] { this.bn = new ue(this, "head", 6.0F, 6.0F), this.bo = new ue(this, "body", 8.0F, 8.0F), this.bp = new ue(this, "tail", 4.0F, 4.0F), this.bq = new ue(this, "tail", 4.0F, 4.0F), this.br = new ue(this, "tail", 4.0F, 4.0F), this.bs = new ue(this, "wing", 4.0F, 4.0F), this.bt = new ue(this, "wing", 4.0F, 4.0F) };
    
    i(bu());
    
    a(16.0F, 8.0F);
    
    this.T = true;
    this.ab = true;
    
    this.b = 100.0D;
    
    this.ah = true;
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
    
    int ☃ = this.bl - ☃ * 1 & 0x3F;
    int ☃ = this.bl - ☃ * 1 - 1 & 0x3F;
    double[] ☃ = new double[3];
    double ☃ = this.bk[☃][0];
    double ☃ = ns.g(this.bk[☃][0] - ☃);
    ☃[0] = (☃ + ☃ * ☃);
    
    ☃ = this.bk[☃][1];
    ☃ = this.bk[☃][1] - ☃;
    
    ☃[1] = (☃ + ☃ * ☃);
    ☃[2] = (this.bk[☃][2] + (this.bk[☃][2] - this.bk[☃][2]) * ☃);
    return ☃;
  }
  
  public void m()
  {
    if (this.o.D)
    {
      float ☃ = ns.b(this.bv * 3.1415927F * 2.0F);
      float ☃ = ns.b(this.bu * 3.1415927F * 2.0F);
      if ((☃ <= -0.3F) && (☃ >= -0.3F) && (!R())) {
        this.o.a(this.s, this.t, this.u, "mob.enderdragon.wings", 5.0F, 0.8F + this.V.nextFloat() * 0.3F, false);
      }
    }
    this.bu = this.bv;
    if (bn() <= 0.0F)
    {
      float ☃ = (this.V.nextFloat() - 0.5F) * 8.0F;
      float ☃ = (this.V.nextFloat() - 0.5F) * 4.0F;
      float ☃ = (this.V.nextFloat() - 0.5F) * 8.0F;
      this.o.a(cy.b, this.s + ☃, this.t + 2.0D + ☃, this.u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      return;
    }
    n();
    
    float ☃ = 0.2F / (ns.a(this.v * this.v + this.x * this.x) * 10.0F + 1.0F);
    ☃ *= (float)Math.pow(2.0D, this.w);
    if (this.bx) {
      this.bv += ☃ * 0.5F;
    } else {
      this.bv += ☃;
    }
    this.y = ns.g(this.y);
    if (ce())
    {
      this.bv = 0.5F;
      return;
    }
    if (this.bl < 0) {
      for (int ☃ = 0; ☃ < this.bk.length; ☃++)
      {
        this.bk[☃][0] = this.y;
        this.bk[☃][1] = this.t;
      }
    }
    if (++this.bl == this.bk.length) {
      this.bl = 0;
    }
    this.bk[this.bl][0] = this.y;
    this.bk[this.bl][1] = this.t;
    if (this.o.D)
    {
      if (this.bc > 0)
      {
        double ☃ = this.s + (this.bd - this.s) / this.bc;
        double ☃ = this.t + (this.be - this.t) / this.bc;
        double ☃ = this.u + (this.bf - this.u) / this.bc;
        
        double ☃ = ns.g(this.bg - this.y);
        
        this.y = ((float)(this.y + ☃ / this.bc));
        this.z = ((float)(this.z + (this.bh - this.z) / this.bc));
        
        this.bc -= 1;
        b(☃, ☃, ☃);
        b(this.y, this.z);
      }
    }
    else
    {
      double ☃ = this.a - this.s;
      double ☃ = this.b - this.t;
      double ☃ = this.c - this.u;
      
      double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
      if (this.bA != null)
      {
        this.a = this.bA.s;
        this.c = this.bA.u;
        
        double ☃ = this.a - this.s;
        double ☃ = this.c - this.u;
        double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃);
        double ☃ = 0.4000000059604645D + ☃ / 80.0D - 1.0D;
        if (☃ > 10.0D) {
          ☃ = 10.0D;
        }
        this.b = (this.bA.aR().b + ☃);
      }
      else
      {
        this.a += this.V.nextGaussian() * 2.0D;
        this.c += this.V.nextGaussian() * 2.0D;
      }
      if ((this.bw) || (☃ < 100.0D) || (☃ > 22500.0D) || (this.D) || (this.E)) {
        cf();
      }
      ☃ /= ns.a(☃ * ☃ + ☃ * ☃);
      float ☃ = 0.6F;
      ☃ = ns.a(☃, -☃, ☃);
      this.w += ☃ * 0.10000000149011612D;
      this.y = ns.g(this.y);
      
      double ☃ = 180.0D - ns.b(☃, ☃) * 180.0D / 3.1415927410125732D;
      double ☃ = ns.g(☃ - this.y);
      if (☃ > 50.0D) {
        ☃ = 50.0D;
      }
      if (☃ < -50.0D) {
        ☃ = -50.0D;
      }
      aui ☃ = new aui(this.a - this.s, this.b - this.t, this.c - this.u).a();
      double ☃ = -ns.b(this.y * 3.1415927F / 180.0F);
      aui ☃ = new aui(ns.a(this.y * 3.1415927F / 180.0F), this.w, ☃).a();
      float ☃ = ((float)☃.b(☃) + 0.5F) / 1.5F;
      if (☃ < 0.0F) {
        ☃ = 0.0F;
      }
      this.bb *= 0.8F;
      
      float ☃ = ns.a(this.v * this.v + this.x * this.x) * 1.0F + 1.0F;
      double ☃ = Math.sqrt(this.v * this.v + this.x * this.x) * 1.0D + 1.0D;
      if (☃ > 40.0D) {
        ☃ = 40.0D;
      }
      this.bb = ((float)(this.bb + ☃ * (0.699999988079071D / ☃ / ☃)));
      this.y += this.bb * 0.1F;
      
      float ☃ = (float)(2.0D / (☃ + 1.0D));
      float ☃ = 0.06F;
      a(0.0F, -1.0F, ☃ * (☃ * ☃ + (1.0F - ☃)));
      if (this.bx) {
        d(this.v * 0.800000011920929D, this.w * 0.800000011920929D, this.x * 0.800000011920929D);
      } else {
        d(this.v, this.w, this.x);
      }
      aui ☃ = new aui(this.v, this.w, this.x).a();
      float ☃ = ((float)☃.b(☃) + 1.0F) / 2.0F;
      ☃ = 0.8F + 0.15F * ☃;
      
      this.v *= ☃;
      this.x *= ☃;
      this.w *= 0.9100000262260437D;
    }
    this.aI = this.y;
    
    this.bn.J = (this.bn.K = 3.0F);
    this.bp.J = (this.bp.K = 2.0F);
    this.bq.J = (this.bq.K = 2.0F);
    this.br.J = (this.br.K = 2.0F);
    this.bo.K = 3.0F;
    this.bo.J = 5.0F;
    this.bs.K = 2.0F;
    this.bs.J = 4.0F;
    this.bt.K = 3.0F;
    this.bt.J = 4.0F;
    
    float ☃ = (float)(b(5, 1.0F)[1] - b(10, 1.0F)[1]) * 10.0F / 180.0F * 3.1415927F;
    float ☃ = ns.b(☃);
    float ☃ = -ns.a(☃);
    
    float ☃ = this.y * 3.1415927F / 180.0F;
    float ☃ = ns.a(☃);
    float ☃ = ns.b(☃);
    
    this.bo.t_();
    this.bo.b(this.s + ☃ * 0.5F, this.t, this.u - ☃ * 0.5F, 0.0F, 0.0F);
    this.bs.t_();
    this.bs.b(this.s + ☃ * 4.5F, this.t + 2.0D, this.u + ☃ * 4.5F, 0.0F, 0.0F);
    this.bt.t_();
    this.bt.b(this.s - ☃ * 4.5F, this.t + 2.0D, this.u - ☃ * 4.5F, 0.0F, 0.0F);
    if ((!this.o.D) && (this.au == 0))
    {
      a(this.o.b(this, this.bs.aR().b(4.0D, 2.0D, 4.0D).c(0.0D, -2.0D, 0.0D)));
      a(this.o.b(this, this.bt.aR().b(4.0D, 2.0D, 4.0D).c(0.0D, -2.0D, 0.0D)));
      b(this.o.b(this, this.bn.aR().b(1.0D, 1.0D, 1.0D)));
    }
    double[] ☃ = b(5, 1.0F);
    
    double[] ☃ = b(0, 1.0F);
    float ☃ = ns.a(this.y * 3.1415927F / 180.0F - this.bb * 0.01F);
    float ☃ = ns.b(this.y * 3.1415927F / 180.0F - this.bb * 0.01F);
    this.bn.t_();
    this.bn.b(this.s + ☃ * 5.5F * ☃, this.t + (☃[1] - ☃[1]) * 1.0D + ☃ * 5.5F, this.u - ☃ * 5.5F * ☃, 0.0F, 0.0F);
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      ue ☃ = null;
      if (☃ == 0) {
        ☃ = this.bp;
      }
      if (☃ == 1) {
        ☃ = this.bq;
      }
      if (☃ == 2) {
        ☃ = this.br;
      }
      double[] ☃ = b(12 + ☃ * 2, 1.0F);
      
      float ☃ = this.y * 3.1415927F / 180.0F + b(☃[0] - ☃[0]) * 3.1415927F / 180.0F * 1.0F;
      float ☃ = ns.a(☃);
      float ☃ = ns.b(☃);
      
      float ☃ = 1.5F;
      float ☃ = (☃ + 1) * 2.0F;
      ☃.t_();
      ☃.b(this.s - (☃ * ☃ + ☃ * ☃) * ☃, this.t + (☃[1] - ☃[1]) * 1.0D - (☃ + ☃) * ☃ + 1.5D, this.u + (☃ * ☃ + ☃ * ☃) * ☃, 0.0F, 0.0F);
    }
    if (!this.o.D) {
      this.bx = (b(this.bn.aR()) | b(this.bo.aR()));
    }
  }
  
  private void n()
  {
    if (this.bz != null) {
      if (this.bz.I)
      {
        if (!this.o.D) {
          a(this.bn, ow.a(null), 10.0F);
        }
        this.bz = null;
      }
      else if ((this.W % 10 == 0) && 
        (bn() < bu()))
      {
        i(bn() + 1.0F);
      }
    }
    if (this.V.nextInt(10) == 0)
    {
      float ☃ = 32.0F;
      List<uf> ☃ = this.o.a(uf.class, aR().b(☃, ☃, ☃));
      
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
      this.bz = ☃;
    }
  }
  
  private void a(List<pk> ☃)
  {
    double ☃ = (this.bo.aR().a + this.bo.aR().d) / 2.0D;
    double ☃ = (this.bo.aR().c + this.bo.aR().f) / 2.0D;
    for (pk ☃ : ☃) {
      if ((☃ instanceof pr))
      {
        double ☃ = ☃.s - ☃;
        double ☃ = ☃.u - ☃;
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
    this.bw = false;
    List<wn> ☃ = Lists.newArrayList(this.o.j);
    Iterator<wn> ☃ = ☃.iterator();
    while (☃.hasNext()) {
      if (((wn)☃.next()).v()) {
        ☃.remove();
      }
    }
    if ((this.V.nextInt(2) == 0) && (!☃.isEmpty()))
    {
      this.bA = ((pk)☃.get(this.V.nextInt(☃.size())));
    }
    else
    {
      boolean ☃;
      do
      {
        this.a = 0.0D;
        this.b = (70.0F + this.V.nextFloat() * 50.0F);
        this.c = 0.0D;
        this.a += this.V.nextFloat() * 120.0F - 60.0F;
        this.c += this.V.nextFloat() * 120.0F - 60.0F;
        double ☃ = this.s - this.a;
        double ☃ = this.t - this.b;
        double ☃ = this.u - this.c;
        ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃ > 100.0D;
      } while (!☃);
      this.bA = null;
    }
  }
  
  private float b(double ☃)
  {
    return (float)ns.g(☃);
  }
  
  private boolean b(aug ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.d);
    int ☃ = ns.c(☃.e);
    int ☃ = ns.c(☃.f);
    boolean ☃ = false;
    boolean ☃ = false;
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          cj ☃ = new cj(☃, ☃, ☃);
          afh ☃ = this.o.p(☃).c();
          if (☃.t() != arm.a) {
            if ((☃ == afi.cv) || (☃ == afi.Z) || (☃ == afi.bH) || (☃ == afi.h) || (☃ == afi.bX) || (!this.o.Q().b("mobGriefing"))) {
              ☃ = true;
            } else {
              ☃ = (this.o.g(☃)) || (☃);
            }
          }
        }
      }
    }
    if (☃)
    {
      double ☃ = ☃.a + (☃.d - ☃.a) * this.V.nextFloat();
      double ☃ = ☃.b + (☃.e - ☃.b) * this.V.nextFloat();
      double ☃ = ☃.c + (☃.f - ☃.c) * this.V.nextFloat();
      this.o.a(cy.b, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    return ☃;
  }
  
  public boolean a(ue ☃, ow ☃, float ☃)
  {
    if (☃ != this.bn) {
      ☃ = ☃ / 4.0F + 1.0F;
    }
    float ☃ = this.y * 3.1415927F / 180.0F;
    float ☃ = ns.a(☃);
    float ☃ = ns.b(☃);
    
    this.a = (this.s + ☃ * 5.0F + (this.V.nextFloat() - 0.5F) * 2.0F);
    this.b = (this.t + this.V.nextFloat() * 3.0F + 1.0D);
    this.c = (this.u - ☃ * 5.0F + (this.V.nextFloat() - 0.5F) * 2.0F);
    this.bA = null;
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
    this.by += 1;
    if ((this.by >= 180) && (this.by <= 200))
    {
      float ☃ = (this.V.nextFloat() - 0.5F) * 8.0F;
      float ☃ = (this.V.nextFloat() - 0.5F) * 4.0F;
      float ☃ = (this.V.nextFloat() - 0.5F) * 8.0F;
      this.o.a(cy.c, this.s + ☃, this.t + 2.0D + ☃, this.u + ☃, 0.0D, 0.0D, 0.0D, new int[0]);
    }
    boolean ☃ = this.o.Q().b("doMobLoot");
    if (!this.o.D)
    {
      if ((this.by > 150) && (this.by % 5 == 0) && (☃))
      {
        int ☃ = 1000;
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          this.o.d(new pp(this.o, this.s, this.t, this.u, ☃));
        }
      }
      if (this.by == 1) {
        this.o.a(1018, new cj(this), 0);
      }
    }
    d(0.0D, 0.10000000149011612D, 0.0D);
    this.aI = (this.y += 20.0F);
    if ((this.by == 200) && (!this.o.D))
    {
      if (☃)
      {
        int ☃ = 2000;
        while (☃ > 0)
        {
          int ☃ = pp.a(☃);
          ☃ -= ☃;
          this.o.d(new pp(this.o, this.s, this.t, this.u, ☃));
        }
      }
      a(new cj(this.s, 64.0D, this.u));
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
                this.o.a(☃, afi.h.Q());
              }
            }
            else if (☃ > 0) {
              this.o.a(☃, afi.a.Q());
            } else if (☃ > 6.25D) {
              this.o.a(☃, afi.h.Q());
            } else {
              this.o.a(☃, afi.bF.Q());
            }
          }
        }
      }
    }
    this.o.a(☃, afi.h.Q());
    this.o.a(☃.a(), afi.h.Q());
    cj ☃ = ☃.b(2);
    this.o.a(☃, afi.h.Q());
    this.o.a(☃.e(), afi.aa.Q().a(akf.a, cq.f));
    this.o.a(☃.f(), afi.aa.Q().a(akf.a, cq.e));
    this.o.a(☃.c(), afi.aa.Q().a(akf.a, cq.d));
    this.o.a(☃.d(), afi.aa.Q().a(akf.a, cq.c));
    this.o.a(☃.b(3), afi.h.Q());
    this.o.a(☃.b(4), afi.bI.Q());
  }
  
  protected void D() {}
  
  public pk[] aB()
  {
    return this.bm;
  }
  
  public boolean ad()
  {
    return false;
  }
  
  public adm a()
  {
    return this.o;
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
