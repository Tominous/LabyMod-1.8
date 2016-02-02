import java.io.IOException;

public class in
  implements ff<ic>
{
  private int a;
  private in.a b;
  private aui c;
  
  public in() {}
  
  public in(pk ☃, in.a ☃)
  {
    this.a = ☃.F();
    this.b = ☃;
  }
  
  public in(pk ☃, aui ☃)
  {
    this(☃, in.a.c);
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ((in.a)☃.a(in.a.class));
    if (this.b == in.a.c) {
      this.c = new aui(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.a(this.b);
    if (this.b == in.a.c)
    {
      ☃.writeFloat((float)this.c.a);
      ☃.writeFloat((float)this.c.b);
      ☃.writeFloat((float)this.c.c);
    }
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public pk a(adm ☃)
  {
    return ☃.a(this.a);
  }
  
  public in.a a()
  {
    return this.b;
  }
  
  public aui b()
  {
    return this.c;
  }
  
  public static enum a
  {
    private a() {}
  }
}
