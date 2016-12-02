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
      this.b = ☃;
      this.a = ☃;
    }
  }
  
  private List<re.a> b = Lists.newArrayList();
  private List<re.a> c = Lists.newArrayList();
  private final nt d;
  private int e;
  private int f = 3;
  
  public re(nt ☃)
  {
    this.d = ☃;
  }
  
  public void a(int ☃, rd ☃)
  {
    this.b.add(new re.a(☃, ☃));
  }
  
  public void a(rd ☃)
  {
    Iterator<re.a> ☃ = this.b.iterator();
    while (☃.hasNext())
    {
      re.a ☃ = (re.a)☃.next();
      rd ☃ = ☃.a;
      if (☃ == ☃)
      {
        if (this.c.contains(☃))
        {
          ☃.d();
          this.c.remove(☃);
        }
        ☃.remove();
      }
    }
  }
  
  public void a()
  {
    this.d.a("goalSetup");
    if (this.e++ % this.f == 0)
    {
      for (re.a ☃ : this.b)
      {
        boolean ☃ = this.c.contains(☃);
        if (☃)
        {
          if ((!b(☃)) || (!a(☃)))
          {
            ☃.a.d();
            this.c.remove(☃);
          }
        }
        else if ((b(☃)) && (☃.a.a()))
        {
          ☃.a.c();
          this.c.add(☃);
        }
      }
    }
    else
    {
      Iterator<re.a> ☃ = this.c.iterator();
      while (☃.hasNext())
      {
        re.a ☃ = (re.a)☃.next();
        if (!a(☃))
        {
          ☃.a.d();
          ☃.remove();
        }
      }
    }
    this.d.b();
    
    this.d.a("goalTick");
    for (re.a ☃ : this.c) {
      ☃.a.e();
    }
    this.d.b();
  }
  
  private boolean a(re.a ☃)
  {
    boolean ☃ = ☃.a.b();
    return ☃;
  }
  
  private boolean b(re.a ☃)
  {
    for (re.a ☃ : this.b) {
      if (☃ != ☃) {
        if (☃.b >= ☃.b)
        {
          if ((!a(☃, ☃)) && (this.c.contains(☃))) {
            return false;
          }
        }
        else if ((!☃.a.i()) && (this.c.contains(☃))) {
          return false;
        }
      }
    }
    return true;
  }
  
  private boolean a(re.a ☃, re.a ☃)
  {
    return (☃.a.j() & ☃.a.j()) == 0;
  }
}
