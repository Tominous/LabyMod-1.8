import java.io.IOException;

public class gv$b
  extends gv
{
  public gv$b()
  {
    h = true;
  }
  
  public gv$b(int ☃, byte ☃, byte ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
  {
    super(☃);
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
    g = ☃;
    h = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    super.a(☃);
    b = ☃.readByte();
    c = ☃.readByte();
    d = ☃.readByte();
    e = ☃.readByte();
    f = ☃.readByte();
    g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    super.b(☃);
    ☃.writeByte(b);
    ☃.writeByte(c);
    ☃.writeByte(d);
    ☃.writeByte(e);
    ☃.writeByte(f);
    ☃.writeBoolean(g);
  }
}
