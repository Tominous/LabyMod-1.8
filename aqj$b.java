import java.util.List;
import java.util.Random;

public class aqj$b
  extends aqj.m
{
  private int b;
  
  public aqj$b() {}
  
  public aqj$b(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
    this.b = ☃.nextInt();
  }
  
  public static b a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃, int ☃)
  {
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -3, 0, 5, 10, 8, ☃);
    if ((!a(☃)) || (aqt.a(☃, ☃) != null)) {
      return null;
    }
    return new b(☃, ☃, ☃, ☃);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    
    this.b = ☃.f("Seed");
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    
    ☃.a("Seed", this.b);
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    Random ☃ = new Random(this.b);
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 3; ☃ <= 4; ☃++)
      {
        int ☃ = ☃.nextInt(8);
        a(☃, ☃, ☃, ☃, 0, ☃, ☃, ☃, afi.by.Q(), afi.by.Q(), false);
      }
    }
    int ☃ = ☃.nextInt(8);
    a(☃, ☃, 0, 5, 0, 0, 5, ☃, afi.by.Q(), afi.by.Q(), false);
    
    int ☃ = ☃.nextInt(8);
    a(☃, ☃, 4, 5, 0, 4, 5, ☃, afi.by.Q(), afi.by.Q(), false);
    for (int ☃ = 0; ☃ <= 4; ☃++)
    {
      int ☃ = ☃.nextInt(5);
      a(☃, ☃, ☃, 2, 0, ☃, 2, ☃, afi.by.Q(), afi.by.Q(), false);
    }
    for (int ☃ = 0; ☃ <= 4; ☃++) {
      for (int ☃ = 0; ☃ <= 1; ☃++)
      {
        int ☃ = ☃.nextInt(3);
        a(☃, ☃, ☃, ☃, 0, ☃, ☃, ☃, afi.by.Q(), afi.by.Q(), false);
      }
    }
    return true;
  }
}
