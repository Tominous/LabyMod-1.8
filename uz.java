import java.util.Random;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class uz
  extends pk
{
  private static final Logger b = ;
  private int c;
  private int d;
  private int e = 5;
  private String f;
  private String g;
  public float a = (float)(Math.random() * 3.141592653589793D * 2.0D);
  
  public uz(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
    b(☃, ☃, ☃);
    
    y = ((float)(Math.random() * 360.0D));
    
    v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
    w = 0.20000000298023224D;
    x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
  }
  
  public uz(adm ☃, double ☃, double ☃, double ☃, zx ☃)
  {
    this(☃, ☃, ☃, ☃);
    a(☃);
  }
  
  protected boolean s_()
  {
    return false;
  }
  
  public uz(adm ☃)
  {
    super(☃);
    a(0.25F, 0.25F);
    a(new zx(afi.a, 0));
  }
  
  protected void h()
  {
    H().a(10, 5);
  }
  
  public void t_()
  {
    if (l() == null)
    {
      J();
      return;
    }
    super.t_();
    if ((d > 0) && (d != 32767)) {
      d -= 1;
    }
    p = s;
    q = t;
    r = u;
    
    w -= 0.03999999910593033D;
    T = j(s, (aRb + aRe) / 2.0D, u);
    d(v, w, x);
    
    boolean ☃ = ((int)p != (int)s) || ((int)q != (int)t) || ((int)r != (int)u);
    if ((☃) || (W % 25 == 0))
    {
      if (o.p(new cj(this)).c().t() == arm.i)
      {
        w = 0.20000000298023224D;
        v = ((V.nextFloat() - V.nextFloat()) * 0.2F);
        x = ((V.nextFloat() - V.nextFloat()) * 0.2F);
        a("random.fizz", 0.4F, 2.0F + V.nextFloat() * 0.4F);
      }
      if (!o.D) {
        w();
      }
    }
    float ☃ = 0.98F;
    if (C) {
      ☃ = o.p(new cj(ns.c(s), ns.c(aRb) - 1, ns.c(u))).c().L * 0.98F;
    }
    v *= ☃;
    w *= 0.9800000190734863D;
    x *= ☃;
    if (C) {
      w *= -0.5D;
    }
    if (c != 32768) {
      c += 1;
    }
    W();
    if ((!o.D) && (c >= 6000)) {
      J();
    }
  }
  
  private void w()
  {
    for (uz ☃ : o.a(uz.class, aR().b(0.5D, 0.0D, 0.5D))) {
      a(☃);
    }
  }
  
  private boolean a(uz ☃)
  {
    if (☃ == this) {
      return false;
    }
    if ((!☃.ai()) || (!ai())) {
      return false;
    }
    zx ☃ = l();
    zx ☃ = ☃.l();
    if ((d == 32767) || (d == 32767)) {
      return false;
    }
    if ((c == 32768) || (c == 32768)) {
      return false;
    }
    if (☃.b() != ☃.b()) {
      return false;
    }
    if ((☃.n() ^ ☃.n())) {
      return false;
    }
    if ((☃.n()) && (!☃.o().equals(☃.o()))) {
      return false;
    }
    if (☃.b() == null) {
      return false;
    }
    if ((☃.b().k()) && (☃.i() != ☃.i())) {
      return false;
    }
    if (b < b) {
      return ☃.a(this);
    }
    if (b + b > ☃.c()) {
      return false;
    }
    b += b;
    d = Math.max(d, d);
    c = Math.min(c, c);
    ☃.a(☃);
    J();
    
    return true;
  }
  
  public void j()
  {
    c = 4800;
  }
  
  public boolean W()
  {
    if (o.a(aR(), arm.h, this))
    {
      if ((!Y) && (!aa)) {
        X();
      }
      Y = true;
    }
    else
    {
      Y = false;
    }
    return Y;
  }
  
  protected void f(int ☃)
  {
    a(ow.a, ☃);
  }
  
  public boolean a(ow ☃, float ☃)
  {
    if (b(☃)) {
      return false;
    }
    if ((l() != null) && (l().b() == zy.bZ) && (☃.c())) {
      return false;
    }
    ac();
    e = ((int)(e - ☃));
    if (e <= 0) {
      J();
    }
    return false;
  }
  
  public void b(dn ☃)
  {
    ☃.a("Health", (short)(byte)e);
    ☃.a("Age", (short)c);
    ☃.a("PickupDelay", (short)d);
    if (n() != null) {
      ☃.a("Thrower", f);
    }
    if (m() != null) {
      ☃.a("Owner", g);
    }
    if (l() != null) {
      ☃.a("Item", l().b(new dn()));
    }
  }
  
  public void a(dn ☃)
  {
    e = (☃.e("Health") & 0xFF);
    c = ☃.e("Age");
    if (☃.c("PickupDelay")) {
      d = ☃.e("PickupDelay");
    }
    if (☃.c("Owner")) {
      g = ☃.j("Owner");
    }
    if (☃.c("Thrower")) {
      f = ☃.j("Thrower");
    }
    dn ☃ = ☃.m("Item");
    a(zx.a(☃));
    if (l() == null) {
      J();
    }
  }
  
  public void d(wn ☃)
  {
    if (o.D) {
      return;
    }
    zx ☃ = l();
    int ☃ = b;
    if ((d == 0) && ((g == null) || (6000 - c <= 200) || (g.equals(☃.e_()))) && (bi.a(☃)))
    {
      if (☃.b() == zw.a(afi.r)) {
        ☃.b(mr.g);
      }
      if (☃.b() == zw.a(afi.s)) {
        ☃.b(mr.g);
      }
      if (☃.b() == zy.aF) {
        ☃.b(mr.t);
      }
      if (☃.b() == zy.i) {
        ☃.b(mr.w);
      }
      if (☃.b() == zy.bv) {
        ☃.b(mr.A);
      }
      if ((☃.b() == zy.i) && (n() != null))
      {
        wn ☃ = o.a(n());
        if ((☃ != null) && (☃ != ☃)) {
          ☃.b(mr.x);
        }
      }
      if (!R()) {
        o.a(☃, "random.pop", 0.2F, ((V.nextFloat() - V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      }
      ☃.a(this, ☃);
      if (b <= 0) {
        J();
      }
    }
  }
  
  public String e_()
  {
    if (l_()) {
      return aM();
    }
    return di.a("item." + l().a());
  }
  
  public boolean aD()
  {
    return false;
  }
  
  public void c(int ☃)
  {
    super.c(☃);
    if (!o.D) {
      w();
    }
  }
  
  public zx l()
  {
    zx ☃ = H().f(10);
    if (☃ == null)
    {
      if (o != null) {
        b.error("Item entity " + F() + " has no item?!");
      }
      return new zx(afi.b);
    }
    return ☃;
  }
  
  public void a(zx ☃)
  {
    H().b(10, ☃);
    H().i(10);
  }
  
  public String m()
  {
    return g;
  }
  
  public void b(String ☃)
  {
    g = ☃;
  }
  
  public String n()
  {
    return f;
  }
  
  public void c(String ☃)
  {
    f = ☃;
  }
  
  public int o()
  {
    return c;
  }
  
  public void p()
  {
    d = 10;
  }
  
  public void q()
  {
    d = 0;
  }
  
  public void r()
  {
    d = 32767;
  }
  
  public void a(int ☃)
  {
    d = ☃;
  }
  
  public boolean s()
  {
    return d > 0;
  }
  
  public void u()
  {
    c = 59536;
  }
  
  public void v()
  {
    r();
    c = 5999;
  }
}
