import com.google.common.collect.Lists;
import java.util.List;
import java.util.Random;

public class aqg$c
  extends aqt
{
  private List<aqe> a = Lists.newLinkedList();
  
  public aqg$c() {}
  
  public aqg$c(int ☃, Random ☃, int ☃, int ☃)
  {
    super(☃);
    
    this.l = new aqe(☃, 50, ☃, ☃ + 7 + ☃.nextInt(6), 54 + ☃.nextInt(6), ☃ + 7 + ☃.nextInt(6));
  }
  
  public void a(aqt ☃, List<aqt> ☃, Random ☃)
  {
    int ☃ = d();
    
    int ☃ = this.l.d() - 3 - 1;
    if (☃ <= 0) {
      ☃ = 1;
    }
    int ☃ = 0;
    while (☃ < this.l.c())
    {
      ☃ += ☃.nextInt(this.l.c());
      if (☃ + 3 > this.l.c()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃.nextInt(☃) + 1, this.l.c - 1, cq.c, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        this.a.add(new aqe(☃.a, ☃.b, this.l.c, ☃.d, ☃.e, this.l.c + 1));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < this.l.c())
    {
      ☃ += ☃.nextInt(this.l.c());
      if (☃ + 3 > this.l.c()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a + ☃, this.l.b + ☃.nextInt(☃) + 1, this.l.f + 1, cq.d, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        this.a.add(new aqe(☃.a, ☃.b, this.l.f - 1, ☃.d, ☃.e, this.l.f));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < this.l.e())
    {
      ☃ += ☃.nextInt(this.l.e());
      if (☃ + 3 > this.l.e()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, this.l.a - 1, this.l.b + ☃.nextInt(☃) + 1, this.l.c + ☃, cq.e, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        this.a.add(new aqe(this.l.a, ☃.b, ☃.c, this.l.a + 1, ☃.e, ☃.f));
      }
      ☃ += 4;
    }
    ☃ = 0;
    while (☃ < this.l.e())
    {
      ☃ += ☃.nextInt(this.l.e());
      if (☃ + 3 > this.l.e()) {
        break;
      }
      aqt ☃ = aqg.a(☃, ☃, ☃, this.l.d + 1, this.l.b + ☃.nextInt(☃) + 1, this.l.c + ☃, cq.f, ☃);
      if (☃ != null)
      {
        aqe ☃ = ☃.c();
        this.a.add(new aqe(this.l.d - 1, ☃.b, ☃.c, this.l.d, ☃.e, ☃.f));
      }
      ☃ += 4;
    }
  }
  
  public boolean a(adm ☃, Random ☃, aqe ☃)
  {
    if (a(☃, ☃)) {
      return false;
    }
    a(☃, ☃, this.l.a, this.l.b, this.l.c, this.l.d, this.l.b, this.l.f, afi.d.Q(), afi.a.Q(), true);
    
    a(☃, ☃, this.l.a, this.l.b + 1, this.l.c, this.l.d, Math.min(this.l.b + 3, this.l.e), this.l.f, afi.a.Q(), afi.a.Q(), false);
    for (aqe ☃ : this.a) {
      a(☃, ☃, ☃.a, ☃.e - 2, ☃.c, ☃.d, ☃.e, ☃.f, afi.a.Q(), afi.a.Q(), false);
    }
    a(☃, ☃, this.l.a, this.l.b + 4, this.l.c, this.l.d, this.l.e, this.l.f, afi.a.Q(), false);
    
    return true;
  }
  
  public void a(int ☃, int ☃, int ☃)
  {
    super.a(☃, ☃, ☃);
    for (aqe ☃ : this.a) {
      ☃.a(☃, ☃, ☃);
    }
  }
  
  protected void a(dn ☃)
  {
    du ☃ = new du();
    for (aqe ☃ : this.a) {
      ☃.a(☃.g());
    }
    ☃.a("Entrances", ☃);
  }
  
  protected void b(dn ☃)
  {
    du ☃ = ☃.c("Entrances", 11);
    for (int ☃ = 0; ☃ < ☃.c(); ☃++) {
      this.a.add(new aqe(☃.c(☃)));
    }
  }
}
