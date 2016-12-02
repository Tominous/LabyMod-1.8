import com.google.common.collect.Lists;
import java.util.List;
import java.util.Map.Entry;
import java.util.TreeMap;

public class axy
  extends axu
{
  private final axu a;
  private final avh f;
  private final List<String> g = Lists.newArrayList();
  private final List<String> h = Lists.newArrayList();
  private String i;
  private String[] r;
  private axy.a s;
  private avs t;
  
  public axy(axu ☃, avh ☃)
  {
    a = ☃;
    f = ☃;
  }
  
  public void b()
  {
    i = bnq.a("options.snooper.title", new Object[0]);
    String ☃ = bnq.a("options.snooper.desc", new Object[0]);
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : q.c(☃, l - 30)) {
      ☃.add(☃);
    }
    r = ((String[])☃.toArray(new String[☃.size()]));
    
    g.clear();
    h.clear();
    
    n.add(t = new avs(1, l / 2 - 152, m - 30, 150, 20, f.c(avh.a.u)));
    n.add(new avs(2, l / 2 + 2, m - 30, 150, 20, bnq.a("gui.done", new Object[0])));
    
    boolean ☃ = (j.G() != null) && (j.G().av() != null);
    for (Map.Entry<String, String> ☃ : new TreeMap(j.I().c()).entrySet())
    {
      g.add((☃ ? "C " : "") + (String)☃.getKey());
      h.add(q.a((String)☃.getValue(), l - 220));
    }
    if (☃) {
      for (Map.Entry<String, String> ☃ : new TreeMap(j.G().av().c()).entrySet())
      {
        g.add("S " + (String)☃.getKey());
        h.add(q.a((String)☃.getValue(), l - 220));
      }
    }
    s = new axy.a();
  }
  
  public void k()
  {
    super.k();
    s.p();
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    if (k == 2)
    {
      f.b();
      f.b();
      j.a(a);
    }
    if (k == 1)
    {
      f.a(avh.a.u, 1);
      t.j = f.c(avh.a.u);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    s.a(☃, ☃, ☃);
    a(q, i, l / 2, 8, 16777215);
    
    int ☃ = 22;
    for (String ☃ : r)
    {
      a(q, ☃, l / 2, ☃, 8421504);
      ☃ += q.a;
    }
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a()
    {
      super(l, m, 80, m - 40, q.a + 1);
    }
    
    protected int b()
    {
      return axy.a(axy.this).size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃) {}
    
    protected boolean a(int ☃)
    {
      return false;
    }
    
    protected void a() {}
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      q.a((String)axy.a(axy.this).get(☃), 10, ☃, 16777215);
      
      q.a((String)axy.b(axy.this).get(☃), 230, ☃, 16777215);
    }
    
    protected int d()
    {
      return b - 10;
    }
  }
}
