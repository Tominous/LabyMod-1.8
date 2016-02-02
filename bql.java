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
    this.a = ☃;
  }
  
  public IngestServer c()
  {
    return this.p;
  }
  
  public int d()
  {
    return this.s;
  }
  
  public boolean f()
  {
    return (this.d == bql.b.f) || (this.d == bql.b.h) || (this.d == bql.b.i);
  }
  
  public float i()
  {
    return this.w;
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
      bql.this.y = false;
      if (ErrorCode.succeeded(☃))
      {
        bql.this.x = true;
        bql.this.k = System.currentTimeMillis();
        
        bql.this.a(bql.b.c);
      }
      else
      {
        bql.this.m = false;
        bql.this.a(bql.b.e);
      }
    }
    
    public void stopCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃)) {
        System.out.println("IngestTester.stopCallback failed to stop - " + bql.this.p.serverName + ": " + ☃.toString());
      }
      bql.this.z = false;
      bql.this.x = false;
      
      bql.this.a(bql.b.e);
      
      bql.this.p = null;
      if (bql.this.q) {
        bql.this.a(bql.b.g);
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
        bql.this.h = RTMPState.lookupValue((int)☃);
        break;
      case 2: 
        bql.this.g = ☃;
      }
    }
  };
  
  public bql(Stream ☃, IngestList ☃)
  {
    this.b = ☃;
    this.c = ☃;
  }
  
  public void j()
  {
    if (this.d != bql.b.a) {
      return;
    }
    this.s = 0;
    this.q = false;
    this.r = false;
    this.x = false;
    this.y = false;
    this.z = false;
    
    this.o = this.b.getStatCallbacks();
    this.b.setStatCallbacks(this.B);
    
    this.n = this.b.getStreamCallbacks();
    this.b.setStreamCallbacks(this.A);
    
    this.i = new VideoParams();
    this.i.targetFps = 60;
    this.i.maxKbps = 3500;
    this.i.outputWidth = 1280;
    this.i.outputHeight = 720;
    this.i.pixelFormat = PixelFormat.TTV_PF_BGRA;
    this.i.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
    this.i.disableAdaptiveBitrate = true;
    this.i.verticalFlip = false;
    
    this.b.getDefaultParams(this.i);
    
    this.j = new AudioParams();
    this.j.audioEnabled = false;
    this.j.enableMicCapture = false;
    this.j.enablePlaybackCapture = false;
    this.j.enablePassthroughAudio = false;
    
    this.l = Lists.newArrayList();
    
    int ☃ = 3;
    for (int ☃ = 0; ☃ < ☃; ☃++)
    {
      FrameBuffer ☃ = this.b.allocateFrameBuffer(this.i.outputWidth * this.i.outputHeight * 4);
      if (!☃.getIsValid())
      {
        p();
        a(bql.b.i);
        return;
      }
      this.l.add(☃);
      
      this.b.randomizeFrameBuffer(☃);
    }
    a(bql.b.b);
    
    this.k = System.currentTimeMillis();
  }
  
  public void k()
  {
    if ((f()) || (this.d == bql.b.a)) {
      return;
    }
    if ((this.y) || (this.z)) {
      return;
    }
    switch (bql.3.b[this.d.ordinal()])
    {
    case 1: 
    case 2: 
      if (this.p != null)
      {
        if ((this.r) || (!this.m)) {
          this.p.bitrateKbps = 0.0F;
        }
        b(this.p);
      }
      else
      {
        this.k = 0L;
        this.r = false;
        this.m = true;
        if (this.d != bql.b.b) {
          this.s += 1;
        }
        if (this.s < this.c.getServers().length)
        {
          this.p = this.c.getServers()[this.s];
          a(this.p);
        }
        else
        {
          a(bql.b.f);
        }
      }
      break;
    case 3: 
    case 4: 
      c(this.p);
      break;
    case 5: 
      a(bql.b.h);
      break;
    }
    o();
    if ((this.d == bql.b.h) || (this.d == bql.b.f)) {
      p();
    }
  }
  
  public void m()
  {
    if ((f()) || (this.q)) {
      return;
    }
    this.q = true;
    if (this.p != null) {
      this.p.bitrateKbps = 0.0F;
    }
  }
  
  protected boolean a(IngestServer ☃)
  {
    this.m = true;
    this.g = 0L;
    this.h = RTMPState.Idle;
    this.p = ☃;
    
    this.y = true;
    a(bql.b.c);
    
    ErrorCode ☃ = this.b.start(this.i, this.j, ☃, StartFlags.TTV_Start_BandwidthTest, true);
    if (ErrorCode.failed(☃))
    {
      this.y = false;
      this.m = false;
      a(bql.b.e);
      return false;
    }
    this.u = this.g;
    
    ☃.bitrateKbps = 0.0F;
    this.t = 0;
    
    return true;
  }
  
  protected void b(IngestServer ☃)
  {
    if (this.y)
    {
      this.r = true;
    }
    else if (this.x)
    {
      this.z = true;
      
      ErrorCode ☃ = this.b.stop(true);
      if (ErrorCode.failed(☃))
      {
        this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
        
        System.out.println("Stop failed: " + ☃.toString());
      }
      this.b.pollStats();
    }
    else
    {
      this.A.stopCallback(ErrorCode.TTV_EC_SUCCESS);
    }
  }
  
  protected long n()
  {
    return System.currentTimeMillis() - this.k;
  }
  
  protected void o()
  {
    float ☃ = (float)n();
    switch (bql.3.b[this.d.ordinal()])
    {
    case 1: 
    case 3: 
    case 6: 
    case 7: 
    case 8: 
    case 9: 
      this.w = 0.0F;
      break;
    case 2: 
      this.w = 1.0F;
      break;
    case 4: 
    case 5: 
    default: 
      this.w = (☃ / (float)this.e);
    }
    switch (bql.3.b[this.d.ordinal()])
    {
    case 7: 
    case 8: 
    case 9: 
      this.v = 1.0F;
      break;
    default: 
      this.v = (this.s / this.c.getServers().length);
      this.v += this.w / this.c.getServers().length;
    }
  }
  
  protected boolean c(IngestServer ☃)
  {
    if ((this.r) || (this.q) || (n() >= this.e))
    {
      a(bql.b.e);
      return true;
    }
    if ((this.y) || (this.z)) {
      return true;
    }
    ErrorCode ☃ = this.b.submitVideoFrame((FrameBuffer)this.l.get(this.t));
    if (ErrorCode.failed(☃))
    {
      this.m = false;
      a(bql.b.e);
      return false;
    }
    this.t = ((this.t + 1) % this.l.size());
    
    this.b.pollStats();
    if (this.h == RTMPState.SendVideo)
    {
      a(bql.b.d);
      
      long ☃ = n();
      if ((☃ > 0L) && (this.g > this.u))
      {
        ☃.bitrateKbps = ((float)(this.g * 8L) / (float)n());
        this.u = this.g;
      }
    }
    return true;
  }
  
  protected void p()
  {
    this.p = null;
    if (this.l != null)
    {
      for (int ☃ = 0; ☃ < this.l.size(); ☃++) {
        ((FrameBuffer)this.l.get(☃)).free();
      }
      this.l = null;
    }
    if (this.b.getStatCallbacks() == this.B)
    {
      this.b.setStatCallbacks(this.o);
      this.o = null;
    }
    if (this.b.getStreamCallbacks() == this.A)
    {
      this.b.setStreamCallbacks(this.n);
      this.n = null;
    }
  }
  
  protected void a(bql.b ☃)
  {
    if (☃ == this.d) {
      return;
    }
    this.d = ☃;
    if (this.a != null) {
      this.a.a(this, ☃);
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
