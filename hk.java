import java.io.IOException;
import java.util.List;

public class hk
  implements ff<fj>
{
  private int a;
  private List<pz.a> b;
  
  public hk() {}
  
  public hk(int ☃, pz ☃, boolean ☃)
  {
    this.a = ☃;
    if (☃) {
      this.b = ☃.c();
    } else {
      this.b = ☃.b();
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.e();
    this.b = pz.b(☃);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a);
    pz.a(this.b, ☃);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public List<pz.a> a()
  {
    return this.b;
  }
  
  public int b()
  {
    return this.a;
  }
}
