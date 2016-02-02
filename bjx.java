public class bjx
  extends bje<wa>
{
  private static final jy j = new jy("textures/entity/skeleton/skeleton.png");
  private static final jy k = new jy("textures/entity/skeleton/wither_skeleton.png");
  
  public bjx(biu ☃)
  {
    super(☃, new bca(), 0.5F);
    
    a(new bky(this));
    a(new bkx(this)
    {
      protected void a()
      {
        this.c = new bca(0.5F, true);
        this.d = new bca(1.0F, true);
      }
    });
  }
  
  protected void a(wa ☃, float ☃)
  {
    if (☃.cm() == 1) {
      bfl.a(1.2F, 1.2F, 1.2F);
    }
  }
  
  public void C_()
  {
    bfl.b(0.09375F, 0.1875F, 0.0F);
  }
  
  protected jy a(wa ☃)
  {
    if (☃.cm() == 1) {
      return k;
    }
    return j;
  }
}
