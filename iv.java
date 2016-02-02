import java.io.IOException;

public class iv
  implements ff<ic>
{
  private int a;
  
  public iv() {}
  
  public iv(int ☃)
  {
    this.a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readShort();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeShort(this.a);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
}
