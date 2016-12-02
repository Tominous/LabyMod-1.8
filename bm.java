import java.util.List;

public class bm
  extends i
{
  public String c()
  {
    return "summon";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.summon.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 1) {
      throw new cf("commands.summon.usage", new Object[0]);
    }
    String ☃ = ☃[0];
    cj ☃ = ☃.c();
    aui ☃ = ☃.d();
    
    double ☃ = ☃.a;
    double ☃ = ☃.b;
    double ☃ = ☃.c;
    if (☃.length >= 4)
    {
      ☃ = b(☃, ☃[1], true);
      ☃ = b(☃, ☃[2], false);
      ☃ = b(☃, ☃[3], true);
      ☃ = new cj(☃, ☃, ☃);
    }
    adm ☃ = ☃.e();
    if (!☃.e(☃)) {
      throw new bz("commands.summon.outOfWorld", new Object[0]);
    }
    if ("LightningBolt".equals(☃))
    {
      ☃.c(new uv(☃, ☃, ☃, ☃));
      a(☃, this, "commands.summon.success", new Object[0]);
      return;
    }
    dn ☃ = new dn();
    boolean ☃ = false;
    if (☃.length >= 5)
    {
      eu ☃ = a(☃, ☃, 4);
      try
      {
        ☃ = ed.a(☃.c());
        ☃ = true;
      }
      catch (ec ☃)
      {
        throw new bz("commands.summon.tagError", new Object[] { ☃.getMessage() });
      }
    }
    ☃.a("id", ☃);
    pk ☃;
    try
    {
      ☃ = pm.a(☃, ☃);
    }
    catch (RuntimeException ☃)
    {
      throw new bz("commands.summon.failed", new Object[0]);
    }
    if (☃ == null) {
      throw new bz("commands.summon.failed", new Object[0]);
    }
    ☃.b(☃, ☃, ☃, ☃.y, ☃.z);
    if (!☃) {
      if ((☃ instanceof ps)) {
        ((ps)☃).a(☃.E(new cj(☃)), null);
      }
    }
    ☃.d(☃);
    
    pk ☃ = ☃;
    dn ☃ = ☃;
    while ((☃ != null) && (☃.b("Riding", 10)))
    {
      pk ☃ = pm.a(☃.m("Riding"), ☃);
      if (☃ != null)
      {
        ☃.b(☃, ☃, ☃, ☃.y, ☃.z);
        ☃.d(☃);
        ☃.a(☃);
      }
      ☃ = ☃;
      ☃ = ☃.m("Riding");
    }
    a(☃, this, "commands.summon.success", new Object[0]);
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if (☃.length == 1) {
      return a(☃, pm.b());
    }
    if ((☃.length > 1) && (☃.length <= 4)) {
      return a(☃, 1, ☃);
    }
    return null;
  }
}
