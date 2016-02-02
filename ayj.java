import java.util.List;

public class ayj
  extends axu
{
  private static final avh.a[] h = { avh.a.a, avh.a.b, avh.a.y };
  private axu i;
  protected String a = "Controls";
  private avh r;
  public avb f = null;
  public long g;
  private ayi s;
  private avs t;
  
  public ayj(axu ☃, avh ☃)
  {
    this.i = ☃;
    this.r = ☃;
  }
  
  public void b()
  {
    this.s = new ayi(this, this.j);
    this.n.add(new avs(200, this.l / 2 - 155, this.m - 29, 150, 20, bnq.a("gui.done", new Object[0])));
    this.n.add(this.t = new avs(201, this.l / 2 - 155 + 160, this.m - 29, 150, 20, bnq.a("controls.resetAll", new Object[0])));
    this.a = bnq.a("controls.title", new Object[0]);
    
    int ☃ = 0;
    for (avh.a ☃ : h)
    {
      if (☃.a()) {
        this.n.add(new awj(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, 18 + 24 * (☃ >> 1), ☃));
      } else {
        this.n.add(new awe(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, 18 + 24 * (☃ >> 1), ☃, this.r.c(☃)));
      }
      ☃++;
    }
  }
  
  public void k()
  {
    super.k();
    this.s.p();
  }
  
  protected void a(avs ☃)
  {
    if (☃.k == 200)
    {
      this.j.a(this.i);
    }
    else if (☃.k == 201)
    {
      for (avb ☃ : this.j.t.aw) {
        ☃.b(☃.h());
      }
      avb.b();
    }
    else if ((☃.k < 100) && ((☃ instanceof awe)))
    {
      this.r.a(((awe)☃).c(), 1);
      ☃.j = this.r.c(avh.a.a(☃.k));
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    if (this.f != null)
    {
      this.r.a(this.f, -100 + ☃);
      this.f = null;
      avb.b();
    }
    else if ((☃ != 0) || (!this.s.b(☃, ☃, ☃)))
    {
      super.a(☃, ☃, ☃);
    }
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    if ((☃ != 0) || (!this.s.c(☃, ☃, ☃))) {
      super.b(☃, ☃, ☃);
    }
  }
  
  protected void a(char ☃, int ☃)
  {
    if (this.f != null)
    {
      if (☃ == 1) {
        this.r.a(this.f, 0);
      } else if (☃ != 0) {
        this.r.a(this.f, ☃);
      } else if (☃ > 0) {
        this.r.a(this.f, ☃ + 'Ā');
      }
      this.f = null;
      this.g = ave.J();
      avb.b();
    }
    else
    {
      super.a(☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    this.s.a(☃, ☃, ☃);
    a(this.q, this.a, this.l / 2, 8, 16777215);
    
    boolean ☃ = true;
    for (avb ☃ : this.r.aw) {
      if (☃.i() != ☃.h())
      {
        ☃ = false;
        break;
      }
    }
    this.t.l = (!☃);
    
    super.a(☃, ☃, ☃);
  }
}
