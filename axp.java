import de.labystudio.gui.GuiGommeHDSearch;
import de.labystudio.gui.GuiMenuScreen;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.listener.GommeHD;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServerManager;
import de.zockermaus.serverpinger.ServerData;
import de.zockermaus.serverpinger.ServerPinger;
import java.io.IOException;
import java.util.List;
import net.minecraft.realms.RealmsBridge;

public class axp
  extends GuiMenuScreen
{
  private int a;
  private int f;
  int confirmDisconnect = 0;
  avs returnToMenu;
  
  public axp()
  {
    super(null);
    this.childScreen = this;
    this.id = "Menu";
  }
  
  public void b()
  {
    this.confirmDisconnect = 0;
    this.a = 0;
    this.n.clear();
    int i = -16;
    int j = 98;
    this.n.add(this.returnToMenu = new avs(1, this.l / 2 - 100, this.m / 4 + 120 + i, bnq.a("menu.returnToMenu", new Object[0])));
    if (!this.j.E()) {
      ((avs)this.n.get(0)).j = bnq.a("menu.disconnect", new Object[0]);
    }
    this.n.add(new avs(4, this.l / 2 - 100, this.m / 4 + 24 + i, bnq.a("menu.returnToGame", new Object[0])));
    this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + i, 98, 20, bnq.a("menu.options", new Object[0])));
    avs guibutton;
    this.n.add(guibutton = new avs(7, this.l / 2 + 2, this.m / 4 + 96 + i, 98, 20, bnq.a("menu.shareToLan", new Object[0])));
    this.n.add(new avs(5, this.l / 2 - 100, this.m / 4 + 48 + i, 98, 20, bnq.a("gui.achievements", new Object[0])));
    this.n.add(new avs(6, this.l / 2 + 2, this.m / 4 + 48 + i, 98, 20, bnq.a("gui.stats", new Object[0])));
    guibutton.l = ((this.j.F()) && (!this.j.G().b()));
    if (GommeHD.isGommeHD()) {
      this.n.add(new avs(8, this.l - 53, this.m - 23, 50, 20, "Search"));
    }
    String t = Color.cl("a") + "Gui enabled";
    if (ConfigManager.settings.hideMod) {
      t = Color.cl("c") + "Gui disabled";
    }
    this.n.add(new avs(9, this.l - 70, 4, 67, 20, t));
    super.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    switch (button.k)
    {
    case 0: 
      this.j.a(new axn(this, this.j.t));
      break;
    case 1: 
      if ((ConfigManager.settings.confirmDisconnect) && (!ave.A().F()) && 
        (this.confirmDisconnect < 1))
      {
        this.confirmDisconnect += 1;
        this.returnToMenu.j = (Color.cl("c") + "Press again to confirm diconnect");
        return;
      }
      button.l = false;
      boolean flag = this.j.E();
      boolean flag1 = this.j.al();
      button.l = false;
      this.j.f.H();
      this.j.a((bdb)null);
      if (flag)
      {
        this.j.a(new aya());
      }
      else if (flag1)
      {
        RealmsBridge realmsbridge = new RealmsBridge();
        realmsbridge.switchToRealms(new aya());
      }
      else
      {
        this.j.a(new azh(new aya()));
      }
    case 2: 
    case 3: 
    default: 
      break;
    case 4: 
      this.j.a((axu)null);
      this.j.n();
      break;
    case 5: 
      this.j.a(new aye(this, this.j.h.x()));
      break;
    case 6: 
      this.j.a(new ayf(this, this.j.h.x()));
      break;
    case 7: 
      this.j.a(new axw(this));
      break;
    case 8: 
      this.j.a(new GuiGommeHDSearch());
      break;
    }
    ConfigManager.settings.hideMod = (!ConfigManager.settings.hideMod);
    b();
    
    super.actionPermformed(button);
  }
  
  long update = 0L;
  
  public void drawServerInfo()
  {
    if (!ConfigManager.settings.infoInMenu) {
      return;
    }
    if (LabyMod.getInstance().ip.isEmpty()) {
      return;
    }
    String ip = LabyMod.getInstance().ip;
    if (this.update + 10000L < System.currentTimeMillis())
    {
      this.update = System.currentTimeMillis();
      ServerPinger server = new ServerPinger(LabyMod.getInstance().ip, LabyMod.getInstance().port);
      server.start();
    }
    if (ServerManager.contains(ip)) {
      try
      {
        ServerData server = ServerManager.get(ip);
        if (server != null)
        {
          int i = LabyMod.getInstance().draw.getHeight() - 32;
          String st = Color.c + "c" + LabyMod.getInstance().ip.toUpperCase() + " " + Color.c + "5Players: " + Color.c + "f" + server.players + "/" + server.maxPlayers + " " + Color.c + "5Ping:" + Color.c + "f " + Color.c + "a" + server.ms + "ms";
          DrawUtils.a(1, i - 2, LabyMod.getInstance().draw.getStringWidth(st) + 5, this.m - 1, Integer.MIN_VALUE);
          LabyMod.getInstance().draw.drawString(st, 3.0D, i);
          i += 10;
          if (server.motd.contains("\n"))
          {
            String[] s = server.motd.split("\n");
            LabyMod.getInstance().draw.drawString(s[0], 3.0D, i);
            i += 10;
            LabyMod.getInstance().draw.drawString(s[1], 3.0D, i);
          }
          else
          {
            int l = 45;
            if (server.motd.length() > l)
            {
              LabyMod.getInstance().draw.drawString(server.motd.substring(0, l), 3.0D, i);
              i += 10;
              LabyMod.getInstance().draw.drawString(server.motd.substring(l, server.motd.length()), 3.0D, i);
            }
            else
            {
              LabyMod.getInstance().draw.drawString(server.motd, 3.0D, i);
            }
          }
          LabyMod.getInstance().playerPing = server.ms;
        }
      }
      catch (Exception error) {}
    } else if (!this.j.F()) {
      LabyMod.getInstance().draw.drawString(Color.cl("c") + "Loading server information..", 2.0D, LabyMod.getInstance().draw.getHeight() - 10);
    }
  }
  
  public void e()
  {
    super.e();
    this.f += 1;
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, bnq.a("menu.game", new Object[0]), this.l / 2, 40, 16777215);
    drawServerInfo();
    super.a(mouseX, mouseY, partialTicks);
  }
}
