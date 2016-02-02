import com.google.gson.JsonParseException;
import java.util.List;
import net.minecraft.server.MinecraftServer;
import org.apache.commons.lang3.exception.ExceptionUtils;

public class aq
  extends i
{
  public String c()
  {
    return "tellraw";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.tellraw.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.tellraw.usage", new Object[0]);
    }
    wn ☃ = a(☃, ☃[0]);
    String ☃ = a(☃, 1);
    try
    {
      eu ☃ = eu.a.a(☃);
      ☃.a(ev.a(☃, ☃, ☃));
    }
    catch (JsonParseException ☃)
    {
      Throwable ☃ = ExceptionUtils.getRootCause(☃);
      throw new cc("commands.tellraw.jsonException", new Object[] { ☃ == null ? "" : ☃.getMessage() });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
