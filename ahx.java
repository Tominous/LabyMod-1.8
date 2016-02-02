import java.util.Random;

public class ahx
  extends afh
{
  protected ahx()
  {
    super(arm.C, arn.u);
    a(yz.b);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zy.bf;
  }
  
  public int a(Random ☃)
  {
    return 3 + ☃.nextInt(5);
  }
  
  public int a(int ☃, Random ☃)
  {
    return Math.min(9, a(☃) + ☃.nextInt(1 + ☃));
  }
}
