package de.labystudio.utils;

import ave;
import bfm;
import bfs;
import blz;
import bma;
import bmj;
import bmz;
import com.google.common.base.Charsets;
import de.labystudio.labymod.LabyMod;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;
import javax.imageio.ImageIO;
import jy;
import nx;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.opengl.GL11;

public class TextureManager
{
  private HashMap<String, jy> images = new HashMap();
  private ArrayList<String> loading = new ArrayList();
  
  public void drawFileImage(File file, double x, double y, double width, double height, double size)
  {
    if (images.containsKey(file.getName()))
    {
      if (images.get(file.getName()) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        getInstancemc.P().a((jy)images.get(file.getName()));
        getInstancedraw.drawTexturedModalRect(x / size, y / size, x + width, y + height);
        GL11.glPopMatrix();
      }
    }
    else {
      loadImage(file);
    }
  }
  
  public void drawFileImage(File file, double left, double top, double right, double bottom)
  {
    if (images.containsKey(file.getName()))
    {
      if (images.get(file.getName()) != null)
      {
        getInstancemc.P().a((jy)images.get(file.getName()));
        getInstancedraw.drawTexturedModalRect(left, top, right, bottom);
      }
    }
    else {
      loadImage(file);
    }
  }
  
  public void drawUrlImage(String location, String url, double x, double y, double width, double height, double size)
  {
    if (images.containsKey(url))
    {
      loading.remove(url);
      if (images.get(url) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        getInstancemc.P().a((jy)images.get(url));
        getInstancedraw.drawTexturedModalRect(x / size, y / size, x + width, y + height);
        GL11.glPopMatrix();
      }
    }
    else if (!loading.contains(url))
    {
      loading.add(url);
      downloadImageFromUrl(location, url);
    }
  }
  
  public void drawUrlImage(String location, String url, double left, double top, double right, double bottom)
  {
    if (images.containsKey(url))
    {
      loading.remove(url);
      if (images.get(url) != null)
      {
        getInstancemc.P().a((jy)images.get(url));
        getInstancedraw.drawTexturedModalRect(left, top, right, bottom);
      }
    }
    else if (!loading.contains(url))
    {
      loading.add(url);
      downloadImageFromUrl(location, url);
    }
  }
  
  public void drawServerIcon(String ip, double x, double y, double size)
  {
    String url = "http://craftapi.com/api/server/favicon/" + ip;
    if (images.containsKey(url))
    {
      loading.remove(ip);
      if (images.get(url) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        getInstancemc.P().a((jy)images.get(url));
        double height = 31.0D;
        double width = 31.0D;
        getInstancedraw.drawTexturedModalRect(x / size, y / size, (x + width) / size, (y + height) / size);
        GL11.glPopMatrix();
      }
    }
    else if (!loading.contains(ip))
    {
      loading.add(ip);
      try
      {
        LogManager.getLogger().info("Loading Server Image of " + ip + " (" + url + ")");
        downloadImageFromUrl(ip, url);
      }
      catch (Exception error)
      {
        LogManager.getLogger().info("Failed to load Server Image of " + ip);
      }
    }
  }
  
  public void drawPlayerHead(String playerName, double x, double y, double size)
  {
    if (images.containsKey(playerName))
    {
      loading.remove(playerName);
      if (images.get(playerName) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        getInstancemc.P().a((jy)images.get(playerName));
        getInstancedraw.drawTexturedModalRect(x / size, (y - 3.0D) / size, 32.0D, 32.0D, 32.0D, 32.0D);
        getInstancedraw.drawTexturedModalRect(x / size, (y - 3.0D) / size, 160.0D, 32.0D, 32.0D, 32.0D);
        GL11.glPopMatrix();
      }
    }
    else if (!loading.contains(playerName))
    {
      loading.add(playerName);
      jy rl = new jy("images/" + playerName);
      bma var3 = new bma((File)null, String.format("https://minotar.net/skin/%s.png", new Object[] { nx.a(playerName) }), bmz.a(func_175147_b(playerName)), new bfs());
      ave.A().P().a(rl, var3);
      images.put(playerName, rl);
    }
  }
  
  public static UUID func_175147_b(String p_175147_0_)
  {
    return UUID.nameUUIDFromBytes(("OfflinePlayer:" + p_175147_0_).getBytes(Charsets.UTF_8));
  }
  
  private void loadImage(File file)
  {
    jy rl = new jy("images/" + file.getName());
    bma var3 = new bma(file.getAbsoluteFile(), "", null, new bfm()
    {
      public BufferedImage a(BufferedImage p_78432_1_)
      {
        BufferedImage parse = TextureManager.this.parseImage(p_78432_1_);
        if (parse == null) {
          return p_78432_1_;
        }
        return parse;
      }
      
      public void a() {}
    });
    ave.A().P().a(rl, var3);
    images.put(file.getName(), rl);
  }
  
  private void downloadImageFromUrl(String location, String url)
  {
    try
    {
      jy rl = new jy("images/" + location);
      if ((url != null) && (!url.isEmpty()))
      {
        BufferedImage read = ImageIO.read(new URL(url));
        if (read != null)
        {
          blz texture = new blz(read);
          ave.A().P().c(rl);
          ave.A().P().a(rl, texture);
        }
        images.put(url, rl);
      }
    }
    catch (IOException e)
    {
      e.printStackTrace();
    }
  }
  
  public void renderFrame(BufferedImage read)
  {
    try
    {
      if (read != null)
      {
        jy rl = new jy("images/frame");
        blz texture = new blz(read);
        ave.A().P().c(rl);
        ave.A().P().a(rl, texture);
        getInstancemc.P().a(rl);
      }
    }
    catch (Exception e)
    {
      e.printStackTrace();
    }
  }
  
  private BufferedImage parseImage(BufferedImage img)
  {
    int imageWidth = 0;
    int imageHeight = 0;
    
    BufferedImage srcImg = img;
    if (srcImg == null) {
      return null;
    }
    int srcWidth = srcImg.getWidth();
    int srcHeight = srcImg.getHeight();
    while ((imageWidth < srcWidth) || (imageHeight < srcHeight))
    {
      imageWidth++;
      imageHeight++;
    }
    BufferedImage imgNew = new BufferedImage(imageWidth, imageHeight, 2);
    Graphics g = imgNew.getGraphics();
    g.drawImage(img, 0, 0, (ImageObserver)null);
    g.dispose();
    return imgNew;
  }
}
