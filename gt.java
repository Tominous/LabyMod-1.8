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
    this.a = ☃;
    this.d = ☃;
    this.e = ☃;
    this.c = ☃;
    this.f = ☃;
    this.b = ☃;
    this.g = ☃;
    this.h = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readInt();
    
    int ☃ = ☃.readUnsignedByte();
    this.b = ((☃ & 0x8) == 8);
    ☃ &= 0xFFFFFFF7;
    this.c = adp.a.a(☃);
    
    this.d = ☃.readByte();
    this.e = oj.a(☃.readUnsignedByte());
    this.f = ☃.readUnsignedByte();
    this.g = adr.a(☃.c(16));
    if (this.g == null) {
      this.g = adr.b;
    }
    this.h = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.a);
    int ☃ = this.c.a();
    if (this.b) {
      ☃ |= 0x8;
    }
    ☃.writeByte(☃);
    ☃.writeByte(this.d);
    ☃.writeByte(this.e.a());
    ☃.writeByte(this.f);
    ☃.a(this.g.a());
    ☃.writeBoolean(this.h);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return this.a;
  }
  
  public boolean b()
  {
    return this.b;
  }
  
  public adp.a c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
  
  public oj e()
  {
    return this.e;
  }
  
  public int f()
  {
    return this.f;
  }
  
  public adr g()
  {
    return this.g;
  }
  
  public boolean h()
  {
    return this.h;
  }
}
