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
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readInt();
    b = oj.a(☃.readUnsignedByte());
    c = adp.a.a(☃.readUnsignedByte());
    d = adr.a(☃.c(16));
    if (d == null) {
      d = adr.b;
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a);
    ☃.writeByte(b.a());
    ☃.writeByte(c.a());
    ☃.a(d.a());
  }
  
  public int a()
  {
    return a;
  }
  
  public oj b()
  {
    return b;
  }
  
  public adp.a c()
  {
    return c;
  }
  
  public adr d()
  {
    return d;
  }
}
