import java.io.IOException;
import java.security.PublicKey;

public class jh
  implements ff<jf>
{
  private String a;
  private PublicKey b;
  private byte[] c;
  
  public jh() {}
  
  public jh(String ☃, PublicKey ☃, byte[] ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(20);
    b = ng.a(☃.a());
    c = ☃.a();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.a(b.getEncoded());
    ☃.a(c);
  }
  
  public void a(jf ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public PublicKey b()
  {
    return b;
  }
  
  public byte[] c()
  {
    return c;
  }
}
