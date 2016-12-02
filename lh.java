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
    a = ☃;
    b = ☃;
    c = ☃;
    u = ☃;
    
    d = ns.c(s * 32.0D);
    e = ns.c(t * 32.0D);
    f = ns.c(u * 32.0D);
    g = ns.d(y * 256.0F / 360.0F);
    h = ns.d(z * 256.0F / 360.0F);
    
    i = ns.d(☃.aC() * 256.0F / 360.0F);
    y = C;
  }
  
  public boolean equals(Object ☃)
  {
    if ((☃ instanceof lh)) {
      return a.F() == a.F();
    }
    return false;
  }
  
  public int hashCode()
  {
    return a.F();
  }
  
  public void a(List<wn> ☃)
  {
    n = false;
    if ((!t) || (a.e(q, r, s) > 16.0D))
    {
      q = a.s;
      r = a.t;
      s = a.u;
      t = true;
      n = true;
      b(☃);
    }
    if ((w != a.m) || ((a.m != null) && (m % 60 == 0)))
    {
      w = a.m;
      a(new hl(0, a, a.m));
    }
    if (((a instanceof uo)) && (m % 10 == 0))
    {
      uo ☃ = (uo)a;
      zx ☃ = ☃.o();
      atg ☃;
      if ((☃ != null) && ((☃.b() instanceof aab)))
      {
        ☃ = zy.bd.a(☃, a.o);
        for (wn ☃ : ☃)
        {
          lf ☃ = (lf)☃;
          ☃.a(☃, ☃);
          
          ff ☃ = zy.bd.c(☃, a.o, ☃);
          if (☃ != null) {
            a.a(☃);
          }
        }
      }
      b();
    }
    if ((m % c == 0) || (a.ai) || (a.H().a()))
    {
      if (a.m == null)
      {
        v += 1;
        int ☃ = ns.c(a.s * 32.0D);
        int ☃ = ns.c(a.t * 32.0D);
        int ☃ = ns.c(a.u * 32.0D);
        int ☃ = ns.d(a.y * 256.0F / 360.0F);
        int ☃ = ns.d(a.z * 256.0F / 360.0F);
        
        int ☃ = ☃ - d;
        int ☃ = ☃ - e;
        int ☃ = ☃ - f;
        
        ff ☃ = null;
        
        boolean ☃ = (Math.abs(☃) >= 4) || (Math.abs(☃) >= 4) || (Math.abs(☃) >= 4) || (m % 60 == 0);
        boolean ☃ = (Math.abs(☃ - g) >= 4) || (Math.abs(☃ - h) >= 4);
        if ((m > 0) || ((a instanceof wq))) {
          if ((☃ < -128) || (☃ >= 128) || (☃ < -128) || (☃ >= 128) || (☃ < -128) || (☃ >= 128) || (v > 400) || (x) || (y != a.C))
          {
            y = a.C;
            v = 0;
            ☃ = new hz(a.F(), ☃, ☃, ☃, (byte)☃, (byte)☃, a.C);
          }
          else if (((☃) && (☃)) || ((a instanceof wq)))
          {
            ☃ = new gv.b(a.F(), (byte)☃, (byte)☃, (byte)☃, (byte)☃, (byte)☃, a.C);
          }
          else if (☃)
          {
            ☃ = new gv.a(a.F(), (byte)☃, (byte)☃, (byte)☃, a.C);
          }
          else if (☃)
          {
            ☃ = new gv.c(a.F(), (byte)☃, (byte)☃, a.C);
          }
        }
        if (u)
        {
          double ☃ = a.v - j;
          double ☃ = a.w - k;
          double ☃ = a.x - l;
          
          double ☃ = 0.02D;
          
          double ☃ = ☃ * ☃ + ☃ * ☃ + ☃ * ☃;
          if ((☃ > ☃ * ☃) || ((☃ > 0.0D) && (a.v == 0.0D) && (a.w == 0.0D) && (a.x == 0.0D)))
          {
            j = a.v;
            k = a.w;
            l = a.x;
            a(new hm(a.F(), j, k, l));
          }
        }
        if (☃ != null) {
          a(☃);
        }
        b();
        if (☃)
        {
          d = ☃;
          e = ☃;
          f = ☃;
        }
        if (☃)
        {
          g = ☃;
          h = ☃;
        }
        x = false;
      }
      else
      {
        int ☃ = ns.d(a.y * 256.0F / 360.0F);
        int ☃ = ns.d(a.z * 256.0F / 360.0F);
        boolean ☃ = (Math.abs(☃ - g) >= 4) || (Math.abs(☃ - h) >= 4);
        if (☃)
        {
          a(new gv.c(a.F(), (byte)☃, (byte)☃, a.C));
          g = ☃;
          h = ☃;
        }
        d = ns.c(a.s * 32.0D);
        e = ns.c(a.t * 32.0D);
        f = ns.c(a.u * 32.0D);
        
        b();
        
        x = true;
      }
      int ☃ = ns.d(a.aC() * 256.0F / 360.0F);
      if (Math.abs(☃ - i) >= 4)
      {
        a(new hf(a, (byte)☃));
        i = ☃;
      }
      a.ai = false;
    }
    m += 1;
    if (a.G)
    {
      b(new hm(a));
      a.G = false;
    }
  }
  
  private void b()
  {
    pz ☃ = a.H();
    if (☃.a()) {
      b(new hk(a.F(), ☃, false));
    }
    if ((a instanceof pr))
    {
      qi ☃ = (qi)((pr)a).by();
      Set<qc> ☃ = ☃.b();
      if (!☃.isEmpty()) {
        b(new ia(a.F(), ☃));
      }
      ☃.clear();
    }
  }
  
  public void a(ff ☃)
  {
    for (lf ☃ : o) {
      a.a(☃);
    }
  }
  
  public void b(ff ☃)
  {
    a(☃);
    if ((a instanceof lf)) {
      a).a.a(☃);
    }
  }
  
  public void a()
  {
    for (lf ☃ : o) {
      ☃.d(a);
    }
  }
  
  public void a(lf ☃)
  {
    if (o.contains(☃))
    {
      ☃.d(a);
      o.remove(☃);
    }
  }
  
  public void b(lf ☃)
  {
    if (☃ == a) {
      return;
    }
    if (c(☃))
    {
      if ((!o.contains(☃)) && ((e(☃)) || (a.n)))
      {
        o.add(☃);
        ff ☃ = c();
        a.a(☃);
        if (!a.H().d()) {
          a.a(new hk(a.F(), a.H(), true));
        }
        dn ☃ = a.aV();
        if (☃ != null) {
          a.a(new gj(a.F(), ☃));
        }
        if ((a instanceof pr))
        {
          qi ☃ = (qi)((pr)a).by();
          Collection<qc> ☃ = ☃.c();
          if (!☃.isEmpty()) {
            a.a(new ia(a.F(), ☃));
          }
        }
        j = a.v;
        k = a.w;
        l = a.x;
        if ((u) && (!(☃ instanceof fn))) {
          a.a(new hm(a.F(), a.v, a.w, a.x));
        }
        if (a.m != null) {
          a.a(new hl(0, a, a.m));
        }
        if (((a instanceof ps)) && (((ps)a).cd() != null)) {
          a.a(new hl(1, a, ((ps)a).cd()));
        }
        if ((a instanceof pr)) {
          for (int ☃ = 0; ☃ < 5; ☃++)
          {
            zx ☃ = ((pr)a).p(☃);
            if (☃ != null) {
              a.a(new hn(a.F(), ☃, ☃));
            }
          }
        }
        if ((a instanceof wn))
        {
          wn ☃ = (wn)a;
          if (☃.bJ()) {
            a.a(new ha(☃, new cj(a)));
          }
        }
        if ((a instanceof pr))
        {
          pr ☃ = (pr)a;
          for (pf ☃ : ☃.bl()) {
            a.a(new ib(a.F(), ☃));
          }
        }
      }
    }
    else if (o.contains(☃))
    {
      o.remove(☃);
      ☃.d(a);
    }
  }
  
  public boolean c(lf ☃)
  {
    double ☃ = s - d / 32;
    double ☃ = u - f / 32;
    return (☃ >= -b) && (☃ <= b) && (☃ >= -b) && (☃ <= b) && (a.a(☃));
  }
  
  private boolean e(lf ☃)
  {
    return ☃.u().t().a(☃, a.ae, a.ag);
  }
  
  public void b(List<wn> ☃)
  {
    for (int ☃ = 0; ☃ < ☃.size(); ☃++) {
      b((lf)☃.get(☃));
    }
  }
  
  private ff c()
  {
    if (a.I) {
      p.warn("Fetching addPacket for removed entity");
    }
    if ((a instanceof uz)) {
      return new fk(a, 2, 1);
    }
    if ((a instanceof lf)) {
      return new fp((wn)a);
    }
    if ((a instanceof va))
    {
      va ☃ = (va)a;
      return new fk(a, 10, ☃.s().a());
    }
    if ((a instanceof ux)) {
      return new fk(a, 1);
    }
    if ((a instanceof pi))
    {
      i = ns.d(a.aC() * 256.0F / 360.0F);
      return new fn((pr)a);
    }
    if ((a instanceof ur))
    {
      pk ☃ = a).b;
      return new fk(a, 90, ☃ != null ? ☃.F() : a.F());
    }
    if ((a instanceof wq))
    {
      pk ☃ = a).c;
      return new fk(a, 60, ☃ != null ? ☃.F() : a.F());
    }
    if ((a instanceof wx)) {
      return new fk(a, 61);
    }
    if ((a instanceof xc)) {
      return new fk(a, 73, ((xc)a).o());
    }
    if ((a instanceof xb)) {
      return new fk(a, 75);
    }
    if ((a instanceof xa)) {
      return new fk(a, 65);
    }
    if ((a instanceof wr)) {
      return new fk(a, 72);
    }
    if ((a instanceof wt)) {
      return new fk(a, 76);
    }
    if ((a instanceof ws))
    {
      ws ☃ = (ws)a;
      fk ☃ = null;
      int ☃ = 63;
      if ((a instanceof ww)) {
        ☃ = 64;
      } else if ((a instanceof xd)) {
        ☃ = 66;
      }
      if (a != null) {
        ☃ = new fk(a, ☃, a).a.F());
      } else {
        ☃ = new fk(a, ☃, 0);
      }
      ☃.d((int)(b * 8000.0D));
      ☃.e((int)(c * 8000.0D));
      ☃.f((int)(d * 8000.0D));
      return ☃;
    }
    if ((a instanceof wz)) {
      return new fk(a, 62);
    }
    if ((a instanceof vj)) {
      return new fk(a, 50);
    }
    if ((a instanceof uf)) {
      return new fk(a, 51);
    }
    if ((a instanceof uy))
    {
      uy ☃ = (uy)a;
      return new fk(a, 70, afh.f(☃.l()));
    }
    if ((a instanceof um)) {
      return new fk(a, 78);
    }
    if ((a instanceof uq)) {
      return new fo((uq)a);
    }
    if ((a instanceof uo))
    {
      uo ☃ = (uo)a;
      fk ☃ = new fk(a, 71, b.b());
      cj ☃ = ☃.n();
      ☃.a(ns.d(☃.n() * 32));
      ☃.b(ns.d(☃.o() * 32));
      ☃.c(ns.d(☃.p() * 32));
      return ☃;
    }
    if ((a instanceof up))
    {
      up ☃ = (up)a;
      fk ☃ = new fk(a, 77);
      cj ☃ = ☃.n();
      ☃.a(ns.d(☃.n() * 32));
      ☃.b(ns.d(☃.o() * 32));
      ☃.c(ns.d(☃.p() * 32));
      return ☃;
    }
    if ((a instanceof pp)) {
      return new fl((pp)a);
    }
    throw new IllegalArgumentException("Don't know how to add " + a.getClass() + "!");
  }
  
  public void d(lf ☃)
  {
    if (o.contains(☃))
    {
      o.remove(☃);
      ☃.d(a);
    }
  }
}
