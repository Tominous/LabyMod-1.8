import io.netty.buffer.ByteBuf;

public class akz
  extends akw
{
  private final adc a = new adc()
  {
    public cj c()
    {
      return akz.this.c;
    }
    
    public aui d()
    {
      return new aui(akz.this.c.n() + 0.5D, akz.this.c.o() + 0.5D, akz.this.c.p() + 0.5D);
    }
    
    public adm e()
    {
      return akz.this.z();
    }
    
    public void a(String ☃)
    {
      super.a(☃);
      akz.this.p_();
    }
    
    public void h()
    {
      akz.this.z().h(akz.this.c);
    }
    
    public int i()
    {
      return 0;
    }
    
    public void a(ByteBuf ☃)
    {
      ☃.writeInt(akz.this.c.n());
      ☃.writeInt(akz.this.c.o());
      ☃.writeInt(akz.this.c.p());
    }
    
    public pk f()
    {
      return null;
    }
  };
  
  public void b(dn ☃)
  {
    super.b(☃);
    this.a.a(☃);
  }
  
  public void a(dn ☃)
  {
    super.a(☃);
    this.a.b(☃);
  }
  
  public ff y_()
  {
    dn ☃ = new dn();
    b(☃);
    return new ft(this.c, 2, ☃);
  }
  
  public boolean F()
  {
    return true;
  }
  
  public adc b()
  {
    return this.a;
  }
  
  public n c()
  {
    return this.a.n();
  }
}
