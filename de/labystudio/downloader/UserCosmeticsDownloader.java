package de.labystudio.downloader;

import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.cosmetic.Cosmetic;
import de.labystudio.cosmetic.CosmeticManager;
import de.labystudio.cosmetic.CosmeticUser;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Debug;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;

public class UserCosmeticsDownloader
{
  public UserCosmeticsDownloader()
  {
    Thread checkThread = new Thread()
    {
      public void run()
      {
        if (!UserCosmeticsDownloader.this.downloadCosmetics("http://info.labymod.net/php/userCosmetics.json")) {
          System.out.println("Can't download cosmetics.");
        }
      }
    };
    checkThread.setPriority(1);
    checkThread.start();
  }
  
  private boolean downloadCosmetics(String page)
  {
    try
    {
      System.out.println("[ModInfo] Downloading Cosmetics..");
      HttpURLConnection connection = (HttpURLConnection)new URL(page).openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      connection.connect();
      Debug.debug("[Cosmetics] Response: " + connection.getResponseCode());
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      
      String json = "";
      String line;
      while ((line = r.readLine()) != null) {
        json = json + line;
      }
      Debug.debug("[Cosmetics] Response: " + connection.getResponseCode());
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(json);
      try
      {
        HashMap<String, CosmeticUser> onlineList = LabyMod.getInstance().getCosmeticManager().getOnlineCosmetics();
        HashMap<String, CosmeticUser> offlineList = LabyMod.getInstance().getCosmeticManager().getOfflineCosmetics();
        onlineList.clear();
        for (JsonElement a : element.getAsJsonArray()) {
          try
          {
            String uuid = a.getAsJsonObject().get("user_id").getAsString();
            if (a.getAsJsonObject().get("enabled").getAsInt() == 1)
            {
              int type = a.getAsJsonObject().get("cosmetic_id").getAsInt();
              JsonElement dataElement = a.getAsJsonObject().get("data");
              CosmeticUser userInList = (CosmeticUser)onlineList.get(uuid);
              CosmeticUser user = userInList == null ? new CosmeticUser() : userInList;
              if ((dataElement instanceof JsonNull))
              {
                user.addToCosmeticList(new Cosmetic(type));
              }
              else
              {
                String data = dataElement.getAsString();
                user.addToCosmeticList(new Cosmetic(type, data));
              }
              user.updateData();
              if (userInList == null) {
                onlineList.put(uuid, user);
              }
            }
          }
          catch (Exception error)
          {
            Debug.debug("[Cosmetics] Failed to parse: " + error.getMessage());
            error.printStackTrace();
          }
        }
        for (String hash : onlineList.keySet()) {
          offlineList.put(hash, new CosmeticUser(new ArrayList(((CosmeticUser)onlineList.get(hash)).getCosmeticsData())));
        }
        Debug.debug("[Cosmetics] Loaded " + onlineList.size() + " cosmetics");
        LabyMod.getInstance().getCosmeticManager().load();
        return true;
      }
      catch (Exception error)
      {
        error.printStackTrace();
        Debug.debug("[Cosmetics] Failed to load cosmetics: " + error.getMessage());
      }
      LabyMod.getInstance().getCosmeticManager().load();
    }
    catch (Exception error)
    {
      Debug.debug("[Cosmetics] Failed to load cosmetics: " + error.getMessage());
      error.printStackTrace();
    }
    return false;
  }
}
