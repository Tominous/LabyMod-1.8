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
    this.b = ☃;
    this.c = ☃;
    this.d = (☃ != null ? ☃.k() : null);
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.b = ☃.c();
    this.c = ☃.readUnsignedByte();
    this.d = ☃.i();
    this.e = (☃.readUnsignedByte() / 16.0F);
    this.f = (☃.readUnsignedByte() / 16.0F);
    this.g = (☃.readUnsignedByte() / 16.0F);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.b);
    ☃.writeByte(this.c);
    ☃.a(this.d);
    ☃.writeByte((int)(this.e * 16.0F));
    ☃.writeByte((int)(this.f * 16.0F));
    ☃.writeByte((int)(this.g * 16.0F));
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public zx c()
  {
    return this.d;
  }
  
  public float d()
  {
    return this.e;
  }
  
  public float e()
  {
    return this.f;
  }
  
  public float f()
  {
    return this.g;
  }
}
