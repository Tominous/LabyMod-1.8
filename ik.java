import java.io.IOException;

public class ik
  implements ff<ic>
{
  private int a;
  private int b;
  private int c;
  private short d;
  private zx e;
  private int f;
  
  public ik() {}
  
  public ik(int ☃, int ☃, int ☃, int ☃, zx ☃, short ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    e = (☃ != null ? ☃.k() : null);
    d = ☃;
    f = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
    b = ☃.readShort();
    c = ☃.readByte();
    d = ☃.readShort();
    f = ☃.readByte();
    
    e = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b);
    ☃.writeByte(c);
    ☃.writeShort(d);
    ☃.writeByte(f);
    
    ☃.a(e);
  }
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
  
  public short d()
  {
    return d;
  }
  
  public zx e()
  {
    return e;
  }
  
  public int f()
  {
    return f;
  }
}
