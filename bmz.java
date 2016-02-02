import java.util.UUID;

public class bmz
{
  private static final jy a = new jy("textures/entity/steve.png");
  private static final jy b = new jy("textures/entity/alex.png");
  
  public static jy a()
  {
    return a;
  }
  
  public static jy a(UUID ☃)
  {
    if (c(☃)) {
      return b;
    }
    return a;
  }
  
  public static String b(UUID ☃)
  {
    if (c(☃)) {
      return "slim";
    }
    return "default";
  }
  
  private static boolean c(UUID ☃)
  {
    return (☃.hashCode() & 0x1) == 1;
  }
}
