import java.io.IOException;

public class it
  implements ff<ic>
{
  private float a;
  private float b;
  private boolean c;
  private boolean d;
  
  public it() {}
  
  public it(float ☃, float ☃, boolean ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readFloat();
    this.b = ☃.readFloat();
    
    byte ☃ = ☃.readByte();
    this.c = ((☃ & 0x1) > 0);
    this.d = ((☃ & 0x2) > 0);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(this.a);
    ☃.writeFloat(this.b);
    
    byte ☃ = 0;
    if (this.c) {
      ☃ = (byte)(☃ | 0x1);
    }
    if (this.d) {
      ☃ = (byte)(☃ | 0x2);
    }
    ☃.writeByte(☃);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public float a()
  {
    return this.a;
  }
  
  public float b()
  {
    return this.b;
  }
  
  public boolean c()
  {
    return this.c;
  }
  
  public boolean d()
  {
    return this.d;
  }
}
