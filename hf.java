import java.io.IOException;

public class hf
  implements ff<fj>
{
  private int a;
  private byte b;
  
  public hf() {}
  
  public hf(pk ☃, byte ☃)
  {
    this.a = ☃.F();
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public pk a(adm ☃)
  {
    return ☃.a(this.a);
  }
  
  public byte a()
  {
    return this.b;
  }
}
