import com.google.common.collect.Lists;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class bmu
{
  private static final Logger a = ;
  private final List<bmv> b = Lists.newArrayList();
  private final List<Integer> c = Lists.newArrayList();
  private int d = 0;
  private int e = -1;
  private List<Integer> f = Lists.newArrayList();
  private int g = -1;
  
  public bmu(bmu ☃)
  {
    this();
    for (int ☃ = 0; ☃ < ☃.i(); ☃++) {
      a(☃.c(☃));
    }
    d = ☃.g();
  }
  
  public bmu() {}
  
  public void a()
  {
    b.clear();
    c.clear();
    e = -1;
    f.clear();
    g = -1;
    d = 0;
  }
  
  public bmu a(bmv ☃)
  {
    if ((☃.f()) && (j()))
    {
      a.warn("VertexFormat error: Trying to add a position VertexFormatElement when one already exists, ignoring.");
      return this;
    }
    b.add(☃);
    c.add(Integer.valueOf(d));
    switch (bmu.1.a[☃.b().ordinal()])
    {
    case 1: 
      g = d;
      break;
    case 2: 
      e = d;
      break;
    case 3: 
      f.add(☃.d(), Integer.valueOf(d));
      break;
    }
    d += ☃.e();
    
    return this;
  }
  
  public boolean b()
  {
    return g >= 0;
  }
  
  public int c()
  {
    return g;
  }
  
  public boolean d()
  {
    return e >= 0;
  }
  
  public int e()
  {
    return e;
  }
  
  public boolean a(int ☃)
  {
    return f.size() - 1 >= ☃;
  }
  
  public int b(int ☃)
  {
    return ((Integer)f.get(☃)).intValue();
  }
  
  public String toString()
  {
    String ☃ = "format: " + b.size() + " elements: ";
    for (int ☃ = 0; ☃ < b.size(); ☃++)
    {
      ☃ = ☃ + ((bmv)b.get(☃)).toString();
      if (☃ != b.size() - 1) {
        ☃ = ☃ + " ";
      }
    }
    return ☃;
  }
  
  private boolean j()
  {
    int ☃ = 0;
    for (int ☃ = b.size(); ☃ < ☃; ☃++)
    {
      bmv ☃ = (bmv)b.get(☃);
      if (☃.f()) {
        return true;
      }
    }
    return false;
  }
  
  public int f()
  {
    return g() / 4;
  }
  
  public int g()
  {
    return d;
  }
  
  public List<bmv> h()
  {
    return b;
  }
  
  public int i()
  {
    return b.size();
  }
  
  public bmv c(int ☃)
  {
    return (bmv)b.get(☃);
  }
  
  public int d(int ☃)
  {
    return ((Integer)c.get(☃)).intValue();
  }
  
  public boolean equals(Object ☃)
  {
    if (this == ☃) {
      return true;
    }
    if ((☃ == null) || (getClass() != ☃.getClass())) {
      return false;
    }
    bmu ☃ = (bmu)☃;
    if (d != d) {
      return false;
    }
    if (!b.equals(b)) {
      return false;
    }
    if (!c.equals(c)) {
      return false;
    }
    return true;
  }
  
  public int hashCode()
  {
    int ☃ = b.hashCode();
    ☃ = 31 * ☃ + c.hashCode();
    ☃ = 31 * ☃ + d;
    return ☃;
  }
}
