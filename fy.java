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
    a = ☃;
    b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.d();
    b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public eu a()
  {
    return a;
  }
  
  public boolean b()
  {
    return (b == 1) || (b == 2);
  }
  
  public byte c()
  {
    return b;
  }
}
