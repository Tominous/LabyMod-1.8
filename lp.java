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
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(eu ☃) {}
  
  public void a(jv ☃)
  {
    if (this.d)
    {
      this.c.a(a);
      return;
    }
    this.d = true;
    this.c.a(new jr(this.b.aG()));
  }
  
  public void a(ju ☃)
  {
    this.c.a(new jq(☃.a()));
    this.c.a(a);
  }
}
