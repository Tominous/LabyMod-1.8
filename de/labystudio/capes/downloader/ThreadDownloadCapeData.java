package de.labystudio.capes.downloader;

import ave;
import bfm;
import bme;
import bmj;
import bml;
import bni;
import de.labystudio.capes.CapeCallback;
import de.labystudio.utils.Debug;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import jy;
import org.apache.commons.io.FileUtils;

public class ThreadDownloadCapeData
  extends bme
{
  private static final AtomicInteger threadDownloadCounter = new AtomicInteger(0);
  private final File cacheFile;
  private final String imageUrl;
  private final bfm imageBuffer;
  private BufferedImage bufferedImage;
  private Thread imageThread;
  private boolean textureUploaded;
  private static final String __OBFID = "CL_00001049";
  public Boolean imageFound = null;
  public boolean pipeline = false;
  private CapeCallback callBack;
  private jy resourceLocation;
  
  public ThreadDownloadCapeData(File p_i1049_1_, String p_i1049_2_, jy p_i1049_3_, bfm p_i1049_4_, CapeCallback callBack)
  {
    super(null);
    this.cacheFile = p_i1049_1_;
    this.imageUrl = p_i1049_2_;
    this.imageBuffer = p_i1049_4_;
    this.callBack = callBack;
    this.resourceLocation = p_i1049_3_;
  }
  
  private void checkTextureUploaded()
  {
    if ((!this.textureUploaded) && 
      (this.bufferedImage != null))
    {
      this.textureUploaded = true;
      if (this.f != null) {
        c();
      }
      bml.a(super.b(), this.bufferedImage);
    }
  }
  
  public int b()
  {
    checkTextureUploaded();
    return super.b();
  }
  
  public void setBufferedImage(BufferedImage p_147641_1_)
  {
    this.bufferedImage = p_147641_1_;
    if (this.imageBuffer != null) {
      this.imageBuffer.a();
    }
    this.imageFound = Boolean.valueOf(this.bufferedImage != null);
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    if ((this.bufferedImage == null) && (this.f != null)) {
      super.a(p_110551_1_);
    }
    if (this.imageThread == null) {
      if ((this.cacheFile != null) && (this.cacheFile.isFile()))
      {
        Debug.debug("Loading http texture from local cache (" + this.cacheFile + ")");
        try
        {
          this.bufferedImage = ImageIO.read(this.cacheFile);
          if (this.imageBuffer != null) {
            setBufferedImage(this.imageBuffer.a(this.bufferedImage));
          }
          this.imageFound = Boolean.valueOf(this.bufferedImage != null);
        }
        catch (IOException var3)
        {
          Debug.debug("Couldn't load skin " + this.cacheFile);
          loadTextureFromServer();
        }
      }
      else
      {
        loadTextureFromServer();
      }
    }
  }
  
  protected void loadTextureFromServer()
  {
    this.imageThread = new Thread("Texture Downloader #" + threadDownloadCounter.incrementAndGet())
    {
      private static final String __OBFID = "CL_00001050";
      
      public void run()
      {
        HttpURLConnection var1 = null;
        Debug.debug("Downloading http texture from " + ThreadDownloadCapeData.this.imageUrl + " to " + ThreadDownloadCapeData.this.cacheFile);
        try
        {
          var1 = (HttpURLConnection)new URL(ThreadDownloadCapeData.this.imageUrl).openConnection(ave.A().O());
          var1.setDoInput(true);
          var1.setDoOutput(false);
          var1.connect();
          if (var1.getResponseCode() / 100 == 2)
          {
            BufferedImage var2;
            BufferedImage var2;
            if (ThreadDownloadCapeData.this.cacheFile != null)
            {
              FileUtils.copyInputStreamToFile(var1.getInputStream(), ThreadDownloadCapeData.this.cacheFile);
              var2 = ImageIO.read(ThreadDownloadCapeData.this.cacheFile);
            }
            else
            {
              var2 = bml.a(var1.getInputStream());
            }
            if (ThreadDownloadCapeData.this.imageBuffer != null) {
              var2 = ThreadDownloadCapeData.this.imageBuffer.a(var2);
            }
            ThreadDownloadCapeData.this.setBufferedImage(var2);
          }
          else if (var1.getErrorStream() != null)
          {
            Debug.debug(var1.getErrorStream().toString());
          }
        }
        catch (Exception var6)
        {
          Debug.debug("Couldn't download http texture: " + var6.getClass().getName() + ": " + var6.getMessage());
        }
        finally
        {
          if (var1 != null) {
            var1.disconnect();
          }
          ThreadDownloadCapeData.this.imageFound = Boolean.valueOf(ThreadDownloadCapeData.this.bufferedImage != null);
          if (ThreadDownloadCapeData.this.imageFound.booleanValue())
          {
            ThreadDownloadCapeData.this.callBack.done();
          }
          else
          {
            ThreadDownloadCapeData.this.callBack.failed("Texture not found");
            
            ave.A().P().b.remove(ThreadDownloadCapeData.this.resourceLocation);
          }
        }
      }
    };
    this.imageThread.start();
  }
}
