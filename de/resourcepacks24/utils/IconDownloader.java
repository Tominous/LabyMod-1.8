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
      if (images.containsKey(url))
      {
        loading.remove(url);
        if ((images.get(url) != null) && (((TheImage)images.get(url)).getLocation() != null) && (!loadList.containsKey(((TheImage)images.get(url)).getLocation())))
        {
          GL11.glPushMatrix();
          GL11.glScaled(size, size, size);
          ave.A().P().a(((TheImage)images.get(url)).getLocation());
          ResourcePacks24.getInstance().getDraw().drawTexturedModalRect(x / size, y / size, (x + width) / size, (y + height) / size);
          GL11.glPopMatrix();
        }
      }
      else if (!loading.contains(url))
      {
        loading.add(url);
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
    listLoad.addAll(loadList.keySet());
    for (jy rl : listLoad)
    {
      texture = new blz((BufferedImage)loadList.get(rl));
      ave.A().P().a(rl, texture);
      loadList.remove(rl);
    }
    blz texture;
    if (lastCheck + 5000L < System.currentTimeMillis())
    {
      lastCheck = System.currentTimeMillis();
      Object rem = new ArrayList();
      ArrayList<String> all = new ArrayList();
      all.addAll(images.keySet());
      for (String list : all)
      {
        TheImage image = (TheImage)images.get(list);
        if (image.getLastUse() + 5000L < System.currentTimeMillis())
        {
          ((ArrayList)rem).add(list);
          ave.A().P().c(image.getLocation());
        }
      }
      for (String list : (ArrayList)rem) {
        images.remove(list);
      }
    }
  }
  
  class TheImage
  {
    private jy location;
    private long lastUse;
    
    public TheImage(jy loc)
    {
      location = loc;
      lastUse = System.currentTimeMillis();
    }
    
    public long getLastUse()
    {
      return lastUse;
    }
    
    public jy getLocation()
    {
      lastUse = System.currentTimeMillis();
      return location;
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
        jy rl = new jy("images/" + location);
        if ((url != null) && (!url.isEmpty()))
        {
          HttpURLConnection connection = (HttpURLConnection)new URL(url).openConnection();
          connection.setRequestProperty("User-Agent", "Mozilla/5.0 (Macintosh; U; Intel Mac OS X 10.4; en-US; rv:1.9.2.2) Gecko/20100316 Firefox/3.6.2");
          connection.setRequestProperty("Cookie", "foo=bar");
          connection.connect();
          if (connection.getResponseCode() / 100 == 2)
          {
            BufferedImage read = ImageIO.read(connection.getInputStream());
            if (read != null)
            {
              loadList.put(rl, read);
              images.put(url, new IconDownloader.TheImage(IconDownloader.this, rl));
              loading.remove(url);
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
