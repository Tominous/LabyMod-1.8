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
    this.c = ☃;
    this.d = ☃;
  }
  
  public aqe a()
  {
    return this.b;
  }
  
  public LinkedList<aqt> b()
  {
    return this.a;
  }
  
  public void a(adm ☃, Random ☃, aqe ☃)
  {
    Iterator<aqt> ☃ = this.a.iterator();
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
    this.b = aqe.a();
    for (aqt ☃ : this.a) {
      this.b.b(☃.c());
    }
  }
  
  public dn a(int ☃, int ☃)
  {
    dn ☃ = new dn();
    
    ☃.a("id", aqr.a(this));
    ☃.a("ChunkX", ☃);
    ☃.a("ChunkZ", ☃);
    ☃.a("BB", this.b.g());
    
    du ☃ = new du();
    for (aqt ☃ : this.a) {
      ☃.a(☃.b());
    }
    ☃.a("Children", ☃);
    
    a(☃);
    
    return ☃;
  }
  
  public void a(dn ☃) {}
  
  public void a(adm ☃, dn ☃)
  {
    this.c = ☃.f("ChunkX");
    this.d = ☃.f("ChunkZ");
    if (☃.c("BB")) {
      this.b = new aqe(☃.l("BB"));
    }
    du ☃ = ☃.c("Children", 10);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      this.a.add(aqr.b(☃.b(☃), ☃));
    }
    b(☃);
  }
  
  public void b(dn ☃) {}
  
  protected void a(adm ☃, Random ☃, int ☃)
  {
    int ☃ = ☃.F() - ☃;
    
    int ☃ = this.b.d() + 1;
    if (☃ < ☃) {
      ☃ += ☃.nextInt(☃ - ☃);
    }
    int ☃ = ☃ - this.b.e;
    this.b.a(0, ☃, 0);
    for (aqt ☃ : this.a) {
      ☃.a(0, ☃, 0);
    }
  }
  
  protected void a(adm ☃, Random ☃, int ☃, int ☃)
  {
    int ☃ = ☃ - ☃ + 1 - this.b.d();
    int ☃ = 1;
    if (☃ > 1) {
      ☃ = ☃ + ☃.nextInt(☃);
    } else {
      ☃ = ☃;
    }
    int ☃ = ☃ - this.b.b;
    this.b.a(0, ☃, 0);
    for (aqt ☃ : this.a) {
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
    return this.c;
  }
  
  public int f()
  {
    return this.d;
  }
}
