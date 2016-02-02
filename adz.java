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
      this.c = ☃;
      this.d = ☃;
      adz.a(adz.this).a(this.a, ☃ << 4, ☃ << 4, 16, 16);
      adz.a(adz.this).a(this.b, ☃ << 4, ☃ << 4, 16, 16, false);
    }
    
    public ady a(int ☃, int ☃)
    {
      return this.b[(☃ & 0xF | (☃ & 0xF) << 4)];
    }
  }
  
  private nq<adz.a> c = new nq();
  private List<adz.a> d = Lists.newArrayList();
  
  public adz(aec ☃)
  {
    this.a = ☃;
  }
  
  public adz.a a(int ☃, int ☃)
  {
    ☃ >>= 4;
    ☃ >>= 4;
    long ☃ = ☃ & 0xFFFFFFFF | (☃ & 0xFFFFFFFF) << 32;
    adz.a ☃ = (adz.a)this.c.a(☃);
    if (☃ == null)
    {
      ☃ = new adz.a(☃, ☃);
      this.c.a(☃, ☃);
      this.d.add(☃);
    }
    ☃.e = MinecraftServer.az();
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
    long ☃ = ☃ - this.b;
    if ((☃ > 7500L) || (☃ < 0L))
    {
      this.b = ☃;
      for (int ☃ = 0; ☃ < this.d.size(); ☃++)
      {
        adz.a ☃ = (adz.a)this.d.get(☃);
        long ☃ = ☃ - ☃.e;
        if ((☃ > 30000L) || (☃ < 0L))
        {
          this.d.remove(☃--);
          long ☃ = ☃.c & 0xFFFFFFFF | (☃.d & 0xFFFFFFFF) << 32;
          this.c.d(☃);
        }
      }
    }
  }
  
  public ady[] c(int ☃, int ☃)
  {
    return a(☃, ☃).b;
  }
}
