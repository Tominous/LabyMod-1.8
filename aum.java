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
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.g = true;
  }
  
  public void a(int ☃)
  {
    if (this.c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    c(c() + ☃);
  }
  
  public void b(int ☃)
  {
    if (this.c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    c(c() - ☃);
  }
  
  public void a()
  {
    if (this.c.c().b()) {
      throw new IllegalStateException("Cannot modify read-only score");
    }
    a(1);
  }
  
  public int c()
  {
    return this.e;
  }
  
  public void c(int ☃)
  {
    int ☃ = this.e;
    this.e = ☃;
    if ((☃ != ☃) || (this.g))
    {
      this.g = false;
      f().a(this);
    }
  }
  
  public auk d()
  {
    return this.c;
  }
  
  public String e()
  {
    return this.d;
  }
  
  public auo f()
  {
    return this.b;
  }
  
  public boolean g()
  {
    return this.f;
  }
  
  public void a(boolean ☃)
  {
    this.f = ☃;
  }
  
  public void a(List<wn> ☃)
  {
    c(this.c.c().a(☃));
  }
}
