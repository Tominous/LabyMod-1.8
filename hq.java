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
    a = ☃.b();
    b = ☃.d();
    c = ☃.c().c();
    d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(16);
    d = ☃.readByte();
    if ((d == 0) || (d == 2))
    {
      b = ☃.c(32);
      c = auu.a.a(☃.c(16));
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte(d);
    if ((d == 0) || (d == 2))
    {
      ☃.a(b);
      ☃.a(c.a());
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
  
  public int c()
  {
    return d;
  }
  
  public auu.a d()
  {
    return c;
  }
}
