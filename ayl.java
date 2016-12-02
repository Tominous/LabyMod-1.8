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
    h = ☃;
    H = true;
  }
  
  public void b()
  {
    super.b();
    j.h.bk = h;
    
    i = ((l - f) / 2);
    r = ((m - g) / 2);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    int ☃ = i;
    int ☃ = r;
    
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
    
    u = null;
    
    int ☃ = 240;
    int ☃ = 240;
    bqs.a(bqs.r, ☃ / 1.0F, ☃ / 1.0F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    for (int ☃ = 0; ☃ < h.c.size(); ☃++)
    {
      yg ☃ = (yg)h.c.get(☃);
      
      a(☃);
      if ((a(☃, ☃, ☃)) && (☃.b()))
      {
        u = ☃;
        
        bfl.f();
        bfl.i();
        
        int ☃ = f;
        int ☃ = g;
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
    
    wm ☃ = j.h.bi;
    zx ☃ = x == null ? ☃.p() : x;
    if (☃ != null)
    {
      int ☃ = 8;
      int ☃ = x == null ? 8 : 16;
      String ☃ = null;
      if ((x != null) && (w))
      {
        ☃ = ☃.k();
        b = ns.f(b / 2.0F);
      }
      else if ((t) && (s.size() > 1))
      {
        ☃ = ☃.k();
        b = I;
        if (b == 0) {
          ☃ = "" + a.o + "0";
        }
      }
      a(☃, ☃ - ☃ - ☃, ☃ - ☃ - ☃, ☃);
    }
    if (C != null)
    {
      float ☃ = (float)(ave.J() - B) / 100.0F;
      if (☃ >= 1.0F)
      {
        ☃ = 1.0F;
        C = null;
      }
      int ☃ = A.f - y;
      int ☃ = A.g - z;
      int ☃ = y + (int)(☃ * ☃);
      int ☃ = z + (int)(☃ * ☃);
      
      a(C, ☃, ☃, null);
    }
    bfl.F();
    if ((☃.p() == null) && (u != null) && (u.e()))
    {
      zx ☃ = u.d();
      a(☃, ☃, ☃);
    }
    bfl.e();
    bfl.j();
    avc.b();
  }
  
  private void a(zx ☃, int ☃, int ☃, String ☃)
  {
    bfl.b(0.0F, 0.0F, 32.0F);
    e = 200.0F;
    k.a = 200.0F;
    
    k.b(☃, ☃, ☃);
    k.a(q, ☃, ☃, ☃ - (x == null ? 0 : 8), ☃);
    e = 0.0F;
    k.a = 0.0F;
  }
  
  protected void b(int ☃, int ☃) {}
  
  protected abstract void a(float paramFloat, int paramInt1, int paramInt2);
  
  private void a(yg ☃)
  {
    int ☃ = f;
    int ☃ = g;
    zx ☃ = ☃.d();
    boolean ☃ = false;
    boolean ☃ = (☃ == v) && (x != null) && (!w);
    zx ☃ = j.h.bi.p();
    String ☃ = null;
    if ((☃ == v) && (x != null) && (w) && (☃ != null))
    {
      ☃ = ☃.k();
      b /= 2;
    }
    else if ((t) && (s.contains(☃)) && (☃ != null))
    {
      if (s.size() == 1) {
        return;
      }
      if ((xi.a(☃, ☃, true)) && (h.b(☃)))
      {
        ☃ = ☃.k();
        ☃ = true;
        
        xi.a(s, F, ☃, ☃.d() == null ? 0 : db);
        if (b > ☃.c())
        {
          ☃ = a.o + "" + ☃.c();
          b = ☃.c();
        }
        if (b > ☃.b(☃))
        {
          ☃ = a.o + "" + ☃.b(☃);
          b = ☃.b(☃);
        }
      }
      else
      {
        s.remove(☃);
        a();
      }
    }
    e = 100.0F;
    k.a = 100.0F;
    if (☃ == null)
    {
      String ☃ = ☃.c();
      if (☃ != null)
      {
        bmi ☃ = j.T().a(☃);
        bfl.f();
        j.P().a(bmh.g);
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
      k.b(☃, ☃, ☃);
      k.a(q, ☃, ☃, ☃, ☃);
    }
    k.a = 0.0F;
    e = 0.0F;
  }
  
  private void a()
  {
    zx ☃ = j.h.bi.p();
    if ((☃ == null) || (!t)) {
      return;
    }
    I = b;
    for (yg ☃ : s)
    {
      zx ☃ = ☃.k();
      int ☃ = ☃.d() == null ? 0 : db;
      xi.a(s, F, ☃, ☃);
      if (b > ☃.c()) {
        b = ☃.c();
      }
      if (b > ☃.b(☃)) {
        b = ☃.b(☃);
      }
      I -= b - ☃;
    }
  }
  
  private yg c(int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < h.c.size(); ☃++)
    {
      yg ☃ = (yg)h.c.get(☃);
      if (a(☃, ☃, ☃)) {
        return ☃;
      }
    }
    return null;
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    boolean ☃ = ☃ == j.t.ai.i() + 100;
    yg ☃ = c(☃, ☃);
    long ☃ = ave.J();
    M = ((K == ☃) && (☃ - J < 250L) && (L == ☃));
    H = false;
    if ((☃ == 0) || (☃ == 1) || (☃))
    {
      int ☃ = i;
      int ☃ = r;
      boolean ☃ = (☃ < ☃) || (☃ < ☃) || (☃ >= ☃ + f) || (☃ >= ☃ + g);
      
      int ☃ = -1;
      if (☃ != null) {
        ☃ = e;
      }
      if (☃) {
        ☃ = 64537;
      }
      if ((j.t.A) && (☃) && (j.h.bi.p() == null))
      {
        j.a(null);
        return;
      }
      if (☃ != -1) {
        if (j.t.A)
        {
          if ((☃ != null) && (☃.e()))
          {
            v = ☃;
            x = null;
            w = (☃ == 1);
          }
          else
          {
            v = null;
          }
        }
        else if (!t) {
          if (j.h.bi.p() == null)
          {
            if (☃ == j.t.ai.i() + 100)
            {
              a(☃, ☃, ☃, 3);
            }
            else
            {
              boolean ☃ = (☃ != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)));
              int ☃ = 0;
              if (☃)
              {
                N = ((☃ != null) && (☃.e()) ? ☃.d() : null);
                ☃ = 1;
              }
              else if (☃ == 64537)
              {
                ☃ = 4;
              }
              a(☃, ☃, ☃, ☃);
            }
            H = true;
          }
          else
          {
            t = true;
            G = ☃;
            s.clear();
            if (☃ == 0) {
              F = 0;
            } else if (☃ == 1) {
              F = 1;
            } else if (☃ == j.t.ai.i() + 100) {
              F = 2;
            }
          }
        }
      }
    }
    K = ☃;
    J = ☃;
    L = ☃;
  }
  
  protected void a(int ☃, int ☃, int ☃, long ☃)
  {
    yg ☃ = c(☃, ☃);
    zx ☃ = j.h.bi.p();
    if ((v != null) && (j.t.A))
    {
      if ((☃ == 0) || (☃ == 1)) {
        if (x == null)
        {
          if ((☃ != v) && (v.d() != null)) {
            x = v.d().k();
          }
        }
        else if ((x.b > 1) && (☃ != null) && (xi.a(☃, x, false)))
        {
          long ☃ = ave.J();
          if (D == ☃)
          {
            if (☃ - E > 500L)
            {
              a(v, v.e, 0, 0);
              a(☃, e, 1, 0);
              a(v, v.e, 0, 0);
              E = (☃ + 750L);
              x.b -= 1;
            }
          }
          else
          {
            D = ☃;
            E = ☃;
          }
        }
      }
    }
    else if ((t) && (☃ != null) && (☃ != null) && (b > s.size()) && (xi.a(☃, ☃, true)) && (☃.a(☃)) && (h.b(☃)))
    {
      s.add(☃);
      a();
    }
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    yg ☃ = c(☃, ☃);
    int ☃ = i;
    int ☃ = r;
    boolean ☃ = (☃ < ☃) || (☃ < ☃) || (☃ >= ☃ + f) || (☃ >= ☃ + g);
    
    int ☃ = -1;
    if (☃ != null) {
      ☃ = e;
    }
    if (☃) {
      ☃ = 64537;
    }
    if ((M) && (☃ != null) && (☃ == 0) && (h.a(null, ☃)))
    {
      if (r())
      {
        if ((☃ != null) && (d != null) && (N != null)) {
          for (yg ☃ : h.c) {
            if ((☃ != null) && (☃.a(j.h)) && (☃.e()) && (d == d) && (xi.a(☃, N, true))) {
              a(☃, e, ☃, 1);
            }
          }
        }
      }
      else {
        a(☃, ☃, ☃, 6);
      }
      M = false;
      J = 0L;
    }
    else
    {
      if ((t) && (G != ☃))
      {
        t = false;
        s.clear();
        H = true;
        return;
      }
      if (H)
      {
        H = false;
        return;
      }
      if ((v != null) && (j.t.A))
      {
        if ((☃ == 0) || (☃ == 1))
        {
          if ((x == null) && (☃ != v)) {
            x = v.d();
          }
          boolean ☃ = xi.a(☃, x, false);
          if ((☃ != -1) && (x != null) && (☃))
          {
            a(v, v.e, ☃, 0);
            a(☃, ☃, 0, 0);
            if (j.h.bi.p() != null)
            {
              a(v, v.e, ☃, 0);
              y = (☃ - ☃);
              z = (☃ - ☃);
              A = v;
              C = x;
              B = ave.J();
            }
            else
            {
              C = null;
            }
          }
          else if (x != null)
          {
            y = (☃ - ☃);
            z = (☃ - ☃);
            A = v;
            C = x;
            B = ave.J();
          }
          x = null;
          v = null;
        }
      }
      else if ((t) && (!s.isEmpty()))
      {
        a(null, 64537, xi.d(0, F), 5);
        for (yg ☃ : s) {
          a(☃, e, xi.d(1, F), 5);
        }
        a(null, 64537, xi.d(2, F), 5);
      }
      else if (j.h.bi.p() != null)
      {
        if (☃ == j.t.ai.i() + 100)
        {
          a(☃, ☃, ☃, 3);
        }
        else
        {
          boolean ☃ = (☃ != 64537) && ((Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54)));
          if (☃) {
            N = ((☃ != null) && (☃.e()) ? ☃.d() : null);
          }
          a(☃, ☃, ☃, ☃ ? 1 : 0);
        }
      }
    }
    if (j.h.bi.p() == null) {
      J = 0L;
    }
    t = false;
  }
  
  private boolean a(yg ☃, int ☃, int ☃)
  {
    return c(f, g, 16, 16, ☃, ☃);
  }
  
  protected boolean c(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    int ☃ = i;
    int ☃ = r;
    ☃ -= ☃;
    ☃ -= ☃;
    
    return (☃ >= ☃ - 1) && (☃ < ☃ + ☃ + 1) && (☃ >= ☃ - 1) && (☃ < ☃ + ☃ + 1);
  }
  
  protected void a(yg ☃, int ☃, int ☃, int ☃)
  {
    if (☃ != null) {
      ☃ = e;
    }
    j.c.a(h.d, ☃, ☃, ☃, j.h);
  }
  
  protected void a(char ☃, int ☃)
  {
    if ((☃ == 1) || (☃ == j.t.ae.i())) {
      j.h.n();
    }
    b(☃);
    if ((u != null) && (u.e())) {
      if (☃ == j.t.ai.i()) {
        a(u, u.e, 0, 3);
      } else if (☃ == j.t.ag.i()) {
        a(u, u.e, q() ? 1 : 0, 4);
      }
    }
  }
  
  protected boolean b(int ☃)
  {
    if ((j.h.bi.p() == null) && (u != null)) {
      for (int ☃ = 0; ☃ < 9; ☃++) {
        if (☃ == j.t.av[☃].i())
        {
          a(u, u.e, ☃, 2);
          return true;
        }
      }
    }
    return false;
  }
  
  public void m()
  {
    if (j.h == null) {
      return;
    }
    h.b(j.h);
  }
  
  public boolean d()
  {
    return false;
  }
  
  public void e()
  {
    super.e();
    if ((!j.h.ai()) || (j.h.I)) {
      j.h.n();
    }
  }
}
