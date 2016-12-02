import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;
import java.net.SocketTimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.Logger;

public class bpq$b
  extends Thread
{
  private final bpq.c a;
  private final InetAddress b;
  private final MulticastSocket c;
  
  public bpq$b(bpq.c ☃)
    throws IOException
  {
    super("LanServerDetector #" + bpq.a().incrementAndGet());
    a = ☃;
    setDaemon(true);
    
    c = new MulticastSocket(4445);
    b = InetAddress.getByName("224.0.2.60");
    c.setSoTimeout(5000);
    c.joinGroup(b);
  }
  
  public void run()
  {
    byte[] ☃ = new byte['Ѐ'];
    while (!isInterrupted())
    {
      DatagramPacket ☃ = new DatagramPacket(☃, ☃.length);
      try
      {
        c.receive(☃);
      }
      catch (SocketTimeoutException ☃)
      {
        continue;
      }
      catch (IOException ☃)
      {
        bpq.b().error("Couldn't ping server", ☃);
        break;
      }
      String ☃ = new String(☃.getData(), ☃.getOffset(), ☃.getLength());
      bpq.b().debug(☃.getAddress() + ": " + ☃);
      a.a(☃, ☃.getAddress());
    }
    try
    {
      c.leaveGroup(b);
    }
    catch (IOException localIOException1) {}
    c.close();
  }
}
