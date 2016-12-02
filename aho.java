import java.util.Random;

public class aho
  extends afh
{
  public static final amm<aho.a> a = amm.a("variant", aho.a.class);
  private final afh b;
  
  public aho(arm ☃, arn ☃, afh ☃)
  {
    super(☃, ☃);
    j(M.b().a(a, aho.a.l));
    b = ☃;
  }
  
  public int a(Random ☃)
  {
    return Math.max(0, ☃.nextInt(10) - 7);
  }
  
  public arn g(alz ☃)
  {
    switch (aho.1.a[((aho.a)☃.b(a)).ordinal()])
    {
    case 1: 
      return arn.e;
    case 2: 
      return arn.d;
    case 3: 
      return arn.d;
    }
    return super.g(☃);
  }
  
  public zw a(alz ☃, Random ☃, int ☃)
  {
    return zw.a(b);
  }
  
  public zw c(adm ☃, cj ☃)
  {
    return zw.a(b);
  }
  
  public alz a(adm ☃, cj ☃, cq ☃, float ☃, float ☃, float ☃, int ☃, pr ☃)
  {
    return Q();
  }
  
  public alz a(int ☃)
  {
    return Q().a(a, aho.a.a(☃));
  }
  
  public int c(alz ☃)
  {
    return ((aho.a)☃.b(a)).a();
  }
  
  protected ama e()
  {
    return new ama(this, new amo[] { a });
  }
  
  public static enum a
    implements nw
  {
    private static final a[] n;
    private final int o;
    private final String p;
    
    static
    {
      n = new a[16];
      for (a ☃ : values()) {
        n[☃.a()] = ☃;
      }
    }
    
    private a(int ☃, String ☃)
    {
      o = ☃;
      p = ☃;
    }
    
    public int a()
    {
      return o;
    }
    
    public String toString()
    {
      return p;
    }
    
    public static a a(int ☃)
    {
      if ((☃ < 0) || (☃ >= n.length)) {
        ☃ = 0;
      }
      a ☃ = n[☃];
      return ☃ == null ? n[0] : ☃;
    }
    
    public String l()
    {
      return p;
    }
  }
}
