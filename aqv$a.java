import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class aqv$a
  extends aqu
{
  private boolean c;
  
  public aqv$a() {}
  
  public aqv$a(adm ☃, Random ☃, int ☃, int ☃, int ☃)
  {
    super(☃, ☃);
    
    List<aqw.e> ☃ = aqw.a(☃, ☃);
    
    aqw.k ☃ = new aqw.k(☃.v(), 0, ☃, (☃ << 4) + 2, (☃ << 4) + 2, ☃, ☃);
    this.a.add(☃);
    ☃.a(☃, this.a, ☃);
    
    List<aqt> ☃ = ☃.g;
    List<aqt> ☃ = ☃.f;
    while ((!☃.isEmpty()) || (!☃.isEmpty())) {
      if (☃.isEmpty())
      {
        int ☃ = ☃.nextInt(☃.size());
        aqt ☃ = (aqt)☃.remove(☃);
        ☃.a(☃, this.a, ☃);
      }
      else
      {
        int ☃ = ☃.nextInt(☃.size());
        aqt ☃ = (aqt)☃.remove(☃);
        ☃.a(☃, this.a, ☃);
      }
    }
    c();
    
    int ☃ = 0;
    for (aqt ☃ : this.a) {
      if (!(☃ instanceof aqw.o)) {
        ☃++;
      }
    }
    this.c = (☃ > 2);
  }
  
  public boolean d()
  {
    return this.c;
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    ☃.a("Valid", this.c);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    this.c = ☃.n("Valid");
  }
}
