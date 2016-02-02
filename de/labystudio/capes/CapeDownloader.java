package de.labystudio.capes;

import ave;
import bfm;
import bma;
import bml;
import java.awt.image.BufferedImage;
import java.io.File;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import jy;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class CapeDownloader
  extends bma
{
  private static final Logger logger = ;
  private static final AtomicInteger threadDownloadCounter = new AtomicInteger(0);
  private final String imageUrl;
  private final bfm imageBuffer;
  private Thread imageThread;
  
  public CapeDownloader(File p_i1049_1_, String p_i1049_2_, jy p_i1049_3_, bfm p_i1049_4_)
  {
    super(p_i1049_1_, p_i1049_2_, p_i1049_3_, p_i1049_4_);
    this.imageUrl = p_i1049_2_;
    this.imageBuffer = p_i1049_4_;
  }
  
  protected void d()
  {
    this.imageThread = new Thread("Texture Downloader #" + threadDownloadCounter.incrementAndGet())
    {
      private static final String __OBFID = "CL_00001050";
      
      public void run()
      {
        HttpURLConnection con = null;
        CapeDownloader.logger.debug("Downloading http texture from {} to {}", new Object[] { CapeDownloader.this.imageUrl, null });
        try
        {
          con = (HttpURLConnection)new URL(CapeDownloader.this.imageUrl).openConnection(ave.A().O());
          con.setRequestProperty("User-agent", "LabyMod");
          con.setRequestProperty("Java-Version", System.getProperty("java.version"));
          con.setConnectTimeout(10000);
          con.setDoOutput(true);
          con.setUseCaches(false);
          HttpURLConnection.setFollowRedirects(true);
          HttpURLConnection.setFollowRedirects(true);
          con.setInstanceFollowRedirects(true);
          con.connect();
          if (con.getResponseCode() / 100 == 2)
          {
            BufferedImage var2 = bml.a(con.getInputStream());
            if (CapeDownloader.this.imageBuffer != null) {
              var2 = CapeDownloader.this.imageBuffer.a(var2);
            }
            CapeDownloader.this.a(var2);
          }
        }
        catch (Exception var6)
        {
          CapeDownloader.logger.error("Couldn't download http texture", var6);
        }
        finally
        {
          if (con != null) {
            con.disconnect();
          }
        }
      }
    };
    this.imageThread.setDaemon(true);
    this.imageThread.start();
  }
}
