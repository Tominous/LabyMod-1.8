import java.io.IOException;

public class iw
  implements ff<ic>
{
  private int a;
  private zx b;
  
  public iw() {}
  
  public iw(int ☃, zx ☃)
  {
    this.a = ☃;
    this.b = (☃ != null ? ☃.k() : null);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readShort();
    this.b = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeShort(this.a);
    ☃.a(this.b);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public zx b()
  {
    return this.b;
  }
}
