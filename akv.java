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
    f = Lists.newArrayList();
    
    j = -1;
  }
  
  public void c()
  {
    if (b.K() % 80L == 0L) {
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
    if ((i) && (j > 0) && (!b.D) && (k > 0))
    {
      double ☃ = j * 10 + 10;
      int ☃ = 0;
      if ((j >= 4) && (k == l)) {
        ☃ = 1;
      }
      int ☃ = c.n();
      int ☃ = c.o();
      int ☃ = c.p();
      aug ☃ = new aug(☃, ☃, ☃, ☃ + 1, ☃ + 1, ☃ + 1).b(☃, ☃, ☃).a(0.0D, b.U(), 0.0D);
      List<wn> ☃ = b.a(wn.class, ☃);
      for (wn ☃ : ☃) {
        ☃.c(new pf(k, 180, ☃, true, true));
      }
      if ((j >= 4) && (k != l) && (l > 0)) {
        for (wn ☃ : ☃) {
          ☃.c(new pf(l, 180, 0, true, true));
        }
      }
    }
  }
  
  private void B()
  {
    int ☃ = j;
    
    int ☃ = c.n();
    int ☃ = c.o();
    int ☃ = c.p();
    
    j = 0;
    f.clear();
    i = true;
    
    akv.a ☃ = new akv.a(tv.a(zd.a));
    f.add(☃);
    boolean ☃ = true;
    
    cj.a ☃ = new cj.a();
    for (int ☃ = ☃ + 1; ☃ < 256; ☃++)
    {
      alz ☃ = b.p(☃.c(☃, ☃, ☃));
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
          i = false;
          f.clear();
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
        f.add(☃);
      }
      ☃ = false;
    }
    if (i)
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
            afh ☃ = b.p(new cj(☃, ☃, ☃)).c();
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
        j = ☃;
      }
      if (j == 0) {
        i = false;
      }
    }
    if ((!b.D) && 
      (j == 4) && (☃ < j)) {
      for (wn ☃ : b.a(wn.class, new aug(☃, ☃, ☃, ☃, ☃ - 4, ☃).b(10.0D, 5.0D, 10.0D))) {
        ☃.b(mr.K);
      }
    }
  }
  
  public List<akv.a> n()
  {
    return f;
  }
  
  public float o()
  {
    if (!i) {
      return 0.0F;
    }
    int ☃ = (int)(b.K() - g);
    g = b.K();
    if (☃ > 1)
    {
      h -= ☃ / 40.0F;
      if (h < 0.0F) {
        h = 0.0F;
      }
    }
    h += 0.025F;
    if (h > 1.0F) {
      h = 1.0F;
    }
    return h;
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(c, 3, ☃);
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
    
    k = h(☃.f("Primary"));
    l = h(☃.f("Secondary"));
    j = ☃.f("Levels");
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    
    ☃.a("Primary", k);
    ☃.a("Secondary", l);
    
    ☃.a("Levels", j);
  }
  
  public int o_()
  {
    return 1;
  }
  
  public zx a(int ☃)
  {
    if (☃ == 0) {
      return m;
    }
    return null;
  }
  
  public zx a(int ☃, int ☃)
  {
    if ((☃ == 0) && (m != null))
    {
      if (☃ >= m.b)
      {
        zx ☃ = m;
        m = null;
        return ☃;
      }
      m.b -= ☃;
      return new zx(m.b(), ☃, m.i());
    }
    return null;
  }
  
  public zx b(int ☃)
  {
    if ((☃ == 0) && (m != null))
    {
      zx ☃ = m;
      m = null;
      return ☃;
    }
    return null;
  }
  
  public void a(int ☃, zx ☃)
  {
    if (☃ == 0) {
      m = ☃;
    }
  }
  
  public String e_()
  {
    return l_() ? n : "container.beacon";
  }
  
  public boolean l_()
  {
    return (n != null) && (n.length() > 0);
  }
  
  public void a(String ☃)
  {
    n = ☃;
  }
  
  public int q_()
  {
    return 1;
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
      return j;
    case 1: 
      return k;
    case 2: 
      return l;
    }
    return 0;
  }
  
  public void b(int ☃, int ☃)
  {
    switch (☃)
    {
    case 0: 
      j = ☃;
      break;
    case 1: 
      k = h(☃);
      break;
    case 2: 
      l = h(☃);
    }
  }
  
  public int g()
  {
    return 3;
  }
  
  public void l()
  {
    m = null;
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
      a = ☃;
      b = 1;
    }
    
    protected void a()
    {
      b += 1;
    }
    
    public float[] b()
    {
      return a;
    }
    
    public int c()
    {
      return b;
    }
  }
}
