import com.google.common.collect.Lists;
import java.util.List;
import java.util.Set;
import tv.twitch.chat.ChatUserInfo;
import tv.twitch.chat.ChatUserMode;
import tv.twitch.chat.ChatUserSubscription;

public class bab
  extends axu
{
  private static final a a = a.c;
  private static final a f = a.m;
  private static final a g = a.f;
  private final ChatUserInfo h;
  private final eu i;
  private final List<eu> r = Lists.newArrayList();
  private final bqm s;
  private int t;
  
  public bab(bqm ☃, ChatUserInfo ☃)
  {
    s = ☃;
    h = ☃;
    
    i = new fa(displayName);
    
    r.addAll(a(modes, subscriptions, ☃));
  }
  
  public static List<eu> a(Set<ChatUserMode> ☃, Set<ChatUserSubscription> ☃, bqm ☃)
  {
    String ☃ = ☃ == null ? null : ☃.z();
    boolean ☃ = (☃ != null) && (☃.y());
    List<eu> ☃ = Lists.newArrayList();
    for (ChatUserMode ☃ : ☃)
    {
      eu ☃ = a(☃, ☃, ☃);
      if (☃ != null)
      {
        eu ☃ = new fa("- ");
        ☃.a(☃);
        ☃.add(☃);
      }
    }
    for (ChatUserSubscription ☃ : ☃)
    {
      eu ☃ = a(☃, ☃, ☃);
      if (☃ != null)
      {
        eu ☃ = new fa("- ");
        ☃.a(☃);
        ☃.add(☃);
      }
    }
    return ☃;
  }
  
  public static eu a(ChatUserSubscription ☃, String ☃, boolean ☃)
  {
    eu ☃ = null;
    if (☃ == ChatUserSubscription.TTV_CHAT_USERSUB_SUBSCRIBER)
    {
      if (☃ == null) {
        ☃ = new fb("stream.user.subscription.subscriber", new Object[0]);
      } else if (☃) {
        ☃ = new fb("stream.user.subscription.subscriber.self", new Object[0]);
      } else {
        ☃ = new fb("stream.user.subscription.subscriber.other", new Object[] { ☃ });
      }
      ☃.b().a(a);
    }
    else if (☃ == ChatUserSubscription.TTV_CHAT_USERSUB_TURBO)
    {
      ☃ = new fb("stream.user.subscription.turbo", new Object[0]);
      ☃.b().a(g);
    }
    return ☃;
  }
  
  public static eu a(ChatUserMode ☃, String ☃, boolean ☃)
  {
    eu ☃ = null;
    if (☃ == ChatUserMode.TTV_CHAT_USERMODE_ADMINSTRATOR)
    {
      ☃ = new fb("stream.user.mode.administrator", new Object[0]);
      ☃.b().a(g);
    }
    else if (☃ == ChatUserMode.TTV_CHAT_USERMODE_BANNED)
    {
      if (☃ == null) {
        ☃ = new fb("stream.user.mode.banned", new Object[0]);
      } else if (☃) {
        ☃ = new fb("stream.user.mode.banned.self", new Object[0]);
      } else {
        ☃ = new fb("stream.user.mode.banned.other", new Object[] { ☃ });
      }
      ☃.b().a(f);
    }
    else if (☃ == ChatUserMode.TTV_CHAT_USERMODE_BROADCASTER)
    {
      if (☃ == null) {
        ☃ = new fb("stream.user.mode.broadcaster", new Object[0]);
      } else if (☃) {
        ☃ = new fb("stream.user.mode.broadcaster.self", new Object[0]);
      } else {
        ☃ = new fb("stream.user.mode.broadcaster.other", new Object[0]);
      }
      ☃.b().a(a);
    }
    else if (☃ == ChatUserMode.TTV_CHAT_USERMODE_MODERATOR)
    {
      if (☃ == null) {
        ☃ = new fb("stream.user.mode.moderator", new Object[0]);
      } else if (☃) {
        ☃ = new fb("stream.user.mode.moderator.self", new Object[0]);
      } else {
        ☃ = new fb("stream.user.mode.moderator.other", new Object[] { ☃ });
      }
      ☃.b().a(a);
    }
    else if (☃ == ChatUserMode.TTV_CHAT_USERMODE_STAFF)
    {
      ☃ = new fb("stream.user.mode.staff", new Object[0]);
      ☃.b().a(g);
    }
    return ☃;
  }
  
  public void b()
  {
    int ☃ = l / 3;
    int ☃ = ☃ - 130;
    n.add(new avs(1, ☃ * 0 + ☃ / 2, m - 70, 130, 20, bnq.a("stream.userinfo.timeout", new Object[0])));
    n.add(new avs(0, ☃ * 1 + ☃ / 2, m - 70, 130, 20, bnq.a("stream.userinfo.ban", new Object[0])));
    n.add(new avs(2, ☃ * 2 + ☃ / 2, m - 70, 130, 20, bnq.a("stream.userinfo.mod", new Object[0])));
    
    n.add(new avs(5, ☃ * 0 + ☃ / 2, m - 45, 130, 20, bnq.a("gui.cancel", new Object[0])));
    n.add(new avs(3, ☃ * 1 + ☃ / 2, m - 45, 130, 20, bnq.a("stream.userinfo.unban", new Object[0])));
    n.add(new avs(4, ☃ * 2 + ☃ / 2, m - 45, 130, 20, bnq.a("stream.userinfo.unmod", new Object[0])));
    
    int ☃ = 0;
    for (eu ☃ : r) {
      ☃ = Math.max(☃, q.a(☃.d()));
    }
    t = (l / 2 - ☃ / 2);
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 0) {
      s.f("/ban " + h.displayName);
    } else if (k == 3) {
      s.f("/unban " + h.displayName);
    } else if (k == 2) {
      s.f("/mod " + h.displayName);
    } else if (k == 4) {
      s.f("/unmod " + h.displayName);
    } else if (k == 1) {
      s.f("/timeout " + h.displayName);
    }
    j.a(null);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, i.c(), l / 2, 70, 16777215);
    
    int ☃ = 80;
    for (eu ☃ : r)
    {
      c(q, ☃.d(), t, ☃, 16777215);
      ☃ += q.a;
    }
    super.a(☃, ☃, ☃);
  }
}
