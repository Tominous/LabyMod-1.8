import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aec
{
  private ase b;
  private ase c;
  private adz d = new adz(this);
  private List<ady> e;
  private String f = "";
  
  protected aec()
  {
    e = Lists.newArrayList();
    e.add(ady.t);
    e.add(ady.q);
    e.add(ady.u);
    e.add(ady.I);
    e.add(ady.H);
    e.add(ady.K);
    e.add(ady.L);
  }
  
  public aec(long ☃, adr ☃, String ☃)
  {
    this();
    f = ☃;
    
    ase[] ☃ = ase.a(☃, ☃, ☃);
    b = ☃[0];
    c = ☃[1];
  }
  
  public aec(adm ☃)
  {
    this(☃.J(), ☃.P().u(), ☃.P().B());
  }
  
  public List<ady> a()
  {
    return e;
  }
  
  public ady a(cj ☃)
  {
    return a(☃, null);
  }
  
  public ady a(cj ☃, ady ☃)
  {
    return d.a(☃.n(), ☃.p(), ☃);
  }
  
  public float[] a(float[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new float[☃ * ☃];
    }
    int[] ☃ = c.a(☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃ * ☃; ☃++) {
      try
      {
        float ☃ = ady.a(☃[☃], ady.ad).h() / 65536.0F;
        if (☃ > 1.0F) {
          ☃ = 1.0F;
        }
        ☃[☃] = ☃;
      }
      catch (Throwable ☃)
      {
        b ☃ = b.a(☃, "Invalid Biome id");
        c ☃ = ☃.a("DownfallBlock");
        ☃.a("biome id", Integer.valueOf(☃));
        ☃.a("downfalls[] size", Integer.valueOf(☃.length));
        ☃.a("x", Integer.valueOf(☃));
        ☃.a("z", Integer.valueOf(☃));
        ☃.a("w", Integer.valueOf(☃));
        ☃.a("h", Integer.valueOf(☃));
        
        throw new e(☃);
      }
    }
    return ☃;
  }
  
  public float a(float ☃, int ☃)
  {
    return ☃;
  }
  
  public ady[] a(ady[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new ady[☃ * ☃];
    }
    int[] ☃ = b.a(☃, ☃, ☃, ☃);
    try
    {
      for (int ☃ = 0; ☃ < ☃ * ☃; ☃++) {
        ☃[☃] = ady.a(☃[☃], ady.ad);
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Invalid Biome id");
      c ☃ = ☃.a("RawBiomeBlock");
      ☃.a("biomes[] size", Integer.valueOf(☃.length));
      ☃.a("x", Integer.valueOf(☃));
      ☃.a("z", Integer.valueOf(☃));
      ☃.a("w", Integer.valueOf(☃));
      ☃.a("h", Integer.valueOf(☃));
      
      throw new e(☃);
    }
    return ☃;
  }
  
  public ady[] b(ady[] ☃, int ☃, int ☃, int ☃, int ☃)
  {
    return a(☃, ☃, ☃, ☃, ☃, true);
  }
  
  public ady[] a(ady[] ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    
    if ((☃ == null) || (☃.length < ☃ * ☃)) {
      ☃ = new ady[☃ * ☃];
    }
    if ((☃) && (☃ == 16) && (☃ == 16) && ((☃ & 0xF) == 0) && ((☃ & 0xF) == 0))
    {
      ady[] ☃ = d.c(☃, ☃);
      System.arraycopy(☃, 0, ☃, 0, ☃ * ☃);
      return ☃;
    }
    int[] ☃ = c.a(☃, ☃, ☃, ☃);
    for (int ☃ = 0; ☃ < ☃ * ☃; ☃++) {
      ☃[☃] = ady.a(☃[☃], ady.ad);
    }
    return ☃;
  }
  
  public boolean a(int ☃, int ☃, int ☃, List<ady> ☃)
  {
    asc.a();
    int ☃ = ☃ - ☃ >> 2;
    int ☃ = ☃ - ☃ >> 2;
    int ☃ = ☃ + ☃ >> 2;
    int ☃ = ☃ + ☃ >> 2;
    
    int ☃ = ☃ - ☃ + 1;
    int ☃ = ☃ - ☃ + 1;
    
    int[] ☃ = b.a(☃, ☃, ☃, ☃);
    try
    {
      for (int ☃ = 0; ☃ < ☃ * ☃; ☃++)
      {
        ady ☃ = ady.e(☃[☃]);
        if (!☃.contains(☃)) {
          return false;
        }
      }
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Invalid Biome id");
      c ☃ = ☃.a("Layer");
      ☃.a("Layer", b.toString());
      ☃.a("x", Integer.valueOf(☃));
      ☃.a("z", Integer.valueOf(☃));
      ☃.a("radius", Integer.valueOf(☃));
      ☃.a("allowed", ☃);
      
      throw new e(☃);
    }
    return true;
  }
  
  public cj a(int ☃, int ☃, int ☃, List<ady> ☃, Random ☃)
  {
    asc.a();
    int ☃ = ☃ - ☃ >> 2;
    int ☃ = ☃ - ☃ >> 2;
    int ☃ = ☃ + ☃ >> 2;
    int ☃ = ☃ + ☃ >> 2;
    
    int ☃ = ☃ - ☃ + 1;
    int ☃ = ☃ - ☃ + 1;
    int[] ☃ = b.a(☃, ☃, ☃, ☃);
    cj ☃ = null;
    int ☃ = 0;
    for (int ☃ = 0; ☃ < ☃ * ☃; ☃++)
    {
      int ☃ = ☃ + ☃ % ☃ << 2;
      int ☃ = ☃ + ☃ / ☃ << 2;
      ady ☃ = ady.e(☃[☃]);
      if ((☃.contains(☃)) && (
        (☃ == null) || (☃.nextInt(☃ + 1) == 0)))
      {
        ☃ = new cj(☃, 0, ☃);
        ☃++;
      }
    }
    return ☃;
  }
  
  public void b()
  {
    d.a();
  }
}
