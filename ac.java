public class ac
  extends i
{
  public String c()
  {
    return "entitydata";
  }
  
  public int a()
  {
    return 2;
  }
  
  public String c(m ☃)
  {
    return "commands.entitydata.usage";
  }
  
  public void a(m ☃, String[] ☃)
    throws bz
  {
    if (☃.length < 2) {
      throw new cf("commands.entitydata.usage", new Object[0]);
    }
    pk ☃ = b(☃, ☃[0]);
    if ((☃ instanceof wn)) {
      throw new bz("commands.entitydata.noPlayers", new Object[] { ☃.f_() });
    }
    dn ☃ = new dn();
    ☃.e(☃);
    dn ☃ = (dn)☃.b();
    dn ☃;
    try
    {
      ☃ = ed.a(a(☃, ☃, 1).c());
    }
    catch (ec ☃)
    {
      throw new bz("commands.entitydata.tagError", new Object[] { ☃.getMessage() });
    }
    ☃.o("UUIDMost");
    ☃.o("UUIDLeast");
    
    ☃.a(☃);
    if (☃.equals(☃)) {
      throw new bz("commands.entitydata.failed", new Object[] { ☃.toString() });
    }
    ☃.f(☃);
    
    a(☃, this, "commands.entitydata.success", new Object[] { ☃.toString() });
  }
  
  public boolean b(String[] ☃, int ☃)
  {
    return ☃ == 0;
  }
}
