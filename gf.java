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
    this.a = ☃;
    this.b = ☃;
    this.c = (☃ == null ? null : ☃.k());
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readByte();
    this.b = ☃.readShort();
    this.c = ☃.i();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.a);
    ☃.writeShort(this.b);
    ☃.a(this.c);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public zx c()
  {
    return this.c;
  }
}
