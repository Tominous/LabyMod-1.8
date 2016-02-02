import java.util.Random;

public class acg
  extends aci
{
  protected acg(int ☃, jy ☃, int ☃)
  {
    super(☃, ☃, ☃, acj.j);
    
    c("durability");
  }
  
  public int a(int ☃)
  {
    return 5 + (☃ - 1) * 8;
  }
  
  public int b(int ☃)
  {
    return super.a(☃) + 50;
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean a(zx ☃)
  {
    if (☃.e()) {
      return true;
    }
    return super.a(☃);
  }
  
  public static boolean a(zx ☃, int ☃, Random ☃)
  {
    if (((☃.b() instanceof yj)) && (☃.nextFloat() < 0.6F)) {
      return false;
    }
    return ☃.nextInt(☃ + 1) > 0;
  }
}
