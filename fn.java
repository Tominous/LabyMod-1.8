import java.io.IOException;
import java.util.List;

public class fn
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
  private byte i;
  private byte j;
  private byte k;
  private pz l;
  private List<pz.a> m;
  
  public fn() {}
  
  public fn(pr ☃)
  {
    this.a = ☃.F();
    
    this.b = ((byte)pm.a(☃));
    this.c = ns.c(☃.s * 32.0D);
    this.d = ns.c(☃.t * 32.0D);
    this.e = ns.c(☃.u * 32.0D);
    this.i = ((byte)(int)(☃.y * 256.0F / 360.0F));
    this.j = ((byte)(int)(☃.z * 256.0F / 360.0F));
    this.k = ((byte)(int)(☃.aK * 256.0F / 360.0F));
    
    double ☃ = 3.9D;
    double ☃ = ☃.v;
    double ☃ = ☃.w;
    double ☃ = ☃.x;
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
    this.f = ((int)(☃ * 8000.0D));
    this.g = ((int)(☃ * 8000.0D));
    this.h = ((int)(☃ * 8000.0D));
    
    this.l = ☃.H();
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = (☃.readByte() & 0xFF);
    this.c = ☃.readInt();
    this.d = ☃.readInt();
    this.e = ☃.readInt();
    this.i = ☃.readByte();
    this.j = ☃.readByte();
    this.k = ☃.readByte();
    this.f = ☃.readShort();
    this.g = ☃.readShort();
    this.h = ☃.readShort();
    this.m = pz.b(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeByte(this.b & 0xFF);
    ☃.writeInt(this.c);
    ☃.writeInt(this.d);
    ☃.writeInt(this.e);
    ☃.writeByte(this.i);
    ☃.writeByte(this.j);
    ☃.writeByte(this.k);
    ☃.writeShort(this.f);
    ☃.writeShort(this.g);
    ☃.writeShort(this.h);
    this.l.a(☃);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public List<pz.a> a()
  {
    if (this.m == null) {
      this.m = this.l.c();
    }
    return this.m;
  }
  
  public int b()
  {
    return this.a;
  }
  
  public int c()
  {
    return this.b;
  }
  
  public int d()
  {
    return this.c;
  }
  
  public int e()
  {
    return this.d;
  }
  
  public int f()
  {
    return this.e;
  }
  
  public int g()
  {
    return this.f;
  }
  
  public int h()
  {
    return this.g;
  }
  
  public int i()
  {
    return this.h;
  }
  
  public byte j()
  {
    return this.i;
  }
  
  public byte k()
  {
    return this.j;
  }
  
  public byte l()
  {
    return this.k;
  }
}
