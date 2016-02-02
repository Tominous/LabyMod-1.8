import com.google.common.collect.Lists;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class atk
  extends atn
{
  private static final Logger b = ;
  
  public atk(File ☃)
  {
    super(☃);
  }
  
  public String a()
  {
    return "Anvil";
  }
  
  public List<ats> b()
    throws atq
  {
    if ((this.a == null) || (!this.a.exists()) || (!this.a.isDirectory())) {
      throw new atq("Unable to read or access folder where game worlds are saved!");
    }
    List<ats> ☃ = Lists.newArrayList();
    
    File[] ☃ = this.a.listFiles();
    for (File ☃ : ☃) {
      if (☃.isDirectory())
      {
        String ☃ = ☃.getName();
        
        ato ☃ = c(☃);
        if ((☃ != null) && ((☃.l() == 19132) || (☃.l() == 19133)))
        {
          boolean ☃ = ☃.l() != c();
          String ☃ = ☃.k();
          if (StringUtils.isEmpty(☃)) {
            ☃ = ☃;
          }
          long ☃ = 0L;
          ☃.add(new ats(☃, ☃, ☃.m(), ☃, ☃.r(), ☃, ☃.t(), ☃.v()));
        }
      }
    }
    return ☃;
  }
  
  protected int c()
  {
    return 19133;
  }
  
  public void d() {}
  
  public atp a(String ☃, boolean ☃)
  {
    return new atj(this.a, ☃, ☃);
  }
  
  public boolean a(String ☃)
  {
    ato ☃ = c(☃);
    if ((☃ == null) || (☃.l() != 19132)) {
      return false;
    }
    return true;
  }
  
  public boolean b(String ☃)
  {
    ato ☃ = c(☃);
    if ((☃ == null) || (☃.l() == c())) {
      return false;
    }
    return true;
  }
  
  public boolean a(String ☃, nu ☃)
  {
    ☃.a(0);
    
    List<File> ☃ = Lists.newArrayList();
    List<File> ☃ = Lists.newArrayList();
    List<File> ☃ = Lists.newArrayList();
    File ☃ = new File(this.a, ☃);
    File ☃ = new File(☃, "DIM-1");
    File ☃ = new File(☃, "DIM1");
    
    b.info("Scanning folders...");
    
    a(☃, ☃);
    if (☃.exists()) {
      a(☃, ☃);
    }
    if (☃.exists()) {
      a(☃, ☃);
    }
    int ☃ = ☃.size() + ☃.size() + ☃.size();
    b.info("Total conversion count is " + ☃);
    
    ato ☃ = c(☃);
    
    aec ☃ = null;
    if (☃.u() == adr.c) {
      ☃ = new aef(ady.q, 0.5F);
    } else {
      ☃ = new aec(☃.b(), ☃.u(), ☃.B());
    }
    a(new File(☃, "region"), ☃, ☃, 0, ☃, ☃);
    
    a(new File(☃, "region"), ☃, new aef(ady.x, 0.0F), ☃.size(), ☃, ☃);
    
    a(new File(☃, "region"), ☃, new aef(ady.y, 0.0F), ☃.size() + ☃.size(), ☃, ☃);
    
    ☃.e(19133);
    if (☃.u() == adr.h) {
      ☃.a(adr.b);
    }
    g(☃);
    
    atp ☃ = a(☃, false);
    ☃.a(☃);
    
    return true;
  }
  
  private void g(String ☃)
  {
    File ☃ = new File(this.a, ☃);
    if (!☃.exists())
    {
      b.warn("Unable to create level.dat_mcr backup");
      return;
    }
    File ☃ = new File(☃, "level.dat");
    if (!☃.exists())
    {
      b.warn("Unable to create level.dat_mcr backup");
      return;
    }
    File ☃ = new File(☃, "level.dat_mcr");
    if (!☃.renameTo(☃)) {
      b.warn("Unable to create level.dat_mcr backup");
    }
  }
  
  private void a(File ☃, Iterable<File> ☃, aec ☃, int ☃, int ☃, nu ☃)
  {
    for (File ☃ : ☃)
    {
      a(☃, ☃, ☃, ☃, ☃, ☃);
      
      ☃++;
      int ☃ = (int)Math.round(100.0D * ☃ / ☃);
      ☃.a(☃);
    }
  }
  
  private void a(File ☃, File ☃, aec ☃, int ☃, int ☃, nu ☃)
  {
    try
    {
      String ☃ = ☃.getName();
      
      anh ☃ = new anh(☃);
      anh ☃ = new anh(new File(☃, ☃.substring(0, ☃.length() - ".mcr".length()) + ".mca"));
      for (int ☃ = 0; ☃ < 32; ☃++)
      {
        for (int ☃ = 0; ☃ < 32; ☃++) {
          if ((☃.c(☃, ☃)) && (!☃.c(☃, ☃)))
          {
            DataInputStream ☃ = ☃.a(☃, ☃);
            if (☃ == null)
            {
              b.warn("Failed to fetch input stream");
            }
            else
            {
              dn ☃ = dx.a(☃);
              ☃.close();
              
              dn ☃ = ☃.m("Level");
              ang.a ☃ = ang.a(☃);
              
              dn ☃ = new dn();
              dn ☃ = new dn();
              ☃.a("Level", ☃);
              ang.a(☃, ☃, ☃);
              
              DataOutputStream ☃ = ☃.b(☃, ☃);
              dx.a(☃, ☃);
              ☃.close();
            }
          }
        }
        int ☃ = (int)Math.round(100.0D * (☃ * 1024) / (☃ * 1024));
        int ☃ = (int)Math.round(100.0D * ((☃ + 1) * 32 + ☃ * 1024) / (☃ * 1024));
        if (☃ > ☃) {
          ☃.a(☃);
        }
      }
      ☃.c();
      ☃.c();
    }
    catch (IOException ☃)
    {
      ☃.printStackTrace();
    }
  }
  
  private void a(File ☃, Collection<File> ☃)
  {
    File ☃ = new File(☃, "region");
    File[] ☃ = ☃.listFiles(new FilenameFilter()
    {
      public boolean accept(File ☃, String ☃)
      {
        return ☃.endsWith(".mcr");
      }
    });
    if (☃ != null) {
      Collections.addAll(☃, ☃);
    }
  }
}
