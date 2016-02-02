import java.io.IOException;

public class ft
  implements ff<fj>
{
  private cj a;
  private int b;
  private dn c;
  
  public ft() {}
  
  public ft(cj ☃, int ☃, dn ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c();
    this.b = ☃.readUnsignedByte();
    this.c = ☃.h();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte((byte)this.b);
    ☃.a(this.c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public dn c()
  {
    return this.c;
  }
}
