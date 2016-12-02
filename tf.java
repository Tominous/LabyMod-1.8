import com.google.common.collect.Lists;
import com.mojang.authlib.GameProfile;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.TreeMap;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;

public class tf
{
  private adm a;
  private final List<te> b = Lists.newArrayList();
  private cj c = cj.a;
  private cj d = cj.a;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private TreeMap<String, Integer> j = new TreeMap();
  public tf() {}
  
  class a
  {
    public pr a;
    public int b;
    
    a(pr ☃, int ☃)
    {
      a = ☃;
      b = ☃;
    }
  }
  
  private List<tf.a> k = Lists.newArrayList();
  private int l;
  
  public tf(adm ☃)
  {
    a = ☃;
  }
  
  public void a(adm ☃)
  {
    a = ☃;
  }
  
  public void a(int ☃)
  {
    g = ☃;
    m();
    l();
    if (☃ % 20 == 0) {
      k();
    }
    if (☃ % 30 == 0) {
      j();
    }
    int ☃ = h / 10;
    if ((l < ☃) && (b.size() > 20) && (a.s.nextInt(7000) == 0))
    {
      aui ☃ = a(d, 2, 4, 2);
      if (☃ != null)
      {
        ty ☃ = new ty(a);
        ☃.b(a, b, c);
        a.d(☃);
        l += 1;
      }
    }
  }
  
  private aui a(cj ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(a.s.nextInt(16) - 8, a.s.nextInt(6) - 3, a.s.nextInt(16) - 8);
      if (a(☃)) {
        if (a(new cj(☃, ☃, ☃), ☃)) {
          return new aui(☃.n(), ☃.o(), ☃.p());
        }
      }
    }
    return null;
  }
  
  private boolean a(cj ☃, cj ☃)
  {
    if (!adm.a(a, ☃.b())) {
      return false;
    }
    int ☃ = ☃.n() - ☃.n() / 2;
    int ☃ = ☃.p() - ☃.p() / 2;
    for (int ☃ = ☃; ☃ < ☃ + ☃.n(); ☃++) {
      for (int ☃ = ☃.o(); ☃ < ☃.o() + ☃.o(); ☃++) {
        for (int ☃ = ☃; ☃ < ☃ + ☃.p(); ☃++) {
          if (a.p(new cj(☃, ☃, ☃)).c().v()) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private void j()
  {
    List<ty> ☃ = a.a(ty.class, new aug(d.n() - e, d.o() - 4, d.p() - e, d.n() + e, d.o() + 4, d.p() + e));
    l = ☃.size();
  }
  
  private void k()
  {
    List<wi> ☃ = a.a(wi.class, new aug(d.n() - e, d.o() - 4, d.p() - e, d.n() + e, d.o() + 4, d.p() + e));
    h = ☃.size();
    if (h == 0) {
      j.clear();
    }
  }
  
  public cj a()
  {
    return d;
  }
  
  public int b()
  {
    return e;
  }
  
  public int c()
  {
    return b.size();
  }
  
  public int d()
  {
    return g - f;
  }
  
  public int e()
  {
    return h;
  }
  
  public boolean a(cj ☃)
  {
    return d.i(☃) < e * e;
  }
  
  public List<te> f()
  {
    return b;
  }
  
  public te b(cj ☃)
  {
    te ☃ = null;
    int ☃ = Integer.MAX_VALUE;
    for (te ☃ : b)
    {
      int ☃ = ☃.a(☃);
      if (☃ < ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public te c(cj ☃)
  {
    te ☃ = null;
    int ☃ = Integer.MAX_VALUE;
    for (te ☃ : b)
    {
      int ☃ = ☃.a(☃);
      if (☃ > 256) {
        ☃ *= 1000;
      } else {
        ☃ = ☃.c();
      }
      if (☃ < ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return ☃;
  }
  
  public te e(cj ☃)
  {
    if (d.i(☃) > e * e) {
      return null;
    }
    for (te ☃ : b) {
      if ((☃.d().n() == ☃.n()) && (☃.d().p() == ☃.p()) && (Math.abs(☃.d().o() - ☃.o()) <= 1)) {
        return ☃;
      }
    }
    return null;
  }
  
  public void a(te ☃)
  {
    b.add(☃);
    c = c.a(☃.d());
    n();
    f = ☃.h();
  }
  
  public boolean g()
  {
    return b.isEmpty();
  }
  
  public void a(pr ☃)
  {
    for (tf.a ☃ : k) {
      if (a == ☃)
      {
        b = g;
        return;
      }
    }
    k.add(new tf.a(☃, g));
  }
  
  public pr b(pr ☃)
  {
    double ☃ = Double.MAX_VALUE;
    tf.a ☃ = null;
    for (int ☃ = 0; ☃ < k.size(); ☃++)
    {
      tf.a ☃ = (tf.a)k.get(☃);
      double ☃ = a.h(☃);
      if (☃ <= ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return ☃ != null ? a : null;
  }
  
  public wn c(pr ☃)
  {
    double ☃ = Double.MAX_VALUE;
    wn ☃ = null;
    for (String ☃ : j.keySet()) {
      if (d(☃))
      {
        wn ☃ = a.a(☃);
        if (☃ != null)
        {
          double ☃ = ☃.h(☃);
          if (☃ <= ☃)
          {
            ☃ = ☃;
            ☃ = ☃;
          }
        }
      }
    }
    return ☃;
  }
  
  private void l()
  {
    for (Iterator<tf.a> ☃ = k.iterator(); ☃.hasNext();)
    {
      tf.a ☃ = (tf.a)☃.next();
      if ((!a.ai()) || (Math.abs(g - b) > 300)) {
        ☃.remove();
      }
    }
  }
  
  private void m()
  {
    boolean ☃ = false;
    boolean ☃ = a.s.nextInt(50) == 0;
    for (Iterator<te> ☃ = b.iterator(); ☃.hasNext();)
    {
      te ☃ = (te)☃.next();
      if (☃) {
        ☃.a();
      }
      if ((!f(☃.d())) || (Math.abs(g - ☃.h()) > 1200))
      {
        c = c.b(☃.d());
        ☃ = true;
        ☃.a(true);
        ☃.remove();
      }
    }
    if (☃) {
      n();
    }
  }
  
  private boolean f(cj ☃)
  {
    afh ☃ = a.p(☃).c();
    if ((☃ instanceof agh)) {
      return ☃.t() == arm.d;
    }
    return false;
  }
  
  private void n()
  {
    int ☃ = b.size();
    if (☃ == 0)
    {
      d = new cj(0, 0, 0);
      e = 0;
      return;
    }
    d = new cj(c.n() / ☃, c.o() / ☃, c.p() / ☃);
    int ☃ = 0;
    for (te ☃ : b) {
      ☃ = Math.max(☃.a(d), ☃);
    }
    e = Math.max(32, (int)Math.sqrt(☃) + 1);
  }
  
  public int a(String ☃)
  {
    Integer ☃ = (Integer)j.get(☃);
    if (☃ != null) {
      return ☃.intValue();
    }
    return 0;
  }
  
  public int a(String ☃, int ☃)
  {
    int ☃ = a(☃);
    int ☃ = ns.a(☃ + ☃, -30, 10);
    j.put(☃, Integer.valueOf(☃));
    return ☃;
  }
  
  public boolean d(String ☃)
  {
    return a(☃) <= -15;
  }
  
  public void a(dn ☃)
  {
    h = ☃.f("PopSize");
    e = ☃.f("Radius");
    l = ☃.f("Golems");
    f = ☃.f("Stable");
    g = ☃.f("Tick");
    i = ☃.f("MTick");
    d = new cj(☃.f("CX"), ☃.f("CY"), ☃.f("CZ"));
    c = new cj(☃.f("ACX"), ☃.f("ACY"), ☃.f("ACZ"));
    
    du ☃ = ☃.c("Doors", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      te ☃ = new te(new cj(☃.f("X"), ☃.f("Y"), ☃.f("Z")), ☃.f("IDX"), ☃.f("IDZ"), ☃.f("TS"));
      b.add(☃);
    }
    du ☃ = ☃.c("Players", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      if (☃.c("UUID"))
      {
        lt ☃ = MinecraftServer.N().aF();
        GameProfile ☃ = ☃.a(UUID.fromString(☃.j("UUID")));
        if (☃ != null) {
          j.put(☃.getName(), Integer.valueOf(☃.f("S")));
        }
      }
      else
      {
        j.put(☃.j("Name"), Integer.valueOf(☃.f("S")));
      }
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("PopSize", h);
    ☃.a("Radius", e);
    ☃.a("Golems", l);
    ☃.a("Stable", f);
    ☃.a("Tick", g);
    ☃.a("MTick", i);
    ☃.a("CX", d.n());
    ☃.a("CY", d.o());
    ☃.a("CZ", d.p());
    ☃.a("ACX", c.n());
    ☃.a("ACY", c.o());
    ☃.a("ACZ", c.p());
    
    du ☃ = new du();
    for (te ☃ : b)
    {
      dn ☃ = new dn();
      ☃.a("X", ☃.d().n());
      ☃.a("Y", ☃.d().o());
      ☃.a("Z", ☃.d().p());
      ☃.a("IDX", ☃.f());
      ☃.a("IDZ", ☃.g());
      ☃.a("TS", ☃.h());
      ☃.a(☃);
    }
    ☃.a("Doors", ☃);
    
    du ☃ = new du();
    for (String ☃ : j.keySet())
    {
      dn ☃ = new dn();
      
      lt ☃ = MinecraftServer.N().aF();
      GameProfile ☃ = ☃.a(☃);
      if (☃ != null)
      {
        ☃.a("UUID", ☃.getId().toString());
        ☃.a("S", ((Integer)j.get(☃)).intValue());
        ☃.a(☃);
      }
    }
    ☃.a("Players", ☃);
  }
  
  public void h()
  {
    i = g;
  }
  
  public boolean i()
  {
    return (i == 0) || (g - i >= 3600);
  }
  
  public void b(int ☃)
  {
    for (String ☃ : j.keySet()) {
      a(☃, ☃);
    }
  }
}
