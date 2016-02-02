import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bf
  extends i
{
  public String c()
  {
    return "setworldspawn";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.setworldspawn.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    cj ☃;
    if (☃.length == 0)
    {
      ☃ = b(☃).c();
    }
    else
    {
      cj ☃;
      if ((☃.length == 3) && (☃.e() != null)) {
        ☃ = a(☃, ☃, 0, true);
      } else {
        throw new cf("commands.setworldspawn.usage", new Object[0]);
      }
    }
    cj ☃;
    ☃.e().B(☃);
    MinecraftServer.N().ap().a(new ht(☃));
    a(☃, this, "commands.setworldspawn.success", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    return null;
  }
}
