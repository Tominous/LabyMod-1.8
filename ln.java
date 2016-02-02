import net.minecraft.server.MinecraftServer;

public class ln
  implements jd
{
  private final MinecraftServer a;
  private final ek b;
  
  public ln(MinecraftServer ☃, ek ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(jc ☃)
  {
    switch (ln.1.a[☃.a().ordinal()])
    {
    case 1: 
      this.b.a(el.d);
      if (☃.b() > 47)
      {
        fa ☃ = new fa("Outdated server! I'm still on 1.8.8");
        this.b.a(new jj(☃));
        this.b.a(☃);
      }
      else if (☃.b() < 47)
      {
        fa ☃ = new fa("Outdated client! Please use 1.8.8");
        this.b.a(new jj(☃));
        this.b.a(☃);
      }
      else
      {
        this.b.a(new lo(this.a, this.b));
      }
      break;
    case 2: 
      this.b.a(el.c);
      this.b.a(new lp(this.a, this.b));
      break;
    default: 
      throw new UnsupportedOperationException("Invalid intention " + ☃.a());
    }
  }
  
  public void a(eu ☃) {}
}
