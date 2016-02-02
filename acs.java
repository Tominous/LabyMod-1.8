import java.util.Random;

public class acs
  extends aci
{
  public acs(int ☃, jy ☃, int ☃)
  {
    super(☃, ☃, ☃, acj.e);
    
    c("thorns");
  }
  
  public int a(int ☃)
  {
    return 10 + 20 * (☃ - 1);
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
    if ((☃.b() instanceof yj)) {
      return true;
    }
    return super.a(☃);
  }
  
  public void b(pr ☃, pk ☃, int ☃)
  {
    Random ☃ = ☃.bc();
    zx ☃ = ack.a(aci.j, ☃);
    if (a(☃, ☃))
    {
      if (☃ != null)
      {
        ☃.a(ow.a(☃), b(☃, ☃));
        ☃.a("damage.thorns", 0.5F, 1.0F);
      }
      if (☃ != null) {
        ☃.a(3, ☃);
      }
    }
    else if (☃ != null)
    {
      ☃.a(1, ☃);
    }
  }
  
  public static boolean a(int ☃, Random ☃)
  {
    if (☃ <= 0) {
      return false;
    }
    return ☃.nextFloat() < 0.15F * ☃;
  }
  
  public static int b(int ☃, Random ☃)
  {
    if (☃ > 10) {
      return ☃ - 10;
    }
    return 1 + ☃.nextInt(4);
  }
}
