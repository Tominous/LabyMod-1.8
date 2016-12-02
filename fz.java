import java.io.IOException;

public class fz
  implements ff<fj>
{
  private adg a;
  private fz.a[] b;
  
  public fz() {}
  
  public fz(int ☃, short[] ☃, amy ☃)
  {
    a = new adg(a, b);
    
    b = new fz.a[☃];
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃] = new fz.a(☃[☃], ☃);
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    a = new adg(☃.readInt(), ☃.readInt());
    b = new fz.a[☃.e()];
    for (int ☃ = 0; ☃ < b.length; ☃++) {
      b[☃] = new fz.a(☃.readShort(), (alz)afh.d.a(☃.e()));
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(a.a);
    ☃.writeInt(a.b);
    ☃.b(b.length);
    for (fz.a ☃ : b)
    {
      ☃.writeShort(☃.b());
      ☃.b(afh.d.b(☃.c()));
    }
  }
  
  public void a(fj ☃)
  {
    ☃.a(this);
  }
  
  public fz.a[] a()
  {
    return b;
  }
  
  public class a
  {
    private final short b;
    private final alz c;
    
    public a(short ☃, alz ☃)
    {
      b = ☃;
      c = ☃;
    }
    
    public a(short ☃, amy ☃)
    {
      b = ☃;
      c = ☃.g(a());
    }
    
    public cj a()
    {
      return new cj(fz.a(fz.this).a(b >> 12 & 0xF, b & 0xFF, b >> 8 & 0xF));
    }
    
    public short b()
    {
      return b;
    }
    
    public alz c()
    {
      return c;
    }
  }
}
