import java.util.Random;

public class aeb
{
  protected adm a;
  protected Random b;
  protected cj c;
  protected ant d;
  
  public void a(adm ☃, Random ☃, ady ☃, cj ☃)
  {
    if (this.a != null) {
      throw new RuntimeException("Already decorating");
    }
    this.a = ☃;
    String ☃ = ☃.P().B();
    if (☃ != null) {
      this.d = ant.a.a(☃).b();
    } else {
      this.d = ant.a.a("").b();
    }
    this.b = ☃;
    this.c = ☃;
    
    this.h = new apj(afi.d.Q(), this.d.I);
    this.i = new apj(afi.n.Q(), this.d.M);
    this.j = new apj(afi.b.Q().a(ajy.a, ajy.a.b), this.d.Q);
    this.k = new apj(afi.b.Q().a(ajy.a, ajy.a.d), this.d.U);
    this.l = new apj(afi.b.Q().a(ajy.a, ajy.a.f), this.d.Y);
    this.m = new apj(afi.q.Q(), this.d.ac);
    this.n = new apj(afi.p.Q(), this.d.ag);
    this.o = new apj(afi.o.Q(), this.d.ak);
    this.p = new apj(afi.aC.Q(), this.d.ao);
    this.q = new apj(afi.ag.Q(), this.d.as);
    this.r = new apj(afi.x.Q(), this.d.aw);
    
    a(☃);
    
    this.a = null;
    this.b = null;
  }
  
  protected aot e = new aop(4);
  protected aot f = new apo(afi.m, 7);
  protected aot g = new apo(afi.n, 6);
  protected aot h;
  protected aot i;
  protected aot j;
  protected aot k;
  protected aot l;
  protected aot m;
  protected aot n;
  protected aot o;
  protected aot p;
  protected aot q;
  protected aot r;
  protected aou s = new aou(afi.N, agw.a.a);
  protected aot t = new aom(afi.P);
  protected aot u = new aom(afi.Q);
  protected aot v = new aoz();
  protected aot w = new apm();
  protected aot x = new aon();
  protected aot y = new apx();
  protected int z;
  protected int A;
  protected int B = 2;
  protected int C = 1;
  protected int D;
  protected int E;
  protected int F;
  protected int G;
  protected int H = 1;
  protected int I = 3;
  protected int J = 1;
  protected int K;
  public boolean L = true;
  
  protected void a(ady ☃)
  {
    a();
    for (int ☃ = 0; ☃ < this.I; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      this.f.b(this.a, this.b, this.a.r(this.c.a(☃, 0, ☃)));
    }
    for (int ☃ = 0; ☃ < this.J; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      this.e.b(this.a, this.b, this.a.r(this.c.a(☃, 0, ☃)));
    }
    for (int ☃ = 0; ☃ < this.H; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      this.g.b(this.a, this.b, this.a.r(this.c.a(☃, 0, ☃)));
    }
    int ☃ = this.A;
    if (this.b.nextInt(10) == 0) {
      ☃++;
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      
      aoh ☃ = ☃.a(this.b);
      ☃.e();
      
      cj ☃ = this.a.m(this.c.a(☃, 0, ☃));
      if (☃.b(this.a, this.b, ☃)) {
        ☃.a(this.a, this.b, ☃);
      }
    }
    for (int ☃ = 0; ☃ < this.K; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      this.v.b(this.a, this.b, this.a.m(this.c.a(☃, 0, ☃)));
    }
    for (int ☃ = 0; ☃ < this.B; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() + 32;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        
        cj ☃ = this.c.a(☃, ☃, ☃);
        agw.a ☃ = ☃.a(this.b, ☃);
        agw ☃ = ☃.a().a();
        if (☃.t() != arm.a)
        {
          this.s.a(☃, ☃);
          this.s.b(this.a, this.b, ☃);
        }
      }
    }
    for (int ☃ = 0; ☃ < this.C; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        
        ☃.b(this.b).b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    for (int ☃ = 0; ☃ < this.D; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        
        new aoq().b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    for (int ☃ = 0; ☃ < this.z; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        
        cj ☃ = this.c.a(☃, ☃, ☃);
        while (☃.o() > 0)
        {
          cj ☃ = ☃.b();
          if (!this.a.d(☃)) {
            break;
          }
          ☃ = ☃;
        }
        this.y.b(this.a, this.b, ☃);
      }
    }
    for (int ☃ = 0; ☃ < this.E; ☃++)
    {
      if (this.b.nextInt(4) == 0)
      {
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(16) + 8;
        cj ☃ = this.a.m(this.c.a(☃, 0, ☃));
        this.t.b(this.a, this.b, ☃);
      }
      if (this.b.nextInt(8) == 0)
      {
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
        if (☃ > 0)
        {
          int ☃ = this.b.nextInt(☃);
          cj ☃ = this.c.a(☃, ☃, ☃);
          this.u.b(this.a, this.b, ☃);
        }
      }
    }
    if (this.b.nextInt(4) == 0)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        this.t.b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    if (this.b.nextInt(8) == 0)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        this.u.b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    for (int ☃ = 0; ☃ < this.F; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        this.w.b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        this.w.b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    if (this.b.nextInt(32) == 0)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        new apl().b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    for (int ☃ = 0; ☃ < this.G; ☃++)
    {
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.b.nextInt(16) + 8;
      int ☃ = this.a.m(this.c.a(☃, 0, ☃)).o() * 2;
      if (☃ > 0)
      {
        int ☃ = this.b.nextInt(☃);
        this.x.b(this.a, this.b, this.c.a(☃, ☃, ☃));
      }
    }
    if (this.L)
    {
      for (int ☃ = 0; ☃ < 50; ☃++)
      {
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(248) + 8;
        if (☃ > 0)
        {
          int ☃ = this.b.nextInt(☃);
          cj ☃ = this.c.a(☃, ☃, ☃);
          new apr(afi.i).b(this.a, this.b, ☃);
        }
      }
      for (int ☃ = 0; ☃ < 20; ☃++)
      {
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(16) + 8;
        int ☃ = this.b.nextInt(this.b.nextInt(this.b.nextInt(240) + 8) + 8);
        cj ☃ = this.c.a(☃, ☃, ☃);
        
        new apr(afi.k).b(this.a, this.b, ☃);
      }
    }
  }
  
  protected void a(int ☃, aot ☃, int ☃, int ☃)
  {
    if (☃ < ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    else if (☃ == ☃)
    {
      if (☃ < 255) {
        ☃++;
      } else {
        ☃--;
      }
    }
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      cj ☃ = this.c.a(this.b.nextInt(16), this.b.nextInt(☃ - ☃) + ☃, this.b.nextInt(16));
      ☃.b(this.a, this.b, ☃);
    }
  }
  
  protected void b(int ☃, aot ☃, int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      cj ☃ = this.c.a(this.b.nextInt(16), this.b.nextInt(☃) + this.b.nextInt(☃) + ☃ - ☃, this.b.nextInt(16));
      ☃.b(this.a, this.b, ☃);
    }
  }
  
  protected void a()
  {
    a(this.d.J, this.h, this.d.K, this.d.L);
    a(this.d.N, this.i, this.d.O, this.d.P);
    a(this.d.V, this.k, this.d.W, this.d.X);
    a(this.d.R, this.j, this.d.S, this.d.T);
    a(this.d.Z, this.l, this.d.aa, this.d.ab);
    a(this.d.ad, this.m, this.d.ae, this.d.af);
    a(this.d.ah, this.n, this.d.ai, this.d.aj);
    a(this.d.al, this.o, this.d.am, this.d.an);
    a(this.d.ap, this.p, this.d.aq, this.d.ar);
    a(this.d.at, this.q, this.d.au, this.d.av);
    b(this.d.ax, this.r, this.d.ay, this.d.az);
  }
}
