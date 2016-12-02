import java.io.IOException;

public class gt
  implements ff<fj>
{
  private int a;
  private boolean b;
  private adp.a c;
  private int d;
  private oj e;
  private int f;
  private adr g;
  private boolean h;
  
  public gt() {}
  
  public gt(int ☃, adp.a ☃, boolean ☃, int ☃, oj ☃, int ☃, adr ☃, boolean ☃)
  {
    a = ☃;
    d = ☃;
    e = ☃;
    c = ☃;
    f = ☃;
    b = ☃;
    g = ☃;
    h = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readInt();
    
    int ☃ = ☃.readUnsignedByte();
    b = ((☃ & 0x8) == 8);
    ☃ &= 0xFFFFFFF7;
    c = adp.a.a(☃);
    
    d = ☃.readByte();
    e = oj.a(☃.readUnsignedByte());
    f = ☃.readUnsignedByte();
    g = adr.a(☃.c(16));
    if (g == null) {
      g = adr.b;
    }
    h = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a);
    int ☃ = c.a();
    if (b) {
      ☃ |= 0x8;
    }
    ☃.writeByte(☃);
    ☃.writeByte(d);
    ☃.writeByte(e.a());
    ☃.writeByte(f);
    ☃.a(g.a());
    ☃.writeBoolean(h);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return a;
  }
  
  public boolean b()
  {
    return b;
  }
  
  public adp.a c()
  {
    return c;
  }
  
  public int d()
  {
    return d;
  }
  
  public oj e()
  {
    return e;
  }
  
  public int f()
  {
    return f;
  }
  
  public adr g()
  {
    return g;
  }
  
  public boolean h()
  {
    return h;
  }
}
