import java.util.Random;

public class bpv
  implements km
{
  private final Random a = new Random();
  private final ave b;
  private bpj c;
  private int d = 100;
  
  public bpv(ave ☃)
  {
    b = ☃;
  }
  
  public void c()
  {
    bpv.a ☃ = b.X();
    if (c != null)
    {
      if (!☃.a().equals(c.a()))
      {
        b.W().b(c);
        d = ns.a(a, 0, ☃.b() / 2);
      }
      if (!b.W().c(c))
      {
        c = null;
        d = Math.min(ns.a(a, ☃.b(), ☃.c()), d);
      }
    }
    if ((c == null) && (d-- <= 0)) {
      a(☃);
    }
  }
  
  public void a(bpv.a ☃)
  {
    c = bpf.a(☃.a());
    b.W().a(c);
    d = Integer.MAX_VALUE;
  }
  
  public void a()
  {
    if (c != null)
    {
      b.W().b(c);
      c = null;
      d = 0;
    }
  }
  
  public static enum a
  {
    private final jy h;
    private final int i;
    private final int j;
    
    private a(jy ☃, int ☃, int ☃)
    {
      h = ☃;
      i = ☃;
      j = ☃;
    }
    
    public jy a()
    {
      return h;
    }
    
    public int b()
    {
      return i;
    }
    
    public int c()
    {
      return j;
    }
  }
}
