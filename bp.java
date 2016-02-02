import java.util.List;

public class bp
  extends i
{
  public String c()
  {
    return "testforblock";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.testforblock.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 4) {
      throw new cf("commands.testforblock.usage", new Object[0]);
    }
    ☃.a(n.a.b, 0);
    
    cj ☃ = a(☃, ☃, 0, false);
    afh ☃ = afh.b(☃[3]);
    if (☃ == null) {
      throw new cb("commands.setblock.notFound", new Object[] { ☃[3] });
    }
    int ☃ = -1;
    if (☃.length >= 5) {
      ☃ = a(☃[4], -1, 15);
    }
    adm ☃ = ☃.e();
    if (!☃.e(☃)) {
      throw new bz("commands.testforblock.outOfWorld", new Object[0]);
    }
    dn ☃ = new dn();
    boolean ☃ = false;
    if ((☃.length >= 6) && (☃.z()))
    {
      String ☃ = a(☃, ☃, 5).c();
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
    alz ☃ = ☃.p(☃);
    afh ☃ = ☃.c();
    if (☃ != ☃) {
      throw new bz("commands.testforblock.failed.tile", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()), ☃.f(), ☃.f() });
    }
    if (☃ > -1)
    {
      int ☃ = ☃.c().c(☃);
      if (☃ != ☃) {
        throw new bz("commands.testforblock.failed.data", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()), Integer.valueOf(☃), Integer.valueOf(☃) });
      }
    }
    if (☃)
    {
      akw ☃ = ☃.s(☃);
      if (☃ == null) {
        throw new bz("commands.testforblock.failed.tileEntity", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
      }
      dn ☃ = new dn();
      ☃.b(☃);
      if (!dy.a(☃, ☃, true)) {
        throw new bz("commands.testforblock.failed.nbt", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
      }
    }
    ☃.a(n.a.b, 1);
    a(☃, this, "commands.testforblock.success", new Object[] { Integer.valueOf(☃.n()), Integer.valueOf(☃.o()), Integer.valueOf(☃.p()) });
  }
  
  public List<String> a(m ☃, String[] ☃, cj ☃)
  {
    if ((☃.length > 0) && (☃.length <= 3)) {
      return a(☃, 0, ☃);
    }
    if (☃.length == 4) {
      return a(☃, afh.c.c());
    }
    return null;
  }
}
