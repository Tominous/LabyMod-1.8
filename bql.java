import com.google.common.collect.Lists;
import java.io.PrintStream;
import java.util.List;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.RTMPState;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class bql
{
  protected bql.a a = null;
  protected Stream b = null;
  protected IngestList c = null;
  protected bql.b d = bql.b.a;
  protected long e = 8000L;
  protected long f = 2000L;
  protected long g = 0L;
  protected RTMPState h = RTMPState.Invalid;
  protected VideoParams i = null;
  protected AudioParams j = null;
  protected long k = 0L;
  protected List<FrameBuffer> l = null;
  protected boolean m = false;
  protected IStreamCallbacks n = null;
  protected IStatCallbacks o = null;
  protected IngestServer p = null;
  protected boolean q = false;
  protected boolean r = false;
  protected int s = -1;
  protected int t = 0;
  protected long u = 0L;
  protected float v = 0.0F;
  protected float w = 0.0F;
  protected boolean x = false;
  protected boolean y = false;
  protected boolean z = false;
  
  public void a(bql.a ☃)
  {
    a = ☃;
  }
  
  public IngestServer c()
  {
    return p;
  }
  
  public int d()
  {
    return s;
  }
  
  public boolean f()
  {
    return (d == bql.b.f) || (d == bql.b.h) || (d == bql.b.i);
  }
  
  public float i()
  {
    return w;
  }
  
  protected IStreamCallbacks A = new IStreamCallbacks()
  {
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
      y = false;
      if (ErrorCode.succeeded(☃))
      {
        x = true;
        k = System.currentTimeMillis();
        
        a(bql.b.c);
      }
      else
      {
        m = false;
        a(bql.b.e);
      }
    }
    
    public void stopCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃)) {
        System.out.println("IngestTester.stopCallback failed to stop - " + p.serverName + ": " + ☃.toString());
      }
      z = false;
      x = false;
      
      a(bql.b.e);
      
      p = null;
      if (q) {
        a(bql.b.g);
      }
    }
    
    public void sendActionMetaDataCallback(ErrorCode ☃) {}
    
    public void sendStartSpanMetaDataCallback(ErrorCode ☃) {}
    
    public void sendEndSpanMetaDataCallback(ErrorCode ☃) {}
  };
  protected IStatCallbacks B = new IStatCallbacks()
  {
    public void statCallback(StatType ☃, long ☃)
    {
      switch (bql.3.a[☃.ordinal()])
      {
      case 1: 
        h = RTMPState.lookupValue((int)☃);
        break;
      case 2: 
        g = ☃;
      }
    }
  };
  
  public bql(Stream ☃, IngestList ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public void j()
  {
    if (d != bql.b.a) {
      return;
    }
    s = 0;
    q = false;
    r = false;
    x = false;
    y = false;
    z = false;
    
    o = b.getStatCallbacks();
    b.setStatCallbacks(B);
    
    n = b.getStreamCallbacks();
    b.setStreamCallbacks(A);
    
    i = new VideoParams();
    i.targetFps = 60;
    i.maxKbps = 3500;
    i.outputWidth = 1280;
    i.outputHeight = 720;
    i.pixelFormat = PixelFormat.TTV_PF_BGRA;
    i.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
    i.disableAdaptiveBitrate = true;
    i.verticalFlip = false;
    
    b.getDefaultParams(i);
    
    j = new AudioParams();
    j.audioEnabled = false;
    j.enableMicCapture = false;
    j.enablePlaybackCapture = false;
    j.enablePassthroughAudio = false;
    
    l = Lists.newArrayList();
    
    int ☃ = 3;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      FrameBuffer ☃ = b.allocateFrameBuffer(i.outputWidth * i.outputHeight * 4);
      if (!☃.getIsValid())
      {
        p();
        a(bql.b.i);
        return;
      }
      l.add(☃);
      
      b.randomizeFrameBuffer(☃);
    }
    a(bql.b.b);
    
    k = System.currentTimeMillis();
  }
  
  public void k()
  {
    if ((f()) || (d == bql.b.a)) {
      return;
    }
    if ((y) || (z)) {
      return;
    }
    switch (bql.3.b[d.ordinal()])
    {
    case 1: 
    case 2: 
      if (p != null)
      {
        if ((r) || (!m)) {
          p.bitrateKbps = 0.0F;
        }
        b(p);
      }
      else
      {
        k = 0L;
        r = false;
        m = true;
        if (d != bql.b.b) {
          s += 1;
        }
        if (s < c.getServers().length)
        {
          p = c.getServers()[s];
          a(p);
        }
        else
        {
          a(bql.b.f);
        }
      }
      break;
    case 3: 
    case 4: 
      c(p);
      break;
    case 5: 
      a(bql.b.h);
      break;
    }
    o();
    if ((d == bql.b.h) || (d == bql.b.f)) {
      p();
    }
  }
  
  public void m()
  {
    if ((f()) || (q)) {
      return;
    }
    q = true;
    if (p != null) {
      p.bitrateKbps = 0.0F;
    }
  }
  
  protected boolean a(IngestServer ☃)
  {
    m = true;
    g = 0L;
    h = RTMPState.Idle;
    p = ☃;
    
    y = true;
    a(bql.b.c);
    
    ErrorCode ☃ = b.start(i, j, ☃, StartFlags.TTV_Start_BandwidthTest, true);
    if (ErrorCode.failed(☃))
    {
      y = false;
      m = false;
      a(bql.b.e);
      return false;
    }
    u = g;
    
    bitrateKbps = 0.0F;
    t = 0;
    
    return true;
  }
  
  protected void b(IngestServer ☃)
  {
    if (y)
    {
      r = true;
    }
    else if (x)
    {
      z = true;
      
      ErrorCode ☃ = b.stop(true);
      if (ErrorCode.failed(☃))
      {
        A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        
        System.out.println("Stop failed: " + ☃.toString());
      }
      b.pollStats();
    }
    else
    {
      A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
    }
  }
  
  protected long n()
  {
    return System.currentTimeMillis() - k;
  }
  
  protected void o()
  {
    float ☃ = (float)n();
    switch (bql.3.b[d.ordinal()])
    {
    case 1: 
    case 3: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      w = 0.0F;
      break;
    case 2: 
      w = 1.0F;
      break;
    case 4: 
    case 5: 
    default: 
      w = (☃ / (float)e);
    }
    switch (bql.3.b[d.ordinal()])
    {
    case 7: 
    case 8: 
    case 9: 
      v = 1.0F;
      break;
    default: 
      v = (s / c.getServers().length);
      v += w / c.getServers().length;
    }
  }
  
  protected boolean c(IngestServer ☃)
  {
    if ((r) || (q) || (n() >= e))
    {
      a(bql.b.e);
      return true;
    }
    if ((y) || (z)) {
      return true;
    }
    ErrorCode ☃ = b.submitVideoFrame((FrameBuffer)l.get(t));
    if (ErrorCode.failed(☃))
    {
      m = false;
      a(bql.b.e);
      return false;
    }
    t = ((t + 1) % l.size());
    
    b.pollStats();
    if (h == RTMPState.SendVideo)
    {
      a(bql.b.d);
      
      long ☃ = n();
      if ((☃ > 0L) && (g > u))
      {
        bitrateKbps = ((float)(g * 8L) / (float)n());
        u = g;
      }
    }
    return true;
  }
  
  protected void p()
  {
    p = null;
    if (l != null)
    {
      for (int ☃ = 0; ☃ < l.size(); ☃++) {
        ((FrameBuffer)l.get(☃)).free();
      }
      l = null;
    }
    if (b.getStatCallbacks() == B)
    {
      b.setStatCallbacks(o);
      o = null;
    }
    if (b.getStreamCallbacks() == A)
    {
      b.setStreamCallbacks(n);
      n = null;
    }
  }
  
  protected void a(bql.b ☃)
  {
    if (☃ == d) {
      return;
    }
    d = ☃;
    if (a != null) {
      a.a(this, ☃);
    }
  }
  
  public static abstract interface a
  {
    public abstract void a(bql parambql, bql.b paramb);
  }
  
  public static enum b
  {
    private b() {}
  }
}
