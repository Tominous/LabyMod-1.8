import com.google.common.collect.Maps;
import java.util.Map;

public class bjd
  extends bjo<tp>
{
  private static final Map<String, jy> a = ;
  private static final jy e = new jy("textures/entity/horse/horse_white.png");
  private static final jy j = new jy("textures/entity/horse/mule.png");
  private static final jy k = new jy("textures/entity/horse/donkey.png");
  private static final jy l = new jy("textures/entity/horse/horse_zombie.png");
  private static final jy m = new jy("textures/entity/horse/horse_skeleton.png");
  
  public bjd(biu ☃, bbh ☃, float ☃)
  {
    super(☃, ☃, ☃);
  }
  
  protected void a(tp ☃, float ☃)
  {
    float ☃ = 1.0F;
    
    int ☃ = ☃.cl();
    if (☃ == 1) {
      ☃ *= 0.87F;
    } else if (☃ == 2) {
      ☃ *= 0.92F;
    }
    bfl.a(☃, ☃, ☃);
    super.a(☃, ☃);
  }
  
  protected jy a(tp ☃)
  {
    if (!☃.cJ())
    {
      switch (☃.cl())
      {
      case 0: 
      default: 
        return e;
      case 2: 
        return j;
      case 1: 
        return k;
      case 3: 
        return l;
      }
      return m;
    }
    return b(☃);
  }
  
  private jy b(tp ☃)
  {
    String ☃ = ☃.cL();
    if (!☃.cK()) {
      return null;
    }
    jy ☃ = (jy)a.get(☃);
    if (☃ == null)
    {
      ☃ = new jy(☃);
      ave.A().P().a(☃, new bmd(☃.cM()));
      
      a.put(☃, ☃);
    }
    return ☃;
  }
}
