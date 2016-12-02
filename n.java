public class n
{
  private static final int a = n.a.values().length;
  private static final String[] b = new String[a];
  private String[] c = b;
  private String[] d = b;
  
  public void a(final m ☃, n.a ☃, int ☃)
  {
    String ☃ = c[☃.a()];
    if (☃ == null) {
      return;
    }
    m ☃ = new m()
    {
      public String e_()
      {
        return ☃.e_();
      }
      
      public eu f_()
      {
        return ☃.f_();
      }
      
      public void a(eu ☃)
      {
        ☃.a(☃);
      }
      
      public boolean a(int ☃, String ☃)
      {
        return true;
      }
      
      public cj c()
      {
        return ☃.c();
      }
      
      public aui d()
      {
        return ☃.d();
      }
      
      public adm e()
      {
        return ☃.e();
      }
      
      public pk f()
      {
        return ☃.f();
      }
      
      public boolean u_()
      {
        return ☃.u_();
      }
      
      public void a(n.a ☃, int ☃)
      {
        ☃.a(☃, ☃);
      }
    };
    String ☃;
    try
    {
      ☃ = i.e(☃, ☃);
    }
    catch (ca ☃)
    {
      return;
    }
    String ☃ = d[☃.a()];
    if (☃ == null) {
      return;
    }
    auo ☃ = ☃.e().Z();
    auk ☃ = ☃.b(☃);
    if (☃ == null) {
      return;
    }
    if (!☃.b(☃, ☃)) {
      return;
    }
    aum ☃ = ☃.c(☃, ☃);
    ☃.c(☃);
  }
  
  public void a(dn ☃)
  {
    if (!☃.b("CommandStats", 10)) {
      return;
    }
    dn ☃ = ☃.m("CommandStats");
    for (n.a ☃ : n.a.values())
    {
      String ☃ = ☃.b() + "Name";
      String ☃ = ☃.b() + "Objective";
      if ((☃.b(☃, 8)) && (☃.b(☃, 8)))
      {
        String ☃ = ☃.j(☃);
        String ☃ = ☃.j(☃);
        a(this, ☃, ☃, ☃);
      }
    }
  }
  
  public void b(dn ☃)
  {
    dn ☃ = new dn();
    for (n.a ☃ : n.a.values())
    {
      String ☃ = c[☃.a()];
      String ☃ = d[☃.a()];
      if ((☃ != null) && (☃ != null))
      {
        ☃.a(☃.b() + "Name", ☃);
        ☃.a(☃.b() + "Objective", ☃);
      }
    }
    if (!☃.c_()) {
      ☃.a("CommandStats", ☃);
    }
  }
  
  public static void a(n ☃, n.a ☃, String ☃, String ☃)
  {
    if ((☃ == null) || (☃.length() == 0) || (☃ == null) || (☃.length() == 0))
    {
      a(☃, ☃);
      return;
    }
    if ((c == b) || (d == b))
    {
      c = new String[a];
      d = new String[a];
    }
    c[☃.a()] = ☃;
    d[☃.a()] = ☃;
  }
  
  private static void a(n ☃, n.a ☃)
  {
    if ((c == b) || (d == b)) {
      return;
    }
    c[☃.a()] = null;
    d[☃.a()] = null;
    
    boolean ☃ = true;
    for (n.a ☃ : n.a.values()) {
      if ((c[☃.a()] != null) && (d[☃.a()] != null))
      {
        ☃ = false;
        break;
      }
    }
    if (☃)
    {
      c = b;
      d = b;
    }
  }
  
  public void a(n ☃)
  {
    for (n.a ☃ : ) {
      a(this, ☃, c[☃.a()], d[☃.a()]);
    }
  }
  
  public static enum a
  {
    final int f;
    final String g;
    
    private a(int ☃, String ☃)
    {
      f = ☃;
      g = ☃;
    }
    
    public int a()
    {
      return f;
    }
    
    public String b()
    {
      return g;
    }
    
    public static String[] c()
    {
      String[] ☃ = new String[values().length];
      int ☃ = 0;
      for (a ☃ : values()) {
        ☃[(☃++)] = ☃.b();
      }
      return ☃;
    }
    
    public static a a(String ☃)
    {
      for (a ☃ : ) {
        if (☃.b().equals(☃)) {
          return ☃;
        }
      }
      return null;
    }
  }
}
