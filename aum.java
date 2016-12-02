import java.util.Comparator;
import java.util.List;

public class aum
{
  public static final Comparator<aum> a = new Comparator()
  {
    public int a(aum ☃, aum ☃)
    {
      if (☃.c() > ☃.c()) {
        return 1;
      }
      if (☃.c() < ☃.c()) {
        return -1;
      }
      return ☃.e().compareToIgnoreCase(☃.e());
    }
  };
  private final auo b;
  private final auk c;
  private final String d;
  private int e;
  private boolean f;
  private boolean g;
  
  public aum(auo ☃, auk ☃, String ☃)
  {
    b = ☃;
    c = ☃;
    d = ☃;
    g = true;
  }
  
  public void a(int ☃)
  {
    if (c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    c(c() + ☃);
  }
  
  public void b(int ☃)
  {
    if (c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    c(c() - ☃);
  }
  
  public void a()
  {
    if (c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    a(1);
  }
  
  public int c()
  {
    return e;
  }
  
  public void c(int ☃)
  {
    int ☃ = e;
    e = ☃;
    if ((☃ != ☃) || (g))
    {
      g = false;
      f().a(this);
    }
  }
  
  public auk d()
  {
    return c;
  }
  
  public String e()
  {
    return d;
  }
  
  public auo f()
  {
    return b;
  }
  
  public boolean g()
  {
    return f;
  }
  
  public void a(boolean ☃)
  {
    f = ☃;
  }
  
  public void a(List<wn> ☃)
  {
    c(c.c().a(☃));
  }
}
