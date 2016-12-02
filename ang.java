public class ang
{
  public static ang.a a(dn ☃)
  {
    int ☃ = ☃.f("xPos");
    int ☃ = ☃.f("zPos");
    
    ang.a ☃ = new ang.a(☃, ☃);
    g = ☃.k("Blocks");
    f = new ana(☃.k("Data"), 7);
    e = new ana(☃.k("SkyLight"), 7);
    d = new ana(☃.k("BlockLight"), 7);
    c = ☃.k("HeightMap");
    b = ☃.n("TerrainPopulated");
    h = ☃.c("Entities", 10);
    i = ☃.c("TileEntities", 10);
    j = ☃.c("TileTicks", 10);
    try
    {
      a = ☃.g("LastUpdate");
    }
    catch (ClassCastException ☃)
    {
      a = ☃.f("LastUpdate");
    }
    return ☃;
  }
  
  public static void a(ang.a ☃, dn ☃, aec ☃)
  {
    ☃.a("xPos", k);
    ☃.a("zPos", l);
    ☃.a("LastUpdate", a);
    int[] ☃ = new int[c.length];
    for (int ☃ = 0; ☃ < c.length; ☃++) {
      ☃[☃] = c[☃];
    }
    ☃.a("HeightMap", ☃);
    ☃.a("TerrainPopulated", b);
    
    du ☃ = new du();
    for (int ☃ = 0; ☃ < 8; ☃++)
    {
      boolean ☃ = true;
      for (int ☃ = 0; (☃ < 16) && (☃); ☃++) {
        for (int ☃ = 0; (☃ < 16) && (☃); ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++)
          {
            int ☃ = ☃ << 11 | ☃ << 7 | ☃ + (☃ << 4);
            int ☃ = g[☃];
            if (☃ != 0)
            {
              ☃ = false;
              break;
            }
          }
        }
      }
      if (!☃)
      {
        byte[] ☃ = new byte['က'];
        amw ☃ = new amw();
        amw ☃ = new amw();
        amw ☃ = new amw();
        for (int ☃ = 0; ☃ < 16; ☃++) {
          for (int ☃ = 0; ☃ < 16; ☃++) {
            for (int ☃ = 0; ☃ < 16; ☃++)
            {
              int ☃ = ☃ << 11 | ☃ << 7 | ☃ + (☃ << 4);
              int ☃ = g[☃];
              
              ☃[(☃ << 8 | ☃ << 4 | ☃)] = ((byte)(☃ & 0xFF));
              ☃.a(☃, ☃, ☃, f.a(☃, ☃ + (☃ << 4), ☃));
              ☃.a(☃, ☃, ☃, e.a(☃, ☃ + (☃ << 4), ☃));
              ☃.a(☃, ☃, ☃, d.a(☃, ☃ + (☃ << 4), ☃));
            }
          }
        }
        dn ☃ = new dn();
        
        ☃.a("Y", (byte)(☃ & 0xFF));
        ☃.a("Blocks", ☃);
        ☃.a("Data", ☃.a());
        ☃.a("SkyLight", ☃.a());
        ☃.a("BlockLight", ☃.a());
        
        ☃.a(☃);
      }
    }
    ☃.a("Sections", ☃);
    
    byte[] ☃ = new byte['Ā'];
    cj.a ☃ = new cj.a();
    for (int ☃ = 0; ☃ < 16; ☃++) {
      for (int ☃ = 0; ☃ < 16; ☃++)
      {
        ☃.c(k << 4 | ☃, 0, l << 4 | ☃);
        ☃[(☃ << 4 | ☃)] = ((byte)(aadaz & 0xFF));
      }
    }
    ☃.a("Biomes", ☃);
    ☃.a("Entities", h);
    ☃.a("TileEntities", i);
    if (j != null) {
      ☃.a("TileTicks", j);
    }
  }
  
  public static class a
  {
    public long a;
    public boolean b;
    public byte[] c;
    public ana d;
    public ana e;
    public ana f;
    public byte[] g;
    public du h;
    public du i;
    public du j;
    public final int k;
    public final int l;
    
    public a(int ☃, int ☃)
    {
      k = ☃;
      l = ☃;
    }
  }
}
