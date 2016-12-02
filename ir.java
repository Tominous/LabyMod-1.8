import java.io.IOException;

public class ir
  implements ff<ic>
{
  private cj a;
  private cq b;
  private ir.a c;
  
  public ir() {}
  
  public ir(ir.a ☃, cj ☃, cq ☃)
  {
    c = ☃;
    a = ☃;
    b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    c = ((ir.a)☃.a(ir.a.class));
    a = ☃.c();
    b = cq.a(☃.readUnsignedByte());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(c);
    ☃.a(a);
    ☃.writeByte(b.a());
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return a;
  }
  
  public cq b()
  {
    return b;
  }
  
  public ir.a c()
  {
    return c;
  }
  
  public static enum a
  {
    private a() {}
  }
}
