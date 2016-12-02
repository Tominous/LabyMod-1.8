import com.google.common.collect.Maps;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Map;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.lwjgl.BufferUtils;

public class blt
{
  private final blt.a a;
  private final String b;
  private int c;
  private int d = 0;
  
  private blt(blt.a ☃, int ☃, String ☃)
  {
    a = ☃;
    c = ☃;
    b = ☃;
  }
  
  public void a(blq ☃)
  {
    d += 1;
    bqs.b(☃.h(), c);
  }
  
  public void b(blq ☃)
  {
    d -= 1;
    if (d <= 0)
    {
      bqs.a(c);
      a.d().remove(b);
    }
  }
  
  public String a()
  {
    return b;
  }
  
  public static blt a(bni ☃, blt.a ☃, String ☃)
    throws IOException
  {
    blt ☃ = (blt)☃.d().get(☃);
    if (☃ == null)
    {
      jy ☃ = new jy("shaders/program/" + ☃ + ☃.b());
      BufferedInputStream ☃ = new BufferedInputStream(☃.a(☃).b());
      byte[] ☃ = a(☃);
      ByteBuffer ☃ = BufferUtils.createByteBuffer(☃.length);
      ☃.put(☃);
      ☃.position(0);
      
      int ☃ = bqs.b(☃.c());
      bqs.a(☃, ☃);
      bqs.c(☃);
      if (bqs.c(☃, bqs.n) == 0)
      {
        String ☃ = StringUtils.trim(bqs.d(☃, 32768));
        kc ☃ = new kc("Couldn't compile " + ☃.a() + " program: " + ☃);
        ☃.b(☃.a());
        throw ☃;
      }
      ☃ = new blt(☃, ☃, ☃);
      ☃.d().put(☃, ☃);
    }
    return ☃;
  }
  
  protected static byte[] a(BufferedInputStream ☃)
    throws IOException
  {
    try
    {
      return IOUtils.toByteArray(☃);
    }
    finally
    {
      ☃.close();
    }
  }
  
  public static enum a
  {
    private final String c;
    private final String d;
    private final int e;
    private final Map<String, blt> f = Maps.newHashMap();
    
    private a(String ☃, String ☃, int ☃)
    {
      c = ☃;
      d = ☃;
      e = ☃;
    }
    
    public String a()
    {
      return c;
    }
    
    protected String b()
    {
      return d;
    }
    
    protected int c()
    {
      return e;
    }
    
    protected Map<String, blt> d()
    {
      return f;
    }
  }
}
