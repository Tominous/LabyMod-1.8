import com.google.common.collect.ComparisonChain;
import java.util.List;

class box$b
  extends oa.a
  implements Comparable<b>
{
  protected final boq b;
  
  public box$b(boq ☃, int ☃)
  {
    super(☃);
    b = ☃;
  }
  
  public int a(b ☃)
  {
    return ComparisonChain.start().compare(a, a).compare(a(), ☃.a()).result();
  }
  
  protected int a()
  {
    int ☃ = b.a().size();
    for (cq ☃ : cq.values()) {
      ☃ += b.a(☃).size();
    }
    return ☃;
  }
  
  public String toString()
  {
    return "MyWeighedRandomItem{weight=" + a + ", model=" + b + '}';
  }
}
