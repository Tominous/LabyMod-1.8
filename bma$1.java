import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

class bma$1
  extends Thread
{
  private static final String __OBFID = "CL_00001050";
  
  bma$1(bma parambma, String x0)
  {
    super(x0);
  }
  
  public void run()
  {
    HttpURLConnection var1 = null;
    bma.f().debug("Downloading http texture from {} to {}", new Object[] { bma.a(this.this$0), bma.b(this.this$0) });
    if (bma.access$300(this.this$0))
    {
      bma.access$400(this.this$0);
      return;
    }
    try
    {
      var1 = (HttpURLConnection)new URL(bma.a(this.this$0)).openConnection(ave.A().O());
      var1.setDoInput(true);
      var1.setDoOutput(false);
      var1.connect();
      if (var1.getResponseCode() / 100 == 2)
      {
        BufferedImage var2;
        BufferedImage var2;
        if (bma.b(this.this$0) != null)
        {
          FileUtils.copyInputStreamToFile(var1.getInputStream(), bma.b(this.this$0));
          var2 = ImageIO.read(bma.b(this.this$0));
        }
        else
        {
          var2 = bml.a(var1.getInputStream());
        }
        if (bma.c(this.this$0) != null) {
          var2 = bma.c(this.this$0).a(var2);
        }
        this.this$0.a(var2);
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
      this.this$0.imageFound = Boolean.valueOf(bma.access$600(this.this$0) != null);
    }
  }
}
