import java.util.List;

public class ayb
  extends axu
{
  private axu f;
  protected String a = "Video Settings";
  private avh g;
  private awd h;
  private static final avh.a[] i = { avh.a.l, avh.a.f, avh.a.m, avh.a.i, avh.a.h, avh.a.g, avh.a.n, avh.a.d, avh.a.k, avh.a.o, avh.a.v, avh.a.w, avh.a.D, avh.a.P, avh.a.x, avh.a.R };
  
  public ayb(axu ☃, avh ☃)
  {
    this.f = ☃;
    this.g = ☃;
  }
  
  public void b()
  {
    this.a = bnq.a("options.videoTitle", new Object[0]);
    this.n.clear();
    
    this.n.add(new avs(200, this.l / 2 - 100, this.m - 27, bnq.a("gui.done", new Object[0])));
    if (!bqs.P)
    {
      avh.a[] ☃ = new avh.a[i.length - 1];
      int ☃ = 0;
      for (avh.a ☃ : i)
      {
        if (☃ == avh.a.x) {
          break;
        }
        ☃[☃] = ☃;
        ☃++;
      }
      this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, ☃);
    }
    else
    {
      this.h = new awf(this.j, this.l, this.m, 32, this.m - 32, 25, i);
    }
  }
  
  public void k()
  {
    super.k();
    this.h.p();
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 200)
    {
      this.j.t.b();
      this.j.a(this.f);
    }
  }
  
  protected void a(int ☃, int ☃, int ☃)
  {
    int ☃ = this.g.aK;
    
    super.a(☃, ☃, ☃);
    this.h.b(☃, ☃, ☃);
    if (this.g.aK != ☃)
    {
      avr ☃ = new avr(this.j);
      int ☃ = ☃.a();
      int ☃ = ☃.b();
      a(this.j, ☃, ☃);
    }
  }
  
  protected void b(int ☃, int ☃, int ☃)
  {
    int ☃ = this.g.aK;
    
    super.b(☃, ☃, ☃);
    this.h.c(☃, ☃, ☃);
    if (this.g.aK != ☃)
    {
      avr ☃ = new avr(this.j);
      int ☃ = ☃.a();
      int ☃ = ☃.b();
      a(this.j, ☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    this.h.a(☃, ☃, ☃);
    
    a(this.q, this.a, this.l / 2, 5, 16777215);
    
    super.a(☃, ☃, ☃);
  }
}
