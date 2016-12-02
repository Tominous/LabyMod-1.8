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
    f = ☃;
    m = ☃.ag();
  }
  
  public void a(mq ☃)
  {
    i = bnq.a("achievement.get", new Object[0]);
    j = ☃.e().c();
    l = ave.J();
    k = ☃;
    n = false;
  }
  
  public void b(mq ☃)
  {
    i = ☃.e().c();
    j = ☃.f();
    
    l = (ave.J() + 2500L);
    k = ☃;
    n = true;
  }
  
  private void c()
  {
    bfl.b(0, 0, f.d, f.e);
    bfl.n(5889);
    bfl.D();
    bfl.n(5888);
    bfl.D();
    
    g = f.d;
    h = f.e;
    
    avr ☃ = new avr(f);
    g = ☃.a();
    h = ☃.b();
    
    bfl.m(256);
    bfl.n(5889);
    bfl.D();
    bfl.a(0.0D, g, h, 0.0D, 1000.0D, 3000.0D);
    bfl.n(5888);
    bfl.D();
    bfl.b(0.0F, 0.0F, -2000.0F);
  }
  
  public void a()
  {
    if ((k == null) || (l == 0L) || (Ah == null)) {
      return;
    }
    double ☃ = (ave.J() - l) / 3000.0D;
    if (!n)
    {
      if ((☃ < 0.0D) || (☃ > 1.0D)) {
        l = 0L;
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
    
    int ☃ = g - 160;
    int ☃ = 0 - (int)(☃ * 36.0D);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.w();
    f.P().a(a);
    bfl.f();
    
    b(☃, ☃, 96, 202, 160, 32);
    if (n)
    {
      f.k.a(j, ☃ + 30, ☃ + 7, 120, -1);
    }
    else
    {
      f.k.a(i, ☃ + 30, ☃ + 7, 65280);
      f.k.a(j, ☃ + 30, ☃ + 18, -1);
    }
    avc.c();
    bfl.f();
    bfl.B();
    bfl.g();
    
    bfl.e();
    m.b(k.d, ☃ + 8, ☃ + 8);
    bfl.f();
    
    bfl.a(true);
    bfl.j();
  }
  
  public void b()
  {
    k = null;
    l = 0L;
  }
}
