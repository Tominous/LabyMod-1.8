import java.io.IOException;

public class fm
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  
  public fm() {}
  
  public fm(pk ☃)
  {
    this.a = ☃.F();
    this.b = ns.c(☃.s * 32.0D);
    this.c = ns.c(☃.t * 32.0D);
    this.d = ns.c(☃.u * 32.0D);
    if ((☃ instanceof uv)) {
      this.e = 1;
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.e = ☃.readByte();
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.e);
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
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
