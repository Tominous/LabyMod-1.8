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
    this.a = ng.a(☃, ☃.getEncoded());
    this.b = ng.a(☃, ☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.a();
    this.b = ☃.a();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.a(this.b);
  }
  
  public void a(jk ☃)
  {
    ☃.a(this);
  }
  
  public SecretKey a(PrivateKey ☃)
  {
    return ng.a(☃, this.a);
  }
  
  public byte[] b(PrivateKey ☃)
  {
    if (☃ == null) {
      return this.b;
    }
    return ng.b(☃, this.b);
  }
}
