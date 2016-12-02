import java.awt.image.BufferedImage;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.imageio.ImageIO;
import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.Logger;

class bma$1
  extends Thread
{
  bma$1(bma parambma, String ☃)
  {
    super(☃);
  }
  
  public void run()
  {
    HttpURLConnection ☃ = null;
    bma.f().debug("Downloading http texture from {} to {}", new Object[] { bma.a(this.a), bma.b(this.a) });
    try
    {
      ☃ = (HttpURLConnection)new URL(bma.a(this.a)).openConnection(ave.A().O());
      ☃.setDoInput(true);
      ☃.setDoOutput(false);
      ☃.connect();
      if (☃.getResponseCode() / 100 != 2) {
        return;
      }
      BufferedImage ☃;
      BufferedImage ☃;
      if (bma.b(this.a) != null)
      {
        FileUtils.copyInputStreamToFile(☃.getInputStream(), bma.b(this.a));
        ☃ = ImageIO.read(bma.b(this.a));
      }
      else
      {
        ☃ = bml.a(☃.getInputStream());
      }
      if (bma.c(this.a) != null) {
        ☃ = bma.c(this.a).a(☃);
      }
      this.a.a(☃);
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
}
