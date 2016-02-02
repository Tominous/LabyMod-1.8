import java.io.IOException;

public class fs
  implements ff<fj>
{
  private int a;
  private cj b;
  private int c;
  
  public fs() {}
  
  public fs(int ☃, cj ☃, int ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.c();
    this.c = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.a(this.b);
    ☃.writeByte(this.c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public cj b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
}
