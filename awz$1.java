import java.net.InetAddress;
import java.net.UnknownHostException;
import org.apache.logging.log4j.Logger;

class awz$1
  extends Thread
{
  awz$1(awz paramawz, String x0, String paramString1, int paramInt)
  {
    super(x0);
  }
  
  public void run()
  {
    InetAddress inetaddress = null;
    try
    {
      if (awz.a(this.this$0)) {
        return;
      }
      inetaddress = InetAddress.getByName(this.val$ip);
      awz.a(this.this$0, ek.a(inetaddress, this.val$port, awz.access$200(this.this$0).t.f()));
      awz.b(this.this$0).a(new bcx(awz.b(this.this$0), awz.access$300(this.this$0), awz.c(this.this$0)));
      awz.b(this.this$0).a(new jc(47, this.val$ip, this.val$port, el.d));
      awz.b(this.this$0).a(new jl(awz.access$500(this.this$0).L().e()));
    }
    catch (UnknownHostException unknownhostexception)
    {
      if (awz.a(this.this$0)) {
        return;
      }
      awz.a().error("Couldn't connect to server", unknownhostexception);
      awz.access$700(this.this$0).a(new axh(awz.c(this.this$0), "connect.failed", new fb("disconnect.genericReason", new Object[] { "Unknown host" })));
    }
    catch (Exception exception)
    {
      if (awz.a(this.this$0)) {
        return;
      }
      awz.a().error("Couldn't connect to server", exception);
      String s = exception.toString();
      if (inetaddress != null)
      {
        String s1 = inetaddress.toString() + ":" + this.val$port;
        s = s.replaceAll(s1, "");
      }
      awz.access$800(this.this$0).a(new axh(awz.c(this.this$0), "connect.failed", new fb("disconnect.genericReason", new Object[] { s })));
    }
  }
}
