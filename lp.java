import net.minecraft.server.MinecraftServer;

public class lp
  implements jt
{
  private static final eu a = new fa("Status request has been handled.");
  private final MinecraftServer b;
  private final ek c;
  private boolean d;
  
  public lp(MinecraftServer ☃, ek ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public void a(eu ☃) {}
  
  public void a(jv ☃)
  {
    if (d)
    {
      c.a(a);
      return;
    }
    d = true;
    c.a(new jr(b.aG()));
  }
  
  public void a(ju ☃)
  {
    c.a(new jq(☃.a()));
    c.a(a);
  }
}
