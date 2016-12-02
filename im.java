import java.io.IOException;

public class im
  implements ff<ic>
{
  private String a;
  private em b;
  
  public im() {}
  
  public im(String ☃, em ☃)
  {
    a = ☃;
    b = ☃;
    if (☃.writerIndex() > 32767) {
      throw new IllegalArgumentException("Payload may not be larger than 32767 bytes");
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(20);
    int ☃ = ☃.readableBytes();
    if ((☃ < 0) || (☃ > 32767)) {
      throw new IOException("Payload may not be larger than 32767 bytes");
    }
    b = new em(☃.readBytes(☃));
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeBytes(b);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public em b()
  {
    return b;
  }
}
