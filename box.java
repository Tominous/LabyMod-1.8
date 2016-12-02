import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class box
  implements boq
{
  private final int a;
  private final List<box.b> b;
  private final boq c;
  
  public box(List<box.b> ☃)
  {
    this.b = ☃;
    this.a = oa.a(☃);
    this.c = ((box.b)☃.get(0)).b;
  }
  
  public List<bgg> a(cq ☃)
  {
    return this.c.a(☃);
  }
  
  public List<bgg> a()
  {
    return this.c.a();
  }
  
  public boolean b()
  {
    return this.c.b();
  }
  
  public boolean c()
  {
    return this.c.c();
  }
  
  public boolean d()
  {
    return this.c.d();
  }
  
  public bmi e()
  {
    return this.c.e();
  }
  
  public bgr f()
  {
    return this.c.f();
  }
  
  public boq a(long ☃)
  {
    return ((box.b)oa.a(this.b, Math.abs((int)☃ >> 16) % this.a)).b;
  }
  
  public static class a
  {
    private List<box.b> a = Lists.newArrayList();
    
    public a a(boq ☃, int ☃)
    {
      this.a.add(new box.b(☃, ☃));
      
      return this;
    }
    
    public box a()
    {
      Collections.sort(this.a);
      return new box(this.a);
    }
    
    public boq b()
    {
      return ((box.b)this.a.get(0)).b;
    }
  }
  
  static class b
    extends oa.a
    implements Comparable<b>
  {
    protected final boq b;
    
    public b(boq ☃, int ☃)
    {
      super();
      this.b = ☃;
    }
    
    public int a(b ☃)
    {
      return ComparisonChain.start().compare(☃.a, this.a).compare(a(), ☃.a()).result();
    }
    
    protected int a()
    {
      int ☃ = this.b.a().size();
      for (cq ☃ : cq.values()) {
        ☃ += this.b.a(☃).size();
      }
      return ☃;
    }
    
    public String toString()
    {
      return "MyWeighedRandomItem{weight=" + this.a + ", model=" + this.b + '}';
    }
  }
}
