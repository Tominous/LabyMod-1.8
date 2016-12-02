import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.Collection;

public class hr
  implements ff<fj>
{
  private String a = "";
  private String b = "";
  private String c = "";
  private String d = "";
  private String e = ae;
  private int f = -1;
  private Collection<String> g = Lists.newArrayList();
  private int h;
  private int i;
  
  public hr() {}
  
  public hr(aul ☃, int ☃)
  {
    a = ☃.b();
    h = ☃;
    if ((☃ == 0) || (☃ == 2))
    {
      b = ☃.c();
      c = ☃.e();
      d = ☃.f();
      i = ☃.k();
      e = ie;
      f = ☃.l().b();
    }
    if (☃ == 0) {
      g.addAll(☃.d());
    }
  }
  
  public hr(aul ☃, Collection<String> ☃, int ☃)
  {
    if ((☃ != 3) && (☃ != 4)) {
      throw new IllegalArgumentException("Method must be join or leave for player constructor");
    }
    if ((☃ == null) || (☃.isEmpty())) {
      throw new IllegalArgumentException("Players cannot be null/empty");
    }
    h = ☃;
    a = ☃.b();
    g.addAll(☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(16);
    h = ☃.readByte();
    if ((h == 0) || (h == 2))
    {
      b = ☃.c(32);
      c = ☃.c(16);
      d = ☃.c(16);
      i = ☃.readByte();
      e = ☃.c(32);
      f = ☃.readByte();
    }
    if ((h == 0) || (h == 3) || (h == 4))
    {
      int ☃ = ☃.e();
      for (int ☃ = 0; ☃ < ☃; ☃++) {
        g.add(☃.c(40));
      }
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte(h);
    if ((h == 0) || (h == 2))
    {
      ☃.a(b);
      ☃.a(c);
      ☃.a(d);
      ☃.writeByte(i);
      ☃.a(e);
      ☃.writeByte(f);
    }
    if ((h == 0) || (h == 3) || (h == 4))
    {
      ☃.b(g.size());
      for (String ☃ : g) {
        ☃.a(☃);
      }
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
  
  public String c()
  {
    return c;
  }
  
  public String d()
  {
    return d;
  }
  
  public Collection<String> e()
  {
    return g;
  }
  
  public int f()
  {
    return h;
  }
  
  public int g()
  {
    return i;
  }
  
  public int h()
  {
    return f;
  }
  
  public String i()
  {
    return e;
  }
}
