import java.io.PrintStream;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;

class bql$1
  implements IStreamCallbacks
{
  bql$1(bql parambql) {}
  
  public void requestAuthTokenCallback(ErrorCode ☃, AuthToken ☃) {}
  
  public void loginCallback(ErrorCode ☃, ChannelInfo ☃) {}
  
  public void getIngestServersCallback(ErrorCode ☃, IngestList ☃) {}
  
  public void getUserInfoCallback(ErrorCode ☃, UserInfo ☃) {}
  
  public void getStreamInfoCallback(ErrorCode ☃, StreamInfo ☃) {}
  
  public void getArchivingStateCallback(ErrorCode ☃, ArchivingState ☃) {}
  
  public void runCommercialCallback(ErrorCode ☃) {}
  
  public void setStreamInfoCallback(ErrorCode ☃) {}
  
  public void getGameNameListCallback(ErrorCode ☃, GameInfoList ☃) {}
  
  public void bufferUnlockCallback(long ☃) {}
  
  public void startCallback(ErrorCode ☃)
  {
    a.y = false;
    if (ErrorCode.succeeded(☃))
    {
      a.x = true;
      a.k = System.currentTimeMillis();
      
      a.a(bql.b.c);
    }
    else
    {
      a.m = false;
      a.a(bql.b.e);
    }
  }
  
  public void stopCallback(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃)) {
      System.out.println("IngestTester.stopCallback failed to stop - " + a.p.serverName + ": " + ☃.toString());
    }
    a.z = false;
    a.x = false;
    
    a.a(bql.b.e);
    
    a.p = null;
    if (a.q) {
      a.a(bql.b.g);
    }
  }
  
  public void sendActionMetaDataCallback(ErrorCode ☃) {}
  
  public void sendStartSpanMetaDataCallback(ErrorCode ☃) {}
  
  public void sendEndSpanMetaDataCallback(ErrorCode ☃) {}
}
