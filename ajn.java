public class ajn
  extends ahj
{
  public ajn()
  {
    super(arm.B, false, arn.c);
    a(yz.c);
    L = 0.8F;
  }
  
  public adf m()
  {
    return adf.d;
  }
  
  public void a(adm ☃, cj ☃, pk ☃, float ☃)
  {
    if (☃.av()) {
      super.a(☃, ☃, ☃, ☃);
    } else {
      ☃.e(☃, 0.0F);
    }
  }
  
  public void a(adm ☃, pk ☃)
  {
    if (☃.av()) {
      super.a(☃, ☃);
    } else if (w < 0.0D) {
      w = (-w);
    }
  }
  
  public void a(adm ☃, cj ☃, pk ☃)
  {
    if ((Math.abs(w) < 0.1D) && (!☃.av()))
    {
      double ☃ = 0.4D + Math.abs(w) * 0.2D;
      v *= ☃;
      x *= ☃;
    }
    super.a(☃, ☃, ☃);
  }
}
