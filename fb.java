import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.Arrays;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class fb
  extends es
{
  private final String d;
  private final Object[] e;
  private final Object f = new Object();
  private long g = -1L;
  List<eu> b = Lists.newArrayList();
  public static final Pattern c = Pattern.compile("%(?:(\\d+)\\$)?([A-Za-z%]|$)");
  
  public fb(String ☃, Object... ☃)
  {
    d = ☃;
    e = ☃;
    for (Object ☃ : ☃) {
      if ((☃ instanceof eu)) {
        ((eu)☃).b().a(b());
      }
    }
  }
  
  synchronized void g()
  {
    synchronized (f)
    {
      long ☃ = di.a();
      if (☃ == g) {
        return;
      }
      g = ☃;
      b.clear();
    }
    try
    {
      b(di.a(d));
    }
    catch (fc ☃)
    {
      b.clear();
      try
      {
        b(di.b(d));
      }
      catch (fc ☃)
      {
        throw ☃;
      }
    }
  }
  
  protected void b(String ☃)
  {
    boolean ☃ = false;
    Matcher ☃ = c.matcher(☃);
    
    int ☃ = 0;
    int ☃ = 0;
    try
    {
      while (☃.find(☃))
      {
        int ☃ = ☃.start();
        int ☃ = ☃.end();
        if (☃ > ☃)
        {
          fa ☃ = new fa(String.format(☃.substring(☃, ☃), new Object[0]));
          ☃.b().a(b());
          b.add(☃);
        }
        String ☃ = ☃.group(2);
        String ☃ = ☃.substring(☃, ☃);
        if (("%".equals(☃)) && ("%%".equals(☃)))
        {
          fa ☃ = new fa("%");
          ☃.b().a(b());
          b.add(☃);
        }
        else if ("s".equals(☃))
        {
          String ☃ = ☃.group(1);
          int ☃ = ☃ != null ? Integer.parseInt(☃) - 1 : ☃++;
          if (☃ < e.length) {
            b.add(a(☃));
          }
        }
        else
        {
          throw new fc(this, "Unsupported format: '" + ☃ + "'");
        }
        ☃ = ☃;
      }
      if (☃ < ☃.length())
      {
        fa ☃ = new fa(String.format(☃.substring(☃), new Object[0]));
        ☃.b().a(b());
        b.add(☃);
      }
    }
    catch (IllegalFormatException ☃)
    {
      throw new fc(this, ☃);
    }
  }
  
  private eu a(int ☃)
  {
    if (☃ >= e.length) {
      throw new fc(this, ☃);
    }
    Object ☃ = e[☃];
    eu ☃;
    eu ☃;
    if ((☃ instanceof eu))
    {
      ☃ = (eu)☃;
    }
    else
    {
      ☃ = new fa(☃ == null ? "null" : ☃.toString());
      ☃.b().a(b());
    }
    return ☃;
  }
  
  public eu a(ez ☃)
  {
    super.a(☃);
    for (Object ☃ : e) {
      if ((☃ instanceof eu)) {
        ((eu)☃).b().a(b());
      }
    }
    if (g > -1L) {
      for (eu ☃ : b) {
        ☃.b().a(☃);
      }
    }
    return this;
  }
  
  public Iterator<eu> iterator()
  {
    g();
    
    return Iterators.concat(a(b), a(a));
  }
  
  public String e()
  {
    g();
    
    StringBuilder ☃ = new StringBuilder();
    for (eu ☃ : b) {
      ☃.append(☃.e());
    }
    return ☃.toString();
  }
  
  public fb h()
  {
    Object[] ☃ = new Object[e.length];
    for (int ☃ = 0; ☃ < e.length; ☃++) {
      if ((e[☃] instanceof eu)) {
        ☃[☃] = ((eu)e[☃]).f();
      } else {
        ☃[☃] = e[☃];
      }
    }
    fb ☃ = new fb(d, ☃);
    ☃.a(b().m());
    for (eu ☃ : a()) {
      ☃.a(☃.f());
    }
    return ☃;
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ instanceof fb))
    {
      fb ☃ = (fb)☃;
      return (Arrays.equals(e, e)) && (d.equals(d)) && (super.equals(☃));
    }
    return false;
  }
  
  public int hashCode()
  {
    int ☃ = super.hashCode();
    ☃ = 31 * ☃ + d.hashCode();
    ☃ = 31 * ☃ + Arrays.hashCode(e);
    return ☃;
  }
  
  public String toString()
  {
    return "TranslatableComponent{key='" + d + '\'' + ", args=" + Arrays.toString(e) + ", siblings=" + a + ", style=" + b() + '}';
  }
  
  public String i()
  {
    return d;
  }
  
  public Object[] j()
  {
    return e;
  }
}
