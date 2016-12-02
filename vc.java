import io.netty.buffer.ByteBuf;

public class vc
  extends va
{
  private final adc a = new adc()
  {
    public void h()
    {
      vc.this.H().b(23, l());
      vc.this.H().b(24, eu.a.a(k()));
    }
    
    public int i()
    {
      return 1;
    }
    
    public void a(ByteBuf ☃)
    {
      ☃.writeInt(vc.this.F());
    }
    
    public cj c()
    {
      return new cj(vc.this.s, vc.this.t + 0.5D, vc.this.u);
    }
    
    public aui d()
    {
      return new aui(vc.this.s, vc.this.t, vc.this.u);
    }
    
    public adm e()
    {
      return vc.this.o;
    }
    
    public pk f()
    {
      return vc.this;
    }
  };
  private int b = 0;
  
  public vc(adm ☃)
  {
    super(☃);
  }
  
  public vc(adm ☃, double ☃, double ☃, double ☃)
  {
    super(☃, ☃, ☃, ☃);
  }
  
  protected void h()
  {
    super.h();
    H().a(23, "");
    H().a(24, "");
  }
  
  protected void a(dn ☃)
  {
    super.a(☃);
    this.a.b(☃);
    H().b(23, j().l());
    H().b(24, eu.a.a(j().k()));
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    this.a.a(☃);
  }
  
  public va.a s()
  {
    return va.a.g;
  }
  
  public alz u()
  {
    return afi.bX.Q();
  }
  
  public adc j()
  {
    return this.a;
  }
  
  public void a(int ☃, int ☃, int ☃, boolean ☃)
  {
    if ((☃) && 
      (this.W - this.b >= 4))
    {
      j().a(this.o);
      this.b = this.W;
    }
  }
  
  public boolean e(wn ☃)
  {
    this.a.a(☃);
    return false;
  }
  
  public void i(int ☃)
  {
    super.i(☃);
    if (☃ == 24) {
      try
      {
        this.a.b(eu.a.a(H().e(24)));
      }
      catch (Throwable localThrowable) {}
    } else if (☃ == 23) {
      this.a.a(H().e(23));
    }
  }
}
