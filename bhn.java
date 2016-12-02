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
    this.a = ☃;
    this.d = ☃;
  }
  
  public bhn.a a()
  {
    return this.g;
  }
  
  public bht b()
  {
    return this.a;
  }
  
  public bhq c()
  {
    return this.f;
  }
  
  public void a(bhq ☃)
  {
    this.f = ☃;
  }
  
  public bfg d()
  {
    return this.e;
  }
  
  public void a(bfg ☃)
  {
    this.e = ☃;
  }
  
  public void a(bhn.a ☃)
  {
    this.b.lock();
    try
    {
      this.g = ☃;
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public void e()
  {
    this.b.lock();
    try
    {
      if ((this.d == bhn.b.a) && (this.g != bhn.a.d)) {
        this.a.a(true);
      }
      this.h = true;
      this.g = bhn.a.d;
      for (Runnable ☃ : this.c) {
        ☃.run();
      }
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public void a(Runnable ☃)
  {
    this.b.lock();
    try
    {
      this.c.add(☃);
      if (this.h) {
        ☃.run();
      }
    }
    finally
    {
      this.b.unlock();
    }
  }
  
  public ReentrantLock f()
  {
    return this.b;
  }
  
  public bhn.b g()
  {
    return this.d;
  }
  
  public boolean h()
  {
    return this.h;
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
