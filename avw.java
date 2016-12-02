import com.google.common.base.Predicate;
import com.google.common.base.Predicates;

public class avw
  extends avp
{
  private final int g;
  private final avn h;
  public int a;
  public int f;
  private final int i;
  private final int j;
  private String k = "";
  private int l = 32;
  private int m;
  private boolean n = true;
  private boolean o = true;
  private boolean p;
  private boolean q = true;
  private int r;
  private int s;
  private int t;
  private int u = 14737632;
  private int v = 7368816;
  private boolean w = true;
  private awg.b x;
  private Predicate<String> y = Predicates.alwaysTrue();
  
  public avw(int ☃, avn ☃, int ☃, int ☃, int ☃, int ☃)
  {
    g = ☃;
    h = ☃;
    a = ☃;
    f = ☃;
    i = ☃;
    j = ☃;
  }
  
  public void a(awg.b ☃)
  {
    x = ☃;
  }
  
  public void a()
  {
    m += 1;
  }
  
  public void a(String ☃)
  {
    if (!y.apply(☃)) {
      return;
    }
    if (☃.length() > l) {
      k = ☃.substring(0, l);
    } else {
      k = ☃;
    }
    f();
  }
  
  public String b()
  {
    return k;
  }
  
  public String c()
  {
    int ☃ = s < t ? s : t;
    int ☃ = s < t ? t : s;
    
    return k.substring(☃, ☃);
  }
  
  public void a(Predicate<String> ☃)
  {
    y = ☃;
  }
  
  public void b(String ☃)
  {
    String ☃ = "";
    String ☃ = f.a(☃);
    int ☃ = s < t ? s : t;
    int ☃ = s < t ? t : s;
    int ☃ = l - k.length() - (☃ - ☃);
    int ☃ = 0;
    if (k.length() > 0) {
      ☃ = ☃ + k.substring(0, ☃);
    }
    if (☃ < ☃.length())
    {
      ☃ = ☃ + ☃.substring(0, ☃);
      ☃ = ☃;
    }
    else
    {
      ☃ = ☃ + ☃;
      ☃ = ☃.length();
    }
    if ((k.length() > 0) && (☃ < k.length())) {
      ☃ = ☃ + k.substring(☃);
    }
    if (!y.apply(☃)) {
      return;
    }
    k = ☃;
    d(☃ - t + ☃);
    if (x != null) {
      x.a(g, k);
    }
  }
  
  public void a(int ☃)
  {
    if (k.length() == 0) {
      return;
    }
    if (t != s)
    {
      b("");
      return;
    }
    b(c(☃) - s);
  }
  
  public void b(int ☃)
  {
    if (k.length() == 0) {
      return;
    }
    if (t != s)
    {
      b("");
      return;
    }
    boolean ☃ = ☃ < 0;
    int ☃ = ☃ ? s + ☃ : s;
    int ☃ = ☃ ? s : s + ☃;
    String ☃ = "";
    if (☃ >= 0) {
      ☃ = k.substring(0, ☃);
    }
    if (☃ < k.length()) {
      ☃ = ☃ + k.substring(☃);
    }
    if (!y.apply(☃)) {
      return;
    }
    k = ☃;
    if (☃) {
      d(☃);
    }
    if (x != null) {
      x.a(g, k);
    }
  }
  
  public int d()
  {
    return g;
  }
  
  public int c(int ☃)
  {
    return a(☃, i());
  }
  
  public int a(int ☃, int ☃)
  {
    return a(☃, ☃, true);
  }
  
  public int a(int ☃, int ☃, boolean ☃)
  {
    int ☃ = ☃;
    boolean ☃ = ☃ < 0;
    int ☃ = Math.abs(☃);
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      if (☃)
      {
        while ((☃) && (☃ > 0) && (k.charAt(☃ - 1) == ' ')) {
          ☃--;
        }
        while ((☃ > 0) && (k.charAt(☃ - 1) != ' ')) {
          ☃--;
        }
      }
      int ☃ = k.length();
      
      ☃ = k.indexOf(' ', ☃);
      if (☃ == -1) {
        ☃ = ☃;
      } else {
        while ((☃) && (☃ < ☃) && (k.charAt(☃) == ' ')) {
          ☃++;
        }
      }
    }
    return ☃;
  }
  
  public void d(int ☃)
  {
    e(t + ☃);
  }
  
  public void e(int ☃)
  {
    s = ☃;
    
    int ☃ = k.length();
    s = ns.a(s, 0, ☃);
    
    i(s);
  }
  
  public void e()
  {
    e(0);
  }
  
  public void f()
  {
    e(k.length());
  }
  
  public boolean a(char ☃, int ☃)
  {
    if (!p) {
      return false;
    }
    if (axu.g(☃))
    {
      f();
      i(0);
      return true;
    }
    if (axu.f(☃))
    {
      axu.e(c());
      return true;
    }
    if (axu.e(☃))
    {
      if (q) {
        b(axu.o());
      }
      return true;
    }
    if (axu.d(☃))
    {
      axu.e(c());
      if (q) {
        b("");
      }
      return true;
    }
    switch (☃)
    {
    case 203: 
      if (axu.r())
      {
        if (axu.q()) {
          i(a(-1, o()));
        } else {
          i(o() - 1);
        }
      }
      else if (axu.q()) {
        e(c(-1));
      } else {
        d(-1);
      }
      return true;
    case 205: 
      if (axu.r())
      {
        if (axu.q()) {
          i(a(1, o()));
        } else {
          i(o() + 1);
        }
      }
      else if (axu.q()) {
        e(c(1));
      } else {
        d(1);
      }
      return true;
    case 14: 
      if (axu.q())
      {
        if (q) {
          a(-1);
        }
      }
      else if (q) {
        b(-1);
      }
      return true;
    case 211: 
      if (axu.q())
      {
        if (q) {
          a(1);
        }
      }
      else if (q) {
        b(1);
      }
      return true;
    case 199: 
      if (axu.r()) {
        i(0);
      } else {
        e();
      }
      return true;
    case 207: 
      if (axu.r()) {
        i(k.length());
      } else {
        f();
      }
      return true;
    }
    if (f.a(☃))
    {
      if (q) {
        b(Character.toString(☃));
      }
      return true;
    }
    return false;
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    boolean ☃ = (☃ >= a) && (☃ < a + i) && (☃ >= f) && (☃ < f + j);
    if (o) {
      b(☃);
    }
    if ((p) && (☃) && (☃ == 0))
    {
      int ☃ = ☃ - a;
      if (n) {
        ☃ -= 4;
      }
      String ☃ = h.a(k.substring(r), p());
      e(h.a(☃, ☃).length() + r);
    }
  }
  
  public void g()
  {
    if (!r()) {
      return;
    }
    if (j())
    {
      a(a - 1, f - 1, a + i + 1, f + j + 1, -6250336);
      a(a, f, a + i, f + j, -16777216);
    }
    int ☃ = q ? u : v;
    int ☃ = s - r;
    int ☃ = t - r;
    String ☃ = h.a(k.substring(r), p());
    boolean ☃ = (☃ >= 0) && (☃ <= ☃.length());
    boolean ☃ = (p) && (m / 6 % 2 == 0) && (☃);
    int ☃ = n ? a + 4 : a;
    int ☃ = n ? f + (j - 8) / 2 : f;
    int ☃ = ☃;
    if (☃ > ☃.length()) {
      ☃ = ☃.length();
    }
    if (☃.length() > 0)
    {
      String ☃ = ☃ ? ☃.substring(0, ☃) : ☃;
      ☃ = h.a(☃, ☃, ☃, ☃);
    }
    boolean ☃ = (s < k.length()) || (k.length() >= h());
    int ☃ = ☃;
    if (!☃)
    {
      ☃ = ☃ > 0 ? ☃ + i : ☃;
    }
    else if (☃)
    {
      ☃--;
      ☃--;
    }
    if ((☃.length() > 0) && (☃) && (☃ < ☃.length())) {
      ☃ = h.a(☃.substring(☃), ☃, ☃, ☃);
    }
    if (☃) {
      if (☃) {
        avp.a(☃, ☃ - 1, ☃ + 1, ☃ + 1 + h.a, -3092272);
      } else {
        h.a("_", ☃, ☃, ☃);
      }
    }
    if (☃ != ☃)
    {
      int ☃ = ☃ + h.a(☃.substring(0, ☃));
      c(☃, ☃ - 1, ☃ - 1, ☃ + 1 + h.a);
    }
  }
  
  private void c(int ☃, int ☃, int ☃, int ☃)
  {
    if (☃ < ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    if (☃ < ☃)
    {
      int ☃ = ☃;
      ☃ = ☃;
      ☃ = ☃;
    }
    if (☃ > a + i) {
      ☃ = a + i;
    }
    if (☃ > a + i) {
      ☃ = a + i;
    }
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    bfl.c(0.0F, 0.0F, 255.0F, 255.0F);
    bfl.x();
    bfl.u();
    bfl.f(5387);
    
    ☃.a(7, bms.e);
    ☃.b(☃, ☃, 0.0D).d();
    ☃.b(☃, ☃, 0.0D).d();
    ☃.b(☃, ☃, 0.0D).d();
    ☃.b(☃, ☃, 0.0D).d();
    ☃.b();
    
    bfl.v();
    bfl.w();
  }
  
  public void f(int ☃)
  {
    l = ☃;
    if (k.length() > ☃) {
      k = k.substring(0, ☃);
    }
  }
  
  public int h()
  {
    return l;
  }
  
  public int i()
  {
    return s;
  }
  
  public boolean j()
  {
    return n;
  }
  
  public void a(boolean ☃)
  {
    n = ☃;
  }
  
  public void g(int ☃)
  {
    u = ☃;
  }
  
  public void h(int ☃)
  {
    v = ☃;
  }
  
  public void b(boolean ☃)
  {
    if ((☃) && (!p)) {
      m = 0;
    }
    p = ☃;
  }
  
  public boolean m()
  {
    return p;
  }
  
  public void c(boolean ☃)
  {
    q = ☃;
  }
  
  public int o()
  {
    return t;
  }
  
  public int p()
  {
    return j() ? i - 8 : i;
  }
  
  public void i(int ☃)
  {
    int ☃ = k.length();
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ < 0) {
      ☃ = 0;
    }
    t = ☃;
    if (h != null)
    {
      if (r > ☃) {
        r = ☃;
      }
      int ☃ = p();
      String ☃ = h.a(k.substring(r), ☃);
      int ☃ = ☃.length() + r;
      if (☃ == r) {
        r -= h.a(k, ☃, true).length();
      }
      if (☃ > ☃) {
        r += ☃ - ☃;
      } else if (☃ <= r) {
        r -= r - ☃;
      }
      r = ns.a(r, 0, ☃);
    }
  }
  
  public void d(boolean ☃)
  {
    o = ☃;
  }
  
  public boolean r()
  {
    return w;
  }
  
  public void e(boolean ☃)
  {
    w = ☃;
  }
}
