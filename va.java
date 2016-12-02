import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public abstract class va
  extends pk
  implements op
{
  private boolean a;
  private String b;
  
  public static enum a
  {
    private static final Map<Integer, a> h;
    private final int i;
    private final String j;
    
    static
    {
      h = Maps.newHashMap();
      for (a ☃ : values()) {
        h.put(Integer.valueOf(☃.a()), ☃);
      }
    }
    
    private a(int ☃, String ☃)
    {
      this.i = ☃;
      this.j = ☃;
    }
    
    public int a()
    {
      return this.i;
    }
    
    public String b()
    {
      return this.j;
    }
    
    public static a a(int ☃)
    {
      a ☃ = (a)h.get(Integer.valueOf(☃));
      return ☃ == null ? a : ☃;
    }
  }
  
  public va(adm ☃)
  {
    super(☃);
    this.k = true;
    a(0.98F, 0.7F);
  }
  
  public static va a(adm ☃, double ☃, double ☃, double ☃, va.a ☃)
  {
    switch (va.1.a[☃.ordinal()])
    {
    case 1: 
      return new vb(☃, ☃, ☃, ☃);
    case 2: 
      return new ve(☃, ☃, ☃, ☃);
    case 3: 
      return new vi(☃, ☃, ☃, ☃);
    case 4: 
      return new vh(☃, ☃, ☃, ☃);
    case 5: 
      return new vf(☃, ☃, ☃, ☃);
    case 6: 
      return new vc(☃, ☃, ☃, ☃);
    }
    return new vg(☃, ☃, ☃, ☃);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  protected void h()
  {
    this.ac.a(17, new Integer(0));
    this.ac.a(18, new Integer(1));
    this.ac.a(19, new Float(0.0F));
    this.ac.a(20, new Integer(0));
    this.ac.a(21, new Integer(6));
    this.ac.a(22, Byte.valueOf((byte)0));
  }
  
  public aug j(pk ☃)
  {
    if (☃.ae()) {
      return ☃.aR();
    }
    return null;
  }
  
  public aug S()
  {
    return null;
  }
  
  public boolean ae()
  {
    return true;
  }
  
  public va(adm ☃, double ☃, double ☃, double ☃)
  {
    this(☃);
    b(☃, ☃, ☃);
    
    this.v = 0.0D;
    this.w = 0.0D;
    this.x = 0.0D;
    
    this.p = ☃;
    this.q = ☃;
    this.r = ☃;
  }
  
  public double an()
  {
    return 0.0D;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if ((this.o.D) || (this.I)) {
      return true;
    }
    if (b(☃)) {
      return false;
    }
    k(-r());
    j(10);
    ac();
    a(p() + ☃ * 10.0F);
    boolean ☃ = ((☃.j() instanceof wn)) && (((wn)☃.j()).bA.d);
    if ((☃) || (p() > 40.0F))
    {
      if (this.l != null) {
        this.l.a(null);
      }
      if ((!☃) || (l_())) {
        a(☃);
      } else {
        J();
      }
    }
    return true;
  }
  
  public void a(ow ☃)
  {
    J();
    if (this.o.Q().b("doEntityDrops"))
    {
      zx ☃ = new zx(zy.az, 1);
      if (this.b != null) {
        ☃.c(this.b);
      }
      a(☃, 0.0F);
    }
  }
  
  public void ar()
  {
    k(-r());
    j(10);
    a(p() + p() * 10.0F);
  }
  
  public boolean ad()
  {
    return !this.I;
  }
  
  public void J()
  {
    super.J();
  }
  
  private static final int[][][] c = { { { 0, 0, -1 }, { 0, 0, 1 } }, { { -1, 0, 0 }, { 1, 0, 0 } }, { { -1, -1, 0 }, { 1, 0, 0 } }, { { -1, 0, 0 }, { 1, -1, 0 } }, { { 0, 0, -1 }, { 0, -1, 1 } }, { { 0, -1, -1 }, { 0, 0, 1 } }, { { 0, 0, 1 }, { 1, 0, 0 } }, { { 0, 0, 1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { -1, 0, 0 } }, { { 0, 0, -1 }, { 1, 0, 0 } } };
  private int d;
  private double e;
  private double f;
  private double g;
  private double h;
  private double i;
  private double ar;
  private double as;
  private double at;
  
  public void t_()
  {
    if (q() > 0) {
      j(q() - 1);
    }
    if (p() > 0.0F) {
      a(p() - 1.0F);
    }
    if (this.t < -64.0D) {
      O();
    }
    if ((!this.o.D) && ((this.o instanceof le)))
    {
      this.o.B.a("portal");
      MinecraftServer ☃ = ((le)this.o).r();
      int ☃ = L();
      if (this.ak)
      {
        if (☃.C())
        {
          if ((this.m == null) && 
            (this.al++ >= ☃))
          {
            this.al = ☃;
            this.aj = aq();
            int ☃;
            int ☃;
            if (this.o.t.q() == -1) {
              ☃ = 0;
            } else {
              ☃ = -1;
            }
            c(☃);
          }
          this.ak = false;
        }
      }
      else
      {
        if (this.al > 0) {
          this.al -= 4;
        }
        if (this.al < 0) {
          this.al = 0;
        }
      }
      if (this.aj > 0) {
        this.aj -= 1;
      }
      this.o.B.b();
    }
    if (this.o.D)
    {
      if (this.d > 0)
      {
        double ☃ = this.s + (this.e - this.s) / this.d;
        double ☃ = this.t + (this.f - this.t) / this.d;
        double ☃ = this.u + (this.g - this.u) / this.d;
        
        double ☃ = ns.g(this.h - this.y);
        
        this.y = ((float)(this.y + ☃ / this.d));
        this.z = ((float)(this.z + (this.i - this.z) / this.d));
        
        this.d -= 1;
        b(☃, ☃, ☃);
        b(this.y, this.z);
      }
      else
      {
        b(this.s, this.t, this.u);
        b(this.y, this.z);
      }
      return;
    }
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w -= 0.03999999910593033D;
    
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.t);
    int ☃ = ns.c(this.u);
    if (afe.e(this.o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = this.o.p(☃);
    if (afe.d(☃))
    {
      a(☃, ☃);
      if (☃.c() == afi.cs) {
        a(☃, ☃, ☃, ((Boolean)☃.b(ais.N)).booleanValue());
      }
    }
    else
    {
      n();
    }
    Q();
    
    this.z = 0.0F;
    double ☃ = this.p - this.s;
    double ☃ = this.r - this.u;
    if (☃ * ☃ + ☃ * ☃ > 0.001D)
    {
      this.y = ((float)(ns.b(☃, ☃) * 180.0D / 3.141592653589793D));
      if (this.a) {
        this.y += 180.0F;
      }
    }
    double ☃ = ns.g(this.y - this.A);
    if ((☃ < -170.0D) || (☃ >= 170.0D))
    {
      this.y += 180.0F;
      this.a = (!this.a);
    }
    b(this.y, this.z);
    for (pk ☃ : this.o.b(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
      if ((☃ != this.l) && (☃.ae()) && ((☃ instanceof va))) {
        ☃.i(this);
      }
    }
    if ((this.l != null) && 
      (this.l.I))
    {
      if (this.l.m == this) {
        this.l.m = null;
      }
      this.l = null;
    }
    W();
  }
  
  protected double m()
  {
    return 0.4D;
  }
  
  public void a(int ☃, int ☃, int ☃, boolean ☃) {}
  
  protected void n()
  {
    double ☃ = m();
    this.v = ns.a(this.v, -☃, ☃);
    this.x = ns.a(this.x, -☃, ☃);
    if (this.C)
    {
      this.v *= 0.5D;
      this.w *= 0.5D;
      this.x *= 0.5D;
    }
    d(this.v, this.w, this.x);
    if (!this.C)
    {
      this.v *= 0.949999988079071D;
      this.w *= 0.949999988079071D;
      this.x *= 0.949999988079071D;
    }
  }
  
  protected void a(cj ☃, alz ☃)
  {
    this.O = 0.0F;
    
    aui ☃ = k(this.s, this.t, this.u);
    this.t = ☃.o();
    
    boolean ☃ = false;
    boolean ☃ = false;
    afe ☃ = (afe)☃.c();
    if (☃ == afi.D)
    {
      ☃ = ((Boolean)☃.b(ais.N)).booleanValue();
      ☃ = !☃;
    }
    double ☃ = 0.0078125D;
    afe.b ☃ = (afe.b)☃.b(☃.n());
    switch (va.1.b[☃.ordinal()])
    {
    case 1: 
      this.v -= 0.0078125D;
      this.t += 1.0D;
      break;
    case 2: 
      this.v += 0.0078125D;
      this.t += 1.0D;
      break;
    case 3: 
      this.x += 0.0078125D;
      this.t += 1.0D;
      break;
    case 4: 
      this.x -= 0.0078125D;
      this.t += 1.0D;
    }
    int[][] ☃ = c[☃.a()];
    
    double ☃ = ☃[1][0] - ☃[0][0];
    double ☃ = ☃[1][2] - ☃[0][2];
    double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃);
    
    double ☃ = this.v * ☃ + this.x * ☃;
    if (☃ < 0.0D)
    {
      ☃ = -☃;
      ☃ = -☃;
    }
    double ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
    if (☃ > 2.0D) {
      ☃ = 2.0D;
    }
    this.v = (☃ * ☃ / ☃);
    this.x = (☃ * ☃ / ☃);
    if ((this.l instanceof pr))
    {
      double ☃ = ((pr)this.l).ba;
      if (☃ > 0.0D)
      {
        double ☃ = -Math.sin(this.l.y * 3.1415927F / 180.0F);
        double ☃ = Math.cos(this.l.y * 3.1415927F / 180.0F);
        
        double ☃ = this.v * this.v + this.x * this.x;
        if (☃ < 0.01D)
        {
          this.v += ☃ * 0.1D;
          this.x += ☃ * 0.1D;
          
          ☃ = false;
        }
      }
    }
    if (☃)
    {
      double ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
      if (☃ < 0.03D)
      {
        this.v *= 0.0D;
        this.w *= 0.0D;
        this.x *= 0.0D;
      }
      else
      {
        this.v *= 0.5D;
        this.w *= 0.0D;
        this.x *= 0.5D;
      }
    }
    double ☃ = 0.0D;
    double ☃ = ☃.n() + 0.5D + ☃[0][0] * 0.5D;
    double ☃ = ☃.p() + 0.5D + ☃[0][2] * 0.5D;
    double ☃ = ☃.n() + 0.5D + ☃[1][0] * 0.5D;
    double ☃ = ☃.p() + 0.5D + ☃[1][2] * 0.5D;
    
    ☃ = ☃ - ☃;
    ☃ = ☃ - ☃;
    if (☃ == 0.0D)
    {
      this.s = (☃.n() + 0.5D);
      ☃ = this.u - ☃.p();
    }
    else if (☃ == 0.0D)
    {
      this.u = (☃.p() + 0.5D);
      ☃ = this.s - ☃.n();
    }
    else
    {
      double ☃ = this.s - ☃;
      double ☃ = this.u - ☃;
      
      ☃ = (☃ * ☃ + ☃ * ☃) * 2.0D;
    }
    this.s = (☃ + ☃ * ☃);
    this.u = (☃ + ☃ * ☃);
    
    b(this.s, this.t, this.u);
    
    double ☃ = this.v;
    double ☃ = this.x;
    if (this.l != null)
    {
      ☃ *= 0.75D;
      ☃ *= 0.75D;
    }
    double ☃ = m();
    ☃ = ns.a(☃, -☃, ☃);
    ☃ = ns.a(☃, -☃, ☃);
    
    d(☃, 0.0D, ☃);
    if ((☃[0][1] != 0) && (ns.c(this.s) - ☃.n() == ☃[0][0]) && (ns.c(this.u) - ☃.p() == ☃[0][2])) {
      b(this.s, this.t + ☃[0][1], this.u);
    } else if ((☃[1][1] != 0) && (ns.c(this.s) - ☃.n() == ☃[1][0]) && (ns.c(this.u) - ☃.p() == ☃[1][2])) {
      b(this.s, this.t + ☃[1][1], this.u);
    }
    o();
    
    aui ☃ = k(this.s, this.t, this.u);
    if ((☃ != null) && (☃ != null))
    {
      double ☃ = (☃.b - ☃.b) * 0.05D;
      
      ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
      if (☃ > 0.0D)
      {
        this.v = (this.v / ☃ * (☃ + ☃));
        this.x = (this.x / ☃ * (☃ + ☃));
      }
      b(this.s, ☃.b, this.u);
    }
    int ☃ = ns.c(this.s);
    int ☃ = ns.c(this.u);
    if ((☃ != ☃.n()) || (☃ != ☃.p()))
    {
      ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
      
      this.v = (☃ * (☃ - ☃.n()));
      this.x = (☃ * (☃ - ☃.p()));
    }
    if (☃)
    {
      double ☃ = Math.sqrt(this.v * this.v + this.x * this.x);
      if (☃ > 0.01D)
      {
        double ☃ = 0.06D;
        this.v += this.v / ☃ * ☃;
        this.x += this.x / ☃ * ☃;
      }
      else if (☃ == afe.b.b)
      {
        if (this.o.p(☃.e()).c().v()) {
          this.v = 0.02D;
        } else if (this.o.p(☃.f()).c().v()) {
          this.v = -0.02D;
        }
      }
      else if (☃ == afe.b.a)
      {
        if (this.o.p(☃.c()).c().v()) {
          this.x = 0.02D;
        } else if (this.o.p(☃.d()).c().v()) {
          this.x = -0.02D;
        }
      }
    }
  }
  
  protected void o()
  {
    if (this.l != null)
    {
      this.v *= 0.996999979019165D;
      this.w *= 0.0D;
      this.x *= 0.996999979019165D;
    }
    else
    {
      this.v *= 0.9599999785423279D;
      this.w *= 0.0D;
      this.x *= 0.9599999785423279D;
    }
  }
  
  public void b(double ☃, double ☃, double ☃)
  {
    this.s = ☃;
    this.t = ☃;
    this.u = ☃;
    float ☃ = this.J / 2.0F;
    float ☃ = this.K;
    a(new aug(☃ - ☃, ☃, ☃ - ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃));
  }
  
  public aui a(double ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    if (afe.e(this.o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    alz ☃ = this.o.p(new cj(☃, ☃, ☃));
    if (afe.d(☃))
    {
      afe.b ☃ = (afe.b)☃.b(((afe)☃.c()).n());
      ☃ = ☃;
      if (☃.c()) {
        ☃ = ☃ + 1;
      }
      int[][] ☃ = c[☃.a()];
      
      double ☃ = ☃[1][0] - ☃[0][0];
      double ☃ = ☃[1][2] - ☃[0][2];
      double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃);
      ☃ /= ☃;
      ☃ /= ☃;
      
      ☃ += ☃ * ☃;
      ☃ += ☃ * ☃;
      if ((☃[0][1] != 0) && (ns.c(☃) - ☃ == ☃[0][0]) && (ns.c(☃) - ☃ == ☃[0][2])) {
        ☃ += ☃[0][1];
      } else if ((☃[1][1] != 0) && (ns.c(☃) - ☃ == ☃[1][0]) && (ns.c(☃) - ☃ == ☃[1][2])) {
        ☃ += ☃[1][1];
      }
      return k(☃, ☃, ☃);
    }
    return null;
  }
  
  public aui k(double ☃, double ☃, double ☃)
  {
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    if (afe.e(this.o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    alz ☃ = this.o.p(new cj(☃, ☃, ☃));
    if (afe.d(☃))
    {
      afe.b ☃ = (afe.b)☃.b(((afe)☃.c()).n());
      int[][] ☃ = c[☃.a()];
      
      double ☃ = 0.0D;
      double ☃ = ☃ + 0.5D + ☃[0][0] * 0.5D;
      double ☃ = ☃ + 0.0625D + ☃[0][1] * 0.5D;
      double ☃ = ☃ + 0.5D + ☃[0][2] * 0.5D;
      double ☃ = ☃ + 0.5D + ☃[1][0] * 0.5D;
      double ☃ = ☃ + 0.0625D + ☃[1][1] * 0.5D;
      double ☃ = ☃ + 0.5D + ☃[1][2] * 0.5D;
      
      double ☃ = ☃ - ☃;
      double ☃ = (☃ - ☃) * 2.0D;
      double ☃ = ☃ - ☃;
      if (☃ == 0.0D)
      {
        ☃ = ☃ + 0.5D;
        ☃ = ☃ - ☃;
      }
      else if (☃ == 0.0D)
      {
        ☃ = ☃ + 0.5D;
        ☃ = ☃ - ☃;
      }
      else
      {
        double ☃ = ☃ - ☃;
        double ☃ = ☃ - ☃;
        
        ☃ = (☃ * ☃ + ☃ * ☃) * 2.0D;
      }
      ☃ = ☃ + ☃ * ☃;
      ☃ = ☃ + ☃ * ☃;
      ☃ = ☃ + ☃ * ☃;
      if (☃ < 0.0D) {
        ☃ += 1.0D;
      }
      if (☃ > 0.0D) {
        ☃ += 0.5D;
      }
      return new aui(☃, ☃, ☃);
    }
    return null;
  }
  
  protected void a(dn ☃)
  {
    if (☃.n("CustomDisplayTile"))
    {
      int ☃ = ☃.f("DisplayData");
      if (☃.b("DisplayTile", 8))
      {
        afh ☃ = afh.b(☃.j("DisplayTile"));
        if (☃ == null) {
          a(afi.a.Q());
        } else {
          a(☃.a(☃));
        }
      }
      else
      {
        afh ☃ = afh.c(☃.f("DisplayTile"));
        if (☃ == null) {
          a(afi.a.Q());
        } else {
          a(☃.a(☃));
        }
      }
      l(☃.f("DisplayOffset"));
    }
    if ((☃.b("CustomName", 8)) && (☃.j("CustomName").length() > 0)) {
      this.b = ☃.j("CustomName");
    }
  }
  
  protected void b(dn ☃)
  {
    if (x())
    {
      ☃.a("CustomDisplayTile", true);
      alz ☃ = t();
      jy ☃ = (jy)afh.c.c(☃.c());
      ☃.a("DisplayTile", ☃ == null ? "" : ☃.toString());
      ☃.a("DisplayData", ☃.c().c(☃));
      ☃.a("DisplayOffset", v());
    }
    if ((this.b != null) && (this.b.length() > 0)) {
      ☃.a("CustomName", this.b);
    }
  }
  
  public void i(pk ☃)
  {
    if (this.o.D) {
      return;
    }
    if ((☃.T) || (this.T)) {
      return;
    }
    if (☃ == this.l) {
      return;
    }
    if (((☃ instanceof pr)) && (!(☃ instanceof wn)) && (!(☃ instanceof ty)) && (s() == va.a.a) && (this.v * this.v + this.x * this.x > 0.01D) && 
      (this.l == null) && (☃.m == null)) {
      ☃.a(this);
    }
    double ☃ = ☃.s - this.s;
    double ☃ = ☃.u - this.u;
    
    double ☃ = ☃ * ☃ + ☃ * ☃;
    if (☃ >= 9.999999747378752E-5D)
    {
      ☃ = ns.a(☃);
      ☃ /= ☃;
      ☃ /= ☃;
      double ☃ = 1.0D / ☃;
      if (☃ > 1.0D) {
        ☃ = 1.0D;
      }
      ☃ *= ☃;
      ☃ *= ☃;
      ☃ *= 0.10000000149011612D;
      ☃ *= 0.10000000149011612D;
      
      ☃ *= (1.0F - this.U);
      ☃ *= (1.0F - this.U);
      ☃ *= 0.5D;
      ☃ *= 0.5D;
      if ((☃ instanceof va))
      {
        double ☃ = ☃.s - this.s;
        double ☃ = ☃.u - this.u;
        
        aui ☃ = new aui(☃, 0.0D, ☃).a();
        aui ☃ = new aui(ns.b(this.y * 3.1415927F / 180.0F), 0.0D, ns.a(this.y * 3.1415927F / 180.0F)).a();
        
        double ☃ = Math.abs(☃.b(☃));
        if (☃ < 0.800000011920929D) {
          return;
        }
        double ☃ = ☃.v + this.v;
        double ☃ = ☃.x + this.x;
        if ((((va)☃).s() == va.a.c) && (s() != va.a.c))
        {
          this.v *= 0.20000000298023224D;
          this.x *= 0.20000000298023224D;
          g(☃.v - ☃, 0.0D, ☃.x - ☃);
          ☃.v *= 0.949999988079071D;
          ☃.x *= 0.949999988079071D;
        }
        else if ((((va)☃).s() != va.a.c) && (s() == va.a.c))
        {
          ☃.v *= 0.20000000298023224D;
          ☃.x *= 0.20000000298023224D;
          ☃.g(this.v + ☃, 0.0D, this.x + ☃);
          this.v *= 0.949999988079071D;
          this.x *= 0.949999988079071D;
        }
        else
        {
          ☃ /= 2.0D;
          ☃ /= 2.0D;
          this.v *= 0.20000000298023224D;
          this.x *= 0.20000000298023224D;
          g(☃ - ☃, 0.0D, ☃ - ☃);
          ☃.v *= 0.20000000298023224D;
          ☃.x *= 0.20000000298023224D;
          ☃.g(☃ + ☃, 0.0D, ☃ + ☃);
        }
      }
      else
      {
        g(-☃, 0.0D, -☃);
        ☃.g(☃ / 4.0D, 0.0D, ☃ / 4.0D);
      }
    }
  }
  
  public void a(double ☃, double ☃, double ☃, float ☃, float ☃, int ☃, boolean ☃)
  {
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = ☃;
    this.i = ☃;
    
    this.d = (☃ + 2);
    
    this.v = this.ar;
    this.w = this.as;
    this.x = this.at;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    this.ar = (this.v = ☃);
    this.as = (this.w = ☃);
    this.at = (this.x = ☃);
  }
  
  public void a(float ☃)
  {
    this.ac.b(19, Float.valueOf(☃));
  }
  
  public float p()
  {
    return this.ac.d(19);
  }
  
  public void j(int ☃)
  {
    this.ac.b(17, Integer.valueOf(☃));
  }
  
  public int q()
  {
    return this.ac.c(17);
  }
  
  public void k(int ☃)
  {
    this.ac.b(18, Integer.valueOf(☃));
  }
  
  public int r()
  {
    return this.ac.c(18);
  }
  
  public abstract va.a s();
  
  public alz t()
  {
    if (!x()) {
      return u();
    }
    return afh.d(H().c(20));
  }
  
  public alz u()
  {
    return afi.a.Q();
  }
  
  public int v()
  {
    if (!x()) {
      return w();
    }
    return H().c(21);
  }
  
  public int w()
  {
    return 6;
  }
  
  public void a(alz ☃)
  {
    H().b(20, Integer.valueOf(afh.f(☃)));
    a(true);
  }
  
  public void l(int ☃)
  {
    H().b(21, Integer.valueOf(☃));
    a(true);
  }
  
  public boolean x()
  {
    return H().a(22) == 1;
  }
  
  public void a(boolean ☃)
  {
    H().b(22, Byte.valueOf((byte)(☃ ? 1 : 0)));
  }
  
  public void a(String ☃)
  {
    this.b = ☃;
  }
  
  public String e_()
  {
    if (this.b != null) {
      return this.b;
    }
    return super.e_();
  }
  
  public boolean l_()
  {
    return this.b != null;
  }
  
  public String aM()
  {
    return this.b;
  }
  
  public eu f_()
  {
    if (l_())
    {
      fa ☃ = new fa(this.b);
      ☃.b().a(aQ());
      ☃.b().a(aK().toString());
      return ☃;
    }
    fb ☃ = new fb(e_(), new Object[0]);
    ☃.b().a(aQ());
    ☃.b().a(aK().toString());
    return ☃;
  }
}
