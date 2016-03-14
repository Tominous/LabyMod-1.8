import com.google.common.collect.Lists;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Source;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServerBroadcast;
import de.labystudio.utils.TextureManager;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Method;
import java.net.URI;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
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
  
  public aya()
  {
    this.y = a;
    this.r = "missingno";
    BufferedReader bufferedreader = null;
    this.labyModMessage = false;
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
          this.r = ((String)list.get(h.nextInt(list.size())));
          if (this.r.hashCode() != 125780783) {
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
      this.i = h.nextFloat();
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
    this.x = "";
    if ((!GLContext.getCapabilities().OpenGL20) && (!bqs.b()))
    {
      this.x = bnq.a("title.oldgl1", new Object[0]);
      this.y = bnq.a("title.oldgl2", new Object[0]);
      this.z = "https://help.mojang.com/customer/portal/articles/325948?ref=game";
    }
    if (!Source.mod_VersionType.isEmpty())
    {
      this.x = ("You are using a " + Color.clc("e") + Source.mod_VersionType + Color.clc("f") + " version of the LabyMod!");
      this.y = "This is an unstable Version and bugs may occur.";
      this.z = "";
    }
    setUpdate();
  }
  
  public void setUpdate()
  {
    if ((LabyMod.getInstance().getServerBroadcast() != null) && (LabyMod.getInstance().getServerBroadcast().getLine1() != ""))
    {
      this.x = LabyMod.getInstance().getServerBroadcast().getLine1();
      this.y = LabyMod.getInstance().getServerBroadcast().getLine2();
      this.z = LabyMod.getInstance().getServerBroadcast().getUrl();
      this.labyModMessage = true;
    }
    if (LabyMod.getInstance().chatPacketUpdate)
    {
      this.x = ("A new LabyMod Version " + LabyMod.getInstance().latestVersionName + " is available!");
      this.y = ("Click " + Color.clc("n") + "here" + Color.clc("f") + " to download the latest version.");
      this.z = Source.url_Update;
    }
  }
  
  public void e()
  {
    this.t += 1;
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
    this.u = new blz(256, 256);
    this.J = this.j.P().a("background", this.u);
    Calendar calendar = Calendar.getInstance();
    calendar.setTime(new Date());
    if ((calendar.get(2) + 1 == 12) && (calendar.get(5) == 24)) {
      this.r = "Merry X-mas!";
    } else if ((calendar.get(2) + 1 == 1) && (calendar.get(5) == 1)) {
      this.r = "Happy new year!";
    } else if ((calendar.get(2) + 1 == 10) && (calendar.get(5) == 31)) {
      this.r = "OOoooOOOoooo! Spooky!";
    } else if ((calendar.get(2) + 1 == 11) && (calendar.get(5) == 24)) {
      this.r = "Happy birthday, LabyStudio!";
    } else if ((calendar.get(2) + 1 == 6) && (calendar.get(5) == 23)) {
      this.r = "Happy birthday, Zockermaus!";
    } else if ((calendar.get(2) + 1 == 10) && (calendar.get(5) == 21)) {
      this.r = "Back to the Future!";
    }
    int i = 24;
    int j = this.m / 4 + 48;
    if (this.j.t()) {
      c(j, 24);
    } else {
      b(j, 24);
    }
    this.n.add(new avs(0, this.l / 2 - 100, j + 72 + 12, 98, 20, bnq.a("menu.options", new Object[0])));
    this.n.add(new avs(4, this.l / 2 + 2, j + 72 + 12, 98, 20, bnq.a("menu.quit", new Object[0])));
    this.n.add(new avz(5, this.l / 2 - 124, j + 72 + 12));
    synchronized (this.w)
    {
      this.E = this.q.a(this.x);
      this.D = this.q.a(this.y);
      int k = Math.max(this.E, this.D);
      this.F = ((this.l - k) / 2);
      this.G = (((avs)this.n.get(0)).i - 24);
      this.H = (this.F + k);
      this.I = (this.G + 24);
    }
    this.j.a(false);
    LabyMod.getInstance().resetMod();
    LabyMod.getInstance().resetIP();
  }
  
  private void b(int p_73969_1_, int p_73969_2_)
  {
    this.n.add(new avs(1, this.l / 2 - 100, p_73969_1_, bnq.a("menu.singleplayer", new Object[0])));
    this.n.add(new avs(2, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 1, bnq.a("menu.multiplayer", new Object[0])));
    try
    {
      LabyMod.getInstance();LabyMod.overWrite();
      String quickPlay = this.j.t.aE;
      String lastServer = ConfigManager.settings.last_Server;
      String realms = "Minecraft Realms";
      if ((quickPlay != null) && (ConfigManager.settings.quickPlay))
      {
        if (this.j.t.aE.isEmpty())
        {
          if ((ConfigManager.settings.last_Server != null) && (!ConfigManager.settings.last_Server.isEmpty()))
          {
            this.n.add(new avs(14, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(realms, new Object[0])));
            if (lastServer.length() > 16) {
              lastServer = lastServer.substring(0, 16);
            }
            this.n.add(new avs(7, this.l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
          }
          else
          {
            this.n.add(new avs(14, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(realms, new Object[0])));
          }
        }
        else if ((ConfigManager.settings.last_Server != null) && (!ConfigManager.settings.last_Server.isEmpty()))
        {
          if (quickPlay.length() > 16) {
            quickPlay = quickPlay.substring(0, 16);
          }
          this.n.add(new avs(6, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(quickPlay, new Object[0])));
          if (lastServer.length() > 16) {
            lastServer = lastServer.substring(0, 16);
          }
          this.n.add(new avs(7, this.l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
        }
        else
        {
          if (quickPlay.length() > 32) {
            quickPlay = quickPlay.substring(0, 32);
          }
          this.n.add(new avs(6, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(quickPlay, new Object[0])));
        }
      }
      else if ((ConfigManager.settings.last_Server != null) && (!ConfigManager.settings.last_Server.isEmpty()) && (ConfigManager.settings.quickPlay))
      {
        this.n.add(new avs(14, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(realms, new Object[0])));
        if (lastServer.length() > 16) {
          lastServer = lastServer.substring(0, 16);
        }
        this.n.add(new avs(7, this.l / 2 + 2, p_73969_1_ + p_73969_2_ * 2, 98, 20, bnq.a(lastServer, new Object[0])));
      }
      else
      {
        this.n.add(new avs(14, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, bnq.a(realms, new Object[0])));
      }
    }
    catch (Exception error)
    {
      for (int i = 0; i <= this.n.size() - 1; i++)
      {
        avs b = (avs)this.n.get(i);
        b.m = false;
      }
      avs a = new avs(-1, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2 - 45, Color.clc("4") + "An error occurred while loading the LabyMod!");
      a.noGui = true;
      this.n.add(a);
      this.n.add(new avs(16, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2 - 25, Color.clc("e") + "Option 1: " + Color.clc("c") + "Reload the LabyMod"));
      this.n.add(new avs(15, this.l / 2 - 100, p_73969_1_ + p_73969_2_ * 2, Color.clc("e") + "Option 2: " + Color.clc("c") + "Delete LabyMod config file"));
      return;
    }
  }
  
  private void c(int p_73972_1_, int p_73972_2_)
  {
    this.n.add(new avs(11, this.l / 2 - 100, p_73972_1_, bnq.a("menu.playdemo", new Object[0])));
    this.n.add(this.s = new avs(12, this.l / 2 - 100, p_73972_1_ + p_73972_2_ * 1, bnq.a("menu.resetdemo", new Object[0])));
    atr isaveformat = this.j.f();
    ato worldinfo = isaveformat.c("Demo_World");
    if (worldinfo == null) {
      this.s.l = false;
    }
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 0) {
      this.j.a(new axn(this, this.j.t));
    }
    if (button.k == 5) {
      this.j.a(new axl(this, this.j.t, this.j.S()));
    }
    if (button.k == 1) {
      this.j.a(new axv(this));
    }
    if (button.k == 2) {
      this.j.a(new azh(this));
    }
    if (button.k == 4) {
      this.j.m();
    }
    if (button.k == 11) {
      this.j.a("Demo_World", "Demo_World", kx.a);
    }
    if (button.k == 6) {
      LabyMod.getInstance().connectToServer(this.j.t.aE);
    }
    if (button.k == 7) {
      LabyMod.getInstance().connectToServer(ConfigManager.settings.last_Server);
    }
    if (button.k == 12)
    {
      atr var2 = this.j.f();
      ato var3 = var2.c("Demo_World");
      if (var3 != null)
      {
        awy var4 = axv.a(this, var3.k(), 12);
        this.j.a(var4);
      }
    }
    if (button.k == 14) {
      a();
    }
    if (button.k == 16) {
      this.j.a(this);
    }
    if (button.k == 15)
    {
      File configFile = new File(Source.file_Config);
      if (configFile.exists())
      {
        configFile.delete();
        ConfigManager.loadProperties(true);
        this.j.a(new aya());
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
      atr isaveformat = this.j.f();
      isaveformat.d();
      isaveformat.e("Demo_World");
      this.j.a(this);
    }
    else if (id == 13)
    {
      if (result) {
        try
        {
          Class<?> oclass = Class.forName("java.awt.Desktop");
          Object object = oclass.getMethod("getDesktop", new Class[0]).invoke(null, new Object[0]);
          oclass.getMethod("browse", new Class[] { URI.class }).invoke(object, new Object[] { new URI(this.z) });
        }
        catch (Throwable throwable)
        {
          g.error("Couldn't open link", throwable);
        }
      }
      this.j.a(this);
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
      bfl.b(ns.a((this.t + p_73970_3_) / 400.0F) * 25.0F + 20.0F, 1.0F, 0.0F, 0.0F);
      bfl.b(-(this.t + p_73970_3_) * 0.1F, 0.0F, 1.0F, 0.0F);
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
    this.j.P().a(this.J);
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
      int l = this.m;
      float f1 = (j - i / 2) / 256.0F;
      worldrenderer.b(k, l, this.e).a(0.0F + f1, 1.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(k, 0.0D, this.e).a(1.0F + f1, 1.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(0.0D, 0.0D, this.e).a(1.0F + f1, 0.0D).a(1.0F, 1.0F, 1.0F, f).d();
      worldrenderer.b(0.0D, l, this.e).a(0.0F + f1, 0.0D).a(1.0F, 1.0F, 1.0F, f).d();
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
    bfl.b(0, 0, this.j.d, this.j.e);
    float f = this.l > this.m ? 120.0F / this.l : 120.0F / this.m;
    float f1 = this.m * f / 256.0F;
    float f2 = this.l * f / 256.0F;
    int i = this.l;
    int j = this.m;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.i);
    worldrenderer.b(0.0D, j, this.e).a(0.5F - f1, 0.5F + f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(i, j, this.e).a(0.5F - f1, 0.5F - f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(i, 0.0D, this.e).a(0.5F + f1, 0.5F - f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    worldrenderer.b(0.0D, 0.0D, this.e).a(0.5F + f1, 0.5F + f2).a(1.0F, 1.0F, 1.0F, 1.0F).d();
    tessellator.b();
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    if ((!this.labyModMessage) && (
      (LabyMod.getInstance().chatPacketUpdate) || (LabyMod.getInstance().getServerBroadcast() != null)))
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
    int j = this.l / 2 - i / 2;
    int k = 30;
    a(0, 0, this.l, this.m, -2130706433, 16777215);
    a(0, 0, this.l, this.m, 0, Integer.MIN_VALUE);
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
    bfl.b(this.l / 2 + 90, 70.0F, 0.0F);
    bfl.b(-20.0F, 0.0F, 0.0F, 1.0F);
    float f = 1.8F - ns.e(ns.a((float)(ave.J() % 1000L) / 1000.0F * 3.1415927F * 2.0F) * 0.1F);
    f = f * 100.0F / (this.q.a(this.r) + 32);
    bfl.a(f, f, f);
    a(this.q, this.r, 0, -8, 65280);
    bfl.F();
    String s = "Minecraft 1.8.8";
    if (this.j.t()) {
      s = s + " Demo";
    }
    c(this.q, "" + Source.mod_Name + " " + Source.mod_VersionName + " " + Source.mod_VersionType, 2, this.m - 10, -1);
    c(this.q, s, 2, this.m - 20, -1);
    
    bfl.c(1.0F, 1.0F, 1.0F);
    
    LabyMod.getInstance().draw.drawCenteredString("LabyMod Developer", this.l - 55, this.m - 29, 0.8D);
    int m = 48;
    LabyMod.getInstance().textureManager.drawPlayerHead("LabyStudio", this.l - 50 - m, this.m - 18, 0.4D);
    LabyMod.getInstance().draw.drawCenteredString("LabyStudio", this.l - 43 - m, this.m - 7, 0.6D);
    m = 10;
    LabyMod.getInstance().textureManager.drawPlayerHead("Zockermaus", this.l - 50 - m, this.m - 18, 0.4D);
    LabyMod.getInstance().draw.drawCenteredString("Zockermaus", this.l - 43 - m, this.m - 7, 0.6D);
    m = -25;
    LabyMod.getInstance().textureManager.drawPlayerHead("_qlow", this.l - 50 - m, this.m - 18, 0.4D);
    LabyMod.getInstance().draw.drawCenteredString("_qlow", this.l - 44 - m, this.m - 7, 0.6D);
    if ((this.x != null) && (this.x.length() > 0))
    {
      a(this.F - 2, this.G - 2, this.H + 2, this.I - 1, 1428160512);
      a(this.q, this.x, this.l / 2, this.G, -1);
      a(this.q, this.y, this.l / 2, ((avs)this.n.get(0)).i - 12, -1);
    }
    super.a(mouseX, mouseY, partialTicks);
    LabyMod.getInstance().overlay(mouseX, mouseY);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    synchronized (this.w)
    {
      if ((this.x.length() > 0) && (mouseX >= this.F) && (mouseX <= this.H) && (mouseY >= this.G) && (mouseY <= this.I))
      {
        aww guiconfirmopenlink = new aww(this, this.z, 13, true);
        guiconfirmopenlink.f();
        this.j.a(guiconfirmopenlink);
      }
    }
  }
}
