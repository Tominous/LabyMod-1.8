import java.util.List;
import java.util.Random;

public class aqp$b
  extends aqp.p
{
  private int a;
  
  public aqp$b() {}
  
  public aqp$b(int ☃, Random ☃, aqe ☃, cq ☃)
  {
    super(☃);
    
    this.m = ☃;
    this.l = ☃;
    this.a = ((☃ == cq.c) || (☃ == cq.d) ? ☃.e() : ☃.c());
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    ☃.a("Steps", this.a);
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a = ☃.f("Steps");
  }
  
  public static aqe a(List<aqt> ☃, Random ☃, int ☃, int ☃, int ☃, cq ☃)
  {
    int ☃ = 3;
    
    aqe ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, 4, ☃);
    
    aqt ☃ = aqt.a(☃, ☃);
    if (☃ == null) {
      return null;
    }
    if (☃.c().b == ☃.b) {
      for (int ☃ = 3; ☃ >= 1; ☃--)
      {
        ☃ = aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, ☃ - 1, ☃);
        if (!☃.c().a(☃)) {
          return aqe.a(☃, ☃, ☃, -1, -1, 0, 5, 5, ☃, ☃);
        }
      }
    }
    return null;
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    for (int ☃ = 0; ☃ < this.a; ☃++)
    {
      a(☃, afi.bf.Q(), 0, 0, ☃, ☃);
      a(☃, afi.bf.Q(), 1, 0, ☃, ☃);
      a(☃, afi.bf.Q(), 2, 0, ☃, ☃);
      a(☃, afi.bf.Q(), 3, 0, ☃, ☃);
      a(☃, afi.bf.Q(), 4, 0, ☃, ☃);
      for (int ☃ = 1; ☃ <= 3; ☃++)
      {
        a(☃, afi.bf.Q(), 0, ☃, ☃, ☃);
        a(☃, afi.a.Q(), 1, ☃, ☃, ☃);
        a(☃, afi.a.Q(), 2, ☃, ☃, ☃);
        a(☃, afi.a.Q(), 3, ☃, ☃, ☃);
        a(☃, afi.bf.Q(), 4, ☃, ☃, ☃);
      }
      a(☃, afi.bf.Q(), 0, 4, ☃, ☃);
      a(☃, afi.bf.Q(), 1, 4, ☃, ☃);
      a(☃, afi.bf.Q(), 2, 4, ☃, ☃);
      a(☃, afi.bf.Q(), 3, 4, ☃, ☃);
      a(☃, afi.bf.Q(), 4, 4, ☃, ☃);
    }
    return true;
  }
}
