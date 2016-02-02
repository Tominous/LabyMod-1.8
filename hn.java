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
    this.a = ☃;
    this.b = ☃;
    this.c = (☃ == null ? null : ☃.k());
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readShort();
    this.c = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeShort(this.b);
    ☃.a(this.c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public zx a()
  {
    return this.c;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
}
