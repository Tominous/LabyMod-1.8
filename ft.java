import java.io.IOException;

public class ft
  implements ff<fj>
{
  private cj a;
  private int b;
  private dn c;
  
  public ft() {}
  
  public ft(cj ☃, int ☃, dn ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c();
    b = ☃.readUnsignedByte();
    c = ☃.h();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte((byte)b);
    ☃.a(c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public dn c()
  {
    return c;
  }
}
