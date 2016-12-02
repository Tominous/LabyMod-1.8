import com.google.common.collect.ImmutableSet;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Set;

public class bna
  implements bnk
{
  public static final Set<String> a = ImmutableSet.of("minecraft", "realms");
  private final Map<String, File> b;
  
  public bna(Map<String, File> ☃)
  {
    b = ☃;
  }
  
  public InputStream a(jy ☃)
    throws IOException
  {
    InputStream ☃ = d(☃);
    if (☃ != null) {
      return ☃;
    }
    InputStream ☃ = c(☃);
    if (☃ != null) {
      return ☃;
    }
    throw new FileNotFoundException(☃.a());
  }
  
  public InputStream c(jy ☃)
    throws FileNotFoundException
  {
    File ☃ = (File)b.get(☃.toString());
    
    return (☃ == null) || (!☃.isFile()) ? null : new FileInputStream(☃);
  }
  
  private InputStream d(jy ☃)
  {
    return bna.class.getResourceAsStream("/assets/" + ☃.b() + "/" + ☃.a());
  }
  
  public boolean b(jy ☃)
  {
    return (d(☃) != null) || (b.containsKey(☃.toString()));
  }
  
  public Set<String> c()
  {
    return a;
  }
  
  public <T extends bnw> T a(bny ☃, String ☃)
    throws IOException
  {
    try
    {
      InputStream ☃ = new FileInputStream((File)b.get("pack.mcmeta"));
      return bmx.a(☃, ☃, ☃);
    }
    catch (RuntimeException ☃)
    {
      return null;
    }
    catch (FileNotFoundException ☃) {}
    return null;
  }
  
  public BufferedImage a()
    throws IOException
  {
    return bml.a(bna.class.getResourceAsStream("/" + new jy("pack.png").a()));
  }
  
  public String b()
  {
    return "Default";
  }
}
