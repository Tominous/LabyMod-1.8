import java.io.IOException;

public class gv$b
  extends gv
{
  public gv$b()
  {
    this.h = true;
  }
  
  public gv$b(int ☃, byte ☃, byte ☃, byte ☃, byte ☃, byte ☃, boolean ☃)
  {
    super(☃);
    this.b = ☃;
    this.c = ☃;
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.g = ☃;
    this.h = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    super.a(☃);
    this.b = ☃.readByte();
    this.c = ☃.readByte();
    this.d = ☃.readByte();
    this.e = ☃.readByte();
    this.f = ☃.readByte();
    this.g = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    super.b(☃);
    ☃.writeByte(this.b);
    ☃.writeByte(this.c);
    ☃.writeByte(this.d);
    ☃.writeByte(this.e);
    ☃.writeByte(this.f);
    ☃.writeBoolean(this.g);
  }
}
