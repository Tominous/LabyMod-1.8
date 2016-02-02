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
    this.c = ☃;
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.c = ((ir.a)☃.a(ir.a.class));
    this.a = ☃.c();
    this.b = cq.a(☃.readUnsignedByte());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.c);
    ☃.a(this.a);
    ☃.writeByte(this.b.a());
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return this.a;
  }
  
  public cq b()
  {
    return this.b;
  }
  
  public ir.a c()
  {
    return this.c;
  }
  
  public static enum a
  {
    private a() {}
  }
}
