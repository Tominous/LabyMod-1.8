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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readFloat();
    this.b = ☃.e();
    this.c = ☃.readFloat();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(this.a);
    ☃.b(this.b);
    ☃.writeFloat(this.c);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public float a()
  {
    return this.a;
  }
  
  public int b()
  {
    return this.b;
  }
  
  public float c()
  {
    return this.c;
  }
}
