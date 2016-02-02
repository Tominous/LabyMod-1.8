import java.util.List;

public class azz
  extends axu
{
  private static final avh.a[] a = { avh.a.F, avh.a.J, avh.a.I, avh.a.L, avh.a.G, avh.a.H, avh.a.O, avh.a.K };
  private static final avh.a[] f = { avh.a.M, avh.a.N };
  private final axu g;
  private final avh h;
  private String i;
  private String r;
  private int s;
  private boolean t = false;
  
  public azz(axu ☃, avh ☃)
  {
    this.g = ☃;
    this.h = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    this.i = bnq.a("options.stream.title", new Object[0]);
    this.r = bnq.a("options.stream.chat.title", new Object[0]);
    for (avh.a ☃ : a)
    {
      if (☃.a()) {
        this.n.add(new awj(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        this.n.add(new awe(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃, this.h.c(☃)));
      }
      ☃++;
    }
    if (☃ % 2 == 1) {
      ☃++;
    }
    this.s = (this.m / 6 + 24 * (☃ >> 1) + 6);
    ☃ += 2;
    for (avh.a ☃ : f)
    {
      if (☃.a()) {
        this.n.add(new awj(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        this.n.add(new awe(☃.c(), this.l / 2 - 155 + ☃ % 2 * 160, this.m / 6 + 24 * (☃ >> 1), ☃, this.h.c(☃)));
      }
      ☃++;
    }
    this.n.add(new avs(200, this.l / 2 - 155, this.m / 6 + 168, 150, 20, bnq.a("gui.done", new Object[0])));
    avs ☃ = new avs(201, this.l / 2 + 5, this.m / 6 + 168, 150, 20, bnq.a("options.stream.ingestSelection", new Object[0]));
    ☃.l = (((this.j.Y().j()) && (this.j.Y().s().length > 0)) || (this.j.Y().w()));
    this.n.add(☃);
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if ((☃.k < 100) && ((☃ instanceof awe)))
    {
      avh.a ☃ = ((awe)☃).c();
      this.h.a(☃, 1);
      ☃.j = this.h.c(avh.a.a(☃.k));
      if ((this.j.Y().k()) && (☃ != avh.a.M) && (☃ != avh.a.N)) {
        this.t = true;
      }
    }
    else if ((☃ instanceof awj))
    {
      if (☃.k == avh.a.G.c()) {
        this.j.Y().p();
      } else if (☃.k == avh.a.H.c()) {
        this.j.Y().p();
      } else if (this.j.Y().k()) {
        this.t = true;
      }
    }
    if (☃.k == 200)
    {
      this.j.t.b();
      this.j.a(this.g);
    }
    else if (☃.k == 201)
    {
      this.j.t.b();
      this.j.a(new azy(this));
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(this.q, this.i, this.l / 2, 20, 16777215);
    a(this.q, this.r, this.l / 2, this.s, 16777215);
    if (this.t) {
      a(this.q, a.m + bnq.a("options.stream.changes", new Object[0]), this.l / 2, 20 + this.q.a, 16777215);
    }
    super.a(☃, ☃, ☃);
  }
}
