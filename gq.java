import java.io.IOException;

public class gq
  implements ff<fj>
{
  private int a;
  private cj b;
  private int c;
  private boolean d;
  
  public gq() {}
  
  public gq(int ☃, cj ☃, int ☃, boolean ☃)
  {
    a = ☃;
    b = ☃;
    c = ☃;
    d = ☃;
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = ☃.readInt();
    b = ☃.c();
    c = ☃.readInt();
    d = ☃.readBoolean();
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a);
    ☃.a(b);
    ☃.writeInt(c);
    ☃.writeBoolean(d);
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public boolean a()
  {
    return d;
  }
  
  public int b()
  {
    return a;
  }
  
  public int c()
  {
    return c;
  }
  
  public cj d()
  {
    return b;
  }
}
