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
    super(☃, l, m, 32, m - 65 + 4, 18);
    for (bnr ☃ : axl.a(???).d())
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
    
    axl.a(u).a(☃);
    bu).aM = ☃.a();
    
    a.e();
    
    u.q.a((axl.a(u).a()) || (bu).aN));
    u.q.b(axl.a(u).b());
    
    cu).j = bnq.a("gui.done", new Object[0]);
    du).j = axl.b(u).c(avh.a.E);
    axl.b(u).b();
  }
  
  protected boolean a(int ☃)
  {
    return ((String)v.get(☃)).equals(axl.a(u).c().a());
  }
  
  protected int k()
  {
    return b() * 18;
  }
  
  protected void a()
  {
    u.c();
  }
  
  protected void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    u.q.b(true);
    u.a(u.q, ((bnr)w.get(v.get(☃))).toString(), b / 2, ☃ + 1, 16777215);
    u.q.b(axl.a(u).c().b());
  }
}
