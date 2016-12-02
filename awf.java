import com.google.common.collect.Lists;
import java.util.List;

public class awf
  extends awd
{
  private final List<awf.a> u = Lists.newArrayList();
  
  public awf(ave ☃, int ☃, int ☃, int ☃, int ☃, int ☃, avh.a... ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    k = false;
    for (int ☃ = 0; ☃ < ☃.length; ☃ += 2)
    {
      avh.a ☃ = ☃[☃];
      avh.a ☃ = ☃ < ☃.length - 1 ? ☃[(☃ + 1)] : null;
      avs ☃ = a(☃, ☃ / 2 - 155, 0, ☃);
      avs ☃ = a(☃, ☃ / 2 - 155 + 160, 0, ☃);
      
      u.add(new awf.a(☃, ☃));
    }
  }
  
  private avs a(ave ☃, int ☃, int ☃, avh.a ☃)
  {
    if (☃ == null) {
      return null;
    }
    int ☃ = ☃.c();
    return ☃.a() ? new awj(☃, ☃, ☃, ☃) : new awe(☃, ☃, ☃, ☃, t.c(☃));
  }
  
  public awf.a c(int ☃)
  {
    return (awf.a)u.get(☃);
  }
  
  protected int b()
  {
    return u.size();
  }
  
  public int c()
  {
    return 400;
  }
  
  protected int d()
  {
    return super.d() + 32;
  }
  
  public static class a
    implements awd.a
  {
    private final ave a;
    private final avs b;
    private final avs c;
    
    public a(avs ☃, avs ☃)
    {
      a = ave.A();
      b = ☃;
      c = ☃;
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      if (b != null)
      {
        b.i = ☃;
        b.a(a, ☃, ☃);
      }
      if (c != null)
      {
        c.i = ☃;
        c.a(a, ☃, ☃);
      }
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (b.c(a, ☃, ☃))
      {
        if ((b instanceof awe))
        {
          a.t.a(((awe)b).c(), 1);
          b.j = a.t.c(avh.a.a(b.k));
        }
        return true;
      }
      if ((c != null) && (c.c(a, ☃, ☃)))
      {
        if ((c instanceof awe))
        {
          a.t.a(((awe)c).c(), 1);
          c.j = a.t.c(avh.a.a(c.k));
        }
        return true;
      }
      return false;
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (b != null) {
        b.a(☃, ☃);
      }
      if (c != null) {
        c.a(☃, ☃);
      }
    }
    
    public void a(int ☃, int ☃, int ☃) {}
  }
}
