import com.google.common.collect.Lists;
import java.util.List;

public class bow
  implements boq
{
  protected final List<bgg> a;
  protected final List<List<bgg>> b;
  protected final boolean c;
  protected final boolean d;
  protected final bmi e;
  protected final bgr f;
  
  public bow(List<bgg> ☃, List<List<bgg>> ☃, boolean ☃, boolean ☃, bmi ☃, bgr ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
  }
  
  public List<bgg> a(cq ☃)
  {
    return (List)this.b.get(☃.ordinal());
  }
  
  public List<bgg> a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.c;
  }
  
  public boolean c()
  {
    return this.d;
  }
  
  public boolean d()
  {
    return false;
  }
  
  public bmi e()
  {
    return this.e;
  }
  
  public bgr f()
  {
    return this.f;
  }
  
  public static class a
  {
    private final List<bgg> a = Lists.newArrayList();
    private final List<List<bgg>> b = Lists.newArrayListWithCapacity(6);
    private final boolean c;
    private bmi d;
    private boolean e;
    private bgr f;
    
    public a(bgl ☃)
    {
      this(☃.b(), ☃.c(), ☃.g());
    }
    
    public a(boq ☃, bmi ☃)
    {
      this(☃.b(), ☃.c(), ☃.f());
      this.d = ☃.e();
      for (cq ☃ : cq.values()) {
        a(☃, ☃, ☃);
      }
      a(☃, ☃);
    }
    
    private void a(boq ☃, bmi ☃, cq ☃)
    {
      for (bgg ☃ : ☃.a(☃)) {
        a(☃, new bgn(☃, ☃));
      }
    }
    
    private void a(boq ☃, bmi ☃)
    {
      for (bgg ☃ : ☃.a()) {
        a(new bgn(☃, ☃));
      }
    }
    
    private a(boolean ☃, boolean ☃, bgr ☃)
    {
      for (cq ☃ : cq.values()) {
        this.b.add(Lists.newArrayList());
      }
      this.c = ☃;
      this.e = ☃;
      this.f = ☃;
    }
    
    public a a(cq ☃, bgg ☃)
    {
      ((List)this.b.get(☃.ordinal())).add(☃);
      return this;
    }
    
    public a a(bgg ☃)
    {
      this.a.add(☃);
      return this;
    }
    
    public a a(bmi ☃)
    {
      this.d = ☃;
      
      return this;
    }
    
    public boq b()
    {
      if (this.d == null) {
        throw new RuntimeException("Missing particle!");
      }
      return new bow(this.a, this.b, this.c, this.e, this.d, this.f);
    }
  }
}
