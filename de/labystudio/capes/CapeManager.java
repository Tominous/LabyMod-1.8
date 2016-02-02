package de.labystudio.capes;

import ave;
import bdb;
import bet;
import bfm;
import bma;
import bmj;
import com.mojang.authlib.GameProfile;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.labymod.Source;
import de.labystudio.labymod.Timings;
import de.labystudio.utils.Debug;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import jy;
import wn;

public class CapeManager
{
  private static HashMap<UUID, jy> locationCape = new HashMap();
  private static HashMap<UUID, jy> customCapes = new HashMap();
  private static ArrayList<UUID> ignore = new ArrayList();
  private static HashMap<UUID, Integer> donators;
  public static boolean checking = false;
  
  public static void refresh()
  {
    customCapes.clear();
    ignore.clear();
    if ((donators == null) && (!checking))
    {
      Thread checkThread = new Thread()
      {
        public void run()
        {
          CapeManager.checking = true;
          CapeManager.access$002(CapeManager.downloadUserCapeInformation(Source.url_cape_donators));
          if ((CapeManager.donators == null) || (CapeManager.donators.isEmpty()))
          {
            System.out.println("Can't download the requirements file. Trying the second file..");
            CapeManager.access$002(CapeManager.downloadUserCapeInformation(Source.url_cape_donators_second));
          }
          CapeManager.checking = false;
        }
      };
      checkThread.setPriority(1);
      checkThread.start();
    }
    clearTextures();
  }
  
  public static HashMap<UUID, jy> getLocationCape()
  {
    return locationCape;
  }
  
  public static HashMap<UUID, Integer> downloadUserCapeInformation(String page)
  {
    try
    {
      HashMap<UUID, Integer> list = new HashMap();
      HttpURLConnection connection = (HttpURLConnection)new URL(page).openConnection();
      connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
      connection.setRequestProperty("Cookie", "foo=bar");
      connection.connect();
      BufferedReader r = new BufferedReader(new InputStreamReader(connection.getInputStream(), Charset.forName("UTF-8")));
      
      String s = "";
      String line;
      while ((line = r.readLine()) != null) {
        s = s + line;
      }
      if (s.contains("#"))
      {
        String[] split = s.split("#");
        LabyMod.getInstance().autoUpdaterCurrentVersionId = Integer.parseInt(Source.mod_VersionName.replace(".", ""));
        try
        {
          LabyMod.getInstance().autoUpdaterLatestVersionId = Integer.parseInt(split[0].replace(".", ""));
          LabyMod.getInstance().latestVersionName = split[0];
          System.out.println("[LabyMod] The latest LabyMod version is v" + LabyMod.getInstance().latestVersionName + ", you are currently using LabyMod version v" + Source.mod_VersionName);
        }
        catch (Exception error)
        {
          LabyMod.getInstance().autoUpdaterLatestVersionId = LabyMod.getInstance().autoUpdaterCurrentVersionId;
        }
        s = split[1];
      }
      String[] split = s.split(", ");
      for (String user : split) {
        try
        {
          if (user.contains("@"))
          {
            String[] split2 = user.split("@");
            String uuid = split2[0];
            String capeType = split2[1];
            try
            {
              list.put(UUID.fromString(uuid), Integer.valueOf(Integer.parseInt(capeType)));
            }
            catch (Exception error)
            {
              System.out.println("[LabyMod] Failed to save cape of " + uuid + " (" + capeType + ")");
            }
          }
        }
        catch (Exception error)
        {
          System.out.println("[LabyMod] Failed to read cape of " + user);
        }
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
  
  private static void clearTextures()
  {
    locationCape.clear();
  }
  
  public static ArrayList<UUID> getIgnore()
  {
    return ignore;
  }
  
  public static void onTickInGame()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    if (ave.A().f == null) {
      return;
    }
    Timings.start();
    if (checking) {
      return;
    }
    if (!ConfigManager.settings.capes.booleanValue())
    {
      customCapes.clear();
      ignore.clear();
      return;
    }
    if (donators == null) {
      refresh();
    }
    checking = true;
    ArrayList<wn> entitys = new ArrayList();
    ArrayList<GameProfile> profile = new ArrayList();
    entitys.addAll(ave.A().f.j);
    for (wn player : entitys)
    {
      profile.add(player.cd());
      if ((!ignore.contains(player.aK())) && 
      
        (customCapes.containsKey(player.aK()))) {
        setCape(player, (jy)customCapes.get(player.aK()));
      }
    }
    Thread checkThread = new Thread()
    {
      public void run()
      {
        CapeManager.checkCapeURLs(this.val$profile);
        CapeManager.checking = false;
      }
    };
    checkThread.setPriority(1);
    checkThread.start();
    Timings.stop();
  }
  
  public static boolean setCape(wn player, jy capeLocation)
  {
    if (capeLocation == null) {
      return false;
    }
    if ((locationCape != null) && (((locationCape.containsKey(player.aK())) && (locationCape.get(player.aK()) != capeLocation)) || (!locationCape.containsKey(player.aK())))) {
      System.out.println("[LabyMod] Applying cape for: " + player.e_() + " (" + capeLocation.a() + ")");
    }
    locationCape.put(player.aK(), capeLocation);
    return true;
  }
  
  private static void checkCapeURLs(ArrayList<GameProfile> playerProfile)
  {
    for (GameProfile player : playerProfile) {
      if ((!customCapes.containsKey(player.getId())) && 
      
        (!ignore.contains(player.getId())))
      {
        String found = null;
        boolean stop = false;
        boolean set = false;
        for (String url : getUrlList(player.getId()))
        {
          String urlPlayerPart = player.getId().toString();
          if (url.contains("optifine.net")) {
            urlPlayerPart = player.getName();
          }
          String capeUrl = url + urlPlayerPart + ".png";
          if ((url.contains("labystudio.de")) && 
            (hasLabyModCape(player.getId())))
          {
            int type = getLabyModCape(player.getId()).intValue();
            debug(player.getName() + " has a labymod cape with id " + type);
            if (type == 1)
            {
              found = capeUrl.replace(".png", "");
              debug(player.getName() + " download link cape set to " + found);
              set = true;
            }
            else
            {
              jy capeLocation = null;
              if (type == 2) {
                capeLocation = LabyMod.getInstance().texture_minecon2011;
              }
              if (type == 3) {
                capeLocation = LabyMod.getInstance().texture_minecon2012;
              }
              if (type == 4) {
                capeLocation = LabyMod.getInstance().texture_minecon2013;
              }
              if (type == 5) {
                capeLocation = LabyMod.getInstance().texture_minecon2015;
              }
              if (type == 6) {
                capeLocation = LabyMod.getInstance().texture_labycape1;
              }
              if (type == 7) {
                capeLocation = LabyMod.getInstance().texture_labycape2;
              }
              if (type == 8) {
                capeLocation = LabyMod.getInstance().texture_labycape3;
              }
              debug(player.getName() + " texture set to " + capeLocation);
              customCapes.put(player.getId(), capeLocation);
              debug("SAVE CAPE " + type + " OF " + player.getName());
              stop = true;
              continue;
            }
          }
          if ((!stop) && (!set))
          {
            try
            {
              HttpURLConnection con = (HttpURLConnection)new URL(capeUrl).openConnection();
              con.setRequestMethod("HEAD");
              con.setRequestProperty("User-agent", "LabyMod");
              con.setRequestProperty("Java-Version", System.getProperty("java.version"));
              con.setConnectTimeout(100000);
              con.setUseCaches(false);
              HttpURLConnection.setFollowRedirects(true);
              HttpURLConnection.setFollowRedirects(true);
              con.setInstanceFollowRedirects(true);
              if (con.getResponseCode() == 200) {
                found = capeUrl;
              }
              debug(player.getName() + " downloader responsecode: + " + con.getResponseCode());
              con.disconnect();
            }
            catch (Exception e)
            {
              e.printStackTrace();
            }
            if (found != null) {
              break;
            }
          }
        }
        if (!stop) {
          if (found == null)
          {
            ignore.add(player.getId());
            debug(player.getName() + " ignored.");
          }
          else
          {
            debug("start download cape of " + player.getName());
            jy capeLocation = bet.c(player.getName());
            bmj texturemanager = ave.A().P();
            bfm iib = new bfm()
            {
              public BufferedImage a(BufferedImage var1)
              {
                return CapeManager.parseCape(var1);
              }
              
              public void a() {}
            };
            bma object = new CapeDownloader(null, found, null, iib);
            debug("loading texture of " + player.getName());
            texturemanager.a(capeLocation, object);
            customCapes.put(player.getId(), capeLocation);
            debug("SAVE CAPE CUSTOM OF " + player.getName());
          }
        }
      }
    }
  }
  
  private static void debug(String msg)
  {
    if (Debug.capes()) {
      System.out.println("[DEBUG] " + msg);
    }
  }
  
  private static BufferedImage parseCape(BufferedImage img)
  {
    int imageWidth = 64;
    int imageHeight = 32;
    
    BufferedImage srcImg = img;
    int srcWidth = srcImg.getWidth();
    int srcHeight = srcImg.getHeight();
    while ((imageWidth < srcWidth) || (imageHeight < srcHeight))
    {
      imageWidth *= 2;
      imageHeight *= 2;
    }
    BufferedImage imgNew = new BufferedImage(imageWidth, imageHeight, 2);
    Graphics g = imgNew.getGraphics();
    g.drawImage(img, 0, 0, (ImageObserver)null);
    g.dispose();
    return imgNew;
  }
  
  private static ArrayList<String> getUrlList(UUID uuid)
  {
    ArrayList<String> list = new ArrayList();
    if (getCapePriority() == EnumCapePriority.OPTIFINE)
    {
      list.add(Source.url_cape_optifine);
      if (hasLabyModCape(uuid)) {
        list.add(Source.url_cape_labymod);
      }
    }
    else
    {
      if (hasLabyModCape(uuid)) {
        list.add(Source.url_cape_labymod);
      }
      list.add(Source.url_cape_optifine);
    }
    return list;
  }
  
  public static boolean hasLabyModCape(UUID uuid)
  {
    if ((donators != null) && (donators.containsKey(uuid))) {
      return true;
    }
    return false;
  }
  
  public static Integer getLabyModCape(UUID uuid)
  {
    if (hasLabyModCape(uuid)) {
      return (Integer)donators.get(uuid);
    }
    return Integer.valueOf(0);
  }
  
  private static EnumCapePriority getCapePriority()
  {
    if (ConfigManager.settings.capePriority.equals("of")) {
      return EnumCapePriority.OPTIFINE;
    }
    return EnumCapePriority.LABYMOD;
  }
  
  public static enum EnumCapePriority
  {
    LABYMOD,  OPTIFINE;
    
    private EnumCapePriority() {}
  }
}
