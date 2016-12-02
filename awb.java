public class awb
  extends avs
{
  private boolean o;
  private String p;
  private final awg.b q;
  
  public awb(awg.b ☃, int ☃, int ☃, int ☃, String ☃, boolean ☃)
  {
    super(☃, ☃, ☃, 150, 20, "");
    this.p = ☃;
    this.o = ☃;
    this.j = c();
    this.q = ☃;
  }
  
  private String c()
  {
    return bnq.a(this.p, new Object[0]) + ": " + (this.o ? bnq.a("gui.yes", new Object[0]) : bnq.a("gui.no", new Object[0]));
  }
  
  public void b(boolean ☃)
  {
    this.o = ☃;
    this.j = c();
    this.q.a(this.k, ☃);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      this.o = (!this.o);
      this.j = c();
      this.q.a(this.k, this.o);
      return true;
    }
    return false;
  }
}
