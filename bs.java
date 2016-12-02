import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bs
  extends i
{
  private static final Logger a = ;
  
  public String c()
  {
    return "title";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.title.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.title.usage", new Object[0]);
    }
    if (☃.length < 3)
    {
      if (("title".equals(☃[1])) || ("subtitle".equals(☃[1]))) {
        throw new cf("commands.title.usage.title", new Object[0]);
      }
      if ("times".equals(☃[1])) {
        throw new cf("commands.title.usage.times", new Object[0]);
      }
    }
    lf ☃ = a(☃, ☃[0]);
    hv.a ☃ = hv.a.a(☃[1]);
    if ((☃ == hv.a.d) || (☃ == hv.a.e))
    {
      if (☃.length != 2) {
        throw new cf("commands.title.usage", new Object[0]);
      }
      hv ☃ = new hv(☃, null);
      ☃.a.a(☃);
      a(☃, this, "commands.title.success", new Object[0]);
      return;
    }
    if (☃ == hv.a.c)
    {
      if (☃.length != 5) {
        throw new cf("commands.title.usage", new Object[0]);
      }
      int ☃ = a(☃[2]);
      int ☃ = a(☃[3]);
      int ☃ = a(☃[4]);
      hv ☃ = new hv(☃, ☃, ☃);
      ☃.a.a(☃);
      a(☃, this, "commands.title.success", new Object[0]);
      return;
    }
    if (☃.length < 3) {
      throw new cf("commands.title.usage", new Object[0]);
    }
    String ☃ = a(☃, 2);
    eu ☃;
    try
    {
      ☃ = eu.a.a(☃);
    }
    catch (JsonParseException ☃)
    {
      Throwable ☃ = ExceptionUtils.getRootCause(☃);
      throw new cc("commands.tellraw.jsonException", new Object[] { ☃ == null ? "" : ☃.getMessage() });
    }
    hv ☃ = new hv(☃, ev.a(☃, ☃, ☃));
    ☃.a.a(☃);
    a(☃, this, "commands.title.success", new Object[0]);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().K());
    }
    if (☃.length == 2) {
      return a(☃, hv.a.a());
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
