import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;
import net.minecraft.server.MinecraftServer;

public class ax
  extends i
{
  private static final Map<String, Integer> a = ;
  
  static
  {
    for (int ☃ = 0; ☃ < 54; ☃++) {
      a.put("slot.container." + ☃, Integer.valueOf(☃));
    }
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a.put("slot.hotbar." + ☃, Integer.valueOf(☃));
    }
    for (int ☃ = 0; ☃ < 27; ☃++) {
      a.put("slot.inventory." + ☃, Integer.valueOf(9 + ☃));
    }
    for (int ☃ = 0; ☃ < 27; ☃++) {
      a.put("slot.enderchest." + ☃, Integer.valueOf(200 + ☃));
    }
    for (int ☃ = 0; ☃ < 8; ☃++) {
      a.put("slot.villager." + ☃, Integer.valueOf(300 + ☃));
    }
    for (int ☃ = 0; ☃ < 15; ☃++) {
      a.put("slot.horse." + ☃, Integer.valueOf(500 + ☃));
    }
    a.put("slot.weapon", Integer.valueOf(99));
    a.put("slot.armor.head", Integer.valueOf(103));
    a.put("slot.armor.chest", Integer.valueOf(102));
    a.put("slot.armor.legs", Integer.valueOf(101));
    a.put("slot.armor.feet", Integer.valueOf(100));
    a.put("slot.horse.saddle", Integer.valueOf(400));
    a.put("slot.horse.armor", Integer.valueOf(401));
    a.put("slot.horse.chest", Integer.valueOf(499));
  }
  
  public String c()
  {
    return "replaceitem";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.replaceitem.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.replaceitem.usage", new Object[0]);
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
        throw new cf("commands.replaceitem.usage", new Object[0]);
      }
    }
    boolean ☃;
    int ☃;
    int ☃;
    if (☃)
    {
      if (☃.length < 6) {
        throw new cf("commands.replaceitem.block.usage", new Object[0]);
      }
      ☃ = 4;
    }
    else
    {
      if (☃.length < 4) {
        throw new cf("commands.replaceitem.entity.usage", new Object[0]);
      }
      ☃ = 2;
    }
    int ☃ = e(☃[(☃++)]);
    try
    {
      ☃ = f(☃, ☃[☃]);
    }
    catch (cb ☃)
    {
      zw ☃;
      if (afh.b(☃[☃]) == afi.a) {
        ☃ = null;
      } else {
        throw ☃;
      }
    }
    zw ☃;
    ☃++;
    
    int ☃ = ☃.length > ☃ ? a(☃[(☃++)], 1, 64) : 1;
    int ☃ = ☃.length > ☃ ? a(☃[(☃++)]) : 0;
    zx ☃ = new zx(☃, ☃, ☃);
    if (☃.length > ☃)
    {
      String ☃ = a(☃, ☃, ☃).c();
      try
      {
        ☃.d(ed.a(☃));
      }
      catch (ec ☃)
      {
        throw new bz("commands.replaceitem.tagError", new Object[] { ☃.getMessage() });
      }
    }
    if (☃.b() == null) {
      ☃ = null;
    }
    if (☃)
    {
      ☃.a(n.a.d, 0);
      cj ☃ = a(☃, ☃, 1, false);
      adm ☃ = ☃.e();
      akw ☃ = ☃.s(☃);
      if ((☃ == null) || (!(☃ instanceof og))) {
        throw new bz("commands.replaceitem.noContainer", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
      }
      og ☃ = (og)☃;
      if ((☃ >= 0) && (☃ < ☃.o_())) {
        ☃.a(☃, ☃);
      }
    }
    else
    {
      pk ☃ = b(☃, ☃[1]);
      ☃.a(n.a.d, 0);
      if ((☃ instanceof wn)) {
        ((wn)☃).bj.b();
      }
      if (!☃.d(☃, ☃)) {
        throw new bz("commands.replaceitem.failed", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), ☃ == null ? "Air" : ☃.C() });
      }
      if ((☃ instanceof wn)) {
        ((wn)☃).bj.b();
      }
    }
    ☃.a(n.a.d, ☃);
    a(☃, this, "commands.replaceitem.success", new Object[] { Integer.valueOf(☃), Integer.valueOf(☃), ☃ == null ? "Air" : ☃.C() });
  }
  
  private int e(String ☃)
    throws bz
  {
    if (!a.containsKey(☃)) {
      throw new bz("commands.generic.parameter.invalid", new Object[] { ☃ });
    }
    return ((Integer)a.get(☃)).intValue();
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
      return a(☃, a.keySet());
    }
    if (((☃.length == 4) && (☃[0].equals("entity"))) || ((☃.length == 6) && (☃[0].equals("block")))) {
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
    return (☃.length > 0) && (☃[0].equals("entity")) && (☃ == 1);
  }
}
