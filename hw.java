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
    a = ☃;
    b = ☃;
    c = new eu[] { ☃[0], ☃[1], ☃[2], ☃[3] };
  }
  
  public void a(em ☃)
    throws IOException
  {
    b = ☃.c();
    c = new eu[4];
    for (int ☃ = 0; ☃ < 4; ☃++) {
      c[☃] = ☃.d();
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(b);
    for (int ☃ = 0; ☃ < 4; ☃++) {
      ☃.a(c[☃]);
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return b;
  }
  
  public eu[] b()
  {
    return c;
  }
}
