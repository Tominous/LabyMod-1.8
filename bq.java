import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bq
  extends i
{
  public String c()
  {
    return "testfor";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.testfor.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.testfor.usage", new Object[0]);
    }
    pk ☃ = b(☃, ☃[0]);
    dn ☃ = null;
    if (☃.length >= 2) {
      try
      {
        ☃ = ed.a(a(☃, 1));
      }
      catch (ec ☃)
      {
        throw new bz("commands.testfor.tagError", new Object[] { ☃.getMessage() });
      }
    }
    if (☃ != null)
    {
      dn ☃ = new dn();
      ☃.e(☃);
      if (!dy.a(☃, ☃, true)) {
        throw new bz("commands.testfor.failure", new Object[] { ☃.e_() });
      }
    }
    a(☃, this, "commands.testfor.success", new Object[] { ☃.e_() });
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
}
