import java.io.IOException;
import java.util.List;

public class gp
  implements ff<fj>
{
  private int[] a;
  private int[] b;
  private go.a[] c;
  private boolean d;
  
  public gp() {}
  
  public gp(List<amy> ☃)
  {
    int ☃ = ☃.size();
    
    a = new int[☃];
    b = new int[☃];
    c = new go.a[☃];
    d = (!get0pt.o());
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      amy ☃ = (amy)☃.get(☃);
      go.a ☃ = go.a(☃, true, d, 65535);
      
      a[☃] = a;
      b[☃] = b;
      c[☃] = ☃;
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    d = ☃.readBoolean();
    
    int ☃ = ☃.e();
    a = new int[☃];
    b = new int[☃];
    c = new go.a[☃];
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      a[☃] = ☃.readInt();
      b[☃] = ☃.readInt();
      c[☃] = new go.a();
      c[☃].b = (☃.readShort() & 0xFFFF);
      c[☃].a = new byte[go.a(Integer.bitCount(c[☃].b), d, true)];
    }
    for (int ☃ = 0; ☃ < ☃; ☃++) {
      ☃.readBytes(c[☃].a);
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeBoolean(d);
    ☃.b(c.length);
    for (int ☃ = 0; ☃ < a.length; ☃++)
    {
      ☃.writeInt(a[☃]);
      ☃.writeInt(b[☃]);
      ☃.writeShort((short)(c[☃].b & 0xFFFF));
    }
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      ☃.writeBytes(c[☃].a);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a(int ☃)
  {
    return a[☃];
  }
  
  public int b(int ☃)
  {
    return b[☃];
  }
  
  public int a()
  {
    return a.length;
  }
  
  public byte[] c(int ☃)
  {
    return c[☃].a;
  }
  
  public int d(int ☃)
  {
    return c[☃].b;
  }
}
