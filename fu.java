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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c();
    this.b = ☃.readUnsignedByte();
    this.c = ☃.readUnsignedByte();
    this.d = afh.c(☃.e() & 0xFFF);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte(this.b);
    ☃.writeByte(this.c);
    ☃.b(afh.a(this.d) & 0xFFF);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
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
  
  public afh d()
  {
    return this.d;
  }
}
