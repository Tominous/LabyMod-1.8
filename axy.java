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
    this.a = ☃;
    this.f = ☃;
  }
  
  public void b()
  {
    this.i = bnq.a("options.snooper.title", new Object[0]);
    String ☃ = bnq.a("options.snooper.desc", new Object[0]);
    List<String> ☃ = Lists.newArrayList();
    for (String ☃ : this.q.c(☃, this.l - 30)) {
      ☃.add(☃);
    }
    this.r = ((String[])☃.toArray(new String[☃.size()]));
    
    this.g.clear();
    this.h.clear();
    
    this.n.add(this.t = new avs(1, this.l / 2 - 152, this.m - 30, 150, 20, this.f.c(avh.a.u)));
    this.n.add(new avs(2, this.l / 2 + 2, this.m - 30, 150, 20, bnq.a("gui.done", new Object[0])));
    
    boolean ☃ = (this.j.G() != null) && (this.j.G().av() != null);
    for (Map.Entry<String, String> ☃ : new TreeMap(this.j.I().c()).entrySet())
    {
      this.g.add((☃ ? "C " : "") + (String)☃.getKey());
      this.h.add(this.q.a((String)☃.getValue(), this.l - 220));
    }
    if (☃) {
      for (Map.Entry<String, String> ☃ : new TreeMap(this.j.G().av().c()).entrySet())
      {
        this.g.add("S " + (String)☃.getKey());
        this.h.add(this.q.a((String)☃.getValue(), this.l - 220));
      }
    }
    this.s = new axy.a();
  }
  
  public void k()
  {
    super.k();
    this.s.p();
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    if (☃.k == 2)
    {
      this.f.b();
      this.f.b();
      this.j.a(this.a);
    }
    if (☃.k == 1)
    {
      this.f.a(avh.a.u, 1);
      this.t.j = this.f.c(avh.a.u);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    c();
    
    this.s.a(☃, ☃, ☃);
    a(this.q, this.i, this.l / 2, 8, 16777215);
    
    int ☃ = 22;
    for (String ☃ : this.r)
    {
      a(this.q, ☃, this.l / 2, ☃, 8421504);
      ☃ += this.q.a;
    }
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    public a()
    {
      super(axy.this.l, axy.this.m, 80, axy.this.m - 40, axy.this.q.a + 1);
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
      axy.this.q.a((String)axy.a(axy.this).get(☃), 10, ☃, 16777215);
      
      axy.this.q.a((String)axy.b(axy.this).get(☃), 230, ☃, 16777215);
    }
    
    protected int d()
    {
      return this.b - 10;
    }
  }
}
