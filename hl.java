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
    this.a = ☃;
    this.b = ☃.F();
    this.c = (☃ != null ? ☃.F() : -1);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.a = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeByte(this.a);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
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
}
