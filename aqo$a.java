import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class aqo$a
  extends aqu
{
  public aqo$a() {}
  
  public aqo$a(adm ☃, Random ☃, int ☃, int ☃)
  {
    super(☃, ☃);
    
    aqp.b();
    
    aqp.m ☃ = new aqp.m(0, ☃, (☃ << 4) + 2, (☃ << 4) + 2);
    this.a.add(☃);
    ☃.a(☃, this.a, ☃);
    
    List<aqt> ☃ = ☃.c;
    while (!☃.isEmpty())
    {
      int ☃ = ☃.nextInt(☃.size());
      aqt ☃ = (aqt)☃.remove(☃);
      ☃.a(☃, this.a, ☃);
    }
    c();
    a(☃, ☃, 10);
  }
}
