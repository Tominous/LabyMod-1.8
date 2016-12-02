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
    draw = getInstancedraw;
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
    n.clear();
    
    username = new FancyTextField(-1, Ak, l / 2 - 100, m / 2 - 50, 200, 20);
    
    username.setMaxStringLength(32);
    
    password = new FancyTextField(-1, Ak, l / 2 - 100, m / 2, 200, 20);
    
    password.setPassword(true);
    password.setMaxStringLength(32);
    
    done = new avs(0, l / 2 - 100, m / 2 + 28, "Login");
    
    n.add(done);
    
    cancel = new avs(1, l / 2 - 100, m / 2 + 53, "Back");
    
    n.add(cancel);
    
    super.b();
  }
  
  protected void a(char typedChar, int keyCode)
    throws IOException
  {
    if ((done.l) && ((keyCode == 28) || (keyCode == 156))) {
      a(done);
    }
    if (keyCode == 15) {
      if (!password.isFocused())
      {
        username.setFocused(false);
        password.setFocused(true);
      }
      else
      {
        username.setFocused(true);
        password.setFocused(false);
      }
    }
    if ((keyCode == 1) && (login))
    {
      j.a(new AccountManagerGUI());
      return;
    }
    username.textboxKeyTyped(typedChar, keyCode);
    password.textboxKeyTyped(typedChar, keyCode);
    
    super.a(typedChar, keyCode);
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    username.mouseClicked(mouseX, mouseY, mouseButton);
    password.mouseClicked(mouseX, mouseY, mouseButton);
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
      j.a(new AccountManagerGUI());
    }
  }
  
  class Login
    extends Thread
  {
    Login() {}
    
    public void run()
    {
      String result = de.labystudio.account.AccountManager.login(
        username.getText(), 
        password.getText());
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
              username.getText());
            
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
        badLogin = "";
        LoginGui.openNewAccountManagerGui = session.c();
      }
      else
      {
        badLogin = result;
        time = System.currentTimeMillis();
      }
      login = false;
    }
  }
  
  private avm getCurrentSession()
  {
    try
    {
      Field f = j.getClass().getDeclaredField("ae");
      f.setAccessible(true);
      
      return (avm)f.get(j);
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
    
    done.l = (!login);
    cancel.l = (!login);
    
    avn fontRenderer = Ak;
    fontRenderer.a("Username/Email:", l / 2 - 100, m / 2 - 63, 16777215);
    
    fontRenderer.a("Password:", l / 2 - 100, m / 2 - 13, 16777215);
    if (!badLogin.isEmpty())
    {
      String c = "§f§l";
      a(0, 10, l, 30, Color.RED.getRGB());
      if ((time + 1000L > System.currentTimeMillis()) && (flash)) {
        fontRenderer.a(c + "Error: " + badLogin, l / 2 - 1 - fontRenderer
        
          .a("Error: " + badLogin) / 2, 16, 16777215);
      } else {
        fontRenderer.a(c + "Error: " + badLogin, l / 2 - fontRenderer
        
          .a("Error: " + badLogin) / 2, 16, 16777215);
      }
      flash = (!flash);
    }
    if (login)
    {
      a(0, 10, l, 30, Color.BLUE.getRGB());
      fontRenderer.a("Logging in..", l / 2 - 1 - fontRenderer
        .a("Logging in..") / 2, 16, 16777215);
    }
    username.drawTextBox();
    password.drawTextBox();
    
    super.a(mouseX, mouseY, partialTicks);
  }
}
