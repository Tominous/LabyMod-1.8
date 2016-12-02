public class avx
  extends avs
{
  private float p = 1.0F;
  public boolean o;
  private String q;
  private final float r;
  private final float s;
  private final awg.b t;
  private avx.a u;
  
  public avx(awg.b ☃, int ☃, int ☃, int ☃, String ☃, float ☃, float ☃, float ☃, avx.a ☃)
  {
    super(☃, ☃, ☃, 150, 20, "");
    q = ☃;
    r = ☃;
    s = ☃;
    p = ((☃ - ☃) / (☃ - ☃));
    u = ☃;
    t = ☃;
    j = e();
  }
  
  public float c()
  {
    return r + (s - r) * p;
  }
  
  public void a(float ☃, boolean ☃)
  {
    p = ((☃ - r) / (s - r));
    j = e();
    if (☃) {
      t.a(k, c());
    }
  }
  
  public float d()
  {
    return p;
  }
  
  private String e()
  {
    if (u == null) {
      return bnq.a(q, new Object[0]) + ": " + c();
    }
    return u.a(k, bnq.a(q, new Object[0]), c());
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
      if (p < 0.0F) {
        p = 0.0F;
      }
      if (p > 1.0F) {
        p = 1.0F;
      }
      j = e();
      t.a(k, c());
    }
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    b(h + (int)(p * (f - 8)), i, 0, 66, 4, 20);
    b(h + (int)(p * (f - 8)) + 4, i, 196, 66, 4, 20);
  }
  
  public void a(float ☃)
  {
    p = ☃;
    j = e();
    t.a(k, c());
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      p = ((☃ - (h + 4)) / (f - 8));
      if (p < 0.0F) {
        p = 0.0F;
      }
      if (p > 1.0F) {
        p = 1.0F;
      }
      j = e();
      t.a(k, c());
      o = true;
      return true;
    }
    return false;
  }
  
  public void a(int ☃, int ☃)
  {
    o = false;
  }
  
  public static abstract interface a
  {
    public abstract String a(int paramInt, String paramString, float paramFloat);
  }
}
