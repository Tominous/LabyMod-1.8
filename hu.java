import java.io.IOException;

public class hu
  implements ff<fj>
{
  private long a;
  private long b;
  
  public hu() {}
  
  public hu(long ☃, long ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    if (!☃)
    {
      b = (-b);
      if (b == 0L) {
        b = -1L;
      }
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readLong();
    b = ☃.readLong();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeLong(a);
    ☃.writeLong(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public long a()
  {
    return a;
  }
  
  public long b()
  {
    return b;
  }
}
