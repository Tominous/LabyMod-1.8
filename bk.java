import com.google.common.collect.Lists;
import java.util.Collection;
import java.util.List;
import net.minecraft.server.MinecraftServer;

public class bk
  extends i
{
  public String c()
  {
    return "stats";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.stats.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.stats.usage", new Object[0]);
    }
    boolean ☃;
    if (☃[0].equals("entity"))
    {
      ☃ = false;
    }
    else
    {
      boolean ☃;
      if (☃[0].equals("block")) {
        ☃ = true;
      } else {
        throw new cf("commands.stats.usage", new Object[0]);
      }
    }
    boolean ☃;
    int ☃;
    int ☃;
    if (☃)
    {
      if (☃.length < 5) {
        throw new cf("commands.stats.block.usage", new Object[0]);
      }
      ☃ = 4;
    }
    else
    {
      if (☃.length < 3) {
        throw new cf("commands.stats.entity.usage", new Object[0]);
      }
      ☃ = 2;
    }
    String ☃ = ☃[(☃++)];
    if ("set".equals(☃))
    {
      if (☃.length < ☃ + 3)
      {
        if (☃ == 5) {
          throw new cf("commands.stats.block.set.usage", new Object[0]);
        }
        throw new cf("commands.stats.entity.set.usage", new Object[0]);
      }
    }
    else if ("clear".equals(☃))
    {
      if (☃.length < ☃ + 1)
      {
        if (☃ == 5) {
          throw new cf("commands.stats.block.clear.usage", new Object[0]);
        }
        throw new cf("commands.stats.entity.clear.usage", new Object[0]);
      }
    }
    else {
      throw new cf("commands.stats.usage", new Object[0]);
    }
    n.a ☃ = n.a.a(☃[(☃++)]);
    if (☃ == null) {
      throw new bz("commands.stats.failed", new Object[0]);
    }
    adm ☃ = ☃.e();
    n ☃;
    n ☃;
    if (☃)
    {
      cj ☃ = a(☃, ☃, 1, false);
      akw ☃ = ☃.s(☃);
      if (☃ == null) {
        throw new bz("commands.stats.noCompatibleBlock", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
      }
      n ☃;
      if ((☃ instanceof akz))
      {
        ☃ = ((akz)☃).c();
      }
      else
      {
        n ☃;
        if ((☃ instanceof aln)) {
          ☃ = ((aln)☃).d();
        } else {
          throw new bz("commands.stats.noCompatibleBlock", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
        }
      }
    }
    else
    {
      pk ☃ = b(☃, ☃[1]);
      ☃ = ☃.aU();
    }
    if ("set".equals(☃))
    {
      String ☃ = ☃[(☃++)];
      String ☃ = ☃[☃];
      if ((☃.length() == 0) || (☃.length() == 0)) {
        throw new bz("commands.stats.failed", new Object[0]);
      }
      n.a(☃, ☃, ☃, ☃);
      a(☃, this, "commands.stats.success", new Object[] { ☃.b(), ☃, ☃ });
    }
    else if ("clear".equals(☃))
    {
      n.a(☃, ☃, null, null);
      a(☃, this, "commands.stats.cleared", new Object[] { ☃.b() });
    }
    if (☃)
    {
      cj ☃ = a(☃, ☃, 1, false);
      akw ☃ = ☃.s(☃);
      ☃.p_();
    }
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, new String[] { "entity", "block" });
    }
    if ((☃.length == 2) && (☃[0].equals("entity"))) {
      return a(☃, d());
    }
    if ((☃.length >= 2) && (☃.length <= 4) && (☃[0].equals("block"))) {
      return a(☃, 1, ☃);
    }
    if (((☃.length == 3) && (☃[0].equals("entity"))) || ((☃.length == 5) && (☃[0].equals("block")))) {
      return a(☃, new String[] { "set", "clear" });
    }
    if (((☃.length == 4) && (☃[0].equals("entity"))) || ((☃.length == 6) && (☃[0].equals("block")))) {
      return a(☃, n.a.c());
    }
    if (((☃.length == 6) && (☃[0].equals("entity"))) || ((☃.length == 8) && (☃[0].equals("block")))) {
      return a(☃, e());
    }
    return null;
  }
  
  protected String[] d()
  {
    return MinecraftServer.N().K();
  }
  
  protected List<String> e()
  {
    Collection<auk> ☃ = MinecraftServer.N().a(0).Z().c();
    List<String> ☃ = Lists.newArrayList();
    for (auk ☃ : ☃) {
      if (!☃.c().b()) {
        ☃.add(☃.b());
      }
    }
    return ☃;
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return (☃.length > 0) && (☃[0].equals("entity")) && (☃ == 1);
  }
}
