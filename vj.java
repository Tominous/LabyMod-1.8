public class vj
  extends pk
{
  public int a;
  private pr b;
  
  public vj(adm ☃)
  {
    super(☃);
    k = true;
    a(0.98F, 0.98F);
  }
  
  public vj(adm ☃, double ☃, double ☃, double ☃, pr ☃)
  {
    this(☃);
    
    b(☃, ☃, ☃);
    
    float ☃ = (float)(Math.random() * 3.1415927410125732D * 2.0D);
    v = (-(float)Math.sin(☃) * 0.02F);
    w = 0.20000000298023224D;
    x = (-(float)Math.cos(☃) * 0.02F);
    
    a = 80;
    
    p = ☃;
    q = ☃;
    r = ☃;
    b = ☃;
  }
  
  protected void h() {}
  
  protected boolean s_()
  {
    return false;
  }
  
  public boolean ad()
  {
    return !I;
  }
  
  public void t_()
  {
    p = s;
    q = t;
    r = u;
    
    w -= 0.03999999910593033D;
    d(v, w, x);
    v *= 0.9800000190734863D;
    w *= 0.9800000190734863D;
    x *= 0.9800000190734863D;
    if (C)
    {
      v *= 0.699999988079071D;
      x *= 0.699999988079071D;
      w *= -0.5D;
    }
    if (a-- <= 0)
    {
      J();
      if (!o.D) {
        l();
      }
    }
    else
    {
      W();
      o.a(cy.l, s, t + 0.5D, u, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  private void l()
  {
    float ☃ = 4.0F;
    o.a(this, s, t + K / 16.0F, u, ☃, true);
  }
  
  protected void b(dn ☃)
  {
    ☃.a("Fuse", (byte)a);
  }
  
  protected void a(dn ☃)
  {
    a = ☃.d("Fuse");
  }
  
  public pr j()
  {
    return b;
  }
  
  public float aS()
  {
    return 0.0F;
  }
}
