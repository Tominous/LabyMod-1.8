import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.Callable;

public class bdb
  extends adm
{
  private bcy a;
  private bcz b;
  private final Set<pk> c = Sets.newHashSet();
  private final Set<pk> d = Sets.newHashSet();
  private final ave I = ave.A();
  private final Set<adg> J = Sets.newHashSet();
  
  public bdb(bcy ☃, adp ☃, int ☃, oj ☃, nt ☃)
  {
    super(new atx(), new ato(☃, "MpServer"), anm.a(☃), ☃, true);
    
    this.a = ☃;
    P().a(☃);
    B(new cj(8, 64, 8));
    
    this.t.a(this);
    this.v = k();
    
    this.z = new atz();
    B();
    C();
  }
  
  public void c()
  {
    super.c();
    a(K() + 1L);
    if (Q().b("doDaylightCycle")) {
      b(L() + 1L);
    }
    this.B.a("reEntryProcessing");
    for (int ☃ = 0; (☃ < 10) && (!this.d.isEmpty()); ☃++)
    {
      pk ☃ = (pk)this.d.iterator().next();
      this.d.remove(☃);
      if (!this.f.contains(☃)) {
        d(☃);
      }
    }
    this.B.c("chunkCache");
    this.b.d();
    
    this.B.c("blocks");
    h();
    
    this.B.b();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  protected amv k()
  {
    this.b = new bcz(this);
    return this.b;
  }
  
  protected void h()
  {
    super.h();
    
    this.J.retainAll(this.E);
    if (this.J.size() == this.E.size()) {
      this.J.clear();
    }
    int ☃ = 0;
    for (adg ☃ : this.E) {
      if (!this.J.contains(☃))
      {
        int ☃ = ☃.a * 16;
        int ☃ = ☃.b * 16;
        
        this.B.a("getChunk");
        amy ☃ = a(☃.a, ☃.b);
        
        a(☃, ☃, ☃);
        
        this.B.b();
        
        this.J.add(☃);
        ☃++;
        if (☃ >= 10) {
          return;
        }
      }
    }
  }
  
  public void b(int ☃, int ☃, boolean ☃)
  {
    if (☃) {
      this.b.c(☃, ☃);
    } else {
      this.b.b(☃, ☃);
    }
    if (!☃) {
      b(☃ * 16, 0, ☃ * 16, ☃ * 16 + 15, 256, ☃ * 16 + 15);
    }
  }
  
  public boolean d(pk ☃)
  {
    boolean ☃ = super.d(☃);
    this.c.add(☃);
    if (!☃) {
      this.d.add(☃);
    } else if ((☃ instanceof va)) {
      this.I.W().a(new bpd((va)☃));
    }
    return ☃;
  }
  
  public void e(pk ☃)
  {
    super.e(☃);
    this.c.remove(☃);
  }
  
  protected void a(pk ☃)
  {
    super.a(☃);
    if (this.d.contains(☃)) {
      this.d.remove(☃);
    }
  }
  
  protected void b(pk ☃)
  {
    super.b(☃);
    boolean ☃ = false;
    if (this.c.contains(☃)) {
      if (☃.ai())
      {
        this.d.add(☃);
        ☃ = true;
      }
      else
      {
        this.c.remove(☃);
      }
    }
  }
  
  public void a(int ☃, pk ☃)
  {
    pk ☃ = a(☃);
    if (☃ != null) {
      e(☃);
    }
    this.c.add(☃);
    ☃.d(☃);
    if (!d(☃)) {
      this.d.add(☃);
    }
    this.l.a(☃, ☃);
  }
  
  public pk a(int ☃)
  {
    if (☃ == this.I.h.F()) {
      return this.I.h;
    }
    return super.a(☃);
  }
  
  public pk e(int ☃)
  {
    pk ☃ = (pk)this.l.d(☃);
    if (☃ != null)
    {
      this.c.remove(☃);
      e(☃);
    }
    return ☃;
  }
  
  public boolean b(cj ☃, alz ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    a(☃, ☃, ☃, ☃, ☃, ☃);
    
    return super.a(☃, ☃, 3);
  }
  
  public void H()
  {
    this.a.a().a(new fa("Quitting"));
  }
  
  protected void p() {}
  
  protected int q()
  {
    return this.I.t.c;
  }
  
  public void b(int ☃, int ☃, int ☃)
  {
    int ☃ = 16;
    Random ☃ = new Random();
    
    zx ☃ = this.I.h.bA();
    boolean ☃ = (this.I.c.l() == adp.a.c) && (☃ != null) && (afh.a(☃.b()) == afi.cv);
    
    cj.a ☃ = new cj.a();
    for (int ☃ = 0; ☃ < 1000; ☃++)
    {
      int ☃ = ☃ + this.s.nextInt(☃) - this.s.nextInt(☃);
      int ☃ = ☃ + this.s.nextInt(☃) - this.s.nextInt(☃);
      int ☃ = ☃ + this.s.nextInt(☃) - this.s.nextInt(☃);
      
      ☃.c(☃, ☃, ☃);
      alz ☃ = p(☃);
      ☃.c().c(this, ☃, ☃, ☃);
      if ((☃) && (☃.c() == afi.cv)) {
        a(cy.J, ☃ + 0.5F, ☃ + 0.5F, ☃ + 0.5F, 0.0D, 0.0D, 0.0D, new int[0]);
      }
    }
  }
  
  public void a()
  {
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
      else if (☃.I)
      {
        int ☃ = ☃.ae;
        int ☃ = ☃.ag;
        if ((☃.ad) && (a(☃, ☃, true))) {
          a(☃, ☃).b(☃);
        }
        this.f.remove(☃--);
        b(☃);
      }
    }
  }
  
  public c a(b ☃)
  {
    c ☃ = super.a(☃);
    
    ☃.a("Forced entities", new Callable()
    {
      public String a()
      {
        return bdb.a(bdb.this).size() + " total; " + bdb.a(bdb.this).toString();
      }
    });
    ☃.a("Retry entities", new Callable()
    {
      public String a()
      {
        return bdb.b(bdb.this).size() + " total; " + bdb.b(bdb.this).toString();
      }
    });
    ☃.a("Server brand", new Callable()
    {
      public String a()
        throws Exception
      {
        return bdb.c(bdb.this).h.w();
      }
    });
    ☃.a("Server type", new Callable()
    {
      public String a()
        throws Exception
      {
        return bdb.c(bdb.this).G() == null ? "Non-integrated multiplayer server" : "Integrated singleplayer server";
      }
    });
    return ☃;
  }
  
  public void a(cj ☃, String ☃, float ☃, float ☃, boolean ☃)
  {
    a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, ☃, ☃, ☃, ☃);
  }
  
  public void a(double ☃, double ☃, double ☃, String ☃, float ☃, float ☃, boolean ☃)
  {
    double ☃ = this.I.ac().e(☃, ☃, ☃);
    bpf ☃ = new bpf(new jy(☃), ☃, ☃, (float)☃, (float)☃, (float)☃);
    if ((☃) && (☃ > 100.0D))
    {
      double ☃ = Math.sqrt(☃) / 40.0D;
      this.I.W().a(☃, (int)(☃ * 20.0D));
    }
    else
    {
      this.I.W().a(☃);
    }
  }
  
  public void a(double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, dn ☃)
  {
    this.I.j.a(new bdq.c(this, ☃, ☃, ☃, ☃, ☃, ☃, this.I.j, ☃));
  }
  
  public void a(auo ☃)
  {
    this.C = ☃;
  }
  
  public void b(long ☃)
  {
    if (☃ < 0L)
    {
      ☃ = -☃;
      Q().a("doDaylightCycle", "false");
    }
    else
    {
      Q().a("doDaylightCycle", "true");
    }
    super.b(☃);
  }
}
