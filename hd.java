import java.io.IOException;

public class hd
  implements ff<fj>
{
  private String a;
  private String b;
  
  public hd() {}
  
  public hd(String ☃, String ☃)
  {
    a = ☃;
    b = ☃;
    if (☃.length() > 40) {
      throw new IllegalArgumentException("Hash is too long (max 40, was " + ☃.length() + ")");
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(32767);
    b = ☃.c(40);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.a(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
}
