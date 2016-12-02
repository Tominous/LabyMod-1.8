public class blk
  implements blb<ua>
{
  private static final jy a = new jy("textures/entity/wolf/wolf_collar.png");
  private final bkl b;
  
  public blk(bkl ☃)
  {
    this.b = ☃;
  }
  
  public void a(ua ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃, float ☃)
  {
    if ((!☃.cl()) || (☃.ax())) {
      return;
    }
    this.b.a(a);
    
    zd ☃ = zd.b(☃.cw().a());
    float[] ☃ = tv.a(☃);
    
    bfl.c(☃[0], ☃[1], ☃[2]);
    
    this.b.b().a(☃, ☃, ☃, ☃, ☃, ☃, ☃);
  }
  
  public boolean b()
  {
    return true;
  }
}
