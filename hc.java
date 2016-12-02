import java.io.IOException;

public class hc
  implements ff<fj>
{
  private int a;
  private int b;
  
  public hc() {}
  
  public hc(int ☃, pf ☃)
  {
    this.a = ☃;
    this.b = ☃.a();
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
}
