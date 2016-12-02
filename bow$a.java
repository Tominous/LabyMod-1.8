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
    d = ☃.e();
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
      b.add(Lists.newArrayList());
    }
    c = ☃;
    e = ☃;
    f = ☃;
  }
  
  public a a(cq ☃, bgg ☃)
  {
    ((List)b.get(☃.ordinal())).add(☃);
    return this;
  }
  
  public a a(bgg ☃)
  {
    a.add(☃);
    return this;
  }
  
  public a a(bmi ☃)
  {
    d = ☃;
    
    return this;
  }
  
  public boq b()
  {
    if (d == null) {
      throw new RuntimeException("Missing particle!");
    }
    return new bow(a, b, c, e, d, f);
  }
}
