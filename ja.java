import java.io.IOException;

public class ja
  implements ff<ic>
{
  private static final cj a = new cj(-1, -1, -1);
  private cj b;
  private int c;
  private zx d;
  private float e;
  private float f;
  private float g;
  
  public ja() {}
  
  public ja(zx ☃)
  {
    this(a, 255, ☃, 0.0F, 0.0F, 0.0F);
  }
  
  public ja(cj ☃, int ☃, zx ☃, float ☃, float ☃, float ☃)
  {
    b = ☃;
    c = ☃;
    d = (☃ != null ? ☃.k() : null);
    e = ☃;
    f = ☃;
    g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    b = ☃.c();
    c = ☃.readUnsignedByte();
    d = ☃.i();
    e = (☃.readUnsignedByte() / 16.0F);
    f = (☃.readUnsignedByte() / 16.0F);
    g = (☃.readUnsignedByte() / 16.0F);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(b);
    ☃.writeByte(c);
    ☃.a(d);
    ☃.writeByte((int)(e * 16.0F));
    ☃.writeByte((int)(f * 16.0F));
    ☃.writeByte((int)(g * 16.0F));
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return b;
  }
  
  public int b()
  {
    return c;
  }
  
  public zx c()
  {
    return d;
  }
  
  public float d()
  {
    return e;
  }
  
  public float e()
  {
    return f;
  }
  
  public float f()
  {
    return g;
  }
}
