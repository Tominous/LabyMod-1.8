import java.io.IOException;

public class hj
  implements ff<fj>
{
  private int a;
  private String b;
  
  public hj() {}
  
  public hj(int ☃, auk ☃)
  {
    a = ☃;
    if (☃ == null) {
      b = "";
    } else {
      b = ☃.b();
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readByte();
    b = ☃.c(16);
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeByte(a);
    ☃.a(b);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public int a()
  {
    return a;
  }
  
  public String b()
  {
    return b;
  }
}
