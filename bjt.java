public class bjt
  extends bje<vw>
{
  private static final jy j = new jy("textures/entity/zombie_pigman.png");
  
  public bjt(biu ☃)
  {
    super(☃, new bcn(), 0.5F, 1.0F);
    
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
  
  protected jy a(vw ☃)
  {
    return j;
  }
}
