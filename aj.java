import java.util.List;
import java.util.Random;
import net.minecraft.server.MinecraftServer;

public class aj
  extends i
{
  public String c()
  {
    return "give";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.give.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.give.usage", new Object[0]);
    }
    wn ☃ = a(☃, ☃[0]);
    zw ☃ = f(☃, ☃[1]);
    int ☃ = ☃.length >= 3 ? a(☃[2], 1, 64) : 1;
    int ☃ = ☃.length >= 4 ? a(☃[3]) : 0;
    zx ☃ = new zx(☃, ☃, ☃);
    if (☃.length >= 5)
    {
      String ☃ = a(☃, ☃, 4).c();
      try
      {
        ☃.d(ed.a(☃));
      }
      catch (ec ☃)
      {
        throw new bz("commands.give.tagError", new Object[] { ☃.getMessage() });
      }
    }
    boolean ☃ = bi.a(☃);
    if (☃)
    {
      o.a(☃, "random.pop", 0.2F, ((☃.bc().nextFloat() - ☃.bc().nextFloat()) * 0.7F + 1.0F) * 2.0F);
      bj.b();
    }
    if ((!☃) || (b > 0))
    {
      ☃.a(n.a.d, ☃ - b);
      uz ☃ = ☃.a(☃, false);
      if (☃ != null)
      {
        ☃.q();
        ☃.b(☃.e_());
      }
    }
    else
    {
      b = 1;
      ☃.a(n.a.d, ☃);
      uz ☃ = ☃.a(☃, false);
      if (☃ != null) {
        ☃.v();
      }
    }
    a(☃, this, "commands.give.success", new Object[] { ☃.C(), Integer.valueOf(☃), ☃.e_() });
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
