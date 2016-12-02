import com.google.common.collect.Lists;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class adz
{
  private final aec a;
  private long b;
  
  public class a
  {
    public float[] a = new float['Ā'];
    public ady[] b = new ady['Ā'];
    public int c;
    public int d;
    public long e;
    
    public a(int ☃, int ☃)
    {
      c = ☃;
      d = ☃;
      adz.a(adz.this).a(a, ☃ << 4, ☃ << 4, 16, 16);
      adz.a(adz.this).a(b, ☃ << 4, ☃ << 4, 16, 16, false);
    }
    
    public ady a(int ☃, int ☃)
    {
      return b[(☃ & 0xF | (☃ & 0xF) << 4)];
    }
  }
  
  private nq<adz.a> c = new nq();
  private List<adz.a> d = Lists.newArrayList();
  
  public adz(aec ☃)
  {
    a = ☃;
  }
  
  public adz.a a(int ☃, int ☃)
  {
    ☃ >>= 4;
    ☃ >>= 4;
    long ☃ = ☃ & 0xFFFFFFFF | (☃ & 0xFFFFFFFF) << 32;
    adz.a ☃ = (adz.a)c.a(☃);
    if (☃ == null)
    {
      ☃ = new adz.a(☃, ☃);
      c.a(☃, ☃);
      d.add(☃);
    }
    e = MinecraftServer.az();
    return ☃;
  }
  
  public ady a(int ☃, int ☃, ady ☃)
  {
    ady ☃ = a(☃, ☃).a(☃, ☃);
    if (☃ == null) {
      return ☃;
    }
    return ☃;
  }
  
  public void a()
  {
    long ☃ = MinecraftServer.az();
    long ☃ = ☃ - b;
    if ((☃ > 7500L) || (☃ < 0L))
    {
      b = ☃;
      for (int ☃ = 0; ☃ < d.size(); ☃++)
      {
        adz.a ☃ = (adz.a)d.get(☃);
        long ☃ = ☃ - e;
        if ((☃ > 30000L) || (☃ < 0L))
        {
          d.remove(☃--);
          long ☃ = c & 0xFFFFFFFF | (d & 0xFFFFFFFF) << 32;
          c.d(☃);
        }
      }
    }
  }
  
  public ady[] c(int ☃, int ☃)
  {
    return ab;
  }
}
