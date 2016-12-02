import java.io.IOException;

public class gm
  implements ff<fj>
{
  public static final String[] a = { "tile.bed.notValid" };
  private int b;
  private float c;
  
  public gm() {}
  
  public gm(int ☃, float ☃)
  {
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    b = ☃.readUnsignedByte();
    c = ☃.readFloat();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(b);
    ☃.writeFloat(c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return b;
  }
  
  public float b()
  {
    return c;
  }
}
