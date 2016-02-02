import java.io.IOException;

public class gi
  implements ff<fj>
{
  private int a;
  private byte b;
  
  public gi() {}
  
  public gi(pk ☃, byte ☃)
  {
    this.a = ☃.F();
    this.b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readInt();
    this.b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.a);
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
