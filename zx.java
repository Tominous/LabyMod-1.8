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
    this.d = ☃;
    this.b = ☃;
    this.f = ☃;
    if (this.f < 0) {
      this.f = 0;
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
    zx ☃ = new zx(this.d, ☃, this.f);
    if (this.e != null) {
      ☃.e = ((dn)this.e.b());
    }
    this.b -= ☃;
    return ☃;
  }
  
  public zw b()
  {
    return this.d;
  }
  
  public boolean a(wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    boolean ☃ = b().a(this, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(this.d)]);
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
    jy ☃ = (jy)zw.e.c(this.d);
    ☃.a("id", ☃ == null ? "minecraft:air" : ☃.toString());
    ☃.a("Count", (byte)this.b);
    ☃.a("Damage", (short)this.f);
    if (this.e != null) {
      ☃.a("tag", this.e);
    }
    return ☃;
  }
  
  public void c(dn ☃)
  {
    if (☃.b("id", 8)) {
      this.d = zw.d(☃.j("id"));
    } else {
      this.d = zw.b(☃.e("id"));
    }
    this.b = ☃.d("Count");
    this.f = ☃.e("Damage");
    if (this.f < 0) {
      this.f = 0;
    }
    if (☃.b("tag", 10))
    {
      this.e = ☃.m("tag");
      if (this.d != null) {
        this.d.a(this.e);
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
    if (this.d == null) {
      return false;
    }
    if (this.d.l() <= 0) {
      return false;
    }
    if ((n()) && (o().n("Unbreakable"))) {
      return false;
    }
    return true;
  }
  
  public boolean f()
  {
    return this.d.k();
  }
  
  public boolean g()
  {
    return (e()) && (this.f > 0);
  }
  
  public int h()
  {
    return this.f;
  }
  
  public int i()
  {
    return this.f;
  }
  
  public void b(int ☃)
  {
    this.f = ☃;
    if (this.f < 0) {
      this.f = 0;
    }
  }
  
  public int j()
  {
    return this.d.l();
  }
  
  public boolean a(int ☃, Random ☃)
  {
    if (!e()) {
      return false;
    }
    if (☃ > 0)
    {
      int ☃ = ack.a(aci.t.B, this);
      
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
    this.f += ☃;
    
    return this.f > j();
  }
  
  public void a(int ☃, pr ☃)
  {
    if (((☃ instanceof wn)) && (((wn)☃).bA.d)) {
      return;
    }
    if (!e()) {
      return;
    }
    if (a(☃, ☃.bc()))
    {
      ☃.b(this);
      
      this.b -= 1;
      if ((☃ instanceof wn))
      {
        wn ☃ = (wn)☃;
        ☃.b(na.ae[zw.b(this.d)]);
        if ((this.b == 0) && ((b() instanceof yt))) {
          ☃.ca();
        }
      }
      if (this.b < 0) {
        this.b = 0;
      }
      this.f = 0;
    }
  }
  
  public void a(pr ☃, wn ☃)
  {
    boolean ☃ = this.d.a(this, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(this.d)]);
    }
  }
  
  public void a(adm ☃, afh ☃, cj ☃, wn ☃)
  {
    boolean ☃ = this.d.a(this, ☃, ☃, ☃, ☃);
    if (☃) {
      ☃.b(na.ad[zw.b(this.d)]);
    }
  }
  
  public boolean b(afh ☃)
  {
    return this.d.b(☃);
  }
  
  public boolean a(wn ☃, pr ☃)
  {
    return this.d.a(this, ☃, ☃);
  }
  
  public zx k()
  {
    zx ☃ = new zx(this.d, this.b, this.f);
    if (this.e != null) {
      ☃.e = ((dn)this.e.b());
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
    if ((☃.e == null) && (☃.e != null)) {
      return false;
    }
    if ((☃.e != null) && (!☃.e.equals(☃.e))) {
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
    if (this.b != ☃.b) {
      return false;
    }
    if (this.d != ☃.d) {
      return false;
    }
    if (this.f != ☃.f) {
      return false;
    }
    if ((this.e == null) && (☃.e != null)) {
      return false;
    }
    if ((this.e != null) && (!this.e.equals(☃.e))) {
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
    return (☃ != null) && (this.d == ☃.d) && (this.f == ☃.f);
  }
  
  public String a()
  {
    return this.d.e_(this);
  }
  
  public static zx b(zx ☃)
  {
    return ☃ == null ? null : ☃.k();
  }
  
  public String toString()
  {
    return this.b + "x" + this.d.a() + "@" + this.f;
  }
  
  public void a(adm ☃, pk ☃, int ☃, boolean ☃)
  {
    if (this.c > 0) {
      this.c -= 1;
    }
    this.d.a(this, ☃, ☃, ☃, ☃);
  }
  
  public void a(adm ☃, wn ☃, int ☃)
  {
    ☃.a(na.ac[zw.b(this.d)], ☃);
    this.d.d(this, ☃, ☃);
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
    return this.e != null;
  }
  
  public dn o()
  {
    return this.e;
  }
  
  public dn a(String ☃, boolean ☃)
  {
    if ((this.e == null) || (!this.e.b(☃, 10)))
    {
      if (☃)
      {
        dn ☃ = new dn();
        a(☃, ☃);
        return ☃;
      }
      return null;
    }
    return this.e.m(☃);
  }
  
  public du p()
  {
    if (this.e == null) {
      return null;
    }
    return this.e.c("ench", 10);
  }
  
  public void d(dn ☃)
  {
    this.e = ☃;
  }
  
  public String q()
  {
    String ☃ = b().a(this);
    if ((this.e != null) && (this.e.b("display", 10)))
    {
      dn ☃ = this.e.m("display");
      if (☃.b("Name", 8)) {
        ☃ = ☃.j("Name");
      }
    }
    return ☃;
  }
  
  public zx c(String ☃)
  {
    if (this.e == null) {
      this.e = new dn();
    }
    if (!this.e.b("display", 10)) {
      this.e.a("display", new dn());
    }
    this.e.m("display").a("Name", ☃);
    return this;
  }
  
  public void r()
  {
    if (this.e == null) {
      return;
    }
    if (!this.e.b("display", 10)) {
      return;
    }
    dn ☃ = this.e.m("display");
    ☃.o("Name");
    if (☃.c_())
    {
      this.e.o("display");
      if (this.e.c_()) {
        d(null);
      }
    }
  }
  
  public boolean s()
  {
    if (this.e == null) {
      return false;
    }
    if (!this.e.b("display", 10)) {
      return false;
    }
    return this.e.m("display").b("Name", 8);
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
      int ☃ = zw.b(this.d);
      if (f()) {
        ☃ = ☃ + String.format("#%04d/%d%s", new Object[] { Integer.valueOf(☃), Integer.valueOf(this.f), ☃ });
      } else {
        ☃ = ☃ + String.format("#%04d%s", new Object[] { Integer.valueOf(☃), ☃ });
      }
    }
    else if ((!s()) && 
      (this.d == zy.bd))
    {
      ☃ = ☃ + " #" + this.f;
    }
    ☃.add(☃);
    
    int ☃ = 0;
    if ((n()) && 
      (this.e.b("HideFlags", 99))) {
      ☃ = this.e.f("HideFlags");
    }
    if ((☃ & 0x20) == 0) {
      this.d.a(this, ☃, ☃, ☃);
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
      if (this.e.b("display", 10))
      {
        dn ☃ = this.e.m("display");
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
    if ((n()) && (this.e.b("CanDestroy", 9)) && ((☃ & 0x8) == 0))
    {
      du ☃ = this.e.c("CanDestroy", 8);
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
    if ((n()) && (this.e.b("CanPlaceOn", 9)) && ((☃ & 0x10) == 0))
    {
      du ☃ = this.e.c("CanPlaceOn", 8);
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
      ☃.add(a.i + ((jy)zw.e.c(this.d)).toString());
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
    if (this.e == null) {
      d(new dn());
    }
    if (!this.e.b("ench", 9)) {
      this.e.a("ench", new du());
    }
    du ☃ = this.e.c("ench", 10);
    dn ☃ = new dn();
    ☃.a("id", (short)☃.B);
    ☃.a("lvl", (short)(byte)☃);
    ☃.a(☃);
  }
  
  public boolean w()
  {
    if ((this.e != null) && (this.e.b("ench", 9))) {
      return true;
    }
    return false;
  }
  
  public void a(String ☃, eb ☃)
  {
    if (this.e == null) {
      d(new dn());
    }
    this.e.a(☃, ☃);
  }
  
  public boolean x()
  {
    return b().s();
  }
  
  public boolean y()
  {
    return this.g != null;
  }
  
  public void a(uo ☃)
  {
    this.g = ☃;
  }
  
  public uo z()
  {
    return this.g;
  }
  
  public int A()
  {
    if ((n()) && (this.e.b("RepairCost", 3))) {
      return this.e.f("RepairCost");
    }
    return 0;
  }
  
  public void c(int ☃)
  {
    if (!n()) {
      this.e = new dn();
    }
    this.e.a("RepairCost", ☃);
  }
  
  public Multimap<String, qd> B()
  {
    Multimap<String, qd> ☃;
    if ((n()) && (this.e.b("AttributeModifiers", 9)))
    {
      Multimap<String, qd> ☃ = HashMultimap.create();
      du ☃ = this.e.c("AttributeModifiers", 10);
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
    this.d = ☃;
  }
  
  public eu C()
  {
    fa ☃ = new fa(q());
    if (s()) {
      ☃.b().b(Boolean.valueOf(true));
    }
    eu ☃ = new fa("[").a(☃).a("]");
    if (this.d != null)
    {
      dn ☃ = new dn();
      b(☃);
      
      ☃.b().a(new ew(ew.a.c, new fa(☃.toString())));
      ☃.b().a(u().e);
    }
    return ☃;
  }
  
  private afh h = null;
  private boolean i = false;
  
  public boolean c(afh ☃)
  {
    if (☃ == this.h) {
      return this.i;
    }
    this.h = ☃;
    if ((n()) && (this.e.b("CanDestroy", 9)))
    {
      du ☃ = this.e.c("CanDestroy", 8);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        afh ☃ = afh.b(☃.f(☃));
        if (☃ == ☃)
        {
          this.i = true;
          return true;
        }
      }
    }
    this.i = false;
    return false;
  }
  
  private afh j = null;
  private boolean k = false;
  
  public boolean d(afh ☃)
  {
    if (☃ == this.j) {
      return this.k;
    }
    this.j = ☃;
    if ((n()) && (this.e.b("CanPlaceOn", 9)))
    {
      du ☃ = this.e.c("CanPlaceOn", 8);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        afh ☃ = afh.b(☃.f(☃));
        if (☃ == ☃)
        {
          this.k = true;
          return true;
        }
      }
    }
    this.k = false;
    return false;
  }
}
