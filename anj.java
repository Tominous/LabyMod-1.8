import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class anj
  implements and, aud
{
  private static final Logger a = ;
  private Map<adg, dn> b = new ConcurrentHashMap();
  private Set<adg> c = Collections.newSetFromMap(new ConcurrentHashMap());
  private final File d;
  private boolean e = false;
  
  public anj(File ☃)
  {
    d = ☃;
  }
  
  public amy a(adm ☃, int ☃, int ☃)
    throws IOException
  {
    adg ☃ = new adg(☃, ☃);
    
    dn ☃ = (dn)b.get(☃);
    if (☃ == null)
    {
      DataInputStream ☃ = ani.c(d, ☃, ☃);
      if (☃ != null) {
        ☃ = dx.a(☃);
      } else {
        return null;
      }
    }
    return a(☃, ☃, ☃, ☃);
  }
  
  protected amy a(adm ☃, int ☃, int ☃, dn ☃)
  {
    if (!☃.b("Level", 10))
    {
      a.error("Chunk file at " + ☃ + "," + ☃ + " is missing level data, skipping");
      return null;
    }
    dn ☃ = ☃.m("Level");
    if (!☃.b("Sections", 9))
    {
      a.error("Chunk file at " + ☃ + "," + ☃ + " is missing block data, skipping");
      return null;
    }
    amy ☃ = a(☃, ☃);
    if (!☃.a(☃, ☃))
    {
      a.error("Chunk file at " + ☃ + "," + ☃ + " is in the wrong location; relocating. (Expected " + ☃ + ", " + ☃ + ", got " + a + ", " + b + ")");
      ☃.a("xPos", ☃);
      ☃.a("zPos", ☃);
      ☃ = a(☃, ☃);
    }
    return ☃;
  }
  
  public void a(adm ☃, amy ☃)
    throws IOException, adn
  {
    ☃.I();
    try
    {
      dn ☃ = new dn();
      dn ☃ = new dn();
      ☃.a("Level", ☃);
      a(☃, ☃, ☃);
      a(☃.j(), ☃);
    }
    catch (Exception ☃)
    {
      a.error("Failed to save chunk", ☃);
    }
  }
  
  protected void a(adg ☃, dn ☃)
  {
    if (!c.contains(☃)) {
      b.put(☃, ☃);
    }
    auc.a().a(this);
  }
  
  public boolean c()
  {
    if (b.isEmpty())
    {
      if (e) {
        a.info("ThreadedAnvilChunkStorage ({}): All chunks are saved", new Object[] { d.getName() });
      }
      return false;
    }
    adg ☃ = (adg)b.keySet().iterator().next();
    try
    {
      c.add(☃);
      dn ☃ = (dn)b.remove(☃);
      if (☃ != null) {
        try
        {
          b(☃, ☃);
        }
        catch (Exception ☃)
        {
          a.error("Failed to save chunk", ☃);
        }
      }
      return 1;
    }
    finally
    {
      c.remove(☃);
    }
  }
  
  private void b(adg ☃, dn ☃)
    throws IOException
  {
    DataOutputStream ☃ = ani.d(d, a, b);
    dx.a(☃, ☃);
    ☃.close();
  }
  
  public void b(adm ☃, amy ☃)
    throws IOException
  {}
  
  public void a() {}
  
  public void b()
  {
    try
    {
      e = true;
      while (c()) {}
    }
    finally
    {
      e = false;
    }
  }
  
  private void a(amy ☃, adm ☃, dn ☃)
  {
    ☃.a("V", (byte)1);
    ☃.a("xPos", a);
    ☃.a("zPos", b);
    ☃.a("LastUpdate", ☃.K());
    ☃.a("HeightMap", ☃.q());
    ☃.a("TerrainPopulated", ☃.t());
    ☃.a("LightPopulated", ☃.u());
    ☃.a("InhabitedTime", ☃.w());
    
    amz[] ☃ = ☃.h();
    du ☃ = new du();
    
    boolean ☃ = !t.o();
    for (amz ☃ : ☃) {
      if (☃ != null)
      {
        dn ☃ = new dn();
        
        ☃.a("Y", (byte)(☃.d() >> 4 & 0xFF));
        byte[] ☃ = new byte[☃.g().length];
        amw ☃ = new amw();
        amw ☃ = null;
        for (int ☃ = 0; ☃ < ☃.g().length; ☃++)
        {
          char ☃ = ☃.g()[☃];
          int ☃ = ☃ & 0xF;
          int ☃ = ☃ >> 8 & 0xF;
          int ☃ = ☃ >> 4 & 0xF;
          if (☃ >> '\f' != 0)
          {
            if (☃ == null) {
              ☃ = new amw();
            }
            ☃.a(☃, ☃, ☃, ☃ >> '\f');
          }
          ☃[☃] = ((byte)(☃ >> '\004' & 0xFF));
          ☃.a(☃, ☃, ☃, ☃ & 0xF);
        }
        ☃.a("Blocks", ☃);
        ☃.a("Data", ☃.a());
        if (☃ != null) {
          ☃.a("Add", ☃.a());
        }
        ☃.a("BlockLight", ☃.h().a());
        if (☃) {
          ☃.a("SkyLight", ☃.i().a());
        } else {
          ☃.a("SkyLight", new byte[☃.h().a().length]);
        }
        ☃.a(☃);
      }
    }
    ☃.a("Sections", ☃);
    ☃.a("Biomes", ☃.k());
    
    ☃.g(false);
    du ☃ = new du();
    for (int ☃ = 0; ☃ < ☃.s().length; ☃++) {
      for (pk ☃ : ☃.s()[☃])
      {
        dn ☃ = new dn();
        if (☃.d(☃))
        {
          ☃.g(true);
          ☃.a(☃);
        }
      }
    }
    ☃.a("Entities", ☃);
    
    du ☃ = new du();
    for (akw ☃ : ☃.r().values())
    {
      dn ☃ = new dn();
      ☃.b(☃);
      ☃.a(☃);
    }
    ☃.a("TileEntities", ☃);
    
    List<adw> ☃ = ☃.a(☃, false);
    if (☃ != null)
    {
      long ☃ = ☃.K();
      
      du ☃ = new du();
      for (adw ☃ : ☃)
      {
        dn ☃ = new dn();
        jy ☃ = (jy)afh.c.c(☃.a());
        ☃.a("i", ☃ == null ? "" : ☃.toString());
        ☃.a("x", a.n());
        ☃.a("y", a.o());
        ☃.a("z", a.p());
        ☃.a("t", (int)(b - ☃));
        ☃.a("p", c);
        
        ☃.a(☃);
      }
      ☃.a("TileTicks", ☃);
    }
  }
  
  private amy a(adm ☃, dn ☃)
  {
    int ☃ = ☃.f("xPos");
    int ☃ = ☃.f("zPos");
    
    amy ☃ = new amy(☃, ☃, ☃);
    ☃.a(☃.l("HeightMap"));
    ☃.d(☃.n("TerrainPopulated"));
    ☃.e(☃.n("LightPopulated"));
    ☃.c(☃.g("InhabitedTime"));
    
    du ☃ = ☃.c("Sections", 10);
    int ☃ = 16;
    amz[] ☃ = new amz[☃];
    
    boolean ☃ = !t.o();
    for (int ☃ = 0; ☃ < ☃.c(); ☃++)
    {
      dn ☃ = ☃.b(☃);
      
      int ☃ = ☃.d("Y");
      amz ☃ = new amz(☃ << 4, ☃);
      byte[] ☃ = ☃.k("Blocks");
      amw ☃ = new amw(☃.k("Data"));
      amw ☃ = ☃.b("Add", 7) ? new amw(☃.k("Add")) : null;
      char[] ☃ = new char[☃.length];
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        int ☃ = ☃ & 0xF;
        int ☃ = ☃ >> 8 & 0xF;
        int ☃ = ☃ >> 4 & 0xF;
        int ☃ = ☃ != null ? ☃.a(☃, ☃, ☃) : 0;
        ☃[☃] = ((char)(☃ << 12 | (☃[☃] & 0xFF) << 4 | ☃.a(☃, ☃, ☃)));
      }
      ☃.a(☃);
      ☃.a(new amw(☃.k("BlockLight")));
      if (☃) {
        ☃.b(new amw(☃.k("SkyLight")));
      }
      ☃.e();
      
      ☃[☃] = ☃;
    }
    ☃.a(☃);
    if (☃.b("Biomes", 7)) {
      ☃.a(☃.k("Biomes"));
    }
    du ☃ = ☃.c("Entities", 10);
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        pk ☃ = pm.a(☃, ☃);
        ☃.g(true);
        if (☃ != null)
        {
          ☃.a(☃);
          
          pk ☃ = ☃;
          dn ☃ = ☃;
          while (☃.b("Riding", 10))
          {
            pk ☃ = pm.a(☃.m("Riding"), ☃);
            if (☃ != null)
            {
              ☃.a(☃);
              ☃.a(☃);
            }
            ☃ = ☃;
            ☃ = ☃.m("Riding");
          }
        }
      }
    }
    du ☃ = ☃.c("TileEntities", 10);
    if (☃ != null) {
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        akw ☃ = akw.c(☃);
        if (☃ != null) {
          ☃.a(☃);
        }
      }
    }
    if (☃.b("TileTicks", 9))
    {
      du ☃ = ☃.c("TileTicks", 10);
      if (☃ != null) {
        for (int ☃ = 0; ☃ < ☃.c(); ☃++)
        {
          dn ☃ = ☃.b(☃);
          afh ☃;
          afh ☃;
          if (☃.b("i", 8)) {
            ☃ = afh.b(☃.j("i"));
          } else {
            ☃ = afh.c(☃.f("i"));
          }
          ☃.b(new cj(☃.f("x"), ☃.f("y"), ☃.f("z")), ☃, ☃.f("t"), ☃.f("p"));
        }
      }
    }
    return ☃;
  }
}
