import com.google.common.base.Predicate;
import java.util.List;
import java.util.Random;
import java.util.UUID;

public class tp
  extends tm
  implements oh
{
  private static final Predicate<pk> bs = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return ((☃ instanceof tp)) && (((tp)☃).cA());
    }
  };
  private static final qb bt = new qj(null, "horse.jumpStrength", 0.7D, 0.0D, 2.0D).a("Jump Strength").a(true);
  private static final String[] bu = { null, "textures/entity/horse/armor/horse_armor_iron.png", "textures/entity/horse/armor/horse_armor_gold.png", "textures/entity/horse/armor/horse_armor_diamond.png" };
  private static final String[] bv = { "", "meo", "goo", "dio" };
  private static final int[] bw = { 0, 5, 7, 11 };
  private static final String[] bx = { "textures/entity/horse/horse_white.png", "textures/entity/horse/horse_creamy.png", "textures/entity/horse/horse_chestnut.png", "textures/entity/horse/horse_brown.png", "textures/entity/horse/horse_black.png", "textures/entity/horse/horse_gray.png", "textures/entity/horse/horse_darkbrown.png" };
  private static final String[] by = { "hwh", "hcr", "hch", "hbr", "hbl", "hgr", "hdb" };
  private static final String[] bz = { null, "textures/entity/horse/horse_markings_white.png", "textures/entity/horse/horse_markings_whitefield.png", "textures/entity/horse/horse_markings_whitedots.png", "textures/entity/horse/horse_markings_blackdots.png" };
  private static final String[] bA = { "", "wo_", "wmo", "wdo", "bdo" };
  private int bB;
  private int bC;
  private int bD;
  public int bm;
  public int bo;
  protected boolean bp;
  private xj bE;
  private boolean bF;
  protected int bq;
  protected float br;
  private boolean bG;
  private float bH;
  private float bI;
  private float bJ;
  private float bK;
  private float bL;
  private float bM;
  private int bN;
  private String bO;
  
  public tp(adm ☃)
  {
    super(☃);
    a(1.4F, 1.6F);
    ab = false;
    o(false);
    
    ((sv)s()).a(true);
    i.a(0, new ra(this));
    i.a(1, new rv(this, 1.2D));
    i.a(1, new sd(this, 1.2D));
    i.a(2, new qv(this, 1.0D));
    i.a(4, new rc(this, 1.0D));
    i.a(6, new rz(this, 0.7D));
    i.a(7, new ri(this, wn.class, 6.0F));
    i.a(8, new ry(this));
    
    da();
  }
  
  protected void h()
  {
    super.h();
    ac.a(16, Integer.valueOf(0));
    ac.a(19, Byte.valueOf((byte)0));
    ac.a(20, Integer.valueOf(0));
    ac.a(21, String.valueOf(""));
    ac.a(22, Integer.valueOf(0));
  }
  
  public void r(int ☃)
  {
    ac.b(19, Byte.valueOf((byte)☃));
    dc();
  }
  
  public int cl()
  {
    return ac.a(19);
  }
  
  public void s(int ☃)
  {
    ac.b(20, Integer.valueOf(☃));
    dc();
  }
  
  public int cm()
  {
    return ac.c(20);
  }
  
  public String e_()
  {
    if (l_()) {
      return aM();
    }
    int ☃ = cl();
    switch (☃)
    {
    case 0: 
    default: 
      return di.a("entity.horse.name");
    case 1: 
      return di.a("entity.donkey.name");
    case 2: 
      return di.a("entity.mule.name");
    case 4: 
      return di.a("entity.skeletonhorse.name");
    }
    return di.a("entity.zombiehorse.name");
  }
  
  private boolean w(int ☃)
  {
    return (ac.c(16) & ☃) != 0;
  }
  
  private void c(int ☃, boolean ☃)
  {
    int ☃ = ac.c(16);
    if (☃) {
      ac.b(16, Integer.valueOf(☃ | ☃));
    } else {
      ac.b(16, Integer.valueOf(☃ & (☃ ^ 0xFFFFFFFF)));
    }
  }
  
  public boolean cn()
  {
    return !j_();
  }
  
  public boolean co()
  {
    return w(2);
  }
  
  public boolean cp()
  {
    return cn();
  }
  
  public String ct()
  {
    return ac.e(21);
  }
  
  public void b(String ☃)
  {
    ac.b(21, ☃);
  }
  
  public float cu()
  {
    return 0.5F;
  }
  
  public void a(boolean ☃)
  {
    if (☃) {
      a(cu());
    } else {
      a(1.0F);
    }
  }
  
  public boolean cv()
  {
    return bp;
  }
  
  public void l(boolean ☃)
  {
    c(2, ☃);
  }
  
  public void m(boolean ☃)
  {
    bp = ☃;
  }
  
  public boolean cb()
  {
    return (!cR()) && (super.cb());
  }
  
  protected void o(float ☃)
  {
    if ((☃ > 6.0F) && (cy())) {
      r(false);
    }
  }
  
  public boolean cw()
  {
    return w(8);
  }
  
  public int cx()
  {
    return ac.c(22);
  }
  
  private int f(zx ☃)
  {
    if (☃ == null) {
      return 0;
    }
    zw ☃ = ☃.b();
    if (☃ == zy.ck) {
      return 1;
    }
    if (☃ == zy.cl) {
      return 2;
    }
    if (☃ == zy.cm) {
      return 3;
    }
    return 0;
  }
  
  public boolean cy()
  {
    return w(32);
  }
  
  public boolean cz()
  {
    return w(64);
  }
  
  public boolean cA()
  {
    return w(16);
  }
  
  public boolean cB()
  {
    return bF;
  }
  
  public void e(zx ☃)
  {
    ac.b(22, Integer.valueOf(f(☃)));
    dc();
  }
  
  public void n(boolean ☃)
  {
    c(16, ☃);
  }
  
  public void o(boolean ☃)
  {
    c(8, ☃);
  }
  
  public void p(boolean ☃)
  {
    bF = ☃;
  }
  
  public void q(boolean ☃)
  {
    c(4, ☃);
  }
  
  public int cC()
  {
    return bq;
  }
  
  public void t(int ☃)
  {
    bq = ☃;
  }
  
  public int u(int ☃)
  {
    int ☃ = ns.a(cC() + ☃, 0, cI());
    
    t(☃);
    return ☃;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    pk ☃ = ☃.j();
    if ((l != null) && (l.equals(☃))) {
      return false;
    }
    return super.a(☃, ☃);
  }
  
  public int br()
  {
    return bw[cx()];
  }
  
  public boolean ae()
  {
    return l == null;
  }
  
  public boolean cD()
  {
    int ☃ = ns.c(s);
    int ☃ = ns.c(u);
    
    o.b(new cj(☃, 0, ☃));
    return true;
  }
  
  public void cE()
  {
    if ((o.D) || (!cw())) {
      return;
    }
    a(zw.a(afi.ae), 1);
    o(false);
  }
  
  private void cY()
  {
    df();
    if (!R()) {
      o.a(this, "eating", 1.0F, 1.0F + (V.nextFloat() - V.nextFloat()) * 0.2F);
    }
  }
  
  public void e(float ☃, float ☃)
  {
    if (☃ > 1.0F) {
      a("mob.horse.land", 0.4F, 1.0F);
    }
    int ☃ = ns.f((☃ * 0.5F - 3.0F) * ☃);
    if (☃ <= 0) {
      return;
    }
    a(ow.i, ☃);
    if (l != null) {
      l.a(ow.i, ☃);
    }
    afh ☃ = o.p(new cj(s, t - 0.2D - A, u)).c();
    if ((☃.t() != arm.a) && (!R()))
    {
      afh.b ☃ = H;
      o.a(this, ☃.c(), ☃.d() * 0.5F, ☃.e() * 0.75F);
    }
  }
  
  private int cZ()
  {
    int ☃ = cl();
    if ((cw()) && ((☃ == 1) || (☃ == 2))) {
      return 17;
    }
    return 2;
  }
  
  private void da()
  {
    xj ☃ = bE;
    
    bE = new xj("HorseChest", cZ());
    bE.a(e_());
    if (☃ != null)
    {
      ☃.b(this);
      
      int ☃ = Math.min(☃.o_(), bE.o_());
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        zx ☃ = ☃.a(☃);
        if (☃ != null) {
          bE.a(☃, ☃.k());
        }
      }
    }
    bE.a(this);
    db();
  }
  
  private void db()
  {
    if (!o.D)
    {
      q(bE.a(0) != null);
      if (cO()) {
        e(bE.a(1));
      }
    }
  }
  
  public void a(oq ☃)
  {
    int ☃ = cx();
    boolean ☃ = cG();
    db();
    if (W > 20)
    {
      if ((☃ == 0) && (☃ != cx())) {
        a("mob.horse.armor", 0.5F, 1.0F);
      } else if (☃ != cx()) {
        a("mob.horse.armor", 0.5F, 1.0F);
      }
      if ((!☃) && (cG())) {
        a("mob.horse.leather", 0.5F, 1.0F);
      }
    }
  }
  
  public boolean bR()
  {
    cD();
    return super.bR();
  }
  
  protected tp a(pk ☃, double ☃)
  {
    double ☃ = Double.MAX_VALUE;
    
    pk ☃ = null;
    List<pk> ☃ = o.a(☃, ☃.aR().a(☃, ☃, ☃), bs);
    for (pk ☃ : ☃)
    {
      double ☃ = ☃.e(s, t, u);
      if (☃ < ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return (tp)☃;
  }
  
  public double cF()
  {
    return a(bt).e();
  }
  
  protected String bp()
  {
    df();
    int ☃ = cl();
    if (☃ == 3) {
      return "mob.horse.zombie.death";
    }
    if (☃ == 4) {
      return "mob.horse.skeleton.death";
    }
    if ((☃ == 1) || (☃ == 2)) {
      return "mob.horse.donkey.death";
    }
    return "mob.horse.death";
  }
  
  protected zw A()
  {
    boolean ☃ = V.nextInt(4) == 0;
    
    int ☃ = cl();
    if (☃ == 4) {
      return zy.aX;
    }
    if (☃ == 3)
    {
      if (☃) {
        return null;
      }
      return zy.bt;
    }
    return zy.aF;
  }
  
  protected String bo()
  {
    df();
    if (V.nextInt(3) == 0) {
      dh();
    }
    int ☃ = cl();
    if (☃ == 3) {
      return "mob.horse.zombie.hit";
    }
    if (☃ == 4) {
      return "mob.horse.skeleton.hit";
    }
    if ((☃ == 1) || (☃ == 2)) {
      return "mob.horse.donkey.hit";
    }
    return "mob.horse.hit";
  }
  
  public boolean cG()
  {
    return w(4);
  }
  
  protected String z()
  {
    df();
    if ((V.nextInt(10) == 0) && (!bD())) {
      dh();
    }
    int ☃ = cl();
    if (☃ == 3) {
      return "mob.horse.zombie.idle";
    }
    if (☃ == 4) {
      return "mob.horse.skeleton.idle";
    }
    if ((☃ == 1) || (☃ == 2)) {
      return "mob.horse.donkey.idle";
    }
    return "mob.horse.idle";
  }
  
  protected String cH()
  {
    df();
    dh();
    int ☃ = cl();
    if ((☃ == 3) || (☃ == 4)) {
      return null;
    }
    if ((☃ == 1) || (☃ == 2)) {
      return "mob.horse.donkey.angry";
    }
    return "mob.horse.angry";
  }
  
  protected void a(cj ☃, afh ☃)
  {
    afh.b ☃ = H;
    if (o.p(☃.a()).c() == afi.aH) {
      ☃ = aHH;
    }
    if (!☃.t().d())
    {
      int ☃ = cl();
      if ((l != null) && (☃ != 1) && (☃ != 2))
      {
        bN += 1;
        if ((bN > 5) && (bN % 3 == 0))
        {
          a("mob.horse.gallop", ☃.d() * 0.15F, ☃.e());
          if ((☃ == 0) && (V.nextInt(10) == 0)) {
            a("mob.horse.breathe", ☃.d() * 0.6F, ☃.e());
          }
        }
        else if (bN <= 5)
        {
          a("mob.horse.wood", ☃.d() * 0.15F, ☃.e());
        }
      }
      else if (☃ == afh.f)
      {
        a("mob.horse.wood", ☃.d() * 0.15F, ☃.e());
      }
      else
      {
        a("mob.horse.soft", ☃.d() * 0.15F, ☃.e());
      }
    }
  }
  
  protected void aX()
  {
    super.aX();
    
    by().b(bt);
    
    a(vy.a).a(53.0D);
    a(vy.d).a(0.22499999403953552D);
  }
  
  public int bV()
  {
    return 6;
  }
  
  public int cI()
  {
    return 100;
  }
  
  protected float bB()
  {
    return 0.8F;
  }
  
  public int w()
  {
    return 400;
  }
  
  public boolean cJ()
  {
    return (cl() == 0) || (cx() > 0);
  }
  
  private String[] bP = new String[3];
  private boolean bQ = false;
  
  private void dc()
  {
    bO = null;
  }
  
  public boolean cK()
  {
    return bQ;
  }
  
  private void dd()
  {
    bO = "horse/";
    bP[0] = null;
    bP[1] = null;
    bP[2] = null;
    
    int ☃ = cl();
    int ☃ = cm();
    if (☃ == 0)
    {
      int ☃ = ☃ & 0xFF;
      int ☃ = (☃ & 0xFF00) >> 8;
      if (☃ >= bx.length)
      {
        bQ = false;
        return;
      }
      bP[0] = bx[☃];
      bO += by[☃];
      if (☃ >= bz.length)
      {
        bQ = false;
        return;
      }
      bP[1] = bz[☃];
      bO += bA[☃];
    }
    else
    {
      bP[0] = "";
      bO = (bO + "_" + ☃ + "_");
    }
    int ☃ = cx();
    if (☃ >= bu.length)
    {
      bQ = false;
      return;
    }
    bP[2] = bu[☃];
    bO += bv[☃];
    bQ = true;
  }
  
  public String cL()
  {
    if (bO == null) {
      dd();
    }
    return bO;
  }
  
  public String[] cM()
  {
    if (bO == null) {
      dd();
    }
    return bP;
  }
  
  public void g(wn ☃)
  {
    if ((!o.D) && ((l == null) || (l == ☃)) && (co()))
    {
      bE.a(e_());
      ☃.a(this, bE);
    }
  }
  
  public boolean a(wn ☃)
  {
    zx ☃ = bi.h();
    if ((☃ != null) && (☃.b() == zy.bJ)) {
      return super.a(☃);
    }
    if ((!co()) && 
      (cR())) {
      return false;
    }
    if ((co()) && (cn()) && (☃.av()))
    {
      g(☃);
      return true;
    }
    if ((cp()) && (l != null)) {
      return super.a(☃);
    }
    if (☃ != null)
    {
      boolean ☃ = false;
      if (cO())
      {
        int ☃ = -1;
        if (☃.b() == zy.ck) {
          ☃ = 1;
        } else if (☃.b() == zy.cl) {
          ☃ = 2;
        } else if (☃.b() == zy.cm) {
          ☃ = 3;
        }
        if (☃ >= 0)
        {
          if (!co())
          {
            cW();
            return true;
          }
          g(☃);
          return true;
        }
      }
      if ((!☃) && (!cR()))
      {
        float ☃ = 0.0F;
        int ☃ = 0;
        int ☃ = 0;
        if (☃.b() == zy.O)
        {
          ☃ = 2.0F;
          ☃ = 20;
          ☃ = 3;
        }
        else if (☃.b() == zy.aY)
        {
          ☃ = 1.0F;
          ☃ = 30;
          ☃ = 3;
        }
        else if (afh.a(☃.b()) == afi.cx)
        {
          ☃ = 20.0F;
          ☃ = 180;
        }
        else if (☃.b() == zy.e)
        {
          ☃ = 3.0F;
          ☃ = 60;
          ☃ = 3;
        }
        else if (☃.b() == zy.bW)
        {
          ☃ = 4.0F;
          ☃ = 60;
          ☃ = 5;
          if ((co()) && (l() == 0))
          {
            ☃ = true;
            c(☃);
          }
        }
        else if (☃.b() == zy.ao)
        {
          ☃ = 10.0F;
          ☃ = 240;
          ☃ = 10;
          if ((co()) && (l() == 0))
          {
            ☃ = true;
            c(☃);
          }
        }
        if ((bn() < bu()) && (☃ > 0.0F))
        {
          h(☃);
          ☃ = true;
        }
        if ((!cn()) && (☃ > 0))
        {
          a(☃);
          ☃ = true;
        }
        if ((☃ > 0) && ((☃) || (!co())) && (☃ < cI()))
        {
          ☃ = true;
          u(☃);
        }
        if (☃) {
          cY();
        }
      }
      if ((!co()) && (!☃))
      {
        if ((☃ != null) && (☃.a(☃, this))) {
          return true;
        }
        cW();
        return true;
      }
      if ((!☃) && (cP()) && (!cw()) && 
        (☃.b() == zw.a(afi.ae)))
      {
        o(true);
        a("mob.chickenplop", 1.0F, (V.nextFloat() - V.nextFloat()) * 0.2F + 1.0F);
        ☃ = true;
        da();
      }
      if ((!☃) && (cp()) && (!cG()) && 
        (☃.b() == zy.aA))
      {
        g(☃);
        return true;
      }
      if (☃)
      {
        if (!bA.d) {
          if (--b == 0) {
            bi.a(bi.c, null);
          }
        }
        return true;
      }
    }
    if ((cp()) && (l == null))
    {
      if ((☃ != null) && (☃.a(☃, this))) {
        return true;
      }
      i(☃);
      return true;
    }
    return super.a(☃);
  }
  
  private void i(wn ☃)
  {
    y = y;
    z = z;
    r(false);
    s(false);
    if (!o.D) {
      ☃.a(this);
    }
  }
  
  public boolean cO()
  {
    return cl() == 0;
  }
  
  public boolean cP()
  {
    int ☃ = cl();
    return (☃ == 2) || (☃ == 1);
  }
  
  protected boolean bD()
  {
    if ((l != null) && (cG())) {
      return true;
    }
    return (cy()) || (cz());
  }
  
  public boolean cR()
  {
    int ☃ = cl();
    return (☃ == 3) || (☃ == 4);
  }
  
  public boolean cS()
  {
    return (cR()) || (cl() == 2);
  }
  
  public boolean d(zx ☃)
  {
    return false;
  }
  
  private void de()
  {
    bm = 1;
  }
  
  public void a(ow ☃)
  {
    super.a(☃);
    if (!o.D) {
      cX();
    }
  }
  
  public void m()
  {
    if (V.nextInt(200) == 0) {
      de();
    }
    super.m();
    if (!o.D)
    {
      if ((V.nextInt(900) == 0) && (ax == 0)) {
        h(1.0F);
      }
      if ((!cy()) && (l == null) && (V.nextInt(300) == 0) && 
        (o.p(new cj(ns.c(s), ns.c(t) - 1, ns.c(u))).c() == afi.c)) {
        r(true);
      }
      if ((cy()) && (++bB > 50))
      {
        bB = 0;
        r(false);
      }
      if ((cA()) && (!cn()) && (!cy()))
      {
        tp ☃ = a(this, 16.0D);
        if ((☃ != null) && (h(☃) > 4.0D)) {
          h.a(☃);
        }
      }
    }
  }
  
  public void t_()
  {
    super.t_();
    if ((o.D) && (ac.a()))
    {
      ac.e();
      dc();
    }
    if ((bC > 0) && (++bC > 30))
    {
      bC = 0;
      c(128, false);
    }
    if ((!o.D) && 
      (bD > 0) && (++bD > 20))
    {
      bD = 0;
      s(false);
    }
    if ((bm > 0) && (++bm > 8)) {
      bm = 0;
    }
    if (bo > 0)
    {
      bo += 1;
      if (bo > 300) {
        bo = 0;
      }
    }
    bI = bH;
    if (cy())
    {
      bH += (1.0F - bH) * 0.4F + 0.05F;
      if (bH > 1.0F) {
        bH = 1.0F;
      }
    }
    else
    {
      bH += (0.0F - bH) * 0.4F - 0.05F;
      if (bH < 0.0F) {
        bH = 0.0F;
      }
    }
    bK = bJ;
    if (cz())
    {
      bI = (bH = 0.0F);
      bJ += (1.0F - bJ) * 0.4F + 0.05F;
      if (bJ > 1.0F) {
        bJ = 1.0F;
      }
    }
    else
    {
      bG = false;
      
      bJ += (0.8F * bJ * bJ * bJ - bJ) * 0.6F - 0.05F;
      if (bJ < 0.0F) {
        bJ = 0.0F;
      }
    }
    bM = bL;
    if (w(128))
    {
      bL += (1.0F - bL) * 0.7F + 0.05F;
      if (bL > 1.0F) {
        bL = 1.0F;
      }
    }
    else
    {
      bL += (0.0F - bL) * 0.7F - 0.05F;
      if (bL < 0.0F) {
        bL = 0.0F;
      }
    }
  }
  
  private void df()
  {
    if (!o.D)
    {
      bC = 1;
      c(128, true);
    }
  }
  
  private boolean dg()
  {
    return (l == null) && (m == null) && (co()) && (cn()) && (!cS()) && (bn() >= bu()) && (cr());
  }
  
  public void f(boolean ☃)
  {
    c(32, ☃);
  }
  
  public void r(boolean ☃)
  {
    f(☃);
  }
  
  public void s(boolean ☃)
  {
    if (☃) {
      r(false);
    }
    c(64, ☃);
  }
  
  private void dh()
  {
    if (!o.D)
    {
      bD = 1;
      s(true);
    }
  }
  
  public void cW()
  {
    dh();
    String ☃ = cH();
    if (☃ != null) {
      a(☃, bB(), bC());
    }
  }
  
  public void cX()
  {
    a(this, bE);
    cE();
  }
  
  private void a(pk ☃, xj ☃)
  {
    if ((☃ == null) || (o.D)) {
      return;
    }
    for (int ☃ = 0; ☃ < ☃.o_(); ☃++)
    {
      zx ☃ = ☃.a(☃);
      if (☃ != null) {
        a(☃, 0.0F);
      }
    }
  }
  
  public boolean h(wn ☃)
  {
    b(☃.aK().toString());
    l(true);
    return true;
  }
  
  public void g(float ☃, float ☃)
  {
    if ((l == null) || (!(l instanceof pr)) || (!cG()))
    {
      S = 0.5F;
      aM = 0.02F;
      super.g(☃, ☃);
      return;
    }
    A = (y = l.y);
    z = (l.z * 0.5F);
    b(y, z);
    aK = (aI = y);
    
    ☃ = l).aZ * 0.5F;
    ☃ = l).ba;
    if (☃ <= 0.0F)
    {
      ☃ *= 0.25F;
      bN = 0;
    }
    if ((C) && (br == 0.0F) && (cz()) && (!bG))
    {
      ☃ = 0.0F;
      ☃ = 0.0F;
    }
    if ((br > 0.0F) && (!cv()) && (C))
    {
      w = (cF() * br);
      if (a(pe.j)) {
        w += (b(pe.j).c() + 1) * 0.1F;
      }
      m(true);
      ai = true;
      if (☃ > 0.0F)
      {
        float ☃ = ns.a(y * 3.1415927F / 180.0F);
        float ☃ = ns.b(y * 3.1415927F / 180.0F);
        
        v += -0.4F * ☃ * br;
        x += 0.4F * ☃ * br;
        
        a("mob.horse.jump", 0.4F, 1.0F);
      }
      br = 0.0F;
    }
    S = 1.0F;
    aM = (bI() * 0.1F);
    if (!o.D)
    {
      k((float)a(vy.d).e());
      super.g(☃, ☃);
    }
    if (C)
    {
      br = 0.0F;
      m(false);
    }
    aA = aB;
    double ☃ = s - p;
    double ☃ = u - r;
    float ☃ = ns.a(☃ * ☃ + ☃ * ☃) * 4.0F;
    if (☃ > 1.0F) {
      ☃ = 1.0F;
    }
    aB += (☃ - aB) * 0.4F;
    aC += aB;
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("EatingHaystack", cy());
    ☃.a("ChestedHorse", cw());
    ☃.a("HasReproduced", cB());
    ☃.a("Bred", cA());
    ☃.a("Type", cl());
    ☃.a("Variant", cm());
    ☃.a("Temper", cC());
    ☃.a("Tame", co());
    ☃.a("OwnerUUID", ct());
    if (cw())
    {
      du ☃ = new du();
      for (int ☃ = 2; ☃ < bE.o_(); ☃++)
      {
        zx ☃ = bE.a(☃);
        if (☃ != null)
        {
          dn ☃ = new dn();
          
          ☃.a("Slot", (byte)☃);
          
          ☃.b(☃);
          ☃.a(☃);
        }
      }
      ☃.a("Items", ☃);
    }
    if (bE.a(1) != null) {
      ☃.a("ArmorItem", bE.a(1).b(new dn()));
    }
    if (bE.a(0) != null) {
      ☃.a("SaddleItem", bE.a(0).b(new dn()));
    }
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    r(☃.n("EatingHaystack"));
    n(☃.n("Bred"));
    o(☃.n("ChestedHorse"));
    p(☃.n("HasReproduced"));
    r(☃.f("Type"));
    s(☃.f("Variant"));
    t(☃.f("Temper"));
    l(☃.n("Tame"));
    String ☃ = "";
    if (☃.b("OwnerUUID", 8))
    {
      ☃ = ☃.j("OwnerUUID");
    }
    else
    {
      String ☃ = ☃.j("Owner");
      ☃ = lw.a(☃);
    }
    if (☃.length() > 0) {
      b(☃);
    }
    qc ☃ = by().a("Speed");
    if (☃ != null) {
      a(vy.d).a(☃.b() * 0.25D);
    }
    if (cw())
    {
      du ☃ = ☃.c("Items", 10);
      da();
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        int ☃ = ☃.d("Slot") & 0xFF;
        if ((☃ >= 2) && (☃ < bE.o_())) {
          bE.a(☃, zx.a(☃));
        }
      }
    }
    if (☃.b("ArmorItem", 10))
    {
      zx ☃ = zx.a(☃.m("ArmorItem"));
      if ((☃ != null) && (a(☃.b()))) {
        bE.a(1, ☃);
      }
    }
    if (☃.b("SaddleItem", 10))
    {
      zx ☃ = zx.a(☃.m("SaddleItem"));
      if ((☃ != null) && (☃.b() == zy.aA)) {
        bE.a(0, ☃);
      }
    }
    else if (☃.n("Saddle"))
    {
      bE.a(0, new zx(zy.aA));
    }
    db();
  }
  
  public boolean a(tm ☃)
  {
    if (☃ == this) {
      return false;
    }
    if (☃.getClass() != getClass()) {
      return false;
    }
    tp ☃ = (tp)☃;
    if ((!dg()) || (!☃.dg())) {
      return false;
    }
    int ☃ = cl();
    int ☃ = ☃.cl();
    
    return (☃ == ☃) || ((☃ == 0) && (☃ == 1)) || ((☃ == 1) && (☃ == 0));
  }
  
  public ph a(ph ☃)
  {
    tp ☃ = (tp)☃;
    tp ☃ = new tp(o);
    
    int ☃ = cl();
    int ☃ = ☃.cl();
    int ☃ = 0;
    if (☃ == ☃) {
      ☃ = ☃;
    } else if (((☃ == 0) && (☃ == 1)) || ((☃ == 1) && (☃ == 0))) {
      ☃ = 2;
    }
    if (☃ == 0)
    {
      int ☃ = V.nextInt(9);
      int ☃;
      int ☃;
      if (☃ < 4)
      {
        ☃ = cm() & 0xFF;
      }
      else
      {
        int ☃;
        if (☃ < 8) {
          ☃ = ☃.cm() & 0xFF;
        } else {
          ☃ = V.nextInt(7);
        }
      }
      int ☃ = V.nextInt(5);
      if (☃ < 2) {
        ☃ |= cm() & 0xFF00;
      } else if (☃ < 4) {
        ☃ |= ☃.cm() & 0xFF00;
      } else {
        ☃ |= V.nextInt(5) << 8 & 0xFF00;
      }
      ☃.s(☃);
    }
    ☃.r(☃);
    
    double ☃ = a(vy.a).b() + ☃.a(vy.a).b() + di();
    ☃.a(vy.a).a(☃ / 3.0D);
    
    double ☃ = a(bt).b() + ☃.a(bt).b() + dj();
    ☃.a(bt).a(☃ / 3.0D);
    
    double ☃ = a(vy.d).b() + ☃.a(vy.d).b() + dk();
    ☃.a(vy.d).a(☃ / 3.0D);
    
    return ☃;
  }
  
  public pu a(ok ☃, pu ☃)
  {
    ☃ = super.a(☃, ☃);
    
    int ☃ = 0;
    int ☃ = 0;
    if ((☃ instanceof tp.a))
    {
      ☃ = a;
      ☃ = b & 0xFF | V.nextInt(5) << 8;
    }
    else
    {
      if (V.nextInt(10) == 0)
      {
        ☃ = 1;
      }
      else
      {
        int ☃ = V.nextInt(7);
        int ☃ = V.nextInt(5);
        ☃ = 0;
        ☃ = ☃ | ☃ << 8;
      }
      ☃ = new tp.a(☃, ☃);
    }
    r(☃);
    s(☃);
    if (V.nextInt(5) == 0) {
      b(41536);
    }
    if ((☃ == 4) || (☃ == 3))
    {
      a(vy.a).a(15.0D);
      a(vy.d).a(0.20000000298023224D);
    }
    else
    {
      a(vy.a).a(di());
      if (☃ == 0) {
        a(vy.d).a(dk());
      } else {
        a(vy.d).a(0.17499999701976776D);
      }
    }
    if ((☃ == 2) || (☃ == 1)) {
      a(bt).a(0.5D);
    } else {
      a(bt).a(dj());
    }
    i(bu());
    
    return ☃;
  }
  
  public float p(float ☃)
  {
    return bI + (bH - bI) * ☃;
  }
  
  public float q(float ☃)
  {
    return bK + (bJ - bK) * ☃;
  }
  
  public float r(float ☃)
  {
    return bM + (bL - bM) * ☃;
  }
  
  public void v(int ☃)
  {
    if (cG())
    {
      if (☃ < 0)
      {
        ☃ = 0;
      }
      else
      {
        bG = true;
        dh();
      }
      if (☃ >= 90) {
        br = 1.0F;
      } else {
        br = (0.4F + 0.4F * ☃ / 90.0F);
      }
    }
  }
  
  protected void t(boolean ☃)
  {
    cy ☃ = ☃ ? cy.I : cy.l;
    for (int ☃ = 0; ☃ < 7; ☃++)
    {
      double ☃ = V.nextGaussian() * 0.02D;
      double ☃ = V.nextGaussian() * 0.02D;
      double ☃ = V.nextGaussian() * 0.02D;
      o.a(☃, s + V.nextFloat() * J * 2.0F - J, t + 0.5D + V.nextFloat() * K, u + V.nextFloat() * J * 2.0F - J, ☃, ☃, ☃, new int[0]);
    }
  }
  
  public void a(byte ☃)
  {
    if (☃ == 7) {
      t(true);
    } else if (☃ == 6) {
      t(false);
    } else {
      super.a(☃);
    }
  }
  
  public void al()
  {
    super.al();
    if (bK > 0.0F)
    {
      float ☃ = ns.a(aI * 3.1415927F / 180.0F);
      float ☃ = ns.b(aI * 3.1415927F / 180.0F);
      float ☃ = 0.7F * bK;
      float ☃ = 0.15F * bK;
      
      l.b(s + ☃ * ☃, t + an() + l.am() + ☃, u - ☃ * ☃);
      if ((l instanceof pr)) {
        l).aI = aI;
      }
    }
  }
  
  private float di()
  {
    return 15.0F + V.nextInt(8) + V.nextInt(9);
  }
  
  private double dj()
  {
    return 0.4000000059604645D + V.nextDouble() * 0.2D + V.nextDouble() * 0.2D + V.nextDouble() * 0.2D;
  }
  
  private double dk()
  {
    return (0.44999998807907104D + V.nextDouble() * 0.3D + V.nextDouble() * 0.3D + V.nextDouble() * 0.3D) * 0.25D;
  }
  
  public static class a
    implements pu
  {
    public int a;
    public int b;
    
    public a(int ☃, int ☃)
    {
      a = ☃;
      b = ☃;
    }
  }
  
  public static boolean a(zw ☃)
  {
    return (☃ == zy.ck) || (☃ == zy.cl) || (☃ == zy.cm);
  }
  
  public boolean k_()
  {
    return false;
  }
  
  public float aS()
  {
    return K;
  }
  
  public boolean d(int ☃, zx ☃)
  {
    if ((☃ == 499) && (cP()))
    {
      if ((☃ == null) && (cw()))
      {
        o(false);
        da();
        return true;
      }
      if ((☃ != null) && (☃.b() == zw.a(afi.ae)) && (!cw()))
      {
        o(true);
        da();
        return true;
      }
    }
    int ☃ = ☃ - 400;
    if ((☃ >= 0) && (☃ < 2) && (☃ < bE.o_()))
    {
      if ((☃ == 0) && (☃ != null) && (☃.b() != zy.aA)) {
        return false;
      }
      if ((☃ == 1) && (((☃ != null) && (!a(☃.b()))) || (!cO()))) {
        return false;
      }
      bE.a(☃, ☃);
      db();
      return true;
    }
    int ☃ = ☃ - 500 + 2;
    if ((☃ >= 2) && (☃ < bE.o_()))
    {
      bE.a(☃, ☃);
      return true;
    }
    return false;
  }
}
