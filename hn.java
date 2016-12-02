import java.io.IOException;

public class hn
  implements ff<fj>
{
  private int a;
  private int b;
  private zx c;
  
  public hn() {}
  
  public hn(int ☃, int ☃, zx ☃)
  {
    a = ☃;
    b = ☃;
    c = (☃ == null ? null : ☃.k());
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.readShort();
    c = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeShort(b);
    ☃.a(c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public zx a()
  {
    return c;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return b;
  }
}
