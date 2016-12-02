import java.net.UnknownHostException;

class azk$1
  implements Runnable
{
  azk$1(azk this$0) {}
  
  public void run()
  {
    try
    {
      azk.b(this$0).g().a(azk.a(this$0));
    }
    catch (UnknownHostException var2)
    {
      athis$0).e = -1L;
      athis$0).d = (a.e + "Can't resolve hostname");
    }
    catch (Exception var3)
    {
      athis$0).e = -1L;
      athis$0).d = (a.e + "Can't connect to server.");
    }
  }
}
