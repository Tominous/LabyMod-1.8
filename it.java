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
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readFloat();
    b = ☃.readFloat();
    
    byte ☃ = ☃.readByte();
    c = ((☃ & 0x1) > 0);
    d = ((☃ & 0x2) > 0);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(a);
    ☃.writeFloat(b);
    
    byte ☃ = 0;
    if (c) {
      ☃ = (byte)(☃ | 0x1);
    }
    if (d) {
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
    return a;
  }
  
  public float b()
  {
    return b;
  }
  
  public boolean c()
  {
    return c;
  }
  
  public boolean d()
  {
    return d;
  }
}
