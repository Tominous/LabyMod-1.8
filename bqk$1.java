import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.IChatAPIListener;

class bqk$1
  implements IChatAPIListener
{
  bqk$1(bqk parambqk) {}
  
  public void chatInitializationCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      a.f.setMessageFlushInterval(a.n);
      a.f.setUserChangeEventInterval(a.o);
      
      a.r();
      
      a.a(bqk.c.c);
    }
    else
    {
      a.a(bqk.c.a);
    }
    try
    {
      if (a.a != null) {
        a.a.d(☃);
      }
    }
    catch (Exception ☃)
    {
      a.n(☃.toString());
    }
  }
  
  public void chatShutdownCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      ErrorCode ☃ = a.e.shutdown();
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        a.n(String.format("Error shutting down the Twitch sdk: %s", new Object[] { ☃ }));
      }
      a.a(bqk.c.a);
    }
    else
    {
      a.a(bqk.c.c);
      
      a.n(String.format("Error shutting down Twith chat: %s", new Object[] { ☃ }));
    }
    try
    {
      if (a.a != null) {
        a.a.e(☃);
      }
    }
    catch (Exception ☃)
    {
      a.n(☃.toString());
    }
  }
  
  public void chatEmoticonDataDownloadCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃)) {
      a.s();
    }
  }
}
