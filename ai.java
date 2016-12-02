import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ai
  extends i
{
  public String c()
  {
    return "gamerule";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.gamerule.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    adk ☃ = d();
    String ☃ = ☃.length > 0 ? ☃[0] : "";
    String ☃ = ☃.length > 1 ? a(☃, 1) : "";
    switch (☃.length)
    {
    case 1: 
      if (☃.e(☃))
      {
        String ☃ = ☃.a(☃);
        ☃.a(new fa(☃).a(" = ").a(☃));
        ☃.a(n.a.e, ☃.c(☃));
      }
      else
      {
        throw new bz("commands.gamerule.norule", new Object[] { ☃ });
      }
      break;
    case 0: 
      ☃.a(new fa(a(☃.b())));
      break;
    default: 
      if ((☃.a(☃, adk.b.b)) && (!"true".equals(☃)) && (!"false".equals(☃))) {
        throw new bz("commands.generic.boolean.invalid", new Object[] { ☃ });
      }
      ☃.a(☃, ☃);
      a(☃, ☃);
      a(☃, this, "commands.gamerule.success", new Object[0]);
    }
  }
  
  public static void a(adk ☃, String ☃)
  {
    byte ☃;
    if ("reducedDebugInfo".equals(☃))
    {
      ☃ = ☃.b(☃) ? 22 : 23;
      for (lf ☃ : MinecraftServer.N().ap().v()) {
        a.a(new gi(☃, ☃));
      }
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, d().b());
    }
    if (☃.length == 2)
    {
      adk ☃ = d();
      if (☃.a(☃[0], adk.b.b)) {
        return a(☃, new String[] { "true", "false" });
      }
    }
    return null;
  }
  
  private adk d()
  {
    return MinecraftServer.N().a(0).Q();
  }
}
