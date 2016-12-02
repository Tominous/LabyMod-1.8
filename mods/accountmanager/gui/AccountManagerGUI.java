package mods.accountmanager.gui;

import ave;
import avn;
import avr;
import avs;
import axu;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.modapi.ModAPI;
import java.awt.Color;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import mods.accountmanager.Account;
import mods.accountmanager.AccountManager;
import mods.accountmanager.utils.FancyButton;
import org.apache.commons.codec.Charsets;
import org.apache.commons.io.IOUtils;

public class AccountManagerGUI
  extends axu
{
  public static final avn fontRendererObj = ave.A().k;
  private AccountList list;
  private static avr resolution;
  
  public AccountList getList()
  {
    return this.list;
  }
  
  public AccountManagerGUI() {}
  
  public AccountManagerGUI(String userName)
  {
    AccountManager.loadPlayerHead(userName);
    
    this.statusMessage = ("§aAdded account: " + userName);
    this.lastStatusMessageChanged = System.currentTimeMillis();
  }
  
  public void b()
  {
    resolution = new avr(ave.A());
    this.n.clear();
    if (AccountManager.accounts.size() != 0)
    {
      this.list = new AccountList(ave.A(), resolution.a() - 20, resolution.b() - 50, 25, resolution.b() - 25, 20, 10);
      
      List<String> accounts = new ArrayList();
      for (Account acc : AccountManager.accounts) {
        accounts.add(acc.getUserName());
      }
      this.list.setAccounts(this, accounts);
    }
    else
    {
      this.list = null;
    }
    avs login = new FancyButton(3, 5, resolution.b() - 22, 60, 20, "Login");
    login.l = false;
    
    Object logout = new FancyButton(4, 70, resolution.b() - 22, 60, 20, "Logout");
    ((avs)logout).l = false;
    
    this.n.add(new FancyButton(5, 135, resolution
      .b() - 22, 120, 20, "Add Account"));
    this.n.add(login);
    this.n.add(logout);
    
    this.n.add(new FancyButton(6, 5, 3, 20, 20, "§c«"));
    
    super.b();
  }
  
  public void a(int mouseX, int mouseY, float partialTicks)
  {
    c();
    if (this.list == null)
    {
      String info = "Something went wrong!";
      fontRendererObj.a(info, resolution.a() / 2 - fontRendererObj
        .a(info) / 2, resolution
        .b() / 2 - 2, 16777215);
    }
    else
    {
      this.list.drawScreen(mouseX, mouseY, partialTicks);
    }
    if ((!this.statusMessage.equals("")) && ((this.lastStatusMessageChanged == -1L) || 
    
      (System.currentTimeMillis() - this.lastStatusMessageChanged < 2000L)))
    {
      a(0, 10, this.l, 30, Color.BLACK.getRGB());
      fontRendererObj.a(this.statusMessage, this.l / 2 - fontRendererObj
        .a(this.statusMessage) / 2, 16, 16777215);
    }
    String devInfo = "AccountManager v1.0";
    fontRendererObj.a(devInfo, this.l - fontRendererObj.a(devInfo) - 5, 5, 16777215);
    
    super.a(mouseX, mouseY, partialTicks);
  }
  
  private String statusMessage = "";
  private long lastStatusMessageChanged = -1L;
  
  protected void a(avs button)
    throws IOException
  {
    super.a(button);
    if (button.k == 3) {
      for (final Account account : AccountManager.accounts) {
        if (account.getUserName().equals(this.list
          .getAccountEntry().getName()))
        {
          this.statusMessage = "§eLogging in...";
          this.lastStatusMessageChanged = -1L;
          
          System.out.println("[AccountManager] Logging in... (" + account
            .getUserName() + ")");
          new Thread(new Runnable()
          {
            public void run()
            {
              try
              {
                String result = AccountManagerGUI.this.performPostRequest(new URL("https://authserver.mojang.com/validate"), "{ \"accessToken\": \"" + account
                
                  .getAccessToken() + "\" }");
                if (result.equals(""))
                {
                  account.setToCurrentUser();
                  AccountManagerGUI.this.statusMessage = "§2Logged in! Enjoy playing!";
                  AccountManagerGUI.this.lastStatusMessageChanged = 
                    System.currentTimeMillis();
                  
                  System.out
                    .println("[AccountManager] Logged in (" + account
                    .getUserName() + ")");
                }
                else
                {
                  AccountManagerGUI.this.statusMessage = "§4Failed to login! Invalid accessToken!";
                  AccountManagerGUI.this.lastStatusMessageChanged = 
                    System.currentTimeMillis();
                  
                  AccountManagerGUI.this.logOut(account.getUuid().toString());
                }
              }
              catch (Exception e)
              {
                e.printStackTrace();
                AccountManagerGUI.this.statusMessage = ("§4Failed login! " + e.getMessage());
                AccountManagerGUI.this.lastStatusMessageChanged = 
                  System.currentTimeMillis();
              }
            }
          })
          
            .start();
        }
      }
    }
    if (button.k == 4) {
      for (Account account : AccountManager.accounts) {
        if (account.getUserName().equals(this.list
          .getAccountEntry().getName())) {
          logOut(account.getUuid().toString());
        }
      }
    }
    if (button.k == 5) {
      this.j.a(new LoginGui());
    }
    if (button.k == 6) {
      this.j.a(ModAPI.getLastScreen());
    }
    if (this.list != null) {
      this.list.actionPerformed(button);
    }
  }
  
  private void logOut(String uuid)
  {
    for (Iterator<Account> accountIter = AccountManager.accounts.iterator(); accountIter.hasNext();)
    {
      account = (Account)accountIter.next();
      if (account.getUuid().toString().equals(uuid)) {
        accountIter.remove();
      }
    }
    Account account;
    List<String> accounts = new ArrayList();
    for (Account acc : AccountManager.accounts) {
      accounts.add(acc.getUserName());
    }
    this.list.setAccounts(this, accounts);
    
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
      authenticationDatabase.remove(uuid.replace("-", ""));
      try
      {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        
        FileWriter file = new FileWriter("launcher_profiles.json");
        file.write(gson.toJson(object));
        file.flush();
        file.close();
        System.out.println("Logged out from account " + uuid);
      }
      catch (Exception ex)
      {
        ex.printStackTrace();
        System.out.println("[AccountManager] Failed logging out from " + uuid + "!");
      }
    }
  }
  
  private String performPostRequest(URL url, String post)
    throws Exception
  {
    HttpURLConnection connection = (HttpURLConnection)url.openConnection();
    connection.setConnectTimeout(15000);
    connection.setReadTimeout(15000);
    connection.setUseCaches(false);
    byte[] postAsBytes = post.getBytes(Charsets.UTF_8);
    
    connection.setRequestProperty("Content-Type", "application/json; charset=utf-8");
    
    connection
      .setRequestProperty("Content-Length", "" + postAsBytes.length);
    connection.setDoOutput(true);
    
    OutputStream outputStream = null;
    try
    {
      outputStream = connection.getOutputStream();
      IOUtils.write(postAsBytes, outputStream);
    }
    finally
    {
      IOUtils.closeQuietly(outputStream);
    }
    InputStream inputStream = null;
    try
    {
      inputStream = connection.getInputStream();
      String result = IOUtils.toString(inputStream, Charsets.UTF_8);
      return result;
    }
    catch (IOException e)
    {
      IOUtils.closeQuietly(inputStream);
      inputStream = connection.getErrorStream();
      if (inputStream != null)
      {
        String result = IOUtils.toString(inputStream, Charsets.UTF_8);
        return result;
      }
      throw e;
    }
    finally
    {
      IOUtils.closeQuietly(inputStream);
    }
  }
  
  public void k()
    throws IOException
  {
    super.k();
    if (this.list != null) {
      this.list.handleMouseInput();
    }
  }
  
  protected void a(int mouseX, int mouseY, int mouseButton)
    throws IOException
  {
    super.a(mouseX, mouseY, mouseButton);
    if (this.list != null) {
      this.list.mouseClicked(mouseX, mouseY, mouseButton);
    }
  }
  
  public List<avs> getButtonList()
  {
    return this.n;
  }
}
