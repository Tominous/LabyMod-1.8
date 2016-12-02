public class ayd
  extends avp
{
  private static final jy a = new jy("textures/gui/achievement/achievement_background.png");
  private ave f;
  private int g;
  private int h;
  private String i;
  private String j;
  private mq k;
  private long l;
  private bjh m;
  private boolean n;
  
  public ayd(ave ☃)
  {
    this.f = ☃;
    this.m = ☃.ag();
  }
  
  public void a(mq ☃)
  {
    this.i = bnq.a("achievement.get", new Object[0]);
    this.j = ☃.e().c();
    this.l = ave.J();
    this.k = ☃;
    this.n = false;
  }
  
  public void b(mq ☃)
  {
    this.i = ☃.e().c();
    this.j = ☃.f();
    
    this.l = (ave.J() + 2500L);
    this.k = ☃;
    this.n = true;
  }
  
  private void c()
  {
    bfl.b(0, 0, this.f.d, this.f.e);
    bfl.n(5889);
    bfl.D();
    bfl.n(5888);
    bfl.D();
    
    this.g = this.f.d;
    this.h = this.f.e;
    
    avr ☃ = new avr(this.f);
    this.g = ☃.a();
    this.h = ☃.b();
    
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, this.g, this.h, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
  }
  
  public void a()
  {
    if ((this.k == null) || (this.l == 0L) || (ave.A().h == null)) {
      return;
    }
    double ☃ = (ave.J() - this.l) / 3000.0D;
    if (!this.n)
    {
      if ((☃ < 0.0D) || (☃ > 1.0D)) {
        this.l = 0L;
      }
    }
    else if (☃ > 0.5D) {
      ☃ = 0.5D;
    }
    c();
    bfl.i();
    bfl.a(false);
    
    double ☃ = ☃ * 2.0D;
    if (☃ > 1.0D) {
      ☃ = 2.0D - ☃;
    }
    ☃ *= 4.0D;
    ☃ = 1.0D - ☃;
    if (☃ < 0.0D) {
      ☃ = 0.0D;
    }
    ☃ *= ☃;
    ☃ *= ☃;
    
    int ☃ = this.g - 160;
    int ☃ = 0 - (int)(☃ * 36.0D);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.w();
    this.f.P().a(a);
    bfl.f();
    
    b(☃, ☃, 96, 202, 160, 32);
    if (this.n)
    {
      this.f.k.a(this.j, ☃ + 30, ☃ + 7, 120, -1);
    }
    else
    {
      this.f.k.a(this.i, ☃ + 30, ☃ + 7, 65280);
      this.f.k.a(this.j, ☃ + 30, ☃ + 18, -1);
    }
    avc.c();
    bfl.f();
    bfl.B();
    bfl.g();
    
    bfl.e();
    this.m.b(this.k.d, ☃ + 8, ☃ + 8);
    bfl.f();
    
    bfl.a(true);
    bfl.j();
  }
  
  public void b()
  {
    this.k = null;
    this.l = 0L;
  }
}
