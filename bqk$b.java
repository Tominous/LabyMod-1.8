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
      ☃ = h.f.connectAnonymous(a, this);
    } else {
      ☃ = h.f.connect(a, h.b, h.h.data, this);
    }
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      h.n(String.format("Error connecting: %s", new Object[] { ☃ }));
      
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
      ErrorCode ☃ = h.f.disconnect(a);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        h.n(String.format("Error disconnecting: %s", new Object[] { ☃ }));
        
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
    if (h.l == bqk.d.a)
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
      if (h.a != null) {
        h.a.a(a, ☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
    }
  }
  
  public boolean b(String ☃)
  {
    if (c != bqk.a.c) {
      return false;
    }
    ErrorCode ☃ = h.f.sendMessage(a, ☃);
    if (ErrorCode.failed(☃))
    {
      String ☃ = ErrorCode.getString(☃);
      h.n(String.format("Error sending chat message: %s", new Object[] { ☃ }));
      
      return false;
    }
    return true;
  }
  
  protected void h()
  {
    if (h.l == bqk.d.a) {
      return;
    }
    if (g == null)
    {
      ErrorCode ☃ = h.f.downloadBadgeData(a);
      if (ErrorCode.failed(☃))
      {
        String ☃ = ErrorCode.getString(☃);
        h.n(String.format("Error trying to download badge data: %s", new Object[] { ☃ }));
      }
    }
  }
  
  protected void i()
  {
    if (g != null) {
      return;
    }
    g = new ChatBadgeData();
    ErrorCode ☃ = h.f.getBadgeData(a, g);
    if (ErrorCode.succeeded(☃)) {
      try
      {
        if (h.a != null) {
          h.a.c(a);
        }
      }
      catch (Exception ☃)
      {
        h.n(☃.toString());
      }
    } else {
      h.n("Error preparing badge data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void j()
  {
    if (g == null) {
      return;
    }
    ErrorCode ☃ = h.f.clearBadgeData(a);
    if (ErrorCode.succeeded(☃))
    {
      g = null;
      try
      {
        if (h.a != null) {
          h.a.d(a);
        }
      }
      catch (Exception ☃)
      {
        h.n(☃.toString());
      }
    }
    else
    {
      h.n("Error releasing badge data: " + ErrorCode.getString(☃));
    }
  }
  
  protected void c(String ☃)
  {
    try
    {
      if (h.a != null) {
        h.a.a(☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
    }
  }
  
  protected void d(String ☃)
  {
    try
    {
      if (h.a != null) {
        h.a.b(☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
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
    h.i.remove(☃);
    
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
      if (h.a != null) {
        h.a.a(a, ☃, ☃, ☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
    }
  }
  
  public void chatChannelRawMessageCallback(String ☃, ChatRawMessage[] ☃)
  {
    for (int ☃ = 0; ☃ < ☃.length; ☃++) {
      e.addLast(☃[☃]);
    }
    try
    {
      if (h.a != null) {
        h.a.a(a, ☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
    }
    while (e.size() > h.j) {
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
      if (h.a != null) {
        h.a.a(a, ☃);
      }
    }
    catch (Exception ☃)
    {
      h.n(☃.toString());
    }
    while (f.size() > h.j) {
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
