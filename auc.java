import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;

public class auc
  implements Runnable
{
  private static final auc a = new auc();
  private List<aud> b = Collections.synchronizedList(Lists.newArrayList());
  private volatile long c;
  private volatile long d;
  private volatile boolean e;
  
  private auc()
  {
    Thread ☃ = new Thread(this, "File IO Thread");
    ☃.setPriority(1);
    ☃.start();
  }
  
  public static auc a()
  {
    return a;
  }
  
  public void run()
  {
    for (;;)
    {
      c();
    }
  }
  
  private void c()
  {
    for (int ☃ = 0; ☃ < b.size(); ☃++)
    {
      aud ☃ = (aud)b.get(☃);
      boolean ☃ = ☃.c();
      if (!☃)
      {
        b.remove(☃--);
        d += 1L;
      }
      try
      {
        Thread.sleep(e ? 0L : 10L);
      }
      catch (InterruptedException ☃)
      {
        ☃.printStackTrace();
      }
    }
    if (b.isEmpty()) {
      try
      {
        Thread.sleep(25L);
      }
      catch (InterruptedException ☃)
      {
        ☃.printStackTrace();
      }
    }
  }
  
  public void a(aud ☃)
  {
    if (b.contains(☃)) {
      return;
    }
    c += 1L;
    b.add(☃);
  }
  
  public void b()
    throws InterruptedException
  {
    e = true;
    while (c != d) {
      Thread.sleep(10L);
    }
    e = false;
  }
}
