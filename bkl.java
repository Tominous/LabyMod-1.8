public class bkl
  extends bjo<ua>
{
  private static final jy a = new jy("textures/entity/wolf/wolf.png");
  private static final jy e = new jy("textures/entity/wolf/wolf_tame.png");
  private static final jy j = new jy("textures/entity/wolf/wolf_angry.png");
  
  public bkl(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
    
    a(new blk(this));
  }
  
  protected float a(ua ☃, float ☃)
  {
    return ☃.cu();
  }
  
  public void a(ua ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    if (☃.ct())
    {
      float ☃ = ☃.c(☃) * ☃.p(☃);
      bfl.c(☃, ☃, ☃);
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(ua ☃)
  {
    if (☃.cl()) {
      return e;
    }
    if (☃.cv()) {
      return j;
    }
    return a;
  }
}
