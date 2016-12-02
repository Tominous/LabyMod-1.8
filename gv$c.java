import java.io.IOException;

public class gv$c
  extends gv
{
  public gv$c()
  {
    h = true;
  }
  
  public gv$c(int ☃, byte ☃, byte ☃, boolean ☃)
  {
    super(☃);
    e = ☃;
    f = ☃;
    h = true;
    g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    super.a(☃);
    e = ☃.readByte();
    f = ☃.readByte();
    g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    super.b(☃);
    ☃.writeByte(e);
    ☃.writeByte(f);
    ☃.writeBoolean(g);
  }
}
