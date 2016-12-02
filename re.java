import com.google.common.collect.Lists;
import java.util.Iterator;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class re
{
  private static final Logger a = ;
  
  class a
  {
    public rd a;
    public int b;
    
    public a(int ☃, rd ☃)
    {
      b = ☃;
      a = ☃;
    }
  }
  
  private List<re.a> b = Lists.newArrayList();
  private List<re.a> c = Lists.newArrayList();
  private final nt d;
  private int e;
  private int f = 3;
  
  public re(nt ☃)
  {
    d = ☃;
  }
  
  public void a(int ☃, rd ☃)
  {
    b.add(new re.a(☃, ☃));
  }
  
  public void a(rd ☃)
  {
    Iterator<re.a> ☃ = b.iterator();
    while (☃.hasNext())
    {
      re.a ☃ = (re.a)☃.next();
      rd ☃ = a;
      if (☃ == ☃)
      {
        if (c.contains(☃))
        {
          ☃.d();
          c.remove(☃);
        }
        ☃.remove();
      }
    }
  }
  
  public void a()
  {
    d.a("goalSetup");
    if (e++ % f == 0)
    {
      for (re.a ☃ : b)
      {
        boolean ☃ = c.contains(☃);
        if (☃)
        {
          if ((!b(☃)) || (!a(☃)))
          {
            a.d();
            c.remove(☃);
          }
        }
        else if ((b(☃)) && (a.a()))
        {
          a.c();
          c.add(☃);
        }
      }
    }
    else
    {
      Iterator<re.a> ☃ = c.iterator();
      while (☃.hasNext())
      {
        re.a ☃ = (re.a)☃.next();
        if (!a(☃))
        {
          a.d();
          ☃.remove();
        }
      }
    }
    d.b();
    
    d.a("goalTick");
    for (re.a ☃ : c) {
      a.e();
    }
    d.b();
  }
  
  private boolean a(re.a ☃)
  {
    boolean ☃ = a.b();
    return ☃;
  }
  
  private boolean b(re.a ☃)
  {
    for (re.a ☃ : b) {
      if (☃ != ☃) {
        if (b >= b)
        {
          if ((!a(☃, ☃)) && (c.contains(☃))) {
            return false;
          }
        }
        else if ((!a.i()) && (c.contains(☃))) {
          return false;
        }
      }
    }
    return true;
  }
  
  private boolean a(re.a ☃, re.a ☃)
  {
    return (a.j() & a.j()) == 0;
  }
}
