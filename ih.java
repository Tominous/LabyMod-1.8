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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c(7);
    this.b = ☃.readByte();
    
    this.c = wn.b.a(☃.readByte());
    this.d = ☃.readBoolean();
    
    this.e = ☃.readUnsignedByte();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.writeByte(this.b);
    ☃.writeByte(this.c.a());
    ☃.writeBoolean(this.d);
    ☃.writeByte(this.e);
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public String a()
  {
    return this.a;
  }
  
  public wn.b c()
  {
    return this.c;
  }
  
  public boolean d()
  {
    return this.d;
  }
  
  public int e()
  {
    return this.e;
  }
}
