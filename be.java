import java.util.List;

public class be
  extends i
{
  public String c()
  {
    return "setblock";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.setblock.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 4) {
      throw new cf("commands.setblock.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    afh ☃ = i.g(☃, ☃[3]);
    
    int ☃ = 0;
    if (☃.length >= 5) {
      ☃ = a(☃[4], 0, 15);
    }
    adm ☃ = ☃.e();
    if (!☃.e(☃)) {
      throw new bz("commands.setblock.outOfWorld", new Object[0]);
    }
    dn ☃ = new dn();
    boolean ☃ = false;
    if ((☃.length >= 7) && (☃.z()))
    {
      String ☃ = a(☃, ☃, 6).c();
      try
      {
        ☃ = ed.a(☃);
        ☃ = true;
      }
      catch (ec ☃)
      {
        throw new bz("commands.setblock.tagError", new Object[] { ☃.getMessage() });
      }
    }
    if (☃.length >= 6) {
      if (☃[5].equals("destroy"))
      {
        ☃.b(☃, true);
        if (☃ == afi.a) {
          a(☃, this, "commands.setblock.success", new Object[0]);
        }
      }
      else if ((☃[5].equals("keep")) && 
        (!☃.d(☃)))
      {
        throw new bz("commands.setblock.noChange", new Object[0]);
      }
    }
    akw ☃ = ☃.s(☃);
    if (☃ != null)
    {
      if ((☃ instanceof og)) {
        ((og)☃).l();
      }
      ☃.a(☃, afi.a.Q(), ☃ == afi.a ? 2 : 4);
    }
    alz ☃ = ☃.a(☃);
    if (!☃.a(☃, ☃, 2)) {
      throw new bz("commands.setblock.noChange", new Object[0]);
    }
    if (☃)
    {
      akw ☃ = ☃.s(☃);
      if (☃ != null)
      {
        ☃.a("x", ☃.n());
        ☃.a("y", ☃.o());
        ☃.a("z", ☃.p());
        
        ☃.a(☃);
      }
    }
    ☃.b(☃, ☃.c());
    ☃.a(n.a.b, 1);
    a(☃, this, "commands.setblock.success", new Object[0]);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    if (☃.length == 4) {
      return a(☃, afh.c.c());
    }
    if (☃.length == 6) {
      return a(☃, new String[] { "replace", "destroy", "keep" });
    }
    return null;
  }
}
