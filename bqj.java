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
        u = ☃;
        a(bqj.a.d);
      }
      else
      {
        u.data = "";
        a(bqj.a.b);
        
        String ☃ = ErrorCode.getString(☃);
        d(String.format("RequestAuthTokenDoneCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (c != null) {
          c.a(☃, ☃);
        }
      }
      catch (Exception ☃)
      {
        d(☃.toString());
      }
    }
    
    public void loginCallback(ErrorCode ☃, ChannelInfo ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        v = ☃;
        a(bqj.a.f);
        m = true;
      }
      else
      {
        a(bqj.a.b);
        m = false;
        
        String ☃ = ErrorCode.getString(☃);
        d(String.format("LoginCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (c != null) {
          c.a(☃);
        }
      }
      catch (Exception ☃)
      {
        d(☃.toString());
      }
    }
    
    public void getIngestServersCallback(ErrorCode ☃, IngestList ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        s = ☃;
        
        t = s.getDefaultServer();
        
        a(bqj.a.h);
        try
        {
          if (c != null) {
            c.a(☃);
          }
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
      }
      else
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("IngestListCallback got failure: %s", new Object[] { ☃ }));
        
        a(bqj.a.e);
      }
    }
    
    public void getUserInfoCallback(ErrorCode ☃, UserInfo ☃)
    {
      w = ☃;
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("UserInfoDoneCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getStreamInfoCallback(ErrorCode ☃, StreamInfo ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        x = ☃;
        try
        {
          if (c != null) {
            c.a(☃);
          }
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
      }
      else
      {
        String ☃ = ErrorCode.getString(☃);
        e(String.format("StreamInfoDoneCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getArchivingStateCallback(ErrorCode ☃, ArchivingState ☃)
    {
      y = ☃;
      if (ErrorCode.failed(☃)) {}
    }
    
    public void runCommercialCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        e(String.format("RunCommercialCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void setStreamInfoCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        e(String.format("SetStreamInfoCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void getGameNameListCallback(ErrorCode ☃, GameInfoList ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("GameNameListCallback got failure: %s", new Object[] { ☃ }));
      }
      try
      {
        if (c != null) {
          c.a(☃, ☃ == null ? new GameInfo[0] : list);
        }
      }
      catch (Exception ☃)
      {
        d(☃.toString());
      }
    }
    
    public void bufferUnlockCallback(long ☃)
    {
      FrameBuffer ☃ = FrameBuffer.lookupBuffer(☃);
      
      k.add(☃);
    }
    
    public void startCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        try
        {
          if (c != null) {
            c.b();
          }
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
        a(bqj.a.k);
      }
      else
      {
        q = null;
        r = null;
        
        a(bqj.a.i);
        try
        {
          if (c != null) {
            c.c(☃);
          }
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
        String ☃ = ErrorCode.getString(☃);
        d(String.format("startCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void stopCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        q = null;
        r = null;
        
        P();
        try
        {
          if (c != null) {
            c.c();
          }
        }
        catch (Exception ☃)
        {
          d(☃.toString());
        }
        if (m) {
          a(bqj.a.i);
        } else {
          a(bqj.a.b);
        }
      }
      else
      {
        a(bqj.a.i);
        
        String ☃ = ErrorCode.getString(☃);
        d(String.format("stopCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendActionMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("sendActionMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendStartSpanMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("sendStartSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
    
    public void sendEndSpanMetaDataCallback(ErrorCode ☃)
    {
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("sendEndSpanMetaDataCallback got failure: %s", new Object[] { ☃ }));
      }
    }
  };
  protected IStatCallbacks C = new IStatCallbacks()
  {
    public void statCallback(StatType ☃, long ☃) {}
  };
  
  public void a(bqj.b ☃)
  {
    c = ☃;
  }
  
  public boolean b()
  {
    return l;
  }
  
  public void a(String ☃)
  {
    d = ☃;
  }
  
  public StreamInfo j()
  {
    return x;
  }
  
  public ChannelInfo l()
  {
    return v;
  }
  
  public boolean m()
  {
    return (o == bqj.a.k) || (o == bqj.a.m);
  }
  
  public boolean n()
  {
    return o == bqj.a.i;
  }
  
  public boolean o()
  {
    return o == bqj.a.n;
  }
  
  public boolean p()
  {
    return o == bqj.a.m;
  }
  
  public boolean q()
  {
    return m;
  }
  
  public IngestServer s()
  {
    return t;
  }
  
  public void a(IngestServer ☃)
  {
    t = ☃;
  }
  
  public IngestList t()
  {
    return s;
  }
  
  public void a(float ☃)
  {
    i.setVolume(AudioDeviceType.TTV_RECORDER_DEVICE, ☃);
  }
  
  public void b(float ☃)
  {
    i.setVolume(AudioDeviceType.TTV_PLAYBACK_DEVICE, ☃);
  }
  
  public bql w()
  {
    return A;
  }
  
  public long x()
  {
    return i.getStreamTime();
  }
  
  protected boolean y()
  {
    return true;
  }
  
  public ErrorCode A()
  {
    return G;
  }
  
  public bqj()
  {
    h = Core.getInstance();
    if (Core.getInstance() == null) {
      h = new Core(new StandardCoreAPI());
    }
    i = new Stream(new DesktopStreamAPI());
  }
  
  protected PixelFormat B()
  {
    return PixelFormat.TTV_PF_RGBA;
  }
  
  public boolean C()
  {
    if (l) {
      return false;
    }
    i.setStreamCallbacks(B);
    
    ErrorCode ☃ = h.initialize(d, System.getProperty("java.library.path"));
    if (!a(☃))
    {
      i.setStreamCallbacks(null);
      G = ☃;
      return false;
    }
    ☃ = h.setTraceLevel(MessageLevel.TTV_ML_ERROR);
    if (!a(☃))
    {
      i.setStreamCallbacks(null);
      h.shutdown();
      G = ☃;
      return false;
    }
    if (ErrorCode.succeeded(☃))
    {
      l = true;
      a(bqj.a.b);
      return true;
    }
    G = ☃;
    h.shutdown();
    return false;
  }
  
  public boolean D()
  {
    if (!l) {
      return true;
    }
    if (o()) {
      return false;
    }
    n = true;
    
    F();
    
    i.setStreamCallbacks(null);
    i.setStatCallbacks(null);
    
    ErrorCode ☃ = h.shutdown();
    a(☃);
    
    l = false;
    n = false;
    a(bqj.a.a);
    
    return true;
  }
  
  public void E()
  {
    if (o != bqj.a.a)
    {
      if (A != null) {
        A.m();
      }
      while (A != null)
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
    if ((☃ == null) || (data == null) || (data.isEmpty()))
    {
      d("Auth token must be valid");
      return false;
    }
    p = ☃;
    u = ☃;
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
      i.stop(false);
    }
    p = "";
    u = new AuthToken();
    if (!m) {
      return false;
    }
    m = false;
    if (!n) {
      try
      {
        if (c != null) {
          c.a();
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
    if (!m) {
      return false;
    }
    if ((☃ == null) || (☃.equals(""))) {
      ☃ = p;
    }
    if (☃ == null) {
      ☃ = "";
    }
    if (☃ == null) {
      ☃ = "";
    }
    StreamInfoForSetting ☃ = new StreamInfoForSetting();
    streamTitle = ☃;
    gameName = ☃;
    
    ErrorCode ☃ = i.setStreamInfo(u, ☃, ☃);
    a(☃);
    
    return ErrorCode.succeeded(☃);
  }
  
  public boolean G()
  {
    if (!m()) {
      return false;
    }
    ErrorCode ☃ = i.runCommercial(u);
    a(☃);
    
    return ErrorCode.succeeded(☃);
  }
  
  public VideoParams a(int ☃, int ☃, float ☃, float ☃)
  {
    int[] ☃ = i.getMaxResolution(☃, ☃, ☃, ☃);
    
    VideoParams ☃ = new VideoParams();
    maxKbps = ☃;
    encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
    pixelFormat = B();
    targetFps = ☃;
    outputWidth = ☃[0];
    outputHeight = ☃[1];
    disableAdaptiveBitrate = false;
    verticalFlip = false;
    
    return ☃;
  }
  
  public boolean a(VideoParams ☃)
  {
    if ((☃ == null) || (!n())) {
      return false;
    }
    q = ☃.clone();
    
    r = new AudioParams();
    r.audioEnabled = ((g) && (y()));
    r.enableMicCapture = r.audioEnabled;
    r.enablePlaybackCapture = r.audioEnabled;
    r.enablePassthroughAudio = false;
    if (!O())
    {
      q = null;
      r = null;
      return false;
    }
    ErrorCode ☃ = i.start(☃, r, t, StartFlags.None, true);
    if (ErrorCode.failed(☃))
    {
      P();
      
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error while starting to broadcast: %s", new Object[] { ☃ }));
      
      q = null;
      r = null;
      
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
    ErrorCode ☃ = i.stop(true);
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
    ErrorCode ☃ = i.pauseVideo();
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
    ErrorCode ☃ = i.sendActionMetaData(u, ☃, ☃, ☃, ☃);
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
    long ☃ = i.sendStartSpanMetaData(u, ☃, ☃, ☃, ☃);
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
    ErrorCode ☃ = i.sendEndSpanMetaData(u, ☃, ☃, ☃, ☃, ☃);
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
    if (☃ == o) {
      return;
    }
    o = ☃;
    try
    {
      if (c != null) {
        c.a(☃);
      }
    }
    catch (Exception ☃)
    {
      d(☃.toString());
    }
  }
  
  public void K()
  {
    if ((i == null) || (!l)) {
      return;
    }
    ErrorCode ☃ = i.pollTasks();
    a(☃);
    if (o())
    {
      A.k();
      if (A.f())
      {
        A = null;
        a(bqj.a.i);
      }
    }
    switch (bqj.3.a[o.ordinal()])
    {
    case 1: 
      a(bqj.a.e);
      
      ☃ = i.login(u);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_Login: %s\n", new Object[] { ☃ }));
      }
      break;
    case 2: 
      a(bqj.a.g);
      
      ☃ = i.getIngestServers(u);
      if (ErrorCode.failed(☃))
      {
        a(bqj.a.f);
        
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_GetIngestServers: %s\n", new Object[] { ☃ }));
      }
      break;
    case 3: 
      a(bqj.a.i);
      
      ☃ = i.getUserInfo(u);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        d(String.format("Error in TTV_GetUserInfo: %s\n", new Object[] { ☃ }));
      }
      L();
      
      ☃ = i.getArchivingState(u);
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
    long ☃ = (☃ - z) / 1000000000L;
    if (☃ < 30L) {
      return;
    }
    z = ☃;
    
    ErrorCode ☃ = i.getStreamInfo(u, p);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      d(String.format("Error in TTV_GetStreamInfo: %s", new Object[] { ☃ }));
    }
  }
  
  public bql M()
  {
    if ((!n()) || (s == null)) {
      return null;
    }
    if (o()) {
      return null;
    }
    A = new bql(i, s);
    A.j();
    
    a(bqj.a.n);
    
    return A;
  }
  
  protected boolean O()
  {
    for (int ☃ = 0; ☃ < 3; ☃++)
    {
      FrameBuffer ☃ = i.allocateFrameBuffer(q.outputWidth * q.outputHeight * 4);
      if (!☃.getIsValid())
      {
        d(String.format("Error while allocating frame buffer", new Object[0]));
        return false;
      }
      j.add(☃);
      k.add(☃);
    }
    return true;
  }
  
  protected void P()
  {
    for (int ☃ = 0; ☃ < j.size(); ☃++)
    {
      FrameBuffer ☃ = (FrameBuffer)j.get(☃);
      ☃.free();
    }
    k.clear();
    j.clear();
  }
  
  public FrameBuffer Q()
  {
    if (k.size() == 0)
    {
      d(String.format("Out of free buffers, this should never happen", new Object[0]));
      return null;
    }
    FrameBuffer ☃ = (FrameBuffer)k.get(k.size() - 1);
    k.remove(k.size() - 1);
    
    return ☃;
  }
  
  public void a(FrameBuffer ☃)
  {
    try
    {
      i.captureFrameBuffer_ReadPixels(☃);
    }
    catch (Throwable ☃)
    {
      b ☃ = b.a(☃, "Trying to submit a frame to Twitch");
      c ☃ = ☃.a("Broadcast State");
      ☃.a("Last reported errors", Arrays.toString(E.c()));
      ☃.a("Buffer", ☃);
      ☃.a("Free buffer count", Integer.valueOf(k.size()));
      ☃.a("Capture buffer count", Integer.valueOf(j.size()));
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
    ErrorCode ☃ = i.submitVideoFrame(☃);
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
      if (c != null) {
        c.b(☃);
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
    F = ☃;
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
