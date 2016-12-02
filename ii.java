import java.io.IOException;

public class ii
  implements ff<ic>
{
  private int a;
  private short b;
  private boolean c;
  
  public ii() {}
  
  public ii(int ☃, short ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
    b = ☃.readShort();
    c = (☃.readByte() != 0);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.writeShort(b);
    ☃.writeByte(c ? 1 : 0);
  }
  
  public int a()
  {
    return a;
  }
  
  public short b()
  {
    return b;
  }
}
