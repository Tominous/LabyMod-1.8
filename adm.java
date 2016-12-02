import com.google.common.base.Predicate;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import net.minecraft.server.MinecraftServer;

public abstract class adm
  implements adq
{
  private int a = 63;
  protected boolean e;
  public final List<pk> f = Lists.newArrayList();
  protected final List<pk> g = Lists.newArrayList();
  public final List<akw> h = Lists.newArrayList();
  public final List<akw> i = Lists.newArrayList();
  private final List<akw> b = Lists.newArrayList();
  private final List<akw> c = Lists.newArrayList();
  public final List<wn> j = Lists.newArrayList();
  public final List<pk> k = Lists.newArrayList();
  protected final nm<pk> l = new nm();
  private long d = 16777215L;
  private int I;
  protected int m = new Random().nextInt();
  protected final int n = 1013904223;
  protected float o;
  protected float p;
  protected float q;
  protected float r;
  private int J;
  public final Random s = new Random();
  public final anm t;
  protected List<ado> u = Lists.newArrayList();
  protected amv v;
  protected final atp w;
  protected ato x;
  protected boolean y;
  protected aua z;
  protected th A;
  public final nt B;
  private final Calendar K = Calendar.getInstance();
  protected auo C = new auo();
  public final boolean D;
  protected Set<adg> E = Sets.newHashSet();
  private int L = this.s.nextInt(12000);
  protected boolean F = true;
  protected boolean G = true;
  private boolean M;
  private final ams N;
  
  protected adm(atp ☃, ato ☃, anm ☃, nt ☃, boolean ☃)
  {
    this.w = ☃;
    this.B = ☃;
    this.x = ☃;
    this.t = ☃;
    this.D = ☃;
    this.N = ☃.r();
  }
  
  public adm b()
  {
    return this;
  }
  
  public ady b(final cj ☃)
  {
    if (e(☃))
    {
      amy ☃ = f(☃);
      try
      {
        return ☃.a(☃, this.t.m());
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Getting biome");
        c ☃ = ☃.a("Coordinates of biome request");
        
        ☃.a("Location", new Callable()
        {
          public String a()
            throws Exception
          {
            return c.a(☃);
          }
        });
        throw new e(☃);
      }
    }
    return this.t.m().a(☃, ady.q);
  }
  
  public aec v()
  {
    return this.t.m();
  }
  
  protected abstract amv k();
  
  public void a(adp ☃)
  {
    this.x.d(true);
  }
  
  public void g()
  {
    B(new cj(8, 64, 8));
  }
  
  public afh c(cj ☃)
  {
    cj ☃ = new cj(☃.n(), F(), ☃.p());
    while (!d(☃.a())) {
      ☃ = ☃.a();
    }
    return p(☃).c();
  }
  
  private boolean a(cj ☃)
  {
    return (☃.n() >= -30000000) && (☃.p() >= -30000000) && (☃.n() < 30000000) && (☃.p() < 30000000) && (☃.o() >= 0) && (☃.o() < 256);
  }
  
  public boolean d(cj ☃)
  {
    return p(☃).c().t() == arm.a;
  }
  
  public boolean e(cj ☃)
  {
    return a(☃, true);
  }
  
  public boolean a(cj ☃, boolean ☃)
  {
    if (!a(☃)) {
      return false;
    }
    return a(☃.n() >> 4, ☃.p() >> 4, ☃);
  }
  
  public boolean a(cj ☃, int ☃)
  {
    return a(☃, ☃, true);
  }
  
  public boolean a(cj ☃, int ☃, boolean ☃)
  {
    return a(☃.n() - ☃, ☃.o() - ☃, ☃.p() - ☃, ☃.n() + ☃, ☃.o() + ☃, ☃.p() + ☃, ☃);
  }
  
  public boolean a(cj ☃, cj ☃)
  {
    return a(☃, ☃, true);
  }
  
  public boolean a(cj ☃, cj ☃, boolean ☃)
  {
    return a(☃.n(), ☃.o(), ☃.p(), ☃.n(), ☃.o(), ☃.p(), ☃);
  }
  
  public boolean a(aqe ☃)
  {
    return b(☃, true);
  }
  
  public boolean b(aqe ☃, boolean ☃)
  {
    return a(☃.a, ☃.b, ☃.c, ☃.d, ☃.e, ☃.f, ☃);
  }
  
  private boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    if ((☃ < 0) || (☃ >= 256)) {
      return false;
    }
    ☃ >>= 4;
    ☃ >>= 4;
    ☃ >>= 4;
    ☃ >>= 4;
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        if (!a(☃, ☃, ☃)) {
          return false;
        }
      }
    }
    return true;
  }
  
  protected boolean a(int ☃, int ☃, boolean ☃)
  {
    return (this.v.a(☃, ☃)) && ((☃) || (!this.v.d(☃, ☃).f()));
  }
  
  public amy f(cj ☃)
  {
    return a(☃.n() >> 4, ☃.p() >> 4);
  }
  
  public amy a(int ☃, int ☃)
  {
    return this.v.d(☃, ☃);
  }
  
  public boolean a(cj ☃, alz ☃, int ☃)
  {
    if (!a(☃)) {
      return false;
    }
    if ((!this.D) && (this.x.u() == adr.g)) {
      return false;
    }
    amy ☃ = f(☃);
    afh ☃ = ☃.c();
    alz ☃ = ☃.a(☃, ☃);
    if (☃ != null)
    {
      afh ☃ = ☃.c();
      if ((☃.p() != ☃.p()) || (☃.r() != ☃.r()))
      {
        this.B.a("checkLight");
        x(☃);
        this.B.b();
      }
      if (((☃ & 0x2) != 0) && ((!this.D) || ((☃ & 0x4) == 0)) && (☃.i())) {
        h(☃);
      }
      if ((!this.D) && ((☃ & 0x1) != 0))
      {
        b(☃, ☃.c());
        if (☃.O()) {
          e(☃, ☃);
        }
      }
      return true;
    }
    return false;
  }
  
  public boolean g(cj ☃)
  {
    return a(☃, afi.a.Q(), 3);
  }
  
  public boolean b(cj ☃, boolean ☃)
  {
    alz ☃ = p(☃);
    afh ☃ = ☃.c();
    if (☃.t() == arm.a) {
      return false;
    }
    b(2001, ☃, afh.f(☃));
    if (☃) {
      ☃.b(this, ☃, ☃, 0);
    }
    return a(☃, afi.a.Q(), 3);
  }
  
  public boolean a(cj ☃, alz ☃)
  {
    return a(☃, ☃, 3);
  }
  
  public void h(cj ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃);
    }
  }
  
  public void b(cj ☃, afh ☃)
  {
    if (this.x.u() != adr.g) {
      c(☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃)
  {
    if (☃ > ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    if (!this.t.o()) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        c(ads.a, new cj(☃, ☃, ☃));
      }
    }
    b(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void b(cj ☃, cj ☃)
  {
    b(☃.n(), ☃.o(), ☃.p(), ☃.n(), ☃.o(), ☃.p());
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void c(cj ☃, afh ☃)
  {
    d(☃.e(), ☃);
    d(☃.f(), ☃);
    d(☃.b(), ☃);
    d(☃.a(), ☃);
    d(☃.c(), ☃);
    d(☃.d(), ☃);
  }
  
  public void a(cj ☃, afh ☃, cq ☃)
  {
    if (☃ != cq.e) {
      d(☃.e(), ☃);
    }
    if (☃ != cq.f) {
      d(☃.f(), ☃);
    }
    if (☃ != cq.a) {
      d(☃.b(), ☃);
    }
    if (☃ != cq.b) {
      d(☃.a(), ☃);
    }
    if (☃ != cq.c) {
      d(☃.c(), ☃);
    }
    if (☃ != cq.d) {
      d(☃.d(), ☃);
    }
  }
  
  public void d(cj ☃, final afh ☃)
  {
    if (this.D) {
      return;
    }
    alz ☃ = p(☃);
    try
    {
      ☃.c().a(this, ☃, ☃, ☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Exception while updating neighbours");
      c ☃ = ☃.a("Block being updated");
      
      ☃.a("Source block type", new Callable()
      {
        public String a()
          throws Exception
        {
          try
          {
            return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(afh.a(☃)), ☃.a(), ☃.getClass().getCanonicalName() });
          }
          catch (Throwable ☃) {}
          return "ID #" + afh.a(☃);
        }
      });
      c.a(☃, ☃, ☃);
      
      throw new e(☃);
    }
  }
  
  public boolean a(cj ☃, afh ☃)
  {
    return false;
  }
  
  public boolean i(cj ☃)
  {
    return f(☃).d(☃);
  }
  
  public boolean j(cj ☃)
  {
    if (☃.o() >= F()) {
      return i(☃);
    }
    cj ☃ = new cj(☃.n(), F(), ☃.p());
    if (!i(☃)) {
      return false;
    }
    ☃ = ☃.b();
    while (☃.o() > ☃.o())
    {
      afh ☃ = p(☃).c();
      if ((☃.p() > 0) && (!☃.t().d())) {
        return false;
      }
      ☃ = ☃.b();
    }
    return true;
  }
  
  public int k(cj ☃)
  {
    if (☃.o() < 0) {
      return 0;
    }
    if (☃.o() >= 256) {
      ☃ = new cj(☃.n(), 255, ☃.p());
    }
    return f(☃).a(☃, 0);
  }
  
  public int l(cj ☃)
  {
    return c(☃, true);
  }
  
  public int c(cj ☃, boolean ☃)
  {
    if ((☃.n() < -30000000) || (☃.p() < -30000000) || (☃.n() >= 30000000) || (☃.p() >= 30000000)) {
      return 15;
    }
    if ((☃) && 
      (p(☃).c().s()))
    {
      int ☃ = c(☃.a(), false);
      int ☃ = c(☃.f(), false);
      int ☃ = c(☃.e(), false);
      int ☃ = c(☃.d(), false);
      int ☃ = c(☃.c(), false);
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      return ☃;
    }
    if (☃.o() < 0) {
      return 0;
    }
    if (☃.o() >= 256) {
      ☃ = new cj(☃.n(), 255, ☃.p());
    }
    amy ☃ = f(☃);
    return ☃.a(☃, this.I);
  }
  
  public cj m(cj ☃)
  {
    int ☃;
    int ☃;
    if ((☃.n() < -30000000) || (☃.p() < -30000000) || (☃.n() >= 30000000) || (☃.p() >= 30000000))
    {
      ☃ = F() + 1;
    }
    else
    {
      int ☃;
      if (a(☃.n() >> 4, ☃.p() >> 4, true)) {
        ☃ = a(☃.n() >> 4, ☃.p() >> 4).b(☃.n() & 0xF, ☃.p() & 0xF);
      } else {
        ☃ = 0;
      }
    }
    return new cj(☃.n(), ☃, ☃.p());
  }
  
  public int b(int ☃, int ☃)
  {
    if ((☃ < -30000000) || (☃ < -30000000) || (☃ >= 30000000) || (☃ >= 30000000)) {
      return F() + 1;
    }
    if (!a(☃ >> 4, ☃ >> 4, true)) {
      return 0;
    }
    amy ☃ = a(☃ >> 4, ☃ >> 4);
    return ☃.v();
  }
  
  public int a(ads ☃, cj ☃)
  {
    if ((this.t.o()) && (☃ == ads.a)) {
      return 0;
    }
    if (☃.o() < 0) {
      ☃ = new cj(☃.n(), 0, ☃.p());
    }
    if (!a(☃)) {
      return ☃.c;
    }
    if (!e(☃)) {
      return ☃.c;
    }
    if (p(☃).c().s())
    {
      int ☃ = b(☃, ☃.a());
      int ☃ = b(☃, ☃.f());
      int ☃ = b(☃, ☃.e());
      int ☃ = b(☃, ☃.d());
      int ☃ = b(☃, ☃.c());
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      return ☃;
    }
    amy ☃ = f(☃);
    return ☃.a(☃, ☃);
  }
  
  public int b(ads ☃, cj ☃)
  {
    if (☃.o() < 0) {
      ☃ = new cj(☃.n(), 0, ☃.p());
    }
    if (!a(☃)) {
      return ☃.c;
    }
    if (!e(☃)) {
      return ☃.c;
    }
    amy ☃ = f(☃);
    return ☃.a(☃, ☃);
  }
  
  public void a(ads ☃, cj ☃, int ☃)
  {
    if (!a(☃)) {
      return;
    }
    if (!e(☃)) {
      return;
    }
    amy ☃ = f(☃);
    ☃.a(☃, ☃, ☃);
    n(☃);
  }
  
  public void n(cj ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).b(☃);
    }
  }
  
  public int b(cj ☃, int ☃)
  {
    int ☃ = a(ads.a, ☃);
    int ☃ = a(ads.b, ☃);
    if (☃ < ☃) {
      ☃ = ☃;
    }
    return ☃ << 20 | ☃ << 4;
  }
  
  public float o(cj ☃)
  {
    return this.t.p()[l(☃)];
  }
  
  public alz p(cj ☃)
  {
    if (!a(☃)) {
      return afi.a.Q();
    }
    amy ☃ = f(☃);
    return ☃.g(☃);
  }
  
  public boolean w()
  {
    return this.I < 4;
  }
  
  public auh a(aui ☃, aui ☃)
  {
    return a(☃, ☃, false, false, false);
  }
  
  public auh a(aui ☃, aui ☃, boolean ☃)
  {
    return a(☃, ☃, ☃, false, false);
  }
  
  public auh a(aui ☃, aui ☃, boolean ☃, boolean ☃, boolean ☃)
  {
    if ((Double.isNaN(☃.a)) || (Double.isNaN(☃.b)) || (Double.isNaN(☃.c))) {
      return null;
    }
    if ((Double.isNaN(☃.a)) || (Double.isNaN(☃.b)) || (Double.isNaN(☃.c))) {
      return null;
    }
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.c);
    
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.c);
    
    cj ☃ = new cj(☃, ☃, ☃);
    
    alz ☃ = p(☃);
    afh ☃ = ☃.c();
    if ((!☃) || (☃.a(this, ☃, ☃) != null)) {
      if (☃.a(☃, ☃))
      {
        auh ☃ = ☃.a(this, ☃, ☃, ☃);
        if (☃ != null) {
          return ☃;
        }
      }
    }
    auh ☃ = null;
    
    int ☃ = 200;
    while (☃-- >= 0)
    {
      if ((Double.isNaN(☃.a)) || (Double.isNaN(☃.b)) || (Double.isNaN(☃.c))) {
        return null;
      }
      if ((☃ == ☃) && (☃ == ☃) && (☃ == ☃)) {
        return ☃ ? ☃ : null;
      }
      boolean ☃ = true;
      boolean ☃ = true;
      boolean ☃ = true;
      
      double ☃ = 999.0D;
      double ☃ = 999.0D;
      double ☃ = 999.0D;
      if (☃ > ☃) {
        ☃ = ☃ + 1.0D;
      } else if (☃ < ☃) {
        ☃ = ☃ + 0.0D;
      } else {
        ☃ = false;
      }
      if (☃ > ☃) {
        ☃ = ☃ + 1.0D;
      } else if (☃ < ☃) {
        ☃ = ☃ + 0.0D;
      } else {
        ☃ = false;
      }
      if (☃ > ☃) {
        ☃ = ☃ + 1.0D;
      } else if (☃ < ☃) {
        ☃ = ☃ + 0.0D;
      } else {
        ☃ = false;
      }
      double ☃ = 999.0D;
      double ☃ = 999.0D;
      double ☃ = 999.0D;
      
      double ☃ = ☃.a - ☃.a;
      double ☃ = ☃.b - ☃.b;
      double ☃ = ☃.c - ☃.c;
      if (☃) {
        ☃ = (☃ - ☃.a) / ☃;
      }
      if (☃) {
        ☃ = (☃ - ☃.b) / ☃;
      }
      if (☃) {
        ☃ = (☃ - ☃.c) / ☃;
      }
      if (☃ == -0.0D) {
        ☃ = -1.0E-4D;
      }
      if (☃ == -0.0D) {
        ☃ = -1.0E-4D;
      }
      if (☃ == -0.0D) {
        ☃ = -1.0E-4D;
      }
      cq ☃;
      if ((☃ < ☃) && (☃ < ☃))
      {
        cq ☃ = ☃ > ☃ ? cq.e : cq.f;
        ☃ = new aui(☃, ☃.b + ☃ * ☃, ☃.c + ☃ * ☃);
      }
      else if (☃ < ☃)
      {
        cq ☃ = ☃ > ☃ ? cq.a : cq.b;
        ☃ = new aui(☃.a + ☃ * ☃, ☃, ☃.c + ☃ * ☃);
      }
      else
      {
        ☃ = ☃ > ☃ ? cq.c : cq.d;
        ☃ = new aui(☃.a + ☃ * ☃, ☃.b + ☃ * ☃, ☃);
      }
      ☃ = ns.c(☃.a) - (☃ == cq.f ? 1 : 0);
      ☃ = ns.c(☃.b) - (☃ == cq.b ? 1 : 0);
      ☃ = ns.c(☃.c) - (☃ == cq.d ? 1 : 0);
      
      ☃ = new cj(☃, ☃, ☃);
      alz ☃ = p(☃);
      afh ☃ = ☃.c();
      if ((!☃) || (☃.a(this, ☃, ☃) != null)) {
        if (☃.a(☃, ☃))
        {
          auh ☃ = ☃.a(this, ☃, ☃, ☃);
          if (☃ != null) {
            return ☃;
          }
        }
        else
        {
          ☃ = new auh(auh.a.a, ☃, ☃, ☃);
        }
      }
    }
    return ☃ ? ☃ : null;
  }
  
  public void a(pk ☃, String ☃, float ☃, float ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃.s, ☃.t, ☃.u, ☃, ☃);
    }
  }
  
  public void a(wn ☃, String ☃, float ☃, float ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃, ☃.s, ☃.t, ☃.u, ☃, ☃);
    }
  }
  
  public void a(double ☃, double ☃, double ☃, String ☃, float ☃, float ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public void a(double ☃, double ☃, double ☃, String ☃, float ☃, float ☃, boolean ☃) {}
  
  public void a(cj ☃, String ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃);
    }
  }
  
  public void a(cy ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    a(☃.c(), ☃.e(), ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public void a(cy ☃, boolean ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    a(☃.c(), ☃.e() | ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  private void a(int ☃, boolean ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public boolean c(pk ☃)
  {
    this.k.add(☃);
    return true;
  }
  
  public boolean d(pk ☃)
  {
    int ☃ = ns.c(☃.s / 16.0D);
    int ☃ = ns.c(☃.u / 16.0D);
    
    boolean ☃ = ☃.n;
    if ((☃ instanceof wn)) {
      ☃ = true;
    }
    if ((☃) || (a(☃, ☃, true)))
    {
      if ((☃ instanceof wn))
      {
        wn ☃ = (wn)☃;
        this.j.add(☃);
        d();
      }
      a(☃, ☃).a(☃);
      this.f.add(☃);
      a(☃);
      return true;
    }
    return false;
  }
  
  protected void a(pk ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃);
    }
  }
  
  protected void b(pk ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).b(☃);
    }
  }
  
  public void e(pk ☃)
  {
    if (☃.l != null) {
      ☃.l.a(null);
    }
    if (☃.m != null) {
      ☃.a(null);
    }
    ☃.J();
    if ((☃ instanceof wn))
    {
      this.j.remove(☃);
      d();
      b(☃);
    }
  }
  
  public void f(pk ☃)
  {
    ☃.J();
    if ((☃ instanceof wn))
    {
      this.j.remove(☃);
      d();
    }
    int ☃ = ☃.ae;
    int ☃ = ☃.ag;
    if ((☃.ad) && (a(☃, ☃, true))) {
      a(☃, ☃).b(☃);
    }
    this.f.remove(☃);
    b(☃);
  }
  
  public void a(ado ☃)
  {
    this.u.add(☃);
  }
  
  public void b(ado ☃)
  {
    this.u.remove(☃);
  }
  
  public List<aug> a(pk ☃, aug ☃)
  {
    List<aug> ☃ = Lists.newArrayList();
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    
    ams ☃ = af();
    boolean ☃ = ☃.aT();
    boolean ☃ = a(☃, ☃);
    
    alz ☃ = afi.b.Q();
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        if (e(☃.c(☃, 64, ☃))) {
          for (int ☃ = ☃ - 1; ☃ < ☃; ☃++)
          {
            ☃.c(☃, ☃, ☃);
            if ((☃) && (☃)) {
              ☃.h(false);
            } else if ((!☃) && (!☃)) {
              ☃.h(true);
            }
            alz ☃ = ☃;
            if ((☃.a(☃)) || (!☃)) {
              ☃ = p(☃);
            }
            ☃.c().a(this, ☃, ☃, ☃, ☃, ☃);
          }
        }
      }
    }
    double ☃ = 0.25D;
    List<pk> ☃ = b(☃, ☃.b(☃, ☃, ☃));
    for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
      if ((☃.l != ☃) && (☃.m != ☃))
      {
        aug ☃ = ((pk)☃.get(☃)).S();
        if ((☃ != null) && (☃.b(☃))) {
          ☃.add(☃);
        }
        ☃ = ☃.j((pk)☃.get(☃));
        if ((☃ != null) && (☃.b(☃))) {
          ☃.add(☃);
        }
      }
    }
    return ☃;
  }
  
  public boolean a(ams ☃, pk ☃)
  {
    double ☃ = ☃.b();
    double ☃ = ☃.c();
    double ☃ = ☃.d();
    double ☃ = ☃.e();
    if (☃.aT())
    {
      ☃ += 1.0D;
      ☃ += 1.0D;
      ☃ -= 1.0D;
      ☃ -= 1.0D;
    }
    else
    {
      ☃ -= 1.0D;
      ☃ -= 1.0D;
      ☃ += 1.0D;
      ☃ += 1.0D;
    }
    return (☃.s > ☃) && (☃.s < ☃) && (☃.u > ☃) && (☃.u < ☃);
  }
  
  public List<aug> a(aug ☃)
  {
    List<aug> ☃ = Lists.newArrayList();
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        if (e(☃.c(☃, 64, ☃))) {
          for (int ☃ = ☃ - 1; ☃ < ☃; ☃++)
          {
            ☃.c(☃, ☃, ☃);
            alz ☃;
            alz ☃;
            if ((☃ < -30000000) || (☃ >= 30000000) || (☃ < -30000000) || (☃ >= 30000000)) {
              ☃ = afi.h.Q();
            } else {
              ☃ = p(☃);
            }
            ☃.c().a(this, ☃, ☃, ☃, ☃, null);
          }
        }
      }
    }
    return ☃;
  }
  
  public int a(float ☃)
  {
    float ☃ = c(☃);
    float ☃ = 1.0F - (ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.5F);
    ☃ = ns.a(☃, 0.0F, 1.0F);
    ☃ = 1.0F - ☃;
    ☃ = (float)(☃ * (1.0D - j(☃) * 5.0F / 16.0D));
    ☃ = (float)(☃ * (1.0D - h(☃) * 5.0F / 16.0D));
    ☃ = 1.0F - ☃;
    return (int)(☃ * 11.0F);
  }
  
  public float b(float ☃)
  {
    float ☃ = c(☃);
    
    float ☃ = 1.0F - (ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.2F);
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    ☃ = 1.0F - ☃;
    
    ☃ = (float)(☃ * (1.0D - j(☃) * 5.0F / 16.0D));
    ☃ = (float)(☃ * (1.0D - h(☃) * 5.0F / 16.0D));
    
    return ☃ * 0.8F + 0.2F;
  }
  
  public aui a(pk ☃, float ☃)
  {
    float ☃ = c(☃);
    
    float ☃ = ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    int ☃ = ns.c(☃.s);
    int ☃ = ns.c(☃.t);
    int ☃ = ns.c(☃.u);
    cj ☃ = new cj(☃, ☃, ☃);
    ady ☃ = b(☃);
    float ☃ = ☃.a(☃);
    int ☃ = ☃.a(☃);
    
    float ☃ = (☃ >> 16 & 0xFF) / 255.0F;
    float ☃ = (☃ >> 8 & 0xFF) / 255.0F;
    float ☃ = (☃ & 0xFF) / 255.0F;
    ☃ *= ☃;
    ☃ *= ☃;
    ☃ *= ☃;
    
    float ☃ = j(☃);
    if (☃ > 0.0F)
    {
      float ☃ = (☃ * 0.3F + ☃ * 0.59F + ☃ * 0.11F) * 0.6F;
      
      float ☃ = 1.0F - ☃ * 0.75F;
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
    }
    float ☃ = h(☃);
    if (☃ > 0.0F)
    {
      float ☃ = (☃ * 0.3F + ☃ * 0.59F + ☃ * 0.11F) * 0.2F;
      
      float ☃ = 1.0F - ☃ * 0.75F;
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
    }
    if (this.J > 0)
    {
      float ☃ = this.J - ☃;
      if (☃ > 1.0F) {
        ☃ = 1.0F;
      }
      ☃ *= 0.45F;
      ☃ = ☃ * (1.0F - ☃) + 0.8F * ☃;
      ☃ = ☃ * (1.0F - ☃) + 0.8F * ☃;
      ☃ = ☃ * (1.0F - ☃) + 1.0F * ☃;
    }
    return new aui(☃, ☃, ☃);
  }
  
  public float c(float ☃)
  {
    return this.t.a(this.x.g(), ☃);
  }
  
  public int x()
  {
    return this.t.a(this.x.g());
  }
  
  public float y()
  {
    return anm.a[this.t.a(this.x.g())];
  }
  
  public float d(float ☃)
  {
    float ☃ = c(☃);
    return ☃ * 3.1415927F * 2.0F;
  }
  
  public aui e(float ☃)
  {
    float ☃ = c(☃);
    
    float ☃ = ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.5F;
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    float ☃ = (float)(this.d >> 16 & 0xFF) / 255.0F;
    float ☃ = (float)(this.d >> 8 & 0xFF) / 255.0F;
    float ☃ = (float)(this.d & 0xFF) / 255.0F;
    
    float ☃ = j(☃);
    if (☃ > 0.0F)
    {
      float ☃ = (☃ * 0.3F + ☃ * 0.59F + ☃ * 0.11F) * 0.6F;
      
      float ☃ = 1.0F - ☃ * 0.95F;
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
    }
    ☃ *= (☃ * 0.9F + 0.1F);
    ☃ *= (☃ * 0.9F + 0.1F);
    ☃ *= (☃ * 0.85F + 0.15F);
    
    float ☃ = h(☃);
    if (☃ > 0.0F)
    {
      float ☃ = (☃ * 0.3F + ☃ * 0.59F + ☃ * 0.11F) * 0.2F;
      
      float ☃ = 1.0F - ☃ * 0.95F;
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
      ☃ = ☃ * ☃ + ☃ * (1.0F - ☃);
    }
    return new aui(☃, ☃, ☃);
  }
  
  public aui f(float ☃)
  {
    float ☃ = c(☃);
    return this.t.b(☃, ☃);
  }
  
  public cj q(cj ☃)
  {
    return f(☃).h(☃);
  }
  
  public cj r(cj ☃)
  {
    amy ☃ = f(☃);
    
    cj ☃ = new cj(☃.n(), ☃.g() + 16, ☃.p());
    while (☃.o() >= 0)
    {
      cj ☃ = ☃.b();
      arm ☃ = ☃.a(☃).t();
      if ((☃.c()) && (☃ != arm.j)) {
        break;
      }
      ☃ = ☃;
    }
    return ☃;
  }
  
  public float g(float ☃)
  {
    float ☃ = c(☃);
    
    float ☃ = 1.0F - (ns.b(☃ * 3.1415927F * 2.0F) * 2.0F + 0.25F);
    ☃ = ns.a(☃, 0.0F, 1.0F);
    
    return ☃ * ☃ * 0.5F;
  }
  
  public void a(cj ☃, afh ☃, int ☃) {}
  
  public void a(cj ☃, afh ☃, int ☃, int ☃) {}
  
  public void b(cj ☃, afh ☃, int ☃, int ☃) {}
  
  public void i()
  {
    this.B.a("entities");
    this.B.a("global");
    for (int ☃ = 0; ☃ < this.k.size(); ☃++)
    {
      pk ☃ = (pk)this.k.get(☃);
      try
      {
        ☃.W += 1;
        ☃.t_();
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Ticking entity");
        c ☃ = ☃.a("Entity being ticked");
        if (☃ == null) {
          ☃.a("Entity", "~~NULL~~");
        } else {
          ☃.a(☃);
        }
        throw new e(☃);
      }
      if (☃.I) {
        this.k.remove(☃--);
      }
    }
    this.B.c("remove");
    this.f.removeAll(this.g);
    for (int ☃ = 0; ☃ < this.g.size(); ☃++)
    {
      pk ☃ = (pk)this.g.get(☃);
      int ☃ = ☃.ae;
      int ☃ = ☃.ag;
      if ((☃.ad) && (a(☃, ☃, true))) {
        a(☃, ☃).b(☃);
      }
    }
    for (int ☃ = 0; ☃ < this.g.size(); ☃++) {
      b((pk)this.g.get(☃));
    }
    this.g.clear();
    
    this.B.c("regular");
    for (int ☃ = 0; ☃ < this.f.size(); ☃++)
    {
      pk ☃ = (pk)this.f.get(☃);
      if (☃.m != null)
      {
        if ((☃.m.I) || (☃.m.l != ☃))
        {
          ☃.m.l = null;
          ☃.m = null;
        }
      }
      else
      {
        this.B.a("tick");
        if (!☃.I) {
          try
          {
            g(☃);
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Ticking entity");
            c ☃ = ☃.a("Entity being ticked");
            
            ☃.a(☃);
            
            throw new e(☃);
          }
        }
        this.B.b();
        
        this.B.a("remove");
        if (☃.I)
        {
          int ☃ = ☃.ae;
          int ☃ = ☃.ag;
          if ((☃.ad) && (a(☃, ☃, true))) {
            a(☃, ☃).b(☃);
          }
          this.f.remove(☃--);
          b(☃);
        }
        this.B.b();
      }
    }
    this.B.c("blockEntities");
    this.M = true;
    Iterator<akw> ☃ = this.i.iterator();
    while (☃.hasNext())
    {
      akw ☃ = (akw)☃.next();
      if ((!☃.x()) && (☃.t()))
      {
        cj ☃ = ☃.v();
        if ((e(☃)) && (this.N.a(☃))) {
          try
          {
            ((km)☃).c();
          }
          catch (Throwable ☃)
          {
            b ☃ = b.a(☃, "Ticking block entity");
            c ☃ = ☃.a("Block entity being ticked");
            
            ☃.a(☃);
            
            throw new e(☃);
          }
        }
      }
      if (☃.x())
      {
        ☃.remove();
        this.h.remove(☃);
        if (e(☃.v())) {
          f(☃.v()).e(☃.v());
        }
      }
    }
    this.M = false;
    if (!this.c.isEmpty())
    {
      this.i.removeAll(this.c);
      this.h.removeAll(this.c);
      this.c.clear();
    }
    this.B.c("pendingBlockEntities");
    if (!this.b.isEmpty())
    {
      for (int ☃ = 0; ☃ < this.b.size(); ☃++)
      {
        akw ☃ = (akw)this.b.get(☃);
        if (!☃.x())
        {
          if (!this.h.contains(☃)) {
            a(☃);
          }
          if (e(☃.v())) {
            f(☃.v()).a(☃.v(), ☃);
          }
          h(☃.v());
        }
      }
      this.b.clear();
    }
    this.B.b();
    this.B.b();
  }
  
  public boolean a(akw ☃)
  {
    boolean ☃ = this.h.add(☃);
    if ((☃) && ((☃ instanceof km))) {
      this.i.add(☃);
    }
    return ☃;
  }
  
  public void a(Collection<akw> ☃)
  {
    if (this.M) {
      this.b.addAll(☃);
    } else {
      for (akw ☃ : ☃)
      {
        this.h.add(☃);
        if ((☃ instanceof km)) {
          this.i.add(☃);
        }
      }
    }
  }
  
  public void g(pk ☃)
  {
    a(☃, true);
  }
  
  public void a(pk ☃, boolean ☃)
  {
    int ☃ = ns.c(☃.s);
    int ☃ = ns.c(☃.u);
    int ☃ = 32;
    if ((☃) && (!a(☃ - ☃, 0, ☃ - ☃, ☃ + ☃, 0, ☃ + ☃, true))) {
      return;
    }
    ☃.P = ☃.s;
    ☃.Q = ☃.t;
    ☃.R = ☃.u;
    ☃.A = ☃.y;
    ☃.B = ☃.z;
    if ((☃) && (☃.ad))
    {
      ☃.W += 1;
      if (☃.m != null) {
        ☃.ak();
      } else {
        ☃.t_();
      }
    }
    this.B.a("chunkCheck");
    if ((Double.isNaN(☃.s)) || (Double.isInfinite(☃.s))) {
      ☃.s = ☃.P;
    }
    if ((Double.isNaN(☃.t)) || (Double.isInfinite(☃.t))) {
      ☃.t = ☃.Q;
    }
    if ((Double.isNaN(☃.u)) || (Double.isInfinite(☃.u))) {
      ☃.u = ☃.R;
    }
    if ((Double.isNaN(☃.z)) || (Double.isInfinite(☃.z))) {
      ☃.z = ☃.B;
    }
    if ((Double.isNaN(☃.y)) || (Double.isInfinite(☃.y))) {
      ☃.y = ☃.A;
    }
    int ☃ = ns.c(☃.s / 16.0D);
    int ☃ = ns.c(☃.t / 16.0D);
    int ☃ = ns.c(☃.u / 16.0D);
    if ((!☃.ad) || (☃.ae != ☃) || (☃.af != ☃) || (☃.ag != ☃))
    {
      if ((☃.ad) && (a(☃.ae, ☃.ag, true))) {
        a(☃.ae, ☃.ag).a(☃, ☃.af);
      }
      if (a(☃, ☃, true))
      {
        ☃.ad = true;
        a(☃, ☃).a(☃);
      }
      else
      {
        ☃.ad = false;
      }
    }
    this.B.b();
    if ((☃) && (☃.ad) && 
      (☃.l != null)) {
      if ((☃.l.I) || (☃.l.m != ☃))
      {
        ☃.l.m = null;
        ☃.l = null;
      }
      else
      {
        g(☃.l);
      }
    }
  }
  
  public boolean b(aug ☃)
  {
    return a(☃, null);
  }
  
  public boolean a(aug ☃, pk ☃)
  {
    List<pk> ☃ = b(null, ☃);
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      pk ☃ = (pk)☃.get(☃);
      if ((!☃.I) && (☃.k) && (☃ != ☃) && ((☃ == null) || ((☃.m != ☃) && (☃.l != ☃)))) {
        return false;
      }
    }
    return true;
  }
  
  public boolean c(aug ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          afh ☃ = p(☃.c(☃, ☃, ☃)).c();
          if (☃.t() != arm.a) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public boolean d(aug ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        for (int ☃ = ☃; ☃ <= ☃; ☃++)
        {
          afh ☃ = p(☃.c(☃, ☃, ☃)).c();
          if (☃.t().d()) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public boolean e(aug ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    if (a(☃, ☃, ☃, ☃, ☃, ☃, true))
    {
      cj.a ☃ = new cj.a();
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        for (int ☃ = ☃; ☃ < ☃; ☃++) {
          for (int ☃ = ☃; ☃ < ☃; ☃++)
          {
            afh ☃ = p(☃.c(☃, ☃, ☃)).c();
            if ((☃ == afi.ab) || (☃ == afi.k) || (☃ == afi.l)) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public boolean a(aug ☃, arm ☃, pk ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    if (!a(☃, ☃, ☃, ☃, ☃, ☃, true)) {
      return false;
    }
    boolean ☃ = false;
    aui ☃ = new aui(0.0D, 0.0D, 0.0D);
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          ☃.c(☃, ☃, ☃);
          alz ☃ = p(☃);
          afh ☃ = ☃.c();
          if (☃.t() == ☃)
          {
            double ☃ = ☃ + 1 - ahv.b(((Integer)☃.b(ahv.b)).intValue());
            if (☃ >= ☃)
            {
              ☃ = true;
              ☃ = ☃.a(this, ☃, ☃, ☃);
            }
          }
        }
      }
    }
    if ((☃.b() > 0.0D) && (☃.aL()))
    {
      ☃ = ☃.a();
      double ☃ = 0.014D;
      ☃.v += ☃.a * ☃;
      ☃.w += ☃.b * ☃;
      ☃.x += ☃.c * ☃;
    }
    return ☃;
  }
  
  public boolean a(aug ☃, arm ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        for (int ☃ = ☃; ☃ < ☃; ☃++) {
          if (p(☃.c(☃, ☃, ☃)).c().t() == ☃) {
            return true;
          }
        }
      }
    }
    return false;
  }
  
  public boolean b(aug ☃, arm ☃)
  {
    int ☃ = ns.c(☃.a);
    int ☃ = ns.c(☃.d + 1.0D);
    int ☃ = ns.c(☃.b);
    int ☃ = ns.c(☃.e + 1.0D);
    int ☃ = ns.c(☃.c);
    int ☃ = ns.c(☃.f + 1.0D);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃; ☃ < ☃; ☃++) {
      for (int ☃ = ☃; ☃ < ☃; ☃++) {
        for (int ☃ = ☃; ☃ < ☃; ☃++)
        {
          alz ☃ = p(☃.c(☃, ☃, ☃));
          afh ☃ = ☃.c();
          if (☃.t() == ☃)
          {
            int ☃ = ((Integer)☃.b(ahv.b)).intValue();
            double ☃ = ☃ + 1;
            if (☃ < 8) {
              ☃ = ☃ + 1 - ☃ / 8.0D;
            }
            if (☃ >= ☃.b) {
              return true;
            }
          }
        }
      }
    }
    return false;
  }
  
  public adi a(pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃)
  {
    return a(☃, ☃, ☃, ☃, ☃, false, ☃);
  }
  
  public adi a(pk ☃, double ☃, double ☃, double ☃, float ☃, boolean ☃, boolean ☃)
  {
    adi ☃ = new adi(this, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    ☃.a();
    ☃.a(true);
    return ☃;
  }
  
  public float a(aui ☃, aug ☃)
  {
    double ☃ = 1.0D / ((☃.d - ☃.a) * 2.0D + 1.0D);
    double ☃ = 1.0D / ((☃.e - ☃.b) * 2.0D + 1.0D);
    double ☃ = 1.0D / ((☃.f - ☃.c) * 2.0D + 1.0D);
    
    double ☃ = (1.0D - Math.floor(1.0D / ☃) * ☃) / 2.0D;
    double ☃ = (1.0D - Math.floor(1.0D / ☃) * ☃) / 2.0D;
    if ((☃ < 0.0D) || (☃ < 0.0D) || (☃ < 0.0D)) {
      return 0.0F;
    }
    int ☃ = 0;
    int ☃ = 0;
    for (float ☃ = 0.0F; ☃ <= 1.0F; ☃ = (float)(☃ + ☃)) {
      for (float ☃ = 0.0F; ☃ <= 1.0F; ☃ = (float)(☃ + ☃)) {
        for (float ☃ = 0.0F; ☃ <= 1.0F; ☃ = (float)(☃ + ☃))
        {
          double ☃ = ☃.a + (☃.d - ☃.a) * ☃;
          double ☃ = ☃.b + (☃.e - ☃.b) * ☃;
          double ☃ = ☃.c + (☃.f - ☃.c) * ☃;
          if (a(new aui(☃ + ☃, ☃, ☃ + ☃), ☃) == null) {
            ☃++;
          }
          ☃++;
        }
      }
    }
    return ☃ / ☃;
  }
  
  public boolean a(wn ☃, cj ☃, cq ☃)
  {
    ☃ = ☃.a(☃);
    if (p(☃).c() == afi.ab)
    {
      a(☃, 1004, ☃, 0);
      g(☃);
      return true;
    }
    return false;
  }
  
  public String z()
  {
    return "All: " + this.f.size();
  }
  
  public String A()
  {
    return this.v.f();
  }
  
  public akw s(cj ☃)
  {
    if (!a(☃)) {
      return null;
    }
    akw ☃ = null;
    if (this.M) {
      for (int ☃ = 0; ☃ < this.b.size(); ☃++)
      {
        akw ☃ = (akw)this.b.get(☃);
        if ((!☃.x()) && (☃.v().equals(☃)))
        {
          ☃ = ☃;
          break;
        }
      }
    }
    if (☃ == null) {
      ☃ = f(☃).a(☃, amy.a.a);
    }
    if (☃ == null) {
      for (int ☃ = 0; ☃ < this.b.size(); ☃++)
      {
        akw ☃ = (akw)this.b.get(☃);
        if ((!☃.x()) && (☃.v().equals(☃)))
        {
          ☃ = ☃;
          break;
        }
      }
    }
    return ☃;
  }
  
  public void a(cj ☃, akw ☃)
  {
    if ((☃ != null) && (!☃.x())) {
      if (this.M)
      {
        ☃.a(☃);
        
        Iterator<akw> ☃ = this.b.iterator();
        while (☃.hasNext())
        {
          akw ☃ = (akw)☃.next();
          if (☃.v().equals(☃))
          {
            ☃.y();
            ☃.remove();
          }
        }
        this.b.add(☃);
      }
      else
      {
        a(☃);
        
        f(☃).a(☃, ☃);
      }
    }
  }
  
  public void t(cj ☃)
  {
    akw ☃ = s(☃);
    if ((☃ != null) && (this.M))
    {
      ☃.y();
      this.b.remove(☃);
    }
    else
    {
      if (☃ != null)
      {
        this.b.remove(☃);
        this.h.remove(☃);
        this.i.remove(☃);
      }
      f(☃).e(☃);
    }
  }
  
  public void b(akw ☃)
  {
    this.c.add(☃);
  }
  
  public boolean u(cj ☃)
  {
    alz ☃ = p(☃);
    aug ☃ = ☃.c().a(this, ☃, ☃);
    return (☃ != null) && (☃.a() >= 1.0D);
  }
  
  public static boolean a(adq ☃, cj ☃)
  {
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if ((☃.t().k()) && (☃.d())) {
      return true;
    }
    if ((☃ instanceof aju)) {
      return ☃.b(aju.b) == aju.a.a;
    }
    if ((☃ instanceof ahh)) {
      return ☃.b(ahh.a) == ahh.a.a;
    }
    if ((☃ instanceof ahn)) {
      return true;
    }
    if ((☃ instanceof ajp)) {
      return ((Integer)☃.b(ajp.a)).intValue() == 7;
    }
    return false;
  }
  
  public boolean d(cj ☃, boolean ☃)
  {
    if (!a(☃)) {
      return ☃;
    }
    amy ☃ = this.v.a(☃);
    if (☃.f()) {
      return ☃;
    }
    afh ☃ = p(☃).c();
    return (☃.t().k()) && (☃.d());
  }
  
  public void B()
  {
    int ☃ = a(1.0F);
    if (☃ != this.I) {
      this.I = ☃;
    }
  }
  
  public void a(boolean ☃, boolean ☃)
  {
    this.F = ☃;
    this.G = ☃;
  }
  
  public void c()
  {
    p();
  }
  
  protected void C()
  {
    if (this.x.p())
    {
      this.p = 1.0F;
      if (this.x.n()) {
        this.r = 1.0F;
      }
    }
  }
  
  protected void p()
  {
    if (this.t.o()) {
      return;
    }
    if (this.D) {
      return;
    }
    int ☃ = this.x.A();
    if (☃ > 0)
    {
      ☃--;
      this.x.i(☃);
      this.x.f(this.x.n() ? 1 : 2);
      this.x.g(this.x.p() ? 1 : 2);
    }
    int ☃ = this.x.o();
    if (☃ <= 0)
    {
      if (this.x.n()) {
        this.x.f(this.s.nextInt(12000) + 3600);
      } else {
        this.x.f(this.s.nextInt(168000) + 12000);
      }
    }
    else
    {
      ☃--;
      this.x.f(☃);
      if (☃ <= 0) {
        this.x.a(!this.x.n());
      }
    }
    this.q = this.r;
    if (this.x.n()) {
      this.r = ((float)(this.r + 0.01D));
    } else {
      this.r = ((float)(this.r - 0.01D));
    }
    this.r = ns.a(this.r, 0.0F, 1.0F);
    
    int ☃ = this.x.q();
    if (☃ <= 0)
    {
      if (this.x.p()) {
        this.x.g(this.s.nextInt(12000) + 12000);
      } else {
        this.x.g(this.s.nextInt(168000) + 12000);
      }
    }
    else
    {
      ☃--;
      this.x.g(☃);
      if (☃ <= 0) {
        this.x.b(!this.x.p());
      }
    }
    this.o = this.p;
    if (this.x.p()) {
      this.p = ((float)(this.p + 0.01D));
    } else {
      this.p = ((float)(this.p - 0.01D));
    }
    this.p = ns.a(this.p, 0.0F, 1.0F);
  }
  
  protected void D()
  {
    this.E.clear();
    
    this.B.a("buildList");
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      wn ☃ = (wn)this.j.get(☃);
      int ☃ = ns.c(☃.s / 16.0D);
      int ☃ = ns.c(☃.u / 16.0D);
      
      int ☃ = q();
      for (int ☃ = -☃; ☃ <= ☃; ☃++) {
        for (int ☃ = -☃; ☃ <= ☃; ☃++) {
          this.E.add(new adg(☃ + ☃, ☃ + ☃));
        }
      }
    }
    this.B.b();
    if (this.L > 0) {
      this.L -= 1;
    }
    this.B.a("playerCheckLight");
    if (!this.j.isEmpty())
    {
      int ☃ = this.s.nextInt(this.j.size());
      wn ☃ = (wn)this.j.get(☃);
      int ☃ = ns.c(☃.s) + this.s.nextInt(11) - 5;
      int ☃ = ns.c(☃.t) + this.s.nextInt(11) - 5;
      int ☃ = ns.c(☃.u) + this.s.nextInt(11) - 5;
      x(new cj(☃, ☃, ☃));
    }
    this.B.b();
  }
  
  protected abstract int q();
  
  protected void a(int ☃, int ☃, amy ☃)
  {
    this.B.c("moodSound");
    if ((this.L == 0) && (!this.D))
    {
      this.m = (this.m * 3 + 1013904223);
      int ☃ = this.m >> 2;
      int ☃ = ☃ & 0xF;
      int ☃ = ☃ >> 8 & 0xF;
      int ☃ = ☃ >> 16 & 0xFF;
      cj ☃ = new cj(☃, ☃, ☃);
      
      afh ☃ = ☃.a(☃);
      ☃ += ☃;
      ☃ += ☃;
      if ((☃.t() == arm.a) && (k(☃) <= this.s.nextInt(8)) && (b(ads.a, ☃) <= 0))
      {
        wn ☃ = a(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D, 8.0D);
        if ((☃ != null) && (☃.e(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D) > 4.0D))
        {
          a(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D, "ambient.cave.cave", 0.7F, 0.8F + this.s.nextFloat() * 0.2F);
          this.L = (this.s.nextInt(12000) + 6000);
        }
      }
    }
    this.B.c("checkLight");
    ☃.m();
  }
  
  protected void h()
  {
    D();
  }
  
  public void a(afh ☃, cj ☃, Random ☃)
  {
    this.e = true;
    ☃.b(this, ☃, p(☃), ☃);
    this.e = false;
  }
  
  public boolean v(cj ☃)
  {
    return e(☃, false);
  }
  
  public boolean w(cj ☃)
  {
    return e(☃, true);
  }
  
  public boolean e(cj ☃, boolean ☃)
  {
    ady ☃ = b(☃);
    float ☃ = ☃.a(☃);
    if (☃ > 0.15F) {
      return false;
    }
    if ((☃.o() >= 0) && (☃.o() < 256) && (b(ads.b, ☃) < 10))
    {
      alz ☃ = p(☃);
      afh ☃ = ☃.c();
      if (((☃ == afi.j) || (☃ == afi.i)) && (((Integer)☃.b(ahv.b)).intValue() == 0))
      {
        if (!☃) {
          return true;
        }
        boolean ☃ = (F(☃.e())) && (F(☃.f())) && (F(☃.c())) && (F(☃.d()));
        if (!☃) {
          return true;
        }
      }
    }
    return false;
  }
  
  private boolean F(cj ☃)
  {
    return p(☃).c().t() == arm.h;
  }
  
  public boolean f(cj ☃, boolean ☃)
  {
    ady ☃ = b(☃);
    float ☃ = ☃.a(☃);
    if (☃ > 0.15F) {
      return false;
    }
    if (!☃) {
      return true;
    }
    if ((☃.o() >= 0) && (☃.o() < 256) && (b(ads.b, ☃) < 10))
    {
      afh ☃ = p(☃).c();
      if ((☃.t() == arm.a) && (afi.aH.d(this, ☃))) {
        return true;
      }
    }
    return false;
  }
  
  public boolean x(cj ☃)
  {
    boolean ☃ = false;
    if (!this.t.o()) {
      ☃ |= c(ads.a, ☃);
    }
    ☃ |= c(ads.b, ☃);
    return ☃;
  }
  
  int[] H = new int[32768];
  
  private int a(cj ☃, ads ☃)
  {
    if ((☃ == ads.a) && (i(☃))) {
      return 15;
    }
    afh ☃ = p(☃).c();
    int ☃ = ☃ == ads.a ? 0 : ☃.r();
    int ☃ = ☃.p();
    if ((☃ >= 15) && (☃.r() > 0)) {
      ☃ = 1;
    }
    if (☃ < 1) {
      ☃ = 1;
    }
    if (☃ >= 15) {
      return 0;
    }
    if (☃ >= 14) {
      return ☃;
    }
    for (cq ☃ : cq.values())
    {
      cj ☃ = ☃.a(☃);
      int ☃ = b(☃, ☃) - ☃;
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ >= 14) {
        return ☃;
      }
    }
    return ☃;
  }
  
  public boolean c(ads ☃, cj ☃)
  {
    if (!a(☃, 17, false)) {
      return false;
    }
    int ☃ = 0;
    int ☃ = 0;
    
    this.B.a("getBrightness");
    int ☃ = b(☃, ☃);
    int ☃ = a(☃, ☃);
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    if (☃ > ☃)
    {
      this.H[(☃++)] = 133152;
    }
    else if (☃ < ☃)
    {
      this.H[(☃++)] = (0x20820 | ☃ << 18);
      while (☃ < ☃)
      {
        int ☃ = this.H[(☃++)];
        int ☃ = (☃ & 0x3F) - 32 + ☃;
        int ☃ = (☃ >> 6 & 0x3F) - 32 + ☃;
        int ☃ = (☃ >> 12 & 0x3F) - 32 + ☃;
        int ☃ = ☃ >> 18 & 0xF;
        cj ☃ = new cj(☃, ☃, ☃);
        int ☃ = b(☃, ☃);
        if (☃ == ☃)
        {
          a(☃, ☃, 0);
          if (☃ > 0)
          {
            int ☃ = ns.a(☃ - ☃);
            int ☃ = ns.a(☃ - ☃);
            int ☃ = ns.a(☃ - ☃);
            if (☃ + ☃ + ☃ < 17)
            {
              cj.a ☃ = new cj.a();
              for (cq ☃ : cq.values())
              {
                int ☃ = ☃ + ☃.g();
                int ☃ = ☃ + ☃.h();
                int ☃ = ☃ + ☃.i();
                ☃.c(☃, ☃, ☃);
                int ☃ = Math.max(1, p(☃).c().p());
                
                ☃ = b(☃, ☃);
                if ((☃ == ☃ - ☃) && (☃ < this.H.length)) {
                  this.H[(☃++)] = (☃ - ☃ + 32 | ☃ - ☃ + 32 << 6 | ☃ - ☃ + 32 << 12 | ☃ - ☃ << 18);
                }
              }
            }
          }
        }
      }
      ☃ = 0;
    }
    this.B.b();
    
    this.B.a("checkedPosition < toCheckCount");
    while (☃ < ☃)
    {
      int ☃ = this.H[(☃++)];
      int ☃ = (☃ & 0x3F) - 32 + ☃;
      int ☃ = (☃ >> 6 & 0x3F) - 32 + ☃;
      int ☃ = (☃ >> 12 & 0x3F) - 32 + ☃;
      cj ☃ = new cj(☃, ☃, ☃);
      
      int ☃ = b(☃, ☃);
      int ☃ = a(☃, ☃);
      if (☃ != ☃)
      {
        a(☃, ☃, ☃);
        if (☃ > ☃)
        {
          int ☃ = Math.abs(☃ - ☃);
          int ☃ = Math.abs(☃ - ☃);
          int ☃ = Math.abs(☃ - ☃);
          boolean ☃ = ☃ < this.H.length - 6;
          if ((☃ + ☃ + ☃ < 17) && (☃))
          {
            if (b(☃, ☃.e()) < ☃) {
              this.H[(☃++)] = (☃ - 1 - ☃ + 32 + (☃ - ☃ + 32 << 6) + (☃ - ☃ + 32 << 12));
            }
            if (b(☃, ☃.f()) < ☃) {
              this.H[(☃++)] = (☃ + 1 - ☃ + 32 + (☃ - ☃ + 32 << 6) + (☃ - ☃ + 32 << 12));
            }
            if (b(☃, ☃.b()) < ☃) {
              this.H[(☃++)] = (☃ - ☃ + 32 + (☃ - 1 - ☃ + 32 << 6) + (☃ - ☃ + 32 << 12));
            }
            if (b(☃, ☃.a()) < ☃) {
              this.H[(☃++)] = (☃ - ☃ + 32 + (☃ + 1 - ☃ + 32 << 6) + (☃ - ☃ + 32 << 12));
            }
            if (b(☃, ☃.c()) < ☃) {
              this.H[(☃++)] = (☃ - ☃ + 32 + (☃ - ☃ + 32 << 6) + (☃ - 1 - ☃ + 32 << 12));
            }
            if (b(☃, ☃.d()) < ☃) {
              this.H[(☃++)] = (☃ - ☃ + 32 + (☃ - ☃ + 32 << 6) + (☃ + 1 - ☃ + 32 << 12));
            }
          }
        }
      }
    }
    this.B.b();
    
    return true;
  }
  
  public boolean a(boolean ☃)
  {
    return false;
  }
  
  public List<adw> a(amy ☃, boolean ☃)
  {
    return null;
  }
  
  public List<adw> a(aqe ☃, boolean ☃)
  {
    return null;
  }
  
  public List<pk> b(pk ☃, aug ☃)
  {
    return a(☃, ☃, po.d);
  }
  
  public List<pk> a(pk ☃, aug ☃, Predicate<? super pk> ☃)
  {
    List<pk> ☃ = Lists.newArrayList();
    int ☃ = ns.c((☃.a - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.d + 2.0D) / 16.0D);
    int ☃ = ns.c((☃.c - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.f + 2.0D) / 16.0D);
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        if (a(☃, ☃, true)) {
          a(☃, ☃).a(☃, ☃, ☃, ☃);
        }
      }
    }
    return ☃;
  }
  
  public <T extends pk> List<T> a(Class<? extends T> ☃, Predicate<? super T> ☃)
  {
    List<T> ☃ = Lists.newArrayList();
    for (pk ☃ : this.f) {
      if ((☃.isAssignableFrom(☃.getClass())) && (☃.apply(☃))) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public <T extends pk> List<T> b(Class<? extends T> ☃, Predicate<? super T> ☃)
  {
    List<T> ☃ = Lists.newArrayList();
    for (pk ☃ : this.j) {
      if ((☃.isAssignableFrom(☃.getClass())) && (☃.apply(☃))) {
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public <T extends pk> List<T> a(Class<? extends T> ☃, aug ☃)
  {
    return a(☃, ☃, po.d);
  }
  
  public <T extends pk> List<T> a(Class<? extends T> ☃, aug ☃, Predicate<? super T> ☃)
  {
    int ☃ = ns.c((☃.a - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.d + 2.0D) / 16.0D);
    int ☃ = ns.c((☃.c - 2.0D) / 16.0D);
    int ☃ = ns.c((☃.f + 2.0D) / 16.0D);
    List<T> ☃ = Lists.newArrayList();
    for (int ☃ = ☃; ☃ <= ☃; ☃++) {
      for (int ☃ = ☃; ☃ <= ☃; ☃++) {
        if (a(☃, ☃, true)) {
          a(☃, ☃).a(☃, ☃, ☃, ☃);
        }
      }
    }
    return ☃;
  }
  
  public <T extends pk> T a(Class<? extends T> ☃, aug ☃, T ☃)
  {
    List<T> ☃ = a(☃, ☃);
    T ☃ = null;
    double ☃ = Double.MAX_VALUE;
    for (int ☃ = 0; ☃ < ☃.size(); ☃++)
    {
      T ☃ = (pk)☃.get(☃);
      if (☃ != ☃) {
        if (po.d.apply(☃))
        {
          double ☃ = ☃.h(☃);
          if (☃ <= ☃)
          {
            ☃ = ☃;
            ☃ = ☃;
          }
        }
      }
    }
    return ☃;
  }
  
  public pk a(int ☃)
  {
    return (pk)this.l.a(☃);
  }
  
  public List<pk> E()
  {
    return this.f;
  }
  
  public void b(cj ☃, akw ☃)
  {
    if (e(☃)) {
      f(☃).e();
    }
  }
  
  public int a(Class<?> ☃)
  {
    int ☃ = 0;
    for (pk ☃ : this.f) {
      if ((!(☃ instanceof ps)) || (!((ps)☃).bZ())) {
        if (☃.isAssignableFrom(☃.getClass())) {
          ☃++;
        }
      }
    }
    return ☃;
  }
  
  public void b(Collection<pk> ☃)
  {
    this.f.addAll(☃);
    for (pk ☃ : ☃) {
      a(☃);
    }
  }
  
  public void c(Collection<pk> ☃)
  {
    this.g.addAll(☃);
  }
  
  public boolean a(afh ☃, cj ☃, boolean ☃, cq ☃, pk ☃, zx ☃)
  {
    afh ☃ = p(☃).c();
    
    aug ☃ = ☃ ? null : ☃.a(this, ☃, ☃.Q());
    if ((☃ != null) && (!a(☃, ☃))) {
      return false;
    }
    if ((☃.t() == arm.q) && (☃ == afi.cf)) {
      return true;
    }
    return (☃.t().j()) && (☃.a(this, ☃, ☃, ☃));
  }
  
  public int F()
  {
    return this.a;
  }
  
  public void b(int ☃)
  {
    this.a = ☃;
  }
  
  public int a(cj ☃, cq ☃)
  {
    alz ☃ = p(☃);
    return ☃.c().b(this, ☃, ☃, ☃);
  }
  
  public adr G()
  {
    return this.x.u();
  }
  
  public int y(cj ☃)
  {
    int ☃ = 0;
    ☃ = Math.max(☃, a(☃.b(), cq.a));
    if (☃ >= 15) {
      return ☃;
    }
    ☃ = Math.max(☃, a(☃.a(), cq.b));
    if (☃ >= 15) {
      return ☃;
    }
    ☃ = Math.max(☃, a(☃.c(), cq.c));
    if (☃ >= 15) {
      return ☃;
    }
    ☃ = Math.max(☃, a(☃.d(), cq.d));
    if (☃ >= 15) {
      return ☃;
    }
    ☃ = Math.max(☃, a(☃.e(), cq.e));
    if (☃ >= 15) {
      return ☃;
    }
    ☃ = Math.max(☃, a(☃.f(), cq.f));
    if (☃ >= 15) {
      return ☃;
    }
    return ☃;
  }
  
  public boolean b(cj ☃, cq ☃)
  {
    return c(☃, ☃) > 0;
  }
  
  public int c(cj ☃, cq ☃)
  {
    alz ☃ = p(☃);
    afh ☃ = ☃.c();
    if (☃.v()) {
      return y(☃);
    }
    return ☃.a(this, ☃, ☃, ☃);
  }
  
  public boolean z(cj ☃)
  {
    if (c(☃.b(), cq.a) > 0) {
      return true;
    }
    if (c(☃.a(), cq.b) > 0) {
      return true;
    }
    if (c(☃.c(), cq.c) > 0) {
      return true;
    }
    if (c(☃.d(), cq.d) > 0) {
      return true;
    }
    if (c(☃.e(), cq.e) > 0) {
      return true;
    }
    if (c(☃.f(), cq.f) > 0) {
      return true;
    }
    return false;
  }
  
  public int A(cj ☃)
  {
    int ☃ = 0;
    for (cq ☃ : cq.values())
    {
      int ☃ = c(☃.a(☃), ☃);
      if (☃ >= 15) {
        return 15;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public wn a(pk ☃, double ☃)
  {
    return a(☃.s, ☃.t, ☃.u, ☃);
  }
  
  public wn a(double ☃, double ☃, double ☃, double ☃)
  {
    double ☃ = -1.0D;
    wn ☃ = null;
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      wn ☃ = (wn)this.j.get(☃);
      if (po.d.apply(☃))
      {
        double ☃ = ☃.e(☃, ☃, ☃);
        if (((☃ < 0.0D) || (☃ < ☃ * ☃)) && ((☃ == -1.0D) || (☃ < ☃)))
        {
          ☃ = ☃;
          ☃ = ☃;
        }
      }
    }
    return ☃;
  }
  
  public boolean b(double ☃, double ☃, double ☃, double ☃)
  {
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      wn ☃ = (wn)this.j.get(☃);
      if (po.d.apply(☃))
      {
        double ☃ = ☃.e(☃, ☃, ☃);
        if ((☃ < 0.0D) || (☃ < ☃ * ☃)) {
          return true;
        }
      }
    }
    return false;
  }
  
  public wn a(String ☃)
  {
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      wn ☃ = (wn)this.j.get(☃);
      if (☃.equals(☃.e_())) {
        return ☃;
      }
    }
    return null;
  }
  
  public wn b(UUID ☃)
  {
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      wn ☃ = (wn)this.j.get(☃);
      if (☃.equals(☃.aK())) {
        return ☃;
      }
    }
    return null;
  }
  
  public void H() {}
  
  public void I()
    throws adn
  {
    this.w.c();
  }
  
  public void a(long ☃)
  {
    this.x.b(☃);
  }
  
  public long J()
  {
    return this.x.b();
  }
  
  public long K()
  {
    return this.x.f();
  }
  
  public long L()
  {
    return this.x.g();
  }
  
  public void b(long ☃)
  {
    this.x.c(☃);
  }
  
  public cj M()
  {
    cj ☃ = new cj(this.x.c(), this.x.d(), this.x.e());
    if (!af().a(☃)) {
      ☃ = m(new cj(af().f(), 0.0D, af().g()));
    }
    return ☃;
  }
  
  public void B(cj ☃)
  {
    this.x.a(☃);
  }
  
  public void h(pk ☃)
  {
    int ☃ = ns.c(☃.s / 16.0D);
    int ☃ = ns.c(☃.u / 16.0D);
    int ☃ = 2;
    for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++) {
      for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++) {
        a(☃, ☃);
      }
    }
    if (!this.f.contains(☃)) {
      this.f.add(☃);
    }
  }
  
  public boolean a(wn ☃, cj ☃)
  {
    return true;
  }
  
  public void a(pk ☃, byte ☃) {}
  
  public amv N()
  {
    return this.v;
  }
  
  public void c(cj ☃, afh ☃, int ☃, int ☃)
  {
    ☃.a(this, ☃, p(☃), ☃, ☃);
  }
  
  public atp O()
  {
    return this.w;
  }
  
  public ato P()
  {
    return this.x;
  }
  
  public adk Q()
  {
    return this.x.x();
  }
  
  public void d() {}
  
  public float h(float ☃)
  {
    return (this.q + (this.r - this.q) * ☃) * j(☃);
  }
  
  public void i(float ☃)
  {
    this.q = ☃;
    this.r = ☃;
  }
  
  public float j(float ☃)
  {
    return this.o + (this.p - this.o) * ☃;
  }
  
  public void k(float ☃)
  {
    this.o = ☃;
    this.p = ☃;
  }
  
  public boolean R()
  {
    return h(1.0F) > 0.9D;
  }
  
  public boolean S()
  {
    return j(1.0F) > 0.2D;
  }
  
  public boolean C(cj ☃)
  {
    if (!S()) {
      return false;
    }
    if (!i(☃)) {
      return false;
    }
    if (q(☃).o() > ☃.o()) {
      return false;
    }
    ady ☃ = b(☃);
    if (☃.d()) {
      return false;
    }
    if (f(☃, false)) {
      return false;
    }
    return ☃.e();
  }
  
  public boolean D(cj ☃)
  {
    ady ☃ = b(☃);
    return ☃.f();
  }
  
  public aua T()
  {
    return this.z;
  }
  
  public void a(String ☃, ate ☃)
  {
    this.z.a(☃, ☃);
  }
  
  public ate a(Class<? extends ate> ☃, String ☃)
  {
    return this.z.a(☃, ☃);
  }
  
  public int b(String ☃)
  {
    return this.z.a(☃);
  }
  
  public void a(int ☃, cj ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
      ((ado)this.u.get(☃)).a(☃, ☃, ☃);
    }
  }
  
  public void b(int ☃, cj ☃, int ☃)
  {
    a(null, ☃, ☃, ☃);
  }
  
  public void a(wn ☃, int ☃, cj ☃, int ☃)
  {
    try
    {
      for (int ☃ = 0; ☃ < this.u.size(); ☃++) {
        ((ado)this.u.get(☃)).a(☃, ☃, ☃, ☃);
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Playing level event");
      c ☃ = ☃.a("Level event being played");
      
      ☃.a("Block coordinates", c.a(☃));
      ☃.a("Event source", ☃);
      ☃.a("Event type", Integer.valueOf(☃));
      ☃.a("Event data", Integer.valueOf(☃));
      
      throw new e(☃);
    }
  }
  
  public int U()
  {
    return 256;
  }
  
  public int V()
  {
    return this.t.o() ? 128 : 256;
  }
  
  public Random a(int ☃, int ☃, int ☃)
  {
    long ☃ = ☃ * 341873128712L + ☃ * 132897987541L + P().b() + ☃;
    this.s.setSeed(☃);
    return this.s;
  }
  
  public cj a(String ☃, cj ☃)
  {
    return N().a(this, ☃, ☃);
  }
  
  public boolean W()
  {
    return false;
  }
  
  public double X()
  {
    if (this.x.u() == adr.c) {
      return 0.0D;
    }
    return 63.0D;
  }
  
  public c a(b ☃)
  {
    c ☃ = ☃.a("Affected level", 1);
    
    ☃.a("Level name", this.x == null ? "????" : this.x.k());
    
    ☃.a("All players", new Callable()
    {
      public String a()
      {
        return adm.this.j.size() + " total; " + adm.this.j.toString();
      }
    });
    ☃.a("Chunk stats", new Callable()
    {
      public String a()
      {
        return adm.this.v.f();
      }
    });
    try
    {
      this.x.a(☃);
    }
    catch (Throwable ☃)
    {
      ☃.a("Level Data Unobtainable", ☃);
    }
    return ☃;
  }
  
  public void c(int ☃, cj ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.u.size(); ☃++)
    {
      ado ☃ = (ado)this.u.get(☃);
      ☃.b(☃, ☃, ☃);
    }
  }
  
  public Calendar Y()
  {
    if (K() % 600L == 0L) {
      this.K.setTimeInMillis(MinecraftServer.az());
    }
    return this.K;
  }
  
  public void a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, dn ☃) {}
  
  public auo Z()
  {
    return this.C;
  }
  
  public void e(cj ☃, afh ☃)
  {
    for (cq ☃ : cq.c.a)
    {
      cj ☃ = ☃.a(☃);
      if (e(☃))
      {
        alz ☃ = p(☃);
        if (afi.cj.e(☃.c()))
        {
          ☃.c().a(this, ☃, ☃, ☃);
        }
        else if (☃.c().v())
        {
          ☃ = ☃.a(☃);
          ☃ = p(☃);
          if (afi.cj.e(☃.c())) {
            ☃.c().a(this, ☃, ☃, ☃);
          }
        }
      }
    }
  }
  
  public ok E(cj ☃)
  {
    long ☃ = 0L;
    float ☃ = 0.0F;
    if (e(☃))
    {
      ☃ = y();
      ☃ = f(☃).w();
    }
    return new ok(aa(), L(), ☃, ☃);
  }
  
  public oj aa()
  {
    return P().y();
  }
  
  public int ab()
  {
    return this.I;
  }
  
  public void c(int ☃)
  {
    this.I = ☃;
  }
  
  public int ac()
  {
    return this.J;
  }
  
  public void d(int ☃)
  {
    this.J = ☃;
  }
  
  public boolean ad()
  {
    return this.y;
  }
  
  public th ae()
  {
    return this.A;
  }
  
  public ams af()
  {
    return this.N;
  }
  
  public boolean c(int ☃, int ☃)
  {
    cj ☃ = M();
    int ☃ = ☃ * 16 + 8 - ☃.n();
    int ☃ = ☃ * 16 + 8 - ☃.p();
    int ☃ = 128;
    return (☃ >= -☃) && (☃ <= ☃) && (☃ >= -☃) && (☃ <= ☃);
  }
}
