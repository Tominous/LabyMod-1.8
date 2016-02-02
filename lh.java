import com.google.common.collect.Sets;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class lh
{
  private static final Logger p = ;
  public pk a;
  public int b;
  public int c;
  public int d;
  public int e;
  public int f;
  public int g;
  public int h;
  public int i;
  public double j;
  public double k;
  public double l;
  public int m;
  private double q;
  private double r;
  private double s;
  private boolean t;
  private boolean u;
  private int v;
  private pk w;
  private boolean x;
  private boolean y;
  public boolean n;
  public Set<lf> o = Sets.newHashSet();
  
  public lh(pk ☃, int ☃, int ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.u = ☃;
    
    this.d = ns.c(☃.s * 32.0D);
    this.e = ns.c(☃.t * 32.0D);
    this.f = ns.c(☃.u * 32.0D);
    this.g = ns.d(☃.y * 256.0F / 360.0F);
    this.h = ns.d(☃.z * 256.0F / 360.0F);
    
    this.i = ns.d(☃.aC() * 256.0F / 360.0F);
    this.y = ☃.C;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof lh)) {
      return ((lh)☃).a.F() == this.a.F();
    }
    return false;
  }
  
  public int hashCode()
  {
    return this.a.F();
  }
  
  public void a(List<wn> ☃)
  {
    this.n = false;
    if ((!this.t) || (this.a.e(this.q, this.r, this.s) > 16.0D))
    {
      this.q = this.a.s;
      this.r = this.a.t;
      this.s = this.a.u;
      this.t = true;
      this.n = true;
      b(☃);
    }
    if ((this.w != this.a.m) || ((this.a.m != null) && (this.m % 60 == 0)))
    {
      this.w = this.a.m;
      a(new hl(0, this.a, this.a.m));
    }
    if (((this.a instanceof uo)) && (this.m % 10 == 0))
    {
      uo ☃ = (uo)this.a;
      zx ☃ = ☃.o();
      atg ☃;
      if ((☃ != null) && ((☃.b() instanceof aab)))
      {
        ☃ = zy.bd.a(☃, this.a.o);
        for (wn ☃ : ☃)
        {
          lf ☃ = (lf)☃;
          ☃.a(☃, ☃);
          
          ff ☃ = zy.bd.c(☃, this.a.o, ☃);
          if (☃ != null) {
            ☃.a.a(☃);
          }
        }
      }
      b();
    }
    if ((this.m % this.c == 0) || (this.a.ai) || (this.a.H().a()))
    {
      if (this.a.m == null)
      {
        this.v += 1;
        int ☃ = ns.c(this.a.s * 32.0D);
        int ☃ = ns.c(this.a.t * 32.0D);
        int ☃ = ns.c(this.a.u * 32.0D);
        int ☃ = ns.d(this.a.y * 256.0F / 360.0F);
        int ☃ = ns.d(this.a.z * 256.0F / 360.0F);
        
        int ☃ = ☃ - this.d;
        int ☃ = ☃ - this.e;
        int ☃ = ☃ - this.f;
        
        ff ☃ = null;
        
        boolean ☃ = (Math.abs(☃) >= 4) || (Math.abs(☃) >= 4) || (Math.abs(☃) >= 4) || (this.m % 60 == 0);
        boolean ☃ = (Math.abs(☃ - this.g) >= 4) || (Math.abs(☃ - this.h) >= 4);
        if ((this.m > 0) || ((this.a instanceof wq))) {
          if ((☃ < -128) || (☃ >= 128) || (☃ < -128) || (☃ >= 128) || (☃ < -128) || (☃ >= 128) || (this.v > 400) || (this.x) || (this.y != this.a.C))
          {
            this.y = this.a.C;
            this.v = 0;
            ☃ = new hz(this.a.F(), ☃, ☃, ☃, (byte)☃, (byte)☃, this.a.C);
          }
          else if (((☃) && (☃)) || ((this.a instanceof wq)))
          {
            ☃ = new gv.b(this.a.F(), (byte)☃, (byte)☃, (byte)☃, (byte)☃, (byte)☃, this.a.C);
          }
          else if (☃)
          {
            ☃ = new gv.a(this.a.F(), (byte)☃, (byte)☃, (byte)☃, this.a.C);
          }
          else if (☃)
          {
            ☃ = new gv.c(this.a.F(), (byte)☃, (byte)☃, this.a.C);
          }
        }
        if (this.u)
        {
          double ☃ = this.a.v - this.j;
          double ☃ = this.a.w - this.k;
          double ☃ = this.a.x - this.l;
          
          double ☃ = 0.02D;
          
          double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
          if ((☃ > ☃ * ☃) || ((☃ > 0.0D) && (this.a.v == 0.0D) && (this.a.w == 0.0D) && (this.a.x == 0.0D)))
          {
            this.j = this.a.v;
            this.k = this.a.w;
            this.l = this.a.x;
            a(new hm(this.a.F(), this.j, this.k, this.l));
          }
        }
        if (☃ != null) {
          a(☃);
        }
        b();
        if (☃)
        {
          this.d = ☃;
          this.e = ☃;
          this.f = ☃;
        }
        if (☃)
        {
          this.g = ☃;
          this.h = ☃;
        }
        this.x = false;
      }
      else
      {
        int ☃ = ns.d(this.a.y * 256.0F / 360.0F);
        int ☃ = ns.d(this.a.z * 256.0F / 360.0F);
        boolean ☃ = (Math.abs(☃ - this.g) >= 4) || (Math.abs(☃ - this.h) >= 4);
        if (☃)
        {
          a(new gv.c(this.a.F(), (byte)☃, (byte)☃, this.a.C));
          this.g = ☃;
          this.h = ☃;
        }
        this.d = ns.c(this.a.s * 32.0D);
        this.e = ns.c(this.a.t * 32.0D);
        this.f = ns.c(this.a.u * 32.0D);
        
        b();
        
        this.x = true;
      }
      int ☃ = ns.d(this.a.aC() * 256.0F / 360.0F);
      if (Math.abs(☃ - this.i) >= 4)
      {
        a(new hf(this.a, (byte)☃));
        this.i = ☃;
      }
      this.a.ai = false;
    }
    this.m += 1;
    if (this.a.G)
    {
      b(new hm(this.a));
      this.a.G = false;
    }
  }
  
  private void b()
  {
    pz ☃ = this.a.H();
    if (☃.a()) {
      b(new hk(this.a.F(), ☃, false));
    }
    if ((this.a instanceof pr))
    {
      qi ☃ = (qi)((pr)this.a).by();
      Set<qc> ☃ = ☃.b();
      if (!☃.isEmpty()) {
        b(new ia(this.a.F(), ☃));
      }
      ☃.clear();
    }
  }
  
  public void a(ff ☃)
  {
    for (lf ☃ : this.o) {
      ☃.a.a(☃);
    }
  }
  
  public void b(ff ☃)
  {
    a(☃);
    if ((this.a instanceof lf)) {
      ((lf)this.a).a.a(☃);
    }
  }
  
  public void a()
  {
    for (lf ☃ : this.o) {
      ☃.d(this.a);
    }
  }
  
  public void a(lf ☃)
  {
    if (this.o.contains(☃))
    {
      ☃.d(this.a);
      this.o.remove(☃);
    }
  }
  
  public void b(lf ☃)
  {
    if (☃ == this.a) {
      return;
    }
    if (c(☃))
    {
      if ((!this.o.contains(☃)) && ((e(☃)) || (this.a.n)))
      {
        this.o.add(☃);
        ff ☃ = c();
        ☃.a.a(☃);
        if (!this.a.H().d()) {
          ☃.a.a(new hk(this.a.F(), this.a.H(), true));
        }
        dn ☃ = this.a.aV();
        if (☃ != null) {
          ☃.a.a(new gj(this.a.F(), ☃));
        }
        if ((this.a instanceof pr))
        {
          qi ☃ = (qi)((pr)this.a).by();
          Collection<qc> ☃ = ☃.c();
          if (!☃.isEmpty()) {
            ☃.a.a(new ia(this.a.F(), ☃));
          }
        }
        this.j = this.a.v;
        this.k = this.a.w;
        this.l = this.a.x;
        if ((this.u) && (!(☃ instanceof fn))) {
          ☃.a.a(new hm(this.a.F(), this.a.v, this.a.w, this.a.x));
        }
        if (this.a.m != null) {
          ☃.a.a(new hl(0, this.a, this.a.m));
        }
        if (((this.a instanceof ps)) && (((ps)this.a).cd() != null)) {
          ☃.a.a(new hl(1, this.a, ((ps)this.a).cd()));
        }
        if ((this.a instanceof pr)) {
          for (int ☃ = 0; ☃ < 5; ☃++)
          {
            zx ☃ = ((pr)this.a).p(☃);
            if (☃ != null) {
              ☃.a.a(new hn(this.a.F(), ☃, ☃));
            }
          }
        }
        if ((this.a instanceof wn))
        {
          wn ☃ = (wn)this.a;
          if (☃.bJ()) {
            ☃.a.a(new ha(☃, new cj(this.a)));
          }
        }
        if ((this.a instanceof pr))
        {
          pr ☃ = (pr)this.a;
          for (pf ☃ : ☃.bl()) {
            ☃.a.a(new ib(this.a.F(), ☃));
          }
        }
      }
    }
    else if (this.o.contains(☃))
    {
      this.o.remove(☃);
      ☃.d(this.a);
    }
  }
  
  public boolean c(lf ☃)
  {
    double ☃ = ☃.s - this.d / 32;
    double ☃ = ☃.u - this.f / 32;
    return (☃ >= -this.b) && (☃ <= this.b) && (☃ >= -this.b) && (☃ <= this.b) && (this.a.a(☃));
  }
  
  private boolean e(lf ☃)
  {
    return ☃.u().t().a(☃, this.a.ae, this.a.ag);
  }
  
  public void b(List<wn> ☃)
  {
    for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
      b((lf)☃.get(☃));
    }
  }
  
  private ff c()
  {
    if (this.a.I) {
      p.warn("Fetching addPacket for removed entity");
    }
    if ((this.a instanceof uz)) {
      return new fk(this.a, 2, 1);
    }
    if ((this.a instanceof lf)) {
      return new fp((wn)this.a);
    }
    if ((this.a instanceof va))
    {
      va ☃ = (va)this.a;
      return new fk(this.a, 10, ☃.s().a());
    }
    if ((this.a instanceof ux)) {
      return new fk(this.a, 1);
    }
    if ((this.a instanceof pi))
    {
      this.i = ns.d(this.a.aC() * 256.0F / 360.0F);
      return new fn((pr)this.a);
    }
    if ((this.a instanceof ur))
    {
      pk ☃ = ((ur)this.a).b;
      return new fk(this.a, 90, ☃ != null ? ☃.F() : this.a.F());
    }
    if ((this.a instanceof wq))
    {
      pk ☃ = ((wq)this.a).c;
      return new fk(this.a, 60, ☃ != null ? ☃.F() : this.a.F());
    }
    if ((this.a instanceof wx)) {
      return new fk(this.a, 61);
    }
    if ((this.a instanceof xc)) {
      return new fk(this.a, 73, ((xc)this.a).o());
    }
    if ((this.a instanceof xb)) {
      return new fk(this.a, 75);
    }
    if ((this.a instanceof xa)) {
      return new fk(this.a, 65);
    }
    if ((this.a instanceof wr)) {
      return new fk(this.a, 72);
    }
    if ((this.a instanceof wt)) {
      return new fk(this.a, 76);
    }
    if ((this.a instanceof ws))
    {
      ws ☃ = (ws)this.a;
      fk ☃ = null;
      int ☃ = 63;
      if ((this.a instanceof ww)) {
        ☃ = 64;
      } else if ((this.a instanceof xd)) {
        ☃ = 66;
      }
      if (☃.a != null) {
        ☃ = new fk(this.a, ☃, ((ws)this.a).a.F());
      } else {
        ☃ = new fk(this.a, ☃, 0);
      }
      ☃.d((int)(☃.b * 8000.0D));
      ☃.e((int)(☃.c * 8000.0D));
      ☃.f((int)(☃.d * 8000.0D));
      return ☃;
    }
    if ((this.a instanceof wz)) {
      return new fk(this.a, 62);
    }
    if ((this.a instanceof vj)) {
      return new fk(this.a, 50);
    }
    if ((this.a instanceof uf)) {
      return new fk(this.a, 51);
    }
    if ((this.a instanceof uy))
    {
      uy ☃ = (uy)this.a;
      return new fk(this.a, 70, afh.f(☃.l()));
    }
    if ((this.a instanceof um)) {
      return new fk(this.a, 78);
    }
    if ((this.a instanceof uq)) {
      return new fo((uq)this.a);
    }
    if ((this.a instanceof uo))
    {
      uo ☃ = (uo)this.a;
      fk ☃ = new fk(this.a, 71, ☃.b.b());
      cj ☃ = ☃.n();
      ☃.a(ns.d(☃.n() * 32));
      ☃.b(ns.d(☃.o() * 32));
      ☃.c(ns.d(☃.p() * 32));
      return ☃;
    }
    if ((this.a instanceof up))
    {
      up ☃ = (up)this.a;
      fk ☃ = new fk(this.a, 77);
      cj ☃ = ☃.n();
      ☃.a(ns.d(☃.n() * 32));
      ☃.b(ns.d(☃.o() * 32));
      ☃.c(ns.d(☃.p() * 32));
      return ☃;
    }
    if ((this.a instanceof pp)) {
      return new fl((pp)this.a);
    }
    throw new IllegalArgumentException("Don't know how to add " + this.a.getClass() + "!");
  }
  
  public void d(lf ☃)
  {
    if (this.o.contains(☃))
    {
      this.o.remove(☃);
      ☃.d(this.a);
    }
  }
}
