import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.List;

public class go
  implements ff<fj>
{
  private int a;
  private int b;
  private go.a c;
  private boolean d;
  
  public go() {}
  
  public go(amy ☃, boolean ☃, int ☃)
  {
    a = a;
    b = b;
    d = ☃;
    
    c = a(☃, ☃, !pt.o(), ☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readInt();
    b = ☃.readInt();
    d = ☃.readBoolean();
    c = new go.a();
    c.b = ☃.readShort();
    c.a = ☃.a();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a);
    ☃.writeInt(b);
    ☃.writeBoolean(d);
    ☃.writeShort((short)(c.b & 0xFFFF));
    ☃.a(c.a);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public byte[] a()
  {
    return c.a;
  }
  
  protected static int a(int ☃, boolean ☃, boolean ☃)
  {
    int ☃ = ☃ * 2 * 16 * 16 * 16;
    int ☃ = ☃ * 16 * 16 * 16 / 2;
    int ☃ = ☃ ? ☃ * 16 * 16 * 16 / 2 : 0;
    int ☃ = ☃ ? 256 : 0;
    return ☃ + ☃ + ☃ + ☃;
  }
  
  public static go.a a(amy ☃, boolean ☃, boolean ☃, int ☃)
  {
    amz[] ☃ = ☃.h();
    go.a ☃ = new go.a();
    
    List<amz> ☃ = Lists.newArrayList();
    for (int ☃ = 0; ☃ < ☃.length; ☃++)
    {
      amz ☃ = ☃[☃];
      if ((☃ != null) && ((!☃) || (!☃.a())) && ((☃ & 1 << ☃) != 0))
      {
        b |= 1 << ☃;
        ☃.add(☃);
      }
    }
    a = new byte[a(Integer.bitCount(b), ☃, ☃)];
    int ☃ = 0;
    for (amz ☃ : ☃)
    {
      char[] ☃ = ☃.g();
      for (char ☃ : ☃)
      {
        a[(☃++)] = ((byte)(☃ & 0xFF));
        a[(☃++)] = ((byte)(☃ >> '\b' & 0xFF));
      }
    }
    for (amz ☃ : ☃) {
      ☃ = a(☃.h().a(), a, ☃);
    }
    if (☃) {
      for (amz ☃ : ☃) {
        ☃ = a(☃.i().a(), a, ☃);
      }
    }
    if (☃) {
      a(☃.k(), a, ☃);
    }
    return ☃;
  }
  
  private static int a(byte[] ☃, byte[] ☃, int ☃)
  {
    System.arraycopy(☃, 0, ☃, ☃, ☃.length);
    return ☃ + ☃.length;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return b;
  }
  
  public int d()
  {
    return c.b;
  }
  
  public boolean e()
  {
    return d;
  }
  
  public static class a
  {
    public byte[] a;
    public int b;
  }
}
