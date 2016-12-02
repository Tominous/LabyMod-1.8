import net.minecraft.server.MinecraftServer;

public class lb
  implements ado
{
  private MinecraftServer a;
  private le b;
  
  public lb(MinecraftServer ☃, le ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public void a(int ☃, boolean ☃, double ☃, double ☃, double ☃, double ☃, double ☃, double ☃, int... ☃) {}
  
  public void a(pk ☃)
  {
    b.s().a(☃);
  }
  
  public void b(pk ☃)
  {
    b.s().b(☃);
    b.Z().a(☃);
  }
  
  public void a(String ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    a.ap().a(☃, ☃, ☃, ☃ > 1.0F ? 16.0F * ☃ : 16.0D, b.t.q(), new gs(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(wn ☃, String ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    a.ap().a(☃, ☃, ☃, ☃, ☃ > 1.0F ? 16.0F * ☃ : 16.0D, b.t.q(), new gs(☃, ☃, ☃, ☃, ☃, ☃));
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  public void a(cj ☃)
  {
    b.t().a(☃);
  }
  
  public void b(cj ☃) {}
  
  public void a(String ☃, cj ☃) {}
  
  public void a(wn ☃, int ☃, cj ☃, int ☃)
  {
    a.ap().a(☃, ☃.n(), ☃.o(), ☃.p(), 64.0D, b.t.q(), new gq(☃, ☃, ☃, false));
  }
  
  public void a(int ☃, cj ☃, int ☃)
  {
    a.ap().a(new gq(☃, ☃, ☃, true));
  }
  
  public void b(int ☃, cj ☃, int ☃)
  {
    for (lf ☃ : a.ap().v()) {
      if ((☃ != null) && (o == b) && (☃.F() != ☃))
      {
        double ☃ = ☃.n() - s;
        double ☃ = ☃.o() - t;
        double ☃ = ☃.p() - u;
        if (☃ * ☃ + ☃ * ☃ + ☃ * ☃ < 1024.0D) {
          a.a(new fs(☃, ☃, ☃));
        }
      }
    }
  }
}
