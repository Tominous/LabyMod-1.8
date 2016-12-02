package mods.accountmanager;

import ave;
import bfd;
import bfs;
import bfx;
import bma;
import bmj;
import bms;
import bmz;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.modapi.EventHandler;
import de.labystudio.modapi.Listener;
import de.labystudio.modapi.ModAPI;
import de.labystudio.modapi.Module;
import de.labystudio.modapi.events.GameTickEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.UUID;
import jy;
import mods.accountmanager.gui.AccountManagerGUI;
import mods.accountmanager.gui.LoginGui;
import nx;
import org.apache.commons.io.Charsets;
import org.apache.commons.io.IOUtils;

public class AccountManager
  extends Module
  implements Listener
{
  public static List<Account> accounts = new ArrayList();
  public static final String VERSION = "1.0";
  
  @EventHandler
  public void onTick(GameTickEvent e)
  {
    if (LoginGui.openNewAccountManagerGui == null) {
      return;
    }
    ave.A().a(new AccountManagerGUI(LoginGui.openNewAccountManagerGui));
    LoginGui.openNewAccountManagerGui = null;
  }
  
  public void onEnable()
  {
    ModAPI.registerListener(this);
    ModAPI.addSettingsButton("AccountManager", new AccountManagerGUI());
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
      for (Map.Entry<String, JsonElement> accountList : authenticationDatabase
        .entrySet())
      {
        JsonObject currentAccount = ((JsonElement)accountList.getValue()).getAsJsonObject();
        accounts.add(new Account(currentAccount.get("displayName")
          .getAsString(), currentAccount.get("accessToken")
          .getAsString(), UUID.fromString(currentAccount.get("uuid")
          .getAsString())));
        
        String playerName = currentAccount.get("displayName").getAsString();
        loadPlayerHead(playerName);
        
        System.out.println("[AccountManager] Account " + currentAccount
          .get("displayName").getAsString() + " has been load!");
      }
    }
  }
  
  public static void loadPlayerHead(String playerName)
  {
    jy rl = new jy("images/" + playerName);
    
    bma var3 = new bma((File)null, String.format("https://minotar.net/skin/%s.png", new Object[] {nx.a(playerName) }), bmz.a(
      UUID.nameUUIDFromBytes(("OfflinePlayer:" + playerName)
      .getBytes(Charsets.UTF_8))), new bfs());
    
    ave.A().P()
      .a(rl, var3);
    
    playerHeads.put(playerName, rl);
  }
  
  public static boolean containsAccount(String name)
  {
    for (Account acc : accounts) {
      if (name.equals(acc.getUserName())) {
        return true;
      }
    }
    return false;
  }
  
  public static final Map<String, jy> playerHeads = new HashMap();
  
  public static void drawTexturedModalRect(double xCoord, double yCoord, double minU, double minV, double maxU, double maxV)
  {
    float f = 0.00390625F;
    float f1 = 0.00390625F;
    bfx tessellator = bfx.a();
    bfd worldrenderer = tessellator.c();
    worldrenderer.a(7, bms.g);
    worldrenderer
      .b(xCoord + 0.0D, yCoord + (float)maxV, 0.0D)
      
      .a((float)(minU + 0.0D) * f, (float)(minV + maxV) * f1)
      .d();
    worldrenderer
      .b(xCoord + (float)maxU, yCoord + (float)maxV, 0.0D)
      
      .a((float)(minU + maxU) * f, (float)(minV + maxV) * f1)
      .d();
    worldrenderer
      .b(xCoord + (float)maxU, yCoord + 0.0D, 0.0D)
      
      .a((float)(minU + maxU) * f, (float)(minV + 0.0D) * f1)
      .d();
    worldrenderer
      .b(xCoord + 0.0D, yCoord + 0.0D, 0.0D)
      
      .a((float)(minU + 0.0D) * f, (float)(minV + 0.0D) * f1)
      .d();
    tessellator.b();
  }
}
