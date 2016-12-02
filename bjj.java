public class bjj
  extends biv<up>
{
  private static final jy a = new jy("textures/entity/lead_knot.png");
  private bbm e = new bbm();
  
  public bjj(biu ☃)
  {
    super(☃);
  }
  
  public void a(up ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    bfl.E();
    bfl.p();
    
    bfl.b((float)☃, (float)☃, (float)☃);
    
    float ☃ = 0.0625F;
    bfl.B();
    bfl.a(-1.0F, -1.0F, 1.0F);
    
    bfl.d();
    
    c(☃);
    e.a(☃, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, ☃);
    
    bfl.F();
    
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(up ☃)
  {
    return a;
  }
}
