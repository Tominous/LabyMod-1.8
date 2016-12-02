import java.util.Collection;
import java.util.Random;

public class oa
{
  public static int a(Collection<? extends oa.a> ☃)
  {
    int ☃ = 0;
    for (oa.a ☃ : ☃) {
      ☃ += ☃.a;
    }
    return ☃;
  }
  
  public static <T extends oa.a> T a(Random ☃, Collection<T> ☃, int ☃)
  {
    if (☃ <= 0) {
      throw new IllegalArgumentException();
    }
    int ☃ = ☃.nextInt(☃);
    return a(☃, ☃);
  }
  
  public static <T extends oa.a> T a(Collection<T> ☃, int ☃)
  {
    for (T ☃ : ☃)
    {
      ☃ -= ☃.a;
      if (☃ < 0) {
        return ☃;
      }
    }
    return null;
  }
  
  public static <T extends oa.a> T a(Random ☃, Collection<T> ☃)
  {
    return a(☃, ☃, a(☃));
  }
  
  public static class a
  {
    protected int a;
    
    public a(int ☃)
    {
      this.a = ☃;
    }
  }
}
