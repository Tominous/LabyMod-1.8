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
    return h.length;
  }
  
  public zx a(int ☃)
  {
    return h[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (h[☃] != null)
    {
      if (h[☃].b <= ☃)
      {
        zx ☃ = h[☃];
        h[☃] = null;
        return ☃;
      }
      zx ☃ = h[☃].a(☃);
      if (h[☃].b == 0) {
        h[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (h[☃] != null)
    {
      zx ☃ = h[☃];
      h[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    boolean ☃ = (☃ != null) && (☃.a(h[☃])) && (zx.a(☃, h[☃]));
    h[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
    if ((☃ == 0) && (!☃))
    {
      l = a(☃);
      k = 0;
      p_();
    }
  }
  
  public String e_()
  {
    return l_() ? m : "container.furnace";
  }
  
  public boolean l_()
  {
    return (m != null) && (m.length() > 0);
  }
  
  public void a(String ☃)
  {
    m = ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    du ☃ = ☃.c("Items", 10);
    h = new zx[o_()];
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot");
      if ((☃ >= 0) && (☃ < h.length)) {
        h[☃] = zx.a(☃);
      }
    }
    i = ☃.e("BurnTime");
    k = ☃.e("CookTime");
    l = ☃.e("CookTimeTotal");
    j = b(h[1]);
    if (☃.b("CustomName", 8)) {
      m = ☃.j("CustomName");
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    ☃.a("BurnTime", (short)i);
    ☃.a("CookTime", (short)k);
    ☃.a("CookTimeTotal", (short)l);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < h.length; ☃++) {
      if (h[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        h[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    if (l_()) {
      ☃.a("CustomName", m);
    }
  }
  
  public int q_()
  {
    return 64;
  }
  
  public boolean m()
  {
    return i > 0;
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
      i -= 1;
    }
    if (!b.D)
    {
      if ((m()) || ((h[1] != null) && (h[0] != null)))
      {
        if ((!m()) && (o()))
        {
          j = (i = b(h[1]));
          if (m())
          {
            ☃ = true;
            if (h[1] != null)
            {
              h[1].b -= 1;
              if (h[1].b == 0)
              {
                zw ☃ = h[1].b().q();
                h[1] = (☃ != null ? new zx(☃) : null);
              }
            }
          }
        }
        if ((m()) && (o()))
        {
          k += 1;
          if (k == l)
          {
            k = 0;
            l = a(h[0]);
            n();
            ☃ = true;
          }
        }
        else
        {
          k = 0;
        }
      }
      else if ((!m()) && 
        (k > 0))
      {
        k = ns.a(k - 2, 0, l);
      }
      if (☃ != m())
      {
        ☃ = true;
        ahb.a(m(), b, c);
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
    if (h[0] == null) {
      return false;
    }
    zx ☃ = abo.a().a(h[0]);
    if (☃ == null) {
      return false;
    }
    if (h[2] == null) {
      return true;
    }
    if (!h[2].a(☃)) {
      return false;
    }
    if ((h[2].b < q_()) && (h[2].b < h[2].c())) {
      return true;
    }
    if (h[2].b < ☃.c()) {
      return true;
    }
    return false;
  }
  
  public void n()
  {
    if (!o()) {
      return;
    }
    zx ☃ = abo.a().a(h[0]);
    if (h[2] == null) {
      h[2] = ☃.k();
    } else if (h[2].b() == ☃.b()) {
      h[2].b += 1;
    }
    if ((h[0].b() == zw.a(afi.v)) && (h[0].i() == 1) && (h[1] != null) && (h[1].b() == zy.aw)) {
      h[1] = new zx(zy.ax);
    }
    h[0].b -= 1;
    if (h[0].b <= 0) {
      h[0] = null;
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
    if (b.s(c) != this) {
      return false;
    }
    if (☃.e(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D) > 64.0D) {
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
      return i;
    case 1: 
      return j;
    case 2: 
      return k;
    case 3: 
      return l;
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      i = ☃;
      break;
    case 1: 
      j = ☃;
      break;
    case 2: 
      k = ☃;
      break;
    case 3: 
      l = ☃;
    }
  }
  
  public int g()
  {
    return 4;
  }
  
  public void l()
  {
    for (int ☃ = 0; ☃ < h.length; ☃++) {
      h[☃] = null;
    }
  }
}
