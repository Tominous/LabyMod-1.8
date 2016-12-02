import com.google.common.collect.Lists;
import de.labystudio.gui.extras.GuiCustomButton;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServerBroadcast;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;
import net.minecraft.realms.RealmsBridge;
import org.apache.commons.io.Charsets;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.ContextCapabilities;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GLContext;
import org.lwjgl.util.glu.Project;

public class aya
  extends axu
  implements awx
{
  private static final AtomicInteger f = new AtomicInteger(0);
  private static final Logger g = LogManager.getLogger();
  private static final Random h = new Random();
  private float i;
  private String r;
  private avs s;
  private int t;
  private blz u;
  private boolean v = true;
  private final Object w = new Object();
  private String x;
  private String y;
  private String z;
  private static final jy A = new jy("texts/splashes.txt");
  private static final jy B = new jy("textures/gui/title/minecraft.png");
  private static final jy twitter = new jy("twitter.png");
  private static final jy[] C = { new jy("textures/gui/title/background/panorama_0.png"), new jy("textures/gui/title/background/panorama_1.png"), new jy("textures/gui/title/background/panorama_2.png"), new jy("textures/gui/title/background/panorama_3.png"), new jy("textures/gui/title/background/panorama_4.png"), new jy("textures/gui/title/background/panorama_5.png") };
  public static final String a = "Please click " + a.t + "here" + a.v + " for more information.";
  private int D;
  private int E;
  private int F;
  private int G;
  private int H;
  private int I;
  private jy J;
  private avs K;
  private boolean labyModMessage = false;
  private Locale locale;
  
  public aya()
  {
    y = a;
    r = "missingno";
    BufferedReader bufferedreader = null;
    labyModMessage = false;
    try
    {
      List<String> list = Lists.newArrayList();
      bufferedreader = new BufferedReader(new InputStreamReader(ave.A().Q().a(A).b(), Charsets.UTF_8));
      String s;
      while ((s = bufferedreader.readLine()) != null)
      {
        s = s.trim();
        if (!s.isEmpty()) {
          list.add(s);
        }
      }
      if (!list.isEmpty()) {
        for (;;)
        {
          r = ((String)list.get(h.nextInt(list.size())));
          if (r.hashCode() != 125780783) {
            break;
          }
        }
      }
      if (bufferedreader != null) {
        try
        {
          bufferedreader.close();
        }
        catch (IOException localIOException) {}
      }
      i = h.nextFloat();
    }
    catch (IOException localIOException1) {}finally
    {
      if (bufferedreader != null) {
        try
        {
          bufferedreader.close();
        }
        catch (IOException localIOException3) {}
      }
    }
    x = "";
    if ((!getCapabilitiesOpenGL20) && (!bqs.b()))
    {
      x = bnq.a("title.oldgl1", new Object[0]);
      y = bnq.a("title.oldgl2", new Object[0]);
      z = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
    }
    if (!"".isEmpty())
    {
      x = ("You are using a " + Color.clc("e") + "" + Color.clc("f") + " version of the LabyMod!");
      y = "This is an unstable Version and bugs may occur.";
      z = "";
    }
    setUpdate();
  }
  
  public void setUpdate()
  {
    if ((LabyMod.getInstance().getServerBroadcast() != null) && (LabyMod.getInstance().getServerBroadcast().getLine1() != ""))
    {
      x = LabyMod.getInstance().getServerBroadcast().getLine1();
      y = LabyMod.getInstance().getServerBroadcast().getLine2();
      z = LabyMod.getInstance().getServerBroadcast().getUrl();
      labyModMessage = true;
    }
    if (getInstancechatPacketUpdate)
    {
      x = ("A new LabyMod Version " + getInstancelatestVersionName + " is available!");
      y = ("Click " + Color.clc("n") + "here" + Color.clc("f") + " to download the latest version.");
      z = "https://LabyMod.net";
    }
  }
  
  public void e()
  {
    t += 1;
  }
  
  public boolean d()
  {
    return false;
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {}
  
  public void b()
  {
    u = new blz(256, 256);
    J = this.j.P().a("background", u);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    if ((calendar.get(2) + 1 == 12) && (calendar.get(5) == 24)) {
      r = "Merry X-mas!";
    } else if ((calendar.get(2) + 1 == 1) && (calendar.get(5) == 1)) {
      r = "Happy new year!";
    } else if ((calendar.get(2) + 1 == 10) && (calendar.get(5) == 31)) {
      r = "OOoooOOOoooo! Spooky!";
    } else if ((calendar.get(2) + 1 == 11) && (calendar.get(5) == 24)) {
      r = "Happy birthday, LabyStudio!";
    } else if ((calendar.get(2) + 1 == 6) && (calendar.get(5) == 23)) {
      r = "Happy birthday, Fleance!";
    } else if ((calendar.get(2) + 1 == 4) && (calendar.get(5) == 25)) {
      r = "Happy birthday, _qlow!";
    } else if ((calendar.get(2) + 1 == 10) && (calendar.get(5) == 21)) {
      r = "Back to the Future!";
    } else if ((calendar.get(2) + 1 == 4) && (calendar.get(5) == 13)) {
      r = "Happy birthday, LabyMod!";
    }
    int i = 24;
    int j = m / 4 + 48;
    if (this.j.t()) {
      c(j, 24);
    } else {
      b(j, 24);
    }
    n.add(new avs(0, l / 2 - 100, j + 72 + 12, 98, 20, bnq.a("menu.options", new Object[0])));
    n.add(new avs(4, l / 2 + 2, j + 72 + 12, 98, 20, bnq.a("menu.quit", new Object[0])));
    n.add(new avz(5, l / 2 - 124, j + 72 + 12));
    synchronized (w)
    {
      E = q.a(x);
      D = q.a(y);
      int k = Math.max(E, D);
      F = ((l - k) / 2);
      G = (n.get(0)).i - 24);
      H = (F + k);
      I = (G + 24);
    }
    this.j.a(false);
    LabyMod.getInstance().resetMod();
    LabyMod.getInstance().resetIP();
  }
  
  private void b(int p_73969_1_, int p_73969_2_)
  {
    n.add(new avs(1, l / 2 - 100, p_73969_1_, bnq.a("menu.singleplayer", new Object[0])));
    n.add(new avs(2, l / 2 - 100, p_73969_1_ + p_73969_2_ * 1, bnq.a("menu.multiplayer", new Object[0])));
    try
    {
      LabyMod.getInstance();LabyMod.overWrite();
      String quickPlay = j.t.aE;
      String lastServer = settingslast_Server;
      String realms = "Minecraft Realms";
      if ((quickPlay != null) && (settingsquickPlay))
      {
        if (j.t.aE.isEmpty())
        {
          if ((settingslast_Server != null) && (!settingslast_Server.isEmpty()))
          {
            n.add(new avs(14, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(realms, new Object[0])));
            if (lastServer.length() > 16) {
              lastServer = lastServer.substring(0, 16);
            }
            n.add(new avs(7, l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
          }
          else
          {
            n.add(new avs(14, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(realms, new Object[0])));
          }
        }
        else if ((settingslast_Server != null) && (!settingslast_Server.isEmpty()))
        {
          if (quickPlay.length() > 16) {
            quickPlay = quickPlay.substring(0, 16);
          }
          n.add(new avs(6, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(quickPlay, new Object[0])));
          if (lastServer.length() > 16) {
            lastServer = lastServer.substring(0, 16);
          }
          n.add(new avs(7, l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
        }
        else
        {
          if (quickPlay.length() > 32) {
            quickPlay = quickPlay.substring(0, 32);
          }
          n.add(new avs(6, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(quickPlay, new Object[0])));
        }
      }
      else if ((settingslast_Server != null) && (!settingslast_Server.isEmpty()) && (settingsquickPlay))
      {
        n.add(new avs(14, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(realms, new Object[0])));
        if (lastServer.length() > 16) {
          lastServer = lastServer.substring(0, 16);
        }
        n.add(new avs(7, l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
      }
      else
      {
        n.add(new avs(14, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(realms, new Object[0])));
      }
    }
    catch (Exception error)
    {
      for (int i = 0; i <= n.size() - 1; i++)
      {
        avs b = (avs)n.get(i);
        m = false;
      }
      GuiCustomButton a = new GuiCustomButton(-1, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2 - 45, Color.clc("4") + "An error occurred while loading the LabyMod!");
      noGui = true;
      n.add(a);
      n.add(new avs(16, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2 - 25, Color.clc("e") + "Option 1: " + Color.clc("c") + "Reload the LabyMod"));
      n.add(new avs(15, l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, Color.clc("e") + "Option 2: " + Color.clc("c") + "Delete LabyMod config file"));
      return;
    }
  }
  
  private void c(int p_73972_1_, int p_73972_2_)
  {
    n.add(new avs(11, l / 2 - 100, p_73972_1_, bnq.a("menu.playdemo", new Object[0])));
    n.add(s = new avs(12, l / 2 - 100, p_73972_1_ + p_73972_2_ * 1, bnq.a("menu.resetdemo", new Object[0])));
    atr isaveformat = j.f();
    ato worldinfo = isaveformat.c("Demo_World");
    if (worldinfo == null) {
      s.l = false;
    }
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 0) {
      j.a(new axn(this, j.t));
    }
    if (k == 5) {
      j.a(new axl(this, j.t, j.S()));
    }
    if (k == 1) {
      j.a(new axv(this));
    }
    if (k == 2) {
      j.a(new azh(this));
    }
    if (k == 4) {
      j.m();
    }
    if (k == 11) {
      j.a("Demo_World", "Demo_World", kx.a);
    }
    if (k == 6) {
      LabyMod.getInstance().connectToServer(j.t.aE);
    }
    if (k == 7) {
      LabyMod.getInstance().connectToServer(settingslast_Server);
    }
    if (k == 12)
    {
      atr var2 = j.f();
      ato var3 = var2.c("Demo_World");
      if (var3 != null)
      {
        awy var4 = axv.a(this, var3.k(), 12);
        j.a(var4);
      }
    }
    if (k == 14) {
      a();
    }
    if (k == 16) {
      j.a(this);
    }
    if (k == 15)
    {
      File configFile = new File("LabyMod/LabyMod.json");
      if (configFile.exists())
      {
        configFile.delete();
        ConfigManager.loadProperties(true);
        j.a(new aya());
      }
    }
  }
  
  private void a()
  {
    RealmsBridge realmsbridge = new RealmsBridge();
    realmsbridge.switchToRealms(this);
  }
  
  public void a(boolean result, int id)
  {
    if ((result) && (id == 12))
    {
      atr isaveformat = j.f();
      isaveformat.d();
      isaveformat.e("Demo_World");
      j.a(this);
    }
    else if (id == 13)
    {
      if (result) {
        try
        {
          Class<?> oclass = Class.forName("java.awt.Desktop");
          Object object = oclass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI(z) });
        }
        catch (Throwable throwable)
        {
          g.error("Couldn't open link", throwable);
        }
      }
      j.a(this);
    }
  }
  
  private void b(int p_73970_1_, int p_73970_2_, float p_73970_3_)
  {
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    bfl.n(5889);
    bfl.E();
    bfl.D();
    Project.gluPerspective(120.0F, 1.0F, 0.05F, 10.0F);
    bfl.n(5888);
    bfl.E();
    bfl.D();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.b(180.0F, 1.0F, 0.0F, 0.0F);
    bfl.b(90.0F, 0.0F, 0.0F, 1.0F);
    bfl.l();
    bfl.c();
    bfl.p();
    bfl.a(false);
    bfl.a(770, 771, 1, 0);
    int i = 8;
    for (int j = 0; j < i * i; j++)
    {
      bfl.E();
      float f = (j % i / i - 0.5F) / 64.0F;
      float f1 = (j / i / i - 0.5F) / 64.0F;
      float f2 = 0.0F;
      bfl.b(f, f1, f2);
      bfl.b(ns.a((t + p_73970_3_) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(-(t + p_73970_3_) * 0.1F, 0.0F, 1.0F, 0.0F);
      for (int k = 0; k < 6; k++)
      {
        bfl.E();
        if (k == 1) {
          bfl.b(90.0F, 0.0F, 1.0F, 0.0F);
        }
        if (k == 2) {
          bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
        }
        if (k == 3) {
          bfl.b(-90.0F, 0.0F, 1.0F, 0.0F);
        }
        if (k == 4) {
          bfl.b(90.0F, 1.0F, 0.0F, 0.0F);
        }
        if (k == 5) {
          bfl.b(-90.0F, 1.0F, 0.0F, 0.0F);
        }
        this.j.P().a(C[k]);
        worldrenderer.a(7, bms.i);
        int l = 255 / (j + 1);
        float f3 = 0.0F;
        worldrenderer.b(-1.0D, -1.0D, 1.0D).a(0.0D, 0.0D).b(255, 255, 255, l).d();
        worldrenderer.b(1.0D, -1.0D, 1.0D).a(1.0D, 0.0D).b(255, 255, 255, l).d();
        worldrenderer.b(1.0D, 1.0D, 1.0D).a(1.0D, 1.0D).b(255, 255, 255, l).d();
        worldrenderer.b(-1.0D, 1.0D, 1.0D).a(0.0D, 1.0D).b(255, 255, 255, l).d();
        tessellator.b();
        bfl.F();
      }
      bfl.F();
      bfl.a(true, true, true, false);
    }
    worldrenderer.c(0.0D, 0.0D, 0.0D);
    bfl.a(true, true, true, true);
    bfl.n(5889);
    bfl.F();
    bfl.n(5888);
    bfl.F();
    bfl.a(true);
    bfl.o();
    bfl.j();
  }
  
  private void a(float p_73968_1_)
  {
    this.j.P().a(J);
    GL11.glTexParameteri(3553, 10241, 9729);
    GL11.glTexParameteri(3553, 10240, 9729);
    GL11.glCopyTexSubImage2D(3553, 0, 0, 0, 0, 0, 256, 256);
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.a(true, true, true, false);
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.i);
    bfl.c();
    int i = 3;
    for (int j = 0; j < i; j++)
    {
      float f = 1.0F / (j + 1);
      int k = this.l;
      int l = m;
      float f1 = (j - i / 2) / 256.0F;
      worldrenderer.b(k, l, e).a(0.0F + f1, 1.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(k, 0.0D, e).a(1.0F + f1, 1.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(0.0D, 0.0D, e).a(1.0F + f1, 0.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(0.0D, l, e).a(0.0F + f1, 0.0D).a(1.0F, 1.0F, 1.0F, f).d();
    }
    tessellator.b();
    bfl.d();
    bfl.a(true, true, true, true);
  }
  
  private void c(int p_73971_1_, int p_73971_2_, float p_73971_3_)
  {
    this.j.b().e();
    bfl.b(0, 0, 256, 256);
    b(p_73971_1_, p_73971_2_, p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    a(p_73971_3_);
    this.j.b().a(true);
    bfl.b(0, 0, jd, je);
    float f = l > m ? 120.0F / l : 120.0F / m;
    float f1 = m * f / 256.0F;
    float f2 = l * f / 256.0F;
    int i = l;
    int j = m;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, j, e).a(0.5F - f1, 0.5F + f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(i, j, e).a(0.5F - f1, 0.5F - f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(i, 0.0D, e).a(0.5F + f1, 0.5F - f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(0.0D, 0.0D, e).a(0.5F + f1, 0.5F + f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    tessellator.b();
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if ((!labyModMessage) && (
      (getInstancechatPacketUpdate) || (LabyMod.getInstance().getServerBroadcast() != null)))
    {
      setUpdate();
      b();
    }
    bfl.c();
    c(mouseX, mouseY, partialTicks);
    bfl.d();
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    int i = 274;
    int j = l / 2 - i / 2;
    int k = 30;
    a(0, 0, l, m, -2130706433, 16777215);
    a(0, 0, l, m, 0, Integer.MIN_VALUE);
    this.j.P().a(B);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (this.i < 1.0E-4D)
    {
      b(j + 0, k + 0, 0, 0, 99, 44);
      b(j + 99, k + 0, 129, 0, 27, 44);
      b(j + 99 + 26, k + 0, 126, 0, 3, 44);
      b(j + 99 + 26 + 3, k + 0, 99, 0, 26, 44);
      b(j + 155, k + 0, 0, 45, 155, 44);
    }
    else
    {
      b(j + 0, k + 0, 0, 0, 155, 44);
      b(j + 155, k + 0, 0, 45, 155, 44);
    }
    bfl.E();
    bfl.b(l / 2 + 90, 70.0F, 0.0F);
    bfl.b(-20.0F, 0.0F, 0.0F, 1.0F);
    float f = 1.8F - ns.e(ns.a((float)(ave.J() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
    f = f * 100.0F / (q.a(r) + 32);
    bfl.a(f, f, f);
    a(q, r, 0, -8, 65280);
    bfl.F();
    String s = "Minecraft 1.8.8";
    if (this.j.t()) {
      s = s + " Demo";
    }
    c(q, "LabyMod 2.7.97 ", 2, m - 10, -1);
    c(q, s, 2, m - 20, -1);
    
    bfl.c(1.0F, 1.0F, 1.0F);
    
    String s1 = "Copyright Mojang AB. Do not distribute!";
    c(q, s1, l - q.a(s1) - 2, m - 10, -1);
    if ((x != null) && (x.length() > 0))
    {
      a(F - 2, G - 2, H + 2, I - 1, 1428160512);
      a(q, x, l / 2, G, -1);
      a(q, y, l / 2, n.get(0)).i - 12, -1);
    }
    this.j.P().a(twitter);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.E();
    String color = "";
    int mt = 0;
    if ((mouseX < 65) && (mouseY < 15))
    {
      color = Color.cl("b");
      bfl.a(0.052D, 0.047D, 0.052D);
      mt = -5;
    }
    else
    {
      bfl.a(0.05D, 0.045D, 0.05D);
    }
    b(15 + mt, 15 + mt, 0, 0, 250, 255);
    bfl.F();
    getInstancedraw.drawString(color + "@LabyMod", 15.0D, 2.0D, 1.0D);
    if ((getInstancesupportApply) && (getLocale() != null) && (getLocale().toString().equals("de_DE")))
    {
      getInstancedraw.drawString(Color.cl("f") + "Supporter Bewerbungsphase", 16.0D, 12.0D, 0.7D);
      getInstancedraw.drawString(Color.cl("f") + "LabyMod.net/apply", 16.0D, 19.0D, 0.7D);
    }
    super.a(mouseX, mouseY, partialTicks);
    LabyMod.getInstance().overlay(mouseX, mouseY);
  }
  
  public Locale getLocale()
  {
    if (locale == null) {
      locale = new Locale(System.getProperty("user.language"), System.getProperty("user.country"));
    }
    return locale;
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    if ((mouseX < 65) && (mouseY < 15)) {
      LabyMod.getInstance().openWebpage("https://twitter.com/LabyMod");
    }
    synchronized (w)
    {
      if ((x.length() > 0) && (mouseX >= F) && (mouseX <= H) && (mouseY >= G) && (mouseY <= I))
      {
        aww guiconfirmopenlink = new aww(this, z, 13, true);
        guiconfirmopenlink.f();
        j.a(guiconfirmopenlink);
      }
    }
  }
}
