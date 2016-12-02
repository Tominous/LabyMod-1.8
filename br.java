import java.util.List;
import net.minecraft.server.MinecraftServer;

public class br
  extends i
{
  public String c()
  {
    return "time";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.time.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length > 1)
    {
      if (☃[0].equals("set"))
      {
        int ☃;
        int ☃;
        if (☃[1].equals("day"))
        {
          ☃ = 1000;
        }
        else
        {
          int ☃;
          if (☃[1].equals("night")) {
            ☃ = 13000;
          } else {
            ☃ = a(☃[1], 0);
          }
        }
        a(☃, ☃);
        a(☃, this, "commands.time.set", new Object[] { Integer.valueOf(☃) });
        return;
      }
      if (☃[0].equals("add"))
      {
        int ☃ = a(☃[1], 0);
        b(☃, ☃);
        a(☃, this, "commands.time.added", new Object[] { Integer.valueOf(☃) });
        return;
      }
      if (☃[0].equals("query"))
      {
        if (☃[1].equals("daytime"))
        {
          int ☃ = (int)(☃.e().L() % 2147483647L);
          ☃.a(n.a.e, ☃);
          a(☃, this, "commands.time.query", new Object[] { Integer.valueOf(☃) });
          return;
        }
        if (☃[1].equals("gametime"))
        {
          int ☃ = (int)(☃.e().K() % 2147483647L);
          ☃.a(n.a.e, ☃);
          a(☃, this, "commands.time.query", new Object[] { Integer.valueOf(☃) });
          return;
        }
      }
    }
    throw new cf("commands.time.usage", new Object[0]);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "set", "add", "query" });
    }
    if ((☃.length == 2) && (☃[0].equals("set"))) {
      return a(☃, new String[] { "day", "night" });
    }
    if ((☃.length == 2) && (☃[0].equals("query"))) {
      return a(☃, new String[] { "daytime", "gametime" });
    }
    return null;
  }
  
  protected void a(m ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < Nd.length; ☃++) {
      Nd[☃].b(☃);
    }
  }
  
  protected void b(m ☃, int ☃)
  {
    for (int ☃ = 0; ☃ < Nd.length; ☃++)
    {
      le ☃ = Nd[☃];
      ☃.b(☃.L() + ☃);
    }
  }
}
