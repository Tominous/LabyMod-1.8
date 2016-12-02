import io.netty.buffer.ByteBuf;

public class vc
  extends va
{
  private final adc a = new adc()
  {
    public void h()
    {
      H().b(23, l());
      H().b(24, eu.a.a(k()));
    }
    
    public int i()
    {
      return 1;
    }
    
    public void a(ByteBuf ☃)
    {
      ☃.writeInt(F());
    }
    
    public cj c()
    {
      return new cj(s, t + 0.5D, u);
    }
    
    public aui d()
    {
      return new aui(s, t, u);
    }
    
    public adm e()
    {
      return o;
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
    a.b(☃);
    H().b(23, j().l());
    H().b(24, eu.a.a(j().k()));
  }
  
  protected void b(dn ☃)
  {
    super.b(☃);
    a.a(☃);
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
    return a;
  }
  
  public void a(int ☃, int ☃, int ☃, boolean ☃)
  {
    if ((☃) && 
      (W - b >= 4))
    {
      j().a(o);
      b = W;
    }
  }
  
  public boolean e(wn ☃)
  {
    a.a(☃);
    return false;
  }
  
  public void i(int ☃)
  {
    super.i(☃);
    if (☃ == 24) {
      try
      {
        a.b(eu.a.a(H().e(24)));
      }
      catch (Throwable localThrowable) {}
    } else if (☃ == 23) {
      a.a(H().e(23));
    }
  }
}
