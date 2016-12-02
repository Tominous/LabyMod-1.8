package mods.accountmanager.gui;

import ave;
import avm;
import avn;
import avs;
import axu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.DrawUtils;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Field;
import java.util.List;
import java.util.UUID;
import mods.accountmanager.Account;
import mods.accountmanager.utils.FancyTextField;
import org.apache.commons.io.IOUtils;
import org.lwjgl.input.Keyboard;

public class LoginGui
  extends axu
{
  DrawUtils draw;
  
  public LoginGui()
  {
    this.draw = LabyMod.getInstance().draw;
  }
  
  public static String openNewAccountManagerGui = null;
  private String selectedFriend = "";
  private boolean allowScroll = false;
  private FancyTextField username;
  private FancyTextField password;
  private avs done;
  private avs cancel;
  
  public void b()
  {
    Keyboard.enableRepeatEvents(true);
    this.n.clear();
    
    this.username = new FancyTextField(-1, ave.A().k, this.l / 2 - 100, this.m / 2 - 50, 200, 20);
    
    this.username.setMaxStringLength(32);
    
    this.password = new FancyTextField(-1, ave.A().k, this.l / 2 - 100, this.m / 2, 200, 20);
    
    this.password.setPassword(true);
    this.password.setMaxStringLength(32);
    
    this.done = new avs(0, this.l / 2 - 100, this.m / 2 + 28, "Login");
    
    this.n.add(this.done);
    
    this.cancel = new avs(1, this.l / 2 - 100, this.m / 2 + 53, "Back");
    
    this.n.add(this.cancel);
    
    super.b();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if ((this.done.l) && ((keyCode == 28) || (keyCode == 156))) {
      a(this.done);
    }
    if (keyCode == 15) {
      if (!this.password.isFocused())
      {
        this.username.setFocused(false);
        this.password.setFocused(true);
      }
      else
      {
        this.username.setFocused(true);
        this.password.setFocused(false);
      }
    }
    if ((keyCode == 1) && (this.login))
    {
      this.j.a(new AccountManagerGUI());
      return;
    }
    this.username.textboxKeyTyped(typedChar, keyCode);
    this.password.textboxKeyTyped(typedChar, keyCode);
    
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    this.username.mouseClicked(mouseX, mouseY, mouseButton);
    this.password.mouseClicked(mouseX, mouseY, mouseButton);
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
    if (button.k == 0)
    {
      this.login = true;
      new Login().start();
    }
    if (button.k == 1) {
      this.j.a(new AccountManagerGUI());
    }
  }
  
  class Login
    extends Thread
  {
    Login() {}
    
    public void run()
    {
      String result = de.labystudio.account.AccountManager.login(
        LoginGui.this.username.getText(), 
        LoginGui.this.password.getText());
      if (result.isEmpty())
      {
        avm session = LoginGui.this.getCurrentSession();
        if ((session != null) && 
          (!mods.accountmanager.AccountManager.containsAccount(session
          .c())))
        {
          JsonParser parser = new JsonParser();
          String text = null;
          try
          {
            text = IOUtils.toString(new FileInputStream("launcher_profiles.json"));
          }
          catch (FileNotFoundException e)
          {
            e.printStackTrace();
          }
          catch (IOException e)
          {
            e.printStackTrace();
          }
          if (text != null)
          {
            JsonObject object = parser.parse(text).getAsJsonObject();
            
            JsonObject authenticationDatabase = object.get("authenticationDatabase").getAsJsonObject();
            JsonObject newAccount = new JsonObject();
            newAccount.addProperty("displayName", session
              .c());
            newAccount.addProperty("accessToken", session
              .d());
            newAccount.addProperty("uuid", session.b());
            newAccount.addProperty("username", 
              LoginGui.this.username.getText());
            
            authenticationDatabase.add(session.b()
              .replace("-", ""), newAccount);
            try
            {
              Gson gson = new GsonBuilder().setPrettyPrinting().create();
              
              FileWriter file = new FileWriter("launcher_profiles.json");
              
              file.write(gson.toJson(object));
              file.flush();
              file.close();
              System.out.println("Logged in into account " + session
                .c());
            }
            catch (Exception ex)
            {
              ex.printStackTrace();
            }
          }
          mods.accountmanager.AccountManager.accounts.add(new Account(session
            .c(), session.d(), 
            UUID.fromString(session.b())));
        }
        LoginGui.this.badLogin = "";
        LoginGui.openNewAccountManagerGui = session.c();
      }
      else
      {
        LoginGui.this.badLogin = result;
        LoginGui.this.time = System.currentTimeMillis();
      }
      LoginGui.this.login = false;
    }
  }
  
  private avm getCurrentSession()
  {
    try
    {
      Field f = this.j.getClass().getDeclaredField("ae");
      f.setAccessible(true);
      
      return (avm)f.get(this.j);
    }
    catch (Exception ex)
    {
      ex.printStackTrace();
    }
    return null;
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    
    this.done.l = (!this.login);
    this.cancel.l = (!this.login);
    
    avn fontRenderer = ave.A().k;
    fontRenderer.a("Username/Email:", this.l / 2 - 100, this.m / 2 - 63, 16777215);
    
    fontRenderer.a("Password:", this.l / 2 - 100, this.m / 2 - 13, 16777215);
    if (!this.badLogin.isEmpty())
    {
      String c = "§f§l";
      a(0, 10, this.l, 30, Color.RED.getRGB());
      if ((this.time + 1000L > System.currentTimeMillis()) && (this.flash)) {
        fontRenderer.a(c + "Error: " + this.badLogin, this.l / 2 - 1 - fontRenderer
        
          .a("Error: " + this.badLogin) / 2, 16, 16777215);
      } else {
        fontRenderer.a(c + "Error: " + this.badLogin, this.l / 2 - fontRenderer
        
          .a("Error: " + this.badLogin) / 2, 16, 16777215);
      }
      this.flash = (!this.flash);
    }
    if (this.login)
    {
      a(0, 10, this.l, 30, Color.BLUE.getRGB());
      fontRenderer.a("Logging in..", this.l / 2 - 1 - fontRenderer
        .a("Logging in..") / 2, 16, 16777215);
    }
    this.username.drawTextBox();
    this.password.drawTextBox();
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
