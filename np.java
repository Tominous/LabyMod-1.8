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
    this.b = ☃;
    this.a = ((Object[])Array.newInstance(☃, ☃));
  }
  
  public T a(T ☃)
  {
    this.c.writeLock().lock();
    
    this.a[this.e] = ☃;
    this.e = ((this.e + 1) % b());
    if (this.d < b()) {
      this.d += 1;
    }
    this.c.writeLock().unlock();
    return ☃;
  }
  
  public int b()
  {
    this.c.readLock().lock();
    int ☃ = this.a.length;
    this.c.readLock().unlock();
    return ☃;
  }
  
  public T[] c()
  {
    T[] ☃ = (Object[])Array.newInstance(this.b, this.d);
    
    this.c.readLock().lock();
    for (int ☃ = 0; ☃ < this.d; ☃++)
    {
      int ☃ = (this.e - this.d + ☃) % b();
      if (☃ < 0) {
        ☃ += b();
      }
      ☃[☃] = this.a[☃];
    }
    this.c.readLock().unlock();
    
    return ☃;
  }
}
