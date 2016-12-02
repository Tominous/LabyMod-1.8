public class blc
  implements blb<tv>
{
  private static final jy a = new jy("textures/entity/sheep/sheep_fur.png");
  private final bjv b;
  private final bbv c = new bbv();
  
  public blc(bjv ☃)
  {
    this.b = ☃;
  }
  
  public void a(tv ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if ((☃.cm()) || (☃.ax())) {
      return;
    }
    this.b.a(a);
    if ((☃.l_()) && ("jeb_".equals(☃.aM())))
    {
      int ☃ = 25;
      int ☃ = ☃.W / 25 + ☃.F();
      int ☃ = zd.values().length;
      int ☃ = ☃ % ☃;
      int ☃ = (☃ + 1) % ☃;
      float ☃ = (☃.W % 25 + ☃) / 25.0F;
      float[] ☃ = tv.a(zd.b(☃));
      float[] ☃ = tv.a(zd.b(☃));
      bfl.c(☃[0] * (1.0F - ☃) + ☃[0] * ☃, ☃[1] * (1.0F - ☃) + ☃[1] * ☃, ☃[2] * (1.0F - ☃) + ☃[2] * ☃);
    }
    else
    {
      float[] ☃ = tv.a(☃.cl());
      bfl.c(☃[0], ☃[1], ☃[2]);
    }
    this.c.a(this.b.b());
    this.c.a(☃, ☃, ☃, ☃);
    this.c.a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean b()
  {
    return true;
  }
}
