import java.io.IOException;

public class ij
  implements ff<ic>
{
  private int a;
  private int b;
  
  public ij() {}
  
  public ij(int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
    b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeByte(b);
  }
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
}
