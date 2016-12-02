import com.google.common.base.Predicate;

public final class po
{
  public static final Predicate<pk> a = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return ☃.ai();
    }
  };
  public static final Predicate<pk> b = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return (☃.ai()) && (☃.l == null) && (☃.m == null);
    }
  };
  public static final Predicate<pk> c = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return ((☃ instanceof og)) && (☃.ai());
    }
  };
  public static final Predicate<pk> d = new Predicate()
  {
    public boolean a(pk ☃)
    {
      return (!(☃ instanceof wn)) || (!((wn)☃).v());
    }
  };
  
  public static class a
    implements Predicate<pk>
  {
    private final zx a;
    
    public a(zx ☃)
    {
      this.a = ☃;
    }
    
    public boolean a(pk ☃)
    {
      if (!☃.ai()) {
        return false;
      }
      if (!(☃ instanceof pr)) {
        return false;
      }
      pr ☃ = (pr)☃;
      if (☃.p(ps.c(this.a)) != null) {
        return false;
      }
      if ((☃ instanceof ps)) {
        return ((ps)☃).bY();
      }
      if ((☃ instanceof um)) {
        return true;
      }
      if ((☃ instanceof wn)) {
        return true;
      }
      return false;
    }
  }
}
