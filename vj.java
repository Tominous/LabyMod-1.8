public class vj
  extends pk
{
  public int a;
  private pr b;
  
  public vj(adm ☃)
  {
    super(☃);
    this.k = true;
    a(0.98F, 0.98F);
  }
  
  public vj(adm ☃, double ☃, double ☃, double ☃, pr ☃)
  {
    this(☃);
    
    b(☃, ☃, ☃);
    
    float ☃ = (float)(Math.random() * 3.1415927410125732D * 2.0D);
    this.v = (-(float)Math.sin(☃) * 0.02F);
    this.w = 0.20000000298023224D;
    this.x = (-(float)Math.cos(☃) * 0.02F);
    
    this.a = 80;
    
    this.p = ☃;
    this.q = ☃;
    this.r = ☃;
    this.b = ☃;
  }
  
  protected void h() {}
  
  protected boolean s_()
  {
    return false;
  }
  
  public boolean ad()
  {
    return !this.I;
  }
  
  public void t_()
  {
    this.p = this.s;
    this.q = this.t;
    this.r = this.u;
    
    this.w -= 0.03999999910593033D;
    d(this.v, this.w, this.x);
    this.v *= 0.9800000190734863D;
    this.w *= 0.9800000190734863D;
    this.x *= 0.9800000190734863D;
    if (this.C)
    {
      this.v *= 0.699999988079071D;
      this.x *= 0.699999988079071D;
      this.w *= -0.5D;
    }
    if (this.a-- <= 0)
    {
      J();
      if (!this.o.D) {
        l();
      }
    }
    else
    {
      W();
      this.o.a(cy.l, this.s, this.t + 0.5D, this.u, 0.0D, 0.0D, 0.0D, new int[0]);
    }
  }
  
  private void l()
  {
    float ☃ = 4.0F;
    this.o.a(this, this.s, this.t + this.K / 16.0F, this.u, ☃, true);
  }
  
  protected void b(dn ☃)
  {
    ☃.a("Fuse", (byte)this.a);
  }
  
  protected void a(dn ☃)
  {
    this.a = ☃.d("Fuse");
  }
  
  public pr j()
  {
    return this.b;
  }
  
  public float aS()
  {
    return 0.0F;
  }
}
