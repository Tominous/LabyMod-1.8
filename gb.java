import java.io.IOException;

public class gb
  implements ff<fj>
{
  private int a;
  
  public gb() {}
  
  public gb(int ☃)
  {
    this.a = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.a);
  }
}
