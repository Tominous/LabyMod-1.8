public class bev
  extends beu
{
  private final avh e;
  
  public bev(avh ☃)
  {
    this.e = ☃;
  }
  
  public void a()
  {
    this.a = 0.0F;
    this.b = 0.0F;
    if (this.e.X.d()) {
      this.b += 1.0F;
    }
    if (this.e.Z.d()) {
      this.b -= 1.0F;
    }
    if (this.e.Y.d()) {
      this.a += 1.0F;
    }
    if (this.e.aa.d()) {
      this.a -= 1.0F;
    }
    this.c = this.e.ab.d();
    this.d = this.e.ac.d();
    if (this.d)
    {
      this.a = ((float)(this.a * 0.3D));
      this.b = ((float)(this.b * 0.3D));
    }
  }
}
