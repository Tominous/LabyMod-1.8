import java.io.IOException;

public class hu
  implements ff<fj>
{
  private long a;
  private long b;
  
  public hu() {}
  
  public hu(long ☃, long ☃, boolean ☃)
  {
    this.a = ☃;
    this.b = ☃;
    if (!☃)
    {
      this.b = (-this.b);
      if (this.b == 0L) {
        this.b = -1L;
      }
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readLong();
    this.b = ☃.readLong();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeLong(this.a);
    ☃.writeLong(this.b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public long a()
  {
    return this.a;
  }
  
  public long b()
  {
    return this.b;
  }
}
