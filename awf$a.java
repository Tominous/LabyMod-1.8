public class awf$a
  implements awd.a
{
  private final ave a;
  private final avs b;
  private final avs c;
  
  public awf$a(avs ☃, avs ☃)
  {
    this.a = ave.A();
    this.b = ☃;
    this.c = ☃;
  }
  
  public void a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, int ☃, boolean ☃)
  {
    if (this.b != null)
    {
      this.b.i = ☃;
      this.b.a(this.a, ☃, ☃);
    }
    if (this.c != null)
    {
      this.c.i = ☃;
      this.c.a(this.a, ☃, ☃);
    }
  }
  
  public boolean a(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (this.b.c(this.a, ☃, ☃))
    {
      if ((this.b instanceof awe))
      {
        this.a.t.a(((awe)this.b).c(), 1);
        this.b.j = this.a.t.c(avh.a.a(this.b.k));
      }
      return true;
    }
    if ((this.c != null) && (this.c.c(this.a, ☃, ☃)))
    {
      if ((this.c instanceof awe))
      {
        this.a.t.a(((awe)this.c).c(), 1);
        this.c.j = this.a.t.c(avh.a.a(this.c.k));
      }
      return true;
    }
    return false;
  }
  
  public void b(int ☃, int ☃, int ☃, int ☃, int ☃, int ☃)
  {
    if (this.b != null) {
      this.b.a(☃, ☃);
    }
    if (this.c != null) {
      this.c.a(☃, ☃);
    }
  }
  
  public void a(int ☃, int ☃, int ☃) {}
}
