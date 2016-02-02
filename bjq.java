public class bjq
  extends bjo<ts>
{
  private static final jy a = new jy("textures/entity/cat/black.png");
  private static final jy e = new jy("textures/entity/cat/ocelot.png");
  private static final jy j = new jy("textures/entity/cat/red.png");
  private static final jy k = new jy("textures/entity/cat/siamese.png");
  
  public bjq(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected jy a(ts ☃)
  {
    switch (☃.ct())
    {
    case 0: 
    default: 
      return e;
    case 1: 
      return a;
    case 2: 
      return j;
    }
    return k;
  }
  
  protected void a(ts ☃, float ☃)
  {
    super.a(☃, ☃);
    if (☃.cl()) {
      bfl.a(0.8F, 0.8F, 0.8F);
    }
  }
}
