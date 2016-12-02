import java.io.IOException;

public class ix
  implements ff<ic>
{
  private cj a;
  private eu[] b;
  
  public ix() {}
  
  public ix(cj ☃, eu[] ☃)
  {
    this.a = ☃;
    this.b = new eu[] { ☃[0], ☃[1], ☃[2], ☃[3] };
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.c();
    this.b = new eu[4];
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      String ☃ = ☃.c(384);
      eu ☃ = eu.a.a(☃);
      this.b[☃] = ☃;
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(this.a);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      eu ☃ = this.b[☃];
      String ☃ = eu.a.a(☃);
      ☃.a(☃);
    }
  }
  
  public void a(ic ☃)
  {
    ☃.a(this);
  }
  
  public cj a()
  {
    return this.a;
  }
  
  public eu[] b()
  {
    return this.b;
  }
}
