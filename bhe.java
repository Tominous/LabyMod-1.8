import java.util.Calendar;

public class bhe
  extends bhd<aky>
{
  private static final jy c = new jy("textures/entity/chest/trapped_double.png");
  private static final jy d = new jy("textures/entity/chest/christmas_double.png");
  private static final jy e = new jy("textures/entity/chest/normal_double.png");
  private static final jy f = new jy("textures/entity/chest/trapped.png");
  private static final jy g = new jy("textures/entity/chest/christmas.png");
  private static final jy h = new jy("textures/entity/chest/normal.png");
  private baz i = new baz();
  private baz j = new bbk();
  private boolean k;
  
  public bhe()
  {
    Calendar ☃ = Calendar.getInstance();
    if ((☃.get(2) + 1 == 12) && (☃.get(5) >= 24) && (☃.get(5) <= 26)) {
      this.k = true;
    }
  }
  
  public void a(aky ☃, double ☃, double ☃, double ☃, float ☃, int ☃)
  {
    bfl.j();
    bfl.c(515);
    bfl.a(true);
    int ☃;
    int ☃;
    if (!☃.t())
    {
      ☃ = 0;
    }
    else
    {
      afh ☃ = ☃.w();
      ☃ = ☃.u();
      if (((☃ instanceof afs)) && (☃ == 0))
      {
        ((afs)☃).e(☃.z(), ☃.v(), ☃.z().p(☃.v()));
        ☃ = ☃.u();
      }
      ☃.m();
    }
    if ((☃.f != null) || (☃.h != null)) {
      return;
    }
    baz ☃;
    if ((☃.g != null) || (☃.i != null))
    {
      baz ☃ = this.j;
      if (☃ >= 0)
      {
        a(a[☃]);
        bfl.n(5890);
        bfl.E();
        bfl.a(8.0F, 4.0F, 1.0F);
        bfl.b(0.0625F, 0.0625F, 0.0625F);
        bfl.n(5888);
      }
      else if (☃.n() == 1)
      {
        a(c);
      }
      else if (this.k)
      {
        a(d);
      }
      else
      {
        a(e);
      }
    }
    else
    {
      ☃ = this.i;
      if (☃ >= 0)
      {
        a(a[☃]);
        bfl.n(5890);
        bfl.E();
        bfl.a(4.0F, 4.0F, 1.0F);
        bfl.b(0.0625F, 0.0625F, 0.0625F);
        bfl.n(5888);
      }
      else if (☃.n() == 1)
      {
        a(f);
      }
      else if (this.k)
      {
        a(g);
      }
      else
      {
        a(h);
      }
    }
    bfl.E();
    bfl.B();
    if (☃ < 0) {
      bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    }
    bfl.b((float)☃, (float)☃ + 1.0F, (float)☃ + 1.0F);
    bfl.a(1.0F, -1.0F, -1.0F);
    
    bfl.b(0.5F, 0.5F, 0.5F);
    int ☃ = 0;
    if (☃ == 2) {
      ☃ = 180;
    }
    if (☃ == 3) {
      ☃ = 0;
    }
    if (☃ == 4) {
      ☃ = 90;
    }
    if (☃ == 5) {
      ☃ = -90;
    }
    if ((☃ == 2) && (☃.g != null)) {
      bfl.b(1.0F, 0.0F, 0.0F);
    }
    if ((☃ == 5) && (☃.i != null)) {
      bfl.b(0.0F, 0.0F, -1.0F);
    }
    bfl.b(☃, 0.0F, 1.0F, 0.0F);
    bfl.b(-0.5F, -0.5F, -0.5F);
    
    float ☃ = ☃.k + (☃.j - ☃.k) * ☃;
    if (☃.f != null)
    {
      float ☃ = ☃.f.k + (☃.f.j - ☃.f.k) * ☃;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    if (☃.h != null)
    {
      float ☃ = ☃.h.k + (☃.h.j - ☃.h.k) * ☃;
      if (☃ > ☃) {
        ☃ = ☃;
      }
    }
    ☃ = 1.0F - ☃;
    ☃ = 1.0F - ☃ * ☃ * ☃;
    
    ☃.a.f = (-(☃ * 3.1415927F / 2.0F));
    ☃.a();
    bfl.C();
    bfl.F();
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    if (☃ >= 0)
    {
      bfl.n(5890);
      bfl.F();
      bfl.n(5888);
    }
  }
}
