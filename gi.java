import java.io.IOException;

public class gi
  implements ff<fj>
{
  private int a;
  private byte b;
  
  public gi() {}
  
  public gi(pk ☃, byte ☃)
  {
    a = ☃.F();
    b = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readInt();
    b = ☃.readByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a);
    ☃.writeByte(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public pk a(adm ☃)
  {
    return ☃.a(a);
  }
  
  public byte a()
  {
    return b;
  }
}
