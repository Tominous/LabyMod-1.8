import java.io.IOException;

public class iw
  implements ff<ic>
{
  private int a;
  private zx b;
  
  public iw() {}
  
  public iw(int ☃, zx ☃)
  {
    a = ☃;
    b = (☃ != null ? ☃.k() : null);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readShort();
    b = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeShort(a);
    ☃.a(b);
  }
  
  public int a()
  {
    return a;
  }
  
  public zx b()
  {
    return b;
  }
}
