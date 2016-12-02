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
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ☃.c(255);
    c = ☃.readUnsignedShort();
    d = el.a(☃.e());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.a(b);
    ☃.writeShort(c);
    ☃.b(d.a());
  }
  
  public void a(jd ☃)
  {
    ☃.a(this);
  }
  
  public el a()
  {
    return d;
  }
  
  public int b()
  {
    return a;
  }
}
