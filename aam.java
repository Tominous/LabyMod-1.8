public class aam
  extends zw
{
  public aam()
  {
    this.h = 1;
    a(yz.e);
  }
  
  public boolean a(zx ☃, wn ☃, pr ☃)
  {
    if ((☃ instanceof tt))
    {
      tt ☃ = (tt)☃;
      if ((!☃.cl()) && (!☃.j_()))
      {
        ☃.l(true);
        ☃.o.a(☃, "mob.horse.leather", 0.5F, 1.0F);
        ☃.b -= 1;
      }
      return true;
    }
    return false;
  }
  
  public boolean a(zx ☃, pr ☃, pr ☃)
  {
    a(☃, null, ☃);
    return true;
  }
}
