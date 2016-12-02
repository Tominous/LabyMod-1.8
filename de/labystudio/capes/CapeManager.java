package de.labystudio.capes;

import ave;
import bdb;
import bet;
import bfm;
import bfs;
import bmj;
import bmk;
import de.labystudio.capes.downloader.ThreadDownloadCapeData;
import de.labystudio.labymod.ConfigManager;
import de.labystudio.labymod.LabyMod;
import de.labystudio.labymod.ModSettings;
import de.labystudio.utils.Debug;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.UUID;
import jy;
import org.apache.commons.io.FilenameUtils;
import wn;

public class CapeManager
{
  private ArrayList<String> userCapes = new ArrayList();
  
  public int countUserCapes()
  {
    return this.userCapes.size();
  }
  
  public void downloadCape(final bet player, boolean refresh, final boolean optifine)
  {
    if ((player == null) || (!ConfigManager.settings.capes)) {
      return;
    }
    String username = player.getNameClear();
    if ((username != null) && (!username.isEmpty()) && (player.aK() != null))
    {
      String url = null;
      if (optifine)
      {
        url = "http://s.optifine.net/capes/" + username + ".png";
      }
      else if (isWhitelisted(player.aK()))
      {
        url = "http://capes.labymod.net/capes/" + player.aK();
      }
      else
      {
        downloadCape(player, false, true);
        return;
      }
      String mptHash = FilenameUtils.getBaseName(url);
      final jy rl = new jy("capes/" + mptHash);
      bmj textureManager = ave.A().P();
      
      bmk tex = textureManager.b(rl);
      if ((tex != null) && (!refresh) && 
        ((tex instanceof ThreadDownloadCapeData)))
      {
        ThreadDownloadCapeData tdid = (ThreadDownloadCapeData)tex;
        if (tdid.imageFound != null)
        {
          if (tdid.imageFound.booleanValue()) {
            player.setLocationOfCape(rl, optifine);
          }
          return;
        }
      }
      final bet thePlayer = player;
      bfm iib = new bfm()
      {
        bfs ibd = new bfs();
        
        public BufferedImage a(BufferedImage var1)
        {
          return CapeManager.parseCape(var1);
        }
        
        public void a()
        {
          thePlayer.setLocationOfCape(rl, optifine);
        }
      };
      CapeCallback callBack = new CapeCallback()
      {
        public void failed(String error)
        {
          if (!optifine) {
            CapeManager.this.downloadCape(player, false, true);
          }
        }
        
        public void done() {}
      };
      ThreadDownloadCapeData textureCape = new ThreadDownloadCapeData(null, url, rl, iib, callBack);
      textureManager.a(rl, textureCape);
    }
  }
  
  public static BufferedImage parseCape(BufferedImage img)
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
  
  public void setUserCapes(ArrayList<String> userCapes)
  {
    this.userCapes = userCapes;
  }
  
  public boolean isWhitelisted(UUID uuid)
  {
    boolean whitelisted = this.userCapes.contains(uuid.toString().split("-")[0]);
    Debug.debug("skipping cape of " + uuid.toString());
    return whitelisted;
  }
  
  public void refresh()
  {
    if (!LabyMod.getInstance().isInGame()) {
      return;
    }
    int amount = 0;
    ArrayList<wn> list = new ArrayList();
    list.addAll(ave.A().f.j);
    for (wn player : list) {
      if ((player != null) && ((player instanceof bet)))
      {
        LabyMod.getInstance().getCapeManager().downloadCape((bet)player, true, false);
        amount++;
      }
    }
    System.out.println("[LabyMod] Refreshed " + amount + " mod capes");
  }
}
