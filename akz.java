import io.netty.buffer.ByteBuf;

public class akz
  extends akw
{
  private final adc a = new adc()
  {
    public cj c()
    {
      return c;
    }
    
    public aui d()
    {
      return new aui(c.n() + 0.5D, c.o() + 0.5D, c.p() + 0.5D);
    }
    
    public adm e()
    {
      return z();
    }
    
    public void a(String ☃)
    {
      super.a(☃);
      p_();
    }
    
    public void h()
    {
      z().h(c);
    }
    
    public int i()
    {
      return 0;
    }
    
    public void a(ByteBuf ☃)
    {
      ☃.writeInt(c.n());
      ☃.writeInt(c.o());
      ☃.writeInt(c.p());
    }
    
    public pk f()
    {
      return null;
    }
  };
  
  public void b(dn ☃)
  {
    super.b(☃);
    a.a(☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    a.b(☃);
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(c, 2, ☃);
  }
  
  public boolean F()
  {
    return true;
  }
  
  public adc b()
  {
    return a;
  }
  
  public n c()
  {
    return a.n();
  }
}
