import java.io.IOException;

public class hq
  implements ff<fj>
{
  private String a;
  private String b;
  private auu.a c;
  private int d;
  
  public hq() {}
  
  public hq(auk ☃, int ☃)
  {
    this.a = ☃.b();
    this.b = ☃.d();
    this.c = ☃.c().c();
    this.d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(16);
    this.d = ☃.readByte();
    if ((this.d == 0) || (this.d == 2))
    {
      this.b = ☃.c(32);
      this.c = auu.a.a(☃.c(16));
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte(this.d);
    if ((this.d == 0) || (this.d == 2))
    {
      ☃.a(this.b);
      ☃.a(this.c.a());
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.d;
  }
  
  public auu.a d()
  {
    return this.c;
  }
}
