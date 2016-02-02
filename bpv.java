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
    this.b = ☃;
  }
  
  public void c()
  {
    bpv.a ☃ = this.b.X();
    if (this.c != null)
    {
      if (!☃.a().equals(this.c.a()))
      {
        this.b.W().b(this.c);
        this.d = ns.a(this.a, 0, ☃.b() / 2);
      }
      if (!this.b.W().c(this.c))
      {
        this.c = null;
        this.d = Math.min(ns.a(this.a, ☃.b(), ☃.c()), this.d);
      }
    }
    if ((this.c == null) && (this.d-- <= 0)) {
      a(☃);
    }
  }
  
  public void a(bpv.a ☃)
  {
    this.c = bpf.a(☃.a());
    this.b.W().a(this.c);
    this.d = Integer.MAX_VALUE;
  }
  
  public void a()
  {
    if (this.c != null)
    {
      this.b.W().b(this.c);
      this.c = null;
      this.d = 0;
    }
  }
  
  public static enum a
  {
    private final jy h;
    private final int i;
    private final int j;
    
    private a(jy ☃, int ☃, int ☃)
    {
      this.h = ☃;
      this.i = ☃;
      this.j = ☃;
    }
    
    public jy a()
    {
      return this.h;
    }
    
    public int b()
    {
      return this.i;
    }
    
    public int c()
    {
      return this.j;
    }
  }
}
