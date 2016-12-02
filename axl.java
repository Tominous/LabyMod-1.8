import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

public class axl
  extends axu
{
  protected axu a;
  private axl.a f;
  private final avh g;
  private final bns h;
  private awe i;
  private awe r;
  
  public axl(axu ☃, avh ☃, bns ☃)
  {
    a = ☃;
    g = ☃;
    h = ☃;
  }
  
  public void b()
  {
    n.add(i = new awe(100, l / 2 - 155, m - 38, avh.a.E, g.c(avh.a.E)));
    n.add(r = new awe(6, l / 2 - 155 + 160, m - 38, bnq.a("gui.done", new Object[0])));
    
    f = new axl.a(j);
    f.d(7, 8);
  }
  
  public void k()
  {
    super.k();
    f.p();
  }
  
  protected void a(avs ☃)
  {
    if (!l) {
      return;
    }
    switch (k)
    {
    case 100: 
      if ((☃ instanceof awe))
      {
        g.a(((awe)☃).c(), 1);
        j = g.c(avh.a.E);
        
        avr ☃ = new avr(j);
        int ☃ = ☃.a();
        int ☃ = ☃.b();
        a(j, ☃, ☃);
      }
      break;
    case 5: 
      break;
    case 6: 
      j.a(a);
      break;
    default: 
      f.a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    f.a(☃, ☃, ☃);
    
    a(q, bnq.a("options.language", new Object[0]), l / 2, 16, 16777215);
    a(q, "(" + bnq.a("options.languageWarning", new Object[0]) + ")", l / 2, m - 56, 8421504);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    private final List<String> v = Lists.newArrayList();
    private final Map<String, bnr> w = Maps.newHashMap();
    
    public a(ave ☃)
    {
      super(l, m, 32, m - 65 + 4, 18);
      for (bnr ☃ : axl.a(axl.this).d())
      {
        w.put(☃.a(), ☃);
        v.add(☃.a());
      }
    }
    
    protected int b()
    {
      return v.size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      bnr ☃ = (bnr)w.get(v.get(☃));
      
      axl.a(axl.this).a(☃);
      baM = ☃.a();
      
      a.e();
      
      q.a((axl.a(axl.this).a()) || (baN));
      q.b(axl.a(axl.this).b());
      
      cj = bnq.a("gui.done", new Object[0]);
      dj = axl.b(axl.this).c(avh.a.E);
      axl.b(axl.this).b();
    }
    
    protected boolean a(int ☃)
    {
      return ((String)v.get(☃)).equals(axl.a(axl.this).c().a());
    }
    
    protected int k()
    {
      return b() * 18;
    }
    
    protected void a()
    {
      c();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      q.b(true);
      a(q, ((bnr)w.get(v.get(☃))).toString(), b / 2, ☃ + 1, 16777215);
      q.b(axl.a(axl.this).c().b());
    }
  }
}
