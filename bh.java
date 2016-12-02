import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bh
  extends i
{
  public String c()
  {
    return "spawnpoint";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.spawnpoint.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if ((☃.length > 1) && (☃.length < 4)) {
      throw new cf("commands.spawnpoint.usage", new Object[0]);
    }
    lf ☃ = ☃.length > 0 ? a(☃, ☃[0]) : b(☃);
    cj ☃ = ☃.length > 3 ? a(☃, ☃, 1, true) : ☃.c();
    if (o != null)
    {
      ☃.a(☃, true);
      a(☃, this, "commands.spawnpoint.success", new Object[] { ☃.e_(), Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, MinecraftServer.N().K());
    }
    if ((☃.length > 1) && (☃.length <= 4)) {
      return a(☃, 1, ☃);
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
