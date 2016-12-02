import java.util.List;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class bqj$1
  implements IStreamCallbacks
{
  bqj$1(bqj parambqj) {}
  
  public void requestAuthTokenCallback(ErrorCode ☃, AuthToken ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      this.a.u = ☃;
      this.a.a(bqj.a.d);
    }
    else
    {
      this.a.u.data = "";
      this.a.a(bqj.a.b);
      
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (this.a.c != null) {
        this.a.c.a(☃, ☃);
      }
    }
    catch (Exception ☃)
    {
      this.a.d(☃.toString());
    }
  }
  
  public void loginCallback(ErrorCode ☃, ChannelInfo ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      this.a.v = ☃;
      this.a.a(bqj.a.f);
      this.a.m = true;
    }
    else
    {
      this.a.a(bqj.a.b);
      this.a.m = false;
      
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("LoginCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (this.a.c != null) {
        this.a.c.a(☃);
      }
    }
    catch (Exception ☃)
    {
      this.a.d(☃.toString());
    }
  }
  
  public void getIngestServersCallback(ErrorCode ☃, IngestList ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      this.a.s = ☃;
      
      this.a.t = this.a.s.getDefaultServer();
      
      this.a.a(bqj.a.h);
      try
      {
        if (this.a.c != null) {
          this.a.c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        this.a.d(☃.toString());
      }
    }
    else
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("IngestListCallback got failure: %s", new Object[] { ☃ }));
      
      this.a.a(bqj.a.e);
    }
  }
  
  public void getUserInfoCallback(ErrorCode ☃, UserInfo ☃)
  {
    this.a.w = ☃;
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getStreamInfoCallback(ErrorCode ☃, StreamInfo ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      this.a.x = ☃;
      try
      {
        if (this.a.c != null) {
          this.a.c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        this.a.d(☃.toString());
      }
    }
    else
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getArchivingStateCallback(ErrorCode ☃, ArchivingState ☃)
  {
    this.a.y = ☃;
    if (ErrorCode.failed(☃)) {}
  }
  
  public void runCommercialCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.e(String.format("RunCommercialCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void setStreamInfoCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getGameNameListCallback(ErrorCode ☃, GameInfoList ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("GameNameListCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (this.a.c != null) {
        this.a.c.a(☃, ☃ == null ? new GameInfo[0] : ☃.list);
      }
    }
    catch (Exception ☃)
    {
      this.a.d(☃.toString());
    }
  }
  
  public void bufferUnlockCallback(long ☃)
  {
    FrameBuffer ☃ = FrameBuffer.lookupBuffer(☃);
    
    this.a.k.add(☃);
  }
  
  public void startCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      try
      {
        if (this.a.c != null) {
          this.a.c.b();
        }
      }
      catch (Exception ☃)
      {
        this.a.d(☃.toString());
      }
      this.a.a(bqj.a.k);
    }
    else
    {
      this.a.q = null;
      this.a.r = null;
      
      this.a.a(bqj.a.i);
      try
      {
        if (this.a.c != null) {
          this.a.c.c(☃);
        }
      }
      catch (Exception ☃)
      {
        this.a.d(☃.toString());
      }
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("startCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void stopCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      this.a.q = null;
      this.a.r = null;
      
      this.a.P();
      try
      {
        if (this.a.c != null) {
          this.a.c.c();
        }
      }
      catch (Exception ☃)
      {
        this.a.d(☃.toString());
      }
      if (this.a.m) {
        this.a.a(bqj.a.i);
      } else {
        this.a.a(bqj.a.b);
      }
    }
    else
    {
      this.a.a(bqj.a.i);
      
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("stopCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendActionMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("sendActionMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendStartSpanMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("sendStartSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendEndSpanMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.a.d(String.format("sendEndSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
}
