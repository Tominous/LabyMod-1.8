import java.io.IOException;

public class hl
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  
  public hl() {}
  
  public hl(int ☃, pk ☃, pk ☃)
  {
    a = ☃;
    b = ☃.F();
    c = (☃ != null ? ☃.F() : -1);
  }
  
  public void a(em ☃)
    throws IOException
  {
    b = ☃.readInt();
    c = ☃.readInt();
    a = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(b);
    ☃.writeInt(c);
    ☃.writeByte(a);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
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
}
