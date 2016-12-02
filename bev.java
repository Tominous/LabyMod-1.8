public class bev
  extends beu
{
  private final avh e;
  
  public bev(avh ☃)
  {
    e = ☃;
  }
  
  public void a()
  {
    a = 0.0F;
    b = 0.0F;
    if (e.X.d()) {
      b += 1.0F;
    }
    if (e.Z.d()) {
      b -= 1.0F;
    }
    if (e.Y.d()) {
      a += 1.0F;
    }
    if (e.aa.d()) {
      a -= 1.0F;
    }
    c = e.ab.d();
    d = e.ac.d();
    if (d)
    {
      a = ((float)(a * 0.3D));
      b = ((float)(b * 0.3D));
    }
  }
}
