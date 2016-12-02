import com.google.common.collect.Sets;
import java.util.LinkedList;
import java.util.Random;
import java.util.Set;

public class aqk$a
  extends aqu
{
  private Set<adg> c = Sets.newHashSet();
  private boolean d;
  
  public aqk$a() {}
  
  public aqk$a(adm ☃, Random ☃, int ☃, int ☃)
  {
    super(☃, ☃);
    b(☃, ☃, ☃, ☃);
  }
  
  private void b(adm ☃, Random ☃, int ☃, int ☃)
  {
    ☃.setSeed(☃.J());
    long ☃ = ☃.nextLong();
    long ☃ = ☃.nextLong();
    long ☃ = ☃ * ☃;
    long ☃ = ☃ * ☃;
    ☃.setSeed(☃ ^ ☃ ^ ☃.J());
    
    int ☃ = ☃ * 16 + 8 - 29;
    int ☃ = ☃ * 16 + 8 - 29;
    cq ☃ = cq.c.a.a(☃);
    
    a.add(new aql.h(☃, ☃, ☃, ☃));
    c();
    
    d = true;
  }
  
  public void a(adm ☃, Random ☃, aqe ☃)
  {
    if (!d)
    {
      a.clear();
      b(☃, ☃, e(), f());
    }
    super.a(☃, ☃, ☃);
  }
  
  public boolean a(adg ☃)
  {
    if (c.contains(☃)) {
      return false;
    }
    return super.a(☃);
  }
  
  public void b(adg ☃)
  {
    super.b(☃);
    
    c.add(☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    
    du ☃ = new du();
    for (adg ☃ : c)
    {
      dn ☃ = new dn();
      ☃.a("X", a);
      ☃.a("Z", b);
      ☃.a(☃);
    }
    ☃.a("Processed", ☃);
  }
  
  public void b(dn ☃)
  {
    super.b(☃);
    if (☃.b("Processed", 9))
    {
      du ☃ = ☃.c("Processed", 10);
      for (int ☃ = 0; ☃ < ☃.c(); ☃++)
      {
        dn ☃ = ☃.b(☃);
        c.add(new adg(☃.f("X"), ☃.f("Z")));
      }
    }
  }
}
