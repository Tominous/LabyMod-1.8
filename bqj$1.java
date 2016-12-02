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
      a.u = ☃;
      a.a(bqj.a.d);
    }
    else
    {
      a.u.data = "";
      a.a(bqj.a.b);
      
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (a.c != null) {
        a.c.a(☃, ☃);
      }
    }
    catch (Exception ☃)
    {
      a.d(☃.toString());
    }
  }
  
  public void loginCallback(ErrorCode ☃, ChannelInfo ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      a.v = ☃;
      a.a(bqj.a.f);
      a.m = true;
    }
    else
    {
      a.a(bqj.a.b);
      a.m = false;
      
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("LoginCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (a.c != null) {
        a.c.a(☃);
      }
    }
    catch (Exception ☃)
    {
      a.d(☃.toString());
    }
  }
  
  public void getIngestServersCallback(ErrorCode ☃, IngestList ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      a.s = ☃;
      
      a.t = a.s.getDefaultServer();
      
      a.a(bqj.a.h);
      try
      {
        if (a.c != null) {
          a.c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        a.d(☃.toString());
      }
    }
    else
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("IngestListCallback got failure: %s", new Object[] { ☃ }));
      
      a.a(bqj.a.e);
    }
  }
  
  public void getUserInfoCallback(ErrorCode ☃, UserInfo ☃)
  {
    a.w = ☃;
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getStreamInfoCallback(ErrorCode ☃, StreamInfo ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      a.x = ☃;
      try
      {
        if (a.c != null) {
          a.c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        a.d(☃.toString());
      }
    }
    else
    {
      String ☃ = ErrorCode.getString(☃);
      a.e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getArchivingStateCallback(ErrorCode ☃, ArchivingState ☃)
  {
    a.y = ☃;
    if (ErrorCode.failed(☃)) {}
  }
  
  public void runCommercialCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.e(String.format("RunCommercialCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void setStreamInfoCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void getGameNameListCallback(ErrorCode ☃, GameInfoList ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("GameNameListCallback got failure: %s", new Object[] { ☃ }));
    }
    try
    {
      if (a.c != null) {
        a.c.a(☃, ☃ == null ? new GameInfo[0] : list);
      }
    }
    catch (Exception ☃)
    {
      a.d(☃.toString());
    }
  }
  
  public void bufferUnlockCallback(long ☃)
  {
    FrameBuffer ☃ = FrameBuffer.lookupBuffer(☃);
    
    a.k.add(☃);
  }
  
  public void startCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      try
      {
        if (a.c != null) {
          a.c.b();
        }
      }
      catch (Exception ☃)
      {
        a.d(☃.toString());
      }
      a.a(bqj.a.k);
    }
    else
    {
      a.q = null;
      a.r = null;
      
      a.a(bqj.a.i);
      try
      {
        if (a.c != null) {
          a.c.c(☃);
        }
      }
      catch (Exception ☃)
      {
        a.d(☃.toString());
      }
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("startCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void stopCallback(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      a.q = null;
      a.r = null;
      
      a.P();
      try
      {
        if (a.c != null) {
          a.c.c();
        }
      }
      catch (Exception ☃)
      {
        a.d(☃.toString());
      }
      if (a.m) {
        a.a(bqj.a.i);
      } else {
        a.a(bqj.a.b);
      }
    }
    else
    {
      a.a(bqj.a.i);
      
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("stopCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendActionMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("sendActionMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendStartSpanMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("sendStartSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
  
  public void sendEndSpanMetaDataCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      a.d(String.format("sendEndSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
    }
  }
}
