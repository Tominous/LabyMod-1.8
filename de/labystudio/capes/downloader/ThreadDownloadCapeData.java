package de.labystudio.capes.downloader;

import ave;
import bfm;
import bme;
import bml;
import bni;
import de.labystudio.capes.CapeCallback;
import de.labystudio.utils.Debug;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
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
  
  public ThreadDownloadCapeData(File p_i1049_1_, String p_i1049_2_, jy p_i1049_3_, bfm p_i1049_4_, CapeCallback callBack)
  {
    super(p_i1049_3_);
    cacheFile = p_i1049_1_;
    imageUrl = p_i1049_2_;
    imageBuffer = p_i1049_4_;
    this.callBack = callBack;
  }
  
  private void checkTextureUploaded()
  {
    if ((!textureUploaded) && 
      (bufferedImage != null))
    {
      textureUploaded = true;
      if (f != null) {
        c();
      }
      bml.a(super.b(), bufferedImage);
    }
  }
  
  public int b()
  {
    checkTextureUploaded();
    return super.b();
  }
  
  public void setBufferedImage(BufferedImage p_147641_1_)
  {
    bufferedImage = p_147641_1_;
    if (imageBuffer != null) {
      imageBuffer.a();
    }
    imageFound = Boolean.valueOf(bufferedImage != null);
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    if ((bufferedImage == null) && (f != null)) {
      super.a(p_110551_1_);
    }
    if (imageThread == null) {
      if ((cacheFile != null) && (cacheFile.isFile()))
      {
        Debug.debug("Loading http texture from local cache (" + cacheFile + ")");
        try
        {
          bufferedImage = ImageIO.read(cacheFile);
          if (imageBuffer != null) {
            setBufferedImage(imageBuffer.a(bufferedImage));
          }
          imageFound = Boolean.valueOf(bufferedImage != null);
        }
        catch (IOException var3)
        {
          Debug.debug("Couldn't load skin " + cacheFile);
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
    imageThread = new Thread("Texture Downloader #" + threadDownloadCounter.incrementAndGet())
    {
      private static final String __OBFID = "CL_00001050";
      
      public void run()
      {
        HttpURLConnection var1 = null;
        Debug.debug("Downloading http texture from " + imageUrl + " to " + cacheFile);
        try
        {
          var1 = (HttpURLConnection)new URL(imageUrl).openConnection(ave.A().O());
          var1.setDoInput(true);
          var1.setDoOutput(false);
          var1.connect();
          if (var1.getResponseCode() / 100 == 2)
          {
            BufferedImage var2;
            BufferedImage var2;
            if (cacheFile != null)
            {
              FileUtils.copyInputStreamToFile(var1.getInputStream(), cacheFile);
              var2 = ImageIO.read(cacheFile);
            }
            else
            {
              var2 = bml.a(var1.getInputStream());
            }
            if (imageBuffer != null) {
              var2 = imageBuffer.a(var2);
            }
            setBufferedImage(var2);
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
          imageFound = Boolean.valueOf(bufferedImage != null);
          if (imageFound.booleanValue()) {
            callBack.done();
          } else {
            callBack.failed("Texture not found");
          }
        }
      }
    };
    imageThread.start();
  }
}
