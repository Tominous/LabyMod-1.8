public class azj
  implements awd.a
{
  private final azh c;
  protected final ave a;
  protected final bpq.a b;
  private long d = 0L;
  
  protected azj(azh ☃, bpq.a ☃)
  {
    this.c = ☃;
    this.b = ☃;
    this.a = ave.A();
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    this.a.k.a(bnq.a("lanServer.title", new Object[0]), ☃ + 32 + 3, ☃ + 1, 16777215);
    this.a.k.a(this.b.a(), ☃ + 32 + 3, ☃ + 12, 8421504);
    if (this.a.t.x) {
      this.a.k.a(bnq.a("selectServer.hiddenAddress", new Object[0]), ☃ + 32 + 3, ☃ + 12 + 11, 3158064);
    } else {
      this.a.k.a(this.b.b(), ☃ + 32 + 3, ☃ + 12 + 11, 3158064);
    }
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.c.b(☃);
    if (ave.J() - this.d < 250L) {
      this.c.f();
    }
    this.d = ave.J();
    return false;
  }
  
  public void a(int ☃, int ☃, int ☃) {}
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃) {}
  
  public bpq.a a()
  {
    return this.b;
  }
}
