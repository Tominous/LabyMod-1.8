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
