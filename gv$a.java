import java.io.IOException;

public class gv$a
  extends gv
{
  public gv$a() {}
  
  public gv$a(int ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
  {
    super(☃);
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.g = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    super.a(☃);
    this.b = ☃.readByte();
    this.c = ☃.readByte();
    this.d = ☃.readByte();
    this.g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    super.b(☃);
    ☃.writeByte(this.b);
    ☃.writeByte(this.c);
    ☃.writeByte(this.d);
    ☃.writeBoolean(this.g);
  }
}
