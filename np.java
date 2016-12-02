import java.lang.reflect.Array;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class np<T>
{
  private final T[] a;
  private final Class<? extends T> b;
  private final ReadWriteLock c = new ReentrantReadWriteLock();
  private int d;
  private int e;
  
  public np(Class<? extends T> ☃, int ☃)
  {
    b = ☃;
    a = ((Object[])Array.newInstance(☃, ☃));
  }
  
  public T a(T ☃)
  {
    c.writeLock().lock();
    
    a[e] = ☃;
    e = ((e + 1) % b());
    if (d < b()) {
      d += 1;
    }
    c.writeLock().unlock();
    return ☃;
  }
  
  public int b()
  {
    c.readLock().lock();
    int ☃ = a.length;
    c.readLock().unlock();
    return ☃;
  }
  
  public T[] c()
  {
    T[] ☃ = (Object[])Array.newInstance(b, d);
    
    c.readLock().lock();
    for (int ☃ = 0; ☃ < d; ☃++)
    {
      int ☃ = (e - d + ☃) % b();
      if (☃ < 0) {
        ☃ += b();
      }
      ☃[☃] = a[☃];
    }
    c.readLock().unlock();
    
    return ☃;
  }
}
