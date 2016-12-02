import com.google.common.collect.Sets;
import java.util.List;
import java.util.Set;
import org.lwjgl.input.Keyboard;

public abstract class ayl
  extends axu
{
  protected static final jy a = new jy("textures/gui/container/inventory.png");
  protected int f = 176;
  protected int g = 166;
  public xi h;
  protected int i;
  protected int r;
  private yg u;
  private yg v;
  private boolean w;
  private zx x;
  private int y;
  private int z;
  private yg A;
  private long B;
  private zx C;
  private yg D;
  private long E;
  protected final Set<yg> s = Sets.newHashSet();
  protected boolean t;
  private int F;
  private int G;
  private boolean H;
  private int I;
  private long J;
  private yg K;
  private int L;
  private boolean M;
  private zx N;
  
  public ayl(xi ☃)
  {
    this.h = ☃;
    this.H = true;
  }
  
  public void b()
  {
    super.b();
    this.j.h.bk = this.h;
    
    this.i = ((this.l - this.f) / 2);
    this.r = ((this.m - this.g) / 2);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    int ☃ = this.i;
    int ☃ = this.r;
    
    a(☃, ☃, ☃);
    
    bfl.C();
    avc.a();
    bfl.f();
    bfl.i();
    
    super.a(☃, ☃, ☃);
    
    avc.c();
    
    bfl.E();
    bfl.b(☃, ☃, 0.0F);
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.B();
    
    this.u = null;
    
    int ☃ = 240;
    int ☃ = 240;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    for (int ☃ = 0; ☃ < this.h.c.size(); ☃++)
    {
      yg ☃ = (yg)this.h.c.get(☃);
      
      a(☃);
      if ((a(☃, ☃, ☃)) && (☃.b()))
      {
        this.u = ☃;
        
        bfl.f();
        bfl.i();
        
        int ☃ = ☃.f;
        int ☃ = ☃.g;
        bfl.a(true, true, true, false);
        a(☃, ☃, ☃ + 16, ☃ + 16, -2130706433, -2130706433);
        bfl.a(true, true, true, true);
        bfl.e();
        bfl.j();
      }
    }
    avc.a();
    b(☃, ☃);
    avc.c();
    
    wm ☃ = this.j.h.bi;
    zx ☃ = this.x == null ? ☃.p() : this.x;
    if (☃ != null)
    {
      int ☃ = 8;
      int ☃ = this.x == null ? 8 : 16;
      String ☃ = null;
      if ((this.x != null) && (this.w))
      {
        ☃ = ☃.k();
        ☃.b = ns.f(☃.b / 2.0F);
      }
      else if ((this.t) && (this.s.size() > 1))
      {
        ☃ = ☃.k();
        ☃.b = this.I;
        if (☃.b == 0) {
          ☃ = "" + a.o + "0";
        }
      }
      a(☃, ☃ - ☃ - ☃, ☃ - ☃ - ☃, ☃);
    }
    if (this.C != null)
    {
      float ☃ = (float)(ave.J() - this.B) / 100.0F;
      if (☃ >= 1.0F)
      {
        ☃ = 1.0F;
        this.C = null;
      }
      int ☃ = this.A.f - this.y;
      int ☃ = this.A.g - this.z;
      int ☃ = this.y + (int)(☃ * ☃);
      int ☃ = this.z + (int)(☃ * ☃);
      
      a(this.C, ☃, ☃, null);
    }
    bfl.F();
    if ((☃.p() == null) && (this.u != null) && (this.u.e()))
    {
      zx ☃ = this.u.d();
      a(☃, ☃, ☃);
    }
    bfl.e();
    bfl.j();
    avc.b();
  }
  
  private void a(zx ☃, int ☃, int ☃, String ☃)
  {
    bfl.b(0.0F, 0.0F, 32.0F);
    this.e = 200.0F;
    this.k.a = 200.0F;
    
    this.k.b(☃, ☃, ☃);
    this.k.a(this.q, ☃, ☃, ☃ - (this.x == null ? 0 : 8), ☃);
    this.e = 0.0F;
    this.k.a = 0.0F;
  }
  
  protected void b(int ☃, int ☃) {}
  
  protected abstract void a(float paramFloat, int paramInt1, int paramInt2);
  
  private void a(yg ☃)
  {
    int ☃ = ☃.f;
    int ☃ = ☃.g;
    zx ☃ = ☃.d();
    boolean ☃ = false;
    boolean ☃ = (☃ == this.v) && (this.x != null) && (!this.w);
    zx ☃ = this.j.h.bi.p();
    String ☃ = null;
    if ((☃ == this.v) && (this.x != null) && (this.w) && (☃ != null))
    {
      ☃ = ☃.k();
      ☃.b /= 2;
    }
    else if ((this.t) && (this.s.contains(☃)) && (☃ != null))
    {
      if (this.s.size() == 1) {
        return;
      }
      if ((xi.a(☃, ☃, true)) && (this.h.b(☃)))
      {
        ☃ = ☃.k();
        ☃ = true;
        
        xi.a(this.s, this.F, ☃, ☃.d() == null ? 0 : ☃.d().b);
        if (☃.b > ☃.c())
        {
          ☃ = a.o + "" + ☃.c();
          ☃.b = ☃.c();
        }
        if (☃.b > ☃.b(☃))
        {
          ☃ = a.o + "" + ☃.b(☃);
          ☃.b = ☃.b(☃);
        }
      }
      else
      {
        this.s.remove(☃);
        a();
      }
    }
    this.e = 100.0F;
    this.k.a = 100.0F;
    if (☃ == null)
    {
      String ☃ = ☃.c();
      if (☃ != null)
      {
        bmi ☃ = this.j.T().a(☃);
        bfl.f();
        this.j.P().a(bmh.g);
        a(☃, ☃, ☃, 16, 16);
        bfl.e();
        ☃ = true;
      }
    }
    if (!☃)
    {
      if (☃) {
        a(☃, ☃, ☃ + 16, ☃ + 16, -2130706433);
      }
      bfl.j();
      this.k.b(☃, ☃, ☃);
      this.k.a(this.q, ☃, ☃, ☃, ☃);
    }
    this.k.a = 0.0F;
    this.e = 0.0F;
  }
  
  private void a()
  {
    zx ☃ = this.j.h.bi.p();
    if ((☃ == null) || (!this.t)) {
      return;
    }
    this.I = ☃.b;
    for (yg ☃ : this.s)
    {
      zx ☃ = ☃.k();
      int ☃ = ☃.d() == null ? 0 : ☃.d().b;
      xi.a(this.s, this.F, ☃, ☃);
      if (☃.b > ☃.c()) {
        ☃.b = ☃.c();
      }
      if (☃.b > ☃.b(☃)) {
        ☃.b = ☃.b(☃);
      }
      this.I -= ☃.b - ☃;
    }
  }
  
  private yg c(int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.h.c.size(); ☃++)
    {
      yg ☃ = (yg)this.h.c.get(☃);
      if (a(☃, ☃, ☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    boolean ☃ = ☃ == this.j.t.ai.i() + 100;
    yg ☃ = c(☃, ☃);
    long ☃ = ave.J();
    this.M = ((this.K == ☃) && (☃ - this.J < 250L) && (this.L == ☃));
    this.H = false;
    if ((☃ == 0) || (☃ == 1) || (☃))
    {
      int ☃ = this.i;
      int ☃ = this.r;
      boolean ☃ = (☃ < ☃) || (☃ < ☃) || (☃ >= ☃ + this.f) || (☃ >= ☃ + this.g);
      
      int ☃ = -1;
      if (☃ != null) {
        ☃ = ☃.e;
      }
      if (☃) {
        ☃ = 64537;
      }
      if ((this.j.t.A) && (☃) && (this.j.h.bi.p() == null))
      {
        this.j.a(null);
        return;
      }
      if (☃ != -1) {
        if (this.j.t.A)
        {
          if ((☃ != null) && (☃.e()))
          {
            this.v = ☃;
            this.x = null;
            this.w = (☃ == 1);
          }
          else
          {
            this.v = null;
          }
        }
        else if (!this.t) {
          if (this.j.h.bi.p() == null)
          {
            if (☃ == this.j.t.ai.i() + 100)
            {
              a(☃, ☃, ☃, 3);
            }
            else
            {
              boolean ☃ = (☃ != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)));
              int ☃ = 0;
              if (☃)
              {
                this.N = ((☃ != null) && (☃.e()) ? ☃.d() : null);
                ☃ = 1;
              }
              else if (☃ == 64537)
              {
                ☃ = 4;
              }
              a(☃, ☃, ☃, ☃);
            }
            this.H = true;
          }
          else
          {
            this.t = true;
            this.G = ☃;
            this.s.clear();
            if (☃ == 0) {
              this.F = 0;
            } else if (☃ == 1) {
              this.F = 1;
            } else if (☃ == this.j.t.ai.i() + 100) {
              this.F = 2;
            }
          }
        }
      }
    }
    this.K = ☃;
    this.J = ☃;
    this.L = ☃;
  }
  
  protected void a(int ☃, int ☃, int ☃, long ☃)
  {
    yg ☃ = c(☃, ☃);
    zx ☃ = this.j.h.bi.p();
    if ((this.v != null) && (this.j.t.A))
    {
      if ((☃ == 0) || (☃ == 1)) {
        if (this.x == null)
        {
          if ((☃ != this.v) && (this.v.d() != null)) {
            this.x = this.v.d().k();
          }
        }
        else if ((this.x.b > 1) && (☃ != null) && (xi.a(☃, this.x, false)))
        {
          long ☃ = ave.J();
          if (this.D == ☃)
          {
            if (☃ - this.E > 500L)
            {
              a(this.v, this.v.e, 0, 0);
              a(☃, ☃.e, 1, 0);
              a(this.v, this.v.e, 0, 0);
              this.E = (☃ + 750L);
              this.x.b -= 1;
            }
          }
          else
          {
            this.D = ☃;
            this.E = ☃;
          }
        }
      }
    }
    else if ((this.t) && (☃ != null) && (☃ != null) && (☃.b > this.s.size()) && (xi.a(☃, ☃, true)) && (☃.a(☃)) && (this.h.b(☃)))
    {
      this.s.add(☃);
      a();
    }
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    yg ☃ = c(☃, ☃);
    int ☃ = this.i;
    int ☃ = this.r;
    boolean ☃ = (☃ < ☃) || (☃ < ☃) || (☃ >= ☃ + this.f) || (☃ >= ☃ + this.g);
    
    int ☃ = -1;
    if (☃ != null) {
      ☃ = ☃.e;
    }
    if (☃) {
      ☃ = 64537;
    }
    if ((this.M) && (☃ != null) && (☃ == 0) && (this.h.a(null, ☃)))
    {
      if (r())
      {
        if ((☃ != null) && (☃.d != null) && (this.N != null)) {
          for (yg ☃ : this.h.c) {
            if ((☃ != null) && (☃.a(this.j.h)) && (☃.e()) && (☃.d == ☃.d) && (xi.a(☃, this.N, true))) {
              a(☃, ☃.e, ☃, 1);
            }
          }
        }
      }
      else {
        a(☃, ☃, ☃, 6);
      }
      this.M = false;
      this.J = 0L;
    }
    else
    {
      if ((this.t) && (this.G != ☃))
      {
        this.t = false;
        this.s.clear();
        this.H = true;
        return;
      }
      if (this.H)
      {
        this.H = false;
        return;
      }
      if ((this.v != null) && (this.j.t.A))
      {
        if ((☃ == 0) || (☃ == 1))
        {
          if ((this.x == null) && (☃ != this.v)) {
            this.x = this.v.d();
          }
          boolean ☃ = xi.a(☃, this.x, false);
          if ((☃ != -1) && (this.x != null) && (☃))
          {
            a(this.v, this.v.e, ☃, 0);
            a(☃, ☃, 0, 0);
            if (this.j.h.bi.p() != null)
            {
              a(this.v, this.v.e, ☃, 0);
              this.y = (☃ - ☃);
              this.z = (☃ - ☃);
              this.A = this.v;
              this.C = this.x;
              this.B = ave.J();
            }
            else
            {
              this.C = null;
            }
          }
          else if (this.x != null)
          {
            this.y = (☃ - ☃);
            this.z = (☃ - ☃);
            this.A = this.v;
            this.C = this.x;
            this.B = ave.J();
          }
          this.x = null;
          this.v = null;
        }
      }
      else if ((this.t) && (!this.s.isEmpty()))
      {
        a(null, 64537, xi.d(0, this.F), 5);
        for (yg ☃ : this.s) {
          a(☃, ☃.e, xi.d(1, this.F), 5);
        }
        a(null, 64537, xi.d(2, this.F), 5);
      }
      else if (this.j.h.bi.p() != null)
      {
        if (☃ == this.j.t.ai.i() + 100)
        {
          a(☃, ☃, ☃, 3);
        }
        else
        {
          boolean ☃ = (☃ != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)));
          if (☃) {
            this.N = ((☃ != null) && (☃.e()) ? ☃.d() : null);
          }
          a(☃, ☃, ☃, ☃ ? 1 : 0);
        }
      }
    }
    if (this.j.h.bi.p() == null) {
      this.J = 0L;
    }
    this.t = false;
  }
  
  private boolean a(yg ☃, int ☃, int ☃)
  {
    return c(☃.f, ☃.g, 16, 16, ☃, ☃);
  }
  
  protected boolean c(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = this.i;
    int ☃ = this.r;
    ☃ -= ☃;
    ☃ -= ☃;
    
    return (☃ >= ☃ - 1) && (☃ < ☃ + ☃ + 1) && (☃ >= ☃ - 1) && (☃ < ☃ + ☃ + 1);
  }
  
  protected void a(yg ☃, int ☃, int ☃, int ☃)
  {
    if (☃ != null) {
      ☃ = ☃.e;
    }
    this.j.c.a(this.h.d, ☃, ☃, ☃, this.j.h);
  }
  
  protected void a(char ☃, int ☃)
  {
    if ((☃ == 1) || (☃ == this.j.t.ae.i())) {
      this.j.h.n();
    }
    b(☃);
    if ((this.u != null) && (this.u.e())) {
      if (☃ == this.j.t.ai.i()) {
        a(this.u, this.u.e, 0, 3);
      } else if (☃ == this.j.t.ag.i()) {
        a(this.u, this.u.e, q() ? 1 : 0, 4);
      }
    }
  }
  
  protected boolean b(int ☃)
  {
    if ((this.j.h.bi.p() == null) && (this.u != null)) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        if (☃ == this.j.t.av[☃].i())
        {
          a(this.u, this.u.e, ☃, 2);
          return true;
        }
      }
    }
    return false;
  }
  
  public void m()
  {
    if (this.j.h == null) {
      return;
    }
    this.h.b(this.j.h);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void e()
  {
    super.e();
    if ((!this.j.h.ai()) || (this.j.h.I)) {
      this.j.h.n();
    }
  }
}
