import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.zockermaus.serverpinger.ServerData;
import de.zockermaus.serverpinger.ServerPinger;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class axg
  extends axu
{
  private final axu a;
  private final bde f;
  private avw g;
  private static final String __OBFID = "CL_00000692";
  ServerPinger pinger;
  
  public axg(axu p_i1031_1_, bde p_i1031_2_)
  {
    a = p_i1031_1_;
    f = p_i1031_2_;
  }
  
  int online = 0;
  int max = 0;
  long update = 0L;
  
  public void e()
  {
    g.a();
    if ((settingsdirectConnectInfo) && (!g.b().replace(" ", "").isEmpty()) && 
      (update + 5000L < System.currentTimeMillis()))
    {
      update = System.currentTimeMillis();
      try
      {
        boolean setNull = false;
        bdd serveraddress = bdd.a(g.b());
        if ((pinger != null) && 
          (pinger.getCurrentData() != null) && 
          (pinger.getCurrentData().maxPlayers == 0) && 
          (pinger.getCurrentData().players == 0) && 
          (pinger.getCurrentData().serverName.equals(serveraddress.a()))) {
          setNull = true;
        }
        ServerPinger server = new ServerPinger(serveraddress.a(), serveraddress.b());
        server.start();
        if (setNull)
        {
          pinger = null;
          max = 0;
          online = 0;
        }
        else
        {
          pinger = server;
        }
      }
      catch (Exception error)
      {
        pinger = null;
        error.printStackTrace();
      }
    }
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    n.add(new avs(0, l / 2 - 100, m / 4 + 96 + 12, bnq.a("selectServer.select", new Object[0])));
    n.add(new avs(1, l / 2 - 100, m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    g = new avw(2, q, l / 2 - 100, 116, 200, 20);
    g.f(128);
    g.b(true);
    g.a(j.t.aE);
    n.get(0)).l = ((g.b().length() > 0) && (g.b().split(":").length > 0));
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    j.t.aE = g.b();
    j.t.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (l) {
      if (k == 1)
      {
        a.a(false, 0);
      }
      else if (k == 0)
      {
        f.b = g.b();
        a.a(true, 0);
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (g.a(typedChar, keyCode))
    {
      n.get(0)).l = ((g.b().length() > 0) && (g.b().split(":").length > 0));
      j.t.aE = g.b();
    }
    else if ((keyCode == 28) || (keyCode == 156))
    {
      a((avs)n.get(0));
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    g.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(q, bnq.a("selectServer.direct", new Object[0]), l / 2, 20, 16777215);
    c(q, bnq.a("addServer.enterIp", new Object[0]), l / 2 - 100, 100, 10526880);
    g.g();
    if (settingsdirectConnectInfo) {
      if ((pinger != null) && (pinger.getCurrentData() != null))
      {
        int s = pinger.getCurrentData().players;
        if (s > online)
        {
          if ((s - online > 500) && (s != 0)) {
            online = s;
          }
          online += 1;
        }
        if (s < online)
        {
          if ((s - online < 500) && (s != 0)) {
            online = s;
          }
          online -= 1;
        }
        if ((pinger.getCurrentData().maxPlayers != 0) && (s == 0)) {
          online = s;
        }
        s = pinger.getCurrentData().maxPlayers;
        if (s != 0) {
          max = s;
        }
        boolean refresh = (pinger.getCurrentData().maxPlayers == 0) && (pinger.getCurrentData().players == 0);
        if (refresh) {
          getInstancedraw.drawString(Color.c(1) + "Players: " + Color.cl("c") + online + "/" + max, l / 2 - 100, 140.0D);
        } else {
          getInstancedraw.drawString(Color.c(1) + "Players: " + Color.cl("7") + online + "/" + max, l / 2 - 100, 140.0D);
        }
      }
      else
      {
        getInstancedraw.drawString(Color.cl("c") + "Pinging..", l / 2 - 100, 140.0D);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
