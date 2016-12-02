import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;

public abstract class aqu
{
  protected LinkedList<aqt> a = new LinkedList();
  protected aqe b;
  private int c;
  private int d;
  
  public aqu() {}
  
  public aqu(int ☃, int ☃)
  {
    c = ☃;
    d = ☃;
  }
  
  public aqe a()
  {
    return b;
  }
  
  public LinkedList<aqt> b()
  {
    return a;
  }
  
  public void a(adm ☃, Random ☃, aqe ☃)
  {
    Iterator<aqt> ☃ = a.iterator();
    while (☃.hasNext())
    {
      aqt ☃ = (aqt)☃.next();
      if ((☃.c().a(☃)) && 
        (!☃.a(☃, ☃, ☃))) {
        ☃.remove();
      }
    }
  }
  
  protected void c()
  {
    b = aqe.a();
    for (aqt ☃ : a) {
      b.b(☃.c());
    }
  }
  
  public dn a(int ☃, int ☃)
  {
    dn ☃ = new dn();
    
    ☃.a("id", aqr.a(this));
    ☃.a("ChunkX", ☃);
    ☃.a("ChunkZ", ☃);
    ☃.a("BB", b.g());
    
    du ☃ = new du();
    for (aqt ☃ : a) {
      ☃.a(☃.b());
    }
    ☃.a("Children", ☃);
    
    a(☃);
    
    return ☃;
  }
  
  public void a(dn ☃) {}
  
  public void a(adm ☃, dn ☃)
  {
    c = ☃.f("ChunkX");
    d = ☃.f("ChunkZ");
    if (☃.c("BB")) {
      b = new aqe(☃.l("BB"));
    }
    du ☃ = ☃.c("Children", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      a.add(aqr.b(☃.b(☃), ☃));
    }
    b(☃);
  }
  
  public void b(dn ☃) {}
  
  protected void a(adm ☃, Random ☃, int ☃)
  {
    int ☃ = ☃.F() - ☃;
    
    int ☃ = b.d() + 1;
    if (☃ < ☃) {
      ☃ += ☃.nextInt(☃ - ☃);
    }
    int ☃ = ☃ - b.e;
    b.a(0, ☃, 0);
    for (aqt ☃ : a) {
      ☃.a(0, ☃, 0);
    }
  }
  
  protected void a(adm ☃, Random ☃, int ☃, int ☃)
  {
    int ☃ = ☃ - ☃ + 1 - b.d();
    int ☃ = 1;
    if (☃ > 1) {
      ☃ = ☃ + ☃.nextInt(☃);
    } else {
      ☃ = ☃;
    }
    int ☃ = ☃ - b.b;
    b.a(0, ☃, 0);
    for (aqt ☃ : a) {
      ☃.a(0, ☃, 0);
    }
  }
  
  public boolean d()
  {
    return true;
  }
  
  public boolean a(adg ☃)
  {
    return true;
  }
  
  public void b(adg ☃) {}
  
  public int e()
  {
    return c;
  }
  
  public int f()
  {
    return d;
  }
}
