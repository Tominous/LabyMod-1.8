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
    this.a = ☃;
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readFloat();
    this.c = ☃.e();
    this.b = ☃.e();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeFloat(this.a);
    ☃.b(this.c);
    ☃.b(this.b);
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
  
  public int c()
  {
    return this.c;
  }
}
