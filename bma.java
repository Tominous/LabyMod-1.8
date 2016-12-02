import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.URL;
import java.util.concurrent.atomic.AtomicInteger;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bma
  extends bme
{
  private static final Logger g = ;
  private static final AtomicInteger h = new AtomicInteger(0);
  private final File i;
  private final String j;
  private final bfm k;
  private BufferedImage l;
  private Thread m;
  private boolean n;
  private static final String __OBFID = "CL_00001049";
  public Boolean imageFound = null;
  public boolean pipeline = false;
  
  public bma(File p_i1049_1_, String p_i1049_2_, jy p_i1049_3_, bfm p_i1049_4_)
  {
    super(p_i1049_3_);
    i = p_i1049_1_;
    j = p_i1049_2_;
    k = p_i1049_4_;
  }
  
  private void g()
  {
    if (!n) {
      if (l != null)
      {
        n = true;
        if (f != null) {
          c();
        }
        bml.a(super.b(), l);
      }
    }
  }
  
  public int b()
  {
    g();
    return super.b();
  }
  
  public void a(BufferedImage p_147641_1_)
  {
    l = p_147641_1_;
    if (k != null) {
      k.a();
    }
    imageFound = Boolean.valueOf(l != null);
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    if ((l == null) && (f != null)) {
      super.a(p_110551_1_);
    }
    if (m == null) {
      if ((i != null) && (i.isFile()))
      {
        g.debug("Loading http texture from local cache ({})", new Object[] { i });
        try
        {
          l = ImageIO.read(i);
          if (k != null) {
            a(k.a(l));
          }
          imageFound = Boolean.valueOf(l != null);
        }
        catch (IOException var3)
        {
          g.error("Couldn't load skin " + i, var3);
          d();
        }
      }
      else
      {
        d();
      }
    }
  }
  
  protected void d()
  {
    m = new Thread("Texture Downloader #" + h.incrementAndGet())
    {
      private static final String __OBFID = "CL_00001050";
      
      public void run()
      {
        HttpURLConnection var1 = null;
        bma.f().debug("Downloading http texture from {} to {}", new Object[] { bma.a(bma.this), bma.b(bma.this) });
        if (bma.this.shouldPipeline())
        {
          bma.this.loadPipelined();
          return;
        }
        try
        {
          var1 = (HttpURLConnection)new URL(bma.a(bma.this)).openConnection(ave.A().O());
          var1.setDoInput(true);
          var1.setDoOutput(false);
          var1.connect();
          if (var1.getResponseCode() / 100 == 2)
          {
            BufferedImage var2;
            BufferedImage var2;
            if (bma.b(bma.this) != null)
            {
              FileUtils.copyInputStreamToFile(var1.getInputStream(), bma.b(bma.this));
              var2 = ImageIO.read(bma.b(bma.this));
            }
            else
            {
              var2 = bml.a(var1.getInputStream());
            }
            if (bma.c(bma.this) != null) {
              var2 = bma.c(bma.this).a(var2);
            }
            a(var2);
          }
          else if (var1.getErrorStream() != null)
          {
            Config.readAll(var1.getErrorStream());
          }
        }
        catch (Exception var6)
        {
          bma.f().error("Couldn't download http texture: " + var6.getClass().getName() + ": " + var6.getMessage());
        }
        finally
        {
          if (var1 != null) {
            var1.disconnect();
          }
          imageFound = Boolean.valueOf(l != null);
        }
      }
    };
    m.setDaemon(true);
    m.start();
  }
  
  private boolean shouldPipeline()
  {
    if (!pipeline) {
      return false;
    }
    Proxy proxy = ave.A().O();
    if ((proxy.type() != Proxy.Type.DIRECT) && (proxy.type() != Proxy.Type.SOCKS)) {
      return false;
    }
    if (!j.startsWith("http://")) {
      return false;
    }
    return true;
  }
  
  private void loadPipelined()
  {
    try
    {
      HttpRequest req = HttpPipeline.makeRequest(j, ave.A().O());
      HttpResponse resp = HttpPipeline.executeRequest(req);
      if (resp.getStatus() / 100 == 2)
      {
        byte[] body = resp.getBody();
        ByteArrayInputStream bais = new ByteArrayInputStream(body);
        BufferedImage var2;
        BufferedImage var2;
        if (i != null)
        {
          FileUtils.copyInputStreamToFile(bais, i);
          var2 = ImageIO.read(i);
        }
        else
        {
          var2 = bml.a(bais);
        }
        if (k != null) {
          var2 = k.a(var2);
        }
        a(var2);
      }
    }
    catch (Exception var6)
    {
      g.error("Couldn't download http texture: " + var6.getClass().getName() + ": " + var6.getMessage());
    }
    finally
    {
      imageFound = Boolean.valueOf(l != null);
    }
  }
}
