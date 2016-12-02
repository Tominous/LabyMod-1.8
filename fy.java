import java.io.IOException;

public class fy
  implements ff<fj>
{
  private eu a;
  private byte b;
  
  public fy() {}
  
  public fy(eu ☃)
  {
    this(☃, (byte)1);
  }
  
  public fy(eu ☃, byte ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.d();
    this.b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte(this.b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public eu a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return (this.b == 1) || (this.b == 2);
  }
  
  public byte c()
  {
    return this.b;
  }
}
