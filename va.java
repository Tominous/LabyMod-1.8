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
      i = ☃;
      j = ☃;
    }
    
    public int a()
    {
      return i;
    }
    
    public String b()
    {
      return j;
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
    k = true;
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
    ac.a(17, new Integer(0));
    ac.a(18, new Integer(1));
    ac.a(19, new Float(0.0F));
    ac.a(20, new Integer(0));
    ac.a(21, new Integer(6));
    ac.a(22, Byte.valueOf((byte)0));
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
    
    v = 0.0D;
    w = 0.0D;
    x = 0.0D;
    
    p = ☃;
    q = ☃;
    r = ☃;
  }
  
  public double an()
  {
    return 0.0D;
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if ((o.D) || (I)) {
      return true;
    }
    if (b(☃)) {
      return false;
    }
    k(-r());
    j(10);
    ac();
    a(p() + ☃ * 10.0F);
    boolean ☃ = ((☃.j() instanceof wn)) && (jbA.d);
    if ((☃) || (p() > 40.0F))
    {
      if (l != null) {
        l.a(null);
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
    if (o.Q().b("doEntityDrops"))
    {
      zx ☃ = new zx(zy.az, 1);
      if (b != null) {
        ☃.c(b);
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
    return !I;
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
    if (t < -64.0D) {
      O();
    }
    if ((!o.D) && ((o instanceof le)))
    {
      o.B.a("portal");
      MinecraftServer ☃ = ((le)o).r();
      int ☃ = L();
      if (ak)
      {
        if (☃.C())
        {
          if ((m == null) && 
            (al++ >= ☃))
          {
            al = ☃;
            aj = aq();
            int ☃;
            int ☃;
            if (o.t.q() == -1) {
              ☃ = 0;
            } else {
              ☃ = -1;
            }
            c(☃);
          }
          ak = false;
        }
      }
      else
      {
        if (al > 0) {
          al -= 4;
        }
        if (al < 0) {
          al = 0;
        }
      }
      if (aj > 0) {
        aj -= 1;
      }
      o.B.b();
    }
    if (o.D)
    {
      if (d > 0)
      {
        double ☃ = s + (e - s) / d;
        double ☃ = t + (f - t) / d;
        double ☃ = u + (g - u) / d;
        
        double ☃ = ns.g(h - y);
        
        y = ((float)(y + ☃ / d));
        z = ((float)(z + (i - z) / d));
        
        d -= 1;
        b(☃, ☃, ☃);
        b(y, z);
      }
      else
      {
        b(s, t, u);
        b(y, z);
      }
      return;
    }
    p = s;
    q = t;
    r = u;
    
    w -= 0.03999999910593033D;
    
    int ☃ = ns.c(s);
    int ☃ = ns.c(t);
    int ☃ = ns.c(u);
    if (afe.e(o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    cj ☃ = new cj(☃, ☃, ☃);
    alz ☃ = o.p(☃);
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
    
    z = 0.0F;
    double ☃ = p - s;
    double ☃ = r - u;
    if (☃ * ☃ + ☃ * ☃ > 0.001D)
    {
      y = ((float)(ns.b(☃, ☃) * 180.0D / 3.141592653589793D));
      if (a) {
        y += 180.0F;
      }
    }
    double ☃ = ns.g(y - A);
    if ((☃ < -170.0D) || (☃ >= 170.0D))
    {
      y += 180.0F;
      a = (!a);
    }
    b(y, z);
    for (pk ☃ : o.b(this, aR().b(0.20000000298023224D, 0.0D, 0.20000000298023224D))) {
      if ((☃ != l) && (☃.ae()) && ((☃ instanceof va))) {
        ☃.i(this);
      }
    }
    if ((l != null) && 
      (l.I))
    {
      if (l.m == this) {
        l.m = null;
      }
      l = null;
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
    v = ns.a(v, -☃, ☃);
    x = ns.a(x, -☃, ☃);
    if (C)
    {
      v *= 0.5D;
      w *= 0.5D;
      x *= 0.5D;
    }
    d(v, w, x);
    if (!C)
    {
      v *= 0.949999988079071D;
      w *= 0.949999988079071D;
      x *= 0.949999988079071D;
    }
  }
  
  protected void a(cj ☃, alz ☃)
  {
    O = 0.0F;
    
    aui ☃ = k(s, t, u);
    t = ☃.o();
    
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
      v -= 0.0078125D;
      t += 1.0D;
      break;
    case 2: 
      v += 0.0078125D;
      t += 1.0D;
      break;
    case 3: 
      x += 0.0078125D;
      t += 1.0D;
      break;
    case 4: 
      x -= 0.0078125D;
      t += 1.0D;
    }
    int[][] ☃ = c[☃.a()];
    
    double ☃ = ☃[1][0] - ☃[0][0];
    double ☃ = ☃[1][2] - ☃[0][2];
    double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃);
    
    double ☃ = v * ☃ + x * ☃;
    if (☃ < 0.0D)
    {
      ☃ = -☃;
      ☃ = -☃;
    }
    double ☃ = Math.sqrt(v * v + x * x);
    if (☃ > 2.0D) {
      ☃ = 2.0D;
    }
    v = (☃ * ☃ / ☃);
    x = (☃ * ☃ / ☃);
    if ((l instanceof pr))
    {
      double ☃ = l).ba;
      if (☃ > 0.0D)
      {
        double ☃ = -Math.sin(l.y * 3.1415927F / 180.0F);
        double ☃ = Math.cos(l.y * 3.1415927F / 180.0F);
        
        double ☃ = v * v + x * x;
        if (☃ < 0.01D)
        {
          v += ☃ * 0.1D;
          x += ☃ * 0.1D;
          
          ☃ = false;
        }
      }
    }
    if (☃)
    {
      double ☃ = Math.sqrt(v * v + x * x);
      if (☃ < 0.03D)
      {
        v *= 0.0D;
        w *= 0.0D;
        x *= 0.0D;
      }
      else
      {
        v *= 0.5D;
        w *= 0.0D;
        x *= 0.5D;
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
      s = (☃.n() + 0.5D);
      ☃ = u - ☃.p();
    }
    else if (☃ == 0.0D)
    {
      u = (☃.p() + 0.5D);
      ☃ = s - ☃.n();
    }
    else
    {
      double ☃ = s - ☃;
      double ☃ = u - ☃;
      
      ☃ = (☃ * ☃ + ☃ * ☃) * 2.0D;
    }
    s = (☃ + ☃ * ☃);
    u = (☃ + ☃ * ☃);
    
    b(s, t, u);
    
    double ☃ = v;
    double ☃ = x;
    if (l != null)
    {
      ☃ *= 0.75D;
      ☃ *= 0.75D;
    }
    double ☃ = m();
    ☃ = ns.a(☃, -☃, ☃);
    ☃ = ns.a(☃, -☃, ☃);
    
    d(☃, 0.0D, ☃);
    if ((☃[0][1] != 0) && (ns.c(s) - ☃.n() == ☃[0][0]) && (ns.c(u) - ☃.p() == ☃[0][2])) {
      b(s, t + ☃[0][1], u);
    } else if ((☃[1][1] != 0) && (ns.c(s) - ☃.n() == ☃[1][0]) && (ns.c(u) - ☃.p() == ☃[1][2])) {
      b(s, t + ☃[1][1], u);
    }
    o();
    
    aui ☃ = k(s, t, u);
    if ((☃ != null) && (☃ != null))
    {
      double ☃ = (b - b) * 0.05D;
      
      ☃ = Math.sqrt(v * v + x * x);
      if (☃ > 0.0D)
      {
        v = (v / ☃ * (☃ + ☃));
        x = (x / ☃ * (☃ + ☃));
      }
      b(s, b, u);
    }
    int ☃ = ns.c(s);
    int ☃ = ns.c(u);
    if ((☃ != ☃.n()) || (☃ != ☃.p()))
    {
      ☃ = Math.sqrt(v * v + x * x);
      
      v = (☃ * (☃ - ☃.n()));
      x = (☃ * (☃ - ☃.p()));
    }
    if (☃)
    {
      double ☃ = Math.sqrt(v * v + x * x);
      if (☃ > 0.01D)
      {
        double ☃ = 0.06D;
        v += v / ☃ * ☃;
        x += x / ☃ * ☃;
      }
      else if (☃ == afe.b.b)
      {
        if (o.p(☃.e()).c().v()) {
          v = 0.02D;
        } else if (o.p(☃.f()).c().v()) {
          v = -0.02D;
        }
      }
      else if (☃ == afe.b.a)
      {
        if (o.p(☃.c()).c().v()) {
          x = 0.02D;
        } else if (o.p(☃.d()).c().v()) {
          x = -0.02D;
        }
      }
    }
  }
  
  protected void o()
  {
    if (l != null)
    {
      v *= 0.996999979019165D;
      w *= 0.0D;
      x *= 0.996999979019165D;
    }
    else
    {
      v *= 0.9599999785423279D;
      w *= 0.0D;
      x *= 0.9599999785423279D;
    }
  }
  
  public void b(double ☃, double ☃, double ☃)
  {
    s = ☃;
    t = ☃;
    u = ☃;
    float ☃ = J / 2.0F;
    float ☃ = K;
    a(new aug(☃ - ☃, ☃, ☃ - ☃, ☃ + ☃, ☃ + ☃, ☃ + ☃));
  }
  
  public aui a(double ☃, double ☃, double ☃, double ☃)
  {
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    if (afe.e(o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    alz ☃ = o.p(new cj(☃, ☃, ☃));
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
    if (afe.e(o, new cj(☃, ☃ - 1, ☃))) {
      ☃--;
    }
    alz ☃ = o.p(new cj(☃, ☃, ☃));
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
      b = ☃.j("CustomName");
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
    if ((b != null) && (b.length() > 0)) {
      ☃.a("CustomName", b);
    }
  }
  
  public void i(pk ☃)
  {
    if (o.D) {
      return;
    }
    if ((T) || (T)) {
      return;
    }
    if (☃ == l) {
      return;
    }
    if (((☃ instanceof pr)) && (!(☃ instanceof wn)) && (!(☃ instanceof ty)) && (s() == va.a.a) && (v * v + x * x > 0.01D) && 
      (l == null) && (m == null)) {
      ☃.a(this);
    }
    double ☃ = s - s;
    double ☃ = u - u;
    
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
      
      ☃ *= (1.0F - U);
      ☃ *= (1.0F - U);
      ☃ *= 0.5D;
      ☃ *= 0.5D;
      if ((☃ instanceof va))
      {
        double ☃ = s - s;
        double ☃ = u - u;
        
        aui ☃ = new aui(☃, 0.0D, ☃).a();
        aui ☃ = new aui(ns.b(y * 3.1415927F / 180.0F), 0.0D, ns.a(y * 3.1415927F / 180.0F)).a();
        
        double ☃ = Math.abs(☃.b(☃));
        if (☃ < 0.800000011920929D) {
          return;
        }
        double ☃ = v + v;
        double ☃ = x + x;
        if ((((va)☃).s() == va.a.c) && (s() != va.a.c))
        {
          v *= 0.20000000298023224D;
          x *= 0.20000000298023224D;
          g(v - ☃, 0.0D, x - ☃);
          v *= 0.949999988079071D;
          x *= 0.949999988079071D;
        }
        else if ((((va)☃).s() != va.a.c) && (s() == va.a.c))
        {
          v *= 0.20000000298023224D;
          x *= 0.20000000298023224D;
          ☃.g(v + ☃, 0.0D, x + ☃);
          v *= 0.949999988079071D;
          x *= 0.949999988079071D;
        }
        else
        {
          ☃ /= 2.0D;
          ☃ /= 2.0D;
          v *= 0.20000000298023224D;
          x *= 0.20000000298023224D;
          g(☃ - ☃, 0.0D, ☃ - ☃);
          v *= 0.20000000298023224D;
          x *= 0.20000000298023224D;
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
    e = ☃;
    f = ☃;
    g = ☃;
    h = ☃;
    i = ☃;
    
    d = (☃ + 2);
    
    v = ar;
    w = as;
    x = at;
  }
  
  public void i(double ☃, double ☃, double ☃)
  {
    ar = (v = ☃);
    as = (w = ☃);
    at = (x = ☃);
  }
  
  public void a(float ☃)
  {
    ac.b(19, Float.valueOf(☃));
  }
  
  public float p()
  {
    return ac.d(19);
  }
  
  public void j(int ☃)
  {
    ac.b(17, Integer.valueOf(☃));
  }
  
  public int q()
  {
    return ac.c(17);
  }
  
  public void k(int ☃)
  {
    ac.b(18, Integer.valueOf(☃));
  }
  
  public int r()
  {
    return ac.c(18);
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
    b = ☃;
  }
  
  public String e_()
  {
    if (b != null) {
      return b;
    }
    return super.e_();
  }
  
  public boolean l_()
  {
    return b != null;
  }
  
  public String aM()
  {
    return b;
  }
  
  public eu f_()
  {
    if (l_())
    {
      fa ☃ = new fa(b);
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
