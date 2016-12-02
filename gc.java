import java.io.IOException;

public class gc
  implements ff<fj>
{
  private int a;
  private String b;
  private eu c;
  private int d;
  private int e;
  
  public gc() {}
  
  public gc(int ☃, String ☃, eu ☃)
  {
    this(☃, ☃, ☃, 0);
  }
  
  public gc(int ☃, String ☃, eu ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public gc(int ☃, String ☃, eu ☃, int ☃, int ☃)
  {
    this(☃, ☃, ☃, ☃);
    e = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readUnsignedByte();
    b = ☃.c(32);
    c = ☃.d();
    d = ☃.readUnsignedByte();
    if (b.equals("EntityHorse")) {
      e = ☃.readInt();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.a(b);
    ☃.a(c);
    ☃.writeByte(d);
    if (b.equals("EntityHorse")) {
      ☃.writeInt(e);
    }
  }
  
  public int a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
  
  public eu c()
  {
    return c;
  }
  
  public int d()
  {
    return d;
  }
  
  public int e()
  {
    return e;
  }
  
  public boolean f()
  {
    return d > 0;
  }
}
