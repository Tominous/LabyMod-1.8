import java.io.IOException;

public class fs
  implements ff<fj>
{
  private int a;
  private cj b;
  private int c;
  
  public fs() {}
  
  public fs(int ☃, cj ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.c();
    c = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.a(b);
    ☃.writeByte(c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return a;
  }
  
  public cj b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
}
