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
import de.labystudio.labymod.Source;
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
    if (this.images.containsKey(file.getName()))
    {
      if (this.images.get(file.getName()) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        LabyMod.getInstance().mc.P().a((jy)this.images.get(file.getName()));
        LabyMod.getInstance().draw.drawTexturedModalRect(x / size, y / size, x + width, y + height);
        GL11.glPopMatrix();
      }
    }
    else {
      loadImage(file);
    }
  }
  
  public void drawFileImage(File file, double left, double top, double right, double bottom)
  {
    if (this.images.containsKey(file.getName()))
    {
      if (this.images.get(file.getName()) != null)
      {
        LabyMod.getInstance().mc.P().a((jy)this.images.get(file.getName()));
        LabyMod.getInstance().draw.drawTexturedModalRect(left, top, right, bottom);
      }
    }
    else {
      loadImage(file);
    }
  }
  
  public void drawUrlImage(String location, String url, double x, double y, double width, double height, double size)
  {
    if (this.images.containsKey(url))
    {
      this.loading.remove(url);
      if (this.images.get(url) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        LabyMod.getInstance().mc.P().a((jy)this.images.get(url));
        LabyMod.getInstance().draw.drawTexturedModalRect(x / size, y / size, x + width, y + height);
        GL11.glPopMatrix();
      }
    }
    else if (!this.loading.contains(url))
    {
      this.loading.add(url);
      downloadImageFromUrl(location, url);
    }
  }
  
  public void drawUrlImage(String location, String url, double left, double top, double right, double bottom)
  {
    if (this.images.containsKey(url))
    {
      this.loading.remove(url);
      if (this.images.get(url) != null)
      {
        LabyMod.getInstance().mc.P().a((jy)this.images.get(url));
        LabyMod.getInstance().draw.drawTexturedModalRect(left, top, right, bottom);
      }
    }
    else if (!this.loading.contains(url))
    {
      this.loading.add(url);
      downloadImageFromUrl(location, url);
    }
  }
  
  public void drawServerIcon(String ip, double x, double y, double size)
  {
    String url = Source.url_favicon + ip;
    if (this.images.containsKey(url))
    {
      this.loading.remove(ip);
      if (this.images.get(url) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        LabyMod.getInstance().mc.P().a((jy)this.images.get(url));
        double height = 31.0D;
        double width = 31.0D;
        LabyMod.getInstance().draw.drawTexturedModalRect(x / size, y / size, (x + width) / size, (y + height) / size);
        GL11.glPopMatrix();
      }
    }
    else if (!this.loading.contains(ip))
    {
      this.loading.add(ip);
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
    if (this.images.containsKey(playerName))
    {
      this.loading.remove(playerName);
      if (this.images.get(playerName) != null)
      {
        GL11.glPushMatrix();
        GL11.glScaled(size, size, size);
        LabyMod.getInstance().mc.P().a((jy)this.images.get(playerName));
        LabyMod.getInstance().draw.drawTexturedModalRect(x / size, (y - 3.0D) / size, 32.0D, 32.0D, 32.0D, 32.0D);
        LabyMod.getInstance().draw.drawTexturedModalRect(x / size, (y - 3.0D) / size, 160.0D, 32.0D, 32.0D, 32.0D);
        GL11.glPopMatrix();
      }
    }
    else if (!this.loading.contains(playerName))
    {
      this.loading.add(playerName);
      jy rl = new jy("images/" + playerName);
      bma var3 = new bma((File)null, String.format(Source.url_minotar + "/%s.png", new Object[] { nx.a(playerName) }), bmz.a(func_175147_b(playerName)), new bfs());
      ave.A().P().a(rl, var3);
      this.images.put(playerName, rl);
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
    this.images.put(file.getName(), rl);
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
        this.images.put(url, rl);
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
        LabyMod.getInstance().mc.P().a(rl);
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
