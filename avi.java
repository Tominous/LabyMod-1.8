public class avi
  implements nu
{
  private String a = "";
  private ave b;
  private String c = "";
  private long d = ave.J();
  private boolean e;
  private avr f;
  private bfw g;
  
  public avi(ave ☃)
  {
    this.b = ☃;
    this.f = new avr(☃);
    this.g = new bfw(☃.d, ☃.e, false);
    this.g.a(9728);
  }
  
  public void b(String ☃)
  {
    this.e = false;
    d(☃);
  }
  
  public void a(String ☃)
  {
    this.e = true;
    d(☃);
  }
  
  private void d(String ☃)
  {
    this.c = ☃;
    if (!this.b.B)
    {
      if (this.e) {
        return;
      }
      throw new avk();
    }
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    if (bqs.i())
    {
      int ☃ = this.f.e();
      bfl.a(0.0D, this.f.a() * ☃, this.f.b() * ☃, 0.0D, 100.0D, 300.0D);
    }
    else
    {
      avr ☃ = new avr(this.b);
      bfl.a(0.0D, ☃.c(), ☃.d(), 0.0D, 100.0D, 300.0D);
    }
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -200.0F);
  }
  
  public void c(String ☃)
  {
    if (!this.b.B)
    {
      if (this.e) {
        return;
      }
      throw new avk();
    }
    this.d = 0L;
    this.a = ☃;
    a(-1);
    this.d = 0L;
  }
  
  public void a(int ☃)
  {
    if (!this.b.B)
    {
      if (this.e) {
        return;
      }
      throw new avk();
    }
    long ☃ = ave.J();
    if (☃ - this.d < 100L) {
      return;
    }
    this.d = ☃;
    
    avr ☃ = new avr(this.b);
    int ☃ = ☃.e();
    int ☃ = ☃.a();
    int ☃ = ☃.b();
    if (bqs.i()) {
      this.g.f();
    } else {
      bfl.m(256);
    }
    this.g.a(false);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, ☃.c(), ☃.d(), 0.0D, 100.0D, 300.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -200.0F);
    if (!bqs.i()) {
      bfl.m(16640);
    }
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    this.b.P().a(avp.b);
    float ☃ = 32.0F;
    ☃.a(7, bms.i);
    ☃.b(0.0D, ☃, 0.0D).a(0.0D, ☃ / ☃).b(64, 64, 64, 255).d();
    ☃.b(☃, ☃, 0.0D).a(☃ / ☃, ☃ / ☃).b(64, 64, 64, 255).d();
    ☃.b(☃, 0.0D, 0.0D).a(☃ / ☃, 0.0D).b(64, 64, 64, 255).d();
    ☃.b(0.0D, 0.0D, 0.0D).a(0.0D, 0.0D).b(64, 64, 64, 255).d();
    ☃.b();
    if (☃ >= 0)
    {
      int ☃ = 100;
      int ☃ = 2;
      int ☃ = ☃ / 2 - ☃ / 2;
      int ☃ = ☃ / 2 + 16;
      
      bfl.x();
      ☃.a(7, bms.f);
      ☃.b(☃, ☃, 0.0D).b(128, 128, 128, 255).d();
      ☃.b(☃, ☃ + ☃, 0.0D).b(128, 128, 128, 255).d();
      ☃.b(☃ + ☃, ☃ + ☃, 0.0D).b(128, 128, 128, 255).d();
      ☃.b(☃ + ☃, ☃, 0.0D).b(128, 128, 128, 255).d();
      
      ☃.b(☃, ☃, 0.0D).b(128, 255, 128, 255).d();
      ☃.b(☃, ☃ + ☃, 0.0D).b(128, 255, 128, 255).d();
      ☃.b(☃ + ☃, ☃ + ☃, 0.0D).b(128, 255, 128, 255).d();
      ☃.b(☃ + ☃, ☃, 0.0D).b(128, 255, 128, 255).d();
      ☃.b();
      bfl.w();
    }
    bfl.l();
    bfl.a(770, 771, 1, 0);
    this.b.k.a(this.c, (☃ - this.b.k.a(this.c)) / 2, ☃ / 2 - 4 - 16, 16777215);
    this.b.k.a(this.a, (☃ - this.b.k.a(this.a)) / 2, ☃ / 2 - 4 + 8, 16777215);
    this.g.e();
    if (bqs.i()) {
      this.g.c(☃ * ☃, ☃ * ☃);
    }
    this.b.h();
    try
    {
      Thread.yield();
    }
    catch (Exception localException) {}
  }
  
  public void a() {}
}
