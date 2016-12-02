import java.util.Arrays;

public class bgn
  extends bgg
{
  private final bmi d;
  
  public bgn(bgg ☃, bmi ☃)
  {
    super(Arrays.copyOf(☃.a(), ☃.a().length), ☃.b, bgo.a(☃.a()));
    this.d = ☃;
    e();
  }
  
  private void e()
  {
    for (int ☃ = 0; ☃ < 4; ☃++) {
      a(☃);
    }
  }
  
  private void a(int ☃)
  {
    int ☃ = 7 * ☃;
    float ☃ = Float.intBitsToFloat(this.a[☃]);
    float ☃ = Float.intBitsToFloat(this.a[(☃ + 1)]);
    float ☃ = Float.intBitsToFloat(this.a[(☃ + 2)]);
    float ☃ = 0.0F;
    float ☃ = 0.0F;
    switch (bgn.1.a[this.c.ordinal()])
    {
    case 1: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 2: 
      ☃ = ☃ * 16.0F;
      ☃ = ☃ * 16.0F;
      break;
    case 3: 
      ☃ = (1.0F - ☃) * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 4: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 5: 
      ☃ = ☃ * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
      break;
    case 6: 
      ☃ = (1.0F - ☃) * 16.0F;
      ☃ = (1.0F - ☃) * 16.0F;
    }
    this.a[(☃ + 4)] = Float.floatToRawIntBits(this.d.a(☃));
    this.a[(☃ + 4 + 1)] = Float.floatToRawIntBits(this.d.b(☃));
  }
}
