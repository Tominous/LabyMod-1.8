public class awm
  extends avp
  implements bai
{
  private static final jy f = new jy("textures/gui/widgets.png");
  public static final jy a = new jy("textures/gui/spectator_widgets.png");
  private final ave g;
  private long h;
  private baf i;
  
  public awm(ave ☃)
  {
    this.g = ☃;
  }
  
  public void a(int ☃)
  {
    this.h = ave.J();
    if (this.i != null) {
      this.i.b(☃);
    } else {
      this.i = new baf(this);
    }
  }
  
  private float c()
  {
    long ☃ = this.h - ave.J() + 5000L;
    return ns.a((float)☃ / 2000.0F, 0.0F, 1.0F);
  }
  
  public void a(avr ☃, float ☃)
  {
    if (this.i == null) {
      return;
    }
    float ☃ = c();
    if (☃ <= 0.0F)
    {
      this.i.d();
      return;
    }
    int ☃ = ☃.a() / 2;
    float ☃ = this.e;
    this.e = -90.0F;
    float ☃ = ☃.b() - 22.0F * ☃;
    
    baj ☃ = this.i.f();
    
    a(☃, ☃, ☃, ☃, ☃);
    
    this.e = ☃;
  }
  
  protected void a(avr ☃, float ☃, int ☃, float ☃, baj ☃)
  {
    bfl.B();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    bfl.c(1.0F, 1.0F, 1.0F, ☃);
    this.g.P().a(f);
    a(☃ - 91, ☃, 0, 0, 182, 22);
    if (☃.b() >= 0) {
      a(☃ - 91 - 1 + ☃.b() * 20, ☃ - 1.0F, 0, 22, 24, 22);
    }
    avc.c();
    for (int ☃ = 0; ☃ < 9; ☃++) {
      a(☃, ☃.a() / 2 - 90 + ☃ * 20 + 2, ☃ + 3.0F, ☃, ☃.a(☃));
    }
    avc.a();
    bfl.C();
    bfl.k();
  }
  
  private void a(int ☃, int ☃, float ☃, float ☃, bah ☃)
  {
    this.g.P().a(a);
    if (☃ != baf.a)
    {
      int ☃ = (int)(☃ * 255.0F);
      
      bfl.E();
      bfl.b(☃, ☃, 0.0F);
      float ☃ = ☃.B_() ? 1.0F : 0.25F;
      bfl.c(☃, ☃, ☃, ☃);
      ☃.a(☃, ☃);
      bfl.F();
      
      String ☃ = String.valueOf(avh.c(this.g.t.av[☃].i()));
      if ((☃ > 3) && (☃.B_())) {
        this.g.k.a(☃, ☃ + 19 - 2 - this.g.k.a(☃), ☃ + 6.0F + 3.0F, 16777215 + (☃ << 24));
      }
    }
  }
  
  public void a(avr ☃)
  {
    int ☃ = (int)(c() * 255.0F);
    if ((☃ > 3) && (this.i != null))
    {
      bah ☃ = this.i.b();
      String ☃ = ☃ != baf.a ? ☃.A_().d() : this.i.c().b().d();
      if (☃ != null)
      {
        int ☃ = (☃.a() - this.g.k.a(☃)) / 2;
        int ☃ = ☃.b() - 35;
        
        bfl.E();
        bfl.l();
        bfl.a(770, 771, 1, 0);
        this.g.k.a(☃, ☃, ☃, 16777215 + (☃ << 24));
        bfl.k();
        bfl.F();
      }
    }
  }
  
  public void a(baf ☃)
  {
    this.i = null;
    this.h = 0L;
  }
  
  public boolean a()
  {
    return this.i != null;
  }
  
  public void b(int ☃)
  {
    int ☃ = this.i.e() + ☃;
    while ((☃ >= 0) && (☃ <= 8) && ((this.i.a(☃) == baf.a) || (!this.i.a(☃).B_()))) {
      ☃ += ☃;
    }
    if ((☃ >= 0) && (☃ <= 8))
    {
      this.i.b(☃);
      this.h = ave.J();
    }
  }
  
  public void b()
  {
    this.h = ave.J();
    if (a())
    {
      int ☃ = this.i.e();
      if (☃ != -1) {
        this.i.b(☃);
      }
    }
    else
    {
      this.i = new baf(this);
    }
  }
}
