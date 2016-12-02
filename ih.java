import java.io.IOException;

public class ih
  implements ff<ic>
{
  private String a;
  private int b;
  private wn.b c;
  private boolean d;
  private int e;
  
  public ih() {}
  
  public ih(String ☃, int ☃, wn.b ☃, boolean ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c(7);
    b = ☃.readByte();
    
    c = wn.b.a(☃.readByte());
    d = ☃.readBoolean();
    
    e = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    ☃.writeByte(b);
    ☃.writeByte(c.a());
    ☃.writeBoolean(d);
    ☃.writeByte(e);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return a;
  }
  
  public wn.b c()
  {
    return c;
  }
  
  public boolean d()
  {
    return d;
  }
  
  public int e()
  {
    return e;
  }
}
