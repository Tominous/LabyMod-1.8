import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.MessageLevel;
import tv.twitch.StandardCoreAPI;
import tv.twitch.broadcast.ArchivingState;
import tv.twitch.broadcast.AudioDeviceType;
import tv.twitch.broadcast.AudioParams;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.DesktopStreamAPI;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.GameInfoList;
import tv.twitch.broadcast.IStatCallbacks;
import tv.twitch.broadcast.IStreamCallbacks;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.PixelFormat;
import tv.twitch.broadcast.StartFlags;
import tv.twitch.broadcast.StatType;
import tv.twitch.broadcast.Stream;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.StreamInfoForSetting;
import tv.twitch.broadcast.UserInfo;
import tv.twitch.broadcast.VideoParams;

public class bqj
{
  private static final Logger D = ;
  protected final int a = 30;
  protected final int b = 3;
  private static final np<String> E = new np(String.class, 50);
  private String F = null;
  protected bqj.b c = null;
  protected String d = "";
  protected String e = "";
  protected String f = "";
  protected boolean g = true;
  protected Core h = null;
  protected Stream i = null;
  protected List<FrameBuffer> j = Lists.newArrayList();
  protected List<FrameBuffer> k = Lists.newArrayList();
  protected boolean l = false;
  protected boolean m = false;
  protected boolean n = false;
  protected bqj.a o = bqj.a.a;
  protected String p = null;
  protected VideoParams q = null;
  protected AudioParams r = null;
  protected IngestList s = new IngestList(new IngestServer[0]);
  protected IngestServer t = null;
  protected AuthToken u = new AuthToken();
  protected ChannelInfo v = new ChannelInfo();
  protected UserInfo w = new UserInfo();
  protected StreamInfo x = new StreamInfo();
  protected ArchivingState y = new ArchivingState();
  protected long z = 0L;
  protected bql A = null;
  private ErrorCode G;
  protected IStreamCallbacks B = new IStreamCallbacks()
  {
    public void requestAuthTokenCallback(ErrorCode ☃, AuthToken ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqj.this.u = ☃;
        bqj.this.a(bqj.a.d);
      }
      else
      {
        bqj.this.u.data = "";
        bqj.this.a(bqj.a.b);
        
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (bqj.this.c != null) {
          bqj.this.c.a(☃, ☃);
        }
      }
      catch (Exception ☃)
      {
        bqj.this.d(☃.toString());
      }
    }
    
    public void loginCallback(ErrorCode ☃, ChannelInfo ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqj.this.v = ☃;
        bqj.this.a(bqj.a.f);
        bqj.this.m = true;
      }
      else
      {
        bqj.this.a(bqj.a.b);
        bqj.this.m = false;
        
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("LoginCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (bqj.this.c != null) {
          bqj.this.c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        bqj.this.d(☃.toString());
      }
    }
    
    public void getIngestServersCallback(ErrorCode ☃, IngestList ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqj.this.s = ☃;
        
        bqj.this.t = bqj.this.s.getDefaultServer();
        
        bqj.this.a(bqj.a.h);
        try
        {
          if (bqj.this.c != null) {
            bqj.this.c.a(☃);
          }
        }
        catch (Exception ☃)
        {
          bqj.this.d(☃.toString());
        }
      }
      else
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("IngestListCallback got failure: %s", new Object[] { ☃ }));
        
        bqj.this.a(bqj.a.e);
      }
    }
    
    public void getUserInfoCallback(ErrorCode ☃, UserInfo ☃)
    {
      bqj.this.w = ☃;
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getStreamInfoCallback(ErrorCode ☃, StreamInfo ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqj.this.x = ☃;
        try
        {
          if (bqj.this.c != null) {
            bqj.this.c.a(☃);
          }
        }
        catch (Exception ☃)
        {
          bqj.this.d(☃.toString());
        }
      }
      else
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getArchivingStateCallback(ErrorCode ☃, ArchivingState ☃)
    {
      bqj.this.y = ☃;
      if (ErrorCode.failed(☃)) {}
    }
    
    public void runCommercialCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.e(String.format("RunCommercialCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void setStreamInfoCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getGameNameListCallback(ErrorCode ☃, GameInfoList ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("GameNameListCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (bqj.this.c != null) {
          bqj.this.c.a(☃, ☃ == null ? new GameInfo[0] : ☃.list);
        }
      }
      catch (Exception ☃)
      {
        bqj.this.d(☃.toString());
      }
    }
    
    public void bufferUnlockCallback(long ☃)
    {
      FrameBuffer ☃ = FrameBuffer.lookupBuffer(☃);
      
      bqj.this.k.add(☃);
    }
    
    public void startCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        try
        {
          if (bqj.this.c != null) {
            bqj.this.c.b();
          }
        }
        catch (Exception ☃)
        {
          bqj.this.d(☃.toString());
        }
        bqj.this.a(bqj.a.k);
      }
      else
      {
        bqj.this.q = null;
        bqj.this.r = null;
        
        bqj.this.a(bqj.a.i);
        try
        {
          if (bqj.this.c != null) {
            bqj.this.c.c(☃);
          }
        }
        catch (Exception ☃)
        {
          bqj.this.d(☃.toString());
        }
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("startCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void stopCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqj.this.q = null;
        bqj.this.r = null;
        
        bqj.this.P();
        try
        {
          if (bqj.this.c != null) {
            bqj.this.c.c();
          }
        }
        catch (Exception ☃)
        {
          bqj.this.d(☃.toString());
        }
        if (bqj.this.m) {
          bqj.this.a(bqj.a.i);
        } else {
          bqj.this.a(bqj.a.b);
        }
      }
      else
      {
        bqj.this.a(bqj.a.i);
        
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("stopCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendActionMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("sendActionMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendStartSpanMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("sendStartSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendEndSpanMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqj.this.d(String.format("sendEndSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
  };
  protected IStatCallbacks C = new IStatCallbacks()
  {
    public void statCallback(StatType ☃, long ☃) {}
  };
  
  public void a(bqj.b ☃)
  {
    this.c = ☃;
  }
  
  public boolean b()
  {
    return this.l;
  }
  
  public void a(String ☃)
  {
    this.d = ☃;
  }
  
  public StreamInfo j()
  {
    return this.x;
  }
  
  public ChannelInfo l()
  {
    return this.v;
  }
  
  public boolean m()
  {
    return (this.o == bqj.a.k) || (this.o == bqj.a.m);
  }
  
  public boolean n()
  {
    return this.o == bqj.a.i;
  }
  
  public boolean o()
  {
    return this.o == bqj.a.n;
  }
  
  public boolean p()
  {
    return this.o == bqj.a.m;
  }
  
  public boolean q()
  {
    return this.m;
  }
  
  public IngestServer s()
  {
    return this.t;
  }
  
  public void a(IngestServer ☃)
  {
    this.t = ☃;
  }
  
  public IngestList t()
  {
    return this.s;
  }
  
  public void a(float ☃)
  {
    this.i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, ☃);
  }
  
  public void b(float ☃)
  {
    this.i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, ☃);
  }
  
  public bql w()
  {
    return this.A;
  }
  
  public long x()
  {
    return this.i.getStreamTime();
  }
  
  protected boolean y()
  {
    return true;
  }
  
  public ErrorCode A()
  {
    return this.G;
  }
  
  public bqj()
  {
    this.h = Core.getInstance();
    if (Core.getInstance() == null) {
      this.h = new Core(new StandardCoreAPI());
    }
    this.i = new Stream(new DesktopStreamAPI());
  }
  
  protected PixelFormat B()
  {
    return PixelFormat.TTV_PF_RGBA;
  }
  
  public boolean C()
  {
    if (this.l) {
      return false;
    }
    this.i.setStreamCallbacks(this.B);
    
    ErrorCode ☃ = this.h.initialize(this.d, System.getProperty("java.library.path"));
    if (!a(☃))
    {
      this.i.setStreamCallbacks(null);
      this.G = ☃;
      return false;
    }
    ☃ = this.h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
    if (!a(☃))
    {
      this.i.setStreamCallbacks(null);
      this.h.shutdown();
      this.G = ☃;
      return false;
    }
    if (ErrorCode.succeeded(☃))
    {
      this.l = true;
      a(bqj.a.b);
      return true;
    }
    this.G = ☃;
    this.h.shutdown();
    return false;
  }
  
  public boolean D()
  {
    if (!this.l) {
      return true;
    }
    if (o()) {
      return false;
    }
    this.n = true;
    
    F();
    
    this.i.setStreamCallbacks(null);
    this.i.setStatCallbacks(null);
    
    ErrorCode ☃ = this.h.shutdown();
    a(☃);
    
    this.l = false;
    this.n = false;
    a(bqj.a.a);
    
    return true;
  }
  
  public void E()
  {
    if (this.o != bqj.a.a)
    {
      if (this.A != null) {
        this.A.m();
      }
      while (this.A != null)
      {
        try
        {
          Thread.sleep(200L);
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
        K();
      }
      D();
    }
  }
  
  public boolean a(String ☃, AuthToken ☃)
  {
    if (o()) {
      return false;
    }
    F();
    if ((☃ == null) || (☃.isEmpty()))
    {
      d("Username must be valid");
      return false;
    }
    if ((☃ == null) || (☃.data == null) || (☃.data.isEmpty()))
    {
      d("Auth token must be valid");
      return false;
    }
    this.p = ☃;
    this.u = ☃;
    if (b()) {
      a(bqj.a.d);
    }
    return true;
  }
  
  public boolean F()
  {
    if (o()) {
      return false;
    }
    if (m()) {
      this.i.stop(false);
    }
    this.p = "";
    this.u = new AuthToken();
    if (!this.m) {
      return false;
    }
    this.m = false;
    if (!this.n) {
      try
      {
        if (this.c != null) {
          this.c.a();
        }
      }
      catch (Exception ☃)
      {
        d(☃.toString());
      }
    }
    a(bqj.a.b);
    
    return true;
  }
  
  public boolean a(String ☃, String ☃, String ☃)
  {
    if (!this.m) {
      return false;
    }
    if ((☃ == null) || (☃.equals(""))) {
      ☃ = this.p;
    }
    if (☃ == null) {
      ☃ = "";
    }
    if (☃ == null) {
      ☃ = "";
    }
    StreamInfoForSetting ☃ = new StreamInfoForSetting();
    ☃.streamTitle = ☃;
    ☃.gameName = ☃;
    
    ErrorCode ☃ = this.i.setStreamInfo(this.u, ☃, ☃);
    a(☃);
    
    return ErrorCode.succeeded(☃);
  }
  
  public boolean G()
  {
    if (!m()) {
      return false;
    }
    ErrorCode ☃ = this.i.runCommercial(this.u);
    a(☃);
    
    return ErrorCode.succeeded(☃);
  }
  
  public VideoParams a(int ☃, int ☃, float ☃, float ☃)
  {
    int[] ☃ = this.i.getMaxResolution(☃, ☃, ☃, ☃);
    
    VideoParams ☃ = new VideoParams();
    ☃.maxKbps = ☃;
    ☃.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
    ☃.pixelFormat = B();
    ☃.targetFps = ☃;
    ☃.outputWidth = ☃[0];
    ☃.outputHeight = ☃[1];
    ☃.disableAdaptiveBitrate = false;
    ☃.verticalFlip = false;
    
    return ☃;
  }
  
  public boolean a(VideoParams ☃)
  {
    if ((☃ == null) || (!n())) {
      return false;
    }
    this.q = ☃.clone();
    
    this.r = new AudioParams();
    this.r.audioEnabled = ((this.g) && (y()));
    this.r.enableMicCapture = this.r.audioEnabled;
    this.r.enablePlaybackCapture = this.r.audioEnabled;
    this.r.enablePassthroughAudio = false;
    if (!O())
    {
      this.q = null;
      this.r = null;
      return false;
    }
    ErrorCode ☃ = this.i.start(☃, this.r, this.t, StartFlags.None, true);
    if (ErrorCode.failed(☃))
    {
      P();
      
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error while starting to broadcast: %s", new Object[] { ☃ }));
      
      this.q = null;
      this.r = null;
      
      return false;
    }
    a(bqj.a.j);
    
    return true;
  }
  
  public boolean H()
  {
    if (!m()) {
      return false;
    }
    ErrorCode ☃ = this.i.stop(true);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error while stopping the broadcast: %s", new Object[] { ☃ }));
      return false;
    }
    a(bqj.a.l);
    
    return ErrorCode.succeeded(☃);
  }
  
  public boolean I()
  {
    if (!m()) {
      return false;
    }
    ErrorCode ☃ = this.i.pauseVideo();
    if (ErrorCode.failed(☃))
    {
      H();
      
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error pausing stream: %s\n", new Object[] { ☃ }));
    }
    else
    {
      a(bqj.a.m);
    }
    return ErrorCode.succeeded(☃);
  }
  
  public boolean J()
  {
    if (!p()) {
      return false;
    }
    a(bqj.a.k);
    
    return true;
  }
  
  public boolean a(String ☃, long ☃, String ☃, String ☃)
  {
    ErrorCode ☃ = this.i.sendActionMetaData(this.u, ☃, ☃, ☃, ☃);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error while sending meta data: %s\n", new Object[] { ☃ }));
      
      return false;
    }
    return true;
  }
  
  public long b(String ☃, long ☃, String ☃, String ☃)
  {
    long ☃ = this.i.sendStartSpanMetaData(this.u, ☃, ☃, ☃, ☃);
    if (☃ == -1L) {
      d(String.format("Error in SendStartSpanMetaData\n", new Object[0]));
    }
    return ☃;
  }
  
  public boolean a(String ☃, long ☃, long ☃, String ☃, String ☃)
  {
    if (☃ == -1L)
    {
      d(String.format("Invalid sequence id: %d\n", new Object[] { Long.valueOf(☃) }));
      return false;
    }
    ErrorCode ☃ = this.i.sendEndSpanMetaData(this.u, ☃, ☃, ☃, ☃, ☃);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error in SendStopSpanMetaData: %s\n", new Object[] { ☃ }));
      
      return false;
    }
    return true;
  }
  
  protected void a(bqj.a ☃)
  {
    if (☃ == this.o) {
      return;
    }
    this.o = ☃;
    try
    {
      if (this.c != null) {
        this.c.a(☃);
      }
    }
    catch (Exception ☃)
    {
      d(☃.toString());
    }
  }
  
  public void K()
  {
    if ((this.i == null) || (!this.l)) {
      return;
    }
    ErrorCode ☃ = this.i.pollTasks();
    a(☃);
    if (o())
    {
      this.A.k();
      if (this.A.f())
      {
        this.A = null;
        a(bqj.a.i);
      }
    }
    switch (bqj.3.a[this.o.ordinal()])
    {
    case 1: 
      a(bqj.a.e);
      
      ☃ = this.i.login(this.u);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_Login: %s\n", new Object[] { ☃ }));
      }
      break;
    case 2: 
      a(bqj.a.g);
      
      ☃ = this.i.getIngestServers(this.u);
      if (ErrorCode.failed(☃))
      {
        a(bqj.a.f);
        
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_GetIngestServers: %s\n", new Object[] { ☃ }));
      }
      break;
    case 3: 
      a(bqj.a.i);
      
      ☃ = this.i.getUserInfo(this.u);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_GetUserInfo: %s\n", new Object[] { ☃ }));
      }
      L();
      
      ☃ = this.i.getArchivingState(this.u);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_GetArchivingState: %s\n", new Object[] { ☃ }));
      }
      break;
    case 4: 
    case 5: 
      break;
    case 6: 
    case 7: 
    case 8: 
    case 9: 
    case 10: 
      break;
    case 11: 
    case 12: 
      L();
      break;
    }
  }
  
  protected void L()
  {
    long ☃ = System.nanoTime();
    long ☃ = (☃ - this.z) / 1000000000L;
    if (☃ < 30L) {
      return;
    }
    this.z = ☃;
    
    ErrorCode ☃ = this.i.getStreamInfo(this.u, this.p);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error in TTV_GetStreamInfo: %s", new Object[] { ☃ }));
    }
  }
  
  public bql M()
  {
    if ((!n()) || (this.s == null)) {
      return null;
    }
    if (o()) {
      return null;
    }
    this.A = new bql(this.i, this.s);
    this.A.j();
    
    a(bqj.a.n);
    
    return this.A;
  }
  
  protected boolean O()
  {
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      FrameBuffer ☃ = this.i.allocateFrameBuffer(this.q.outputWidth * this.q.outputHeight * 4);
      if (!☃.getIsValid())
      {
        d(String.format("Error while allocating frame buffer", new Object[0]));
        return false;
      }
      this.j.add(☃);
      this.k.add(☃);
    }
    return true;
  }
  
  protected void P()
  {
    for (int ☃ = 0; ☃ < this.j.size(); ☃++)
    {
      FrameBuffer ☃ = (FrameBuffer)this.j.get(☃);
      ☃.free();
    }
    this.k.clear();
    this.j.clear();
  }
  
  public FrameBuffer Q()
  {
    if (this.k.size() == 0)
    {
      d(String.format("Out of free buffers, this should never happen", new Object[0]));
      return null;
    }
    FrameBuffer ☃ = (FrameBuffer)this.k.get(this.k.size() - 1);
    this.k.remove(this.k.size() - 1);
    
    return ☃;
  }
  
  public void a(FrameBuffer ☃)
  {
    try
    {
      this.i.captureFrameBuffer_ReadPixels(☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Trying to submit a frame to Twitch");
      c ☃ = ☃.a("Broadcast State");
      ☃.a("Last reported errors", Arrays.toString(E.c()));
      ☃.a("Buffer", ☃);
      ☃.a("Free buffer count", Integer.valueOf(this.k.size()));
      ☃.a("Capture buffer count", Integer.valueOf(this.j.size()));
      throw new e(☃);
    }
  }
  
  public ErrorCode b(FrameBuffer ☃)
  {
    if (p()) {
      J();
    } else if (!m()) {
      return ErrorCode.TTV_EC_STREAM_NOT_STARTED;
    }
    ErrorCode ☃ = this.i.submitVideoFrame(☃);
    if (☃ != ErrorCode.TTV_EC_SUCCESS)
    {
      String ☃ = ErrorCode.getString(☃);
      if (ErrorCode.succeeded(☃))
      {
        e(String.format("Warning in SubmitTexturePointer: %s\n", new Object[] { ☃ }));
      }
      else
      {
        d(String.format("Error in SubmitTexturePointer: %s\n", new Object[] { ☃ }));
        
        H();
      }
      if (this.c != null) {
        this.c.b(☃);
      }
    }
    return ☃;
  }
  
  protected boolean a(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃))
    {
      d(ErrorCode.getString(☃));
      return false;
    }
    return true;
  }
  
  protected void d(String ☃)
  {
    this.F = ☃;
    E.a("<Error> " + ☃);
    D.error(bqn.a, "[Broadcast controller] {}", new Object[] { ☃ });
  }
  
  protected void e(String ☃)
  {
    E.a("<Warning> " + ☃);
    D.warn(bqn.a, "[Broadcast controller] {}", new Object[] { ☃ });
  }
  
  public static abstract interface b
  {
    public abstract void a(ErrorCode paramErrorCode, AuthToken paramAuthToken);
    
    public abstract void a(ErrorCode paramErrorCode);
    
    public abstract void a(ErrorCode paramErrorCode, GameInfo[] paramArrayOfGameInfo);
    
    public abstract void a(bqj.a parama);
    
    public abstract void a();
    
    public abstract void a(StreamInfo paramStreamInfo);
    
    public abstract void a(IngestList paramIngestList);
    
    public abstract void b(ErrorCode paramErrorCode);
    
    public abstract void b();
    
    public abstract void c();
    
    public abstract void c(ErrorCode paramErrorCode);
  }
  
  public static enum a
  {
    private a() {}
  }
}
