package de.labystudio.capes;

import ave;
import bdb;
import bdc;
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
import java.io.PrintStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import jy;
import wn;

public class CapeManager
{
  private HashMap<UUID, jy> locationCape = new HashMap();
  private HashMap<UUID, Cape> customCapes = new HashMap();
  private ArrayList<UUID> ignore = new ArrayList();
  private ArrayList<jy> delete = new ArrayList();
  private HashMap<UUID, Integer> donators;
  private boolean checking = false;
  
  public void setDonators(HashMap<UUID, Integer> donators)
  {
    this.donators = donators;
  }
  
  public HashMap<UUID, Integer> getDonators()
  {
    return this.donators;
  }
  
  public void refresh()
  {
    this.customCapes.clear();
    this.ignore.clear();
    clearTextures();
  }
  
  public HashMap<UUID, jy> getLocationCape()
  {
    return this.locationCape;
  }
  
  private void clearTextures()
  {
    this.locationCape.clear();
  }
  
  public ArrayList<UUID> getIgnore()
  {
    return this.ignore;
  }
  
  public ArrayList<jy> getDelete()
  {
    return this.delete;
  }
  
  public void onTickInGame()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    if (ave.A().f == null) {
      return;
    }
    Timings.start("CapeManager GameTick");
    if (this.checking) {
      return;
    }
    if (!ConfigManager.settings.capes.booleanValue())
    {
      this.customCapes.clear();
      this.ignore.clear();
      return;
    }
    if (this.donators == null) {
      refresh();
    }
    this.checking = true;
    ArrayList<wn> entitys = new ArrayList();
    ArrayList<UUID> rem = new ArrayList();
    final ArrayList<GameProfile> profile = new ArrayList();
    entitys.addAll(ave.A().f.j);
    rem.addAll(this.customCapes.keySet());
    for (wn player : entitys)
    {
      rem.remove(player.aK());
      profile.add(player.cd());
      if ((!this.ignore.contains(player.aK())) && 
      
        (this.customCapes.containsKey(player.aK())))
      {
        loc = null;
        EnumCapePriority type = null;
        Cape cape = (Cape)this.customCapes.get(player.aK());
        if (getCapePriority() == EnumCapePriority.OPTIFINE)
        {
          if (cape.getOptifine() == null)
          {
            loc = cape.getLabymod();
            type = EnumCapePriority.LABYMOD;
          }
          else
          {
            loc = cape.getOptifine();
            type = EnumCapePriority.OPTIFINE;
          }
        }
        else if (cape.getLabymod() == null)
        {
          loc = cape.getOptifine();
          type = EnumCapePriority.OPTIFINE;
        }
        else
        {
          loc = cape.getLabymod();
          type = EnumCapePriority.LABYMOD;
        }
        setCape(player, loc, type);
      }
    }
    jy loc;
    Object checkThread = new Thread()
    {
      public void run()
      {
        CapeManager.this.checkCapeURLs(profile);
        CapeManager.this.checking = false;
      }
    };
    ((Thread)checkThread).setPriority(1);
    ((Thread)checkThread).start();
    
    ArrayList<bdc> list = new ArrayList();
    list.addAll(LabyMod.getInstance().onlinePlayers);
    for (bdc player : list) {
      rem.remove(player.a().getId());
    }
    if (rem.size() > 20) {
      for (UUID uuid : rem) {
        if (this.customCapes.containsKey(uuid))
        {
          Cape cape = (Cape)this.customCapes.get(uuid);
          if (!cape.isMineconCape())
          {
            if (cape.getLabymod() != null)
            {
              this.customCapes.remove(uuid);
              this.ignore.remove(uuid);
              this.locationCape.remove(uuid);
              this.delete.add(cape.getLabymod());
            }
            if (cape.getOptifine() != null)
            {
              this.customCapes.remove(uuid);
              this.delete.add(cape.getOptifine());
              this.ignore.remove(uuid);
              this.locationCape.remove(uuid);
            }
          }
        }
      }
    }
    Timings.stop("CapeManager GameTick");
  }
  
  public boolean setCape(wn player, jy capeLocation, EnumCapePriority type)
  {
    if (capeLocation == null) {
      return false;
    }
    if ((this.locationCape != null) && (((this.locationCape.containsKey(player.aK())) && (this.locationCape.get(player.aK()) != capeLocation)) || (!this.locationCape.containsKey(player.aK())))) {
      if (type == null) {
        System.out.println("[LabyMod] Applying cape for: " + player.e_() + " (" + capeLocation.a() + ")");
      } else {
        System.out.println("[LabyMod] Applying " + type.name().toLowerCase() + " cape for: " + player.e_() + " (" + capeLocation.a() + ")");
      }
    }
    this.locationCape.put(player.aK(), capeLocation);
    return true;
  }
  
  private void checkCapeURLs(ArrayList<GameProfile> playerProfile)
  {
    for (GameProfile player : playerProfile) {
      if ((!this.customCapes.containsKey(player.getId())) && 
      
        (!this.ignore.contains(player.getId())))
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
              Cape cape = new Cape();
              cape.setLabymod(capeLocation);
              cape.setMineconCape(true);
              this.customCapes.put(player.getId(), cape);
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
            this.ignore.add(player.getId());
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
                return CapeManager.this.parseCape(var1);
              }
              
              public void a() {}
            };
            bma object = new CapeDownloader(null, found, null, iib);
            debug("loading texture of " + player.getName());
            if (!texturemanager.a(capeLocation, object)) {
              System.out.println("[ERROR] Failed to load cape of " + player.getName() + " (" + capeLocation + ")");
            }
            Cape cape = null;
            if (!this.customCapes.containsKey(player.getId())) {
              cape = new Cape();
            } else {
              cape = (Cape)this.customCapes.get(player.getId());
            }
            if (found.contains(Source.url_cape_optifine)) {
              cape.setOptifine(capeLocation);
            } else {
              cape.setLabymod(capeLocation);
            }
            this.customCapes.put(player.getId(), cape);
            debug("SAVE CAPE CUSTOM OF " + player.getName());
          }
        }
      }
    }
  }
  
  private void debug(String msg)
  {
    if (Debug.capes()) {
      System.out.println("[DEBUG] " + msg);
    }
  }
  
  private BufferedImage parseCape(BufferedImage img)
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
  
  private ArrayList<String> getUrlList(UUID uuid)
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
  
  public boolean hasLabyModCape(UUID uuid)
  {
    if ((this.donators != null) && (this.donators.containsKey(uuid))) {
      return true;
    }
    return false;
  }
  
  public Integer getLabyModCape(UUID uuid)
  {
    if (hasLabyModCape(uuid)) {
      return (Integer)this.donators.get(uuid);
    }
    return Integer.valueOf(0);
  }
  
  private EnumCapePriority getCapePriority()
  {
    if (ConfigManager.settings.capePriority.equals("of")) {
      return EnumCapePriority.OPTIFINE;
    }
    return EnumCapePriority.LABYMOD;
  }
}
