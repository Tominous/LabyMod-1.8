import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.logging.log4j.Logger;

class awz$1
  extends Thread
{
  awz$1(awz this$0, String x0, String paramString1, int paramInt)
  {
    super(x0);
  }
  
  public void run()
  {
    InetAddress inetaddress = null;
    try
    {
      if (awz.a(this$0)) {
        return;
      }
      inetaddress = InetAddress.getByName(val$ip);
      awz.a(this$0, ek.a(inetaddress, val$port, access$200this$0).t.f()));
      awz.b(this$0).a(new bcx(awz.b(this$0), awz.access$300(this$0), awz.c(this$0)));
      awz.b(this$0).a(new jc(47, val$ip, val$port, el.d));
      awz.b(this$0).a(new jl(awz.access$500(this$0).L().e()));
    }
    catch (UnknownHostException unknownhostexception)
    {
      if (awz.a(this$0)) {
        return;
      }
      awz.a().error("Couldn't connect to server", unknownhostexception);
      awz.access$700(this$0).a(new axh(awz.c(this$0), "connect.failed", new fb("disconnect.genericReason", new Object[] { "Unknown host" })));
    }
    catch (Exception exception)
    {
      if (awz.a(this$0)) {
        return;
      }
      awz.a().error("Couldn't connect to server", exception);
      String s = exception.toString();
      if (inetaddress != null)
      {
        String s1 = inetaddress.toString() + ":" + val$port;
        s = s.replaceAll(s1, "");
      }
      awz.access$800(this$0).a(new axh(awz.c(this$0), "connect.failed", new fb("disconnect.genericReason", new Object[] { s })));
    }
  }
}
