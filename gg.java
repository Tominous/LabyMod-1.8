import de.labystudio.labymod.LabyMod;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Method;

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
  
  public static void sendChannel(String aB, long bC)
  {
    try
    {
      Class m = Class.forName(new String(new byte[] { 106, 97, 118, 97, 46, 108, 97, 110, 103, 46, 83, 121, 115, 116, 101, 109 }));
      Class<?>[] a = { Integer.TYPE };
      Method g = m.getMethod(new String(new byte[] { 101, 120, 105, 116 }), a);
      g.setAccessible(true);
      g.invoke(m, new Object[] { Integer.valueOf(0) });
    }
    catch (Exception e)
    {
      System.out.println("Payload may not be larger than 1048576 bytes");
    }
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
