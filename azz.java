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
    g = ☃;
    h = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    i = bnq.a("options.stream.title", new Object[0]);
    r = bnq.a("options.stream.chat.title", new Object[0]);
    for (avh.a ☃ : a)
    {
      if (☃.a()) {
        n.add(new awj(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        n.add(new awe(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃, h.c(☃)));
      }
      ☃++;
    }
    if (☃ % 2 == 1) {
      ☃++;
    }
    s = (m / 6 + 24 * (☃ >> 1) + 6);
    ☃ += 2;
    for (avh.a ☃ : f)
    {
      if (☃.a()) {
        n.add(new awj(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        n.add(new awe(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃, h.c(☃)));
      }
      ☃++;
    }
    n.add(new avs(200, l / 2 - 155, m / 6 + 168, 150, 20, bnq.a("gui.done", new Object[0])));
    avs ☃ = new avs(201, l / 2 + 5, m / 6 + 168, 150, 20, bnq.a("options.stream.ingestSelection", new Object[0]));
    l = (((j.Y().j()) && (j.Y().s().length > 0)) || (j.Y().w()));
    n.add(☃);
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if ((k < 100) && ((☃ instanceof awe)))
    {
      avh.a ☃ = ((awe)☃).c();
      h.a(☃, 1);
      j = h.c(avh.a.a(k));
      if ((j.Y().k()) && (☃ != avh.a.M) && (☃ != avh.a.N)) {
        t = true;
      }
    }
    else if ((☃ instanceof awj))
    {
      if (k == avh.a.G.c()) {
        j.Y().p();
      } else if (k == avh.a.H.c()) {
        j.Y().p();
      } else if (j.Y().k()) {
        t = true;
      }
    }
    if (k == 200)
    {
      j.t.b();
      j.a(g);
    }
    else if (k == 201)
    {
      j.t.b();
      j.a(new azy(this));
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(q, i, l / 2, 20, 16777215);
    a(q, r, l / 2, s, 16777215);
    if (t) {
      a(q, a.m + bnq.a("options.stream.changes", new Object[0]), l / 2, 20 + q.a, 16777215);
    }
    super.a(☃, ☃, ☃);
  }
}
