import java.io.IOException;

public class fk
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  private int d;
  private int e;
  private int f;
  private int g;
  private int h;
  private int i;
  private int j;
  private int k;
  
  public fk() {}
  
  public fk(pk ☃, int ☃)
  {
    this(☃, ☃, 0);
  }
  
  public fk(pk ☃, int ☃, int ☃)
  {
    this.a = ☃.F();
    this.b = ns.c(☃.s * 32.0D);
    this.c = ns.c(☃.t * 32.0D);
    this.d = ns.c(☃.u * 32.0D);
    this.h = ns.d(☃.z * 256.0F / 360.0F);
    this.i = ns.d(☃.y * 256.0F / 360.0F);
    this.j = ☃;
    this.k = ☃;
    if (☃ > 0)
    {
      double ☃ = ☃.v;
      double ☃ = ☃.w;
      double ☃ = ☃.x;
      double ☃ = 3.9D;
      if (☃ < -☃) {
        ☃ = -☃;
      }
      if (☃ < -☃) {
        ☃ = -☃;
      }
      if (☃ < -☃) {
        ☃ = -☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      if (☃ > ☃) {
        ☃ = ☃;
      }
      this.e = ((int)(☃ * 8000.0D));
      this.f = ((int)(☃ * 8000.0D));
      this.g = ((int)(☃ * 8000.0D));
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.j = ☃.readByte();
    this.b = ☃.readInt();
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.h = ☃.readByte();
    this.i = ☃.readByte();
    this.k = ☃.readInt();
    if (this.k > 0)
    {
      this.e = ☃.readShort();
      this.f = ☃.readShort();
      this.g = ☃.readShort();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.j);
    ☃.writeInt(this.b);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeByte(this.h);
    ☃.writeByte(this.i);
    ☃.writeInt(this.k);
    if (this.k > 0)
    {
      ☃.writeShort(this.e);
      ☃.writeShort(this.f);
      ☃.writeShort(this.g);
    }
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
  
  public int d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public int g()
  {
    return this.g;
  }
  
  public int h()
  {
    return this.h;
  }
  
  public int i()
  {
    return this.i;
  }
  
  public int j()
  {
    return this.j;
  }
  
  public int k()
  {
    return this.k;
  }
  
  public void a(int ☃)
  {
    this.b = ☃;
  }
  
  public void b(int ☃)
  {
    this.c = ☃;
  }
  
  public void c(int ☃)
  {
    this.d = ☃;
  }
  
  public void d(int ☃)
  {
    this.e = ☃;
  }
  
  public void e(int ☃)
  {
    this.f = ☃;
  }
  
  public void f(int ☃)
  {
    this.g = ☃;
  }
  
  public void g(int ☃)
  {
    this.k = ☃;
  }
}
