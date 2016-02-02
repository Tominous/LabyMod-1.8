import com.google.common.collect.Lists;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import tv.twitch.AuthToken;
import tv.twitch.ErrorCode;
import tv.twitch.chat.Chat;
import tv.twitch.chat.ChatBadgeData;
import tv.twitch.chat.ChatChannelInfo;
import tv.twitch.chat.ChatEvent;
import tv.twitch.chat.ChatRawMessage;
import tv.twitch.chat.ChatTokenizedMessage;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.IChatChannelListener;

public class bqk$b
  implements IChatChannelListener
{
  protected String a = null;
  protected boolean b = false;
  protected bqk.a c = bqk.a.a;
  protected List<ChatUserInfo> d = Lists.newArrayList();
  protected LinkedList<ChatRawMessage> e = new LinkedList();
  protected LinkedList<ChatTokenizedMessage> f = new LinkedList();
  protected ChatBadgeData g = null;
  
  public bqk$b(bqk parambqk, String ☃)
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
      ☃ = this.h.f.connectAnonymous(this.a, this);
    } else {
      ☃ = this.h.f.connect(this.a, this.h.b, this.h.h.data, this);
    }
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.h.n(String.format("Error connecting: %s", new Object[] { ☃ }));
      
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
      ErrorCode ☃ = this.h.f.disconnect(this.a);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        this.h.n(String.format("Error disconnecting: %s", new Object[] { ☃ }));
        
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
    if (this.h.l == bqk.d.a)
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
      if (this.h.a != null) {
        this.h.a.a(this.a, ☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
    }
  }
  
  public boolean b(String ☃)
  {
    if (this.c != bqk.a.c) {
      return false;
    }
    ErrorCode ☃ = this.h.f.sendMessage(this.a, ☃);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      this.h.n(String.format("Error sending chat message: %s", new Object[] { ☃ }));
      
      return false;
    }
    return true;
  }
  
  protected void h()
  {
    if (this.h.l == bqk.d.a) {
      return;
    }
    if (this.g == null)
    {
      ErrorCode ☃ = this.h.f.downloadBadgeData(this.a);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        this.h.n(String.format("Error trying to download badge data: %s", new Object[] { ☃ }));
      }
    }
  }
  
  protected void i()
  {
    if (this.g != null) {
      return;
    }
    this.g = new ChatBadgeData();
    ErrorCode ☃ = this.h.f.getBadgeData(this.a, this.g);
    if (ErrorCode.succeeded(☃)) {
      try
      {
        if (this.h.a != null) {
          this.h.a.c(this.a);
        }
      }
      catch (Exception ☃)
      {
        this.h.n(☃.toString());
      }
    } else {
      this.h.n("Error preparing badge data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void j()
  {
    if (this.g == null) {
      return;
    }
    ErrorCode ☃ = this.h.f.clearBadgeData(this.a);
    if (ErrorCode.succeeded(☃))
    {
      this.g = null;
      try
      {
        if (this.h.a != null) {
          this.h.a.d(this.a);
        }
      }
      catch (Exception ☃)
      {
        this.h.n(☃.toString());
      }
    }
    else
    {
      this.h.n("Error releasing badge data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void c(String ☃)
  {
    try
    {
      if (this.h.a != null) {
        this.h.a.a(☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
    }
  }
  
  protected void d(String ☃)
  {
    try
    {
      if (this.h.a != null) {
        this.h.a.b(☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
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
    this.h.i.remove(☃);
    
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
      if (this.h.a != null) {
        this.h.a.a(this.a, ☃, ☃, ☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
    }
  }
  
  public void chatChannelRawMessageCallback(String ☃, ChatRawMessage[] ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      this.e.addLast(☃[☃]);
    }
    try
    {
      if (this.h.a != null) {
        this.h.a.a(this.a, ☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
    }
    while (this.e.size() > this.h.j) {
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
      if (this.h.a != null) {
        this.h.a.a(this.a, ☃);
      }
    }
    catch (Exception ☃)
    {
      this.h.n(☃.toString());
    }
    while (this.f.size() > this.h.j) {
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
