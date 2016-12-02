public class azj
  implements awd.a
{
  private final azh c;
  protected final ave a;
  protected final bpq.a b;
  private long d = 0L;
  
  protected azj(azh ☃, bpq.a ☃)
  {
    c = ☃;
    b = ☃;
    a = ave.A();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    a.k.a(bnq.a("lanServer.title", new Object[0]), ☃ + 32 + 3, ☃ + 1, 16777215);
    a.k.a(b.a(), ☃ + 32 + 3, ☃ + 12, 8421504);
    if (a.t.x) {
      a.k.a(bnq.a("selectServer.hiddenAddress", new Object[0]), ☃ + 32 + 3, ☃ + 12 + 11, 3158064);
    } else {
      a.k.a(b.b(), ☃ + 32 + 3, ☃ + 12 + 11, 3158064);
    }
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    c.b(☃);
    if (ave.J() - d < 250L) {
      c.f();
    }
    d = ave.J();
    return false;
  }
  
  public void a(int ☃, int ☃, int ☃) {}
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  public bpq.a a()
  {
    return b;
  }
}
