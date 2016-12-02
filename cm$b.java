import com.google.common.collect.UnmodifiableIterator;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

class cm$b<T>
  implements Iterable<T[]>
{
  private final Class<T> a;
  private final Iterable<? extends T>[] b;
  
  private cm$b(Class<T> ☃, Iterable<? extends T>[] ☃)
  {
    a = ☃;
    b = ☃;
  }
  
  public Iterator<T[]> iterator()
  {
    if (b.length <= 0) {
      return Collections.singletonList((Object[])cm.a(a, 0)).iterator();
    }
    return new cm.b.a(a, b, null);
  }
  
  static class a<T>
    extends UnmodifiableIterator<T[]>
  {
    private int a = -2;
    private final Iterable<? extends T>[] b;
    private final Iterator<? extends T>[] c;
    private final T[] d;
    
    private a(Class<T> ☃, Iterable<? extends T>[] ☃)
    {
      b = ☃;
      c = ((Iterator[])cm.a(Iterator.class, b.length));
      for (int ☃ = 0; ☃ < b.length; ☃++) {
        c[☃] = ☃[☃].iterator();
      }
      d = cm.a(☃, c.length);
    }
    
    private void b()
    {
      a = -1;
      
      Arrays.fill(c, null);
      Arrays.fill(d, null);
    }
    
    public boolean hasNext()
    {
      if (a == -2)
      {
        a = 0;
        for (Iterator<? extends T> ☃ : c) {
          if (!☃.hasNext())
          {
            b();
            break;
          }
        }
        return true;
      }
      if (a >= c.length) {
        for (a = (c.length - 1); a >= 0; a -= 1)
        {
          Iterator<? extends T> ☃ = c[a];
          if (☃.hasNext()) {
            break;
          }
          if (a == 0)
          {
            b();
            break;
          }
          ☃ = b[a].iterator();
          c[a] = ☃;
          if (!☃.hasNext())
          {
            b();
            break;
          }
        }
      }
      return a >= 0;
    }
    
    public T[] a()
    {
      if (!hasNext()) {
        throw new NoSuchElementException();
      }
      for (; a < c.length; a += 1) {
        d[a] = c[a].next();
      }
      return (Object[])d.clone();
    }
  }
}
