import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import tv.twitch.AuthToken;
import tv.twitch.Core;
import tv.twitch.ErrorCode;
import tv.twitch.StandardCoreAPI;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEmoticonData;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizationOption;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatAPIListener;
import tv.twitch.chat.IChatChannelListener;
import tv.twitch.chat.StandardChatAPI;

public class bqk
{
  private static final Logger q = ;
  protected bqk.e a = null;
  protected String b = "";
  protected String c = "";
  protected String d = "";
  protected Core e = null;
  protected Chat f = null;
  protected bqk.c g = bqk.c.a;
  protected AuthToken h = new AuthToken();
  protected HashMap<String, bqk.b> i = new HashMap();
  protected int j = 128;
  protected bqk.d k = bqk.d.a;
  protected bqk.d l = bqk.d.a;
  protected ChatEmoticonData m = null;
  protected int n = 500;
  protected int o = 2000;
  protected IChatAPIListener p = new IChatAPIListener()
  {
    public void chatInitializationCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        bqk.this.f.setMessageFlushInterval(bqk.this.n);
        bqk.this.f.setUserChangeEventInterval(bqk.this.o);
        
        bqk.this.r();
        
        bqk.this.a(bqk.c.c);
      }
      else
      {
        bqk.this.a(bqk.c.a);
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.d(☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    public void chatShutdownCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        ErrorCode ☃ = bqk.this.e.shutdown();
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          bqk.this.n(String.format("Error shutting down the Twitch sdk: %s", new Object[] { ☃ }));
        }
        bqk.this.a(bqk.c.a);
      }
      else
      {
        bqk.this.a(bqk.c.c);
        
        bqk.this.n(String.format("Error shutting down Twith chat: %s", new Object[] { ☃ }));
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.e(☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    public void chatEmoticonDataDownloadCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃)) {
        bqk.this.s();
      }
    }
  };
  
  public class b
    implements IChatChannelListener
  {
    protected String a = null;
    protected boolean b = false;
    protected bqk.a c = bqk.a.a;
    protected List<ChatUserInfo> d = Lists.newArrayList();
    protected LinkedList<ChatRawMessage> e = new LinkedList();
    protected LinkedList<ChatTokenizedMessage> f = new LinkedList();
    protected ChatBadgeData g = null;
    
    public b(String ☃)
    {
      this.a = ☃;
    }
    
    public bqk.a a()
    {
      return this.c;
    }
    
    public boolean a(boolean ☃)
    {
      this.b = ☃;
      
      ErrorCode ☃ = ErrorCode.TTV_EC_SUCCESS;
      if (☃) {
        ☃ = bqk.this.f.connectAnonymous(this.a, this);
      } else {
        ☃ = bqk.this.f.connect(this.a, bqk.this.b, bqk.this.h.data, this);
      }
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqk.this.n(String.format("Error connecting: %s", new Object[] { ☃ }));
        
        d(this.a);
        
        return false;
      }
      a(bqk.a.b);
      h();
      
      return true;
    }
    
    public boolean g()
    {
      switch (bqk.2.a[this.c.ordinal()])
      {
      case 1: 
      case 2: 
        ErrorCode ☃ = bqk.this.f.disconnect(this.a);
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          bqk.this.n(String.format("Error disconnecting: %s", new Object[] { ☃ }));
          
          return false;
        }
        a(bqk.a.d);
        return true;
      }
      return false;
    }
    
    protected void a(bqk.a ☃)
    {
      if (☃ == this.c) {
        return;
      }
      this.c = ☃;
    }
    
    public void a(String ☃)
    {
      if (bqk.this.l == bqk.d.a)
      {
        this.e.clear();
        this.f.clear();
      }
      else
      {
        if (this.e.size() > 0)
        {
          ListIterator<ChatRawMessage> ☃ = this.e.listIterator();
          while (☃.hasNext())
          {
            ChatRawMessage ☃ = (ChatRawMessage)☃.next();
            if (☃.userName.equals(☃)) {
              ☃.remove();
            }
          }
        }
        if (this.f.size() > 0)
        {
          ListIterator<ChatTokenizedMessage> ☃ = this.f.listIterator();
          while (☃.hasNext())
          {
            ChatTokenizedMessage ☃ = (ChatTokenizedMessage)☃.next();
            if (☃.displayName.equals(☃)) {
              ☃.remove();
            }
          }
        }
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.a(this.a, ☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    public boolean b(String ☃)
    {
      if (this.c != bqk.a.c) {
        return false;
      }
      ErrorCode ☃ = bqk.this.f.sendMessage(this.a, ☃);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        bqk.this.n(String.format("Error sending chat message: %s", new Object[] { ☃ }));
        
        return false;
      }
      return true;
    }
    
    protected void h()
    {
      if (bqk.this.l == bqk.d.a) {
        return;
      }
      if (this.g == null)
      {
        ErrorCode ☃ = bqk.this.f.downloadBadgeData(this.a);
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          bqk.this.n(String.format("Error trying to download badge data: %s", new Object[] { ☃ }));
        }
      }
    }
    
    protected void i()
    {
      if (this.g != null) {
        return;
      }
      this.g = new ChatBadgeData();
      ErrorCode ☃ = bqk.this.f.getBadgeData(this.a, this.g);
      if (ErrorCode.succeeded(☃)) {
        try
        {
          if (bqk.this.a != null) {
            bqk.this.a.c(this.a);
          }
        }
        catch (Exception ☃)
        {
          bqk.this.n(☃.toString());
        }
      } else {
        bqk.this.n("Error preparing badge data: " + ErrorCode.getString(☃));
      }
    }
    
    protected void j()
    {
      if (this.g == null) {
        return;
      }
      ErrorCode ☃ = bqk.this.f.clearBadgeData(this.a);
      if (ErrorCode.succeeded(☃))
      {
        this.g = null;
        try
        {
          if (bqk.this.a != null) {
            bqk.this.a.d(this.a);
          }
        }
        catch (Exception ☃)
        {
          bqk.this.n(☃.toString());
        }
      }
      else
      {
        bqk.this.n("Error releasing badge data: " + ErrorCode.getString(☃));
      }
    }
    
    protected void c(String ☃)
    {
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.a(☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    protected void d(String ☃)
    {
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.b(☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    private void k()
    {
      if (this.c != bqk.a.e)
      {
        a(bqk.a.e);
        d(this.a);
        j();
      }
    }
    
    public void chatStatusCallback(String ☃, ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃)) {
        return;
      }
      bqk.this.i.remove(☃);
      
      k();
    }
    
    public void chatChannelMembershipCallback(String ☃, ChatEvent ☃, ChatChannelInfo ☃)
    {
      switch (bqk.2.b[☃.ordinal()])
      {
      case 1: 
        a(bqk.a.c);
        c(☃);
        break;
      case 2: 
        k();
        break;
      }
    }
    
    public void chatChannelUserChangeCallback(String ☃, ChatUserInfo[] ☃, ChatUserInfo[] ☃, ChatUserInfo[] ☃)
    {
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        int ☃ = this.d.indexOf(☃[☃]);
        if (☃ >= 0) {
          this.d.remove(☃);
        }
      }
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        int ☃ = this.d.indexOf(☃[☃]);
        if (☃ >= 0) {
          this.d.remove(☃);
        }
        this.d.add(☃[☃]);
      }
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        this.d.add(☃[☃]);
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.a(this.a, ☃, ☃, ☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
    }
    
    public void chatChannelRawMessageCallback(String ☃, ChatRawMessage[] ☃)
    {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        this.e.addLast(☃[☃]);
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.a(this.a, ☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
      while (this.e.size() > bqk.this.j) {
        this.e.removeFirst();
      }
    }
    
    public void chatChannelTokenizedMessageCallback(String ☃, ChatTokenizedMessage[] ☃)
    {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        this.f.addLast(☃[☃]);
      }
      try
      {
        if (bqk.this.a != null) {
          bqk.this.a.a(this.a, ☃);
        }
      }
      catch (Exception ☃)
      {
        bqk.this.n(☃.toString());
      }
      while (this.f.size() > bqk.this.j) {
        this.f.removeFirst();
      }
    }
    
    public void chatClearCallback(String ☃, String ☃)
    {
      a(☃);
    }
    
    public void chatBadgeDataDownloadCallback(String ☃, ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃)) {
        i();
      }
    }
  }
  
  public void a(bqk.e ☃)
  {
    this.a = ☃;
  }
  
  public void a(AuthToken ☃)
  {
    this.h = ☃;
  }
  
  public void a(String ☃)
  {
    this.c = ☃;
  }
  
  public void c(String ☃)
  {
    this.b = ☃;
  }
  
  public bqk.c h()
  {
    return this.g;
  }
  
  public boolean d(String ☃)
  {
    if (!this.i.containsKey(☃)) {
      return false;
    }
    bqk.b ☃ = (bqk.b)this.i.get(☃);
    return ☃.a() == bqk.a.c;
  }
  
  public bqk.a e(String ☃)
  {
    if (!this.i.containsKey(☃)) {
      return bqk.a.e;
    }
    bqk.b ☃ = (bqk.b)this.i.get(☃);
    return ☃.a();
  }
  
  public bqk()
  {
    this.e = Core.getInstance();
    if (this.e == null) {
      this.e = new Core(new StandardCoreAPI());
    }
    this.f = new Chat(new StandardChatAPI());
  }
  
  public boolean n()
  {
    if (this.g != bqk.c.a) {
      return false;
    }
    a(bqk.c.b);
    
    ErrorCode ☃ = this.e.initialize(this.c, null);
    if (ErrorCode.failed(☃))
    {
      a(bqk.c.a);
      
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error initializing Twitch sdk: %s", new Object[] { ☃ }));
      
      return false;
    }
    this.l = this.k;
    
    HashSet<ChatTokenizationOption> ☃ = new HashSet();
    switch (bqk.2.c[this.k.ordinal()])
    {
    case 1: 
      ☃.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_NONE);
      break;
    case 2: 
      ☃.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_URLS);
      break;
    case 3: 
      ☃.add(ChatTokenizationOption.TTV_CHAT_TOKENIZATION_OPTION_EMOTICON_TEXTURES);
    }
    ☃ = this.f.initialize(☃, this.p);
    if (ErrorCode.failed(☃))
    {
      this.e.shutdown();
      a(bqk.c.a);
      
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error initializing Twitch chat: %s", new Object[] { ☃ }));
      
      return false;
    }
    a(bqk.c.c);
    return true;
  }
  
  public boolean j(String ☃)
  {
    return a(☃, false);
  }
  
  protected boolean a(String ☃, boolean ☃)
  {
    if (this.g != bqk.c.c) {
      return false;
    }
    if (this.i.containsKey(☃))
    {
      n("Already in channel: " + ☃);
      return false;
    }
    if ((☃ == null) || (☃.equals(""))) {
      return false;
    }
    bqk.b ☃ = new bqk.b(☃);
    this.i.put(☃, ☃);
    
    boolean ☃ = ☃.a(☃);
    if (!☃) {
      this.i.remove(☃);
    }
    return ☃;
  }
  
  public boolean l(String ☃)
  {
    if (this.g != bqk.c.c) {
      return false;
    }
    if (!this.i.containsKey(☃))
    {
      n("Not in channel: " + ☃);
      return false;
    }
    bqk.b ☃ = (bqk.b)this.i.get(☃);
    return ☃.g();
  }
  
  public boolean o()
  {
    if (this.g != bqk.c.c) {
      return false;
    }
    ErrorCode ☃ = this.f.shutdown();
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error shutting down chat: %s", new Object[] { ☃ }));
      
      return false;
    }
    t();
    
    a(bqk.c.d);
    
    return true;
  }
  
  public void p()
  {
    if (h() != bqk.c.a)
    {
      o();
      if (h() == bqk.c.d) {
        while (h() != bqk.c.a) {
          try
          {
            Thread.sleep(200L);
            q();
          }
          catch (InterruptedException localInterruptedException) {}
        }
      }
    }
  }
  
  public void q()
  {
    if (this.g == bqk.c.a) {
      return;
    }
    ErrorCode ☃ = this.f.flushEvents();
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error flushing chat events: %s", new Object[] { ☃ }));
    }
  }
  
  public boolean a(String ☃, String ☃)
  {
    if (this.g != bqk.c.c) {
      return false;
    }
    if (!this.i.containsKey(☃))
    {
      n("Not in channel: " + ☃);
      return false;
    }
    bqk.b ☃ = (bqk.b)this.i.get(☃);
    return ☃.b(☃);
  }
  
  protected void a(bqk.c ☃)
  {
    if (☃ == this.g) {
      return;
    }
    this.g = ☃;
    try
    {
      if (this.a != null) {
        this.a.a(☃);
      }
    }
    catch (Exception ☃)
    {
      n(☃.toString());
    }
  }
  
  protected void r()
  {
    if (this.l == bqk.d.a) {
      return;
    }
    if (this.m == null)
    {
      ErrorCode ☃ = this.f.downloadEmoticonData();
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        n(String.format("Error trying to download emoticon data: %s", new Object[] { ☃ }));
      }
    }
  }
  
  protected void s()
  {
    if (this.m != null) {
      return;
    }
    this.m = new ChatEmoticonData();
    ErrorCode ☃ = this.f.getEmoticonData(this.m);
    if (ErrorCode.succeeded(☃)) {
      try
      {
        if (this.a != null) {
          this.a.d();
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    } else {
      n("Error preparing emoticon data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void t()
  {
    if (this.m == null) {
      return;
    }
    ErrorCode ☃ = this.f.clearEmoticonData();
    if (ErrorCode.succeeded(☃))
    {
      this.m = null;
      try
      {
        if (this.a != null) {
          this.a.e();
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    else
    {
      n("Error clearing emoticon data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void n(String ☃)
  {
    q.error(bqn.a, "[Chat controller] {}", new Object[] { ☃ });
  }
  
  public static abstract interface e
  {
    public abstract void d(ErrorCode paramErrorCode);
    
    public abstract void e(ErrorCode paramErrorCode);
    
    public abstract void d();
    
    public abstract void e();
    
    public abstract void a(bqk.c paramc);
    
    public abstract void a(String paramString, ChatTokenizedMessage[] paramArrayOfChatTokenizedMessage);
    
    public abstract void a(String paramString, ChatRawMessage[] paramArrayOfChatRawMessage);
    
    public abstract void a(String paramString, ChatUserInfo[] paramArrayOfChatUserInfo1, ChatUserInfo[] paramArrayOfChatUserInfo2, ChatUserInfo[] paramArrayOfChatUserInfo3);
    
    public abstract void a(String paramString);
    
    public abstract void b(String paramString);
    
    public abstract void a(String paramString1, String paramString2);
    
    public abstract void c(String paramString);
    
    public abstract void d(String paramString);
  }
  
  public static enum d
  {
    private d() {}
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum c
  {
    private c() {}
  }
}
