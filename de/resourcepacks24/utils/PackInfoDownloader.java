package de.resourcepacks24.utils;

import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonNull;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import de.resourcepacks24.main.Pack;
import de.resourcepacks24.main.ResourcePacks24;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class PackInfoDownloader
  extends Thread
{
  PackInfoCallback callBack;
  ArrayList<Pack> out;
  
  public PackInfoDownloader(PackInfoCallback callBack)
  {
    this.callBack = callBack;
    start();
  }
  
  public void run()
  {
    out = downloadInfo();
    if (out == null) {
      out = new ArrayList();
    } else {
      addDesc();
    }
    callBack.progress(100);
    callBack.result(out);
  }
  
  public ArrayList<Pack> downloadInfo()
  {
    try
    {
      callBack.progress(0);
      HttpURLConnection connection = (HttpURLConnection)new URL(ResourcePacks24.api_packs + "&v=2").openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      callBack.progress(10);
      connection.connect();
      callBack.progress(20);
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      callBack.progress(30);
      
      String json = "";
      String line;
      while ((line = r.readLine()) != null) {
        json = json + line;
      }
      callBack.progress(40);
      
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(json);
      JsonArray packs = element.getAsJsonObject().get("rplist").getAsJsonArray();
      
      ArrayList<Pack> out = new ArrayList();
      for (JsonElement pack : packs)
      {
        String name = "?";
        try
        {
          int id = pack.getAsJsonObject().get("rp_id").getAsInt();
          name = pack.getAsJsonObject().get("rp_name").getAsString();
          try
          {
            String ingameName = null;
            JsonObject obj = pack.getAsJsonObject();
            JsonElement ingameNameJson = obj.get("rp_name_ingame");
            if (!(ingameNameJson instanceof JsonNull)) {
              ingameName = ingameNameJson.getAsString();
            }
            String newName = null;
            JsonElement newNameJson = pack.getAsJsonObject().get("rp_new_name");
            if (!(newNameJson instanceof JsonNull)) {
              newName = newNameJson.getAsString();
            }
            long upTime = pack.getAsJsonObject().get("rp_up_time").getAsLong();
            String creator = pack.getAsJsonObject().get("uploaded_by").getAsString();
            String size = pack.getAsJsonObject().get("rp_mb").getAsString();
            int status = pack.getAsJsonObject().get("rp_status").getAsInt();
            int downloads = pack.getAsJsonObject().get("rp_downloads").getAsInt();
            String hashName = pack.getAsJsonObject().get("hashname").getAsString();
            
            int premiumId = pack.getAsJsonObject().get("premium_id").getAsInt();
            int votes = pack.getAsJsonObject().get("rp_vote").getAsInt();
            int tag_hg = pack.getAsJsonObject().get("rp_tag_hg").getAsInt();
            int tag_sg = pack.getAsJsonObject().get("rp_tag_sg").getAsInt();
            int tag_uhc = pack.getAsJsonObject().get("rp_tag_uhc").getAsInt();
            int tag_pot = pack.getAsJsonObject().get("rp_tag_pot").getAsInt();
            int tag_pvp = pack.getAsJsonObject().get("rp_tag_pvp").getAsInt();
            int tag_bedwars = pack.getAsJsonObject().get("rp_tag_bedwars").getAsInt();
            int tag_skywars = pack.getAsJsonObject().get("rp_tag_skywars").getAsInt();
            int tag_smyp = pack.getAsJsonObject().get("rp_tag_smyp").getAsInt();
            int tag_yt = pack.getAsJsonObject().get("rp_tag_yt").getAsInt();
            if (!size.contains(" ")) {
              size = size + " MB";
            }
            out.add(new Pack(id, name, ingameName, newName, upTime, creator, size, status, downloads, hashName, premiumId, votes, tag_hg, tag_sg, tag_uhc, tag_pot, tag_pvp, tag_bedwars, tag_skywars, tag_smyp, tag_yt));
          }
          catch (Exception error)
          {
            error.printStackTrace();
          }
        }
        catch (Exception error)
        {
          error.printStackTrace();
          System.out.println("Failed to load " + name);
        }
      }
      return out;
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
    return null;
  }
  
  public void addDesc()
  {
    try
    {
      callBack.progress(50);
      HttpURLConnection connection = (HttpURLConnection)new URL(ResourcePacks24.api_packs + "&v=3").openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      callBack.progress(60);
      connection.connect();
      callBack.progress(70);
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      callBack.progress(80);
      
      String json = "";
      String line;
      while ((line = r.readLine()) != null) {
        json = json + line;
      }
      callBack.progress(90);
      
      JsonParser parser = new JsonParser();
      JsonElement element = parser.parse(json);
      JsonArray packs = element.getAsJsonObject().get("rplist").getAsJsonArray();
      for (JsonElement pack : packs) {
        try
        {
          id = pack.getAsJsonObject().get("rp_id").getAsInt();
          desc = pack.getAsJsonObject().get("rp_desc").getAsString();
          for (Pack all : out) {
            if (all.getId() == id) {
              all.setDesc(desc);
            }
          }
        }
        catch (Exception error)
        {
          int id;
          String desc;
          error.printStackTrace();
        }
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
  }
}
