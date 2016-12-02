package de.labystudio.utils;

import ave;
import avs;
import axu;
import de.labystudio.labymod.LabyMod;
import java.io.IOException;
import java.io.PrintStream;
import java.util.List;
import java.util.UUID;

public class WebPanel
  extends axu
{
  private axu multiplayerScreen;
  private String pin;
  
  public static void open(String message, axu multiplayerScreen)
  {
    message = Color.removeColor(message);
    System.out.println(message);
    if ((!message.contains("Created PIN for ")) && (!message.contains("You need LabyMod to register"))) {
      return;
    }
    if (!message.contains(":")) {
      return;
    }
    ave.A().a(new WebPanel(message.split("\n")[1], multiplayerScreen));
  }
  
  public WebPanel(String pin, axu multiplayerScreen)
  {
    this.pin = pin;
    this.multiplayerScreen = multiplayerScreen;
    LabyMod.getInstance().openWebpage("http://labymod.net/key/?id=" + LabyMod.getInstance().getPlayerUUID().toString() + "&pin=" + this.pin);
  }
  
  public void b()
  {
    n.clear();
    n.add(new avs(5, l / 2 - 100, m / 2 + 10, "Okay"));
    super.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (k == 5) {
      ave.A().a(multiplayerScreen);
    }
    super.a(button);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    getInstancedraw.drawCenteredString(Color.cl("a") + "A new tab containing a form to register", l / 2, m / 2 - 20);
    getInstancedraw.drawCenteredString(Color.cl("a") + "your account has been opened in your browser", l / 2, m / 2 - 10);
    super.a(mouseX, mouseY, partialTicks);
  }
}
