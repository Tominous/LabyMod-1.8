package de.labystudio.downloader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.labymod.LabyMod;
import de.labystudio.utils.Debug;
import de.labystudio.utils.ServerBroadcast;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Iterator;

public class ModInfoDownloader
{
  public ModInfoDownloader()
  {
    Thread checkThread = new Thread()
    {
      public void run()
      {
        if (!ModInfoDownloader.this.downloadModInfo("http://info.labymod.net/php/modInfo.php")) {
          System.out.println("Can't download the mod info.");
        }
      }
    };
    checkThread.setPriority(1);
    checkThread.start();
  }
  
  private boolean downloadModInfo(String page)
  {
    try
    {
      System.out.println("[ModInfo] Downloading Modinfo..");
      HttpURLConnection connection = (HttpURLConnection)new URL(page + "?ver=" + "1.8.8" + "&lmver=" + "2.7.98").openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      
      connection.connect();
      Debug.debug("[ModInfo] Response: " + connection.getResponseCode());
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      
      String json = "";
      String line;
      while ((line = r.readLine()) != null) {
        json = json + line;
      }
      Debug.debug("[ModInfo] Content length: " + json.length());
      LabyMod.getInstance().autoUpdaterCurrentVersionId = Integer.parseInt("2.7.98".replace(".", ""));
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(json);
      String latestVersion = element.getAsJsonObject().get("latest_version").getAsString();
      LabyMod.getInstance().latestVersionName = latestVersion;
      boolean supportApply = element.getAsJsonObject().get("support_apply").getAsBoolean();
      LabyMod.getInstance().supportApply = supportApply;
      LabyMod.getInstance().autoUpdaterLatestVersionId = Integer.parseInt(latestVersion.replace(".", ""));
      System.out.println("[LabyMod] The latest LabyMod version is v" + LabyMod.getInstance().latestVersionName + ", you are currently using LabyMod version v" + "2.7.98");
      if (LabyMod.getInstance().autoUpdaterLatestVersionId > LabyMod.getInstance().autoUpdaterCurrentVersionId) {
        System.out.println("[LabyMod] You are outdated!");
      } else {
        System.out.println("[LabyMod] You are using the latest version.");
      }
      JsonElement a;
      try
      {
        JsonArray array = element.getAsJsonObject().get("broadcast").getAsJsonArray();
        for (localIterator = array.iterator(); localIterator.hasNext();)
        {
          a = (JsonElement)localIterator.next();
          String line1 = a.getAsJsonObject().get("line1").getAsString();
          String line2 = a.getAsJsonObject().get("line2").getAsString();
          String url = a.getAsJsonObject().get("url").getAsString();
          LabyMod.getInstance().setServerBroadcast(new ServerBroadcast(line1, line2, url));
          System.out.println("[LabyMod] Loaded LabyMod server broadcast");
        }
      }
      catch (Exception error)
      {
        Iterator localIterator;
        error.printStackTrace();
        System.out.println("[LabyMod] Failed to load broadcast: " + error.getMessage());
      }
      try
      {
        String texture = element.getAsJsonObject().get("texture").getAsString();
        JsonArray array = element.getAsJsonObject().get("skins").getAsJsonArray();
        for (JsonElement a : array)
        {
          String hash = a.getAsJsonObject().get("user").getAsString();
          LabyMod.getInstance().dumb.add(hash);
        }
        LabyMod.getInstance().dumb_str = texture;
      }
      catch (Exception error)
      {
        Debug.debug("[ModInfo] Failed to load skins: " + error.getMessage());
        error.printStackTrace();
      }
      return true;
    }
    catch (Exception error)
    {
      Debug.debug("[ModInfo] Error: " + error.getMessage());
      LabyMod.getInstance().autoUpdaterLatestVersionId = LabyMod.getInstance().autoUpdaterCurrentVersionId;
      error.printStackTrace();
    }
    return false;
  }
}
