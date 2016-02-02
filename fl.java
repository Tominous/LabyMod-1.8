import java.io.IOException;

public class fl
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public fl() {}
  
  public fl(pp ☃)
  {
    this.a = ☃.F();
    this.b = ns.c(☃.s * 32.0D);
    this.c = ns.c(☃.t * 32.0D);
    this.d = ns.c(☃.u * 32.0D);
    this.e = ☃.j();
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.e = ☃.readShort();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeShort(this.e);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
}
