import java.util.List;

public class s
  extends i
{
  public String c()
  {
    return "blockdata";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.blockdata.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 4) {
      throw new cf("commands.blockdata.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    
    adm ☃ = ☃.e();
    if (!☃.e(☃)) {
      throw new bz("commands.blockdata.outOfWorld", new Object[0]);
    }
    akw ☃ = ☃.s(☃);
    if (☃ == null) {
      throw new bz("commands.blockdata.notValid", new Object[0]);
    }
    dn ☃ = new dn();
    ☃.b(☃);
    dn ☃ = (dn)☃.b();
    dn ☃;
    try
    {
      ☃ = ed.a(a(☃, ☃, 3).c());
    }
    catch (ec ☃)
    {
      throw new bz("commands.blockdata.tagError", new Object[] { ☃.getMessage() });
    }
    ☃.a(☃);
    
    ☃.a("x", ☃.n());
    ☃.a("y", ☃.o());
    ☃.a("z", ☃.p());
    if (☃.equals(☃)) {
      throw new bz("commands.blockdata.failed", new Object[] { ☃.toString() });
    }
    ☃.a(☃);
    ☃.p_();
    ☃.h(☃);
    
    ☃.a(n.a.b, 1);
    a(☃, this, "commands.blockdata.success", new Object[] { ☃.toString() });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    return null;
  }
}
