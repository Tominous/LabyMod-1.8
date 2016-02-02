import io.netty.buffer.ByteBuf;

class akz$1
  extends adc
{
  akz$1(akz paramakz) {}
  
  public cj c()
  {
    return this.a.c;
  }
  
  public aui d()
  {
    return new aui(this.a.c.n() + 0.5D, this.a.c.o() + 0.5D, this.a.c.p() + 0.5D);
  }
  
  public adm e()
  {
    return this.a.z();
  }
  
  public void a(String ☃)
  {
    super.a(☃);
    this.a.p_();
  }
  
  public void h()
  {
    this.a.z().h(this.a.c);
  }
  
  public int i()
  {
    return 0;
  }
  
  public void a(ByteBuf ☃)
  {
    ☃.writeInt(this.a.c.n());
    ☃.writeInt(this.a.c.o());
    ☃.writeInt(this.a.c.p());
  }
  
  public pk f()
  {
    return null;
  }
}
