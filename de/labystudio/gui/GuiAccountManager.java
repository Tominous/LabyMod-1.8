package de.labystudio.gui;

import ave;
import avs;
import axu;
import de.labystudio.account.AccountManager;
import de.labystudio.gui.extras.ModGuiTextField;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.DrawUtils;
import java.io.IOException;
import java.util.List;
import org.lwjgl.input.Keyboard;

public class GuiAccountManager
  extends axu
{
  DrawUtils draw;
  axu lastScreen;
  
  public GuiAccountManager(axu lastScreen)
  {
    draw = getInstancedraw;
    this.lastScreen = lastScreen;
  }
  
  String selectedFriend = "";
  boolean allowScroll = false;
  ModGuiTextField username;
  ModGuiTextField password;
  avs done;
  avs cancel;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    n.clear();
    
    username = new ModGuiTextField(-1, draw.fontRenderer, l / 2 - 100, m / 2 - 50, 200, 20);
    username.setBlacklistWord(" ");
    username.a(AccountManager.accountManagerUsername);
    username.f(64);
    password = new ModGuiTextField(-1, draw.fontRenderer, l / 2 - 100, m / 2, 200, 20);
    password.setBlacklistWord(" ");
    password.a(AccountManager.accountManagerPassword);
    password.setPasswordBox(true);
    password.f(64);
    
    done = new avs(0, l / 2 - 100, m / 2 + 28, "Login");
    n.add(done);
    
    cancel = new avs(1, l / 2 - 100, m / 2 + 53, "Cancel");
    n.add(cancel);
    
    super.b();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if (!login)
    {
      if (username.a(typedChar, keyCode)) {
        AccountManager.accountManagerUsername = username.b();
      }
      if (password.a(typedChar, keyCode)) {
        AccountManager.accountManagerPassword = password.b();
      }
    }
    if ((done.l) && (
      (keyCode == 28) || (keyCode == 156))) {
      a(done);
    }
    if (keyCode == 15) {
      if (!password.m())
      {
        username.b(false);
        password.b(true);
      }
      else
      {
        username.b(true);
        password.b(false);
      }
    }
    if (keyCode == 1)
    {
      if (login) {
        j.a(lastScreen);
      }
      return;
    }
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    username.a(mouseX, mouseY, mouseButton);
    password.a(mouseX, mouseY, mouseButton);
    super.a(mouseX, mouseY, mouseButton);
  }
  
  String badLogin = "";
  long time = 0L;
  boolean flash = false;
  boolean login = false;
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (k == 0)
    {
      login = true;
      new Login().start();
    }
    if (k == 1) {
      j.a(lastScreen);
    }
  }
  
  class Login
    extends Thread
  {
    Login() {}
    
    public void run()
    {
      String result = AccountManager.login(username.b(), password.b());
      if (result.isEmpty())
      {
        badLogin = "";
        j.a(lastScreen);
      }
      else
      {
        badLogin = result;
        time = System.currentTimeMillis();
      }
      login = false;
    }
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    
    done.l = (!login);
    cancel.l = (!login);
    
    draw.drawString("Username/Email:", l / 2 - 100, m / 2 - 63);
    draw.drawString("Password:", l / 2 - 100, m / 2 - 13);
    if (!badLogin.isEmpty())
    {
      String c = de.labystudio.utils.Color.cl("f");
      a(0, 10, l, 30, java.awt.Color.RED.getRGB());
      if ((time + 1000L > System.currentTimeMillis()) && (flash)) {
        draw.drawCenteredString(c + "Error: " + badLogin, l / 2 - 1, 16);
      } else {
        draw.drawCenteredString(c + "Error: " + badLogin, l / 2, 16);
      }
      flash = (!flash);
    }
    if (login)
    {
      a(0, 10, l, 30, java.awt.Color.BLUE.getRGB());
      draw.drawCenteredString("Logging in..", l / 2 - 1, 16);
    }
    username.g();
    password.g();
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
