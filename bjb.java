public class bjb
  extends bjo<vs>
{
  private static final jy a = new jy("textures/entity/zombie/zombie.png");
  private float e;
  
  public bjb(biu ☃, bbo ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃ * ☃);
    
    e = ☃;
    
    a(new bky(this));
    a(new bkx(this)
    {
      protected void a()
      {
        c = new bcn(0.5F, true);
        d = new bcn(1.0F, true);
      }
    });
  }
  
  public void C_()
  {
    bfl.b(0.0F, 0.1875F, 0.0F);
  }
  
  protected void a(vs ☃, float ☃)
  {
    bfl.a(e, e, e);
  }
  
  protected jy a(vs ☃)
  {
    return a;
  }
}
