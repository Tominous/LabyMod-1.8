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
    f = ☃;
    g = ☃;
  }
  
  public void b()
  {
    int ☃ = 0;
    h = bnq.a("options.chat.title", new Object[0]);
    for (avh.a ☃ : a)
    {
      if (☃.a()) {
        n.add(new awj(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃));
      } else {
        n.add(new awe(☃.c(), l / 2 - 155 + ☃ % 2 * 160, m / 6 + 24 * (☃ >> 1), ☃, g.c(☃)));
      }
      ☃++;
    }
    n.add(new avs(200, l / 2 - 100, m / 6 + 120, bnq.a("gui.done", new Object[0])));
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if ((k < 100) && ((☃ instanceof awe)))
    {
      g.a(((awe)☃).c(), 1);
      j = g.c(avh.a.a(k));
    }
    if (k == 200)
    {
      j.t.b();
      j.a(f);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    a(q, h, l / 2, 20, 16777215);
    
    super.a(☃, ☃, ☃);
  }
}
