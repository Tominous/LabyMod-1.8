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
    this.a = ☃.a;
    this.b = ☃.b;
    this.d = ☃;
    
    this.c = a(☃, ☃, !☃.p().t.o(), ☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readInt();
    this.b = ☃.readInt();
    this.d = ☃.readBoolean();
    this.c = new go.a();
    this.c.b = ☃.readShort();
    this.c.a = ☃.a();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.a);
    ☃.writeInt(this.b);
    ☃.writeBoolean(this.d);
    ☃.writeShort((short)(this.c.b & 0xFFFF));
    ☃.a(this.c.a);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public byte[] a()
  {
    return this.c.a;
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
        ☃.b |= 1 << ☃;
        ☃.add(☃);
      }
    }
    ☃.a = new byte[a(Integer.bitCount(☃.b), ☃, ☃)];
    int ☃ = 0;
    for (amz ☃ : ☃)
    {
      char[] ☃ = ☃.g();
      for (char ☃ : ☃)
      {
        ☃.a[(☃++)] = ((byte)(☃ & 0xFF));
        ☃.a[(☃++)] = ((byte)(☃ >> '\b' & 0xFF));
      }
    }
    for (amz ☃ : ☃) {
      ☃ = a(☃.h().a(), ☃.a, ☃);
    }
    if (☃) {
      for (amz ☃ : ☃) {
        ☃ = a(☃.i().a(), ☃.a, ☃);
      }
    }
    if (☃) {
      a(☃.k(), ☃.a, ☃);
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
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c.b;
  }
  
  public boolean e()
  {
    return this.d;
  }
  
  public static class a
  {
    public byte[] a;
    public int b;
  }
}
