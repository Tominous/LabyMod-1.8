import com.google.common.base.Charsets;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.JsonParser;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URI;
import org.apache.commons.io.IOUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class bmx
  implements bnk
{
  private static final Logger b = ;
  protected final File a;
  
  public bmx(File ☃)
  {
    a = ☃;
  }
  
  private static String c(jy ☃)
  {
    return String.format("%s/%s/%s", new Object[] { "assets", ☃.b(), ☃.a() });
  }
  
  protected static String a(File ☃, File ☃)
  {
    return ☃.toURI().relativize(☃.toURI()).getPath();
  }
  
  public InputStream a(jy ☃)
    throws IOException
  {
    return a(c(☃));
  }
  
  public boolean b(jy ☃)
  {
    return b(c(☃));
  }
  
  protected abstract InputStream a(String paramString)
    throws IOException;
  
  protected abstract boolean b(String paramString);
  
  protected void c(String ☃)
  {
    b.warn("ResourcePack: ignored non-lowercase namespace: %s in %s", new Object[] { ☃, a });
  }
  
  public <T extends bnw> T a(bny ☃, String ☃)
    throws IOException
  {
    return a(☃, a("pack.mcmeta"), ☃);
  }
  
  static <T extends bnw> T a(bny ☃, InputStream ☃, String ☃)
  {
    JsonObject ☃ = null;
    BufferedReader ☃ = null;
    try
    {
      ☃ = new BufferedReader(new InputStreamReader(☃, Charsets.UTF_8));
      ☃ = new JsonParser().parse(☃).getAsJsonObject();
    }
    catch (RuntimeException ☃)
    {
      throw new JsonParseException(☃);
    }
    finally
    {
      IOUtils.closeQuietly(☃);
    }
    return ☃.a(☃, ☃);
  }
  
  public BufferedImage a()
    throws IOException
  {
    return bml.a(a("pack.png"));
  }
  
  public String b()
  {
    return a.getName();
  }
}
