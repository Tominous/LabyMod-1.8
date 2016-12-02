import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Sets;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.events.ActionPerformedEvent;
import de.labystudio.modapi.events.InitScreenEvent;
import de.labystudio.modapi.events.KeyTypedScreenEvent;
import de.labystudio.modapi.events.MouseClickedScreenEvent;
import de.labystudio.modapi.events.RenderScreenOverlayEvent;
import de.labystudio.modapi.events.SendChatMessageEvent;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Method;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import org.apache.commons.lang3.StringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import tv.twitch.chat.ChatUserInfo;

public abstract class axu
  extends avp
  implements awx
{
  private static final Logger a = ;
  private static final Set<String> f = Sets.newHashSet(new String[] { "http", "https" });
  private static final Splitter g = Splitter.on('\n');
  protected ave j;
  protected bjh k;
  public int l;
  public int m;
  protected List<avs> n = Lists.newArrayList();
  protected List<avy> o = Lists.newArrayList();
  public boolean p;
  protected avn q;
  private avs h;
  private int i;
  private long r;
  private int s;
  private URI t;
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new RenderScreenOverlayEvent(this, mouseX, mouseY));
    }
    for (int i = 0; i < n.size(); i++) {
      ((avs)n.get(i)).a(this.j, mouseX, mouseY);
    }
    for (int j = 0; j < o.size(); j++) {
      ((avy)o.get(j)).a(this.j, mouseX, mouseY);
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (keyCode == 1)
    {
      j.a((axu)null);
      if (j.m == null) {
        j.n();
      }
    }
  }
  
  public static String o()
  {
    try
    {
      Transferable transferable = Toolkit.getDefaultToolkit().getSystemClipboard().getContents(null);
      if ((transferable != null) && (transferable.isDataFlavorSupported(DataFlavor.stringFlavor))) {
        return (String)transferable.getTransferData(DataFlavor.stringFlavor);
      }
    }
    catch (Exception localException) {}
    return "";
  }
  
  public static void e(String copyText)
  {
    if (!StringUtils.isEmpty(copyText)) {
      try
      {
        StringSelection stringselection = new StringSelection(copyText);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, (ClipboardOwner)null);
      }
      catch (Exception localException) {}
    }
  }
  
  protected void a(zx stack, int x, int y)
  {
    List<String> list = stack.a(j.h, j.t.y);
    for (int i = 0; i < list.size(); i++) {
      if (i == 0) {
        list.set(i, ue + (String)list.get(i));
      } else {
        list.set(i, a.h + (String)list.get(i));
      }
    }
    a(list, x, y);
  }
  
  public void a(String tabName, int mouseX, int mouseY)
  {
    a(Arrays.asList(new String[] { tabName }), mouseX, mouseY);
  }
  
  public void a(List<String> textLines, int x, int y)
  {
    if (!textLines.isEmpty())
    {
      bfl.C();
      avc.a();
      bfl.f();
      bfl.i();
      int i = 0;
      for (String s : textLines)
      {
        int j = q.a(s);
        if (j > i) {
          i = j;
        }
      }
      int l1 = x + 12;
      int i2 = y - 12;
      int k = 8;
      if (textLines.size() > 1) {
        k += 2 + (textLines.size() - 1) * 10;
      }
      if (l1 + i > this.l) {
        l1 -= 28 + i;
      }
      if (i2 + k + 6 > m) {
        i2 = m - k - 6;
      }
      e = 300.0F;
      ka = 300.0F;
      int l = -267386864;
      a(l1 - 3, i2 - 4, l1 + i + 3, i2 - 3, l, l);
      a(l1 - 3, i2 + k + 3, l1 + i + 3, i2 + k + 4, l, l);
      a(l1 - 3, i2 - 3, l1 + i + 3, i2 + k + 3, l, l);
      a(l1 - 4, i2 - 3, l1 - 3, i2 + k + 3, l, l);
      a(l1 + i + 3, i2 - 3, l1 + i + 4, i2 + k + 3, l, l);
      int i1 = 1347420415;
      int j1 = (i1 & 0xFEFEFE) >> 1 | i1 & 0xFF000000;
      a(l1 - 3, i2 - 3 + 1, l1 - 3 + 1, i2 + k + 3 - 1, i1, j1);
      a(l1 + i + 2, i2 - 3 + 1, l1 + i + 3, i2 + k + 3 - 1, i1, j1);
      a(l1 - 3, i2 - 3, l1 + i + 3, i2 - 3 + 1, i1, i1);
      a(l1 - 3, i2 + k + 2, l1 + i + 3, i2 + k + 3, j1, j1);
      for (int k1 = 0; k1 < textLines.size(); k1++)
      {
        String s1 = (String)textLines.get(k1);
        q.a(s1, l1, i2, -1);
        if (k1 == 0) {
          i2 += 2;
        }
        i2 += 10;
      }
      e = 0.0F;
      ka = 0.0F;
      bfl.e();
      bfl.j();
      avc.b();
      bfl.B();
    }
  }
  
  protected void a(eu p_175272_1_, int p_175272_2_, int p_175272_3_)
  {
    if ((p_175272_1_ != null) && (p_175272_1_.b().i() != null))
    {
      ew hoverevent = p_175272_1_.b().i();
      if (hoverevent.a() == ew.a.c)
      {
        zx itemstack = null;
        try
        {
          eb nbtbase = ed.a(hoverevent.b().c());
          if ((nbtbase instanceof dn)) {
            itemstack = zx.a((dn)nbtbase);
          }
        }
        catch (ec localec1) {}
        if (itemstack != null) {
          a(itemstack, p_175272_2_, p_175272_3_);
        } else {
          a(a.m + "Invalid Item!", p_175272_2_, p_175272_3_);
        }
      }
      else if (hoverevent.a() == ew.a.d)
      {
        if (j.t.y) {
          try
          {
            eb nbtbase1 = ed.a(hoverevent.b().c());
            if ((nbtbase1 instanceof dn))
            {
              List<String> list1 = Lists.newArrayList();
              dn nbttagcompound = (dn)nbtbase1;
              list1.add(nbttagcompound.j("name"));
              if (nbttagcompound.b("type", 8))
              {
                String s = nbttagcompound.j("type");
                list1.add("Type: " + s + " (" + pm.a(s) + ")");
              }
              list1.add(nbttagcompound.j("id"));
              a(list1, p_175272_2_, p_175272_3_);
            }
            else
            {
              a(a.m + "Invalid Entity!", p_175272_2_, p_175272_3_);
            }
          }
          catch (ec var10)
          {
            a(a.m + "Invalid Entity!", p_175272_2_, p_175272_3_);
          }
        }
      }
      else if (hoverevent.a() == ew.a.a)
      {
        a(g.splitToList(hoverevent.b().d()), p_175272_2_, p_175272_3_);
      }
      else if (hoverevent.a() == ew.a.b)
      {
        mw statbase = na.a(hoverevent.b().c());
        if (statbase != null)
        {
          eu ichatcomponent = statbase.e();
          eu ichatcomponent1 = new fb("stats.tooltip.type." + (statbase.d() ? "achievement" : "statistic"), new Object[0]);
          ichatcomponent1.b().b(Boolean.valueOf(true));
          String s1 = (statbase instanceof mq) ? ((mq)statbase).f() : null;
          List<String> list = Lists.newArrayList(new String[] { ichatcomponent.d(), ichatcomponent1.d() });
          if (s1 != null) {
            list.addAll(q.c(s1, 150));
          }
          a(list, p_175272_2_, p_175272_3_);
        }
        else
        {
          a(a.m + "Invalid statistic/achievement!", p_175272_2_, p_175272_3_);
        }
      }
      bfl.f();
    }
  }
  
  protected void a(String newChatText, boolean shouldOverwrite) {}
  
  protected boolean a(eu p_175276_1_)
  {
    if (p_175276_1_ == null) {
      return false;
    }
    et clickevent = p_175276_1_.b().h();
    if (r())
    {
      if (p_175276_1_.b().j() != null) {
        a(p_175276_1_.b().j(), false);
      }
    }
    else if (clickevent != null)
    {
      if (clickevent.a() == et.a.a)
      {
        if (!j.t.o) {
          return false;
        }
        try
        {
          URI uri = new URI(clickevent.b());
          String s = uri.getScheme();
          if (s == null) {
            throw new URISyntaxException(clickevent.b(), "Missing protocol");
          }
          if (!f.contains(s.toLowerCase())) {
            throw new URISyntaxException(clickevent.b(), "Unsupported protocol: " + s.toLowerCase());
          }
          if (j.t.p)
          {
            t = uri;
            j.a(new aww(this, clickevent.b(), 31102009, false));
          }
          else
          {
            a(uri);
          }
        }
        catch (URISyntaxException urisyntaxexception)
        {
          a.error("Can't open url for " + clickevent, urisyntaxexception);
        }
      }
      else if (clickevent.a() == et.a.b)
      {
        URI uri1 = new File(clickevent.b()).toURI();
        a(uri1);
      }
      else if (clickevent.a() == et.a.e)
      {
        a(clickevent.b(), true);
      }
      else if (clickevent.a() == et.a.c)
      {
        b(clickevent.b(), false);
      }
      else if (clickevent.a() == et.a.d)
      {
        ChatUserInfo chatuserinfo = j.Y().e(clickevent.b());
        if (chatuserinfo != null) {
          j.a(new bab(j.Y(), chatuserinfo));
        } else {
          a.error("Tried to handle twitch user but couldn't find them!");
        }
      }
      else
      {
        a.error("Don't know how to handle " + clickevent);
      }
      return true;
    }
    return false;
  }
  
  public void f(String msg)
  {
    b(msg, true);
  }
  
  public void b(String msg, boolean addToChat)
  {
    if (addToChat) {
      j.q.d().a(msg);
    }
    if (LabyMod.getInstance().onSendChatMessage(msg)) {
      if (ModAPI.enabled())
      {
        if (!((SendChatMessageEvent)ModAPI.callEvent(new SendChatMessageEvent(msg))).isCancelled()) {
          j.h.e(msg);
        }
      }
      else {
        Ah.e(msg);
      }
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new MouseClickedScreenEvent(this, mouseX, mouseY, mouseButton));
    }
    if (mouseButton == 0) {
      for (int i = 0; i < n.size(); i++)
      {
        avs guibutton = (avs)n.get(i);
        if (guibutton.c(j, mouseX, mouseY))
        {
          h = guibutton;
          guibutton.a(j.W());
          a(guibutton);
          ModAPI.callEvent(new ActionPerformedEvent(this, guibutton));
        }
      }
    }
  }
  
  protected void b(int mouseX, int mouseY, int state)
  {
    if ((h != null) && (state == 0))
    {
      h.a(mouseX, mouseY);
      h = null;
    }
  }
  
  protected void a(int mouseX, int mouseY, int clickedMouseButton, long timeSinceLastClick) {}
  
  protected void a(avs button)
    throws IOException
  {}
  
  public void a(ave mc, int width, int height)
  {
    j = mc;
    k = mc.ag();
    q = k;
    l = width;
    m = height;
    n.clear();
    b();
    if (ModAPI.enabled()) {
      ModAPI.callEvent(new InitScreenEvent(this, n));
    }
  }
  
  public void b() {}
  
  public void p()
    throws IOException
  {
    if (Mouse.isCreated()) {
      while (Mouse.next()) {
        k();
      }
    }
    if (Keyboard.isCreated()) {
      while (Keyboard.next()) {
        l();
      }
    }
  }
  
  public void k()
    throws IOException
  {
    int i = Mouse.getEventX() * this.l / jd;
    int j = m - Mouse.getEventY() * m / je - 1;
    int k = Mouse.getEventButton();
    if (Mouse.getEventButtonState())
    {
      if ((jt.A) && (s++ > 0)) {
        return;
      }
      this.i = k;
      r = ave.J();
      a(i, j, this.i);
    }
    else if (k != -1)
    {
      if ((jt.A) && (--s > 0)) {
        return;
      }
      this.i = -1;
      b(i, j, k);
    }
    else if ((this.i != -1) && (r > 0L))
    {
      long l = ave.J() - r;
      a(i, j, this.i, l);
    }
  }
  
  public void l()
    throws IOException
  {
    if (Keyboard.getEventKeyState())
    {
      a(Keyboard.getEventCharacter(), Keyboard.getEventKey());
      if (ModAPI.enabled()) {
        ModAPI.callEvent(new KeyTypedScreenEvent(this, Keyboard.getEventCharacter(), Keyboard.getEventKey()));
      }
    }
    j.Z();
  }
  
  public void e() {}
  
  public void m() {}
  
  public void c()
  {
    if ((!settingsbackground) && (LabyMod.getInstance().isInGame())) {
      return;
    }
    b_(0);
  }
  
  public void b_(int tint)
  {
    if (j.f != null) {
      a(0, 0, l, m, -1072689136, -804253680);
    } else {
      c(tint);
    }
  }
  
  public void c(int tint)
  {
    bfl.f();
    bfl.n();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    j.P().a(b);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float f = 32.0F;
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, m, 0.0D).a(0.0D, m / 32.0F + tint).b(64, 64, 64, 255).d();
    worldrenderer.b(l, m, 0.0D).a(l / 32.0F, m / 32.0F + tint).b(64, 64, 64, 255).d();
    worldrenderer.b(l, 0.0D, 0.0D).a(l / 32.0F, tint).b(64, 64, 64, 255).d();
    worldrenderer.b(0.0D, 0.0D, 0.0D).a(0.0D, tint).b(64, 64, 64, 255).d();
    tessellator.b();
  }
  
  public boolean d()
  {
    return true;
  }
  
  public void a(boolean result, int id)
  {
    if (id == 31102009)
    {
      if (result) {
        a(t);
      }
      t = null;
      j.a(this);
    }
  }
  
  private void a(URI p_175282_1_)
  {
    try
    {
      Class<?> oclass = Class.forName("java.awt.Desktop");
      Object object = oclass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
      oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { p_175282_1_ });
    }
    catch (Throwable throwable)
    {
      a.error("Couldn't open link", throwable);
    }
  }
  
  public static boolean q()
  {
    return (Keyboard.isKeyDown(219)) || (Keyboard.isKeyDown(220));
  }
  
  public static boolean r()
  {
    return (Keyboard.isKeyDown(42)) || (Keyboard.isKeyDown(54));
  }
  
  public static boolean s()
  {
    return (Keyboard.isKeyDown(56)) || (Keyboard.isKeyDown(184));
  }
  
  public static boolean d(int p_175277_0_)
  {
    return (p_175277_0_ == 45) && (q()) && (!r()) && (!s());
  }
  
  public static boolean e(int p_175279_0_)
  {
    return (p_175279_0_ == 47) && (q()) && (!r()) && (!s());
  }
  
  public static boolean f(int p_175280_0_)
  {
    return (p_175280_0_ == 46) && (q()) && (!r()) && (!s());
  }
  
  public static boolean g(int p_175278_0_)
  {
    return (p_175278_0_ == 30) && (q()) && (!r()) && (!s());
  }
  
  public void b(ave mcIn, int p_175273_2_, int p_175273_3_)
  {
    a(mcIn, p_175273_2_, p_175273_3_);
  }
}
