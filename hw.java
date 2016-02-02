import java.io.IOException;

public class hw
  implements ff<fj>
{
  private adm a;
  private cj b;
  private eu[] c;
  
  public hw() {}
  
  public hw(adm ☃, cj ☃, eu[] ☃)
  {
    this.a = ☃;
    this.b = ☃;
    this.c = new eu[] { ☃[0], ☃[1], ☃[2], ☃[3] };
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.b = ☃.c();
    this.c = new eu[4];
    for (int ☃ = 0; ☃ < 4; ☃++) {
      this.c[☃] = ☃.d();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.b);
    for (int ☃ = 0; ☃ < 4; ☃++) {
      ☃.a(this.c[☃]);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return this.b;
  }
  
  public eu[] b()
  {
    return this.c;
  }
}
