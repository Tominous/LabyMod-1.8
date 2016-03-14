package de.labystudio.downloader;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.labystudio.capes.CapeManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.Source;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.UUID;

public class UserCapeDownloader
{
  public UserCapeDownloader()
  {
    Thread checkThread = new Thread()
    {
      public void run()
      {
        LabyMod.getInstance().getCapeManager().setDonators(UserCapeDownloader.this.downloadUserCapeInformation(Source.url_cape_donators));
        if ((LabyMod.getInstance().getCapeManager().getDonators() == null) || (LabyMod.getInstance().getCapeManager().getDonators().isEmpty()))
        {
          System.out.println("Can't download the user capes. Trying the second file..");
          LabyMod.getInstance().getCapeManager().setDonators(UserCapeDownloader.this.downloadUserCapeInformation(Source.url_cape_donators_second));
        }
      }
    };
    checkThread.setPriority(1);
    checkThread.start();
  }
  
  private HashMap<UUID, Integer> downloadUserCapeInformation(String page)
  {
    try
    {
      HashMap<UUID, Integer> list = new HashMap();
      HttpURLConnection connection = (HttpURLConnection)new URL(page).openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      connection.connect();
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      
      String json = "";
      String line;
      while ((line = r.readLine()) != null) {
        json = json + line;
      }
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(json);
      JsonArray array = element.getAsJsonArray();
      for (JsonElement a : array) {
        list.put(UUID.fromString(a.getAsJsonObject().get("user_id").getAsString()), Integer.valueOf(a.getAsJsonObject().get("cape_id").getAsInt()));
      }
      System.out.println("[LabyMod] Loaded " + list.size() + " labymod capes");
      return list;
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    return new HashMap();
  }
}
