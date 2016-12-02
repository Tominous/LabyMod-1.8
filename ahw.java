public abstract class ahw
  extends ajg
{
  public static final amm<ahw.a> a = amm.a("axis", ahw.a.class);
  
  public ahw()
  {
    super(arm.d);
    a(yz.b);
    c(2.0F);
    a(f);
  }
  
  public void b(adm ☃, cj ☃, alz ☃)
  {
    int ☃ = 4;
    int ☃ = ☃ + 1;
    if (!☃.a(☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃))) {
      return;
    }
    for (cj ☃ : cj.a(☃.a(-☃, -☃, -☃), ☃.a(☃, ☃, ☃)))
    {
      alz ☃ = ☃.p(☃);
      if ((☃.c().t() == arm.j) && 
        (!((Boolean)☃.b(ahs.b)).booleanValue())) {
        ☃.a(☃, ☃.a(ahs.b, Boolean.valueOf(true)), 4);
      }
    }
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return super.a(☃, ☃, ☃, ☃, ☃, ☃, ☃, ☃).a(a, ahw.a.a(☃.k()));
  }
  
  public static enum a
    implements nw
  {
    private final String e;
    
    private a(String ☃)
    {
      e = ☃;
    }
    
    public String toString()
    {
      return e;
    }
    
    public static a a(cq.a ☃)
    {
      switch (ahw.1.a[☃.ordinal()])
      {
      case 1: 
        return a;
      case 2: 
        return b;
      case 3: 
        return c;
      }
      return d;
    }
    
    public String l()
    {
      return e;
    }
  }
}
