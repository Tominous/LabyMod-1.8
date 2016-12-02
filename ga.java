import java.io.IOException;

public class ga
  implements ff<fj>
{
  private int a;
  private short b;
  private boolean c;
  
  public ga() {}
  
  public ga(int ☃, short ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readUnsignedByte();
    b = ☃.readShort();
    c = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b);
    ☃.writeBoolean(c);
  }
  
  public int a()
  {
    return a;
  }
  
  public short b()
  {
    return b;
  }
  
  public boolean c()
  {
    return c;
  }
}
