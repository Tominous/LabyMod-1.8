import com.google.common.collect.Lists;
import java.util.List;

public class awy
  extends axu
{
  protected awx a;
  protected String f;
  private String r;
  private final List<String> s = Lists.newArrayList();
  protected String g;
  protected String h;
  protected int i;
  private int t;
  
  public awy(awx ☃, String ☃, String ☃, int ☃)
  {
    a = ☃;
    f = ☃;
    r = ☃;
    i = ☃;
    
    g = bnq.a("gui.yes", new Object[0]);
    h = bnq.a("gui.no", new Object[0]);
  }
  
  public awy(awx ☃, String ☃, String ☃, String ☃, String ☃, int ☃)
  {
    a = ☃;
    f = ☃;
    r = ☃;
    g = ☃;
    h = ☃;
    i = ☃;
  }
  
  public void b()
  {
    n.add(new awe(0, l / 2 - 155, m / 6 + 96, g));
    n.add(new awe(1, l / 2 - 155 + 160, m / 6 + 96, h));
    
    s.clear();
    s.addAll(q.c(r, l - 50));
  }
  
  protected void a(avs ☃)
  {
    a.a(k == 0, i);
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    a(q, f, l / 2, 70, 16777215);
    
    int ☃ = 90;
    for (String ☃ : s)
    {
      a(q, ☃, l / 2, ☃, 16777215);
      ☃ += q.a;
    }
    super.a(☃, ☃, ☃);
  }
  
  public void b(int ☃)
  {
    t = ☃;
    for (avs ☃ : n) {
      l = false;
    }
  }
  
  public void e()
  {
    super.e();
    if (--t == 0) {
      for (avs ☃ : n) {
        l = true;
      }
    }
  }
}
