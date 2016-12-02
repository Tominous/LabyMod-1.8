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
    this.a = 20;
    this.b = "Pig";
    this.c = Lists.newArrayList();
    
    this.g = 200;
    this.h = 800;
    this.i = 4;
    
    this.k = 6;
    this.l = 16;
    this.m = 4;
  }
  
  private String f()
  {
    if (i() == null)
    {
      if ((this.b != null) && (this.b.equals("Minecart"))) {
        this.b = "MinecartRideable";
      }
      return this.b;
    }
    return add.a.a(i());
  }
  
  public void a(String ☃)
  {
    this.b = ☃;
  }
  
  private boolean g()
  {
    cj ☃ = b();
    return a().b(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, this.l);
  }
  
  public void c()
  {
    if (!g()) {
      return;
    }
    cj ☃ = b();
    if (a().D)
    {
      double ☃ = ☃.n() + a().s.nextFloat();
      double ☃ = ☃.o() + a().s.nextFloat();
      double ☃ = ☃.p() + a().s.nextFloat();
      a().a(cy.l, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      a().a(cy.A, ☃, ☃, ☃, 0.0D, 0.0D, 0.0D, new int[0]);
      if (this.a > 0) {
        this.a -= 1;
      }
      this.f = this.e;
      this.e = ((this.e + 1000.0F / (this.a + 200.0F)) % 360.0D);
    }
    else
    {
      if (this.a == -1) {
        h();
      }
      if (this.a > 0)
      {
        this.a -= 1;
        return;
      }
      boolean ☃ = false;
      for (int ☃ = 0; ☃ < this.i; ☃++)
      {
        pk ☃ = pm.a(f(), a());
        if (☃ == null) {
          return;
        }
        int ☃ = a().a(☃.getClass(), new aug(☃.n(), ☃.o(), ☃.p(), ☃.n() + 1, ☃.o() + 1, ☃.p() + 1).b(this.m, this.m, this.m)).size();
        if (☃ >= this.k)
        {
          h();
          return;
        }
        double ☃ = ☃.n() + (a().s.nextDouble() - a().s.nextDouble()) * this.m + 0.5D;
        double ☃ = ☃.o() + a().s.nextInt(3) - 1;
        double ☃ = ☃.p() + (a().s.nextDouble() - a().s.nextDouble()) * this.m + 0.5D;
        ps ☃ = (☃ instanceof ps) ? (ps)☃ : null;
        
        ☃.b(☃, ☃, ☃, a().s.nextFloat() * 360.0F, 0.0F);
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
      if ((☃.o != null) && (☃)) {
        ☃.o.d(☃);
      }
      pk ☃ = ☃;
      while (☃.b("Riding", 10))
      {
        dn ☃ = ☃.m("Riding");
        pk ☃ = pm.a(☃.j("id"), ☃.o);
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
          ☃.b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
          if ((☃.o != null) && (☃)) {
            ☃.o.d(☃);
          }
          ☃.a(☃);
        }
        ☃ = ☃;
        ☃ = ☃;
      }
    }
    else if (((☃ instanceof pr)) && (☃.o != null) && (☃))
    {
      if ((☃ instanceof ps)) {
        ((ps)☃).a(☃.o.E(new cj(☃)), null);
      }
      ☃.o.d(☃);
    }
    return ☃;
  }
  
  private void h()
  {
    if (this.h <= this.g) {
      this.a = this.g;
    } else {
      this.a = (this.g + a().s.nextInt(this.h - this.g));
    }
    if (this.c.size() > 0) {
      a((add.a)oa.a(a().s, this.c));
    }
    a(1);
  }
  
  public void a(dn ☃)
  {
    this.b = ☃.j("EntityId");
    this.a = ☃.e("Delay");
    
    this.c.clear();
    if (☃.b("SpawnPotentials", 9))
    {
      du ☃ = ☃.c("SpawnPotentials", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
        this.c.add(new add.a(☃.b(☃)));
      }
    }
    if (☃.b("SpawnData", 10)) {
      a(new add.a(☃.m("SpawnData"), this.b));
    } else {
      a(null);
    }
    if (☃.b("MinSpawnDelay", 99))
    {
      this.g = ☃.e("MinSpawnDelay");
      this.h = ☃.e("MaxSpawnDelay");
      this.i = ☃.e("SpawnCount");
    }
    if (☃.b("MaxNearbyEntities", 99))
    {
      this.k = ☃.e("MaxNearbyEntities");
      this.l = ☃.e("RequiredPlayerRange");
    }
    if (☃.b("SpawnRange", 99)) {
      this.m = ☃.e("SpawnRange");
    }
    if (a() != null) {
      this.j = null;
    }
  }
  
  public void b(dn ☃)
  {
    String ☃ = f();
    if (nx.b(☃)) {
      return;
    }
    ☃.a("EntityId", ☃);
    ☃.a("Delay", (short)this.a);
    ☃.a("MinSpawnDelay", (short)this.g);
    ☃.a("MaxSpawnDelay", (short)this.h);
    ☃.a("SpawnCount", (short)this.i);
    ☃.a("MaxNearbyEntities", (short)this.k);
    ☃.a("RequiredPlayerRange", (short)this.l);
    ☃.a("SpawnRange", (short)this.m);
    if (i() != null) {
      ☃.a("SpawnData", add.a.b(i()).b());
    }
    if ((i() != null) || (this.c.size() > 0))
    {
      du ☃ = new du();
      if (this.c.size() > 0) {
        for (add.a ☃ : this.c) {
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
    if (this.j == null)
    {
      pk ☃ = pm.a(f(), ☃);
      if (☃ != null)
      {
        ☃ = a(☃, false);
        this.j = ☃;
      }
    }
    return this.j;
  }
  
  public boolean b(int ☃)
  {
    if ((☃ == 1) && (a().D))
    {
      this.a = this.g;
      return true;
    }
    return false;
  }
  
  private add.a i()
  {
    return this.d;
  }
  
  public void a(add.a ☃)
  {
    this.d = ☃;
  }
  
  public abstract void a(int paramInt);
  
  public abstract adm a();
  
  public abstract cj b();
  
  public double d()
  {
    return this.e;
  }
  
  public double e()
  {
    return this.f;
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
      this.c = ☃;
      this.d = ☃;
    }
    
    public dn a()
    {
      dn ☃ = new dn();
      
      ☃.a("Properties", this.c);
      ☃.a("Type", this.d);
      ☃.a("Weight", this.a);
      
      return ☃;
    }
  }
}
