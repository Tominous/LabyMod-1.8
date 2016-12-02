import java.io.IOException;

public class fo
  implements ff<fj>
{
  private int a;
  private cj b;
  private cq c;
  private String d;
  
  public fo() {}
  
  public fo(uq ☃)
  {
    this.a = ☃.F();
    this.b = ☃.n();
    this.c = ☃.b;
    this.d = ☃.c.B;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.d = ☃.c(uq.a.A);
    this.b = ☃.c();
    this.c = cq.b(☃.readUnsignedByte());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.a(this.d);
    ☃.a(this.b);
    ☃.writeByte(this.c.b());
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public cj b()
  {
    return this.b;
  }
  
  public cq c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
}
