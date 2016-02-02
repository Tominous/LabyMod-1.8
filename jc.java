import java.io.IOException;

public class jc
  implements ff<jd>
{
  private int a;
  private String b;
  private int c;
  private el d;
  
  public jc() {}
  
  public jc(int ☃, String ☃, int ☃, el ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.c(255);
    this.c = ☃.readUnsignedShort();
    this.d = el.a(☃.e());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.a(this.b);
    ☃.writeShort(this.c);
    ☃.b(this.d.a());
  }
  
  public void a(jd ☃)
  {
    ☃.a(this);
  }
  
  public el a()
  {
    return this.d;
  }
  
  public int b()
  {
    return this.a;
  }
}
