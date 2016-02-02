import java.net.UnknownHostException;

class azk$1
  implements Runnable
{
  azk$1(azk paramazk) {}
  
  public void run()
  {
    try
    {
      azk.b(this.this$0).g().a(azk.a(this.this$0));
    }
    catch (UnknownHostException var2)
    {
      azk.a(this.this$0).e = -1L;
      azk.a(this.this$0).d = (a.e + "Can't resolve hostname");
    }
    catch (Exception var3)
    {
      azk.a(this.this$0).e = -1L;
      azk.a(this.this$0).d = (a.e + "Can't connect to server.");
    }
  }
}
