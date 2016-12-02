import net.minecraft.server.MinecraftServer;

class ad$1
  implements m
{
  ad$1(ad paramad, pk parampk, m paramm, cj paramcj, double paramDouble1, double paramDouble2, double paramDouble3) {}
  
  public String e_()
  {
    return this.a.e_();
  }
  
  public eu f_()
  {
    return this.a.f_();
  }
  
  public void a(eu ☃)
  {
    this.b.a(☃);
  }
  
  public boolean a(int ☃, String ☃)
  {
    return this.b.a(☃, ☃);
  }
  
  public cj c()
  {
    return this.c;
  }
  
  public aui d()
  {
    return new aui(this.d, this.e, this.f);
  }
  
  public adm e()
  {
    return this.a.o;
  }
  
  public pk f()
  {
    return this.a;
  }
  
  public boolean u_()
  {
    MinecraftServer ☃ = MinecraftServer.N();
    return (☃ == null) || (☃.d[0].Q().b("commandBlockOutput"));
  }
  
  public void a(n.a ☃, int ☃)
  {
    this.a.a(☃, ☃);
  }
}
