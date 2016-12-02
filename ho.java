import java.io.IOException;

public class ho
  implements ff<fj>
{
  private float a;
  private int b;
  private int c;
  
  public ho() {}
  
  public ho(float ☃, int ☃, int ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readFloat();
    c = ☃.e();
    b = ☃.e();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(a);
    ☃.b(c);
    ☃.b(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public float a()
  {
    return a;
  }
  
  public int b()
  {
    return b;
  }
  
  public int c()
  {
    return c;
  }
}
