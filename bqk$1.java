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
      this.a.f.setMessageFlushInterval(this.a.n);
      this.a.f.setUserChangeEventInterval(this.a.o);
      
      this.a.r();
      
      this.a.a(bqk.c.c);
    }
    else
    {
      this.a.a(bqk.c.a);
    }
    try
    {
      if (this.a.a != null) {
        this.a.a.d(☃);
      }
    }
    catch (Exception ☃)
    {
      this.a.n(☃.toString());
    }
  }
  
  public void chatShutdownCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      ErrorCode ☃ = this.a.e.shutdown();
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        this.a.n(String.format("Error shutting down the Twitch sdk: %s", new Object[] { ☃ }));
      }
      this.a.a(bqk.c.a);
    }
    else
    {
      this.a.a(bqk.c.c);
      
      this.a.n(String.format("Error shutting down Twith chat: %s", new Object[] { ☃ }));
    }
    try
    {
      if (this.a.a != null) {
        this.a.a.e(☃);
      }
    }
    catch (Exception ☃)
    {
      this.a.n(☃.toString());
    }
  }
  
  public void chatEmoticonDataDownloadCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃)) {
      this.a.s();
    }
  }
}
