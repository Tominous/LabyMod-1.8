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
    this.d = ☃;
  }
  
  public zx h()
  {
    if ((this.c < 9) && (this.c >= 0)) {
      return this.a[this.c];
    }
    return null;
  }
  
  public static int i()
  {
    return 9;
  }
  
  private int c(zw ☃)
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if ((this.a[☃] != null) && (this.a[☃].b() == ☃)) {
        return ☃;
      }
    }
    return -1;
  }
  
  private int a(zw ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if ((this.a[☃] != null) && (this.a[☃].b() == ☃) && (this.a[☃].i() == ☃)) {
        return ☃;
      }
    }
    return -1;
  }
  
  private int d(zx ☃)
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if ((this.a[☃] != null) && (this.a[☃].b() == ☃.b()) && (this.a[☃].d()) && (this.a[☃].b < this.a[☃].c()) && (this.a[☃].b < q_()) && ((!this.a[☃].f()) || (this.a[☃].i() == ☃.i())) && (zx.a(this.a[☃], ☃))) {
        return ☃;
      }
    }
    return -1;
  }
  
  public int j()
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if (this.a[☃] == null) {
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
      this.c = ☃;
      return;
    }
    if ((!☃) || (☃ == null)) {
      return;
    }
    int ☃ = j();
    if ((☃ >= 0) && (☃ < 9)) {
      this.c = ☃;
    }
    if ((☃ == null) || (!☃.v()) || (a(☃.b(), ☃.h()) != this.c))
    {
      int ☃ = a(☃, ☃);
      int ☃;
      if (☃ >= 0)
      {
        int ☃ = this.a[☃].b;
        this.a[☃] = this.a[this.c];
      }
      else
      {
        ☃ = 1;
      }
      this.a[this.c] = new zx(☃, ☃, ☃);
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
    this.c -= ☃;
    while (this.c < 0) {
      this.c += 9;
    }
    while (this.c >= 9) {
      this.c -= 9;
    }
  }
  
  public int a(zw ☃, int ☃, int ☃, dn ☃)
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < this.a.length; ☃++)
    {
      zx ☃ = this.a[☃];
      if (☃ != null) {
        if ((☃ == null) || (☃.b() == ☃)) {
          if ((☃ <= -1) || (☃.i() == ☃)) {
            if ((☃ == null) || (dy.a(☃, ☃.o(), true)))
            {
              int ☃ = ☃ <= 0 ? ☃.b : Math.min(☃ - ☃, ☃.b);
              ☃ += ☃;
              if (☃ != 0)
              {
                this.a[☃].b -= ☃;
                if (this.a[☃].b == 0) {
                  this.a[☃] = null;
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
    for (int ☃ = 0; ☃ < this.b.length; ☃++)
    {
      zx ☃ = this.b[☃];
      if (☃ != null) {
        if ((☃ == null) || (☃.b() == ☃)) {
          if ((☃ <= -1) || (☃.i() == ☃)) {
            if ((☃ == null) || (dy.a(☃, ☃.o(), false)))
            {
              int ☃ = ☃ <= 0 ? ☃.b : Math.min(☃ - ☃, ☃.b);
              ☃ += ☃;
              if (☃ != 0)
              {
                this.b[☃].b -= ☃;
                if (this.b[☃].b == 0) {
                  this.b[☃] = null;
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
    if (this.f != null)
    {
      if ((☃ != null) && (this.f.b() != ☃)) {
        return ☃;
      }
      if ((☃ > -1) && (this.f.i() != ☃)) {
        return ☃;
      }
      if ((☃ != null) && (!dy.a(☃, this.f.o(), false))) {
        return ☃;
      }
      int ☃ = ☃ <= 0 ? this.f.b : Math.min(☃ - ☃, this.f.b);
      ☃ += ☃;
      if (☃ != 0)
      {
        this.f.b -= ☃;
        if (this.f.b == 0) {
          this.f = null;
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
    int ☃ = ☃.b;
    
    int ☃ = d(☃);
    if (☃ < 0) {
      ☃ = j();
    }
    if (☃ < 0) {
      return ☃;
    }
    if (this.a[☃] == null)
    {
      this.a[☃] = new zx(☃, 0, ☃.i());
      if (☃.n()) {
        this.a[☃].d((dn)☃.o().b());
      }
    }
    int ☃ = ☃;
    if (☃ > this.a[☃].c() - this.a[☃].b) {
      ☃ = this.a[☃].c() - this.a[☃].b;
    }
    if (☃ > q_() - this.a[☃].b) {
      ☃ = q_() - this.a[☃].b;
    }
    if (☃ == 0) {
      return ☃;
    }
    ☃ -= ☃;
    this.a[☃].b += ☃;
    this.a[☃].c = 5;
    
    return ☃;
  }
  
  public void k()
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if (this.a[☃] != null) {
        this.a[☃].a(this.d.o, this.d, ☃, this.c == ☃);
      }
    }
  }
  
  public boolean a(zw ☃)
  {
    int ☃ = c(☃);
    if (☃ < 0) {
      return false;
    }
    if (--this.a[☃].b <= 0) {
      this.a[☃] = null;
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
    if ((☃ == null) || (☃.b == 0) || (☃.b() == null)) {
      return false;
    }
    try
    {
      if (!☃.g())
      {
        int ☃;
        do
        {
          ☃ = ☃.b;
          ☃.b = e(☃);
        } while ((☃.b > 0) && (☃.b < ☃));
        if ((☃.b == ☃) && (this.d.bA.d))
        {
          ☃.b = 0;
          return true;
        }
        return ☃.b < ☃;
      }
      int ☃ = j();
      if (☃ >= 0)
      {
        this.a[☃] = zx.b(☃);
        this.a[☃].c = 5;
        ☃.b = 0;
        return true;
      }
      if (this.d.bA.d)
      {
        ☃.b = 0;
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
    zx[] ☃ = this.a;
    if (☃ >= this.a.length)
    {
      ☃ = this.b;
      ☃ -= this.a.length;
    }
    if (☃[☃] != null)
    {
      if (☃[☃].b <= ☃)
      {
        zx ☃ = ☃[☃];
        ☃[☃] = null;
        return ☃;
      }
      zx ☃ = ☃[☃].a(☃);
      if (☃[☃].b == 0) {
        ☃[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    zx[] ☃ = this.a;
    if (☃ >= this.a.length)
    {
      ☃ = this.b;
      ☃ -= this.a.length;
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
    zx[] ☃ = this.a;
    if (☃ >= ☃.length)
    {
      ☃ -= ☃.length;
      ☃ = this.b;
    }
    ☃[☃] = ☃;
  }
  
  public float a(afh ☃)
  {
    float ☃ = 1.0F;
    if (this.a[this.c] != null) {
      ☃ *= this.a[this.c].a(☃);
    }
    return ☃;
  }
  
  public du a(du ☃)
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if (this.a[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        this.a[☃].b(☃);
        ☃.a(☃);
      }
    }
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      if (this.b[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)(☃ + 100));
        this.b[☃].b(☃);
        ☃.a(☃);
      }
    }
    return ☃;
  }
  
  public void b(du ☃)
  {
    this.a = new zx[36];
    this.b = new zx[4];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot") & 0xFF;
      zx ☃ = zx.a(☃);
      if (☃ != null)
      {
        if ((☃ >= 0) && (☃ < this.a.length)) {
          this.a[☃] = ☃;
        }
        if ((☃ >= 100) && (☃ < this.b.length + 100)) {
          this.b[(☃ - 100)] = ☃;
        }
      }
    }
  }
  
  public int o_()
  {
    return this.a.length + 4;
  }
  
  public zx a(int ☃)
  {
    zx[] ☃ = this.a;
    if (☃ >= ☃.length)
    {
      ☃ -= ☃.length;
      ☃ = this.b;
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
    zx ☃ = a(this.c);
    if (☃ != null) {
      return ☃.b(☃);
    }
    return false;
  }
  
  public zx e(int ☃)
  {
    return this.b[☃];
  }
  
  public int m()
  {
    int ☃ = 0;
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      if ((this.b[☃] != null) && ((this.b[☃].b() instanceof yj)))
      {
        int ☃ = ((yj)this.b[☃].b()).c;
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
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      if ((this.b[☃] != null) && ((this.b[☃].b() instanceof yj)))
      {
        this.b[☃].a((int)☃, this.d);
        if (this.b[☃].b == 0) {
          this.b[☃] = null;
        }
      }
    }
  }
  
  public void n()
  {
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if (this.a[☃] != null)
      {
        this.d.a(this.a[☃], true, false);
        this.a[☃] = null;
      }
    }
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      if (this.b[☃] != null)
      {
        this.d.a(this.b[☃], true, false);
        this.b[☃] = null;
      }
    }
  }
  
  public void p_()
  {
    this.e = true;
  }
  
  public void b(zx ☃)
  {
    this.f = ☃;
  }
  
  public zx p()
  {
    return this.f;
  }
  
  public boolean a(wn ☃)
  {
    if (this.d.I) {
      return false;
    }
    if (☃.h(this.d) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public boolean c(zx ☃)
  {
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      if ((this.b[☃] != null) && (this.b[☃].a(☃))) {
        return true;
      }
    }
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      if ((this.a[☃] != null) && (this.a[☃].a(☃))) {
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
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃] = zx.b(☃.a[☃]);
    }
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃] = zx.b(☃.b[☃]);
    }
    this.c = ☃.c;
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
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃] = null;
    }
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃] = null;
    }
  }
}
