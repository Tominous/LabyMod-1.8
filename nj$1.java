import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.Proxy;
import java.net.URL;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.Logger;

final class nj$1
  implements Runnable
{
  nj$1(nu paramnu, String paramString, Proxy paramProxy, Map paramMap, File paramFile, int paramInt) {}
  
  public void run()
  {
    HttpURLConnection ☃ = null;
    InputStream ☃ = null;
    OutputStream ☃ = null;
    if (a != null)
    {
      a.b("Downloading Resource Pack");
      a.c("Making Request...");
    }
    try
    {
      byte[] ☃ = new byte['က'];
      URL ☃ = new URL(b);
      ☃ = (HttpURLConnection)☃.openConnection(c);
      float ☃ = 0.0F;
      float ☃ = d.entrySet().size();
      for (Map.Entry<String, String> ☃ : d.entrySet())
      {
        ☃.setRequestProperty((String)☃.getKey(), (String)☃.getValue());
        if (a != null) {
          a.a((int)(++☃ / ☃ * 100.0F));
        }
      }
      ☃ = ☃.getInputStream();
      ☃ = ☃.getContentLength();
      int ☃ = ☃.getContentLength();
      if (a != null) {
        a.c(String.format("Downloading file (%.2f MB)...", new Object[] { Float.valueOf(☃ / 1000.0F / 1000.0F) }));
      }
      if (e.exists())
      {
        long ☃ = e.length();
        if (☃ == ☃)
        {
          if (a != null) {
            a.a();
          }
          return;
        }
        nj.b().warn("Deleting " + e + " as it does not match what we currently have (" + ☃ + " vs our " + ☃ + ").");
        FileUtils.deleteQuietly(e);
      }
      else if (e.getParentFile() != null)
      {
        e.getParentFile().mkdirs();
      }
      ☃ = new DataOutputStream(new FileOutputStream(e));
      if ((f > 0) && (☃ > f))
      {
        if (a != null) {
          a.a();
        }
        throw new IOException("Filesize is bigger than maximum allowed (file is " + ☃ + ", limit is " + f + ")");
      }
      int ☃ = 0;
      while ((☃ = ☃.read(☃)) >= 0)
      {
        ☃ += ☃;
        if (a != null) {
          a.a((int)(☃ / ☃ * 100.0F));
        }
        if ((f > 0) && (☃ > f))
        {
          if (a != null) {
            a.a();
          }
          throw new IOException("Filesize was bigger than maximum allowed (got >= " + ☃ + ", limit was " + f + ")");
        }
        if (Thread.interrupted())
        {
          nj.b().error("INTERRUPTED");
          if (a != null) {
            a.a();
          }
          return;
        }
        ☃.write(☃, 0, ☃);
      }
      if (a != null) {
        a.a();
      }
    }
    catch (Throwable ☃)
    {
      ☃.printStackTrace();
      if (☃ != null)
      {
        InputStream ☃ = ☃.getErrorStream();
        try
        {
          nj.b().error(IOUtils.toString(☃));
        }
        catch (IOException ☃)
        {
          ☃.printStackTrace();
        }
      }
      if (a != null) {
        a.a();
      }
    }
    finally
    {
      IOUtils.closeQuietly(☃);
      IOUtils.closeQuietly(☃);
    }
  }
}
