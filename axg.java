import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Color;
import de.labystudio.utils.DrawUtils;
import de.labystudio.utils.ServerManager;
import de.zockermaus.serverpinger.ServerData;
import de.zockermaus.serverpinger.ServerPinger;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class axg
  extends axu
{
  private final axu a;
  private final bde f;
  private avw g;
  private static final String __OBFID = "CL_00000692";
  
  public axg(axu p_i1031_1_, bde p_i1031_2_)
  {
    this.a = p_i1031_1_;
    this.f = p_i1031_2_;
  }
  
  ArrayList<String> lastTry = new ArrayList();
  String sip = "";
  long update = 0L;
  
  public void e()
  {
    this.g.a();
    if ((this.g.b().replace(" ", "").isEmpty()) || (!ConfigManager.settings.directConnectInfo))
    {
      for (String ip : this.lastTry) {
        ServerManager.remove(ip);
      }
      this.lastTry.clear();
    }
    else if (this.update + 3000L < System.currentTimeMillis())
    {
      this.update = System.currentTimeMillis();
      try
      {
        bdd serveraddress = bdd.a(this.g.b());
        for (String ip : this.lastTry) {
          if (!ip.equals(serveraddress.a())) {
            ServerManager.remove(ip);
          }
        }
        this.lastTry.clear();
        this.lastTry.add(serveraddress.a());
        ServerPinger server = new ServerPinger(serveraddress.a(), serveraddress.b());
        server.start();
        this.sip = serveraddress.a();
      }
      catch (Exception error) {}
    }
  }
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    this.n.add(new avs(0, this.l / 2 - 100, this.m / 4 + 96 + 12, bnq.a("selectServer.select", new Object[0])));
    this.n.add(new avs(1, this.l / 2 - 100, this.m / 4 + 120 + 12, bnq.a("gui.cancel", new Object[0])));
    this.g = new avw(2, this.q, this.l / 2 - 100, 116, 200, 20);
    this.g.f(128);
    this.g.b(true);
    this.g.a(this.j.t.aE);
    ((avs)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
  }
  
  public void m()
  {
    Keyboard.enableRepeatEvents(false);
    this.j.t.aE = this.g.b();
    this.j.t.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.l) {
      if (button.k == 1)
      {
        this.a.a(false, 0);
      }
      else if (button.k == 0)
      {
        this.f.b = this.g.b();
        this.a.a(true, 0);
      }
    }
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (this.g.a(typedChar, keyCode))
    {
      ((avs)this.n.get(0)).l = ((this.g.b().length() > 0) && (this.g.b().split(":").length > 0));
      this.j.t.aE = this.g.b();
    }
    else if ((keyCode == 28) || (keyCode == 156))
    {
      a((avs)this.n.get(0));
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    this.g.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    a(this.q, bnq.a("selectServer.direct", new Object[0]), this.l / 2, 20, 16777215);
    c(this.q, bnq.a("addServer.enterIp", new Object[0]), this.l / 2 - 100, 100, 10526880);
    this.g.g();
    if (ServerManager.contains(this.sip))
    {
      ServerData ping = ServerManager.get(this.sip);
      if (ping != null) {
        LabyMod.getInstance().draw.drawString(Color.c(1) + "Players: " + Color.cl("7") + ping.players + "/" + ping.maxPlayers + "    " + Color.c(1) + "Ping: " + Color.cl("7") + ping.ms + "ms", this.l / 2 - 100, 140.0D);
      }
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
