import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;

public class aqf
  extends aqq
{
  private double d = 0.004D;
  
  public aqf() {}
  
  public String a()
  {
    return "Mineshaft";
  }
  
  public aqf(Map<String, String> ☃)
  {
    for (Map.Entry<String, String> ☃ : ☃.entrySet()) {
      if (((String)☃.getKey()).equals("chance")) {
        d = ns.a((String)☃.getValue(), d);
      }
    }
  }
  
  protected boolean a(int ☃, int ☃)
  {
    return (b.nextDouble() < d) && (b.nextInt(80) < Math.max(Math.abs(☃), Math.abs(☃)));
  }
  
  protected aqu b(int ☃, int ☃)
  {
    return new aqh(c, b, ☃, ☃);
  }
}
