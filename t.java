import java.util.List;
import net.minecraft.server.MinecraftServer;

public class t
  extends i
{
  public String c()
  {
    return "clear";
  }
  
  public String c(m ☃)
  {
    return "commands.clear.usage";
  }
  
  public int a()
  {
    return 2;
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    lf ☃ = ☃.length == 0 ? b(☃) : a(☃, ☃[0]);
    zw ☃ = ☃.length >= 2 ? f(☃, ☃[1]) : null;
    int ☃ = ☃.length >= 3 ? a(☃[2], -1) : -1;
    int ☃ = ☃.length >= 4 ? a(☃[3], -1) : -1;
    
    dn ☃ = null;
    if (☃.length >= 5) {
      try
      {
        ☃ = ed.a(a(☃, 4));
      }
      catch (ec ☃)
      {
        throw new bz("commands.clear.tagError", new Object[] { ☃.getMessage() });
      }
    }
    if ((☃.length >= 2) && (☃ == null)) {
      throw new bz("commands.clear.failure", new Object[] { ☃.e_() });
    }
    int ☃ = ☃.bi.a(☃, ☃, ☃, ☃);
    ☃.bj.b();
    if (!☃.bA.d) {
      ☃.o();
    }
    ☃.a(n.a.d, ☃);
    if (☃ == 0) {
      throw new bz("commands.clear.failure", new Object[] { ☃.e_() });
    }
    if (☃ == 0) {
      ☃.a(new fb("commands.clear.testing", new Object[] { ☃.e_(), Integer.valueOf(☃) }));
    } else {
      a(☃, this, "commands.clear.success", new Object[] { ☃.e_(), Integer.valueOf(☃) });
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, d());
    }
    if (☃.length == 2) {
      return a(☃, zw.e.c());
    }
    return null;
  }
  
  protected String[] d()
  {
    return MinecraftServer.N().K();
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
