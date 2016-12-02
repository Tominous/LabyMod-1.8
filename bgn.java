import java.util.Arrays;

public class bgn
  extends bgg
{
  private final bmi d;
  private static final String __OBFID = "CL_00002492";
  
  public bgn(bgg p_i46217_1_, bmi p_i46217_2_)
  {
    super(Arrays.copyOf(p_i46217_1_.a(), p_i46217_1_.a().length), b, bgo.a(p_i46217_1_.a()));
    d = p_i46217_2_;
    e();
  }
  
  private void e()
  {
    for (int var1 = 0; var1 < 4; var1++) {
      a(var1);
    }
  }
  
  private void a(int p_178216_1_)
  {
    int step = a.length / 4;
    
    int var2 = step * p_178216_1_;
    float var3 = Float.intBitsToFloat(a[var2]);
    float var4 = Float.intBitsToFloat(a[(var2 + 1)]);
    float var5 = Float.intBitsToFloat(a[(var2 + 2)]);
    float var6 = 0.0F;
    float var7 = 0.0F;
    switch (bgn.1.a[c.ordinal()])
    {
    case 1: 
      var6 = var3 * 16.0F;
      var7 = (1.0F - var5) * 16.0F;
      break;
    case 2: 
      var6 = var3 * 16.0F;
      var7 = var5 * 16.0F;
      break;
    case 3: 
      var6 = (1.0F - var3) * 16.0F;
      var7 = (1.0F - var4) * 16.0F;
      break;
    case 4: 
      var6 = var3 * 16.0F;
      var7 = (1.0F - var4) * 16.0F;
      break;
    case 5: 
      var6 = var5 * 16.0F;
      var7 = (1.0F - var4) * 16.0F;
      break;
    case 6: 
      var6 = (1.0F - var5) * 16.0F;
      var7 = (1.0F - var4) * 16.0F;
    }
    a[(var2 + 4)] = Float.floatToRawIntBits(d.a(var6));
    a[(var2 + 4 + 1)] = Float.floatToRawIntBits(d.b(var7));
  }
}
