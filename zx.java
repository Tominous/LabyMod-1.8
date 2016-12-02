import com.google.common.collect.HashMultimap;
import com.google.common.collect.Lists;
import com.google.common.collect.Multimap;
import java.text.DecimalFormat;
import java.util.List;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public final class zx
{
  public static final DecimalFormat a = new DecimalFormat("#.###");
  public int b;
  public int c;
  private zw d;
  private dn e;
  private int f;
  private uo g;
  
  public zx(afh ☃)
  {
    this(☃, 1);
  }
  
  public zx(afh ☃, int ☃)
  {
    this(☃, ☃, 0);
  }
  
  public zx(afh ☃, int ☃, int ☃)
  {
    this(zw.a(☃), ☃, ☃);
  }
  
  public zx(zw ☃)
  {
    this(☃, 1);
  }
  
  public zx(zw ☃, int ☃)
  {
    this(☃, ☃, 0);
  }
  
  public zx(zw ☃, int ☃, int ☃)
  {
    d = ☃;
    b = ☃;
    f = ☃;
    if (f < 0) {
      f = 0;
    }
  }
  
  public static zx a(dn ☃)
  {
    zx ☃ = new zx();
    ☃.c(☃);
    return ☃.b() != null ? ☃ : null;
  }
  
  private zx() {}
  
  public zx a(int ☃)
  {
    zx ☃ = new zx(d, ☃, f);
    if (e != null) {
      e = ((dn)e.b());
    }
    b -= ☃;
    return ☃;
  }
  
  public zw b()
  {
    return d;
  }
  
  public boolean a(wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    boolean ☃ = b().a(this, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(d)]);
    }
    return ☃;
  }
  
  public float a(afh ☃)
  {
    return b().a(this, ☃);
  }
  
  public zx a(adm ☃, wn ☃)
  {
    return b().a(this, ☃, ☃);
  }
  
  public zx b(adm ☃, wn ☃)
  {
    return b().b(this, ☃, ☃);
  }
  
  public dn b(dn ☃)
  {
    jy ☃ = (jy)zw.e.c(d);
    ☃.a("id", ☃ == null ? "minecraft:air" : ☃.toString());
    ☃.a("Count", (byte)b);
    ☃.a("Damage", (short)f);
    if (e != null) {
      ☃.a("tag", e);
    }
    return ☃;
  }
  
  public void c(dn ☃)
  {
    if (☃.b("id", 8)) {
      d = zw.d(☃.j("id"));
    } else {
      d = zw.b(☃.e("id"));
    }
    b = ☃.d("Count");
    f = ☃.e("Damage");
    if (f < 0) {
      f = 0;
    }
    if (☃.b("tag", 10))
    {
      e = ☃.m("tag");
      if (d != null) {
        d.a(e);
      }
    }
  }
  
  public int c()
  {
    return b().j();
  }
  
  public boolean d()
  {
    return (c() > 1) && ((!e()) || (!g()));
  }
  
  public boolean e()
  {
    if (d == null) {
      return false;
    }
    if (d.l() <= 0) {
      return false;
    }
    if ((n()) && (o().n("Unbreakable"))) {
      return false;
    }
    return true;
  }
  
  public boolean f()
  {
    return d.k();
  }
  
  public boolean g()
  {
    return (e()) && (f > 0);
  }
  
  public int h()
  {
    return f;
  }
  
  public int i()
  {
    return f;
  }
  
  public void b(int ☃)
  {
    f = ☃;
    if (f < 0) {
      f = 0;
    }
  }
  
  public int j()
  {
    return d.l();
  }
  
  public boolean a(int ☃, Random ☃)
  {
    if (!e()) {
      return false;
    }
    if (☃ > 0)
    {
      int ☃ = ack.a(tB, this);
      
      int ☃ = 0;
      for (int ☃ = 0; (☃ > 0) && (☃ < ☃); ☃++) {
        if (acg.a(this, ☃, ☃)) {
          ☃++;
        }
      }
      ☃ -= ☃;
      if (☃ <= 0) {
        return false;
      }
    }
    f += ☃;
    
    return f > j();
  }
  
  public void a(int ☃, pr ☃)
  {
    if (((☃ instanceof wn)) && (bA.d)) {
      return;
    }
    if (!e()) {
      return;
    }
    if (a(☃, ☃.bc()))
    {
      ☃.b(this);
      
      b -= 1;
      if ((☃ instanceof wn))
      {
        wn ☃ = (wn)☃;
        ☃.b(na.ae[zw.b(d)]);
        if ((b == 0) && ((b() instanceof yt))) {
          ☃.ca();
        }
      }
      if (b < 0) {
        b = 0;
      }
      f = 0;
    }
  }
  
  public void a(pr ☃, wn ☃)
  {
    boolean ☃ = d.a(this, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(d)]);
    }
  }
  
  public void a(adm ☃, afh ☃, cj ☃, wn ☃)
  {
    boolean ☃ = d.a(this, ☃, ☃, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(d)]);
    }
  }
  
  public boolean b(afh ☃)
  {
    return d.b(☃);
  }
  
  public boolean a(wn ☃, pr ☃)
  {
    return d.a(this, ☃, ☃);
  }
  
  public zx k()
  {
    zx ☃ = new zx(d, b, f);
    if (e != null) {
      e = ((dn)e.b());
    }
    return ☃;
  }
  
  public static boolean a(zx ☃, zx ☃)
  {
    if ((☃ == null) && (☃ == null)) {
      return true;
    }
    if ((☃ == null) || (☃ == null)) {
      return false;
    }
    if ((e == null) && (e != null)) {
      return false;
    }
    if ((e != null) && (!e.equals(e))) {
      return false;
    }
    return true;
  }
  
  public static boolean b(zx ☃, zx ☃)
  {
    if ((☃ == null) && (☃ == null)) {
      return true;
    }
    if ((☃ == null) || (☃ == null)) {
      return false;
    }
    return ☃.d(☃);
  }
  
  private boolean d(zx ☃)
  {
    if (b != b) {
      return false;
    }
    if (d != d) {
      return false;
    }
    if (f != f) {
      return false;
    }
    if ((e == null) && (e != null)) {
      return false;
    }
    if ((e != null) && (!e.equals(e))) {
      return false;
    }
    return true;
  }
  
  public static boolean c(zx ☃, zx ☃)
  {
    if ((☃ == null) && (☃ == null)) {
      return true;
    }
    if ((☃ != null) && (☃ != null)) {
      return ☃.a(☃);
    }
    return false;
  }
  
  public boolean a(zx ☃)
  {
    return (☃ != null) && (d == d) && (f == f);
  }
  
  public String a()
  {
    return d.e_(this);
  }
  
  public static zx b(zx ☃)
  {
    return ☃ == null ? null : ☃.k();
  }
  
  public String toString()
  {
    return b + "x" + d.a() + "@" + f;
  }
  
  public void a(adm ☃, pk ☃, int ☃, boolean ☃)
  {
    if (c > 0) {
      c -= 1;
    }
    d.a(this, ☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, wn ☃, int ☃)
  {
    ☃.a(na.ac[zw.b(d)], ☃);
    d.d(this, ☃, ☃);
  }
  
  public boolean c(zx ☃)
  {
    return d(☃);
  }
  
  public int l()
  {
    return b().d(this);
  }
  
  public aba m()
  {
    return b().e(this);
  }
  
  public void b(adm ☃, wn ☃, int ☃)
  {
    b().a(this, ☃, ☃, ☃);
  }
  
  public boolean n()
  {
    return e != null;
  }
  
  public dn o()
  {
    return e;
  }
  
  public dn a(String ☃, boolean ☃)
  {
    if ((e == null) || (!e.b(☃, 10)))
    {
      if (☃)
      {
        dn ☃ = new dn();
        a(☃, ☃);
        return ☃;
      }
      return null;
    }
    return e.m(☃);
  }
  
  public du p()
  {
    if (e == null) {
      return null;
    }
    return e.c("ench", 10);
  }
  
  public void d(dn ☃)
  {
    e = ☃;
  }
  
  public String q()
  {
    String ☃ = b().a(this);
    if ((e != null) && (e.b("display", 10)))
    {
      dn ☃ = e.m("display");
      if (☃.b("Name", 8)) {
        ☃ = ☃.j("Name");
      }
    }
    return ☃;
  }
  
  public zx c(String ☃)
  {
    if (e == null) {
      e = new dn();
    }
    if (!e.b("display", 10)) {
      e.a("display", new dn());
    }
    e.m("display").a("Name", ☃);
    return this;
  }
  
  public void r()
  {
    if (e == null) {
      return;
    }
    if (!e.b("display", 10)) {
      return;
    }
    dn ☃ = e.m("display");
    ☃.o("Name");
    if (☃.c_())
    {
      e.o("display");
      if (e.c_()) {
        d(null);
      }
    }
  }
  
  public boolean s()
  {
    if (e == null) {
      return false;
    }
    if (!e.b("display", 10)) {
      return false;
    }
    return e.m("display").b("Name", 8);
  }
  
  public List<String> a(wn ☃, boolean ☃)
  {
    List<String> ☃ = Lists.newArrayList();
    
    String ☃ = q();
    if (s()) {
      ☃ = a.u + ☃;
    }
    ☃ = ☃ + a.v;
    if (☃)
    {
      String ☃ = "";
      if (☃.length() > 0)
      {
        ☃ = ☃ + " (";
        ☃ = ")";
      }
      int ☃ = zw.b(d);
      if (f()) {
        ☃ = ☃ + String.format("#%04d/%d%s", new Object[] { Integer.valueOf(☃), Integer.valueOf(f), ☃ });
      } else {
        ☃ = ☃ + String.format("#%04d%s", new Object[] { Integer.valueOf(☃), ☃ });
      }
    }
    else if ((!s()) && 
      (d == zy.bd))
    {
      ☃ = ☃ + " #" + f;
    }
    ☃.add(☃);
    
    int ☃ = 0;
    if ((n()) && 
      (e.b("HideFlags", 99))) {
      ☃ = e.f("HideFlags");
    }
    if ((☃ & 0x20) == 0) {
      d.a(this, ☃, ☃, ☃);
    }
    if (n())
    {
      if ((☃ & 0x1) == 0)
      {
        du ☃ = p();
        if (☃ != null) {
          for (int ☃ = 0; ☃ < ☃.c(); ☃++)
          {
            int ☃ = ☃.b(☃).e("id");
            int ☃ = ☃.b(☃).e("lvl");
            if (aci.c(☃) != null) {
              ☃.add(aci.c(☃).d(☃));
            }
          }
        }
      }
      if (e.b("display", 10))
      {
        dn ☃ = e.m("display");
        if (☃.b("color", 3)) {
          if (☃) {
            ☃.add("Color: #" + Integer.toHexString(☃.f("color")).toUpperCase());
          } else {
            ☃.add(a.u + di.a("item.dyed"));
          }
        }
        if (☃.b("Lore") == 9)
        {
          du ☃ = ☃.c("Lore", 8);
          if (☃.c() > 0) {
            for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
              ☃.add(a.f + "" + a.u + ☃.f(☃));
            }
          }
        }
      }
    }
    Multimap<String, qd> ☃ = B();
    if ((!☃.isEmpty()) && ((☃ & 0x2) == 0))
    {
      ☃.add("");
      for (Map.Entry<String, qd> ☃ : ☃.entries())
      {
        qd ☃ = (qd)☃.getValue();
        double ☃ = ☃.d();
        if (☃.a() == zw.f) {
          ☃ += ack.a(this, pw.a);
        }
        double ☃;
        double ☃;
        if ((☃.c() == 1) || (☃.c() == 2)) {
          ☃ = ☃ * 100.0D;
        } else {
          ☃ = ☃;
        }
        if (☃ > 0.0D)
        {
          ☃.add(a.j + di.a(new StringBuilder().append("attribute.modifier.plus.").append(☃.c()).toString(), new Object[] { a.format(☃), di.a("attribute.name." + (String)☃.getKey()) }));
        }
        else if (☃ < 0.0D)
        {
          ☃ *= -1.0D;
          ☃.add(a.m + di.a(new StringBuilder().append("attribute.modifier.take.").append(☃.c()).toString(), new Object[] { a.format(☃), di.a("attribute.name." + (String)☃.getKey()) }));
        }
      }
    }
    if ((n()) && (o().n("Unbreakable")) && ((☃ & 0x4) == 0)) {
      ☃.add(a.j + di.a("item.unbreakable"));
    }
    if ((n()) && (e.b("CanDestroy", 9)) && ((☃ & 0x8) == 0))
    {
      du ☃ = e.c("CanDestroy", 8);
      if (☃.c() > 0)
      {
        ☃.add("");
        ☃.add(a.h + di.a("item.canBreak"));
        for (int ☃ = 0; ☃ < ☃.c(); ☃++)
        {
          afh ☃ = afh.b(☃.f(☃));
          if (☃ != null) {
            ☃.add(a.i + ☃.f());
          } else {
            ☃.add(a.i + "missingno");
          }
        }
      }
    }
    if ((n()) && (e.b("CanPlaceOn", 9)) && ((☃ & 0x10) == 0))
    {
      du ☃ = e.c("CanPlaceOn", 8);
      if (☃.c() > 0)
      {
        ☃.add("");
        ☃.add(a.h + di.a("item.canPlace"));
        for (int ☃ = 0; ☃ < ☃.c(); ☃++)
        {
          afh ☃ = afh.b(☃.f(☃));
          if (☃ != null) {
            ☃.add(a.i + ☃.f());
          } else {
            ☃.add(a.i + "missingno");
          }
        }
      }
    }
    if (☃)
    {
      if (g()) {
        ☃.add("Durability: " + (j() - h()) + " / " + j());
      }
      ☃.add(a.i + ((jy)zw.e.c(d)).toString());
      if (n()) {
        ☃.add(a.i + "NBT: " + o().c().size() + " tag(s)");
      }
    }
    return ☃;
  }
  
  public boolean t()
  {
    return b().f(this);
  }
  
  public aaj u()
  {
    return b().g(this);
  }
  
  public boolean v()
  {
    if (!b().f_(this)) {
      return false;
    }
    if (w()) {
      return false;
    }
    return true;
  }
  
  public void a(aci ☃, int ☃)
  {
    if (e == null) {
      d(new dn());
    }
    if (!e.b("ench", 9)) {
      e.a("ench", new du());
    }
    du ☃ = e.c("ench", 10);
    dn ☃ = new dn();
    ☃.a("id", (short)B);
    ☃.a("lvl", (short)(byte)☃);
    ☃.a(☃);
  }
  
  public boolean w()
  {
    if ((e != null) && (e.b("ench", 9))) {
      return true;
    }
    return false;
  }
  
  public void a(String ☃, eb ☃)
  {
    if (e == null) {
      d(new dn());
    }
    e.a(☃, ☃);
  }
  
  public boolean x()
  {
    return b().s();
  }
  
  public boolean y()
  {
    return g != null;
  }
  
  public void a(uo ☃)
  {
    g = ☃;
  }
  
  public uo z()
  {
    return g;
  }
  
  public int A()
  {
    if ((n()) && (e.b("RepairCost", 3))) {
      return e.f("RepairCost");
    }
    return 0;
  }
  
  public void c(int ☃)
  {
    if (!n()) {
      e = new dn();
    }
    e.a("RepairCost", ☃);
  }
  
  public Multimap<String, qd> B()
  {
    Multimap<String, qd> ☃;
    if ((n()) && (e.b("AttributeModifiers", 9)))
    {
      Multimap<String, qd> ☃ = HashMultimap.create();
      du ☃ = e.c("AttributeModifiers", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        qd ☃ = vy.a(☃);
        if (☃ != null) {
          if ((☃.a().getLeastSignificantBits() != 0L) && (☃.a().getMostSignificantBits() != 0L)) {
            ☃.put(☃.j("AttributeName"), ☃);
          }
        }
      }
    }
    else
    {
      ☃ = b().i();
    }
    return ☃;
  }
  
  public void a(zw ☃)
  {
    d = ☃;
  }
  
  public eu C()
  {
    fa ☃ = new fa(q());
    if (s()) {
      ☃.b().b(Boolean.valueOf(true));
    }
    eu ☃ = new fa("[").a(☃).a("]");
    if (d != null)
    {
      dn ☃ = new dn();
      b(☃);
      
      ☃.b().a(new ew(ew.a.c, new fa(☃.toString())));
      ☃.b().a(ue);
    }
    return ☃;
  }
  
  private afh h = null;
  private boolean i = false;
  
  public boolean c(afh ☃)
  {
    if (☃ == h) {
      return i;
    }
    h = ☃;
    if ((n()) && (e.b("CanDestroy", 9)))
    {
      du ☃ = e.c("CanDestroy", 8);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        afh ☃ = afh.b(☃.f(☃));
        if (☃ == ☃)
        {
          i = true;
          return true;
        }
      }
    }
    i = false;
    return false;
  }
  
  private afh j = null;
  private boolean k = false;
  
  public boolean d(afh ☃)
  {
    if (☃ == j) {
      return k;
    }
    j = ☃;
    if ((n()) && (e.b("CanPlaceOn", 9)))
    {
      du ☃ = e.c("CanPlaceOn", 8);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        afh ☃ = afh.b(☃.f(☃));
        if (☃ == ☃)
        {
          k = true;
          return true;
        }
      }
    }
    k = false;
    return false;
  }
}
