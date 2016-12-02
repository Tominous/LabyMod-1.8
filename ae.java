import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ae
  extends i
{
  public String c()
  {
    return "xp";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.xp.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length <= 0) {
      throw new cf("commands.xp.usage", new Object[0]);
    }
    String ☃ = ☃[0];
    boolean ☃ = (☃.endsWith("l")) || (☃.endsWith("L"));
    if ((☃) && (☃.length() > 1)) {
      ☃ = ☃.substring(0, ☃.length() - 1);
    }
    int ☃ = a(☃);
    
    boolean ☃ = ☃ < 0;
    if (☃) {
      ☃ *= -1;
    }
    wn ☃ = ☃.length > 1 ? a(☃, ☃[1]) : b(☃);
    if (☃)
    {
      ☃.a(n.a.e, ☃.bB);
      if (☃)
      {
        ☃.a(-☃);
        a(☃, this, "commands.xp.success.negative.levels", new Object[] { Integer.valueOf(☃), ☃.e_() });
      }
      else
      {
        ☃.a(☃);
        a(☃, this, "commands.xp.success.levels", new Object[] { Integer.valueOf(☃), ☃.e_() });
      }
    }
    else
    {
      ☃.a(n.a.e, ☃.bC);
      if (☃) {
        throw new bz("commands.xp.failure.widthdrawXp", new Object[0]);
      }
      ☃.u(☃);
      a(☃, this, "commands.xp.success", new Object[] { Integer.valueOf(☃), ☃.e_() });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 2) {
      return a(☃, d());
    }
    return null;
  }
  
  protected String[] d()
  {
    return MinecraftServer.N().K();
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 1;
  }
}
