import java.util.Random;

class wb$e
  extends rd
{
  private wb a;
  private float b;
  private int c;
  
  public wb$e(wb ☃)
  {
    this.a = ☃;
    a(2);
  }
  
  public boolean a()
  {
    return (this.a.u() == null) && ((this.a.C) || (this.a.V()) || (this.a.ab()));
  }
  
  public void e()
  {
    if (--this.c <= 0)
    {
      this.c = (40 + this.a.bc().nextInt(60));
      this.b = this.a.bc().nextInt(360);
    }
    ((wb.d)this.a.q()).a(this.b, false);
  }
}
