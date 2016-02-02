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
    this.a = ☃;
    this.b = ((byte)(☃.a() & 0xFF));
    this.c = ((byte)(☃.c() & 0xFF));
    if (☃.b() > 32767) {
      this.d = 32767;
    } else {
      this.d = ☃.b();
    }
    this.e = ((byte)(☃.f() ? 1 : 0));
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readByte();
    this.c = ☃.readByte();
    this.d = ☃.e();
    this.e = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.b);
    ☃.writeByte(this.c);
    ☃.b(this.d);
    ☃.writeByte(this.e);
  }
  
  public boolean a()
  {
    return this.d == 32767;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int b()
  {
    return this.a;
  }
  
  public byte c()
  {
    return this.b;
  }
  
  public byte d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public boolean f()
  {
    return this.e != 0;
  }
}
