import java.io.IOException;

public class jq
  implements ff<jp>
{
  private long a;
  
  public jq() {}
  
  public jq(long ☃)
  {
    this.a = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = ☃.readLong();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeLong(this.a);
  }
  
  public void a(jp ☃)
  {
    ☃.a(this);
  }
}
