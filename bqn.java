import com.google.common.base.Strings;
import com.google.common.collect.Maps;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.mojang.authlib.properties.Property;
import java.io.IOException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Set;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.Marker;
import org.apache.logging.log4j.MarkerManager;
import org.lwjgl.opengl.GL11;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.broadcast.ChannelInfo;
import tv.twitch.broadcast.EncodingCpuUsage;
import tv.twitch.broadcast.FrameBuffer;
import tv.twitch.broadcast.GameInfo;
import tv.twitch.broadcast.IngestList;
import tv.twitch.broadcast.IngestServer;
import tv.twitch.broadcast.StreamInfo;
import tv.twitch.broadcast.VideoParams;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class bqn
  implements bqj.b, bqk.e, bql.a, bqm
{
  private static final Logger b = ;
  public static final Marker a = MarkerManager.getMarker("STREAM");
  private final bqj c;
  private final bqk d;
  private String e;
  private final ave f;
  private final eu g = new fa("Twitch");
  private final Map<String, ChatUserInfo> h = Maps.newHashMap();
  private bfw i;
  private boolean j;
  private int k = 30;
  private long l = 0L;
  private boolean m = false;
  private boolean n;
  private boolean o;
  private boolean p;
  private bqm.a q = bqm.a.a;
  private static boolean r;
  
  public bqn(ave ☃, final Property ☃)
  {
    this.f = ☃;
    this.c = new bqj();
    this.d = new bqk();
    
    this.c.a(this);
    this.d.a(this);
    
    this.c.a("nmt37qblda36pvonovdkbopzfzw3wlq");
    this.d.a("nmt37qblda36pvonovdkbopzfzw3wlq");
    
    this.g.b().a(a.f);
    if ((☃ != null) && (!Strings.isNullOrEmpty(☃.getValue())) && (bqs.l))
    {
      Thread ☃ = new Thread("Twitch authenticator")
      {
        public void run()
        {
          try
          {
            URL ☃ = new URL("https://api.twitch.tv/kraken?oauth_token=" + URLEncoder.encode(☃.getValue(), "UTF-8"));
            String ☃ = nj.a(☃);
            JsonObject ☃ = ni.l(new JsonParser().parse(☃), "Response");
            JsonObject ☃ = ni.s(☃, "token");
            if (ni.i(☃, "valid"))
            {
              String ☃ = ni.h(☃, "user_name");
              bqn.G().debug(bqn.a, "Authenticated with twitch; username is {}", new Object[] { ☃ });
              AuthToken ☃ = new AuthToken();
              ☃.data = ☃.getValue();
              
              bqn.a(bqn.this).a(☃, ☃);
              bqn.b(bqn.this).c(☃);
              bqn.b(bqn.this).a(☃);
              
              Runtime.getRuntime().addShutdownHook(new Thread("Twitch shutdown hook")
              {
                public void run()
                {
                  bqn.this.f();
                }
              });
              bqn.a(bqn.this).C();
              
              bqn.b(bqn.this).n();
            }
            else
            {
              bqn.a(bqn.this, bqm.a.b);
              bqn.G().error(bqn.a, "Given twitch access token is invalid");
            }
          }
          catch (IOException ☃)
          {
            bqn.a(bqn.this, bqm.a.a);
            bqn.G().error(bqn.a, "Could not authenticate with twitch", ☃);
          }
        }
      };
      ☃.setDaemon(true);
      ☃.start();
    }
  }
  
  static
  {
    try
    {
      if (g.a() == g.a.c)
      {
        System.loadLibrary("avutil-ttv-51");
        System.loadLibrary("swresample-ttv-0");
        System.loadLibrary("libmp3lame-ttv");
        if (System.getProperty("os.arch").contains("64")) {
          System.loadLibrary("libmfxsw64");
        } else {
          System.loadLibrary("libmfxsw32");
        }
      }
      r = true;
    }
    catch (Throwable ☃)
    {
      r = false;
    }
  }
  
  public void f()
  {
    b.debug(a, "Shutdown streaming");
    
    this.c.E();
    
    this.d.p();
  }
  
  public void g()
  {
    int ☃ = this.f.t.S;
    boolean ☃ = (this.e != null) && (this.d.d(this.e));
    boolean ☃ = (this.d.h() == bqk.c.c) && ((this.e == null) || (this.d.e(this.e) == bqk.a.e));
    if (☃ == 2)
    {
      if (☃)
      {
        b.debug(a, "Disconnecting from twitch chat per user options");
        this.d.l(this.e);
      }
    }
    else if (☃ == 1)
    {
      if ((☃) && (this.c.q()))
      {
        b.debug(a, "Connecting to twitch chat per user options");
        F();
      }
    }
    else if (☃ == 0) {
      if ((☃) && (!k()))
      {
        b.debug(a, "Disconnecting from twitch chat as user is no longer streaming");
        this.d.l(this.e);
      }
      else if ((☃) && (k()))
      {
        b.debug(a, "Connecting to twitch chat as user is streaming");
        F();
      }
    }
    this.c.K();
    this.d.q();
  }
  
  protected void F()
  {
    bqk.c ☃ = this.d.h();
    String ☃ = this.c.l().name;
    this.e = ☃;
    if (☃ != bqk.c.c) {
      b.warn("Invalid twitch chat state {}", new Object[] { ☃ });
    } else if (this.d.e(this.e) == bqk.a.e) {
      this.d.j(☃);
    } else {
      b.warn("Invalid twitch chat state {}", new Object[] { ☃ });
    }
  }
  
  public void h()
  {
    if ((!this.c.m()) || (this.c.p())) {
      return;
    }
    long ☃ = System.nanoTime();
    long ☃ = 1000000000 / this.k;
    
    long ☃ = ☃ - this.l;
    boolean ☃ = ☃ >= ☃;
    if (☃)
    {
      FrameBuffer ☃ = this.c.Q();
      
      bfw ☃ = this.f.b();
      
      this.i.a(true);
      
      bfl.n(5889);
      bfl.E();
      bfl.D();
      
      bfl.a(0.0D, this.i.c, this.i.d, 0.0D, 1000.0D, 3000.0D);
      bfl.n(5888);
      bfl.E();
      bfl.D();
      
      bfl.b(0.0F, 0.0F, -2000.0F);
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
      
      bfl.b(0, 0, this.i.c, this.i.d);
      
      bfl.w();
      bfl.c();
      bfl.k();
      
      float ☃ = this.i.c;
      float ☃ = this.i.d;
      float ☃ = ☃.c / ☃.a;
      float ☃ = ☃.d / ☃.b;
      
      ☃.c();
      GL11.glTexParameterf(3553, 10241, 9729.0F);
      GL11.glTexParameterf(3553, 10240, 9729.0F);
      
      bfx ☃ = bfx.a();
      bfd ☃ = ☃.c();
      ☃.a(7, bms.g);
      ☃.b(0.0D, ☃, 0.0D).a(0.0D, ☃).d();
      ☃.b(☃, ☃, 0.0D).a(☃, ☃).d();
      ☃.b(☃, 0.0D, 0.0D).a(☃, 0.0D).d();
      ☃.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).d();
      ☃.b();
      
      ☃.d();
      
      bfl.F();
      bfl.n(5889);
      bfl.F();
      bfl.n(5888);
      
      this.c.a(☃);
      this.i.e();
      
      this.c.b(☃);
      this.l = ☃;
    }
  }
  
  public boolean i()
  {
    return this.c.q();
  }
  
  public boolean j()
  {
    return this.c.n();
  }
  
  public boolean k()
  {
    return this.c.m();
  }
  
  public void a(bqh ☃, long ☃)
  {
    if ((!k()) || (!this.j)) {
      return;
    }
    long ☃ = this.c.x();
    if (!this.c.a(☃.c(), ☃ + ☃, ☃.a(), ☃.b())) {
      b.warn(a, "Couldn't send stream metadata action at {}: {}", new Object[] { Long.valueOf(☃ + ☃), ☃ });
    } else {
      b.debug(a, "Sent stream metadata action at {}: {}", new Object[] { Long.valueOf(☃ + ☃), ☃ });
    }
  }
  
  public void a(bqh ☃, long ☃, long ☃)
  {
    if ((!k()) || (!this.j)) {
      return;
    }
    long ☃ = this.c.x();
    String ☃ = ☃.a();
    String ☃ = ☃.b();
    
    long ☃ = this.c.b(☃.c(), ☃ + ☃, ☃, ☃);
    if (☃ < 0L) {
      b.warn(a, "Could not send stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(☃ + ☃), Long.valueOf(☃ + ☃), ☃ });
    } else if (this.c.a(☃.c(), ☃ + ☃, ☃, ☃, ☃)) {
      b.debug(a, "Sent stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(☃ + ☃), Long.valueOf(☃ + ☃), ☃ });
    } else {
      b.warn(a, "Half-sent stream metadata sequence from {} to {}: {}", new Object[] { Long.valueOf(☃ + ☃), Long.valueOf(☃ + ☃), ☃ });
    }
  }
  
  public boolean l()
  {
    return this.c.p();
  }
  
  public void m()
  {
    if (this.c.G()) {
      b.debug(a, "Requested commercial from Twitch");
    } else {
      b.warn(a, "Could not request commercial from Twitch");
    }
  }
  
  public void n()
  {
    this.c.I();
    this.o = true;
    
    p();
  }
  
  public void o()
  {
    this.c.J();
    this.o = false;
    
    p();
  }
  
  public void p()
  {
    if (k())
    {
      float ☃ = this.f.t.M;
      boolean ☃ = (this.o) || (☃ <= 0.0F);
      this.c.b(☃ ? 0.0F : ☃);
      
      this.c.a(D() ? 0.0F : this.f.t.L);
    }
  }
  
  public void q()
  {
    avh ☃ = this.f.t;
    VideoParams ☃ = this.c.a(b(☃.N), a(☃.O), c(☃.K), this.f.d / this.f.e);
    switch (☃.P)
    {
    case 2: 
      ☃.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_HIGH;
      break;
    case 1: 
      ☃.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_MEDIUM;
      break;
    case 0: 
      ☃.encodingCpuUsage = EncodingCpuUsage.TTV_ECU_LOW;
    }
    if (this.i == null) {
      this.i = new bfw(☃.outputWidth, ☃.outputHeight, false);
    } else {
      this.i.a(☃.outputWidth, ☃.outputHeight);
    }
    if ((☃.R != null) && (☃.R.length() > 0)) {
      for (IngestServer ☃ : s()) {
        if (☃.serverUrl.equals(☃.R))
        {
          this.c.a(☃);
          break;
        }
      }
    }
    this.k = ☃.targetFps;
    this.j = ☃.Q;
    this.c.a(☃);
    
    b.info(a, "Streaming at {}/{} at {} kbps to {}", new Object[] { Integer.valueOf(☃.outputWidth), Integer.valueOf(☃.outputHeight), Integer.valueOf(☃.maxKbps), this.c.s().serverUrl });
    this.c.a(null, "Minecraft", null);
  }
  
  public void r()
  {
    if (this.c.H()) {
      b.info(a, "Stopped streaming to Twitch");
    } else {
      b.warn(a, "Could not stop streaming to Twitch");
    }
  }
  
  public void a(ErrorCode ☃)
  {
    if (ErrorCode.succeeded(☃))
    {
      b.debug(a, "Login attempt successful");
      this.n = true;
    }
    else
    {
      b.warn(a, "Login attempt unsuccessful: {} (error code {})", new Object[] { ErrorCode.getString(☃), Integer.valueOf(☃.getValue()) });
      this.n = false;
    }
  }
  
  public void a(bqj.a ☃)
  {
    b.debug(a, "Broadcast state changed to {}", new Object[] { ☃ });
    if (☃ == bqj.a.b) {
      this.c.a(bqj.a.d);
    }
  }
  
  public void a()
  {
    b.info(a, "Logged out of twitch");
  }
  
  public void a(StreamInfo ☃)
  {
    b.debug(a, "Stream info updated; {} viewers on stream ID {}", new Object[] { Integer.valueOf(☃.viewers), Long.valueOf(☃.streamId) });
  }
  
  public void b(ErrorCode ☃)
  {
    b.warn(a, "Issue submitting frame: {} (Error code {})", new Object[] { ErrorCode.getString(☃), Integer.valueOf(☃.getValue()) });
    this.f.q.d().a(new fa("Issue streaming frame: " + ☃ + " (" + ErrorCode.getString(☃) + ")"), 2);
  }
  
  public void b()
  {
    p();
    b.info(a, "Broadcast to Twitch has started");
  }
  
  public void c()
  {
    b.info(a, "Broadcast to Twitch has stopped");
  }
  
  public void c(ErrorCode ☃)
  {
    if (☃ == ErrorCode.TTV_EC_SOUNDFLOWER_NOT_INSTALLED)
    {
      eu ☃ = new fb("stream.unavailable.soundflower.chat.link", new Object[0]);
      ☃.b().a(new et(et.a.a, "https://help.mojang.com/customer/portal/articles/1374877-configuring-soundflower-for-streaming-on-apple-computers"));
      ☃.b().d(Boolean.valueOf(true));
      eu ☃ = new fb("stream.unavailable.soundflower.chat", new Object[] { ☃ });
      ☃.b().a(a.e);
      this.f.q.d().a(☃);
    }
    else
    {
      eu ☃ = new fb("stream.unavailable.unknown.chat", new Object[] { ErrorCode.getString(☃) });
      ☃.b().a(a.e);
      this.f.q.d().a(☃);
    }
  }
  
  public void a(bql ☃, bql.b ☃)
  {
    b.debug(a, "Ingest test state changed to {}", new Object[] { ☃ });
    if (☃ == bql.b.f) {
      this.m = true;
    }
  }
  
  public static int a(float ☃)
  {
    return ns.d(10.0F + ☃ * 50.0F);
  }
  
  public static int b(float ☃)
  {
    return ns.d(230.0F + ☃ * 3270.0F);
  }
  
  public static float c(float ☃)
  {
    return 0.1F + ☃ * 0.1F;
  }
  
  public IngestServer[] s()
  {
    return this.c.t().getServers();
  }
  
  public void u()
  {
    bql ☃ = this.c.M();
    if (☃ != null) {
      ☃.a(this);
    }
  }
  
  public bql v()
  {
    return this.c.w();
  }
  
  public boolean w()
  {
    return this.c.o();
  }
  
  public int x()
  {
    return k() ? this.c.j().viewers : 0;
  }
  
  public void d(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃)) {
      b.error(a, "Chat failed to initialize");
    }
  }
  
  public void e(ErrorCode ☃)
  {
    if (ErrorCode.failed(☃)) {
      b.error(a, "Chat failed to shutdown");
    }
  }
  
  public void a(String ☃, ChatRawMessage[] ☃)
  {
    for (ChatRawMessage ☃ : ☃)
    {
      a(☃.userName, ☃);
      if (a(☃.modes, ☃.subscriptions, this.f.t.T))
      {
        eu ☃ = new fa(☃.userName);
        eu ☃ = new fb("chat.stream." + (☃.action ? "emote" : "text"), new Object[] { this.g, ☃, a.a(☃.message) });
        if (☃.action) {
          ☃.b().b(Boolean.valueOf(true));
        }
        eu ☃ = new fa("");
        ☃.a(new fb("stream.userinfo.chatTooltip", new Object[0]));
        for (eu ☃ : bab.a(☃.modes, ☃.subscriptions, null))
        {
          ☃.a("\n");
          ☃.a(☃);
        }
        ☃.b().a(new ew(ew.a.a, ☃));
        ☃.b().a(new et(et.a.d, ☃.userName));
        
        this.f.q.d().a(☃);
      }
    }
  }
  
  private void a(String ☃, ChatRawMessage ☃)
  {
    ChatUserInfo ☃ = (ChatUserInfo)this.h.get(☃);
    if (☃ == null)
    {
      ☃ = new ChatUserInfo();
      ☃.displayName = ☃;
      this.h.put(☃, ☃);
    }
    ☃.subscriptions = ☃.subscriptions;
    ☃.modes = ☃.modes;
    ☃.nameColorARGB = ☃.nameColorARGB;
  }
  
  private boolean a(Set<ChatUserMode> ☃, Set<ChatUserSubscription> ☃, int ☃)
  {
    if (☃.contains(ChatUserMode.TTV_CHAT_USERMODE_BANNED)) {
      return false;
    }
    if (☃.contains(ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)) {
      return true;
    }
    if (☃.contains(ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)) {
      return true;
    }
    if (☃.contains(ChatUserMode.TTV_CHAT_USERMODE_STAFF)) {
      return true;
    }
    if (☃ == 0) {
      return true;
    }
    if (☃ == 1) {
      return ☃.contains(ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER);
    }
    return false;
  }
  
  public void a(String ☃, ChatUserInfo[] ☃, ChatUserInfo[] ☃, ChatUserInfo[] ☃)
  {
    for (ChatUserInfo ☃ : ☃) {
      this.h.remove(☃.displayName);
    }
    for (ChatUserInfo ☃ : ☃) {
      this.h.put(☃.displayName, ☃);
    }
    for (ChatUserInfo ☃ : ☃) {
      this.h.put(☃.displayName, ☃);
    }
  }
  
  public void a(String ☃)
  {
    b.debug(a, "Chat connected");
  }
  
  public void b(String ☃)
  {
    b.debug(a, "Chat disconnected");
    this.h.clear();
  }
  
  public boolean y()
  {
    return (this.e != null) && (this.e.equals(this.c.l().name));
  }
  
  public String z()
  {
    return this.e;
  }
  
  public ChatUserInfo e(String ☃)
  {
    return (ChatUserInfo)this.h.get(☃);
  }
  
  public void f(String ☃)
  {
    this.d.a(this.e, ☃);
  }
  
  public boolean A()
  {
    return (r) && (this.c.b());
  }
  
  public ErrorCode B()
  {
    if (!r) {
      return ErrorCode.TTV_EC_OS_TOO_OLD;
    }
    return this.c.A();
  }
  
  public boolean C()
  {
    return this.n;
  }
  
  public void a(boolean ☃)
  {
    this.p = ☃;
    p();
  }
  
  public boolean D()
  {
    boolean ☃ = this.f.t.U == 1;
    
    return (this.o) || (this.f.t.L <= 0.0F) || (☃ != this.p);
  }
  
  public bqm.a E()
  {
    return this.q;
  }
  
  public void a(ErrorCode ☃, AuthToken ☃) {}
  
  public void a(ErrorCode ☃, GameInfo[] ☃) {}
  
  public void a(IngestList ☃) {}
  
  public void a(bqk.c ☃) {}
  
  public void a(String ☃, ChatTokenizedMessage[] ☃) {}
  
  public void a(String ☃, String ☃) {}
  
  public void d() {}
  
  public void e() {}
  
  public void c(String ☃) {}
  
  public void d(String ☃) {}
}
