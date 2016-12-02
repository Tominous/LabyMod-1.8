import java.io.IOException;

public class he
  implements ff<fj>
{
  private int a;
  private oj b;
  private adp.a c;
  private adr d;
  
  public he() {}
  
  public he(int ☃, oj ☃, adr ☃, adp.a ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readInt();
    this.b = oj.a(☃.readUnsignedByte());
    this.c = adp.a.a(☃.readUnsignedByte());
    this.d = adr.a(☃.c(16));
    if (this.d == null) {
      this.d = adr.b;
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.a);
    ☃.writeByte(this.b.a());
    ☃.writeByte(this.c.a());
    ☃.a(this.d.a());
  }
  
  public int a()
  {
    return this.a;
  }
  
  public oj b()
  {
    return this.b;
  }
  
  public adp.a c()
  {
    return this.c;
  }
  
  public adr d()
  {
    return this.d;
  }
}
