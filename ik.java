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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.e = (☃ != null ? ☃.k() : null);
    this.d = ☃;
    this.f = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readByte();
    this.b = ☃.readShort();
    this.c = ☃.readByte();
    this.d = ☃.readShort();
    this.f = ☃.readByte();
    
    this.e = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.a);
    ☃.writeShort(this.b);
    ☃.writeByte(this.c);
    ☃.writeShort(this.d);
    ☃.writeByte(this.f);
    
    ☃.a(this.e);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public short d()
  {
    return this.d;
  }
  
  public zx e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
}
