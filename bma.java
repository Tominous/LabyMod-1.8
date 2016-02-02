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
    this.i = p_i1049_1_;
    this.j = p_i1049_2_;
    this.k = p_i1049_4_;
  }
  
  private void g()
  {
    if (!this.n) {
      if (this.l != null)
      {
        this.n = true;
        if (this.f != null) {
          c();
        }
        bml.a(super.b(), this.l);
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
    this.l = p_147641_1_;
    if (this.k != null) {
      this.k.a();
    }
    this.imageFound = Boolean.valueOf(this.l != null);
  }
  
  public void a(bni p_110551_1_)
    throws IOException
  {
    if ((this.l == null) && (this.f != null)) {
      super.a(p_110551_1_);
    }
    if (this.m == null) {
      if ((this.i != null) && (this.i.isFile()))
      {
        g.debug("Loading http texture from local cache ({})", new Object[] { this.i });
        try
        {
          this.l = ImageIO.read(this.i);
          if (this.k != null) {
            a(this.k.a(this.l));
          }
          this.imageFound = Boolean.valueOf(this.l != null);
        }
        catch (IOException var3)
        {
          g.error("Couldn't load skin " + this.i, var3);
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
    this.m = new Thread("Texture Downloader #" + h.incrementAndGet())
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
            bma.this.a(var2);
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
          bma.this.imageFound = Boolean.valueOf(bma.this.l != null);
        }
      }
    };
    this.m.setDaemon(true);
    this.m.start();
  }
  
  private boolean shouldPipeline()
  {
    if (!this.pipeline) {
      return false;
    }
    Proxy proxy = ave.A().O();
    if ((proxy.type() != Proxy.Type.DIRECT) && (proxy.type() != Proxy.Type.SOCKS)) {
      return false;
    }
    if (!this.j.startsWith("http://")) {
      return false;
    }
    return true;
  }
  
  private void loadPipelined()
  {
    try
    {
      HttpRequest req = HttpPipeline.makeRequest(this.j, ave.A().O());
      HttpResponse resp = HttpPipeline.executeRequest(req);
      if (resp.getStatus() / 100 == 2)
      {
        byte[] body = resp.getBody();
        ByteArrayInputStream bais = new ByteArrayInputStream(body);
        BufferedImage var2;
        BufferedImage var2;
        if (this.i != null)
        {
          FileUtils.copyInputStreamToFile(bais, this.i);
          var2 = ImageIO.read(this.i);
        }
        else
        {
          var2 = bml.a(bais);
        }
        if (this.k != null) {
          var2 = this.k.a(var2);
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
      this.imageFound = Boolean.valueOf(this.l != null);
    }
  }
}
