import com.google.common.collect.Lists;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class du
  extends eb
{
  private static final Logger b = ;
  private List<eb> c = Lists.newArrayList();
  private byte d = 0;
  
  void a(DataOutput ☃)
    throws IOException
  {
    if (!c.isEmpty()) {
      d = ((eb)c.get(0)).a();
    } else {
      d = 0;
    }
    ☃.writeByte(d);
    ☃.writeInt(c.size());
    for (int ☃ = 0; ☃ < c.size(); ☃++) {
      ((eb)c.get(☃)).a(☃);
    }
  }
  
  void a(DataInput ☃, int ☃, dw ☃)
    throws IOException
  {
    ☃.a(296L);
    if (☃ > 512) {
      throw new RuntimeException("Tried to read NBT tag with too high complexity, depth > 512");
    }
    d = ☃.readByte();
    int ☃ = ☃.readInt();
    if ((d == 0) && (☃ > 0)) {
      throw new RuntimeException("Missing type on ListTag");
    }
    ☃.a(32L * ☃);
    
    c = Lists.newArrayListWithCapacity(☃);
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      eb ☃ = eb.a(d);
      ☃.a(☃, ☃ + 1, ☃);
      c.add(☃);
    }
  }
  
  public byte a()
  {
    return 9;
  }
  
  public String toString()
  {
    StringBuilder ☃ = new StringBuilder("[");
    for (int ☃ = 0; ☃ < c.size(); ☃++)
    {
      if (☃ != 0) {
        ☃.append(',');
      }
      ☃.append(☃).append(':').append(c.get(☃));
    }
    return ']';
  }
  
  public void a(eb ☃)
  {
    if (☃.a() == 0)
    {
      b.warn("Invalid TagEnd added to ListTag");
      return;
    }
    if (d == 0)
    {
      d = ☃.a();
    }
    else if (d != ☃.a())
    {
      b.warn("Adding mismatching tag types to tag list");
      return;
    }
    c.add(☃);
  }
  
  public void a(int ☃, eb ☃)
  {
    if (☃.a() == 0)
    {
      b.warn("Invalid TagEnd added to ListTag");
      return;
    }
    if ((☃ < 0) || (☃ >= c.size()))
    {
      b.warn("index out of bounds to set tag in tag list");
      return;
    }
    if (d == 0)
    {
      d = ☃.a();
    }
    else if (d != ☃.a())
    {
      b.warn("Adding mismatching tag types to tag list");
      return;
    }
    c.set(☃, ☃);
  }
  
  public eb a(int ☃)
  {
    return (eb)c.remove(☃);
  }
  
  public boolean c_()
  {
    return c.isEmpty();
  }
  
  public dn b(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return new dn();
    }
    eb ☃ = (eb)c.get(☃);
    if (☃.a() == 10) {
      return (dn)☃;
    }
    return new dn();
  }
  
  public int[] c(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return new int[0];
    }
    eb ☃ = (eb)c.get(☃);
    if (☃.a() == 11) {
      return ((ds)☃).c();
    }
    return new int[0];
  }
  
  public double d(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return 0.0D;
    }
    eb ☃ = (eb)c.get(☃);
    if (☃.a() == 6) {
      return ((dp)☃).g();
    }
    return 0.0D;
  }
  
  public float e(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return 0.0F;
    }
    eb ☃ = (eb)c.get(☃);
    if (☃.a() == 5) {
      return ((dr)☃).h();
    }
    return 0.0F;
  }
  
  public String f(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return "";
    }
    eb ☃ = (eb)c.get(☃);
    if (☃.a() == 8) {
      return ☃.a_();
    }
    return ☃.toString();
  }
  
  public eb g(int ☃)
  {
    if ((☃ < 0) || (☃ >= c.size())) {
      return new dq();
    }
    return (eb)c.get(☃);
  }
  
  public int c()
  {
    return c.size();
  }
  
  public eb b()
  {
    du ☃ = new du();
    d = d;
    for (eb ☃ : c)
    {
      eb ☃ = ☃.b();
      c.add(☃);
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (super.equals(☃))
    {
      du ☃ = (du)☃;
      if (d == d) {
        return c.equals(c);
      }
    }
    return false;
  }
  
  public int hashCode()
  {
    return super.hashCode() ^ c.hashCode();
  }
  
  public int f()
  {
    return d;
  }
}
