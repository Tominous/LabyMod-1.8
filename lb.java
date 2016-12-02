import net.minecraft.server.MinecraftServer;

public class lb
  implements ado
{
  private MinecraftServer a;
  private le b;
  
  public lb(MinecraftServer ☃, le ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(int ☃, boolean ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃) {}
  
  public void a(pk ☃)
  {
    this.b.s().a(☃);
  }
  
  public void b(pk ☃)
  {
    this.b.s().b(☃);
    this.b.Z().a(☃);
  }
  
  public void a(String ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.a.ap().a(☃, ☃, ☃, ☃ > 1.0F ? 16.0F * ☃ : 16.0D, this.b.t.q(), new gs(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(wn ☃, String ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.a.ap().a(☃, ☃, ☃, ☃, ☃ > 1.0F ? 16.0F * ☃ : 16.0D, this.b.t.q(), new gs(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  public void a(cj ☃)
  {
    this.b.t().a(☃);
  }
  
  public void b(cj ☃) {}
  
  public void a(String ☃, cj ☃) {}
  
  public void a(wn ☃, int ☃, cj ☃, int ☃)
  {
    this.a.ap().a(☃, ☃.n(), ☃.o(), ☃.p(), 64.0D, this.b.t.q(), new gq(☃, ☃, ☃, false));
  }
  
  public void a(int ☃, cj ☃, int ☃)
  {
    this.a.ap().a(new gq(☃, ☃, ☃, true));
  }
  
  public void b(int ☃, cj ☃, int ☃)
  {
    for (lf ☃ : this.a.ap().v()) {
      if ((☃ != null) && (☃.o == this.b) && (☃.F() != ☃))
      {
        double ☃ = ☃.n() - ☃.s;
        double ☃ = ☃.o() - ☃.t;
        double ☃ = ☃.p() - ☃.u;
        if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ < 1024.0D) {
          ☃.a.a(new fs(☃, ☃, ☃));
        }
      }
    }
  }
}
