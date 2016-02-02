public class adr
{
  public static final adr[] a = new adr[16];
  public static final adr b = new adr(0, "default", 1).i();
  public static final adr c = new adr(1, "flat");
  public static final adr d = new adr(2, "largeBiomes");
  public static final adr e = new adr(3, "amplified").j();
  public static final adr f = new adr(4, "customized");
  public static final adr g = new adr(5, "debug_all_block_states");
  public static final adr h = new adr(8, "default_1_1", 0).a(false);
  private final int i;
  private final String j;
  private final int k;
  private boolean l;
  private boolean m;
  private boolean n;
  
  private adr(int ☃, String ☃)
  {
    this(☃, ☃, 0);
  }
  
  private adr(int ☃, String ☃, int ☃)
  {
    this.j = ☃;
    this.k = ☃;
    this.l = true;
    this.i = ☃;
    a[☃] = this;
  }
  
  public String a()
  {
    return this.j;
  }
  
  public String b()
  {
    return "generator." + this.j;
  }
  
  public String c()
  {
    return b() + ".info";
  }
  
  public int d()
  {
    return this.k;
  }
  
  public adr a(int ☃)
  {
    if ((this == b) && (☃ == 0)) {
      return h;
    }
    return this;
  }
  
  private adr a(boolean ☃)
  {
    this.l = ☃;
    return this;
  }
  
  public boolean e()
  {
    return this.l;
  }
  
  private adr i()
  {
    this.m = true;
    return this;
  }
  
  public boolean f()
  {
    return this.m;
  }
  
  public static adr a(String ☃)
  {
    for (int ☃ = 0; ☃ < a.length; ☃++) {
      if ((a[☃] != null) && (a[☃].j.equalsIgnoreCase(☃))) {
        return a[☃];
      }
    }
    return null;
  }
  
  public int g()
  {
    return this.i;
  }
  
  public boolean h()
  {
    return this.n;
  }
  
  private adr j()
  {
    this.n = true;
    return this;
  }
}
