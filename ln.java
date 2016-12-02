import net.minecraft.server.MinecraftServer;

public class ln
  implements jd
{
  private final MinecraftServer a;
  private final ek b;
  
  public ln(MinecraftServer ☃, ek ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public void a(jc ☃)
  {
    switch (ln.1.a[☃.a().ordinal()])
    {
    case 1: 
      b.a(el.d);
      if (☃.b() > 47)
      {
        fa ☃ = new fa("Outdated server! I'm still on 1.8.8");
        b.a(new jj(☃));
        b.a(☃);
      }
      else if (☃.b() < 47)
      {
        fa ☃ = new fa("Outdated client! Please use 1.8.8");
        b.a(new jj(☃));
        b.a(☃);
      }
      else
      {
        b.a(new lo(a, b));
      }
      break;
    case 2: 
      b.a(el.c);
      b.a(new lp(a, b));
      break;
    default: 
      throw new UnsupportedOperationException("Invalid intention " + ☃.a());
    }
  }
  
  public void a(eu ☃) {}
}
