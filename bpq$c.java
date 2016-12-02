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
    return a;
  }
  
  public synchronized void b()
  {
    a = false;
  }
  
  public synchronized List<bpq.a> c()
  {
    return Collections.unmodifiableList(b);
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
    for (bpq.a ☃ : b) {
      if (☃.b().equals(☃))
      {
        ☃.c();
        ☃ = true;
        break;
      }
    }
    if (!☃)
    {
      b.add(new bpq.a(☃, ☃));
      a = true;
    }
  }
}
