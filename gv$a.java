import java.io.IOException;

public class gv$a
  extends gv
{
  public gv$a() {}
  
  public gv$a(int ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
  {
    super(☃);
    b = ☃;
    c = ☃;
    d = ☃;
    g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    super.a(☃);
    b = ☃.readByte();
    c = ☃.readByte();
    d = ☃.readByte();
    g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    super.b(☃);
    ☃.writeByte(b);
    ☃.writeByte(c);
    ☃.writeByte(d);
    ☃.writeBoolean(g);
  }
}
