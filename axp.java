import de.labystudio.gui.GuiGommeHDSearch;
import de.labystudio.gui.GuiMenuScreen;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.listener.GommeHD;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
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
  ServerPinger pinger;
  
  public axp()
  {
    super(null);
    childScreen = this;
    id = "Menu";
  }
  
  public void b()
  {
    confirmDisconnect = 0;
    a = 0;
    n.clear();
    int i = -16;
    int j = 98;
    n.add(returnToMenu = new avs(1, l / 2 - 100, m / 4 + 120 + i, bnq.a("menu.returnToMenu", new Object[0])));
    if (!this.j.E()) {
      n.get(0)).j = bnq.a("menu.disconnect", new Object[0]);
    }
    n.add(new avs(4, l / 2 - 100, m / 4 + 24 + i, bnq.a("menu.returnToGame", new Object[0])));
    n.add(new avs(0, l / 2 - 100, m / 4 + 96 + i, 98, 20, bnq.a("menu.options", new Object[0])));
    avs guibutton;
    n.add(guibutton = new avs(7, l / 2 + 2, m / 4 + 96 + i, 98, 20, bnq.a("menu.shareToLan", new Object[0])));
    n.add(new avs(5, l / 2 - 100, m / 4 + 48 + i, 98, 20, bnq.a("gui.achievements", new Object[0])));
    n.add(new avs(6, l / 2 + 2, m / 4 + 48 + i, 98, 20, bnq.a("gui.stats", new Object[0])));
    l = ((this.j.F()) && (!this.j.G().b()));
    if (GommeHD.isGommeHD()) {
      n.add(new avs(8, l - 53, m - 23, 50, 20, "Search"));
    }
    String t = Color.cl("a") + "Gui enabled";
    if (settingshideMod) {
      t = Color.cl("c") + "Gui disabled";
    }
    n.add(new avs(9, l - 70, 4, 67, 20, t));
    super.b();
    
    ServerPinger server = new ServerPinger(getInstanceip, getInstanceport);
    server.start();
    pinger = server;
  }
  
  protected void a(avs button)
    throws IOException
  {
    switch (k)
    {
    case 0: 
      j.a(new axn(this, j.t));
      break;
    case 1: 
      if ((settingsconfirmDisconnect) && (!ave.A().F()) && 
        (confirmDisconnect < 1))
      {
        confirmDisconnect += 1;
        returnToMenu.j = (Color.cl("c") + "Press again to confirm disconnect");
        return;
      }
      l = false;
      boolean flag = j.E();
      boolean flag1 = j.al();
      l = false;
      j.f.H();
      j.a((bdb)null);
      if (flag)
      {
        j.a(new aya());
      }
      else if (flag1)
      {
        RealmsBridge realmsbridge = new RealmsBridge();
        realmsbridge.switchToRealms(new aya());
      }
      else
      {
        j.a(new azh(new aya()));
      }
    case 2: 
    case 3: 
    default: 
      break;
    case 4: 
      j.a((axu)null);
      j.n();
      break;
    case 5: 
      j.a(new aye(this, j.h.x()));
      break;
    case 6: 
      j.a(new ayf(this, j.h.x()));
      break;
    case 7: 
      j.a(new axw(this));
      break;
    case 8: 
      j.a(new GuiGommeHDSearch());
      break;
    }
    settingshideMod = (!settingshideMod);
    b();
    ConfigManager.save();
    
    super.actionPermformed(button);
  }
  
  public void drawServerInfo()
  {
    if (!settingsinfoInMenu) {
      return;
    }
    if (getInstanceip.isEmpty()) {
      return;
    }
    String ip = getInstanceip;
    if ((pinger != null) && (pinger.getCurrentData() != null) && (pinger.getCurrentData().motd != null)) {
      try
      {
        int i = getInstancedraw.getHeight() - 32;
        String st = Color.c + "c" + getInstanceip.toUpperCase() + " " + Color.c + "5Players: " + Color.c + "f" + pinger.getCurrentData().players + "/" + pinger.getCurrentData().maxPlayers + " " + Color.c + "5Ping:" + Color.c + "f " + Color.c + "a" + pinger.getCurrentData().ms + "ms";
        DrawUtils.a(1, i - 2, getInstancedraw.getStringWidth(st) + 5, m - 1, Integer.MIN_VALUE);
        getInstancedraw.drawString(st, 3.0D, i);
        i += 10;
        if (pinger.getCurrentData().motd.contains("\n"))
        {
          String[] s = pinger.getCurrentData().motd.split("\n");
          getInstancedraw.drawString(s[0], 3.0D, i);
          i += 10;
          getInstancedraw.drawString(s[1], 3.0D, i);
        }
        else
        {
          int l = 45;
          if (pinger.getCurrentData().motd.length() > l)
          {
            getInstancedraw.drawString(pinger.getCurrentData().motd.substring(0, l), 3.0D, i);
            i += 10;
            getInstancedraw.drawString(pinger.getCurrentData().motd.substring(l, pinger.getCurrentData().motd.length()), 3.0D, i);
          }
          else
          {
            getInstancedraw.drawString(pinger.getCurrentData().motd, 3.0D, i);
          }
        }
        getInstanceplayerPing = pinger.getCurrentData().ms;
      }
      catch (Exception error)
      {
        error.printStackTrace();
      }
    } else if (!j.F()) {
      getInstancedraw.drawString(Color.cl("c") + "Loading server information..", 2.0D, getInstancedraw.getHeight() - 10);
    }
  }
  
  public void e()
  {
    super.e();
    f += 1;
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, bnq.a("menu.game", new Object[0]), l / 2, 40, 16777215);
    drawServerInfo();
    super.a(mouseX, mouseY, partialTicks);
  }
}
