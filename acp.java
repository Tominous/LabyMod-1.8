public class acp
  extends aci
{
  protected acp(int ☃, jy ☃, int ☃, acj ☃)
  {
    super(☃, ☃, ☃, ☃);
    if (☃ == acj.h) {
      c("lootBonusDigger");
    } else if (☃ == acj.i) {
      c("lootBonusFishing");
    } else {
      c("lootBonus");
    }
  }
  
  public int a(int ☃)
  {
    return 15 + (☃ - 1) * 9;
  }
  
  public int b(int ☃)
  {
    return super.a(☃) + 50;
  }
  
  public int b()
  {
    return 3;
  }
  
  public boolean a(aci ☃)
  {
    return (super.a(☃)) && (B != sB);
  }
}
