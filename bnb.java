import com.google.common.collect.Lists;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bnb
  implements bni
{
  private static final Logger b = ;
  protected final List<bnk> a = Lists.newArrayList();
  private final bny c;
  
  public bnb(bny ☃)
  {
    c = ☃;
  }
  
  public void a(bnk ☃)
  {
    a.add(☃);
  }
  
  public Set<String> a()
  {
    return null;
  }
  
  public bnh a(jy ☃)
    throws IOException
  {
    bnk ☃ = null;
    jy ☃ = c(☃);
    for (int ☃ = a.size() - 1; ☃ >= 0; ☃--)
    {
      bnk ☃ = (bnk)a.get(☃);
      if ((☃ == null) && (☃.b(☃))) {
        ☃ = ☃;
      }
      if (☃.b(☃))
      {
        InputStream ☃ = null;
        if (☃ != null) {
          ☃ = a(☃, ☃);
        }
        return new bno(☃.b(), ☃, a(☃, ☃), ☃, c);
      }
    }
    throw new FileNotFoundException(☃.toString());
  }
  
  protected InputStream a(jy ☃, bnk ☃)
    throws IOException
  {
    InputStream ☃ = ☃.a(☃);
    return b.isDebugEnabled() ? new bnb.a(☃, ☃, ☃.b()) : ☃;
  }
  
  static class a
    extends InputStream
  {
    private final InputStream a;
    private final String b;
    private boolean c = false;
    
    public a(InputStream ☃, jy ☃, String ☃)
    {
      a = ☃;
      ByteArrayOutputStream ☃ = new ByteArrayOutputStream();
      new Exception().printStackTrace(new PrintStream(☃));
      b = ("Leaked resource: '" + ☃ + "' loaded from pack: '" + ☃ + "'\n" + ☃.toString());
    }
    
    public void close()
      throws IOException
    {
      a.close();
      
      c = true;
    }
    
    protected void finalize()
      throws Throwable
    {
      if (!c) {
        bnb.b().warn(b);
      }
      super.finalize();
    }
    
    public int read()
      throws IOException
    {
      return a.read();
    }
  }
  
  public List<bnh> b(jy ☃)
    throws IOException
  {
    List<bnh> ☃ = Lists.newArrayList();
    jy ☃ = c(☃);
    for (bnk ☃ : a) {
      if (☃.b(☃))
      {
        InputStream ☃ = ☃.b(☃) ? a(☃, ☃) : null;
        ☃.add(new bno(☃.b(), ☃, a(☃, ☃), ☃, c));
      }
    }
    if (☃.isEmpty()) {
      throw new FileNotFoundException(☃.toString());
    }
    return ☃;
  }
  
  static jy c(jy ☃)
  {
    return new jy(☃.b(), ☃.a() + ".mcmeta");
  }
}
