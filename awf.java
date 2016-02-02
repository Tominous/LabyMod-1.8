import com.google.common.collect.Lists;
import java.util.List;

public class awf
  extends awd
{
  private final List<awf.a> u = Lists.newArrayList();
  
  public awf(ave ☃, int ☃, int ☃, int ☃, int ☃, int ☃, avh.a... ☃)
  {
    super(☃, ☃, ☃, ☃, ☃, ☃);
    this.k = false;
    for (int ☃ = 0; ☃ < ☃.length; ☃ += 2)
    {
      avh.a ☃ = ☃[☃];
      avh.a ☃ = ☃ < ☃.length - 1 ? ☃[(☃ + 1)] : null;
      avs ☃ = a(☃, ☃ / 2 - 155, 0, ☃);
      avs ☃ = a(☃, ☃ / 2 - 155 + 160, 0, ☃);
      
      this.u.add(new awf.a(☃, ☃));
    }
  }
  
  private avs a(ave ☃, int ☃, int ☃, avh.a ☃)
  {
    if (☃ == null) {
      return null;
    }
    int ☃ = ☃.c();
    return ☃.a() ? new awj(☃, ☃, ☃, ☃) : new awe(☃, ☃, ☃, ☃, ☃.t.c(☃));
  }
  
  public awf.a c(int ☃)
  {
    return (awf.a)this.u.get(☃);
  }
  
  protected int b()
  {
    return this.u.size();
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
      this.a = ave.A();
      this.b = ☃;
      this.c = ☃;
    }
    
    public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
    {
      if (this.b != null)
      {
        this.b.i = ☃;
        this.b.a(this.a, ☃, ☃);
      }
      if (this.c != null)
      {
        this.c.i = ☃;
        this.c.a(this.a, ☃, ☃);
      }
    }
    
    public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (this.b.c(this.a, ☃, ☃))
      {
        if ((this.b instanceof awe))
        {
          this.a.t.a(((awe)this.b).c(), 1);
          this.b.j = this.a.t.c(avh.a.a(this.b.k));
        }
        return true;
      }
      if ((this.c != null) && (this.c.c(this.a, ☃, ☃)))
      {
        if ((this.c instanceof awe))
        {
          this.a.t.a(((awe)this.c).c(), 1);
          this.c.j = this.a.t.c(avh.a.a(this.c.k));
        }
        return true;
      }
      return false;
    }
    
    public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
    {
      if (this.b != null) {
        this.b.a(☃, ☃);
      }
      if (this.c != null) {
        this.c.a(☃, ☃);
      }
    }
    
    public void a(int ☃, int ☃, int ☃) {}
  }
}
