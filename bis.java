import java.util.Random;

public class bis
  extends bjo<vo>
{
  private static final jy a = new jy("textures/entity/enderman/enderman.png");
  private bbd e;
  private Random j = new Random();
  
  public bis(biu ☃)
  {
    super(☃, new bbd(0.0F), 0.5F);
    e = ((bbd)f);
    
    a(new bkw(this));
    a(new bkq(this));
  }
  
  public void a(vo ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    e.a = (☃.cm().c().t() != arm.a);
    e.b = ☃.co();
    if (☃.co())
    {
      double ☃ = 0.02D;
      ☃ += j.nextGaussian() * ☃;
      ☃ += j.nextGaussian() * ☃;
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(vo ☃)
  {
    return a;
  }
}
