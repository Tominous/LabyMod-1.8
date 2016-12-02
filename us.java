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
    b = ☃;
  }
  
  public zx a(Random ☃)
  {
    zx ☃ = b.k();
    if (c > 0.0F)
    {
      int ☃ = (int)(c * b.j());
      int ☃ = ☃.j() - ☃.nextInt(☃.nextInt(☃) + 1);
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ < 1) {
        ☃ = 1;
      }
      ☃.b(☃);
    }
    if (d) {
      ack.a(☃, ☃, 30);
    }
    return ☃;
  }
  
  public us a(float ☃)
  {
    c = ☃;
    return this;
  }
  
  public us a()
  {
    d = true;
    return this;
  }
}
