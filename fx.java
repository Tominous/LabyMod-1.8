import java.io.IOException;

public class fx
  implements ff<fj>
{
  private String[] a;
  
  public fx() {}
  
  public fx(String[] ☃)
  {
    this.a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = new String[☃.e()];
    for (int ☃ = 0; ☃ < this.a.length; ☃++) {
      this.a[☃] = ☃.c(32767);
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.b(this.a.length);
    for (String ☃ : this.a) {
      ☃.a(☃);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public String[] a()
  {
    return this.a;
  }
}
