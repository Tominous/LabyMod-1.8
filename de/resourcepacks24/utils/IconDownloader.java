package de.resourcepacks24.utils;

import ave;
import blz;
import bmj;
import de.resourcepacks24.main.ResourcePacks24;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import javax.imageio.ImageIO;
import jy;
import org.lwjgl.opengl.GL11;

public class IconDownloader
{
  private HashMap<String, TheImage> images = new HashMap();
  private HashMap<jy, BufferedImage> loadList = new HashMap();
  private ArrayList<String> loading = new ArrayList();
  private long lastCheck = 0L;
  
  public void drawUrlImage(String location, String url, double x, double y, double width, double height, double size)
  {
    try
    {
      checkTextures();
      if (this.images.containsKey(url))
      {
        this.loading.remove(url);
        if ((this.images.get(url) != null) && (((TheImage)this.images.get(url)).getLocation() != null) && (!this.loadList.containsKey(((TheImage)this.images.get(url)).getLocation())))
        {
          GL11.glPushMatrix();
          GL11.glScaled(size, size, size);
          ave.A().P().a(((TheImage)this.images.get(url)).getLocation());
          ResourcePacks24.getInstance().getDraw().drawTexturedModalRect(x / size, y / size, (x + width) / size, (y + height) / size);
          GL11.glPopMatrix();
        }
      }
      else if (!this.loading.contains(url))
      {
        this.loading.add(url);
        new ImageDownloadThread(location, url);
      }
    }
    catch (Exception error)
    {
      error.printStackTrace();
    }
  }
  
  private void checkTextures()
  {
    ArrayList<jy> listLoad = new ArrayList();
    listLoad.addAll(this.loadList.keySet());
    for (jy rl : listLoad)
    {
      texture = new blz((BufferedImage)this.loadList.get(rl));
      ave.A().P().a(rl, texture);
      this.loadList.remove(rl);
    }
    blz texture;
    if (this.lastCheck + 5000L < System.currentTimeMillis())
    {
      this.lastCheck = System.currentTimeMillis();
      Object rem = new ArrayList();
      ArrayList<String> all = new ArrayList();
      all.addAll(this.images.keySet());
      for (String list : all)
      {
        TheImage image = (TheImage)this.images.get(list);
        if (image.getLastUse() + 5000L < System.currentTimeMillis())
        {
          ((ArrayList)rem).add(list);
          ave.A().P().c(image.getLocation());
        }
      }
      for (String list : (ArrayList)rem) {
        this.images.remove(list);
      }
    }
  }
  
  class TheImage
  {
    private jy location;
    private long lastUse;
    
    public TheImage(jy loc)
    {
      this.location = loc;
      this.lastUse = System.currentTimeMillis();
    }
    
    public long getLastUse()
    {
      return this.lastUse;
    }
    
    public jy getLocation()
    {
      this.lastUse = System.currentTimeMillis();
      return this.location;
    }
  }
  
  public class ImageDownloadThread
    extends Thread
  {
    private String url;
    private String location;
    
    public ImageDownloadThread(String location, String url)
    {
      this.location = location;
      this.url = url;
      start();
    }
    
    public void run()
    {
      try
      {
        jy rl = new jy("images/" + this.location);
        if ((this.url != null) && (!this.url.isEmpty()))
        {
          HttpURLConnection connection = (HttpURLConnection)new URL(this.url).openConnection();
          connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
          connection.setRequestProperty("Cookie", "foo=bar");
          connection.connect();
          if (connection.getResponseCode() / 100 == 2)
          {
            BufferedImage read = ImageIO.read(connection.getInputStream());
            if (read != null)
            {
              IconDownloader.this.loadList.put(rl, read);
              IconDownloader.this.images.put(this.url, new IconDownloader.TheImage(IconDownloader.this, rl));
              IconDownloader.this.loading.remove(this.url);
            }
          }
        }
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
    }
  }
}
