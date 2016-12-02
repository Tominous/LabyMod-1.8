import java.io.IOException;

public class ip$a
  extends ip
{
  public ip$a()
  {
    g = true;
  }
  
  public ip$a(double ☃, double ☃, double ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    f = ☃;
    g = true;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readDouble();
    b = ☃.readDouble();
    c = ☃.readDouble();
    super.a(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeDouble(a);
    ☃.writeDouble(b);
    ☃.writeDouble(c);
    super.b(☃);
  }
}
