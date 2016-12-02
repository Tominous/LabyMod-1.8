import java.io.IOException;

public class ip$c
  extends ip
{
  public ip$c()
  {
    this.h = true;
  }
  
  public ip$c(float ☃, float ☃, boolean ☃)
  {
    this.d = ☃;
    this.e = ☃;
    this.f = ☃;
    this.h = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.d = ☃.readFloat();
    this.e = ☃.readFloat();
    super.a(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(this.d);
    ☃.writeFloat(this.e);
    super.b(☃);
  }
}
