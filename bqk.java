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
        f.setMessageFlushInterval(n);
        f.setUserChangeEventInterval(o);
        
        r();
        
        a(bqk.c.c);
      }
      else
      {
        a(bqk.c.a);
      }
      try
      {
        if (a != null) {
          a.d(☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    public void chatShutdownCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃))
      {
        ErrorCode ☃ = e.shutdown();
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          n(String.format("Error shutting down the Twitch sdk: %s", new Object[] { ☃ }));
        }
        a(bqk.c.a);
      }
      else
      {
        a(bqk.c.c);
        
        n(String.format("Error shutting down Twith chat: %s", new Object[] { ☃ }));
      }
      try
      {
        if (a != null) {
          a.e(☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    public void chatEmoticonDataDownloadCallback(ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃)) {
        s();
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
      a = ☃;
    }
    
    public bqk.a a()
    {
      return c;
    }
    
    public boolean a(boolean ☃)
    {
      b = ☃;
      
      ErrorCode ☃ = ErrorCode.TTV_EC_SUCCESS;
      if (☃) {
        ☃ = f.connectAnonymous(a, this);
      } else {
        ☃ = f.connect(a, b, h.data, this);
      }
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        n(String.format("Error connecting: %s", new Object[] { ☃ }));
        
        d(a);
        
        return false;
      }
      a(bqk.a.b);
      h();
      
      return true;
    }
    
    public boolean g()
    {
      switch (bqk.2.a[c.ordinal()])
      {
      case 1: 
      case 2: 
        ErrorCode ☃ = f.disconnect(a);
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          n(String.format("Error disconnecting: %s", new Object[] { ☃ }));
          
          return false;
        }
        a(bqk.a.d);
        return true;
      }
      return false;
    }
    
    protected void a(bqk.a ☃)
    {
      if (☃ == c) {
        return;
      }
      c = ☃;
    }
    
    public void a(String ☃)
    {
      if (l == bqk.d.a)
      {
        e.clear();
        f.clear();
      }
      else
      {
        if (e.size() > 0)
        {
          ListIterator<ChatRawMessage> ☃ = e.listIterator();
          while (☃.hasNext())
          {
            ChatRawMessage ☃ = (ChatRawMessage)☃.next();
            if (userName.equals(☃)) {
              ☃.remove();
            }
          }
        }
        if (f.size() > 0)
        {
          ListIterator<ChatTokenizedMessage> ☃ = f.listIterator();
          while (☃.hasNext())
          {
            ChatTokenizedMessage ☃ = (ChatTokenizedMessage)☃.next();
            if (displayName.equals(☃)) {
              ☃.remove();
            }
          }
        }
      }
      try
      {
        if (a != null) {
          a.a(a, ☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    public boolean b(String ☃)
    {
      if (c != bqk.a.c) {
        return false;
      }
      ErrorCode ☃ = f.sendMessage(a, ☃);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        n(String.format("Error sending chat message: %s", new Object[] { ☃ }));
        
        return false;
      }
      return true;
    }
    
    protected void h()
    {
      if (l == bqk.d.a) {
        return;
      }
      if (g == null)
      {
        ErrorCode ☃ = f.downloadBadgeData(a);
        if (ErrorCode.failed(☃))
        {
          String ☃ = ErrorCode.getString(☃);
          n(String.format("Error trying to download badge data: %s", new Object[] { ☃ }));
        }
      }
    }
    
    protected void i()
    {
      if (g != null) {
        return;
      }
      g = new ChatBadgeData();
      ErrorCode ☃ = f.getBadgeData(a, g);
      if (ErrorCode.succeeded(☃)) {
        try
        {
          if (a != null) {
            a.c(a);
          }
        }
        catch (Exception ☃)
        {
          n(☃.toString());
        }
      } else {
        n("Error preparing badge data: " + ErrorCode.getString(☃));
      }
    }
    
    protected void j()
    {
      if (g == null) {
        return;
      }
      ErrorCode ☃ = f.clearBadgeData(a);
      if (ErrorCode.succeeded(☃))
      {
        g = null;
        try
        {
          if (a != null) {
            a.d(a);
          }
        }
        catch (Exception ☃)
        {
          n(☃.toString());
        }
      }
      else
      {
        n("Error releasing badge data: " + ErrorCode.getString(☃));
      }
    }
    
    protected void c(String ☃)
    {
      try
      {
        if (a != null) {
          a.a(☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    protected void d(String ☃)
    {
      try
      {
        if (a != null) {
          a.b(☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    private void k()
    {
      if (c != bqk.a.e)
      {
        a(bqk.a.e);
        d(a);
        j();
      }
    }
    
    public void chatStatusCallback(String ☃, ErrorCode ☃)
    {
      if (ErrorCode.succeeded(☃)) {
        return;
      }
      i.remove(☃);
      
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
        int ☃ = d.indexOf(☃[☃]);
        if (☃ >= 0) {
          d.remove(☃);
        }
      }
      for (int ☃ = 0; ☃ < ☃.length; ☃++)
      {
        int ☃ = d.indexOf(☃[☃]);
        if (☃ >= 0) {
          d.remove(☃);
        }
        d.add(☃[☃]);
      }
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        d.add(☃[☃]);
      }
      try
      {
        if (a != null) {
          a.a(a, ☃, ☃, ☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
    }
    
    public void chatChannelRawMessageCallback(String ☃, ChatRawMessage[] ☃)
    {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        e.addLast(☃[☃]);
      }
      try
      {
        if (a != null) {
          a.a(a, ☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
      while (e.size() > j) {
        e.removeFirst();
      }
    }
    
    public void chatChannelTokenizedMessageCallback(String ☃, ChatTokenizedMessage[] ☃)
    {
      for (int ☃ = 0; ☃ < ☃.length; ☃++) {
        f.addLast(☃[☃]);
      }
      try
      {
        if (a != null) {
          a.a(a, ☃);
        }
      }
      catch (Exception ☃)
      {
        n(☃.toString());
      }
      while (f.size() > j) {
        f.removeFirst();
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
    a = ☃;
  }
  
  public void a(AuthToken ☃)
  {
    h = ☃;
  }
  
  public void a(String ☃)
  {
    c = ☃;
  }
  
  public void c(String ☃)
  {
    b = ☃;
  }
  
  public bqk.c h()
  {
    return g;
  }
  
  public boolean d(String ☃)
  {
    if (!i.containsKey(☃)) {
      return false;
    }
    bqk.b ☃ = (bqk.b)i.get(☃);
    return ☃.a() == bqk.a.c;
  }
  
  public bqk.a e(String ☃)
  {
    if (!i.containsKey(☃)) {
      return bqk.a.e;
    }
    bqk.b ☃ = (bqk.b)i.get(☃);
    return ☃.a();
  }
  
  public bqk()
  {
    e = Core.getInstance();
    if (e == null) {
      e = new Core(new StandardCoreAPI());
    }
    f = new Chat(new StandardChatAPI());
  }
  
  public boolean n()
  {
    if (g != bqk.c.a) {
      return false;
    }
    a(bqk.c.b);
    
    ErrorCode ☃ = e.initialize(c, null);
    if (ErrorCode.failed(☃))
    {
      a(bqk.c.a);
      
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error initializing Twitch sdk: %s", new Object[] { ☃ }));
      
      return false;
    }
    l = k;
    
    HashSet<ChatTokenizationOption> ☃ = new HashSet();
    switch (bqk.2.c[k.ordinal()])
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
    ☃ = f.initialize(☃, p);
    if (ErrorCode.failed(☃))
    {
      e.shutdown();
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
    if (g != bqk.c.c) {
      return false;
    }
    if (i.containsKey(☃))
    {
      n("Already in channel: " + ☃);
      return false;
    }
    if ((☃ == null) || (☃.equals(""))) {
      return false;
    }
    bqk.b ☃ = new bqk.b(☃);
    i.put(☃, ☃);
    
    boolean ☃ = ☃.a(☃);
    if (!☃) {
      i.remove(☃);
    }
    return ☃;
  }
  
  public boolean l(String ☃)
  {
    if (g != bqk.c.c) {
      return false;
    }
    if (!i.containsKey(☃))
    {
      n("Not in channel: " + ☃);
      return false;
    }
    bqk.b ☃ = (bqk.b)i.get(☃);
    return ☃.g();
  }
  
  public boolean o()
  {
    if (g != bqk.c.c) {
      return false;
    }
    ErrorCode ☃ = f.shutdown();
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
    if (g == bqk.c.a) {
      return;
    }
    ErrorCode ☃ = f.flushEvents();
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      n(String.format("Error flushing chat events: %s", new Object[] { ☃ }));
    }
  }
  
  public boolean a(String ☃, String ☃)
  {
    if (g != bqk.c.c) {
      return false;
    }
    if (!i.containsKey(☃))
    {
      n("Not in channel: " + ☃);
      return false;
    }
    bqk.b ☃ = (bqk.b)i.get(☃);
    return ☃.b(☃);
  }
  
  protected void a(bqk.c ☃)
  {
    if (☃ == g) {
      return;
    }
    g = ☃;
    try
    {
      if (a != null) {
        a.a(☃);
      }
    }
    catch (Exception ☃)
    {
      n(☃.toString());
    }
  }
  
  protected void r()
  {
    if (l == bqk.d.a) {
      return;
    }
    if (m == null)
    {
      ErrorCode ☃ = f.downloadEmoticonData();
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        n(String.format("Error trying to download emoticon data: %s", new Object[] { ☃ }));
      }
    }
  }
  
  protected void s()
  {
    if (m != null) {
      return;
    }
    m = new ChatEmoticonData();
    ErrorCode ☃ = f.getEmoticonData(m);
    if (ErrorCode.succeeded(☃)) {
      try
      {
        if (a != null) {
          a.d();
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
    if (m == null) {
      return;
    }
    ErrorCode ☃ = f.clearEmoticonData();
    if (ErrorCode.succeeded(☃))
    {
      m = null;
      try
      {
        if (a != null) {
          a.e();
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
