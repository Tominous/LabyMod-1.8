import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import java.util.List;
import java.util.Map;

class axl$a
  extends awi
{
  private final List<String> v = Lists.newArrayList();
  private final Map<String, bnr> w = Maps.newHashMap();
  
  public axl$a(axl arg1, ave ☃)
  {
    super(☃, ???.l, ???.m, 32, ???.m - 65 + 4, 18);
    for (bnr ☃ : axl.a(???).d())
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
    
    axl.a(this.u).a(☃);
    axl.b(this.u).aM = ☃.a();
    
    this.a.e();
    
    this.u.q.a((axl.a(this.u).a()) || (axl.b(this.u).aN));
    this.u.q.b(axl.a(this.u).b());
    
    axl.c(this.u).j = bnq.a("gui.done", new Object[0]);
    axl.d(this.u).j = axl.b(this.u).c(avh.a.E);
    axl.b(this.u).b();
  }
  
  protected boolean a(int ☃)
  {
    return ((String)this.v.get(☃)).equals(axl.a(this.u).c().a());
  }
  
  protected int k()
  {
    return b() * 18;
  }
  
  protected void a()
  {
    this.u.c();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    this.u.q.b(true);
    this.u.a(this.u.q, ((bnr)this.w.get(this.v.get(☃))).toString(), this.b / 2, ☃ + 1, 16777215);
    this.u.q.b(axl.a(this.u).c().b());
  }
}
