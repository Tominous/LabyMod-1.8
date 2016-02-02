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
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.b = ☃.readUnsignedByte();
    this.c = ☃.readFloat();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(this.b);
    ☃.writeFloat(this.c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.b;
  }
  
  public float b()
  {
    return this.c;
  }
}
