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
    this.a = ☃;
    this.c = ☃;
    this.b = ☃;
  }
  
  public void a(blq ☃)
  {
    this.d += 1;
    bqs.b(☃.h(), this.c);
  }
  
  public void b(blq ☃)
  {
    this.d -= 1;
    if (this.d <= 0)
    {
      bqs.a(this.c);
      this.a.d().remove(this.b);
    }
  }
  
  public String a()
  {
    return this.b;
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
      this.c = ☃;
      this.d = ☃;
      this.e = ☃;
    }
    
    public String a()
    {
      return this.c;
    }
    
    protected String b()
    {
      return this.d;
    }
    
    protected int c()
    {
      return this.e;
    }
    
    protected Map<String, blt> d()
    {
      return this.f;
    }
  }
}
