package de.labystudio.utils;

import ave;
import avs;
import avw;
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
  private avw field;
  
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
    LabyMod.getInstance().openWebpage("http://www.labymod.net/key/?id=" + LabyMod.getInstance().getPlayerUUID().toString() + "&pin=" + this.pin, false);
  }
  
  public void b()
  {
    this.n.clear();
    this.n.add(new avs(5, this.l / 2 - 120, this.m / 2 + 10, 170, 20, "Okay"));
    this.n.add(new avs(6, this.l / 2 + 55, this.m / 2 + 10, 75, 20, "Not working?"));
    
    this.field = new avw(0, this.j.k, this.l / 2 - 100, this.m / 2 + 35, 200, 20);
    this.field.e(false);
    this.field.f(640);
    this.field.a("http://www.labymod.net/key/?id=" + LabyMod.getInstance().getPlayerUUID().toString() + "&pin=" + this.pin);
    super.b();
  }
  
  protected void a(avs button)
    throws IOException
  {
    if (button.k == 5) {
      ave.A().a(this.multiplayerScreen);
    }
    if (button.k == 6)
    {
      this.field.e(true);
      this.field.b(true);
      this.field.e();
      this.field.i(this.field.h() - 1);
      button.l = false;
    }
    super.a(button);
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    this.field.a(typedChar, keyCode);
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    this.field.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c(0);
    LabyMod.getInstance().draw.drawCenteredString(Color.cl("a") + "A new tab containing a form to register", this.l / 2, this.m / 2 - 20);
    LabyMod.getInstance().draw.drawCenteredString(Color.cl("a") + "your account has been opened in your browser", this.l / 2, this.m / 2 - 10);
    
    this.field.g();
    if (this.field.r()) {
      LabyMod.getInstance().draw.drawCenteredString(Color.cl("c") + "Open this link in your Browser", this.l / 2, this.m / 2 + 60);
    }
    super.a(mouseX, mouseY, partialTicks);
  }
}
