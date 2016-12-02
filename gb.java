import java.io.IOException;

public class gb
  implements ff<fj>
{
  private int a;
  
  public gb() {}
  
  public gb(int ☃)
  {
    a = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
  }
}
