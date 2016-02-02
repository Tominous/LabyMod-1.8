public class bjb
  extends bjo<vs>
{
  private static final jy a = new jy("textures/entity/zombie/zombie.png");
  private float e;
  
  public bjb(biu ☃, bbo ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃ * ☃);
    
    this.e = ☃;
    
    a(new bky(this));
    a(new bkx(this)
    {
      protected void a()
      {
        this.c = new bcn(0.5F, true);
        this.d = new bcn(1.0F, true);
      }
    });
  }
  
  public void C_()
  {
    bfl.b(0.0F, 0.1875F, 0.0F);
  }
  
  protected void a(vs ☃, float ☃)
  {
    bfl.a(this.e, this.e, this.e);
  }
  
  protected jy a(vs ☃)
  {
    return a;
  }
}
