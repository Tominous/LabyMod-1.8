import com.google.common.collect.Lists;
import java.util.List;

public class ta
{
  ps a;
  List<pk> b = Lists.newArrayList();
  List<pk> c = Lists.newArrayList();
  
  public ta(ps ☃)
  {
    this.a = ☃;
  }
  
  public void a()
  {
    this.b.clear();
    this.c.clear();
  }
  
  public boolean a(pk ☃)
  {
    if (this.b.contains(☃)) {
      return true;
    }
    if (this.c.contains(☃)) {
      return false;
    }
    this.a.o.B.a("canSee");
    boolean ☃ = this.a.t(☃);
    this.a.o.B.b();
    if (☃) {
      this.b.add(☃);
    } else {
      this.c.add(☃);
    }
    return ☃;
  }
}
