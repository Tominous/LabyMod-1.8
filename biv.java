import org.lwjgl.opengl.GL11;

public abstract class biv<T extends pk>
{
  private static final jy a = new jy("textures/misc/shadow.png");
  protected final biu b;
  protected float c;
  protected float d = 1.0F;
  
  protected biv(biu ☃)
  {
    this.b = ☃;
  }
  
  public boolean a(T ☃, bia ☃, double ☃, double ☃, double ☃)
  {
    aug ☃ = ☃.aR();
    if ((☃.b()) || (☃.a() == 0.0D)) {
      ☃ = new aug(☃.s - 2.0D, ☃.t - 2.0D, ☃.u - 2.0D, ☃.s + 2.0D, ☃.t + 2.0D, ☃.u + 2.0D);
    }
    return (☃.h(☃, ☃, ☃)) && ((☃.ah) || (☃.a(☃)));
  }
  
  public void a(T ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    a(☃, ☃, ☃, ☃);
  }
  
  protected void a(T ☃, double ☃, double ☃, double ☃)
  {
    if (!b(☃)) {
      return;
    }
    a(☃, ☃.f_().d(), ☃, ☃, ☃, 64);
  }
  
  protected boolean b(T ☃)
  {
    return (☃.aO()) && (☃.l_());
  }
  
  protected void a(T ☃, double ☃, double ☃, double ☃, String ☃, float ☃, double ☃)
  {
    a(☃, ☃, ☃, ☃, ☃, 64);
  }
  
  protected abstract jy a(T paramT);
  
  protected boolean c(T ☃)
  {
    jy ☃ = a(☃);
    if (☃ == null) {
      return false;
    }
    a(☃);
    return true;
  }
  
  public void a(jy ☃)
  {
    this.b.a.a(☃);
  }
  
  private void a(pk ☃, double ☃, double ☃, double ☃, float ☃)
  {
    bfl.f();
    
    bmh ☃ = ave.A().T();
    bmi ☃ = ☃.a("minecraft:blocks/fire_layer_0");
    bmi ☃ = ☃.a("minecraft:blocks/fire_layer_1");
    
    bfl.E();
    bfl.b((float)☃, (float)☃, (float)☃);
    
    float ☃ = ☃.J * 1.4F;
    bfl.a(☃, ☃, ☃);
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    float ☃ = 0.5F;
    float ☃ = 0.0F;
    
    float ☃ = ☃.K / ☃;
    float ☃ = (float)(☃.t - ☃.aR().b);
    
    bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(0.0F, 0.0F, -0.3F + (int)☃ * 0.02F);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    float ☃ = 0.0F;
    int ☃ = 0;
    ☃.a(7, bms.g);
    while (☃ > 0.0F)
    {
      bmi ☃ = ☃ % 2 == 0 ? ☃ : ☃;
      
      a(bmh.g);
      
      float ☃ = ☃.e();
      float ☃ = ☃.g();
      float ☃ = ☃.f();
      float ☃ = ☃.h();
      if (☃ / 2 % 2 == 0)
      {
        float ☃ = ☃;
        ☃ = ☃;
        ☃ = ☃;
      }
      ☃.b(☃ - ☃, 0.0F - ☃, ☃).a(☃, ☃).d();
      ☃.b(-☃ - ☃, 0.0F - ☃, ☃).a(☃, ☃).d();
      ☃.b(-☃ - ☃, 1.4F - ☃, ☃).a(☃, ☃).d();
      ☃.b(☃ - ☃, 1.4F - ☃, ☃).a(☃, ☃).d();
      ☃ -= 0.45F;
      ☃ -= 0.45F;
      ☃ *= 0.9F;
      ☃ += 0.03F;
      ☃++;
    }
    ☃.b();
    bfl.F();
    bfl.e();
  }
  
  private void c(pk ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.l();
    bfl.b(770, 771);
    
    this.b.a.a(a);
    
    adm ☃ = a();
    
    bfl.a(false);
    float ☃ = this.c;
    if ((☃ instanceof ps))
    {
      ps ☃ = (ps)☃;
      ☃ *= ☃.bT();
      if (☃.j_()) {
        ☃ *= 0.5F;
      }
    }
    double ☃ = ☃.P + (☃.s - ☃.P) * ☃;
    double ☃ = ☃.Q + (☃.t - ☃.Q) * ☃;
    double ☃ = ☃.R + (☃.u - ☃.R) * ☃;
    
    int ☃ = ns.c(☃ - ☃);
    int ☃ = ns.c(☃ + ☃);
    int ☃ = ns.c(☃ - ☃);
    int ☃ = ns.c(☃);
    int ☃ = ns.c(☃ - ☃);
    int ☃ = ns.c(☃ + ☃);
    
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    double ☃ = ☃ - ☃;
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.i);
    for (cj ☃ : cj.b(new cj(☃, ☃, ☃), new cj(☃, ☃, ☃)))
    {
      afh ☃ = ☃.p(☃.b()).c();
      if ((☃.b() != -1) && (☃.l(☃) > 3)) {
        a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃);
      }
    }
    ☃.b();
    
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.k();
    bfl.a(true);
  }
  
  private adm a()
  {
    return this.b.b;
  }
  
  private void a(afh ☃, double ☃, double ☃, double ☃, cj ☃, float ☃, float ☃, double ☃, double ☃, double ☃)
  {
    if (!☃.d()) {
      return;
    }
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    double ☃ = (☃ - (☃ - (☃.o() + ☃)) / 2.0D) * 0.5D * a().o(☃);
    if (☃ < 0.0D) {
      return;
    }
    if (☃ > 1.0D) {
      ☃ = 1.0D;
    }
    double ☃ = ☃.n() + ☃.B() + ☃;
    double ☃ = ☃.n() + ☃.C() + ☃;
    double ☃ = ☃.o() + ☃.D() + ☃ + 0.015625D;
    double ☃ = ☃.p() + ☃.F() + ☃;
    double ☃ = ☃.p() + ☃.G() + ☃;
    
    float ☃ = (float)((☃ - ☃) / 2.0D / ☃ + 0.5D);
    float ☃ = (float)((☃ - ☃) / 2.0D / ☃ + 0.5D);
    float ☃ = (float)((☃ - ☃) / 2.0D / ☃ + 0.5D);
    float ☃ = (float)((☃ - ☃) / 2.0D / ☃ + 0.5D);
    
    ☃.b(☃, ☃, ☃).a(☃, ☃).a(1.0F, 1.0F, 1.0F, (float)☃).d();
    ☃.b(☃, ☃, ☃).a(☃, ☃).a(1.0F, 1.0F, 1.0F, (float)☃).d();
    ☃.b(☃, ☃, ☃).a(☃, ☃).a(1.0F, 1.0F, 1.0F, (float)☃).d();
    ☃.b(☃, ☃, ☃).a(☃, ☃).a(1.0F, 1.0F, 1.0F, (float)☃).d();
  }
  
  public static void a(aug ☃, double ☃, double ☃, double ☃)
  {
    bfl.x();
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    
    ☃.c(☃, ☃, ☃);
    
    ☃.a(7, bms.h);
    ☃.b(☃.a, ☃.e, ☃.c).c(0.0F, 0.0F, -1.0F).d();
    ☃.b(☃.d, ☃.e, ☃.c).c(0.0F, 0.0F, -1.0F).d();
    ☃.b(☃.d, ☃.b, ☃.c).c(0.0F, 0.0F, -1.0F).d();
    ☃.b(☃.a, ☃.b, ☃.c).c(0.0F, 0.0F, -1.0F).d();
    
    ☃.b(☃.a, ☃.b, ☃.f).c(0.0F, 0.0F, 1.0F).d();
    ☃.b(☃.d, ☃.b, ☃.f).c(0.0F, 0.0F, 1.0F).d();
    ☃.b(☃.d, ☃.e, ☃.f).c(0.0F, 0.0F, 1.0F).d();
    ☃.b(☃.a, ☃.e, ☃.f).c(0.0F, 0.0F, 1.0F).d();
    
    ☃.b(☃.a, ☃.b, ☃.c).c(0.0F, -1.0F, 0.0F).d();
    ☃.b(☃.d, ☃.b, ☃.c).c(0.0F, -1.0F, 0.0F).d();
    ☃.b(☃.d, ☃.b, ☃.f).c(0.0F, -1.0F, 0.0F).d();
    ☃.b(☃.a, ☃.b, ☃.f).c(0.0F, -1.0F, 0.0F).d();
    
    ☃.b(☃.a, ☃.e, ☃.f).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃.d, ☃.e, ☃.f).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃.d, ☃.e, ☃.c).c(0.0F, 1.0F, 0.0F).d();
    ☃.b(☃.a, ☃.e, ☃.c).c(0.0F, 1.0F, 0.0F).d();
    
    ☃.b(☃.a, ☃.b, ☃.f).c(-1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.a, ☃.e, ☃.f).c(-1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.a, ☃.e, ☃.c).c(-1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.a, ☃.b, ☃.c).c(-1.0F, 0.0F, 0.0F).d();
    
    ☃.b(☃.d, ☃.b, ☃.c).c(1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.d, ☃.e, ☃.c).c(1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.d, ☃.e, ☃.f).c(1.0F, 0.0F, 0.0F).d();
    ☃.b(☃.d, ☃.b, ☃.f).c(1.0F, 0.0F, 0.0F).d();
    ☃.b();
    
    ☃.c(0.0D, 0.0D, 0.0D);
    
    bfl.w();
  }
  
  public void b(pk ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    if (this.b.g == null) {
      return;
    }
    if ((this.b.g.W) && (this.c > 0.0F) && (!☃.ax()) && (this.b.a()))
    {
      double ☃ = this.b.b(☃.s, ☃.t, ☃.u);
      float ☃ = (float)((1.0D - ☃ / 256.0D) * this.d);
      if (☃ > 0.0F) {
        c(☃, ☃, ☃, ☃, ☃, ☃);
      }
    }
    if ((☃.aJ()) && (
      (!(☃ instanceof wn)) || (!((wn)☃).v()))) {
      a(☃, ☃, ☃, ☃, ☃);
    }
  }
  
  public avn c()
  {
    return this.b.c();
  }
  
  protected void a(T ☃, String ☃, double ☃, double ☃, double ☃, int ☃)
  {
    double ☃ = ☃.h(this.b.c);
    if (☃ > ☃ * ☃) {
      return;
    }
    avn ☃ = c();
    
    float ☃ = 1.6F;
    float ☃ = 0.016666668F * ☃;
    
    bfl.E();
    bfl.b((float)☃ + 0.0F, (float)☃ + ☃.K + 0.5F, (float)☃);
    GL11.glNormal3f(0.0F, 1.0F, 0.0F);
    
    bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
    bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
    
    bfl.a(-☃, -☃, ☃);
    bfl.f();
    
    bfl.a(false);
    bfl.i();
    bfl.l();
    bfl.a(770, 771, 1, 0);
    
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    
    int ☃ = 0;
    if (☃.equals("deadmau5")) {
      ☃ = -10;
    }
    int ☃ = ☃.a(☃) / 2;
    
    bfl.x();
    ☃.a(7, bms.f);
    ☃.b(-☃ - 1, -1 + ☃, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    ☃.b(-☃ - 1, 8 + ☃, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    ☃.b(☃ + 1, 8 + ☃, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    ☃.b(☃ + 1, -1 + ☃, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
    ☃.b();
    bfl.w();
    
    ☃.a(☃, -☃.a(☃) / 2, ☃, 553648127);
    bfl.j();
    
    bfl.a(true);
    ☃.a(☃, -☃.a(☃) / 2, ☃, -1);
    bfl.e();
    bfl.k();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
  }
  
  public biu d()
  {
    return this.b;
  }
}
