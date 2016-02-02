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
    
    this.y = ((float)(Math.random() * 360.0D));
    
    this.v = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
    this.w = 0.20000000298023224D;
    this.x = ((float)(Math.random() * 0.20000000298023224D - 0.10000000149011612D));
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
    if ((this.d > 0) && (this.d != 32767)) {
      this.d -= 1;
    }
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w -= 0.03999999910593033D;
    this.T = j(this.s, (aR().b + aR().e) / 2.0D, this.u);
    d(this.v, this.w, this.x);
    
    boolean ☃ = ((int)this.p != (int)this.s) || ((int)this.q != (int)this.t) || ((int)this.r != (int)this.u);
    if ((☃) || (this.W % 25 == 0))
    {
      if (this.o.p(new cj(this)).c().t() == arm.i)
      {
        this.w = 0.20000000298023224D;
        this.v = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
        this.x = ((this.V.nextFloat() - this.V.nextFloat()) * 0.2F);
        a("random.fizz", 0.4F, 2.0F + this.V.nextFloat() * 0.4F);
      }
      if (!this.o.D) {
        w();
      }
    }
    float ☃ = 0.98F;
    if (this.C) {
      ☃ = this.o.p(new cj(ns.c(this.s), ns.c(aR().b) - 1, ns.c(this.u))).c().L * 0.98F;
    }
    this.v *= ☃;
    this.w *= 0.9800000190734863D;
    this.x *= ☃;
    if (this.C) {
      this.w *= -0.5D;
    }
    if (this.c != 32768) {
      this.c += 1;
    }
    W();
    if ((!this.o.D) && (this.c >= 6000)) {
      J();
    }
  }
  
  private void w()
  {
    for (uz ☃ : this.o.a(uz.class, aR().b(0.5D, 0.0D, 0.5D))) {
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
    if ((this.d == 32767) || (☃.d == 32767)) {
      return false;
    }
    if ((this.c == 32768) || (☃.c == 32768)) {
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
    if (☃.b < ☃.b) {
      return ☃.a(this);
    }
    if (☃.b + ☃.b > ☃.c()) {
      return false;
    }
    ☃.b += ☃.b;
    ☃.d = Math.max(☃.d, this.d);
    ☃.c = Math.min(☃.c, this.c);
    ☃.a(☃);
    J();
    
    return true;
  }
  
  public void j()
  {
    this.c = 4800;
  }
  
  public boolean W()
  {
    if (this.o.a(aR(), arm.h, this))
    {
      if ((!this.Y) && (!this.aa)) {
        X();
      }
      this.Y = true;
    }
    else
    {
      this.Y = false;
    }
    return this.Y;
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
    this.e = ((int)(this.e - ☃));
    if (this.e <= 0) {
      J();
    }
    return false;
  }
  
  public void b(dn ☃)
  {
    ☃.a("Health", (short)(byte)this.e);
    ☃.a("Age", (short)this.c);
    ☃.a("PickupDelay", (short)this.d);
    if (n() != null) {
      ☃.a("Thrower", this.f);
    }
    if (m() != null) {
      ☃.a("Owner", this.g);
    }
    if (l() != null) {
      ☃.a("Item", l().b(new dn()));
    }
  }
  
  public void a(dn ☃)
  {
    this.e = (☃.e("Health") & 0xFF);
    this.c = ☃.e("Age");
    if (☃.c("PickupDelay")) {
      this.d = ☃.e("PickupDelay");
    }
    if (☃.c("Owner")) {
      this.g = ☃.j("Owner");
    }
    if (☃.c("Thrower")) {
      this.f = ☃.j("Thrower");
    }
    dn ☃ = ☃.m("Item");
    a(zx.a(☃));
    if (l() == null) {
      J();
    }
  }
  
  public void d(wn ☃)
  {
    if (this.o.D) {
      return;
    }
    zx ☃ = l();
    int ☃ = ☃.b;
    if ((this.d == 0) && ((this.g == null) || (6000 - this.c <= 200) || (this.g.equals(☃.e_()))) && (☃.bi.a(☃)))
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
        wn ☃ = this.o.a(n());
        if ((☃ != null) && (☃ != ☃)) {
          ☃.b(mr.x);
        }
      }
      if (!R()) {
        this.o.a(☃, "random.pop", 0.2F, ((this.V.nextFloat() - this.V.nextFloat()) * 0.7F + 1.0F) * 2.0F);
      }
      ☃.a(this, ☃);
      if (☃.b <= 0) {
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
    if (!this.o.D) {
      w();
    }
  }
  
  public zx l()
  {
    zx ☃ = H().f(10);
    if (☃ == null)
    {
      if (this.o != null) {
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
    return this.g;
  }
  
  public void b(String ☃)
  {
    this.g = ☃;
  }
  
  public String n()
  {
    return this.f;
  }
  
  public void c(String ☃)
  {
    this.f = ☃;
  }
  
  public int o()
  {
    return this.c;
  }
  
  public void p()
  {
    this.d = 10;
  }
  
  public void q()
  {
    this.d = 0;
  }
  
  public void r()
  {
    this.d = 32767;
  }
  
  public void a(int ☃)
  {
    this.d = ☃;
  }
  
  public boolean s()
  {
    return this.d > 0;
  }
  
  public void u()
  {
    this.c = 59536;
  }
  
  public void v()
  {
    r();
    this.c = 5999;
  }
}
