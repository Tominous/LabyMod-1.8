import java.io.IOException;

public class fv
  implements ff<fj>
{
  private cj a;
  private alz b;
  
  public fv() {}
  
  public fv(adm ☃, cj ☃)
  {
    this.a = ☃;
    this.b = ☃.p(☃);
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c();
    this.b = ((alz)afh.d.a(☃.e()));
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    ☃.b(afh.d.b(this.b));
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public alz a()
  {
    return this.b;
  }
  
  public cj b()
  {
    return this.a;
  }
}
