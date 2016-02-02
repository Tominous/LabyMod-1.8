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
    this.e = ((bbd)this.f);
    
    a(new bkw(this));
    a(new bkq(this));
  }
  
  public void a(vo ☃, double ☃, double ☃, double ☃, float ☃, float ☃)
  {
    this.e.a = (☃.cm().c().t() != arm.a);
    this.e.b = ☃.co();
    if (☃.co())
    {
      double ☃ = 0.02D;
      ☃ += this.j.nextGaussian() * ☃;
      ☃ += this.j.nextGaussian() * ☃;
    }
    super.a(☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  protected jy a(vo ☃)
  {
    return a;
  }
}
