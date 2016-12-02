import java.util.List;

class axq$b
  extends awi
{
  public int u = -1;
  
  public axq$b(axq paramaxq)
  {
    super(paramaxq.j, paramaxq.l, paramaxq.m, 80, paramaxq.m - 37, 24);
  }
  
  private void a(int ☃, int ☃, zw ☃, int ☃)
  {
    e(☃ + 1, ☃ + 1);
    
    bfl.B();
    
    avc.c();
    
    this.v.k.a(new zx(☃, 1, ☃), ☃ + 2, ☃ + 2);
    avc.a();
    
    bfl.C();
  }
  
  private void e(int ☃, int ☃)
  {
    d(☃, ☃, 0, 0);
  }
  
  private void d(int ☃, int ☃, int ☃, int ☃)
  {
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    this.a.P().a(avp.c);
    
    float ☃ = 0.0078125F;
    float ☃ = 0.0078125F;
    int ☃ = 18;
    int ☃ = 18;
    bfx ☃ = bfx.a();
    bfd ☃ = ☃.c();
    ☃.a(7, bms.g);
    ☃.b(☃ + 0, ☃ + 18, axq.a(this.v)).a((☃ + 0) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 18, axq.b(this.v)).a((☃ + 18) * 0.0078125F, (☃ + 18) * 0.0078125F).d();
    ☃.b(☃ + 18, ☃ + 0, axq.c(this.v)).a((☃ + 18) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b(☃ + 0, ☃ + 0, axq.d(this.v)).a((☃ + 0) * 0.0078125F, (☃ + 0) * 0.0078125F).d();
    ☃.b();
  }
  
  protected int b()
  {
    return axq.f().size();
  }
  
  protected void a(int ☃, boolean ☃, int ☃, int ☃)
  {
    this.u = ☃;
    this.v.a();
    axq.f(this.v).a(((axq.a)axq.f().get(axq.e(this.v).u)).d);
  }
  
  protected boolean a(int ☃)
  {
    return ☃ == this.u;
  }
  
  protected void a() {}
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    axq.a ☃ = (axq.a)axq.f().get(☃);
    a(☃, ☃, ☃.a, ☃.b);
    this.v.q.a(☃.c, ☃ + 18 + 5, ☃ + 6, 16777215);
  }
}
