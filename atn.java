import com.google.common.collect.Lists;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class atn
  implements atr
{
  private static final Logger b = ;
  protected final File a;
  
  public atn(File ☃)
  {
    if (!☃.exists()) {
      ☃.mkdirs();
    }
    this.a = ☃;
  }
  
  public String a()
  {
    return "Old Format";
  }
  
  public List<ats> b()
    throws atq
  {
    List<ats> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < 5; ☃++)
    {
      String ☃ = "World" + (☃ + 1);
      
      ato ☃ = c(☃);
      if (☃ != null) {
        ☃.add(new ats(☃, "", ☃.m(), ☃.h(), ☃.r(), false, ☃.t(), ☃.v()));
      }
    }
    return ☃;
  }
  
  public void d() {}
  
  public ato c(String ☃)
  {
    File ☃ = new File(this.a, ☃);
    if (!☃.exists()) {
      return null;
    }
    File ☃ = new File(☃, "level.dat");
    if (☃.exists()) {
      try
      {
        dn ☃ = dx.a(new FileInputStream(☃));
        dn ☃ = ☃.m("Data");
        return new ato(☃);
      }
      catch (Exception ☃)
      {
        b.error("Exception reading " + ☃, ☃);
      }
    }
    ☃ = new File(☃, "level.dat_old");
    if (☃.exists()) {
      try
      {
        dn ☃ = dx.a(new FileInputStream(☃));
        dn ☃ = ☃.m("Data");
        return new ato(☃);
      }
      catch (Exception ☃)
      {
        b.error("Exception reading " + ☃, ☃);
      }
    }
    return null;
  }
  
  public void a(String ☃, String ☃)
  {
    File ☃ = new File(this.a, ☃);
    if (!☃.exists()) {
      return;
    }
    File ☃ = new File(☃, "level.dat");
    if (☃.exists()) {
      try
      {
        dn ☃ = dx.a(new FileInputStream(☃));
        dn ☃ = ☃.m("Data");
        ☃.a("LevelName", ☃);
        
        dx.a(☃, new FileOutputStream(☃));
      }
      catch (Exception ☃)
      {
        ☃.printStackTrace();
      }
    }
  }
  
  public boolean d(String ☃)
  {
    File ☃ = new File(this.a, ☃);
    if (☃.exists()) {
      return false;
    }
    try
    {
      ☃.mkdir();
      ☃.delete();
    }
    catch (Throwable ☃)
    {
      b.warn("Couldn't make new level", ☃);
      return false;
    }
    return true;
  }
  
  public boolean e(String ☃)
  {
    File ☃ = new File(this.a, ☃);
    if (!☃.exists()) {
      return true;
    }
    b.info("Deleting level " + ☃);
    for (int ☃ = 1; ☃ <= 5; ☃++)
    {
      b.info("Attempt " + ☃ + "...");
      if (a(☃.listFiles())) {
        break;
      }
      b.warn("Unsuccessful in deleting contents.");
      if (☃ < 5) {
        try
        {
          Thread.sleep(500L);
        }
        catch (InterruptedException localInterruptedException) {}
      }
    }
    return ☃.delete();
  }
  
  protected static boolean a(File[] ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      File ☃ = ☃[☃];
      b.debug("Deleting " + ☃);
      if ((☃.isDirectory()) && 
        (!a(☃.listFiles())))
      {
        b.warn("Couldn't delete directory " + ☃);
        return false;
      }
      if (!☃.delete())
      {
        b.warn("Couldn't delete file " + ☃);
        return false;
      }
    }
    return true;
  }
  
  public atp a(String ☃, boolean ☃)
  {
    return new atm(this.a, ☃, ☃);
  }
  
  public boolean a(String ☃)
  {
    return false;
  }
  
  public boolean b(String ☃)
  {
    return false;
  }
  
  public boolean a(String ☃, nu ☃)
  {
    return false;
  }
  
  public boolean f(String ☃)
  {
    File ☃ = new File(this.a, ☃);
    return ☃.isDirectory();
  }
}
