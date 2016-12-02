import java.io.IOException;
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class jm
  implements ff<jk>
{
  private byte[] a = new byte[0];
  private byte[] b = new byte[0];
  
  public jm() {}
  
  public jm(SecretKey ☃, PublicKey ☃, byte[] ☃)
  {
    a = ng.a(☃, ☃.getEncoded());
    b = ng.a(☃, ☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.a();
    b = ☃.a();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.a(b);
  }
  
  public void a(jk ☃)
  {
    ☃.a(this);
  }
  
  public SecretKey a(PrivateKey ☃)
  {
    return ng.a(☃, a);
  }
  
  public byte[] b(PrivateKey ☃)
  {
    if (☃ == null) {
      return b;
    }
    return ng.b(☃, b);
  }
}
