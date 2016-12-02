import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class anv
  implements amv
{
  private adm a;
  private Random b;
  private final alz[] c = new alz['Ā'];
  private final apz d;
  private final List<aqq> e = Lists.newArrayList();
  private final boolean f;
  private final boolean g;
  private apc h;
  private apc i;
  
  public anv(adm ☃, long ☃, boolean ☃, String ☃)
  {
    a = ☃;
    b = new Random(☃);
    d = apz.a(☃);
    if (☃)
    {
      Map<String, Map<String, String>> ☃ = d.b();
      if (☃.containsKey("village"))
      {
        Map<String, String> ☃ = (Map)☃.get("village");
        if (!☃.containsKey("size")) {
          ☃.put("size", "1");
        }
        e.add(new aqv(☃));
      }
      if (☃.containsKey("biome_1")) {
        e.add(new aqm((Map)☃.get("biome_1")));
      }
      if (☃.containsKey("mineshaft")) {
        e.add(new aqf((Map)☃.get("mineshaft")));
      }
      if (☃.containsKey("stronghold")) {
        e.add(new aqo((Map)☃.get("stronghold")));
      }
      if (☃.containsKey("oceanmonument")) {
        e.add(new aqk((Map)☃.get("oceanmonument")));
      }
    }
    if (d.b().containsKey("lake")) {
      h = new apc(afi.j);
    }
    if (d.b().containsKey("lava_lake")) {
      i = new apc(afi.l);
    }
    g = d.b().containsKey("dungeon");
    
    int ☃ = 0;
    int ☃ = 0;
    boolean ☃ = true;
    for (aqa ☃ : d.c())
    {
      for (int ☃ = ☃.d(); ☃ < ☃.d() + ☃.b(); ☃++)
      {
        alz ☃ = ☃.c();
        if (☃.c() != afi.a)
        {
          ☃ = false;
          c[☃] = ☃;
        }
      }
      if (☃.c().c() == afi.a)
      {
        ☃ += ☃.b();
      }
      else
      {
        ☃ += ☃.b() + ☃;
        ☃ = 0;
      }
    }
    ☃.b(☃);
    
    f = (☃ ? false : d.b().containsKey("decoration"));
  }
  
  public amy d(int ☃, int ☃)
  {
    ans ☃ = new ans();
    for (int ☃ = 0; ☃ < c.length; ☃++)
    {
      alz ☃ = c[☃];
      if (☃ != null) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++) {
            ☃.a(☃, ☃, ☃, ☃);
          }
        }
      }
    }
    for (any ☃ : e) {
      ☃.a(this, a, ☃, ☃, ☃);
    }
    amy ☃ = new amy(a, ☃, ☃, ☃);
    ady[] ☃ = a.v().b(null, ☃ * 16, ☃ * 16, 16, 16);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)az);
    }
    ☃.b();
    
    return ☃;
  }
  
  public boolean a(int ☃, int ☃)
  {
    return true;
  }
  
  public void a(amv ☃, int ☃, int ☃)
  {
    int ☃ = ☃ * 16;
    int ☃ = ☃ * 16;
    cj ☃ = new cj(☃, 0, ☃);
    ady ☃ = a.b(new cj(☃ + 16, 0, ☃ + 16));
    boolean ☃ = false;
    
    b.setSeed(a.J());
    long ☃ = b.nextLong() / 2L * 2L + 1L;
    long ☃ = b.nextLong() / 2L * 2L + 1L;
    b.setSeed(☃ * ☃ + ☃ * ☃ ^ a.J());
    
    adg ☃ = new adg(☃, ☃);
    for (aqq ☃ : e)
    {
      boolean ☃ = ☃.a(a, b, ☃);
      if ((☃ instanceof aqv)) {
        ☃ |= ☃;
      }
    }
    if ((h != null) && (!☃) && (b.nextInt(4) == 0)) {
      h.b(a, b, ☃.a(b.nextInt(16) + 8, b.nextInt(256), b.nextInt(16) + 8));
    }
    if ((i != null) && (!☃) && (b.nextInt(8) == 0))
    {
      cj ☃ = ☃.a(b.nextInt(16) + 8, b.nextInt(b.nextInt(248) + 8), b.nextInt(16) + 8);
      if ((☃.o() < a.F()) || (b.nextInt(10) == 0)) {
        i.b(a, b, ☃);
      }
    }
    if (g) {
      for (int ☃ = 0; ☃ < 8; ☃++) {
        new api().b(a, b, ☃.a(b.nextInt(16) + 8, b.nextInt(256), b.nextInt(16) + 8));
      }
    }
    if (f) {
      ☃.a(a, b, ☃);
    }
  }
  
  public boolean a(amv ☃, amy ☃, int ☃, int ☃)
  {
    return false;
  }
  
  public boolean a(boolean ☃, nu ☃)
  {
    return true;
  }
  
  public void c() {}
  
  public boolean d()
  {
    return false;
  }
  
  public boolean e()
  {
    return true;
  }
  
  public String f()
  {
    return "FlatLevelSource";
  }
  
  public List<ady.c> a(pt ☃, cj ☃)
  {
    ady ☃ = a.b(☃);
    return ☃.a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    if ("Stronghold".equals(☃)) {
      for (aqq ☃ : e) {
        if ((☃ instanceof aqo)) {
          return ☃.b(☃, ☃);
        }
      }
    }
    return null;
  }
  
  public int g()
  {
    return 0;
  }
  
  public void a(amy ☃, int ☃, int ☃)
  {
    for (aqq ☃ : e) {
      ☃.a(this, a, ☃, ☃, null);
    }
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
