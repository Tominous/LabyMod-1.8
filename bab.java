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
    this.s = ☃;
    this.h = ☃;
    
    this.i = new fa(☃.displayName);
    
    this.r.addAll(a(☃.modes, ☃.subscriptions, ☃));
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
    int ☃ = this.l / 3;
    int ☃ = ☃ - 130;
    this.n.add(new avs(1, ☃ * 0 + ☃ / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.timeout", new Object[0])));
    this.n.add(new avs(0, ☃ * 1 + ☃ / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.ban", new Object[0])));
    this.n.add(new avs(2, ☃ * 2 + ☃ / 2, this.m - 70, 130, 20, bnq.a("stream.userinfo.mod", new Object[0])));
    
    this.n.add(new avs(5, ☃ * 0 + ☃ / 2, this.m - 45, 130, 20, bnq.a("gui.cancel", new Object[0])));
    this.n.add(new avs(3, ☃ * 1 + ☃ / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unban", new Object[0])));
    this.n.add(new avs(4, ☃ * 2 + ☃ / 2, this.m - 45, 130, 20, bnq.a("stream.userinfo.unmod", new Object[0])));
    
    int ☃ = 0;
    for (eu ☃ : this.r) {
      ☃ = Math.max(☃, this.q.a(☃.d()));
    }
    this.t = (this.l / 2 - ☃ / 2);
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 0) {
      this.s.f("/ban " + this.h.displayName);
    } else if (☃.k == 3) {
      this.s.f("/unban " + this.h.displayName);
    } else if (☃.k == 2) {
      this.s.f("/mod " + this.h.displayName);
    } else if (☃.k == 4) {
      this.s.f("/unmod " + this.h.displayName);
    } else if (☃.k == 1) {
      this.s.f("/timeout " + this.h.displayName);
    }
    this.j.a(null);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(this.q, this.i.c(), this.l / 2, 70, 16777215);
    
    int ☃ = 80;
    for (eu ☃ : this.r)
    {
      c(this.q, ☃.d(), this.t, ☃, 16777215);
      ☃ += this.q.a;
    }
    super.a(☃, ☃, ☃);
  }
}
