import java.io.IOException;

public class fu
  implements ff<fj>
{
  private cj a;
  private int b;
  private int c;
  private afh d;
  
  public fu() {}
  
  public fu(cj ☃, afh ☃, int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c();
    b = ☃.readUnsignedByte();
    c = ☃.readUnsignedByte();
    d = afh.c(☃.e() & 0xFFF);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte(b);
    ☃.writeByte(c);
    ☃.b(afh.a(d) & 0xFFF);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
  
  public afh d()
  {
    return d;
  }
}
