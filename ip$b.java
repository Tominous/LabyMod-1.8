import java.io.IOException;

public class ip$b
  extends ip
{
  public ip$b()
  {
    g = true;
    h = true;
  }
  
  public ip$b(double ☃, double ☃, double ☃, float ☃, float ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
    e = ☃;
    f = ☃;
    h = true;
    g = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readDouble();
    b = ☃.readDouble();
    c = ☃.readDouble();
    d = ☃.readFloat();
    e = ☃.readFloat();
    super.a(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeDouble(a);
    ☃.writeDouble(b);
    ☃.writeDouble(c);
    ☃.writeFloat(d);
    ☃.writeFloat(e);
    super.b(☃);
  }
}
