import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.Callable;

public class c
{
  private final b a;
  private final String b;
  private final List<c.a> c = Lists.newArrayList();
  private StackTraceElement[] d = new StackTraceElement[0];
  
  public c(b ☃, String ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public static String a(double ☃, double ☃, double ☃)
  {
    return String.format("%.2f,%.2f,%.2f - %s", new Object[] { Double.valueOf(☃), Double.valueOf(☃), Double.valueOf(☃), a(new cj(☃, ☃, ☃)) });
  }
  
  public static String a(cj ☃)
  {
    int ☃ = ☃.n();
    int ☃ = ☃.o();
    int ☃ = ☃.p();
    StringBuilder ☃ = new StringBuilder();
    try
    {
      ☃.append(String.format("World: (%d,%d,%d)", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃) }));
    }
    catch (Throwable ☃)
    {
      ☃.append("(Error finding world loc)");
    }
    ☃.append(", ");
    try
    {
      int ☃ = ☃ >> 4;
      int ☃ = ☃ >> 4;
      int ☃ = ☃ & 0xF;
      int ☃ = ☃ >> 4;
      int ☃ = ☃ & 0xF;
      int ☃ = ☃ << 4;
      int ☃ = ☃ << 4;
      int ☃ = (☃ + 1 << 4) - 1;
      int ☃ = (☃ + 1 << 4) - 1;
      ☃.append(String.format("Chunk: (at %d,%d,%d in %d,%d; contains blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃) }));
    }
    catch (Throwable ☃)
    {
      ☃.append("(Error finding chunk loc)");
    }
    ☃.append(", ");
    try
    {
      int ☃ = ☃ >> 9;
      int ☃ = ☃ >> 9;
      int ☃ = ☃ << 5;
      int ☃ = ☃ << 5;
      int ☃ = (☃ + 1 << 5) - 1;
      int ☃ = (☃ + 1 << 5) - 1;
      int ☃ = ☃ << 9;
      int ☃ = ☃ << 9;
      int ☃ = (☃ + 1 << 9) - 1;
      int ☃ = (☃ + 1 << 9) - 1;
      ☃.append(String.format("Region: (%d,%d; contains chunks %d,%d to %d,%d, blocks %d,0,%d to %d,255,%d)", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃), Integer.valueOf(☃) }));
    }
    catch (Throwable ☃)
    {
      ☃.append("(Error finding world loc)");
    }
    return ☃.toString();
  }
  
  public void a(String ☃, Callable<String> ☃)
  {
    try
    {
      a(☃, ☃.call());
    }
    catch (Throwable ☃)
    {
      a(☃, ☃);
    }
  }
  
  public void a(String ☃, Object ☃)
  {
    c.add(new c.a(☃, ☃));
  }
  
  public void a(String ☃, Throwable ☃)
  {
    a(☃, ☃);
  }
  
  public int a(int ☃)
  {
    StackTraceElement[] ☃ = Thread.currentThread().getStackTrace();
    if (☃.length <= 0) {
      return 0;
    }
    d = new StackTraceElement[☃.length - 3 - ☃];
    System.arraycopy(☃, 3 + ☃, d, 0, d.length);
    return d.length;
  }
  
  public boolean a(StackTraceElement ☃, StackTraceElement ☃)
  {
    if ((d.length == 0) || (☃ == null)) {
      return false;
    }
    StackTraceElement ☃ = d[0];
    if ((☃.isNativeMethod() != ☃.isNativeMethod()) || (!☃.getClassName().equals(☃.getClassName())) || (!☃.getFileName().equals(☃.getFileName())) || (!☃.getMethodName().equals(☃.getMethodName()))) {
      return false;
    }
    if ((☃ != null ? 1 : 0) != (d.length > 1 ? 1 : 0)) {
      return false;
    }
    if ((☃ != null) && (!d[1].equals(☃))) {
      return false;
    }
    d[0] = ☃;
    
    return true;
  }
  
  public void b(int ☃)
  {
    StackTraceElement[] ☃ = new StackTraceElement[d.length - ☃];
    System.arraycopy(d, 0, ☃, 0, ☃.length);
    d = ☃;
  }
  
  public void a(StringBuilder ☃)
  {
    ☃.append("-- ").append(b).append(" --\n");
    ☃.append("Details:");
    for (c.a ☃ : c)
    {
      ☃.append("\n\t");
      ☃.append(☃.a());
      ☃.append(": ");
      ☃.append(☃.b());
    }
    if ((d != null) && (d.length > 0))
    {
      ☃.append("\nStacktrace:");
      for (StackTraceElement ☃ : d)
      {
        ☃.append("\n\tat ");
        ☃.append(☃.toString());
      }
    }
  }
  
  public StackTraceElement[] a()
  {
    return d;
  }
  
  public static void a(c ☃, cj ☃, final afh ☃, int ☃)
  {
    int ☃ = afh.a(☃);
    ☃.a("Block type", new Callable()
    {
      public String a()
        throws Exception
      {
        try
        {
          return String.format("ID #%d (%s // %s)", new Object[] { Integer.valueOf(a), ☃.a(), ☃.getClass().getCanonicalName() });
        }
        catch (Throwable ☃) {}
        return "ID #" + a;
      }
    });
    ☃.a("Block data value", new Callable()
    {
      public String a()
        throws Exception
      {
        if (a < 0) {
          return "Unknown? (Got " + a + ")";
        }
        String ☃ = String.format("%4s", new Object[] { Integer.toBinaryString(a) }).replace(" ", "0");
        
        return String.format("%1$d / 0x%1$X / 0b%2$s", new Object[] { Integer.valueOf(a), ☃ });
      }
    });
    ☃.a("Block location", new Callable()
    {
      public String a()
        throws Exception
      {
        return c.a(a);
      }
    });
  }
  
  public static void a(c ☃, cj ☃, alz ☃)
  {
    ☃.a("Block", new Callable()
    {
      public String a()
        throws Exception
      {
        return a.toString();
      }
    });
    ☃.a("Block location", new Callable()
    {
      public String a()
        throws Exception
      {
        return c.a(a);
      }
    });
  }
  
  static class a
  {
    private final String a;
    private final String b;
    
    public a(String ☃, Object ☃)
    {
      a = ☃;
      if (☃ == null)
      {
        b = "~~NULL~~";
      }
      else if ((☃ instanceof Throwable))
      {
        Throwable ☃ = (Throwable)☃;
        b = ("~~ERROR~~ " + ☃.getClass().getSimpleName() + ": " + ☃.getMessage());
      }
      else
      {
        b = ☃.toString();
      }
    }
    
    public String a()
    {
      return a;
    }
    
    public String b()
    {
      return b;
    }
  }
}
