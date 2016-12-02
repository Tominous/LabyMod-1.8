import java.io.IOException;

public class gf
  implements ff<fj>
{
  private int a;
  private int b;
  private zx c;
  
  public gf() {}
  
  public gf(int ☃, int ☃, zx ☃)
  {
    a = ☃;
    b = ☃;
    c = (☃ == null ? null : ☃.k());
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
    b = ☃.readShort();
    c = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b);
    ☃.a(c);
  }
  
  public int a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public zx c()
  {
    return c;
  }
}
