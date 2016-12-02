import java.io.IOException;

public class hm
  implements ff<fj>
{
  private int a;
  private int b;
  private int c;
  private int d;
  
  public hm() {}
  
  public hm(pk ☃)
  {
    this(☃.F(), ☃.v, ☃.w, ☃.x);
  }
  
  public hm(int ☃, double ☃, double ☃, double ☃)
  {
    this.a = ☃;
    double ☃ = 3.9D;
    if (☃ < -☃) {
      ☃ = -☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    if (☃ < -☃) {
      ☃ = -☃;
    }
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ > ☃) {
      ☃ = ☃;
    }
    if (☃ > ☃) {
      ☃ = ☃;
    }
    this.b = ((int)(☃ * 8000.0D));
    this.c = ((int)(☃ * 8000.0D));
    this.d = ((int)(☃ * 8000.0D));
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = ☃.readShort();
    this.c = ☃.readShort();
    this.d = ☃.readShort();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    ☃.writeShort(this.b);
    ☃.writeShort(this.c);
    ☃.writeShort(this.d);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
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
  
  public int d()
  {
    return this.d;
  }
}
