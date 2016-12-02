import java.util.List;
import java.util.Random;

public class alj
  extends alk
  implements ali, km
{
  private zx[] a = new zx[5];
  private String f;
  private int g = -1;
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    du ☃ = ☃.c("Items", 10);
    a = new zx[o_()];
    if (☃.b("CustomName", 8)) {
      f = ☃.j("CustomName");
    }
    g = ☃.f("TransferCooldown");
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      int ☃ = ☃.d("Slot");
      if ((☃ >= 0) && (☃ < a.length)) {
        a[☃] = zx.a(☃);
      }
    }
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if (a[☃] != null)
      {
        dn ☃ = new dn();
        ☃.a("Slot", (byte)☃);
        a[☃].b(☃);
        ☃.a(☃);
      }
    }
    ☃.a("Items", ☃);
    ☃.a("TransferCooldown", g);
    if (l_()) {
      ☃.a("CustomName", f);
    }
  }
  
  public void p_()
  {
    super.p_();
  }
  
  public int o_()
  {
    return a.length;
  }
  
  public zx a(int ☃)
  {
    return a[☃];
  }
  
  public zx a(int ☃, int ☃)
  {
    if (a[☃] != null)
    {
      if (a[☃].b <= ☃)
      {
        zx ☃ = a[☃];
        a[☃] = null;
        return ☃;
      }
      zx ☃ = a[☃].a(☃);
      if (a[☃].b == 0) {
        a[☃] = null;
      }
      return ☃;
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if (a[☃] != null)
    {
      zx ☃ = a[☃];
      a[☃] = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    a[☃] = ☃;
    if ((☃ != null) && (b > q_())) {
      b = q_();
    }
  }
  
  public String e_()
  {
    return l_() ? f : "container.hopper";
  }
  
  public boolean l_()
  {
    return (f != null) && (f.length() > 0);
  }
  
  public void a(String ☃)
  {
    f = ☃;
  }
  
  public int q_()
  {
    return 64;
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
    return true;
  }
  
  public void c()
  {
    if ((b == null) || (b.D)) {
      return;
    }
    g -= 1;
    if (!n())
    {
      d(0);
      m();
    }
  }
  
  public boolean m()
  {
    if ((b == null) || (b.D)) {
      return false;
    }
    if ((!n()) && (ahn.f(u())))
    {
      boolean ☃ = false;
      if (!p()) {
        ☃ = r();
      }
      if (!q()) {
        ☃ = (a(this)) || (☃);
      }
      if (☃)
      {
        d(8);
        p_();
        return true;
      }
    }
    return false;
  }
  
  private boolean p()
  {
    for (zx ☃ : a) {
      if (☃ != null) {
        return false;
      }
    }
    return true;
  }
  
  private boolean q()
  {
    for (zx ☃ : a) {
      if ((☃ == null) || (b != ☃.c())) {
        return false;
      }
    }
    return true;
  }
  
  private boolean r()
  {
    og ☃ = H();
    if (☃ == null) {
      return false;
    }
    cq ☃ = ahn.b(u()).d();
    if (a(☃, ☃)) {
      return false;
    }
    for (int ☃ = 0; ☃ < o_(); ☃++) {
      if (a(☃) != null)
      {
        zx ☃ = a(☃).k();
        zx ☃ = a(☃, a(☃, 1), ☃);
        if ((☃ == null) || (b == 0))
        {
          ☃.p_();
          return true;
        }
        a(☃, ☃);
      }
    }
    return false;
  }
  
  private boolean a(og ☃, cq ☃)
  {
    if ((☃ instanceof ot))
    {
      ot ☃ = (ot)☃;
      int[] ☃ = ☃.a(☃);
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        zx ☃ = ☃.a(☃[☃]);
        if ((☃ == null) || (b != ☃.c())) {
          return false;
        }
      }
    }
    else
    {
      int ☃ = ☃.o_();
      for (int ☃ = 0; ☃ < ☃; ☃++)
      {
        zx ☃ = ☃.a(☃);
        if ((☃ == null) || (b != ☃.c())) {
          return false;
        }
      }
    }
    return true;
  }
  
  private static boolean b(og ☃, cq ☃)
  {
    if ((☃ instanceof ot))
    {
      ot ☃ = (ot)☃;
      int[] ☃ = ☃.a(☃);
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        if (☃.a(☃[☃]) != null) {
          return false;
        }
      }
    }
    else
    {
      int ☃ = ☃.o_();
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        if (☃.a(☃) != null) {
          return false;
        }
      }
    }
    return true;
  }
  
  public static boolean a(ali ☃)
  {
    og ☃ = b(☃);
    if (☃ != null)
    {
      cq ☃ = cq.a;
      if (b(☃, ☃)) {
        return false;
      }
      if ((☃ instanceof ot))
      {
        ot ☃ = (ot)☃;
        int[] ☃ = ☃.a(☃);
        for (int ☃ = 0; ☃ < ☃.length; ☃++) {
          if (a(☃, ☃, ☃[☃], ☃)) {
            return true;
          }
        }
      }
      else
      {
        int ☃ = ☃.o_();
        for (int ☃ = 0; ☃ < ☃; ☃++) {
          if (a(☃, ☃, ☃, ☃)) {
            return true;
          }
        }
      }
    }
    else
    {
      for (uz ☃ : a(☃.z(), ☃.A(), ☃.B() + 1.0D, ☃.C())) {
        if (a(☃, ☃)) {
          return true;
        }
      }
    }
    return false;
  }
  
  private static boolean a(ali ☃, og ☃, int ☃, cq ☃)
  {
    zx ☃ = ☃.a(☃);
    if ((☃ != null) && (b(☃, ☃, ☃, ☃)))
    {
      zx ☃ = ☃.k();
      zx ☃ = a(☃, ☃.a(☃, 1), null);
      if ((☃ == null) || (b == 0))
      {
        ☃.p_();
        return true;
      }
      ☃.a(☃, ☃);
    }
    return false;
  }
  
  public static boolean a(og ☃, uz ☃)
  {
    boolean ☃ = false;
    if (☃ == null) {
      return false;
    }
    zx ☃ = ☃.l().k();
    zx ☃ = a(☃, ☃, null);
    if ((☃ == null) || (b == 0))
    {
      ☃ = true;
      
      ☃.J();
    }
    else
    {
      ☃.a(☃);
    }
    return ☃;
  }
  
  public static zx a(og ☃, zx ☃, cq ☃)
  {
    if (((☃ instanceof ot)) && (☃ != null))
    {
      ot ☃ = (ot)☃;
      int[] ☃ = ☃.a(☃);
      for (int ☃ = 0; (☃ < ☃.length) && (☃ != null) && (b > 0); ☃++) {
        ☃ = c(☃, ☃, ☃[☃], ☃);
      }
    }
    else
    {
      int ☃ = ☃.o_();
      for (int ☃ = 0; (☃ < ☃) && (☃ != null) && (b > 0); ☃++) {
        ☃ = c(☃, ☃, ☃, ☃);
      }
    }
    if ((☃ != null) && (b == 0)) {
      ☃ = null;
    }
    return ☃;
  }
  
  private static boolean a(og ☃, zx ☃, int ☃, cq ☃)
  {
    if (!☃.b(☃, ☃)) {
      return false;
    }
    if (((☃ instanceof ot)) && (!((ot)☃).a(☃, ☃, ☃))) {
      return false;
    }
    return true;
  }
  
  private static boolean b(og ☃, zx ☃, int ☃, cq ☃)
  {
    if (((☃ instanceof ot)) && (!((ot)☃).b(☃, ☃, ☃))) {
      return false;
    }
    return true;
  }
  
  private static zx c(og ☃, zx ☃, int ☃, cq ☃)
  {
    zx ☃ = ☃.a(☃);
    if (a(☃, ☃, ☃, ☃))
    {
      boolean ☃ = false;
      if (☃ == null)
      {
        ☃.a(☃, ☃);
        ☃ = null;
        ☃ = true;
      }
      else if (a(☃, ☃))
      {
        int ☃ = ☃.c() - b;
        int ☃ = Math.min(b, ☃);
        
        b -= ☃;
        b += ☃;
        ☃ = ☃ > 0;
      }
      if (☃)
      {
        if ((☃ instanceof alj))
        {
          alj ☃ = (alj)☃;
          if (☃.o()) {
            ☃.d(8);
          }
          ☃.p_();
        }
        ☃.p_();
      }
    }
    return ☃;
  }
  
  private og H()
  {
    cq ☃ = ahn.b(u());
    return b(z(), c.n() + ☃.g(), c.o() + ☃.h(), c.p() + ☃.i());
  }
  
  public static og b(ali ☃)
  {
    return b(☃.z(), ☃.A(), ☃.B() + 1.0D, ☃.C());
  }
  
  public static List<uz> a(adm ☃, double ☃, double ☃, double ☃)
  {
    return ☃.a(uz.class, new aug(☃ - 0.5D, ☃ - 0.5D, ☃ - 0.5D, ☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D), po.a);
  }
  
  public static og b(adm ☃, double ☃, double ☃, double ☃)
  {
    og ☃ = null;
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃);
    cj ☃ = new cj(☃, ☃, ☃);
    
    afh ☃ = ☃.p(☃).c();
    if (☃.z())
    {
      akw ☃ = ☃.s(☃);
      if ((☃ instanceof og))
      {
        ☃ = (og)☃;
        if (((☃ instanceof aky)) && 
          ((☃ instanceof afs))) {
          ☃ = ((afs)☃).f(☃, ☃);
        }
      }
    }
    if (☃ == null)
    {
      List<pk> ☃ = ☃.a(null, new aug(☃ - 0.5D, ☃ - 0.5D, ☃ - 0.5D, ☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D), po.c);
      if (☃.size() > 0) {
        ☃ = (og)☃.get(s.nextInt(☃.size()));
      }
    }
    return ☃;
  }
  
  private static boolean a(zx ☃, zx ☃)
  {
    if (☃.b() != ☃.b()) {
      return false;
    }
    if (☃.i() != ☃.i()) {
      return false;
    }
    if (b > ☃.c()) {
      return false;
    }
    if (!zx.a(☃, ☃)) {
      return false;
    }
    return true;
  }
  
  public double A()
  {
    return c.n() + 0.5D;
  }
  
  public double B()
  {
    return c.o() + 0.5D;
  }
  
  public double C()
  {
    return c.p() + 0.5D;
  }
  
  public void d(int ☃)
  {
    g = ☃;
  }
  
  public boolean n()
  {
    return g > 0;
  }
  
  public boolean o()
  {
    return g <= 1;
  }
  
  public String k()
  {
    return "minecraft:hopper";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xw(☃, this, ☃);
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
  }
}
