import java.io.IOException;

public class iq
  implements ff<ic>
{
  private boolean a;
  private boolean b;
  private boolean c;
  private boolean d;
  private float e;
  private float f;
  
  public iq() {}
  
  public iq(wl ☃)
  {
    a(a);
    b(b);
    c(c);
    d(d);
    a(☃.a());
    b(☃.b());
  }
  
  public void a(em ☃)
    throws IOException
  {
    byte ☃ = ☃.readByte();
    
    a((☃ & 0x1) > 0);
    b((☃ & 0x2) > 0);
    c((☃ & 0x4) > 0);
    d((☃ & 0x8) > 0);
    a(☃.readFloat());
    b(☃.readFloat());
  }
  
  public void b(em ☃)
    throws IOException
  {
    byte ☃ = 0;
    if (a()) {
      ☃ = (byte)(☃ | 0x1);
    }
    if (b()) {
      ☃ = (byte)(☃ | 0x2);
    }
    if (c()) {
      ☃ = (byte)(☃ | 0x4);
    }
    if (d()) {
      ☃ = (byte)(☃ | 0x8);
    }
    ☃.writeByte(☃);
    ☃.writeFloat(e);
    ☃.writeFloat(f);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public boolean a()
  {
    return a;
  }
  
  public void a(boolean ☃)
  {
    a = ☃;
  }
  
  public boolean b()
  {
    return b;
  }
  
  public void b(boolean ☃)
  {
    b = ☃;
  }
  
  public boolean c()
  {
    return c;
  }
  
  public void c(boolean ☃)
  {
    c = ☃;
  }
  
  public boolean d()
  {
    return d;
  }
  
  public void d(boolean ☃)
  {
    d = ☃;
  }
  
  public void a(float ☃)
  {
    e = ☃;
  }
  
  public void b(float ☃)
  {
    f = ☃;
  }
}
