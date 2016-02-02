import com.google.common.collect.Lists;
import java.util.List;

public class bow$a
{
  private final List<bgg> a = Lists.newArrayList();
  private final List<List<bgg>> b = Lists.newArrayListWithCapacity(6);
  private final boolean c;
  private bmi d;
  private boolean e;
  private bgr f;
  
  public bow$a(bgl ☃)
  {
    this(☃.b(), ☃.c(), ☃.g());
  }
  
  public bow$a(boq ☃, bmi ☃)
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
  
  private bow$a(boolean ☃, boolean ☃, bgr ☃)
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
