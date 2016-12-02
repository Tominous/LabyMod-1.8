import java.io.IOException;

public class hz
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private byte e;
  private byte f;
  private boolean g;
  
  public hz() {}
  
  public hz(pk ☃)
  {
    a = ☃.F();
    b = ns.c(s * 32.0D);
    c = ns.c(t * 32.0D);
    d = ns.c(u * 32.0D);
    e = ((byte)(int)(y * 256.0F / 360.0F));
    f = ((byte)(int)(z * 256.0F / 360.0F));
    g = C;
  }
  
  public hz(int ☃, int ☃, int ☃, int ☃, byte ☃, byte ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.readInt();
    c = ☃.readInt();
    d = ☃.readInt();
    e = ☃.readByte();
    f = ☃.readByte();
    g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeInt(b);
    ☃.writeInt(c);
    ☃.writeInt(d);
    ☃.writeByte(e);
    ☃.writeByte(f);
    ☃.writeBoolean(g);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
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
  
  public int d()
  {
    return d;
  }
  
  public byte e()
  {
    return e;
  }
  
  public byte f()
  {
    return f;
  }
  
  public boolean g()
  {
    return g;
  }
}
