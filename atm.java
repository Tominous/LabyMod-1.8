import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.UUID;
import net.minecraft.server.MinecraftServer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class atm
  implements atp, aty
{
  private static final Logger a = ;
  private final File b;
  private final File c;
  private final File d;
  private final long e = MinecraftServer.az();
  private final String f;
  
  public atm(File ☃, String ☃, boolean ☃)
  {
    b = new File(☃, ☃);
    b.mkdirs();
    c = new File(b, "playerdata");
    d = new File(b, "data");
    d.mkdirs();
    f = ☃;
    if (☃) {
      c.mkdirs();
    }
    h();
  }
  
  private void h()
  {
    try
    {
      File ☃ = new File(b, "session.lock");
      DataOutputStream ☃ = new DataOutputStream(new FileOutputStream(☃));
      try
      {
        ☃.writeLong(e);
      }
      finally
      {
        ☃.close();
      }
    }
    catch (IOException ☃)
    {
      ☃.printStackTrace();
      throw new RuntimeException("Failed to check session lock, aborting");
    }
  }
  
  public File b()
  {
    return b;
  }
  
  public void c()
    throws adn
  {
    try
    {
      File ☃ = new File(b, "session.lock");
      DataInputStream ☃ = new DataInputStream(new FileInputStream(☃));
      try
      {
        if (☃.readLong() != e) {
          throw new adn("The save is being accessed from another location, aborting");
        }
      }
      finally
      {
        ☃.close();
      }
    }
    catch (IOException ☃)
    {
      throw new adn("Failed to check session lock, aborting");
    }
  }
  
  public and a(anm ☃)
  {
    throw new RuntimeException("Old Chunk Storage is no longer supported.");
  }
  
  public ato d()
  {
    File ☃ = new File(b, "level.dat");
    if (☃.exists()) {
      try
      {
        dn ☃ = dx.a(new FileInputStream(☃));
        dn ☃ = ☃.m("Data");
        
        return new ato(☃);
      }
      catch (Exception ☃)
      {
        ☃.printStackTrace();
      }
    }
    ☃ = new File(b, "level.dat_old");
    if (☃.exists()) {
      try
      {
        dn ☃ = dx.a(new FileInputStream(☃));
        dn ☃ = ☃.m("Data");
        
        return new ato(☃);
      }
      catch (Exception ☃)
      {
        ☃.printStackTrace();
      }
    }
    return null;
  }
  
  public void a(ato ☃, dn ☃)
  {
    dn ☃ = ☃.a(☃);
    
    dn ☃ = new dn();
    ☃.a("Data", ☃);
    try
    {
      File ☃ = new File(b, "level.dat_new");
      File ☃ = new File(b, "level.dat_old");
      File ☃ = new File(b, "level.dat");
      
      dx.a(☃, new FileOutputStream(☃));
      if (☃.exists()) {
        ☃.delete();
      }
      ☃.renameTo(☃);
      if (☃.exists()) {
        ☃.delete();
      }
      ☃.renameTo(☃);
      if (☃.exists()) {
        ☃.delete();
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  public void a(ato ☃)
  {
    dn ☃ = ☃.a();
    
    dn ☃ = new dn();
    ☃.a("Data", ☃);
    try
    {
      File ☃ = new File(b, "level.dat_new");
      File ☃ = new File(b, "level.dat_old");
      File ☃ = new File(b, "level.dat");
      
      dx.a(☃, new FileOutputStream(☃));
      if (☃.exists()) {
        ☃.delete();
      }
      ☃.renameTo(☃);
      if (☃.exists()) {
        ☃.delete();
      }
      ☃.renameTo(☃);
      if (☃.exists()) {
        ☃.delete();
      }
    }
    catch (Exception ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  public void a(wn ☃)
  {
    try
    {
      dn ☃ = new dn();
      ☃.e(☃);
      File ☃ = new File(c, ☃.aK().toString() + ".dat.tmp");
      File ☃ = new File(c, ☃.aK().toString() + ".dat");
      dx.a(☃, new FileOutputStream(☃));
      if (☃.exists()) {
        ☃.delete();
      }
      ☃.renameTo(☃);
    }
    catch (Exception ☃)
    {
      a.warn("Failed to save player data for " + ☃.e_());
    }
  }
  
  public dn b(wn ☃)
  {
    dn ☃ = null;
    try
    {
      File ☃ = new File(c, ☃.aK().toString() + ".dat");
      if ((☃.exists()) && (☃.isFile())) {
        ☃ = dx.a(new FileInputStream(☃));
      }
    }
    catch (Exception ☃)
    {
      a.warn("Failed to load player data for " + ☃.e_());
    }
    if (☃ != null) {
      ☃.f(☃);
    }
    return ☃;
  }
  
  public aty e()
  {
    return this;
  }
  
  public String[] f()
  {
    String[] ☃ = c.list();
    if (☃ == null) {
      ☃ = new String[0];
    }
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      if (☃[☃].endsWith(".dat")) {
        ☃[☃] = ☃[☃].substring(0, ☃[☃].length() - 4);
      }
    }
    return ☃;
  }
  
  public void a() {}
  
  public File a(String ☃)
  {
    return new File(d, ☃ + ".dat");
  }
  
  public String g()
  {
    return f;
  }
}
