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
    this.a = ☃.F();
    this.b = ns.c(☃.s * 32.0D);
    this.c = ns.c(☃.t * 32.0D);
    this.d = ns.c(☃.u * 32.0D);
    this.e = ((byte)(int)(☃.y * 256.0F / 360.0F));
    this.f = ((byte)(int)(☃.z * 256.0F / 360.0F));
    this.g = ☃.C;
  }
  
  public hz(int ☃, int ☃, int ☃, int ☃, byte ☃, byte ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.e = ☃.readByte();
    this.f = ☃.readByte();
    this.g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeByte(this.e);
    ☃.writeByte(this.f);
    ☃.writeBoolean(this.g);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
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
  
  public int d()
  {
    return this.d;
  }
  
  public byte e()
  {
    return this.e;
  }
  
  public byte f()
  {
    return this.f;
  }
  
  public boolean g()
  {
    return this.g;
  }
}
