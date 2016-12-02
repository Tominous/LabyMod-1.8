import java.util.concurrent.Callable;

public class wm
  implements og
{
  public zx[] a = new zx[36];
  public zx[] b = new zx[4];
  public int c;
  public wn d;
  private zx f;
  public boolean e;
  
  public wm(wn ☃)
  {
    d = ☃;
  }
  
  public zx h()
  {
    if ((c < 9) && (c >= 0)) {
      return a[c];
    }
    return null;
  }
  
  public static int i()
  {
    return 9;
  }
  
  private int c(zw ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if ((a[☃] != null) && (a[☃].b() == ☃)) {
        return ☃;
      }
    }
    return -1;
  }
  
  private int a(zw ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if ((a[☃] != null) && (a[☃].b() == ☃) && (a[☃].i() == ☃)) {
        return ☃;
      }
    }
    return -1;
  }
  
  private int d(zx ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if ((a[☃] != null) && (a[☃].b() == ☃.b()) && (a[☃].d()) && (a[☃].b < a[☃].c()) && (a[☃].b < q_()) && ((!a[☃].f()) || (a[☃].i() == ☃.i())) && (zx.a(a[☃], ☃))) {
        return ☃;
      }
    }
    return -1;
  }
  
  public int j()
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] == null) {
        return ☃;
      }
    }
    return -1;
  }
  
  public void a(zw ☃, int ☃, boolean ☃, boolean ☃)
  {
    zx ☃ = h();
    int ☃ = ☃ ? a(☃, ☃) : c(☃);
    if ((☃ >= 0) && (☃ < 9))
    {
      c = ☃;
      return;
    }
    if ((!☃) || (☃ == null)) {
      return;
    }
    int ☃ = j();
    if ((☃ >= 0) && (☃ < 9)) {
      c = ☃;
    }
    if ((☃ == null) || (!☃.v()) || (a(☃.b(), ☃.h()) != c))
    {
      int ☃ = a(☃, ☃);
      int ☃;
      if (☃ >= 0)
      {
        int ☃ = a[☃].b;
        a[☃] = a[c];
      }
      else
      {
        ☃ = 1;
      }
      a[c] = new zx(☃, ☃, ☃);
    }
  }
  
  public void d(int ☃)
  {
    if (☃ > 0) {
      ☃ = 1;
    }
    if (☃ < 0) {
      ☃ = -1;
    }
    c -= ☃;
    while (c < 0) {
      c += 9;
    }
    while (c >= 9) {
      c -= 9;
    }
  }
  
  public int a(zw ☃, int ☃, int ☃, dn ☃)
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < a.length; ☃++)
    {
      zx ☃ = a[☃];
      if (☃ != null) {
        if ((☃ == null) || (☃.b() == ☃)) {
          if ((☃ <= -1) || (☃.i() == ☃)) {
            if ((☃ == null) || (dy.a(☃, ☃.o(), true)))
            {
              int ☃ = ☃ <= 0 ? b : Math.min(☃ - ☃, b);
              ☃ += ☃;
              if (☃ != 0)
              {
                a[☃].b -= ☃;
                if (a[☃].b == 0) {
                  a[☃] = null;
                }
                if ((☃ > 0) && (☃ >= ☃)) {
                  return ☃;
                }
              }
            }
          }
        }
      }
    }
    for (int ☃ = 0; ☃ < b.length; ☃++)
    {
      zx ☃ = b[☃];
      if (☃ != null) {
        if ((☃ == null) || (☃.b() == ☃)) {
          if ((☃ <= -1) || (☃.i() == ☃)) {
            if ((☃ == null) || (dy.a(☃, ☃.o(), false)))
            {
              int ☃ = ☃ <= 0 ? b : Math.min(☃ - ☃, b);
              ☃ += ☃;
              if (☃ != 0)
              {
                b[☃].b -= ☃;
                if (b[☃].b == 0) {
                  b[☃] = null;
                }
                if ((☃ > 0) && (☃ >= ☃)) {
                  return ☃;
                }
              }
            }
          }
        }
      }
    }
    if (f != null)
    {
      if ((☃ != null) && (f.b() != ☃)) {
        return ☃;
      }
      if ((☃ > -1) && (f.i() != ☃)) {
        return ☃;
      }
      if ((☃ != null) && (!dy.a(☃, f.o(), false))) {
        return ☃;
      }
      int ☃ = ☃ <= 0 ? f.b : Math.min(☃ - ☃, f.b);
      ☃ += ☃;
      if (☃ != 0)
      {
        f.b -= ☃;
        if (f.b == 0) {
          f = null;
        }
        if ((☃ > 0) && (☃ >= ☃)) {
          return ☃;
        }
      }
    }
    return ☃;
  }
  
  private int e(zx ☃)
  {
    zw ☃ = ☃.b();
    int ☃ = b;
    
    int ☃ = d(☃);
    if (☃ < 0) {
      ☃ = j();
    }
    if (☃ < 0) {
      return ☃;
    }
    if (a[☃] == null)
    {
      a[☃] = new zx(☃, 0, ☃.i());
      if (☃.n()) {
        a[☃].d((dn)☃.o().b());
      }
    }
    int ☃ = ☃;
    if (☃ > a[☃].c() - a[☃].b) {
      ☃ = a[☃].c() - a[☃].b;
    }
    if (☃ > q_() - a[☃].b) {
      ☃ = q_() - a[☃].b;
    }
    if (☃ == 0) {
      return ☃;
    }
    ☃ -= ☃;
    a[☃].b += ☃;
    a[☃].c = 5;
    
    return ☃;
  }
  
  public void k()
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] != null) {
        a[☃].a(d.o, d, ☃, c == ☃);
      }
    }
  }
  
  public boolean a(zw ☃)
  {
    int ☃ = c(☃);
    if (☃ < 0) {
      return false;
    }
    if (--a[☃].b <= 0) {
      a[☃] = null;
    }
    return true;
  }
  
  public boolean b(zw ☃)
  {
    int ☃ = c(☃);
    if (☃ < 0) {
      return false;
    }
    return true;
  }
  
  public boolean a(final zx ☃)
  {
    if ((☃ == null) || (b == 0) || (☃.b() == null)) {
      return false;
    }
    try
    {
      if (!☃.g())
      {
        int ☃;
        do
        {
          ☃ = b;
          b = e(☃);
        } while ((b > 0) && (b < ☃));
        if ((b == ☃) && (d.bA.d))
        {
          b = 0;
          return true;
        }
        return b < ☃;
      }
      int ☃ = j();
      if (☃ >= 0)
      {
        a[☃] = zx.b(☃);
        a[☃].c = 5;
        b = 0;
        return true;
      }
      if (d.bA.d)
      {
        b = 0;
        return true;
      }
      return false;
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Adding item to inventory");
      c ☃ = ☃.a("Item being added");
      
      ☃.a("Item ID", Integer.valueOf(zw.b(☃.b())));
      ☃.a("Item data", Integer.valueOf(☃.i()));
      ☃.a("Item name", new Callable()
      {
        public String a()
          throws Exception
        {
          return ☃.q();
        }
      });
      throw new e(☃);
    }
  }
  
  public zx a(int ☃, int ☃)
  {
    zx[] ☃ = a;
    if (☃ >= a.length)
    {
      ☃ = b;
      ☃ -= a.length;
    }
    if (☃[☃] != null)
    {
      if (b <= ☃)
      {
        zx ☃ = ☃[☃];
        ☃[☃] = null;
        return ☃;
      }
      zx ☃ = ☃[☃].a(☃);
      if (b == 0) {
        ☃[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    zx[] ☃ = a;
    if (☃ >= a.length)
    {
      ☃ = b;
      ☃ -= a.length;
    }
    if (☃[☃] != null)
    {
      zx ☃ = ☃[☃];
      ☃[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    zx[] ☃ = a;
    if (☃ >= ☃.length)
    {
      ☃ -= ☃.length;
      ☃ = b;
    }
    ☃[☃] = ☃;
  }
  
  public float a(afh ☃)
  {
    float ☃ = 1.0F;
    if (a[c] != null) {
      ☃ *= a[c].a(☃);
    }
    return ☃;
  }
  
  public du a(du ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        a[☃].b(☃);
        ☃.a(☃);
      }
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      if (b[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)(☃ + 100));
        b[☃].b(☃);
        ☃.a(☃);
      }
    }
    return ☃;
  }
  
  public void b(du ☃)
  {
    a = new zx[36];
    b = new zx[4];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      zx ☃ = zx.a(☃);
      if (☃ != null)
      {
        if ((☃ >= 0) && (☃ < a.length)) {
          a[☃] = ☃;
        }
        if ((☃ >= 100) && (☃ < b.length + 100)) {
          b[(☃ - 100)] = ☃;
        }
      }
    }
  }
  
  public int o_()
  {
    return a.length + 4;
  }
  
  public zx a(int ☃)
  {
    zx[] ☃ = a;
    if (☃ >= ☃.length)
    {
      ☃ -= ☃.length;
      ☃ = b;
    }
    return ☃[☃];
  }
  
  public String e_()
  {
    return "container.inventory";
  }
  
  public boolean l_()
  {
    return false;
  }
  
  public eu f_()
  {
    if (l_()) {
      return new fa(e_());
    }
    return new fb(e_(), new Object[0]);
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean b(afh ☃)
  {
    if (☃.t().l()) {
      return true;
    }
    zx ☃ = a(c);
    if (☃ != null) {
      return ☃.b(☃);
    }
    return false;
  }
  
  public zx e(int ☃)
  {
    return b[☃];
  }
  
  public int m()
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      if ((b[☃] != null) && ((b[☃].b() instanceof yj)))
      {
        int ☃ = b[☃].b()).c;
        ☃ += ☃;
      }
    }
    return ☃;
  }
  
  public void a(float ☃)
  {
    ☃ /= 4.0F;
    if (☃ < 1.0F) {
      ☃ = 1.0F;
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      if ((b[☃] != null) && ((b[☃].b() instanceof yj)))
      {
        b[☃].a((int)☃, d);
        if (b[☃].b == 0) {
          b[☃] = null;
        }
      }
    }
  }
  
  public void n()
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] != null)
      {
        d.a(a[☃], true, false);
        a[☃] = null;
      }
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      if (b[☃] != null)
      {
        d.a(b[☃], true, false);
        b[☃] = null;
      }
    }
  }
  
  public void p_()
  {
    e = true;
  }
  
  public void b(zx ☃)
  {
    f = ☃;
  }
  
  public zx p()
  {
    return f;
  }
  
  public boolean a(wn ☃)
  {
    if (d.I) {
      return false;
    }
    if (☃.h(d) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public boolean c(zx ☃)
  {
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      if ((b[☃] != null) && (b[☃].a(☃))) {
        return true;
      }
    }
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if ((a[☃] != null) && (a[☃].a(☃))) {
        return true;
      }
    }
    return false;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    return true;
  }
  
  public void b(wm ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃] = zx.b(a[☃]);
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃] = zx.b(b[☃]);
    }
    c = c;
  }
  
  public int a_(int ☃)
  {
    return 0;
  }
  
  public void b(int ☃, int ☃) {}
  
  public int g()
  {
    return 0;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      a[☃] = null;
    }
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃] = null;
    }
  }
}
