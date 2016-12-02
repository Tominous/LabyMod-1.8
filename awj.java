public class awj
  extends avs
{
  private float p = 1.0F;
  public boolean o;
  private avh.a q;
  private final float r;
  private final float s;
  
  public awj(int ☃, int ☃, int ☃, avh.a ☃)
  {
    this(☃, ☃, ☃, ☃, 0.0F, 1.0F);
  }
  
  public awj(int ☃, int ☃, int ☃, avh.a ☃, float ☃, float ☃)
  {
    super(☃, ☃, ☃, 150, 20, "");
    q = ☃;
    r = ☃;
    s = ☃;
    
    ave ☃ = ave.A();
    p = ☃.c(t.a(☃));
    j = t.c(☃);
  }
  
  protected int a(boolean ☃)
  {
    return 0;
  }
  
  protected void b(ave ☃, int ☃, int ☃)
  {
    if (!m) {
      return;
    }
    if (o)
    {
      p = ((☃ - (h + 4)) / (f - 8));
      p = ns.a(p, 0.0F, 1.0F);
      float ☃ = q.d(p);
      t.a(q, ☃);
      p = q.c(☃);
      j = t.c(q);
    }
    ☃.P().a(a);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    b(h + (int)(p * (f - 8)), i, 0, 66, 4, 20);
    b(h + (int)(p * (f - 8)) + 4, i, 196, 66, 4, 20);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      p = ((☃ - (h + 4)) / (f - 8));
      p = ns.a(p, 0.0F, 1.0F);
      t.a(q, q.d(p));
      j = t.c(q);
      o = true;
      return true;
    }
    return false;
  }
  
  public void a(int ☃, int ☃)
  {
    o = false;
  }
}
