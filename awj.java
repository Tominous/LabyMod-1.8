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
    this.q = ☃;
    this.r = ☃;
    this.s = ☃;
    
    ave ☃ = ave.A();
    this.p = ☃.c(☃.t.a(☃));
    this.j = ☃.t.c(☃);
  }
  
  protected int a(boolean ☃)
  {
    return 0;
  }
  
  protected void b(ave ☃, int ☃, int ☃)
  {
    if (!this.m) {
      return;
    }
    if (this.o)
    {
      this.p = ((☃ - (this.h + 4)) / (this.f - 8));
      this.p = ns.a(this.p, 0.0F, 1.0F);
      float ☃ = this.q.d(this.p);
      ☃.t.a(this.q, ☃);
      this.p = this.q.c(☃);
      this.j = ☃.t.c(this.q);
    }
    ☃.P().a(a);
    bfl.c(1.0F, 1.0F, 1.0F, 1.0F);
    b(this.h + (int)(this.p * (this.f - 8)), this.i, 0, 66, 4, 20);
    b(this.h + (int)(this.p * (this.f - 8)) + 4, this.i, 196, 66, 4, 20);
  }
  
  public boolean c(ave ☃, int ☃, int ☃)
  {
    if (super.c(☃, ☃, ☃))
    {
      this.p = ((☃ - (this.h + 4)) / (this.f - 8));
      this.p = ns.a(this.p, 0.0F, 1.0F);
      ☃.t.a(this.q, this.q.d(this.p));
      this.j = ☃.t.c(this.q);
      this.o = true;
      return true;
    }
    return false;
  }
  
  public void a(int ☃, int ☃)
  {
    this.o = false;
  }
}
