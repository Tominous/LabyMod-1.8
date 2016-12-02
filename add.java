import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public abstract class add
{
  private int a;
  private String b;
  private final List<add.a> c;
  private add.a d;
  private double e;
  private double f;
  private int g;
  private int h;
  private int i;
  private pk j;
  private int k;
  private int l;
  private int m;
  
  public add()
  {
    a = 20;
    b = "Pig";
    c = Lists.newArrayList();
    
    g = 200;
    h = 800;
    i = 4;
    
    k = 6;
    l = 16;
    m = 4;
  }
  
  private String f()
  {
    if (i() == null)
    {
      if ((b != null) && (b.equals("Minecart"))) {
        b = "MinecartRideable";
      }
      return b;
    }
    return add.a.a(i());
  }
  
  public void a(String ☃)
  {
    b = ☃;
  }
  
  private boolean g()
  {
    cj ☃ = b();
    return a().b(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, l);
  }
  
  public void c()
  {
    if (!g()) {
      return;
    }
    cj ☃ = b();
    if (aD)
    {
      double ☃ = ☃.n() + as.nextFloat();
      double ☃ = ☃.o() + as.nextFloat();
      double ☃ = ☃.p() + as.nextFloat();
      a().a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      a().a(cy.A, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      if (a > 0) {
        a -= 1;
      }
      f = e;
      e = ((e + 1000.0F / (a + 200.0F)) % 360.0D);
    }
    else
    {
      if (a == -1) {
        h();
      }
      if (a > 0)
      {
        a -= 1;
        return;
      }
      boolean ☃ = false;
      for (int ☃ = 0; ☃ < i; ☃++)
      {
        pk ☃ = pm.a(f(), a());
        if (☃ == null) {
          return;
        }
        int ☃ = a().a(☃.getClass(), new aug(☃.n(), ☃.o(), ☃.p(), ☃.n() + 1, ☃.o() + 1, ☃.p() + 1).b(m, m, m)).size();
        if (☃ >= k)
        {
          h();
          return;
        }
        double ☃ = ☃.n() + (as.nextDouble() - as.nextDouble()) * m + 0.5D;
        double ☃ = ☃.o() + as.nextInt(3) - 1;
        double ☃ = ☃.p() + (as.nextDouble() - as.nextDouble()) * m + 0.5D;
        ps ☃ = (☃ instanceof ps) ? (ps)☃ : null;
        
        ☃.b(☃, ☃, ☃, as.nextFloat() * 360.0F, 0.0F);
        if ((☃ == null) || ((☃.bR()) && (☃.bS())))
        {
          a(☃, true);
          a().b(2004, ☃, 0);
          if (☃ != null) {
            ☃.y();
          }
          ☃ = true;
        }
      }
      if (☃) {
        h();
      }
    }
  }
  
  private pk a(pk ☃, boolean ☃)
  {
    if (i() != null)
    {
      dn ☃ = new dn();
      ☃.d(☃);
      for (String ☃ : add.a.b(i()).c())
      {
        eb ☃ = add.a.b(i()).a(☃);
        ☃.a(☃, ☃.b());
      }
      ☃.f(☃);
      if ((o != null) && (☃)) {
        o.d(☃);
      }
      pk ☃ = ☃;
      while (☃.b("Riding", 10))
      {
        dn ☃ = ☃.m("Riding");
        pk ☃ = pm.a(☃.j("id"), o);
        if (☃ != null)
        {
          dn ☃ = new dn();
          ☃.d(☃);
          for (String ☃ : ☃.c())
          {
            eb ☃ = ☃.a(☃);
            ☃.a(☃, ☃.b());
          }
          ☃.f(☃);
          ☃.b(s, t, u, y, z);
          if ((o != null) && (☃)) {
            o.d(☃);
          }
          ☃.a(☃);
        }
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    else if (((☃ instanceof pr)) && (o != null) && (☃))
    {
      if ((☃ instanceof ps)) {
        ((ps)☃).a(o.E(new cj(☃)), null);
      }
      o.d(☃);
    }
    return ☃;
  }
  
  private void h()
  {
    if (h <= g) {
      a = g;
    } else {
      a = (g + as.nextInt(h - g));
    }
    if (c.size() > 0) {
      a((add.a)oa.a(as, c));
    }
    a(1);
  }
  
  public void a(dn ☃)
  {
    b = ☃.j("EntityId");
    a = ☃.e("Delay");
    
    c.clear();
    if (☃.b("SpawnPotentials", 9))
    {
      du ☃ = ☃.c("SpawnPotentials", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        c.add(new add.a(☃.b(☃)));
      }
    }
    if (☃.b("SpawnData", 10)) {
      a(new add.a(☃.m("SpawnData"), b));
    } else {
      a(null);
    }
    if (☃.b("MinSpawnDelay", 99))
    {
      g = ☃.e("MinSpawnDelay");
      h = ☃.e("MaxSpawnDelay");
      i = ☃.e("SpawnCount");
    }
    if (☃.b("MaxNearbyEntities", 99))
    {
      k = ☃.e("MaxNearbyEntities");
      l = ☃.e("RequiredPlayerRange");
    }
    if (☃.b("SpawnRange", 99)) {
      m = ☃.e("SpawnRange");
    }
    if (a() != null) {
      j = null;
    }
  }
  
  public void b(dn ☃)
  {
    String ☃ = f();
    if (nx.b(☃)) {
      return;
    }
    ☃.a("EntityId", ☃);
    ☃.a("Delay", (short)a);
    ☃.a("MinSpawnDelay", (short)g);
    ☃.a("MaxSpawnDelay", (short)h);
    ☃.a("SpawnCount", (short)i);
    ☃.a("MaxNearbyEntities", (short)k);
    ☃.a("RequiredPlayerRange", (short)l);
    ☃.a("SpawnRange", (short)m);
    if (i() != null) {
      ☃.a("SpawnData", add.a.b(i()).b());
    }
    if ((i() != null) || (c.size() > 0))
    {
      du ☃ = new du();
      if (c.size() > 0) {
        for (add.a ☃ : c) {
          ☃.a(☃.a());
        }
      } else {
        ☃.a(i().a());
      }
      ☃.a("SpawnPotentials", ☃);
    }
  }
  
  public pk a(adm ☃)
  {
    if (j == null)
    {
      pk ☃ = pm.a(f(), ☃);
      if (☃ != null)
      {
        ☃ = a(☃, false);
        j = ☃;
      }
    }
    return j;
  }
  
  public boolean b(int ☃)
  {
    if ((☃ == 1) && (aD))
    {
      a = g;
      return true;
    }
    return false;
  }
  
  private add.a i()
  {
    return d;
  }
  
  public void a(add.a ☃)
  {
    d = ☃;
  }
  
  public abstract void a(int paramInt);
  
  public abstract adm a();
  
  public abstract cj b();
  
  public double d()
  {
    return e;
  }
  
  public double e()
  {
    return f;
  }
  
  public class a
    extends oa.a
  {
    private final dn c;
    private final String d;
    
    public a(dn ☃)
    {
      this(☃.m("Properties"), ☃.j("Type"), ☃.f("Weight"));
    }
    
    public a(dn ☃, String ☃)
    {
      this(☃, ☃, 1);
    }
    
    private a(dn ☃, String ☃, int ☃)
    {
      super();
      if (☃.equals("Minecart")) {
        if (☃ != null) {
          ☃ = va.a.a(☃.f("Type")).b();
        } else {
          ☃ = "MinecartRideable";
        }
      }
      c = ☃;
      d = ☃;
    }
    
    public dn a()
    {
      dn ☃ = new dn();
      
      ☃.a("Properties", c);
      ☃.a("Type", d);
      ☃.a("Weight", a);
      
      return ☃;
    }
  }
}
