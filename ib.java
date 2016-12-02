import java.io.IOException;

public class ib
  implements ff<fj>
{
  private int a;
  private byte b;
  private byte c;
  private int d;
  private byte e;
  
  public ib() {}
  
  public ib(int ☃, pf ☃)
  {
    a = ☃;
    b = ((byte)(☃.a() & 0xFF));
    c = ((byte)(☃.c() & 0xFF));
    if (☃.b() > 32767) {
      d = 32767;
    } else {
      d = ☃.b();
    }
    e = ((byte)(☃.f() ? 1 : 0));
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.readByte();
    c = ☃.readByte();
    d = ☃.e();
    e = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeByte(b);
    ☃.writeByte(c);
    ☃.b(d);
    ☃.writeByte(e);
  }
  
  public boolean a()
  {
    return d == 32767;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int b()
  {
    return a;
  }
  
  public byte c()
  {
    return b;
  }
  
  public byte d()
  {
    return c;
  }
  
  public int e()
  {
    return d;
  }
  
  public boolean f()
  {
    return e != 0;
  }
}
