import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ag
  extends i
{
  public String c()
  {
    return "difficulty";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.difficulty.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length <= 0) {
      throw new cf("commands.difficulty.usage", new Object[0]);
    }
    oj ☃ = e(☃[0]);
    MinecraftServer.N().a(☃);
    
    a(☃, this, "commands.difficulty.success", new Object[] { new fb(☃.b(), new Object[0]) });
  }
  
  protected oj e(String ☃)
    throws cb
  {
    if ((☃.equalsIgnoreCase("peaceful")) || (☃.equalsIgnoreCase("p"))) {
      return oj.a;
    }
    if ((☃.equalsIgnoreCase("easy")) || (☃.equalsIgnoreCase("e"))) {
      return oj.b;
    }
    if ((☃.equalsIgnoreCase("normal")) || (☃.equalsIgnoreCase("n"))) {
      return oj.c;
    }
    if ((☃.equalsIgnoreCase("hard")) || (☃.equalsIgnoreCase("h"))) {
      return oj.d;
    }
    return oj.a(a(☃, 0, 3));
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "peaceful", "easy", "normal", "hard" });
    }
    return null;
  }
}
