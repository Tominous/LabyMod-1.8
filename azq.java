import com.google.gson.JsonParseException;
import java.io.IOException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class azq
  extends azp
{
  private static final Logger c = ;
  private final bnk d = this.a.R().a;
  private final jy e;
  
  public azq(azo ☃)
  {
    super(☃);
    blz ☃;
    try
    {
      ☃ = new blz(this.d.a());
    }
    catch (IOException ☃)
    {
      ☃ = bml.a;
    }
    this.e = this.a.P().a("texturepackicon", ☃);
  }
  
  protected int a()
  {
    return 1;
  }
  
  protected String b()
  {
    try
    {
      boj ☃ = (boj)this.d.a(this.a.R().b, "pack");
      if (☃ != null) {
        return ☃.a().d();
      }
    }
    catch (JsonParseException ☃)
    {
      c.error("Couldn't load metadata info", ☃);
    }
    catch (IOException ☃)
    {
      c.error("Couldn't load metadata info", ☃);
    }
    return a.m + "Missing " + "pack.mcmeta" + " :(";
  }
  
  protected boolean f()
  {
    return false;
  }
  
  protected boolean g()
  {
    return false;
  }
  
  protected boolean h()
  {
    return false;
  }
  
  protected boolean i()
  {
    return false;
  }
  
  protected String c()
  {
    return "Default";
  }
  
  protected void d()
  {
    this.a.P().a(this.e);
  }
  
  protected boolean e()
  {
    return false;
  }
}
