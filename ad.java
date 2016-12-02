import java.util.List;
import net.minecraft.server.MinecraftServer;

public class ad
  extends i
{
  public String c()
  {
    return "execute";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.execute.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 5) {
      throw new cf("commands.execute.usage", new Object[0]);
    }
    final pk ☃ = a(☃, ☃[0], pk.class);
    final double ☃ = b(☃.s, ☃[1], false);
    double ☃ = b(☃.t, ☃[2], false);
    final double ☃ = b(☃.u, ☃[3], false);
    final cj ☃ = new cj(☃, ☃, ☃);
    
    int ☃ = 4;
    if (("detect".equals(☃[4])) && (☃.length > 10))
    {
      adm ☃ = ☃.e();
      double ☃ = b(☃, ☃[5], false);
      double ☃ = b(☃, ☃[6], false);
      double ☃ = b(☃, ☃[7], false);
      afh ☃ = g(☃, ☃[8]);
      int ☃ = a(☃[9], -1, 15);
      cj ☃ = new cj(☃, ☃, ☃);
      alz ☃ = ☃.p(☃);
      if ((☃.c() != ☃) || ((☃ >= 0) && (☃.c().c(☃) != ☃))) {
        throw new bz("commands.execute.failed", new Object[] { "detect", ☃.e_() });
      }
      ☃ = 10;
    }
    String ☃ = a(☃, ☃);
    final m ☃ = ☃;
    m ☃ = new m()
    {
      public String e_()
      {
        return ☃.e_();
      }
      
      public eu f_()
      {
        return ☃.f_();
      }
      
      public void a(eu ☃)
      {
        ☃.a(☃);
      }
      
      public boolean a(int ☃, String ☃)
      {
        return ☃.a(☃, ☃);
      }
      
      public cj c()
      {
        return ☃;
      }
      
      public aui d()
      {
        return new aui(☃, ☃, this.f);
      }
      
      public adm e()
      {
        return ☃.o;
      }
      
      public pk f()
      {
        return ☃;
      }
      
      public boolean u_()
      {
        MinecraftServer ☃ = MinecraftServer.N();
        return (☃ == null) || (☃.d[0].Q().b("commandBlockOutput"));
      }
      
      public void a(n.a ☃, int ☃)
      {
        ☃.a(☃, ☃);
      }
    };
    l ☃ = MinecraftServer.N().P();
    try
    {
      int ☃ = ☃.a(☃, ☃);
      if (☃ < 1) {
        throw new bz("commands.execute.allInvocationsFailed", new Object[] { ☃ });
      }
    }
    catch (Throwable ☃)
    {
      throw new bz("commands.execute.failed", new Object[] { ☃, ☃.e_() });
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
    if ((☃.length > 5) && (☃.length <= 8) && ("detect".equals(☃[4]))) {
      return a(☃, 5, ☃);
    }
    if ((☃.length == 9) && ("detect".equals(☃[4]))) {
      return a(☃, afh.c.c());
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
