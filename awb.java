public class awb
  extends avs
{
  private boolean o;
  private String p;
  private final awg.b q;
  
  public awb(awg.b ☃, int ☃, int ☃, int ☃, String ☃, boolean ☃)
  {
    super(☃, ☃, ☃, 150, 20, "");
    p = ☃;
    o = ☃;
    j = c();
    q = ☃;
  }
  
  private String c()
  {
    return bnq.a(p, new Object[0]) + ": " + (o ? bnq.a("gui.yes", new Object[0]) : bnq.a("gui.no", new Object[0]));
  }
  
  public void b(boolean ☃)
  {
    o = ☃;
    j = c();
    q.a(k, ☃);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      o = (!o);
      j = c();
      q.a(k, o);
      return true;
    }
    return false;
  }
}
