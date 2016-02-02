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
      this.a = ☃;
      this.b = ☃;
    }
  }
  
  private List<tf.a> k = Lists.newArrayList();
  private int l;
  
  public tf(adm ☃)
  {
    this.a = ☃;
  }
  
  public void a(adm ☃)
  {
    this.a = ☃;
  }
  
  public void a(int ☃)
  {
    this.g = ☃;
    m();
    l();
    if (☃ % 20 == 0) {
      k();
    }
    if (☃ % 30 == 0) {
      j();
    }
    int ☃ = this.h / 10;
    if ((this.l < ☃) && (this.b.size() > 20) && (this.a.s.nextInt(7000) == 0))
    {
      aui ☃ = a(this.d, 2, 4, 2);
      if (☃ != null)
      {
        ty ☃ = new ty(this.a);
        ☃.b(☃.a, ☃.b, ☃.c);
        this.a.d(☃);
        this.l += 1;
      }
    }
  }
  
  private aui a(cj ☃, int ☃, int ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < 10; ☃++)
    {
      cj ☃ = ☃.a(this.a.s.nextInt(16) - 8, this.a.s.nextInt(6) - 3, this.a.s.nextInt(16) - 8);
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
    if (!adm.a(this.a, ☃.b())) {
      return false;
    }
    int ☃ = ☃.n() - ☃.n() / 2;
    int ☃ = ☃.p() - ☃.p() / 2;
    for (int ☃ = ☃; ☃ < ☃ + ☃.n(); ☃++) {
      for (int ☃ = ☃.o(); ☃ < ☃.o() + ☃.o(); ☃++) {
        for (int ☃ = ☃; ☃ < ☃ + ☃.p(); ☃++) {
          if (this.a.p(new cj(☃, ☃, ☃)).c().v()) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  private void j()
  {
    List<ty> ☃ = this.a.a(ty.class, new aug(this.d.n() - this.e, this.d.o() - 4, this.d.p() - this.e, this.d.n() + this.e, this.d.o() + 4, this.d.p() + this.e));
    this.l = ☃.size();
  }
  
  private void k()
  {
    List<wi> ☃ = this.a.a(wi.class, new aug(this.d.n() - this.e, this.d.o() - 4, this.d.p() - this.e, this.d.n() + this.e, this.d.o() + 4, this.d.p() + this.e));
    this.h = ☃.size();
    if (this.h == 0) {
      this.j.clear();
    }
  }
  
  public cj a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.e;
  }
  
  public int c()
  {
    return this.b.size();
  }
  
  public int d()
  {
    return this.g - this.f;
  }
  
  public int e()
  {
    return this.h;
  }
  
  public boolean a(cj ☃)
  {
    return this.d.i(☃) < this.e * this.e;
  }
  
  public List<te> f()
  {
    return this.b;
  }
  
  public te b(cj ☃)
  {
    te ☃ = null;
    int ☃ = Integer.MAX_VALUE;
    for (te ☃ : this.b)
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
    for (te ☃ : this.b)
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
    if (this.d.i(☃) > this.e * this.e) {
      return null;
    }
    for (te ☃ : this.b) {
      if ((☃.d().n() == ☃.n()) && (☃.d().p() == ☃.p()) && (Math.abs(☃.d().o() - ☃.o()) <= 1)) {
        return ☃;
      }
    }
    return null;
  }
  
  public void a(te ☃)
  {
    this.b.add(☃);
    this.c = this.c.a(☃.d());
    n();
    this.f = ☃.h();
  }
  
  public boolean g()
  {
    return this.b.isEmpty();
  }
  
  public void a(pr ☃)
  {
    for (tf.a ☃ : this.k) {
      if (☃.a == ☃)
      {
        ☃.b = this.g;
        return;
      }
    }
    this.k.add(new tf.a(☃, this.g));
  }
  
  public pr b(pr ☃)
  {
    double ☃ = Double.MAX_VALUE;
    tf.a ☃ = null;
    for (int ☃ = 0; ☃ < this.k.size(); ☃++)
    {
      tf.a ☃ = (tf.a)this.k.get(☃);
      double ☃ = ☃.a.h(☃);
      if (☃ <= ☃)
      {
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    return ☃ != null ? ☃.a : null;
  }
  
  public wn c(pr ☃)
  {
    double ☃ = Double.MAX_VALUE;
    wn ☃ = null;
    for (String ☃ : this.j.keySet()) {
      if (d(☃))
      {
        wn ☃ = this.a.a(☃);
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
    for (Iterator<tf.a> ☃ = this.k.iterator(); ☃.hasNext();)
    {
      tf.a ☃ = (tf.a)☃.next();
      if ((!☃.a.ai()) || (Math.abs(this.g - ☃.b) > 300)) {
        ☃.remove();
      }
    }
  }
  
  private void m()
  {
    boolean ☃ = false;
    boolean ☃ = this.a.s.nextInt(50) == 0;
    for (Iterator<te> ☃ = this.b.iterator(); ☃.hasNext();)
    {
      te ☃ = (te)☃.next();
      if (☃) {
        ☃.a();
      }
      if ((!f(☃.d())) || (Math.abs(this.g - ☃.h()) > 1200))
      {
        this.c = this.c.b(☃.d());
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
    afh ☃ = this.a.p(☃).c();
    if ((☃ instanceof agh)) {
      return ☃.t() == arm.d;
    }
    return false;
  }
  
  private void n()
  {
    int ☃ = this.b.size();
    if (☃ == 0)
    {
      this.d = new cj(0, 0, 0);
      this.e = 0;
      return;
    }
    this.d = new cj(this.c.n() / ☃, this.c.o() / ☃, this.c.p() / ☃);
    int ☃ = 0;
    for (te ☃ : this.b) {
      ☃ = Math.max(☃.a(this.d), ☃);
    }
    this.e = Math.max(32, (int)Math.sqrt(☃) + 1);
  }
  
  public int a(String ☃)
  {
    Integer ☃ = (Integer)this.j.get(☃);
    if (☃ != null) {
      return ☃.intValue();
    }
    return 0;
  }
  
  public int a(String ☃, int ☃)
  {
    int ☃ = a(☃);
    int ☃ = ns.a(☃ + ☃, -30, 10);
    this.j.put(☃, Integer.valueOf(☃));
    return ☃;
  }
  
  public boolean d(String ☃)
  {
    return a(☃) <= -15;
  }
  
  public void a(dn ☃)
  {
    this.h = ☃.f("PopSize");
    this.e = ☃.f("Radius");
    this.l = ☃.f("Golems");
    this.f = ☃.f("Stable");
    this.g = ☃.f("Tick");
    this.i = ☃.f("MTick");
    this.d = new cj(☃.f("CX"), ☃.f("CY"), ☃.f("CZ"));
    this.c = new cj(☃.f("ACX"), ☃.f("ACY"), ☃.f("ACZ"));
    
    du ☃ = ☃.c("Doors", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      te ☃ = new te(new cj(☃.f("X"), ☃.f("Y"), ☃.f("Z")), ☃.f("IDX"), ☃.f("IDZ"), ☃.f("TS"));
      this.b.add(☃);
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
          this.j.put(☃.getName(), Integer.valueOf(☃.f("S")));
        }
      }
      else
      {
        this.j.put(☃.j("Name"), Integer.valueOf(☃.f("S")));
      }
    }
  }
  
  public void b(dn ☃)
  {
    ☃.a("PopSize", this.h);
    ☃.a("Radius", this.e);
    ☃.a("Golems", this.l);
    ☃.a("Stable", this.f);
    ☃.a("Tick", this.g);
    ☃.a("MTick", this.i);
    ☃.a("CX", this.d.n());
    ☃.a("CY", this.d.o());
    ☃.a("CZ", this.d.p());
    ☃.a("ACX", this.c.n());
    ☃.a("ACY", this.c.o());
    ☃.a("ACZ", this.c.p());
    
    du ☃ = new du();
    for (te ☃ : this.b)
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
    for (String ☃ : this.j.keySet())
    {
      dn ☃ = new dn();
      
      lt ☃ = MinecraftServer.N().aF();
      GameProfile ☃ = ☃.a(☃);
      if (☃ != null)
      {
        ☃.a("UUID", ☃.getId().toString());
        ☃.a("S", ((Integer)this.j.get(☃)).intValue());
        ☃.a(☃);
      }
    }
    ☃.a("Players", ☃);
  }
  
  public void h()
  {
    this.i = this.g;
  }
  
  public boolean i()
  {
    return (this.i == 0) || (this.g - this.i >= 3600);
  }
  
  public void b(int ☃)
  {
    for (String ☃ : this.j.keySet()) {
      a(☃, ☃);
    }
  }
}
