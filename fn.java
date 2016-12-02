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
    a = ☃.F();
    
    b = ((byte)pm.a(☃));
    c = ns.c(s * 32.0D);
    d = ns.c(t * 32.0D);
    e = ns.c(u * 32.0D);
    i = ((byte)(int)(y * 256.0F / 360.0F));
    j = ((byte)(int)(z * 256.0F / 360.0F));
    k = ((byte)(int)(aK * 256.0F / 360.0F));
    
    double ☃ = 3.9D;
    double ☃ = v;
    double ☃ = w;
    double ☃ = x;
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
    f = ((int)(☃ * 8000.0D));
    g = ((int)(☃ * 8000.0D));
    h = ((int)(☃ * 8000.0D));
    
    l = ☃.H();
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.e();
    b = (☃.readByte() & 0xFF);
    c = ☃.readInt();
    d = ☃.readInt();
    e = ☃.readInt();
    i = ☃.readByte();
    j = ☃.readByte();
    k = ☃.readByte();
    f = ☃.readShort();
    g = ☃.readShort();
    h = ☃.readShort();
    m = pz.b(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(a);
    ☃.writeByte(b & 0xFF);
    ☃.writeInt(c);
    ☃.writeInt(d);
    ☃.writeInt(e);
    ☃.writeByte(i);
    ☃.writeByte(j);
    ☃.writeByte(k);
    ☃.writeShort(f);
    ☃.writeShort(g);
    ☃.writeShort(h);
    l.a(☃);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public List<pz.a> a()
  {
    if (m == null) {
      m = l.c();
    }
    return m;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return b;
  }
  
  public int d()
  {
    return c;
  }
  
  public int e()
  {
    return d;
  }
  
  public int f()
  {
    return e;
  }
  
  public int g()
  {
    return f;
  }
  
  public int h()
  {
    return g;
  }
  
  public int i()
  {
    return h;
  }
  
  public byte j()
  {
    return i;
  }
  
  public byte k()
  {
    return j;
  }
  
  public byte l()
  {
    return k;
  }
}
