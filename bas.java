public class bas
  extends bbj
{
  public bas()
  {
    this(0.0F);
  }
  
  public bas(float ☃)
  {
    this(☃, 64, 32);
  }
  
  protected bas(float ☃, int ☃, int ☃)
  {
    super(☃, 0.0F, ☃, ☃);
  }
  
  public void a(float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, pk ☃)
  {
    if (!(☃ instanceof um)) {
      return;
    }
    um ☃ = (um)☃;
    
    this.e.f = (0.017453292F * ☃.t().b());
    this.e.g = (0.017453292F * ☃.t().c());
    this.e.h = (0.017453292F * ☃.t().d());
    this.e.a(0.0F, 1.0F, 0.0F);
    
    this.g.f = (0.017453292F * ☃.u().b());
    this.g.g = (0.017453292F * ☃.u().c());
    this.g.h = (0.017453292F * ☃.u().d());
    
    this.i.f = (0.017453292F * ☃.v().b());
    this.i.g = (0.017453292F * ☃.v().c());
    this.i.h = (0.017453292F * ☃.v().d());
    
    this.h.f = (0.017453292F * ☃.w().b());
    this.h.g = (0.017453292F * ☃.w().c());
    this.h.h = (0.017453292F * ☃.w().d());
    
    this.k.f = (0.017453292F * ☃.x().b());
    this.k.g = (0.017453292F * ☃.x().c());
    this.k.h = (0.017453292F * ☃.x().d());
    this.k.a(1.9F, 11.0F, 0.0F);
    
    this.j.f = (0.017453292F * ☃.y().b());
    this.j.g = (0.017453292F * ☃.y().c());
    this.j.h = (0.017453292F * ☃.y().d());
    this.j.a(-1.9F, 11.0F, 0.0F);
    
    a(this.e, this.f);
  }
}
