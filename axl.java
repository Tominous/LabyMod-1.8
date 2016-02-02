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
    this.a = ☃;
    this.g = ☃;
    this.h = ☃;
  }
  
  public void b()
  {
    this.n.add(this.i = new awe(100, this.l / 2 - 155, this.m - 38, avh.a.E, this.g.c(avh.a.E)));
    this.n.add(this.r = new awe(6, this.l / 2 - 155 + 160, this.m - 38, bnq.a("gui.done", new Object[0])));
    
    this.f = new axl.a(this.j);
    this.f.d(7, 8);
  }
  
  public void k()
  {
    super.k();
    this.f.p();
  }
  
  protected void a(avs ☃)
  {
    if (!☃.l) {
      return;
    }
    switch (☃.k)
    {
    case 100: 
      if ((☃ instanceof awe))
      {
        this.g.a(((awe)☃).c(), 1);
        ☃.j = this.g.c(avh.a.E);
        
        avr ☃ = new avr(this.j);
        int ☃ = ☃.a();
        int ☃ = ☃.b();
        a(this.j, ☃, ☃);
      }
      break;
    case 5: 
      break;
    case 6: 
      this.j.a(this.a);
      break;
    default: 
      this.f.a(☃);
    }
  }
  
  public void a(int ☃, int ☃, float ☃)
  {
    this.f.a(☃, ☃, ☃);
    
    a(this.q, bnq.a("options.language", new Object[0]), this.l / 2, 16, 16777215);
    a(this.q, "(" + bnq.a("options.languageWarning", new Object[0]) + ")", this.l / 2, this.m - 56, 8421504);
    
    super.a(☃, ☃, ☃);
  }
  
  class a
    extends awi
  {
    private final List<String> v = Lists.newArrayList();
    private final Map<String, bnr> w = Maps.newHashMap();
    
    public a(ave ☃)
    {
      super(axl.this.l, axl.this.m, 32, axl.this.m - 65 + 4, 18);
      for (bnr ☃ : axl.a(axl.this).d())
      {
        this.w.put(☃.a(), ☃);
        this.v.add(☃.a());
      }
    }
    
    protected int b()
    {
      return this.v.size();
    }
    
    protected void a(int ☃, boolean ☃, int ☃, int ☃)
    {
      bnr ☃ = (bnr)this.w.get(this.v.get(☃));
      
      axl.a(axl.this).a(☃);
      axl.b(axl.this).aM = ☃.a();
      
      this.a.e();
      
      axl.this.q.a((axl.a(axl.this).a()) || (axl.b(axl.this).aN));
      axl.this.q.b(axl.a(axl.this).b());
      
      axl.c(axl.this).j = bnq.a("gui.done", new Object[0]);
      axl.d(axl.this).j = axl.b(axl.this).c(avh.a.E);
      axl.b(axl.this).b();
    }
    
    protected boolean a(int ☃)
    {
      return ((String)this.v.get(☃)).equals(axl.a(axl.this).c().a());
    }
    
    protected int k()
    {
      return b() * 18;
    }
    
    protected void a()
    {
      axl.this.c();
    }
    
    protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      axl.this.q.b(true);
      axl.this.a(axl.this.q, ((bnr)this.w.get(this.v.get(☃))).toString(), this.b / 2, ☃ + 1, 16777215);
      axl.this.q.b(axl.a(axl.this).c().b());
    }
  }
}
