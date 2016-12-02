import org.lwjgl.opengl.GL11;

public class bjg
  extends biv<uo>
{
  private static final jy a = new jy("textures/map/map_background.png");
  private final ave e = ave.A();
  private final bov f = new bov("item_frame", "normal");
  private final bov g = new bov("item_frame", "map");
  private bjh h;
  
  public bjg(biu ☃, bjh ☃)
  {
    super(☃);
    this.h = ☃;
  }
  
  public void a(uo ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    
    cj ☃ = ☃.n();
    double ☃ = ☃.n() - ☃.s + ☃;
    double ☃ = ☃.o() - ☃.t + ☃;
    double ☃ = ☃.p() - ☃.u + ☃;
    bfl.b(☃ + 0.5D, ☃ + 0.5D, ☃ + 0.5D);
    bfl.b(180.0F - ☃.y, 0.0F, 1.0F, 0.0F);
    
    this.b.a.a(bmh.g);
    bgd ☃ = this.e.ae();
    bou ☃ = ☃.a().b();
    boq ☃;
    boq ☃;
    if ((☃.o() != null) && (☃.o().b() == zy.bd)) {
      ☃ = ☃.a(this.g);
    } else {
      ☃ = ☃.a(this.f);
    }
    bfl.E();
    bfl.b(-0.5F, -0.5F, -0.5F);
    ☃.b().a(☃, 1.0F, 1.0F, 1.0F, 1.0F);
    bfl.F();
    
    bfl.b(0.0F, 0.0F, 0.4375F);
    b(☃);
    
    bfl.F();
    a(☃, ☃ + ☃.b.g() * 0.3F, ☃ - 0.25D, ☃ + ☃.b.i() * 0.3F);
  }
  
  protected jy a(uo ☃)
  {
    return null;
  }
  
  private void b(uo ☃)
  {
    zx ☃ = ☃.o();
    if (☃ == null) {
      return;
    }
    uz ☃ = new uz(☃.o, 0.0D, 0.0D, 0.0D, ☃);
    zw ☃ = ☃.l().b();
    ☃.l().b = 1;
    ☃.a = 0.0F;
    
    bfl.E();
    bfl.f();
    
    int ☃ = ☃.p();
    if (☃ == zy.bd) {
      ☃ = ☃ % 4 * 2;
    }
    bfl.b(☃ * 360.0F / 8.0F, 0.0F, 0.0F, 1.0F);
    if (☃ == zy.bd)
    {
      this.b.a.a(a);
      
      bfl.b(180.0F, 0.0F, 0.0F, 1.0F);
      float ☃ = 0.0078125F;
      bfl.a(☃, ☃, ☃);
      bfl.b(-64.0F, -64.0F, 0.0F);
      
      atg ☃ = zy.bd.a(☃.l(), ☃.o);
      bfl.b(0.0F, 0.0F, -1.0F);
      if (☃ != null) {
        this.e.o.k().a(☃, true);
      }
    }
    else
    {
      bmi ☃ = null;
      if (☃ == zy.aQ)
      {
        ☃ = this.e.T().a(bmp.l);
        this.e.P().a(bmh.g);
        if ((☃ instanceof bmp))
        {
          bmp ☃ = (bmp)☃;
          
          double ☃ = ☃.j;
          double ☃ = ☃.k;
          ☃.j = 0.0D;
          ☃.k = 0.0D;
          ☃.a(☃.o, ☃.s, ☃.u, ns.g(180 + ☃.b.b() * 90), false, true);
          ☃.j = ☃;
          ☃.k = ☃;
        }
        else
        {
          ☃ = null;
        }
      }
      bfl.a(0.5F, 0.5F, 0.5F);
      if ((!this.h.a(☃.l())) || ((☃ instanceof aat))) {
        bfl.b(180.0F, 0.0F, 1.0F, 0.0F);
      }
      bfl.a();
      avc.b();
      this.h.a(☃.l(), bgr.b.g);
      avc.a();
      bfl.b();
      if ((☃ != null) && 
        (☃.k() > 0)) {
        ☃.j();
      }
    }
    bfl.e();
    bfl.F();
  }
  
  protected void a(uo ☃, double ☃, double ☃, double ☃)
  {
    if ((ave.v()) && (☃.o() != null) && (☃.o().s()) && (this.b.d == ☃))
    {
      float ☃ = 1.6F;
      float ☃ = 0.016666668F * ☃;
      double ☃ = ☃.h(this.b.c);
      
      float ☃ = ☃.av() ? 32.0F : 64.0F;
      if (☃ < ☃ * ☃)
      {
        String ☃ = ☃.o().q();
        if (☃.av())
        {
          avn ☃ = c();
          bfl.E();
          bfl.b((float)☃ + 0.0F, (float)☃ + ☃.K + 0.5F, (float)☃);
          GL11.glNormal3f(0.0F, 1.0F, 0.0F);
          
          bfl.b(-this.b.e, 0.0F, 1.0F, 0.0F);
          bfl.b(this.b.f, 1.0F, 0.0F, 0.0F);
          
          bfl.a(-☃, -☃, ☃);
          bfl.f();
          
          bfl.b(0.0F, 0.25F / ☃, 0.0F);
          bfl.a(false);
          bfl.l();
          bfl.b(770, 771);
          
          bfx ☃ = bfx.a();
          bfd ☃ = ☃.c();
          
          int ☃ = ☃.a(☃) / 2;
          
          bfl.x();
          ☃.a(7, bms.f);
          ☃.b(-☃ - 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          ☃.b(-☃ - 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          ☃.b(☃ + 1, 8.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          ☃.b(☃ + 1, -1.0D, 0.0D).a(0.0F, 0.0F, 0.0F, 0.25F).d();
          ☃.b();
          bfl.w();
          
          bfl.a(true);
          ☃.a(☃, -☃.a(☃) / 2, 0, 553648127);
          bfl.e();
          bfl.k();
          bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
          bfl.F();
        }
        else
        {
          a(☃, ☃, ☃, ☃, ☃, 64);
        }
      }
    }
  }
}
