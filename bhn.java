import com.google.common.collect.Lists;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;

public class bhn
{
  private final bht a;
  private final ReentrantLock b = new ReentrantLock();
  private final List<Runnable> c = Lists.newArrayList();
  private final bhn.b d;
  private bfg e;
  private bhq f;
  private bhn.a g = bhn.a.a;
  private boolean h;
  
  public bhn(bht ☃, bhn.b ☃)
  {
    a = ☃;
    d = ☃;
  }
  
  public bhn.a a()
  {
    return g;
  }
  
  public bht b()
  {
    return a;
  }
  
  public bhq c()
  {
    return f;
  }
  
  public void a(bhq ☃)
  {
    f = ☃;
  }
  
  public bfg d()
  {
    return e;
  }
  
  public void a(bfg ☃)
  {
    e = ☃;
  }
  
  public void a(bhn.a ☃)
  {
    b.lock();
    try
    {
      g = ☃;
    }
    finally
    {
      b.unlock();
    }
  }
  
  public void e()
  {
    b.lock();
    try
    {
      if ((d == bhn.b.a) && (g != bhn.a.d)) {
        a.a(true);
      }
      h = true;
      g = bhn.a.d;
      for (Runnable ☃ : c) {
        ☃.run();
      }
    }
    finally
    {
      b.unlock();
    }
  }
  
  public void a(Runnable ☃)
  {
    b.lock();
    try
    {
      c.add(☃);
      if (h) {
        ☃.run();
      }
    }
    finally
    {
      b.unlock();
    }
  }
  
  public ReentrantLock f()
  {
    return b;
  }
  
  public bhn.b g()
  {
    return d;
  }
  
  public boolean h()
  {
    return h;
  }
  
  public static enum a
  {
    private a() {}
  }
  
  public static enum b
  {
    private b() {}
  }
}
