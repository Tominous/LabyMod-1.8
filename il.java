import java.io.IOException;

public class il
  implements ff<ic>
{
  private int a;
  
  public il() {}
  
  public il(int ☃)
  {
    a = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
  }
}
