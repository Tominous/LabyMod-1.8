import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
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
  
  public bma(File ☃, String ☃, jy ☃, bfm ☃)
  {
    super(☃);
    this.i = ☃;
    this.j = ☃;
    this.k = ☃;
  }
  
  private void g()
  {
    if (this.n) {
      return;
    }
    if (this.l != null)
    {
      if (this.f != null) {
        c();
      }
      bml.a(super.b(), this.l);
      this.n = true;
    }
  }
  
  public int b()
  {
    g();
    
    return super.b();
  }
  
  public void a(BufferedImage ☃)
  {
    this.l = ☃;
    if (this.k != null) {
      this.k.a();
    }
  }
  
  public void a(bni ☃)
    throws IOException
  {
    if ((this.l == null) && (this.f != null)) {
      super.a(☃);
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
        }
        catch (IOException ☃)
        {
          g.error("Couldn't load skin " + this.i, ☃);
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
      public void run()
      {
        HttpURLConnection ☃ = null;
        bma.f().debug("Downloading http texture from {} to {}", new Object[] { bma.a(bma.this), bma.b(bma.this) });
        try
        {
          ☃ = (HttpURLConnection)new URL(bma.a(bma.this)).openConnection(ave.A().O());
          ☃.setDoInput(true);
          ☃.setDoOutput(false);
          ☃.connect();
          if (☃.getResponseCode() / 100 != 2) {
            return;
          }
          BufferedImage ☃;
          BufferedImage ☃;
          if (bma.b(bma.this) != null)
          {
            FileUtils.copyInputStreamToFile(☃.getInputStream(), bma.b(bma.this));
            ☃ = ImageIO.read(bma.b(bma.this));
          }
          else
          {
            ☃ = bml.a(☃.getInputStream());
          }
          if (bma.c(bma.this) != null) {
            ☃ = bma.c(bma.this).a(☃);
          }
          bma.this.a(☃);
        }
        catch (Exception ☃)
        {
          bma.f().error("Couldn't download http texture", ☃);
        }
        finally
        {
          if (☃ != null) {
            ☃.disconnect();
          }
        }
      }
    };
    this.m.setDaemon(true);
    this.m.start();
  }
}
