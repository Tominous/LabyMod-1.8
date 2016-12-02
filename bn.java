import java.util.EnumSet;
import java.util.List;
import java.util.Set;
import net.minecraft.server.MinecraftServer;

public class bn
  extends i
{
  public String c()
  {
    return "tp";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.tp.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.tp.usage", new Object[0]);
    }
    int ☃ = 0;
    pk ☃;
    if ((☃.length == 2) || (☃.length == 4) || (☃.length == 6))
    {
      pk ☃ = b(☃, ☃[0]);
      ☃ = 1;
    }
    else
    {
      ☃ = b(☃);
    }
    if ((☃.length == 1) || (☃.length == 2))
    {
      pk ☃ = b(☃, ☃[(☃.length - 1)]);
      if (☃.o != ☃.o) {
        throw new bz("commands.tp.notSameDimension", new Object[0]);
      }
      ☃.a(null);
      if ((☃ instanceof lf)) {
        ((lf)☃).a.a(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
      } else {
        ☃.b(☃.s, ☃.t, ☃.u, ☃.y, ☃.z);
      }
      a(☃, this, "commands.tp.success", new Object[] { ☃.e_(), ☃.e_() });
      return;
    }
    if (☃.length < ☃ + 3) {
      throw new cf("commands.tp.usage", new Object[0]);
    }
    if (☃.o == null) {
      return;
    }
    int ☃ = ☃;
    i.a ☃ = a(☃.s, ☃[(☃++)], true);
    i.a ☃ = a(☃.t, ☃[(☃++)], 0, 0, false);
    i.a ☃ = a(☃.u, ☃[(☃++)], true);
    i.a ☃ = a(☃.y, ☃.length > ☃ ? ☃[(☃++)] : "~", false);
    i.a ☃ = a(☃.z, ☃.length > ☃ ? ☃[☃] : "~", false);
    if ((☃ instanceof lf))
    {
      Set<fi.a> ☃ = EnumSet.noneOf(fi.a.class);
      if (☃.c()) {
        ☃.add(fi.a.a);
      }
      if (☃.c()) {
        ☃.add(fi.a.b);
      }
      if (☃.c()) {
        ☃.add(fi.a.c);
      }
      if (☃.c()) {
        ☃.add(fi.a.e);
      }
      if (☃.c()) {
        ☃.add(fi.a.d);
      }
      float ☃ = (float)☃.b();
      if (!☃.c()) {
        ☃ = ns.g(☃);
      }
      float ☃ = (float)☃.b();
      if (!☃.c()) {
        ☃ = ns.g(☃);
      }
      if ((☃ > 90.0F) || (☃ < -90.0F))
      {
        ☃ = ns.g(180.0F - ☃);
        ☃ = ns.g(☃ + 180.0F);
      }
      ☃.a(null);
      ((lf)☃).a.a(☃.b(), ☃.b(), ☃.b(), ☃, ☃, ☃);
      ☃.f(☃);
    }
    else
    {
      float ☃ = (float)ns.g(☃.a());
      float ☃ = (float)ns.g(☃.a());
      if ((☃ > 90.0F) || (☃ < -90.0F))
      {
        ☃ = ns.g(180.0F - ☃);
        ☃ = ns.g(☃ + 180.0F);
      }
      ☃.b(☃.a(), ☃.a(), ☃.a(), ☃, ☃);
      ☃.f(☃);
    }
    a(☃, this, "commands.tp.success.coordinates", new Object[] { ☃.e_(), Double.valueOf(☃.a()), Double.valueOf(☃.a()), Double.valueOf(☃.a()) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length == 1) || (☃.length == 2)) {
      return a(☃, MinecraftServer.N().K());
    }
    return null;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
