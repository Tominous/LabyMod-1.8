import java.io.IOException;

public class fw
  implements ff<fj>
{
  private oj a;
  private boolean b;
  
  public fw() {}
  
  public fw(oj ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = oj.a(☃.readUnsignedByte());
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.a.a());
  }
  
  public boolean a()
  {
    return this.b;
  }
  
  public oj b()
  {
    return this.a;
  }
}
