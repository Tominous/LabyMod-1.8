import de.labystudio.labymod.LabyMod;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class awz
  extends axu
{
  private static final AtomicInteger a = new AtomicInteger(0);
  private static final Logger f = LogManager.getLogger();
  private ek g;
  private boolean h;
  private final axu i;
  
  public awz(axu p_i1181_1_, ave mcIn, bde p_i1181_3_)
  {
    j = mcIn;
    i = p_i1181_1_;
    bdd serveraddress = bdd.a(b);
    mcIn.a((bdb)null);
    mcIn.a(p_i1181_3_);
    getInstancecommandQueue.clear();
    if (!serverCommand.isEmpty()) {
      getInstancecommandQueue.add(serverCommand);
    }
    a(serveraddress.a(), serveraddress.b());
  }
  
  public awz(axu p_i1182_1_, ave mcIn, String hostName, int port)
  {
    j = mcIn;
    i = p_i1182_1_;
    mcIn.a((bdb)null);
    a(hostName, port);
  }
  
  private void a(final String ip, final int port)
  {
    LabyMod.getInstance().updateServerIP(ip, port);
    f.info("Connecting to " + ip + ", " + port);
    new Thread("Server Connector #" + a.incrementAndGet())
    {
      public void run()
      {
        InetAddress inetaddress = null;
        try
        {
          if (awz.a(awz.this)) {
            return;
          }
          inetaddress = InetAddress.getByName(ip);
          awz.a(awz.this, ek.a(inetaddress, port, j.t.f()));
          awz.b(awz.this).a(new bcx(awz.b(awz.this), j, awz.c(awz.this)));
          awz.b(awz.this).a(new jc(47, ip, port, el.d));
          awz.b(awz.this).a(new jl(j.L().e()));
        }
        catch (UnknownHostException unknownhostexception)
        {
          if (awz.a(awz.this)) {
            return;
          }
          awz.a().error("Couldn't connect to server", unknownhostexception);
          j.a(new axh(awz.c(awz.this), "connect.failed", new fb("disconnect.genericReason", new Object[] { "Unknown host" })));
        }
        catch (Exception exception)
        {
          if (awz.a(awz.this)) {
            return;
          }
          awz.a().error("Couldn't connect to server", exception);
          String s = exception.toString();
          if (inetaddress != null)
          {
            String s1 = inetaddress.toString() + ":" + port;
            s = s.replaceAll(s1, "");
          }
          j.a(new axh(awz.c(awz.this), "connect.failed", new fb("disconnect.genericReason", new Object[] { s })));
        }
      }
    }.start();
  }
  
  public void e()
  {
    if (g != null) {
      if (g.g()) {
        g.a();
      } else {
        g.l();
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {}
  
  public void b()
  {
    n.clear();
    n.add(new avs(0, l / 2 - 100, m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 0)
    {
      h = true;
      if (g != null) {
        g.a(new fa("Aborted"));
      }
      j.a(i);
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    if (g == null) {
      a(q, bnq.a("connect.connecting", new Object[0]), l / 2, m / 2 - 50, 16777215);
    } else {
      a(q, bnq.a("connect.authorizing", new Object[0]), l / 2, m / 2 - 50, 16777215);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
