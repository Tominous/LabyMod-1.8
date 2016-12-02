import java.io.IOException;

public class ix
  implements ff<ic>
{
  private cj a;
  private eu[] b;
  
  public ix() {}
  
  public ix(cj ☃, eu[] ☃)
  {
    a = ☃;
    b = new eu[] { ☃[0], ☃[1], ☃[2], ☃[3] };
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.c();
    b = new eu[4];
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      String ☃ = ☃.c(384);
      eu ☃ = eu.a.a(☃);
      b[☃] = ☃;
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.a(a);
    for (int ☃ = 0; ☃ < 4; ☃++)
    {
      eu ☃ = b[☃];
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
    return a;
  }
  
  public eu[] b()
  {
    return b;
  }
}
