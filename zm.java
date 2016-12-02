import java.util.Random;

public class zm
  extends zw
{
  public zm()
  {
    a(yz.f);
  }
  
  public boolean a(zx ☃, wn ☃, adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃)
  {
    if (☃.D) {
      return true;
    }
    ☃ = ☃.a(☃);
    if (!☃.a(☃, ☃, ☃)) {
      return false;
    }
    if (☃.p(☃).c().t() == arm.a)
    {
      ☃.a(☃.n() + 0.5D, ☃.o() + 0.5D, ☃.p() + 0.5D, "item.fireCharge.use", 1.0F, (g.nextFloat() - g.nextFloat()) * 0.2F + 1.0F);
      ☃.a(☃, afi.ab.Q());
    }
    if (!☃.bA.d) {
      ☃.b -= 1;
    }
    return true;
  }
}
