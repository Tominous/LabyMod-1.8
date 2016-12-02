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
    
    e.f = (0.017453292F * ☃.t().b());
    e.g = (0.017453292F * ☃.t().c());
    e.h = (0.017453292F * ☃.t().d());
    e.a(0.0F, 1.0F, 0.0F);
    
    g.f = (0.017453292F * ☃.u().b());
    g.g = (0.017453292F * ☃.u().c());
    g.h = (0.017453292F * ☃.u().d());
    
    i.f = (0.017453292F * ☃.v().b());
    i.g = (0.017453292F * ☃.v().c());
    i.h = (0.017453292F * ☃.v().d());
    
    h.f = (0.017453292F * ☃.w().b());
    h.g = (0.017453292F * ☃.w().c());
    h.h = (0.017453292F * ☃.w().d());
    
    k.f = (0.017453292F * ☃.x().b());
    k.g = (0.017453292F * ☃.x().c());
    k.h = (0.017453292F * ☃.x().d());
    k.a(1.9F, 11.0F, 0.0F);
    
    j.f = (0.017453292F * ☃.y().b());
    j.g = (0.017453292F * ☃.y().c());
    j.h = (0.017453292F * ☃.y().d());
    j.a(-1.9F, 11.0F, 0.0F);
    
    a(e, f);
  }
}
