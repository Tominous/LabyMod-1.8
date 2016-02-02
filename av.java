import java.util.List;
import net.minecraft.server.MinecraftServer;

public class av
  extends i
{
  public String c()
  {
    return "playsound";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.playsound.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf(c(☃), new Object[0]);
    }
    int ☃ = 0;
    String ☃ = ☃[(☃++)];
    lf ☃ = a(☃, ☃[(☃++)]);
    
    aui ☃ = ☃.d();
    
    double ☃ = ☃.a;
    if (☃.length > ☃) {
      ☃ = b(☃, ☃[(☃++)], true);
    }
    double ☃ = ☃.b;
    if (☃.length > ☃) {
      ☃ = b(☃, ☃[(☃++)], 0, 0, false);
    }
    double ☃ = ☃.c;
    if (☃.length > ☃) {
      ☃ = b(☃, ☃[(☃++)], true);
    }
    double ☃ = 1.0D;
    if (☃.length > ☃) {
      ☃ = a(☃[(☃++)], 0.0D, 3.4028234663852886E38D);
    }
    double ☃ = 1.0D;
    if (☃.length > ☃) {
      ☃ = a(☃[(☃++)], 0.0D, 2.0D);
    }
    double ☃ = 0.0D;
    if (☃.length > ☃) {
      ☃ = a(☃[☃], 0.0D, 1.0D);
    }
    double ☃ = ☃ > 1.0D ? ☃ * 16.0D : 16.0D;
    double ☃ = ☃.f(☃, ☃, ☃);
    if (☃ > ☃)
    {
      if (☃ <= 0.0D) {
        throw new bz("commands.playsound.playerTooFar", new Object[] { ☃.e_() });
      }
      double ☃ = ☃ - ☃.s;
      double ☃ = ☃ - ☃.t;
      double ☃ = ☃ - ☃.u;
      double ☃ = Math.sqrt(☃ * ☃ + ☃ * ☃ + ☃ * ☃);
      if (☃ > 0.0D)
      {
        ☃ = ☃.s + ☃ / ☃ * 2.0D;
        ☃ = ☃.t + ☃ / ☃ * 2.0D;
        ☃ = ☃.u + ☃ / ☃ * 2.0D;
      }
      ☃ = ☃;
    }
    ☃.a.a(new gs(☃, ☃, ☃, ☃, (float)☃, (float)☃));
    a(☃, this, "commands.playsound.success", new Object[] { ☃, ☃.e_() });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 2) {
      return a(☃, MinecraftServer.N().K());
    }
    if ((☃.length > 2) && (☃.length <= 5)) {
      return a(☃, 2, ☃);
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 1;
  }
}
