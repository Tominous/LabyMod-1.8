import java.util.List;

public class aww
  extends awy
{
  private final String r;
  private final String s;
  private final String t;
  private boolean u = true;
  
  public aww(awx ☃, String ☃, int ☃, boolean ☃)
  {
    super(☃, bnq.a(☃ ? "chat.link.confirmTrusted" : "chat.link.confirm", new Object[0]), ☃, ☃);
    
    g = bnq.a(☃ ? "chat.link.open" : "gui.yes", new Object[0]);
    h = bnq.a(☃ ? "gui.cancel" : "gui.no", new Object[0]);
    s = bnq.a("chat.copy", new Object[0]);
    r = bnq.a("chat.link.warning", new Object[0]);
    t = ☃;
  }
  
  public void b()
  {
    super.b();
    n.clear();
    n.add(new avs(0, l / 2 - 50 - 105, m / 6 + 96, 100, 20, g));
    n.add(new avs(2, l / 2 - 50, m / 6 + 96, 100, 20, s));
    n.add(new avs(1, l / 2 - 50 + 105, m / 6 + 96, 100, 20, h));
  }
  
  protected void a(avs ☃)
  {
    if (k == 2) {
      a();
    }
    a.a(k == 0, i);
  }
  
  public void a()
  {
    e(t);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    super.a(☃, ☃, ☃);
    if (u) {
      a(q, r, l / 2, 110, 16764108);
    }
  }
  
  public void f()
  {
    u = false;
  }
}
