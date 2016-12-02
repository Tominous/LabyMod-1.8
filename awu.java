import java.util.List;

public class awu
  extends axu
{
  private static final avh.a[] a = { avh.a.p, avh.a.q, avh.a.r, avh.a.s, avh.a.t, avh.a.z, avh.a.B, avh.a.C, avh.a.A, avh.a.Q };
  private final axu f;
  private final avh g;
  private String h;
  
  public awu(axu ☃, avh ☃)
  {
    this.f = ☃;
    this.g = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    this.h = bnq.a("options.chat.title", new Object[0]);
    for (avh.a ☃ : a)
    {
      if (☃.a()) {
        this.n.add(new awj(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        this.n.add(new awe(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃, this.g.c(☃)));
      }
      ☃++;
    }
    this.n.add(new avs(200, this.l / 2 - 100, this.m / 6 + 120, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if ((☃.k < 100) && ((☃ instanceof awe)))
    {
      this.g.a(((awe)☃).c(), 1);
      ☃.j = this.g.c(avh.a.a(☃.k));
    }
    if (☃.k == 200)
    {
      this.j.t.b();
      this.j.a(this.f);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(this.q, this.h, this.l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
}
