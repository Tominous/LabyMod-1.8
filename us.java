import java.util.Random;

public class us
  extends oa.a
{
  private final zx b;
  private float c;
  private boolean d;
  
  public us(zx ☃, int ☃)
  {
    super(☃);
    this.b = ☃;
  }
  
  public zx a(Random ☃)
  {
    zx ☃ = this.b.k();
    if (this.c > 0.0F)
    {
      int ☃ = (int)(this.c * this.b.j());
      int ☃ = ☃.j() - ☃.nextInt(☃.nextInt(☃) + 1);
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ < 1) {
        ☃ = 1;
      }
      ☃.b(☃);
    }
    if (this.d) {
      ack.a(☃, ☃, 30);
    }
    return ☃;
  }
  
  public us a(float ☃)
  {
    this.c = ☃;
    return this;
  }
  
  public us a()
  {
    this.d = true;
    return this;
  }
}
