import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class ak
  extends i
{
  public String c()
  {
    return "help";
  }
  
  public int a()
  {
    return 0;
  }
  
  public String c(m ☃)
  {
    return "commands.help.usage";
  }
  
  public List<String> b()
  {
    return Arrays.asList(new String[] { "?" });
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    List<k> ☃ = d(☃);
    int ☃ = 7;
    int ☃ = (☃.size() - 1) / 7;
    int ☃ = 0;
    try
    {
      ☃ = ☃.length == 0 ? 0 : a(☃[0], 1, ☃ + 1) - 1;
    }
    catch (cb ☃)
    {
      Map<String, k> ☃ = d();
      k ☃ = (k)☃.get(☃[0]);
      if (☃ != null) {
        throw new cf(☃.c(☃), new Object[0]);
      }
      if (ns.a(☃[0], -1) != -1) {
        throw ☃;
      }
      throw new ce();
    }
    int ☃ = Math.min((☃ + 1) * 7, ☃.size());
    
    fb ☃ = new fb("commands.help.header", new Object[] { Integer.valueOf(☃ + 1), Integer.valueOf(☃ + 1) });
    ☃.b().a(a.c);
    ☃.a(☃);
    for (int ☃ = ☃ * 7; ☃ < ☃; ☃++)
    {
      k ☃ = (k)☃.get(☃);
      
      fb ☃ = new fb(☃.c(☃), new Object[0]);
      ☃.b().a(new et(et.a.e, "/" + ☃.c() + " "));
      ☃.a(☃);
    }
    if ((☃ == 0) && ((☃ instanceof wn)))
    {
      fb ☃ = new fb("commands.help.footer", new Object[0]);
      ☃.b().a(a.k);
      ☃.a(☃);
    }
  }
  
  protected List<k> d(m ☃)
  {
    List<k> ☃ = MinecraftServer.N().P().a(☃);
    Collections.sort(☃);
    return ☃;
  }
  
  protected Map<String, k> d()
  {
    return MinecraftServer.N().P().a();
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1)
    {
      Set<String> ☃ = d().keySet();
      return a(☃, (String[])☃.toArray(new String[☃.size()]));
    }
    return null;
  }
}
