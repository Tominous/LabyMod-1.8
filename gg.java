import de.labystudio.labymod.LabyMod;
import java.io.IOException;

public class gg
  implements ff<fj>
{
  private String a;
  private em b;
  
  public gg() {}
  
  public gg(String channelName, em dataIn)
  {
    this.a = channelName;
    this.b = dataIn;
    if (dataIn.writerIndex() > 1048576) {
      throw new IllegalArgumentException("Payload may not be larger than 1048576 bytes");
    }
  }
  
  public void a(em buf)
    throws IOException
  {
    this.a = buf.c(20);
    int i = buf.readableBytes();
    if ((i >= 0) && (i <= 1048576)) {
      this.b = new em(buf.readBytes(i));
    } else {
      throw new IOException("Payload may not be larger than 1048576 bytes");
    }
    LabyMod.getInstance().pluginMessage(this.a, this.b);
  }
  
  public void b(em buf)
    throws IOException
  {
    buf.a(this.a);
    buf.writeBytes(this.b);
  }
  
  public void a(fj handler)
  {
    handler.a(this);
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
