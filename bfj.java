public enum bfj
{
  private static final bfj[] g;
  private final bfj.b[] h;
  
  public static final class a
  {
    public static final int a = cq.d.a();
    public static final int b = cq.b.a();
    public static final int c = cq.f.a();
    public static final int d = cq.c.a();
    public static final int e = cq.a.a();
    public static final int f = cq.e.a();
  }
  
  static
  {
    g = new bfj[6];
    
    g[bfj.a.e] = a;
    g[bfj.a.b] = b;
    g[bfj.a.d] = c;
    g[bfj.a.a] = d;
    g[bfj.a.f] = e;
    g[bfj.a.c] = f;
  }
  
  public static bfj a(cq ☃)
  {
    return g[☃.a()];
  }
  
  private bfj(bfj.b... ☃)
  {
    this.h = ☃;
  }
  
  public bfj.b a(int ☃)
  {
    return this.h[☃];
  }
  
  public static class b
  {
    public final int a;
    public final int b;
    public final int c;
    
    private b(int ☃, int ☃, int ☃)
    {
      this.a = ☃;
      this.b = ☃;
      this.c = ☃;
    }
  }
}
