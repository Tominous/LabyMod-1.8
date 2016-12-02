import java.io.IOException;

public class fz
  implements ff<fj>
{
  private adg a;
  private fz.a[] b;
  
  public fz() {}
  
  public fz(int ☃, short[] ☃, amy ☃)
  {
    this.a = new adg(☃.a, ☃.b);
    
    this.b = new fz.a[☃];
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃] = new fz.a(☃[☃], ☃);
    }
  }
  
  public void a(em ☃)
    throws IOException
  {
    this.a = new adg(☃.readInt(), ☃.readInt());
    this.b = new fz.a[☃.e()];
    for (int ☃ = 0; ☃ < this.b.length; ☃++) {
      this.b[☃] = new fz.a(☃.readShort(), (alz)afh.d.a(☃.e()));
    }
  }
  
  public void b(em ☃)
    throws IOException
  {
    ☃.writeInt(this.a.a);
    ☃.writeInt(this.a.b);
    ☃.b(this.b.length);
    for (fz.a ☃ : this.b)
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
    return this.b;
  }
  
  public class a
  {
    private final short b;
    private final alz c;
    
    public a(short ☃, alz ☃)
    {
      this.b = ☃;
      this.c = ☃;
    }
    
    public a(short ☃, amy ☃)
    {
      this.b = ☃;
      this.c = ☃.g(a());
    }
    
    public cj a()
    {
      return new cj(fz.a(fz.this).a(this.b >> 12 & 0xF, this.b & 0xFF, this.b >> 8 & 0xF));
    }
    
    public short b()
    {
      return this.b;
    }
    
    public alz c()
    {
      return this.c;
    }
  }
}
