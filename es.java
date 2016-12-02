import com.google.common.base.Function;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;

public abstract class es
  implements eu
{
  protected List<eu> a = Lists.newArrayList();
  private ez b;
  
  public eu a(eu ☃)
  {
    ☃.b().a(b());
    a.add(☃);
    return this;
  }
  
  public List<eu> a()
  {
    return a;
  }
  
  public eu a(String ☃)
  {
    return a(new fa(☃));
  }
  
  public eu a(ez ☃)
  {
    b = ☃;
    for (eu ☃ : a) {
      ☃.b().a(b());
    }
    return this;
  }
  
  public ez b()
  {
    if (b == null)
    {
      b = new ez();
      for (eu ☃ : a) {
        ☃.b().a(b);
      }
    }
    return b;
  }
  
  public Iterator<eu> iterator()
  {
    return Iterators.concat(Iterators.forArray(new es[] { this }), a(a));
  }
  
  public final String c()
  {
    StringBuilder ☃ = new StringBuilder();
    for (eu ☃ : this) {
      ☃.append(☃.e());
    }
    return ☃.toString();
  }
  
  public final String d()
  {
    StringBuilder ☃ = new StringBuilder();
    for (eu ☃ : this)
    {
      ☃.append(☃.b().k());
      ☃.append(☃.e());
      ☃.append(a.v);
    }
    return ☃.toString();
  }
  
  public static Iterator<eu> a(Iterable<eu> ☃)
  {
    Iterator<eu> ☃ = Iterators.concat(Iterators.transform(☃.iterator(), new Function()
    {
      public Iterator<eu> a(eu ☃)
      {
        return ☃.iterator();
      }
    }));
    ☃ = Iterators.transform(☃, new Function()
    {
      public eu a(eu ☃)
      {
        eu ☃ = ☃.f();
        ☃.a(☃.b().n());
        return ☃;
      }
    });
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof es))
    {
      es ☃ = (es)☃;
      return (a.equals(a)) && (b().equals(☃.b()));
    }
    return false;
  }
  
  public int hashCode()
  {
    return 31 * b.hashCode() + a.hashCode();
  }
  
  public String toString()
  {
    return "BaseComponent{style=" + b + ", siblings=" + a + '}';
  }
}
