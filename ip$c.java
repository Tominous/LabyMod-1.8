import java.io.IOException;

public class ip$c
  extends ip
{
  public ip$c()
  {
    h = true;
  }
  
  public ip$c(float ☃, float ☃, boolean ☃)
  {
    d = ☃;
    e = ☃;
    f = ☃;
    h = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    d = ☃.readFloat();
    e = ☃.readFloat();
    super.a(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(d);
    ☃.writeFloat(e);
    super.b(☃);
  }
}
