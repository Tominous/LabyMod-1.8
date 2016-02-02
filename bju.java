public class bju
  extends bjo<tu>
{
  private static final jy a = new jy("textures/entity/rabbit/brown.png");
  private static final jy e = new jy("textures/entity/rabbit/white.png");
  private static final jy j = new jy("textures/entity/rabbit/black.png");
  private static final jy k = new jy("textures/entity/rabbit/gold.png");
  private static final jy l = new jy("textures/entity/rabbit/salt.png");
  private static final jy m = new jy("textures/entity/rabbit/white_splotched.png");
  private static final jy n = new jy("textures/entity/rabbit/toast.png");
  private static final jy o = new jy("textures/entity/rabbit/caerbannog.png");
  
  public bju(biu ☃, bbo ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected jy a(tu ☃)
  {
    String ☃ = a.a(☃.e_());
    if ((☃ != null) && (☃.equals("Toast"))) {
      return n;
    }
    switch (☃.cn())
    {
    case 0: 
    default: 
      return a;
    case 1: 
      return e;
    case 2: 
      return j;
    case 4: 
      return k;
    case 5: 
      return l;
    case 3: 
      return m;
    }
    return o;
  }
}
