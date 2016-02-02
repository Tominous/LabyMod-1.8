import com.google.common.collect.Lists;
import java.net.InetAddress;
import java.util.Collections;
import java.util.List;

public class bpq$c
{
  private List<bpq.a> b = Lists.newArrayList();
  boolean a;
  
  public synchronized boolean a()
  {
    return this.a;
  }
  
  public synchronized void b()
  {
    this.a = false;
  }
  
  public synchronized List<bpq.a> c()
  {
    return Collections.unmodifiableList(this.b);
  }
  
  public synchronized void a(String ☃, InetAddress ☃)
  {
    String ☃ = bpr.a(☃);
    String ☃ = bpr.b(☃);
    if (☃ == null) {
      return;
    }
    ☃ = ☃.getHostAddress() + ":" + ☃;
    
    boolean ☃ = false;
    for (bpq.a ☃ : this.b) {
      if (☃.b().equals(☃))
      {
        ☃.c();
        ☃ = true;
        break;
      }
    }
    if (!☃)
    {
      this.b.add(new bpq.a(☃, ☃));
      this.a = true;
    }
  }
}
