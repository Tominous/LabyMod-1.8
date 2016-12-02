import com.google.common.collect.Iterators;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

class ne$1
  implements Iterable<S>
{
  ne$1(ne paramne, Class paramClass) {}
  
  public Iterator<S> iterator()
  {
    List<T> ☃ = (List)ne.a(this.b).get(this.b.b(this.a));
    if (☃ == null) {
      return Iterators.emptyIterator();
    }
    Iterator<T> ☃ = ☃.iterator();
    return Iterators.filter(☃, this.a);
  }
}
