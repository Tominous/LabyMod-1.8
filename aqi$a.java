import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class aqi$a
  extends aqu
{
  public aqi$a() {}
  
  public aqi$a(adm ☃, Random ☃, int ☃, int ☃)
  {
    super(☃, ☃);
    
    aqj.q ☃ = new aqj.q(☃, (☃ << 4) + 2, (☃ << 4) + 2);
    a.add(☃);
    ☃.a(☃, a, ☃);
    
    List<aqt> ☃ = e;
    while (!☃.isEmpty())
    {
      int ☃ = ☃.nextInt(☃.size());
      aqt ☃ = (aqt)☃.remove(☃);
      ☃.a(☃, a, ☃);
    }
    c();
    a(☃, ☃, 48, 70);
  }
}
