import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;

public class akv
  extends alk
  implements km, og
{
  public static final pe[][] a = { { pe.c, pe.e }, { pe.m, pe.j }, { pe.g }, { pe.l } };
  private final List<akv.a> f;
  private long g;
  private float h;
  private boolean i;
  private int j;
  private int k;
  private int l;
  private zx m;
  private String n;
  
  public akv()
  {
    this.f = Lists.newArrayList();
    
    this.j = -1;
  }
  
  public void c()
  {
    if (this.b.K() % 80L == 0L) {
      m();
    }
  }
  
  public void m()
  {
    B();
    A();
  }
  
  private void A()
  {
    if ((this.i) && (this.j > 0) && (!this.b.D) && (this.k > 0))
    {
      double ☃ = this.j * 10 + 10;
      int ☃ = 0;
      if ((this.j >= 4) && (this.k == this.l)) {
        ☃ = 1;
      }
      int ☃ = this.c.n();
      int ☃ = this.c.o();
      int ☃ = this.c.p();
      aug ☃ = new aug(☃, ☃, ☃, ☃ + 1, ☃ + 1, ☃ + 1).b(☃, ☃, ☃).a(0.0D, this.b.U(), 0.0D);
      List<wn> ☃ = this.b.a(wn.class, ☃);
      for (wn ☃ : ☃) {
        ☃.c(new pf(this.k, 180, ☃, true, true));
      }
      if ((this.j >= 4) && (this.k != this.l) && (this.l > 0)) {
        for (wn ☃ : ☃) {
          ☃.c(new pf(this.l, 180, 0, true, true));
        }
      }
    }
  }
  
  private void B()
  {
    int ☃ = this.j;
    
    int ☃ = this.c.n();
    int ☃ = this.c.o();
    int ☃ = this.c.p();
    
    this.j = 0;
    this.f.clear();
    this.i = true;
    
    akv.a ☃ = new akv.a(tv.a(zd.a));
    this.f.add(☃);
    boolean ☃ = true;
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃ + 1; ☃ < 256; ☃++)
    {
      alz ☃ = this.b.p(☃.c(☃, ☃, ☃));
      float[] ☃;
      if (☃.c() == afi.cG)
      {
        ☃ = tv.a((zd)☃.b(ajs.a));
      }
      else
      {
        float[] ☃;
        if (☃.c() == afi.cH)
        {
          ☃ = tv.a((zd)☃.b(ajt.a));
        }
        else
        {
          if ((☃.c().p() < 15) || (☃.c() == afi.h))
          {
            ☃.a();
            continue;
          }
          this.i = false;
          this.f.clear();
          break;
        }
      }
      float[] ☃;
      if (!☃) {
        ☃ = new float[] { (☃.b()[0] + ☃[0]) / 2.0F, (☃.b()[1] + ☃[1]) / 2.0F, (☃.b()[2] + ☃[2]) / 2.0F };
      }
      if (Arrays.equals(☃, ☃.b()))
      {
        ☃.a();
      }
      else
      {
        ☃ = new akv.a(☃);
        this.f.add(☃);
      }
      ☃ = false;
    }
    if (this.i)
    {
      for (int ☃ = 1; ☃ <= 4; ☃++)
      {
        int ☃ = ☃ - ☃;
        if (☃ < 0) {
          break;
        }
        boolean ☃ = true;
        for (int ☃ = ☃ - ☃; (☃ <= ☃ + ☃) && (☃); ☃++) {
          for (int ☃ = ☃ - ☃; ☃ <= ☃ + ☃; ☃++)
          {
            afh ☃ = this.b.p(new cj(☃, ☃, ☃)).c();
            if ((☃ != afi.bT) && (☃ != afi.R) && (☃ != afi.ah) && (☃ != afi.S))
            {
              ☃ = false;
              break;
            }
          }
        }
        if (!☃) {
          break;
        }
        this.j = ☃;
      }
      if (this.j == 0) {
        this.i = false;
      }
    }
    if ((!this.b.D) && 
      (this.j == 4) && (☃ < this.j)) {
      for (wn ☃ : this.b.a(wn.class, new aug(☃, ☃, ☃, ☃, ☃ - 4, ☃).b(10.0D, 5.0D, 10.0D))) {
        ☃.b(mr.K);
      }
    }
  }
  
  public List<akv.a> n()
  {
    return this.f;
  }
  
  public float o()
  {
    if (!this.i) {
      return 0.0F;
    }
    int ☃ = (int)(this.b.K() - this.g);
    this.g = this.b.K();
    if (☃ > 1)
    {
      this.h -= ☃ / 40.0F;
      if (this.h < 0.0F) {
        this.h = 0.0F;
      }
    }
    this.h += 0.025F;
    if (this.h > 1.0F) {
      this.h = 1.0F;
    }
    return this.h;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(this.c, 3, ☃);
  }
  
  public double s()
  {
    return 65536.0D;
  }
  
  private int h(int ☃)
  {
    if ((☃ < 0) || (☃ >= pe.a.length) || (pe.a[☃] == null)) {
      return 0;
    }
    pe ☃ = pe.a[☃];
    if ((☃ != pe.c) && (☃ != pe.e) && (☃ != pe.m) && (☃ != pe.j) && (☃ != pe.g) && (☃ != pe.l)) {
      return 0;
    }
    return ☃;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    this.k = h(☃.f("Primary"));
    this.l = h(☃.f("Secondary"));
    this.j = ☃.f("Levels");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("Primary", this.k);
    ☃.a("Secondary", this.l);
    
    ☃.a("Levels", this.j);
  }
  
  public int o_()
  {
    return 1;
  }
  
  public zx a(int ☃)
  {
    if (☃ == 0) {
      return this.m;
    }
    return null;
  }
  
  public zx a(int ☃, int ☃)
  {
    if ((☃ == 0) && (this.m != null))
    {
      if (☃ >= this.m.b)
      {
        zx ☃ = this.m;
        this.m = null;
        return ☃;
      }
      this.m.b -= ☃;
      return new zx(this.m.b(), ☃, this.m.i());
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if ((☃ == 0) && (this.m != null))
    {
      zx ☃ = this.m;
      this.m = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    if (☃ == 0) {
      this.m = ☃;
    }
  }
  
  public String e_()
  {
    return l_() ? this.n : "container.beacon";
  }
  
  public boolean l_()
  {
    return (this.n != null) && (this.n.length() > 0);
  }
  
  public void a(String ☃)
  {
    this.n = ☃;
  }
  
  public int q_()
  {
    return 1;
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
    return (☃.b() == zy.bO) || (☃.b() == zy.i) || (☃.b() == zy.k) || (☃.b() == zy.j);
  }
  
  public String k()
  {
    return "minecraft:beacon";
  }
  
  public xi a(wm ☃, wn ☃)
  {
    return new xl(☃, this);
  }
  
  public int a_(int ☃)
  {
    switch (☃)
    {
    case 0: 
      return this.j;
    case 1: 
      return this.k;
    case 2: 
      return this.l;
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      this.j = ☃;
      break;
    case 1: 
      this.k = h(☃);
      break;
    case 2: 
      this.l = h(☃);
    }
  }
  
  public int g()
  {
    return 3;
  }
  
  public void l()
  {
    this.m = null;
  }
  
  public boolean c(int ☃, int ☃)
  {
    if (☃ == 1)
    {
      m();
      return true;
    }
    return super.c(☃, ☃);
  }
  
  public static class a
  {
    private final float[] a;
    private int b;
    
    public a(float[] ☃)
    {
      this.a = ☃;
      this.b = 1;
    }
    
    protected void a()
    {
      this.b += 1;
    }
    
    public float[] b()
    {
      return this.a;
    }
    
    public int c()
    {
      return this.b;
    }
  }
}
