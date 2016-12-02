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
    a = ☃.F();
    b = ☃;
  }
  
  public in(pk ☃, aui ☃)
  {
    this(☃, in.a.c);
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = ((in.a)☃.a(in.a.class));
    if (b == in.a.c) {
      c = new aui(☃.readFloat(), ☃.readFloat(), ☃.readFloat());
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.a(b);
    if (b == in.a.c)
    {
      ☃.writeFloat((float)c.a);
      ☃.writeFloat((float)c.b);
      ☃.writeFloat((float)c.c);
    }
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public pk a(adm ☃)
  {
    return ☃.a(a);
  }
  
  public in.a a()
  {
    return b;
  }
  
  public aui b()
  {
    return c;
  }
  
  public static enum a
  {
    private a() {}
  }
}
