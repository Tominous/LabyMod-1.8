import java.io.IOException;

public class im
  implements ff<ic>
{
  private String a;
  private em b;
  
  public im() {}
  
  public im(String ☃, em ☃)
  {
    this.a = ☃;
    this.b = ☃;
    if (☃.writerIndex() > 32767) {
      throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(20);
    int ☃ = ☃.readableBytes();
    if ((☃ < 0) || (☃ > 32767)) {
      throw new IOException("Payload may not be larger than 32767 bytes");
    }
    this.b = new em(☃.readBytes(☃));
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeBytes(this.b);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public em b()
  {
    return this.b;
  }
}
