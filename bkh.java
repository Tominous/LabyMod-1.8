public class bkh
  extends bjo<wi>
{
  private static final jy a = new jy("textures/entity/villager/villager.png");
  private static final jy e = new jy("textures/entity/villager/farmer.png");
  private static final jy j = new jy("textures/entity/villager/librarian.png");
  private static final jy k = new jy("textures/entity/villager/priest.png");
  private static final jy l = new jy("textures/entity/villager/smith.png");
  private static final jy m = new jy("textures/entity/villager/butcher.png");
  
  public bkh(biu ☃)
  {
    super(☃, new bci(0.0F), 0.5F);
    
    a(new bks(ga));
  }
  
  public bci g()
  {
    return (bci)super.b();
  }
  
  protected jy a(wi ☃)
  {
    switch (☃.cl())
    {
    case 0: 
      return e;
    case 1: 
      return j;
    case 2: 
      return k;
    case 3: 
      return l;
    case 4: 
      return m;
    }
    return a;
  }
  
  protected void a(wi ☃, float ☃)
  {
    float ☃ = 0.9375F;
    if (☃.l() < 0)
    {
      ☃ = (float)(☃ * 0.5D);
      c = 0.25F;
    }
    else
    {
      c = 0.5F;
    }
    bfl.a(☃, ☃, ☃);
  }
}
