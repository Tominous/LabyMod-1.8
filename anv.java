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
    this.a = ☃;
    this.b = new Random(☃);
    this.d = apz.a(☃);
    if (☃)
    {
      Map<String, Map<String, String>> ☃ = this.d.b();
      if (☃.containsKey("village"))
      {
        Map<String, String> ☃ = (Map)☃.get("village");
        if (!☃.containsKey("size")) {
          ☃.put("size", "1");
        }
        this.e.add(new aqv(☃));
      }
      if (☃.containsKey("biome_1")) {
        this.e.add(new aqm((Map)☃.get("biome_1")));
      }
      if (☃.containsKey("mineshaft")) {
        this.e.add(new aqf((Map)☃.get("mineshaft")));
      }
      if (☃.containsKey("stronghold")) {
        this.e.add(new aqo((Map)☃.get("stronghold")));
      }
      if (☃.containsKey("oceanmonument")) {
        this.e.add(new aqk((Map)☃.get("oceanmonument")));
      }
    }
    if (this.d.b().containsKey("lake")) {
      this.h = new apc(afi.j);
    }
    if (this.d.b().containsKey("lava_lake")) {
      this.i = new apc(afi.l);
    }
    this.g = this.d.b().containsKey("dungeon");
    
    int ☃ = 0;
    int ☃ = 0;
    boolean ☃ = true;
    for (aqa ☃ : this.d.c())
    {
      for (int ☃ = ☃.d(); ☃ < ☃.d() + ☃.b(); ☃++)
      {
        alz ☃ = ☃.c();
        if (☃.c() != afi.a)
        {
          ☃ = false;
          this.c[☃] = ☃;
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
    
    this.f = (☃ ? false : this.d.b().containsKey("decoration"));
  }
  
  public amy d(int ☃, int ☃)
  {
    ans ☃ = new ans();
    for (int ☃ = 0; ☃ < this.c.length; ☃++)
    {
      alz ☃ = this.c[☃];
      if (☃ != null) {
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++) {
            ☃.a(☃, ☃, ☃, ☃);
          }
        }
      }
    }
    for (any ☃ : this.e) {
      ☃.a(this, this.a, ☃, ☃, ☃);
    }
    amy ☃ = new amy(this.a, ☃, ☃, ☃);
    ady[] ☃ = this.a.v().b(null, ☃ * 16, ☃ * 16, 16, 16);
    byte[] ☃ = ☃.k();
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      ☃[☃] = ((byte)☃[☃].az);
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
    ady ☃ = this.a.b(new cj(☃ + 16, 0, ☃ + 16));
    boolean ☃ = false;
    
    this.b.setSeed(this.a.J());
    long ☃ = this.b.nextLong() / 2L * 2L + 1L;
    long ☃ = this.b.nextLong() / 2L * 2L + 1L;
    this.b.setSeed(☃ * ☃ + ☃ * ☃ ^ this.a.J());
    
    adg ☃ = new adg(☃, ☃);
    for (aqq ☃ : this.e)
    {
      boolean ☃ = ☃.a(this.a, this.b, ☃);
      if ((☃ instanceof aqv)) {
        ☃ |= ☃;
      }
    }
    if ((this.h != null) && (!☃) && (this.b.nextInt(4) == 0)) {
      this.h.b(this.a, this.b, ☃.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
    }
    if ((this.i != null) && (!☃) && (this.b.nextInt(8) == 0))
    {
      cj ☃ = ☃.a(this.b.nextInt(16) + 8, this.b.nextInt(this.b.nextInt(248) + 8), this.b.nextInt(16) + 8);
      if ((☃.o() < this.a.F()) || (this.b.nextInt(10) == 0)) {
        this.i.b(this.a, this.b, ☃);
      }
    }
    if (this.g) {
      for (int ☃ = 0; ☃ < 8; ☃++) {
        new api().b(this.a, this.b, ☃.a(this.b.nextInt(16) + 8, this.b.nextInt(256), this.b.nextInt(16) + 8));
      }
    }
    if (this.f) {
      ☃.a(this.a, this.b, ☃);
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
    ady ☃ = this.a.b(☃);
    return ☃.a(☃);
  }
  
  public cj a(adm ☃, String ☃, cj ☃)
  {
    if ("Stronghold".equals(☃)) {
      for (aqq ☃ : this.e) {
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
    for (aqq ☃ : this.e) {
      ☃.a(this, this.a, ☃, ☃, null);
    }
  }
  
  public amy a(cj ☃)
  {
    return d(☃.n() >> 4, ☃.p() >> 4);
  }
}
