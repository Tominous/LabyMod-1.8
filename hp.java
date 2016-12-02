import java.io.IOException;

public class hp
  implements ff<fj>
{
  private float a;
  private int b;
  private float c;
  
  public hp() {}
  
  public hp(float ☃, int ☃, float ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readFloat();
    b = ☃.e();
    c = ☃.readFloat();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(a);
    ☃.b(b);
    ☃.writeFloat(c);
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
  
  public float c()
  {
    return c;
  }
}
