import java.io.IOException;

public class ge
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  
  public ge() {}
  
  public ge(int ☃, int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readUnsignedByte();
    b = ☃.readShort();
    c = ☃.readShort();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b);
    ☃.writeShort(c);
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
}
