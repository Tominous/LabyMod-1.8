public class alh
  extends alk
  implements km, ot
{
  private static final int[] a = { 0 };
  private static final int[] f = { 2, 1 };
  private static final int[] g = { 1 };
  private zx[] h = new zx[3];
  private int i;
  private int j;
  private int k;
  private int l;
  private String m;
  
  public int o_()
  {
    return this.h.length;
  }
  
  public zx a(int ☃)
  {
    return this.h[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (this.h[☃] != null)
    {
      if (this.h[☃].b <= ☃)
      {
        zx ☃ = this.h[☃];
        this.h[☃] = null;
        return ☃;
      }
      zx ☃ = this.h[☃].a(☃);
      if (this.h[☃].b == 0) {
        this.h[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (this.h[☃] != null)
    {
      zx ☃ = this.h[☃];
      this.h[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    boolean ☃ = (☃ != null) && (☃.a(this.h[☃])) && (zx.a(☃, this.h[☃]));
    this.h[☃] = ☃;
    if ((☃ != null) && (☃.b > q_())) {
      ☃.b = q_();
    }
    if ((☃ == 0) && (!☃))
    {
      this.l = a(☃);
      this.k = 0;
      p_();
    }
  }
  
  public String e_()
  {
    return l_() ? this.m : "container.furnace";
  }
  
  public boolean l_()
  {
    return (this.m != null) && (this.m.length() > 0);
  }
  
  public void a(String ☃)
  {
    this.m = ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    du ☃ = ☃.c("Items", 10);
    this.h = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot");
      if ((☃ >= 0) && (☃ < this.h.length)) {
        this.h[☃] = zx.a(☃);
      }
    }
    this.i = ☃.e("BurnTime");
    this.k = ☃.e("CookTime");
    this.l = ☃.e("CookTimeTotal");
    this.j = b(this.h[1]);
    if (☃.b("CustomName", 8)) {
      this.m = ☃.j("CustomName");
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("BurnTime", (short)this.i);
    ☃.a("CookTime", (short)this.k);
    ☃.a("CookTimeTotal", (short)this.l);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < this.h.length; ☃++) {
      if (this.h[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        this.h[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    if (l_()) {
      ☃.a("CustomName", this.m);
    }
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean m()
  {
    return this.i > 0;
  }
  
  public static boolean a(og ☃)
  {
    return ☃.a_(0) > 0;
  }
  
  public void c()
  {
    boolean ☃ = m();
    boolean ☃ = false;
    if (m()) {
      this.i -= 1;
    }
    if (!this.b.D)
    {
      if ((m()) || ((this.h[1] != null) && (this.h[0] != null)))
      {
        if ((!m()) && (o()))
        {
          this.j = (this.i = b(this.h[1]));
          if (m())
          {
            ☃ = true;
            if (this.h[1] != null)
            {
              this.h[1].b -= 1;
              if (this.h[1].b == 0)
              {
                zw ☃ = this.h[1].b().q();
                this.h[1] = (☃ != null ? new zx(☃) : null);
              }
            }
          }
        }
        if ((m()) && (o()))
        {
          this.k += 1;
          if (this.k == this.l)
          {
            this.k = 0;
            this.l = a(this.h[0]);
            n();
            ☃ = true;
          }
        }
        else
        {
          this.k = 0;
        }
      }
      else if ((!m()) && 
        (this.k > 0))
      {
        this.k = ns.a(this.k - 2, 0, this.l);
      }
      if (☃ != m())
      {
        ☃ = true;
        ahb.a(m(), this.b, this.c);
      }
    }
    if (☃) {
      p_();
    }
  }
  
  public int a(zx ☃)
  {
    return 200;
  }
  
  private boolean o()
  {
    if (this.h[0] == null) {
      return false;
    }
    zx ☃ = abo.a().a(this.h[0]);
    if (☃ == null) {
      return false;
    }
    if (this.h[2] == null) {
      return true;
    }
    if (!this.h[2].a(☃)) {
      return false;
    }
    if ((this.h[2].b < q_()) && (this.h[2].b < this.h[2].c())) {
      return true;
    }
    if (this.h[2].b < ☃.c()) {
      return true;
    }
    return false;
  }
  
  public void n()
  {
    if (!o()) {
      return;
    }
    zx ☃ = abo.a().a(this.h[0]);
    if (this.h[2] == null) {
      this.h[2] = ☃.k();
    } else if (this.h[2].b() == ☃.b()) {
      this.h[2].b += 1;
    }
    if ((this.h[0].b() == zw.a(afi.v)) && (this.h[0].i() == 1) && (this.h[1] != null) && (this.h[1].b() == zy.aw)) {
      this.h[1] = new zx(zy.ax);
    }
    this.h[0].b -= 1;
    if (this.h[0].b <= 0) {
      this.h[0] = null;
    }
  }
  
  public static int b(zx ☃)
  {
    if (☃ == null) {
      return 0;
    }
    zw ☃ = ☃.b();
    if (((☃ instanceof yo)) && (afh.a(☃) != afi.a))
    {
      afh ☃ = afh.a(☃);
      if (☃ == afi.bM) {
        return 150;
      }
      if (☃.t() == arm.d) {
        return 300;
      }
      if (☃ == afi.cA) {
        return 16000;
      }
    }
    if (((☃ instanceof za)) && (((za)☃).h().equals("WOOD"))) {
      return 200;
    }
    if (((☃ instanceof aay)) && (((aay)☃).h().equals("WOOD"))) {
      return 200;
    }
    if (((☃ instanceof zv)) && (((zv)☃).g().equals("WOOD"))) {
      return 200;
    }
    if (☃ == zy.y) {
      return 100;
    }
    if (☃ == zy.h) {
      return 1600;
    }
    if (☃ == zy.ay) {
      return 20000;
    }
    if (☃ == zw.a(afi.g)) {
      return 100;
    }
    if (☃ == zy.bv) {
      return 2400;
    }
    return 0;
  }
  
  public static boolean c(zx ☃)
  {
    return b(☃) > 0;
  }
  
  public boolean a(wn ☃)
  {
    if (this.b.s(this.c) != this) {
      return false;
    }
    if (☃.e(this.c.n() + 0.5D, this.c.o() + 0.5D, this.c.p() + 0.5D) > 64.0D) {
      return false;
    }
    return true;
  }
  
  public void b(wn ☃) {}
  
  public void c(wn ☃) {}
  
  public boolean b(int ☃, zx ☃)
  {
    if (☃ == 2) {
      return false;
    }
    if (☃ == 1) {
      return (c(☃)) || (xt.c_(☃));
    }
    return true;
  }
  
  public int[] a(cq ☃)
  {
    if (☃ == cq.a) {
      return f;
    }
    if (☃ == cq.b) {
      return a;
    }
    return g;
  }
  
  public boolean a(int ☃, zx ☃, cq ☃)
  {
    return b(☃, ☃);
  }
  
  public boolean b(int ☃, zx ☃, cq ☃)
  {
    if ((☃ == cq.a) && (☃ == 1))
    {
      zw ☃ = ☃.b();
      if ((☃ != zy.ax) && (☃ != zy.aw)) {
        return false;
      }
    }
    return true;
  }
  
  public String k()
  {
    return "minecraft:furnace";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xu(☃, this);
  }
  
  public int a_(int ☃)
  {
    switch (☃)
    {
    case 0: 
      return this.i;
    case 1: 
      return this.j;
    case 2: 
      return this.k;
    case 3: 
      return this.l;
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      this.i = ☃;
      break;
    case 1: 
      this.j = ☃;
      break;
    case 2: 
      this.k = ☃;
      break;
    case 3: 
      this.l = ☃;
    }
  }
  
  public int g()
  {
    return 4;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < this.h.length; ☃++) {
      this.h[☃] = null;
    }
  }
}
